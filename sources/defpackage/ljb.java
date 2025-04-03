package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljb implements hgo {
    final /* synthetic */ fr a;
    final /* synthetic */ ea b;
    final /* synthetic */ ljg c;
    final /* synthetic */ ffkx d;

    public ljb(fr frVar, ea eaVar, ljg ljgVar, ffkx ffkxVar) {
        this.a = frVar;
        this.b = eaVar;
        this.c = ljgVar;
        this.d = ffkxVar;
    }

    @Override // defpackage.hgo
    public final void a() {
        this.c.a.b(this.a.d(this.b));
        if (this.d.a) {
            cg cgVar = new cg(this.a);
            cgVar.n(this.b);
            cgVar.d();
        } else {
            if (this.a.ai()) {
                return;
            }
            cg cgVar2 = new cg(this.a);
            cgVar2.n(this.b);
            cgVar2.c();
        }
    }
}
