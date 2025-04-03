package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmk extends hmq {
    public static final hmk a = new hmk();

    private hmk() {
        super(1, 2);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        int i;
        Object c = hmvVar.c(0);
        hen henVar = (hen) hmvVar.c(1);
        boolean z = c instanceof hjl;
        int a2 = hmvVar.a(0);
        if (z) {
            hjjVar.a((hjl) c);
        }
        int a3 = hjvVar.a(henVar);
        Object x = hjvVar.x(a3, a2, c);
        if (!(x instanceof hjl)) {
            if (x instanceof hio) {
                ((hio) x).b();
                return;
            }
            return;
        }
        int g = hjvVar.g() - hjvVar.o(a3, a2);
        hjl hjlVar = (hjl) x;
        hen henVar2 = hjlVar.b;
        int i2 = -1;
        if (henVar2 == null || !henVar2.a()) {
            i = -1;
        } else {
            i2 = hjvVar.a(henVar2);
            i = hjvVar.g() - hjvVar.p(i2);
        }
        ((hqe) hjjVar).d(hjlVar, g, i2, i);
    }
}
