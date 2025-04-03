package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhkv extends fhlc {
    public static final boolean a;
    private final List c;

    static {
        boolean z = false;
        if (fhlb.b() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        a = z;
    }

    public fhkv() {
        fhln[] fhlnVarArr = new fhln[2];
        fhlnVarArr[0] = fhld.a() ? new fhle() : null;
        fhlnVarArr[1] = new fhlm(fhlk.a);
        List J = ffdo.J(fhlnVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            if (((fhln) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
}
