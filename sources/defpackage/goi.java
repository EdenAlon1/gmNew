package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class goi extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ long d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goi(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, long j, long j2) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjmVar3;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfz.a(grl.a.c(gvu.a(hee.c, hfdVar)), hpx.d(835891690, new goh(this.a, this.b, this.c, gvu.a(hee.a, hfdVar), this.d, this.e), hfdVar), hfdVar, 56);
        }
        return ffcu.a;
    }
}
