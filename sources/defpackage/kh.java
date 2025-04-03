package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kh implements op {
    final /* synthetic */ kk a;
    private boolean b;

    public kh(kk kkVar) {
        this.a = kkVar;
    }

    @Override // defpackage.op
    public final void a(od odVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.a.g();
        this.a.b.onPanelClosed(108, odVar);
        this.b = false;
    }

    @Override // defpackage.op
    public final boolean b(od odVar) {
        this.a.b.onMenuOpened(108, odVar);
        return true;
    }
}
