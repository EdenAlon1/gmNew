package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhlk implements fhln {
    public static final fhlj a = new fhlj();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public fhlk(Class cls) {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.fhln
    public final String a(SSLSocket sSLSocket) {
        if (!e(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, ffoo.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && ffkj.e(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.fhln
    public /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override // defpackage.fhln
    public final void c(SSLSocket sSLSocket, String str, List list) {
        if (e(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                this.d.invoke(sSLSocket, str);
                Method method = this.f;
                fhlc fhlcVar = fhlc.b;
                fhmt fhmtVar = new fhmt();
                for (String str2 : fhlb.a(list)) {
                    fhmtVar.O(str2.length());
                    fhmtVar.aa(str2);
                }
                method.invoke(sSLSocket, fhmtVar.F());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.fhln
    public final boolean d() {
        return fhkx.a;
    }

    @Override // defpackage.fhln
    public final boolean e(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    @Override // defpackage.fhln
    public /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}
