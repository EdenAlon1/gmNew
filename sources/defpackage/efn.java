package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efn extends ffkk implements ffjm {
    final /* synthetic */ efh a;
    final /* synthetic */ dxi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efn(efh efhVar, dxi dxiVar) {
        super(2);
        this.a = efhVar;
        this.b = dxiVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        jzn jznVar = (jzn) obj;
        long j = ((jzk) obj2).a;
        if (jzk.b(j) == Integer.MAX_VALUE) {
            dwv.c("LazyVerticalGrid's width should be bound by parent.");
        }
        int b = jzk.b(j);
        efh efhVar = this.a;
        dxi dxiVar = this.b;
        int[] ax = ffdx.ax(efhVar.a(jznVar, b, jznVar.eo(dxiVar.a())));
        int[] iArr = new int[ax.length];
        dxiVar.b(jznVar, b, ax, kah.a, iArr);
        return new egu(ax, iArr);
    }
}
