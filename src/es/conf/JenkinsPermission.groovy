package es.conf

enum JenkinsPermission{
    ADMINISTER("Administrador"),
    READ("Lectura"),
    RUN_SCRIPTS("Ejecutar scripts"),
    EXTENDED_READ("Lectura extendida"),
    JOB_CREATE("Crear trabajos"),
    JOB_DELETE("Borrar trabajos"),
    JOB_CONFIGURE("Configurar trabajos"),
    JOB_READ("Leer trabajos"),
    JOB_WORKSPACE("Acceder al workspace de los trabajos"),
    BUILD("Ejecutar trabajos"),
    BUILD_CANCEL("Cancelar trabajos"),
    BUILD_CONFIGURE("Configurar trabajos"),
    BUILD_DELETE("Borrar trabajos"),
    BUILD_REPLAY("Repetir trabajos"),
    BUILD_UPDATE("Actualizar trabajos"),
    BUILD_WORKSPACE("Acceder al workspace de los trabajos"),
    CREDENTIALS_CREATE("Crear credenciales"),
    CREDENTIALS_DELETE("Borrar credenciales"),
    CREDENTIALS_MANAGE_DOMAINS("Gestionar dominios de credenciales"),
    CREDENTIALS_UPDATE("Actualizar credenciales"),
    CREDENTIALS_VIEW("Ver credenciales"),
    DELETE("Borrar"),
    DISCOVER("Descubrir"),
    EXTENDED_READ("Lectura extendida"),
    EXTENDED_VIEW("Vista extendida"),
    ITEM_BUILD("Ejecutar trabajos"),
    ITEM_CANCEL("Cancelar trabajos"),
    ITEM_CONFIGURE("Configurar trabajos"),
    ITEM_CREATE("Crear trabajos"),
    ITEM_DELETE("Borrar trabajos"),
    ITEM_DISCOVER("Descubrir trabajos"),
    ITEM_READ("Leer trabajos"),
    ITEM_WORKSPACE("Acceder al workspace de los trabajos"),
    LOCKABLE_RESOURCES_DELETE("Borrar recursos bloqueables"),
    LOCKABLE_RESOURCES_MODIFY("Modificar recursos bloqueables"),
    LOCKABLE_RESOURCES_VIEW("Visualizar recursos bloqueables"),
    PLUGIN_MANAGER_CONFIGURE_UPDATE("Configurar y actualizar plugins"),
    RUN_DELETE("Borrar ejecuciones"),
    RUN_REPLAY("Repetir ejecuciones"),
    RUN_UPDATE("Actualizar ejecuciones"),
    SCM_TAG("Etiquetar"),
    SLAVE_CREATE("Crear esclavos"),
    SLAVE_DELETE("Borrar esclavos"),
    SLAVE_CONFIGURE("Configurar esclavos"),
    SLAVE_READ("Leer esclavos"),
    UNSTABLE("Inestable"),
    UPDATE("Actualizar"),
    VIEW_READ("Leer vistas"),
    VIEW_CREATE("Crear vistas"),
    VIEW_DELETE("Borrar vistas"),
    VIEW_CONFIGURE("Configurar vistas"),
    VIEW_READ("Leer vistas"),
    VIEW_WORKSPACE("Acceder al workspace de las vistas"),
    WORKSPACE("Acceder al workspace"),
    NONE("Ninguno")

    private final String descriptions

    JenkinsPermission(String descriptions){
        this.descriptions = descriptions
    }

    String getDescriptions(){
        return descriptions
    }
}