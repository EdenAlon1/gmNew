package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgr {
    public fhfu a;
    public final fhfm b;
    public final List c;
    public final List d;
    public boolean e;
    public final fhfa f;
    public boolean g;
    public final fhft h;
    public final fhfw i;
    public Proxy j;
    public ProxySelector k;
    public final fhfa l;
    public final SocketFactory m;
    public SSLSocketFactory n;
    public X509TrustManager o;
    public final List p;
    public final List q;
    public HostnameVerifier r;
    public final fhfh s;
    public fhlu t;
    public int u;
    public int v;
    public int w;
    public fhij x;
    public final fhhj y;

    public fhgr() {
        this.a = new fhfu();
        this.b = new fhfm();
        this.c = new ArrayList();
        this.d = new ArrayList();
        fhfy fhfyVar = fhfy.a;
        byte[] bArr = fhhl.a;
        this.y = new fhhj(fhfyVar);
        this.e = true;
        fhfa fhfaVar = fhfa.a;
        this.f = fhfaVar;
        this.g = true;
        this.h = fhft.a;
        this.i = fhfw.a;
        this.l = fhfaVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.m = socketFactory;
        this.p = fhgs.b;
        this.q = fhgs.a;
        this.r = fhlv.a;
        this.s = fhfh.a;
        this.u = 10000;
        this.v = 10000;
        this.w = 10000;
    }

    public final void a(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.u = fhhl.A(j, timeUnit);
    }

    public final void b(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.v = fhhl.A(j, timeUnit);
    }

    public fhgr(fhgs fhgsVar) {
        this();
        this.a = fhgsVar.c;
        this.b = fhgsVar.d;
        ffdx.w(this.c, fhgsVar.e);
        ffdx.w(this.d, fhgsVar.f);
        this.y = fhgsVar.A;
        this.e = fhgsVar.g;
        this.f = fhgsVar.h;
        this.g = fhgsVar.i;
        this.h = fhgsVar.j;
        this.i = fhgsVar.k;
        this.j = fhgsVar.l;
        this.k = fhgsVar.m;
        this.l = fhgsVar.n;
        this.m = fhgsVar.o;
        this.n = fhgsVar.p;
        this.o = fhgsVar.q;
        this.p = fhgsVar.r;
        this.q = fhgsVar.s;
        this.r = fhgsVar.t;
        this.s = fhgsVar.u;
        this.t = fhgsVar.v;
        this.u = fhgsVar.w;
        this.v = fhgsVar.x;
        this.w = fhgsVar.y;
        this.x = fhgsVar.z;
    }
}
