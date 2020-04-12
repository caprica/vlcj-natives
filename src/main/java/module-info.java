module uk.co.caprica.vlcj.natives {
    requires java.desktop;
    requires com.sun.jna;
    requires com.sun.jna.platform;

    exports uk.co.caprica.vlcj.binding;
    exports uk.co.caprica.vlcj.binding.internal;
    exports uk.co.caprica.vlcj.binding.support;
}
