package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffg extends ffcz {
    final /* synthetic */ fffh a;
    private int b;
    private int c;

    public fffg(fffh fffhVar) {
        this.a = fffhVar;
        this.b = fffhVar.d;
        this.c = fffhVar.c;
    }

    @Override // defpackage.ffcz
    protected final void a() {
        if (this.b == 0) {
            b();
            return;
        }
        c(this.a.a[this.c]);
        this.c = (this.c + 1) % this.a.b;
        this.b--;
    }
}
