package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgs implements Cloneable, fhfd {
    public static final List a = fhhl.n(fhgt.d, fhgt.b);
    public static final List b = fhhl.n(fhfo.a, fhfo.b);
    public final fhhj A;
    public final fhfu c;
    public final fhfm d;
    public final List e;
    public final List f;
    public final boolean g;
    public final fhfa h;
    public final boolean i;
    public final fhft j;
    public final fhfw k;
    public final Proxy l;
    public final ProxySelector m;
    public final fhfa n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final fhfh u;
    public final fhlu v;
    public final int w;
    public final int x;
    public final int y;
    public final fhij z;

    public fhgs() {
        this(new fhgr());
    }

    public final SSLSocketFactory a() {
        SSLSocketFactory sSLSocketFactory = this.p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    public final Object clone() {
        return super.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fhgs(defpackage.fhgr r5) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhgs.<init>(fhgr):void");
    }
}
