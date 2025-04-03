package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmk {
    public final boolean a;
    public final boolean b;
    public cxt c;
    public gzl d;
    public cyq e;
    public cyq f;
    private final ffji g;

    public gmk(boolean z, ffix ffixVar, ffix ffixVar2, gml gmlVar, ffji ffjiVar, boolean z2) {
        this.a = z;
        this.g = ffjiVar;
        this.b = z2;
        if (z && gmlVar == gml.c) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        if (z2 && gmlVar == gml.a) {
            throw new IllegalArgumentException("The initial value must not be set to Hidden if skipHiddenState is set to true.");
        }
        this.c = gmd.a;
        this.d = new gzl(gmlVar, new gmg(ffixVar), ffixVar2, new gmh(this), ffjiVar);
        this.e = new daa(0);
        this.f = new daa(0);
    }

    public static /* synthetic */ Object l(gmk gmkVar, gml gmlVar, cyq cyqVar, ffgu ffguVar) {
        Object f;
        f = gmkVar.d.f(gmlVar, dhy.a, new gmj(gmkVar, gmkVar.d.g.c(), cyqVar, null), ffguVar);
        return f == ffhh.a ? f : ffcu.a;
    }

    public final float a() {
        return this.d.b();
    }

    public final float b() {
        return this.d.d();
    }

    public final gml c() {
        return (gml) this.d.h();
    }

    public final gml d() {
        return (gml) this.d.j();
    }

    public final Object e(ffgu ffguVar) {
        Object l;
        return (((Boolean) this.g.invoke(gml.b)).booleanValue() && (l = l(this, gml.b, this.e, ffguVar)) == ffhh.a) ? l : ffcu.a;
    }

    public final Object f(ffgu ffguVar) {
        Object l;
        if (this.b) {
            throw new IllegalStateException("Attempted to animate to hidden when skipHiddenState was enabled. Set skipHiddenState to false to use this function.");
        }
        return (((Boolean) this.g.invoke(gml.a)).booleanValue() && (l = l(this, gml.a, this.f, ffguVar)) == ffhh.a) ? l : ffcu.a;
    }

    public final Object g(ffgu ffguVar) {
        Object l;
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        return (((Boolean) this.g.invoke(gml.c)).booleanValue() && (l = l(this, gml.c, this.e, ffguVar)) == ffhh.a) ? l : ffcu.a;
    }

    public final Object h(float f, ffgu ffguVar) {
        Object k = this.d.k(f, ffguVar);
        return k == ffhh.a ? k : ffcu.a;
    }

    public final Object i(ffgu ffguVar) {
        Object l;
        gml gmlVar = j() ? gml.c : gml.b;
        return (((Boolean) this.g.invoke(gmlVar)).booleanValue() && (l = l(this, gmlVar, this.e, ffguVar)) == ffhh.a) ? l : ffcu.a;
    }

    public final boolean j() {
        return this.d.p().e(gml.c);
    }

    public final boolean k() {
        return this.d.h() != gml.a;
    }
}
