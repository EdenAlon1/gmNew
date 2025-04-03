package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mbm implements mbi, mbh {
    public boolean a;
    private final lyr b;

    public mbm(lqg lqgVar, mbj mbjVar, mbj mbjVar2, mdt mdtVar) {
        this.b = new lyr(lqgVar, mbjVar, mbjVar2, mdtVar);
    }

    @Override // defpackage.mbi
    public final synchronized void a() {
        if (this.a) {
            this.b.a();
        }
    }

    @Override // defpackage.mbh
    public final void b(lqh lqhVar) {
        if (this.a) {
            this.b.b(lqhVar);
        }
    }

    @Override // defpackage.mbh
    public final void c() {
        if (this.a) {
            this.b.c();
        }
    }

    @Override // defpackage.mbh
    public final synchronized void w() {
        if (this.a) {
            this.b.w();
        }
    }

    @Override // defpackage.mbi
    public final synchronized void x(lqh lqhVar, long j) {
        if (this.a) {
            this.b.x(lqhVar, j);
        }
    }
}
