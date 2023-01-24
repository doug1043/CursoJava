

public class GradeBook {

    private String nomeCurso;
    private double[] notasAlunos;

    public GradeBook(String nomeCurso, double[] notasAlunos){
        this.nomeCurso = nomeCurso;
        this.notasAlunos = notasAlunos;
    }

    public String getNomeCurso(){
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }

    public double getMediaTurma(){
        double somaNotas = 0;
        for(double nota : notasAlunos){
            somaNotas += nota;
        }
        return somaNotas/notasAlunos.length;
    }

    public double getMenorNota(){
        double menorNota = notasAlunos[0];
        for(double nota : notasAlunos){
            if(nota < menorNota){
                menorNota = nota;
            }
        }
        return menorNota;
    }

    public double getMaiorNota(){
        double maiorNota = notasAlunos[0];
        for(double nota : notasAlunos){
            if(nota < maiorNota){
                maiorNota = nota;
            }
        }
        return maiorNota;
    }

    public void getDistibuirNotas(){
        int[] frquenciaFaixas = new int[10];
        for(double nota : notasAlunos){
            if(nota < 10){
                frquenciaFaixas[(int) nota]++;
            }
            else{
                frquenciaFaixas[9]++;
            }
            
            // if(nota >= 0.0 && nota < 1.0){
            //     frquenciaFaixas[0]++;
            // }
            // else if(nota > 1.0 && nota <= 2.0){
            //     frquenciaFaixas[1]++;
            // }
            // else if(nota > 2.0 && nota <= 3.0){
            //     frquenciaFaixas[2]++;
            // }
            // else if(nota > 3.0 && nota <= 4.0){
            //     frquenciaFaixas[3]++;
            // }
            // else if(nota > 4.0 && nota <= 5.0){
            //     frquenciaFaixas[4]++;
            // }
            // else if(nota > 5.0 && nota <= 6.0){
            //     frquenciaFaixas[5]++;
            // }
            // else if(nota > 6.0 && nota <= 7.0){
            //     frquenciaFaixas[6]++;
            // }
            // else if(nota > 7.0 && nota <= 8.0){
            //     frquenciaFaixas[7]++;
            // }
            // else if(nota > 8.0 && nota <= 9.0){
            //     frquenciaFaixas[8]++;
            // }
            // else if(nota > 9.0 && nota <= 10.0){
            //     frquenciaFaixas[9]++;
            // }

        }
        mostrarDistNotas(frquenciaFaixas);
    }

    private void mostrarDistNotas(int[] frequenciaNotas){
        for(int i = 0; i < frequenciaNotas.length; i++){
            System.out.printf("\nQuantidade de notas entre %d"+
            " e %d: %d", i, i+1, frequenciaNotas[i]);
        }
    }



}