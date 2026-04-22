public class UsuarioSeguroAvanzado {

private String username;



        private String password;


        private int intentosFallidos;



        private boolean bloqueado;


       private int maxIntentos;



        private boolean accesoExitoso;


    public UsuarioSeguroAvanzado(String username, String password, int maxIntentos) {

this.username = username;

this.password = password;

this.intentosFallidos = 0;

this.bloqueado = false;

this.accesoExitoso = false;

this.maxIntentos = (maxIntentos <= 0) ? 3 : maxIntentos;

}






public String getUsername() {



return username;



}







public int getIntentosFallidos() {



return intentosFallidos;



}



public boolean isBloqueado() {



return bloqueado;



}



public int getMaxIntentos() {


return maxIntentos;



}







public boolean isAccesoExitoso() {



return accesoExitoso;



}

public boolean autenticar(String passwordIngresada) {

if (bloqueado) {

return false;

}

if (this.password.equals(passwordIngresada)) {

intentosFallidos = 0;

accesoExitoso = true;

return true;

} else {

intentosFallidos++;

if (intentosFallidos >= maxIntentos) {

bloqueado = true;

}

return false;

}

}

public void reiniciarAcceso() {

this.intentosFallidos = 0;

this.bloqueado = false;

}






}



