package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkx extends fhlc {
    public static final boolean a;
    private final List c;
    private final fhll d;

    static {
        boolean z = false;
        if (fhlb.b() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        a = z;
    }

    public fhkx() {
        fhlo fhloVar;
        Method method;
        Method method2;
        fhln[] fhlnVarArr = new fhln[2];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(a.v("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            cls.getClass();
            Class<?> cls2 = Class.forName(a.v("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            cls2.getClass();
            Class<?> cls3 = Class.forName(a.v("com.android.org.conscrypt", ".SSLParametersImpl"));
            cls3.getClass();
            fhloVar = new fhlo(cls, cls2, cls3);
        } catch (Exception e) {
            fhlc.b.l("unable to load android socket classes", 5, e);
            fhloVar = null;
        }
        fhlnVarArr[0] = fhloVar;
        fhlnVarArr[1] = new fhlm(fhlk.a);
        List J = ffdo.J(fhlnVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (((fhln) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", new Class[0]);
            method2 = cls4.getMethod("open", String.class);
            method = cls4.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new fhll(method3, method2, method);
    }

    @Override // defpackage.fhlc
    public final String a(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((fhln) obj).e(sSLSocket)) {
                break;
            }
        }
        fhln fhlnVar = (fhln) obj;
        if (fhlnVar != null) {
            return fhlnVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.fhlc
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((fhln) obj).f(sSLSocketFactory)) {
                break;
            }
        }
        fhln fhlnVar = (fhln) obj;
        if (fhlnVar != null) {
            return fhlnVar.b(sSLSocketFactory);
        }
        return null;
    }

    @Override // defpackage.fhlc
    public final fhlu c(X509TrustManager x509TrustManager) {
        fhlg a2 = fhlf.a(x509TrustManager);
        return a2 != null ? a2 : super.c(x509TrustManager);
    }

    @Override // defpackage.fhlc
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((fhln) obj).e(sSLSocket)) {
                    break;
                }
            }
        }
        fhln fhlnVar = (fhln) obj;
        if (fhlnVar != null) {
            fhlnVar.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.fhlc
    public final boolean e(String str) {
        boolean isCleartextTrafficPermitted;
        isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }

    @Override // defpackage.fhlc
    public final fhlw f(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new fhkw(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.f(x509TrustManager);
        }
    }

    @Override // defpackage.fhlc
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.fhlc
    public final void h(String str, Object obj) {
        fhll fhllVar = this.d;
        if (obj != null) {
            try {
                Method method = fhllVar.c;
                method.getClass();
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        fhlc.m(this, str, 5, 4);
    }

    @Override // defpackage.fhlc
    public final Object i() {
        fhll fhllVar = this.d;
        Method method = fhllVar.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = fhllVar.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
