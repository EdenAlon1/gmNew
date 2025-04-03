package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evw {
    public final jlm a;
    public final jpo b;
    public final boolean c;
    public final int d = 1;
    public final jzn e;
    public final jse f;
    public final List g;
    private jmc h;
    private kah i;

    public /* synthetic */ evw(jlm jlmVar, jpo jpoVar, boolean z, jzn jznVar, jse jseVar, List list) {
        this.a = jlmVar;
        this.b = jpoVar;
        this.c = z;
        this.e = jznVar;
        this.f = jseVar;
        this.g = list;
    }

    public final int a() {
        return evx.a(b().a());
    }

    public final jmc b() {
        jmc jmcVar = this.h;
        if (jmcVar != null) {
            return jmcVar;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    public final void c(kah kahVar) {
        jmc jmcVar = this.h;
        if (jmcVar == null || kahVar != this.i || jmcVar.c()) {
            this.i = kahVar;
            jmcVar = new jmc(this.a, jpp.b(this.b, kahVar), this.g, this.e, this.f);
        }
        this.h = jmcVar;
    }
}
