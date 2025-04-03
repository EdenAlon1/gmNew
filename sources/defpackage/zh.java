package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class zh extends kwf {
    final /* synthetic */ int a;
    final /* synthetic */ zi b;
    private boolean c = false;

    public zh(zi ziVar, int i) {
        this.b = ziVar;
        this.a = i;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void a() {
        if (this.c) {
            return;
        }
        zi ziVar = this.b;
        ziVar.a.setVisibility(this.a);
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void b() {
        this.b.a.setVisibility(0);
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void c() {
        this.c = true;
    }
}
