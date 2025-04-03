package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nk extends kwf {
    final /* synthetic */ nl a;
    private boolean b = false;
    private int c = 0;

    public nk(nl nlVar) {
        this.a = nlVar;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void a() {
        int i = this.c + 1;
        this.c = i;
        if (i == this.a.a.size()) {
            kwe kweVar = this.a.b;
            if (kweVar != null) {
                kweVar.a();
            }
            this.c = 0;
            this.b = false;
            this.a.c = false;
        }
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        kwe kweVar = this.a.b;
        if (kweVar != null) {
            kweVar.b();
        }
    }
}
