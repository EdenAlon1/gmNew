package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aiq extends bbt {
    final /* synthetic */ kfb a;

    public aiq(kfb kfbVar) {
        this.a = kfbVar;
    }

    @Override // defpackage.bbt
    public final void a(int i) {
        this.a.c(new avl("Capture request is cancelled because camera is closed", null));
    }

    @Override // defpackage.bbt
    public final void b(int i, bcd bcdVar) {
        this.a.b(null);
    }

    @Override // defpackage.bbt
    public final void c(int i, bbx bbxVar) {
        "ERROR".toString();
        this.a.c(new avl("Capture request failed with reason ERROR", null));
    }
}
