package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pa implements kwe {
    int a;
    final /* synthetic */ pb b;
    private boolean c = false;

    protected pa(pb pbVar) {
        this.b = pbVar;
    }

    @Override // defpackage.kwe
    public final void a() {
        if (this.c) {
            return;
        }
        pb pbVar = this.b;
        pbVar.f = null;
        super/*android.view.ViewGroup*/.setVisibility(this.a);
    }

    @Override // defpackage.kwe
    public final void b() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.c = false;
    }

    @Override // defpackage.kwe
    public final void c() {
        this.c = true;
    }

    public final void d(kwd kwdVar, int i) {
        this.b.f = kwdVar;
        this.a = i;
    }
}
