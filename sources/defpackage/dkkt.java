package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkkt {
    public abstract int a();

    public abstract int b();

    public final engw c(boolean z) {
        if (e()) {
            return engw.p(dkut.D(null, null, engw.r(f() ? z ? "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session")));
        }
        return engw.r("+g.oma.sip-im");
    }

    public final engw d() {
        return c(false);
    }

    public final boolean e() {
        return a() == 1;
    }

    public final boolean f() {
        return dizg.E() && b() == 2;
    }
}
