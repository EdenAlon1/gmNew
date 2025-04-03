package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajuy implements ffjm {
    final /* synthetic */ ajva a;
    final /* synthetic */ ajso b;
    final /* synthetic */ boolean c;
    final /* synthetic */ ffix d;
    final /* synthetic */ Boolean e;

    public ajuy(ajva ajvaVar, ajso ajsoVar, boolean z, ffix ffixVar, Boolean bool) {
        this.a = ajvaVar;
        this.b = ajsoVar;
        this.c = z;
        this.d = ffixVar;
        this.e = bool;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cwmv.a(false, false, hpx.d(181335475, new ajux(this.a, this.b, this.c, this.d, this.e), hfdVar), hfdVar, 384);
        }
        return ffcu.a;
    }
}
