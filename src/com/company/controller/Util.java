package com.company.controller;

import java.util.GregorianCalendar;

public class Util {


    public static boolean isValidCnpj(String xCGC) {
        try {
            int d1, d4, xx, nCount, fator, resto, digito1, digito2;
            String Check, s_aux;
            String Separadores = "/-.";
            d1 = 0;
            d4 = 0;
            xx = 0;
            for (nCount = 0; nCount < xCGC.length() - 2; nCount++) {
                s_aux = xCGC.substring(nCount, nCount + 1);
                if (Separadores.indexOf(s_aux) == -1) {
                    if (xx < 4) {
                        fator = 5 - xx;
                    } else {
                        fator = 13 - xx;
                    }

                    d1 = d1 + Integer.valueOf(s_aux).intValue() * fator;
                    if (xx < 5) {
                        fator = 6 - xx;
                    } else {
                        fator = 14 - xx;
                    }
                    d4 += Integer.valueOf(s_aux).intValue() * fator;
                    xx++;
                }
                ;
            }

            /*Implementado para que n�o possa colocar um CNPJ somente com zeros*/
            if ((d1 + d4) <= 0) {
                return false;
            }

            resto = (d1 % 11);
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            d4 = d4 + 2 * digito1;
            resto = (d4 % 11);
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }

            Check = String.valueOf(digito1) + String.valueOf(digito2);

            System.out.println( Check );

            if (Check.compareTo(xCGC.substring(xCGC.length() - 2, xCGC.length())) != 0) {
                return false;
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isValidCpf(String xCPF) {
        try {
            int d1, d4, xx, nCount, resto, digito1, digito2;
            String Check;
            String Separadores = "/-.";
            d1 = 0;
            d4 = 0;
            xx = 1;
            for (nCount = 0; nCount < xCPF.length() - 2; nCount++) {
                String s_aux = xCPF.substring(nCount, nCount + 1);
                if (Separadores.indexOf(s_aux) == -1) {
                    d1 = d1 + (11 - xx) * Integer.valueOf(s_aux).intValue();
                    d4 = d4 + (12 - xx) * Integer.valueOf(s_aux).intValue();
                    xx++;
                }
                ;
            }
            ;

            /*Implementado para que n�o possa colocar um CPF somente com zeros*/
            if ((d1 + d4) <= 0) {
                return false;
            }

            resto = (d1 % 11);
            if (resto < 2) {
                digito1 = 0;
            } else {
                digito1 = 11 - resto;
            }

            d4 = d4 + 2 * digito1;
            resto = (d4 % 11);
            if (resto < 2) {
                digito2 = 0;
            } else {
                digito2 = 11 - resto;
            }

            Check = String.valueOf(digito1) + String.valueOf(digito2);

            String s_aux2 = xCPF.substring(xCPF.length() - 2, xCPF.length());

            System.out.println(s_aux2);

            if (s_aux2.compareTo(Check) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int dataDiff(java.util.Date dataLow, java.util.Date dataHigh) {

        GregorianCalendar startTime = new GregorianCalendar();
        GregorianCalendar endTime = new GregorianCalendar();

        GregorianCalendar curTime = new GregorianCalendar();
        GregorianCalendar baseTime = new GregorianCalendar();

        startTime.setTime(dataLow);
        endTime.setTime(dataHigh);

        int dif_multiplier = 1;

        // Verifica a ordem de inicio das datas
        if (dataLow.compareTo(dataHigh) < 0) {
            baseTime.setTime(dataHigh);
            curTime.setTime(dataLow);
            dif_multiplier = 1;
        } else {
            baseTime.setTime(dataLow);
            curTime.setTime(dataHigh);
            dif_multiplier = -1;
        }

        int result_years = 0;
        int result_months = 0;
        int result_days = 0;

        // Para cada mes e ano, vai de mes em mes pegar o ultimo dia para import acumulando
        // no total de dias. Ja leva em consideracao ano bissesto
        while (curTime.get(GregorianCalendar.YEAR) < baseTime
                .get(GregorianCalendar.YEAR)
                || curTime.get(GregorianCalendar.MONTH) < baseTime
                .get(GregorianCalendar.MONTH)) {

            int max_day = curTime
                    .getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
            result_months += max_day;
            curTime.add(GregorianCalendar.MONTH, 1);

        }

        // Marca que é um saldo negativo ou positivo
        result_months = result_months * dif_multiplier;

        // Retirna a diferenca de dias do total dos meses
        result_days += (endTime.get(GregorianCalendar.DAY_OF_MONTH) - startTime
                .get(GregorianCalendar.DAY_OF_MONTH));

        return result_years + result_months + result_days;
    }


    public static String getNomeMes(int nroMes) {

        String mes = null;

        switch (nroMes) {
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                break;
        }

        return mes;
    }


}
