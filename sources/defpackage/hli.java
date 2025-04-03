package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hli extends hmq {
    public static final hli a = new hli();

    private hli() {
        super(0, 2, 1);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        hen henVar = (hen) hmvVar.c(0);
        Object c = hmvVar.c(1);
        if (c instanceof hjl) {
            hjjVar.a((hjl) c);
        }
        if (hjvVar.n != 0) {
            hfp.j("Can only append a slot if not current inserting");
        }
        int i = hjvVar.i;
        int i2 = hjvVar.j;
        int a2 = hjvVar.a(henVar);
        int c2 = hjvVar.c(hjvVar.b, hjvVar.h(a2 + 1));
        hjvVar.i = c2;
        hjvVar.j = c2;
        hjvVar.F(1, a2);
        if (i >= c2) {
            i++;
            i2++;
        }
        hjvVar.c[c2] = c;
        hjvVar.i = i;
        hjvVar.j = i2;
    }
}
