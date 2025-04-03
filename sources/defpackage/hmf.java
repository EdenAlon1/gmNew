package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmf extends hmq {
    public static final hmf a = new hmf();

    private hmf() {
        super(0, 0, 3);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        if (hjvVar.n != 0) {
            hfp.j("Cannot reset when inserting");
        }
        hjvVar.I();
        hjvVar.q = 0;
        hjvVar.r = hjvVar.e() - hjvVar.h;
        hjvVar.i = 0;
        hjvVar.j = 0;
        hjvVar.o = 0;
    }
}
