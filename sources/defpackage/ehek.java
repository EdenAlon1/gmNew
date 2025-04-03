package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehek extends ehfm {
    final /* synthetic */ int a;
    final /* synthetic */ ehes b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehek(ehes ehesVar, int i, int i2) {
        super(i);
        this.a = i2;
        this.b = ehesVar;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    protected final void W(wo woVar, int[] iArr) {
        if (this.a == 0) {
            iArr[0] = this.b.ag.getWidth();
            iArr[1] = this.b.ag.getWidth();
        } else {
            iArr[0] = this.b.ag.getHeight();
            iArr[1] = this.b.ag.getHeight();
        }
    }
}
