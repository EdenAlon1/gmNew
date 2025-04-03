package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyk extends feyl {
    private static final fezd d = new fezd(null, "setUseSessionTickets", Boolean.TYPE);
    private static final fezd e = new fezd(null, "setHostname", String.class);
    private static final fezd f = new fezd(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final fezd g = new fezd(null, "setAlpnProtocols", byte[].class);
    private static final fezd h = new fezd(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final fezd i = new fezd(null, "setNpnProtocols", byte[].class);
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Constructor p;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Constructor<?> constructor = null;
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method5 = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                try {
                    method7 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                    try {
                        Class<?> cls = Class.forName("android.net.ssl.SSLSockets");
                        method8 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                        try {
                            method6 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                        } catch (ClassNotFoundException e2) {
                            classNotFoundException = e2;
                            method = method5;
                            method3 = method7;
                            method4 = method8;
                            feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                            method5 = method;
                            method6 = null;
                            method7 = method3;
                            method8 = method4;
                            l = method2;
                            m = method5;
                            n = method7;
                            j = method8;
                            k = method6;
                            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                            try {
                                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            } catch (ClassNotFoundException e3) {
                                e = e3;
                                feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method9;
                                p = constructor;
                            } catch (NoSuchMethodException e4) {
                                e = e4;
                                feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
                                o = method9;
                                p = constructor;
                            }
                            o = method9;
                            p = constructor;
                        } catch (NoSuchMethodException e5) {
                            noSuchMethodException = e5;
                            method = method5;
                            method3 = method7;
                            method4 = method8;
                            feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                            method5 = method;
                            method6 = null;
                            method7 = method3;
                            method8 = method4;
                            l = method2;
                            m = method5;
                            n = method7;
                            j = method8;
                            k = method6;
                            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                            o = method9;
                            p = constructor;
                        }
                    } catch (ClassNotFoundException e6) {
                        classNotFoundException = e6;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    } catch (NoSuchMethodException e7) {
                        noSuchMethodException = e7;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    }
                } catch (ClassNotFoundException e8) {
                    classNotFoundException = e8;
                    method3 = null;
                    method4 = null;
                    method = method5;
                } catch (NoSuchMethodException e9) {
                    noSuchMethodException = e9;
                    method3 = null;
                    method4 = null;
                    method = method5;
                }
            } catch (ClassNotFoundException e10) {
                classNotFoundException = e10;
                method = null;
                method3 = null;
                method4 = method3;
                feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            } catch (NoSuchMethodException e11) {
                noSuchMethodException = e11;
                method = null;
                method3 = null;
                method4 = method3;
                feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            }
        } catch (ClassNotFoundException e12) {
            classNotFoundException = e12;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e13) {
            noSuchMethodException = e13;
            method = null;
            method2 = null;
            method3 = null;
        }
        l = method2;
        m = method5;
        n = method7;
        j = method8;
        k = method6;
        try {
            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e14) {
            e = e14;
            method9 = null;
        } catch (NoSuchMethodException e15) {
            e = e15;
            method9 = null;
        }
        o = method9;
        p = constructor;
    }

    public feyk(fezi feziVar) {
        super(feziVar);
    }

    @Override // defpackage.feyl
    public final String a(SSLSocket sSLSocket) {
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                feyl.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, fezl.b);
                }
            } catch (Exception e4) {
                feyl.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() == 3) {
            return null;
        }
        try {
            byte[] bArr2 = (byte[]) h.a(sSLSocket, new Object[0]);
            if (bArr2 != null) {
                return new String(bArr2, fezl.b);
            }
            return null;
        } catch (Exception e5) {
            feyl.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            return null;
        }
    }

    @Override // defpackage.feyl
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String a = a(sSLSocket);
        return a == null ? super.b(sSLSocket, str, list) : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0120  */
    @Override // defpackage.feyl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.feyk.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
    }
}
