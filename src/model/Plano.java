/**
 * Título da classe.
 * Insira aqui uma pequena descrição sobre a mesma.
 *
 * @author Cláudio Henrique <https://github.com/01ch01>
 * @since May 29, 2019 at 1:57:06 PM
 * @version 0.1
 */
package model;

public class Plano {

    private String nome;
    private double velDownload;
    private double velUpload;
    private double preco;

    public Plano() {
        this.nome = "";
        this.velDownload = 0.0;
        this.velUpload = 0.0;
        this.preco = 0.0;
        this.definirPreco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelDownload() {
        return velDownload;
    }

    public void setVelDownload(double velDownload) {
        this.velDownload = velDownload;
    }

    public double getVelUpload() {
        return velUpload;
    }

    public void setVelUpload(double velUpload) {
        this.velUpload = velUpload;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public final void definirPreco() {
        switch (this.nome) {
            case "05 MEGA":
                this.preco = 44.90;
                this.velDownload = 05.0;
                this.velUpload = this.velDownload;
                break;
            case "10 MEGA":
                this.preco = 54.90;
                this.velDownload = 10.0;
                this.velUpload = this.velDownload;
                break;
            case "15 MEGA":
                this.preco = 64.90;
                this.velDownload = 15.0;
                this.velUpload = this.velDownload;
            case "20 MEGA":
                this.preco = 69.90;
                this.velDownload = 20.0;
                this.velUpload = this.velDownload;
                break;
            case "25 MEGA":
                this.preco = 74.90;
                this.velDownload = 25.0;
                this.velUpload = this.velDownload;
                break;
            default:
                break;
        }
    }

    public void planosEspeciais() {

    }
}
