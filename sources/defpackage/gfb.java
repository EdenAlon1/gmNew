package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gfb extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ ffjm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gfb(ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, ffjm ffjmVar4, ffjm ffjmVar5) {
        super(2);
        this.a = ffjmVar;
        this.b = ffjmVar2;
        this.c = ffjmVar3;
        this.d = ffjmVar4;
        this.e = ffjmVar5;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gfl.c(this.a, this.b, this.c, this.d, this.e, hfdVar, 384);
        }
        return ffcu.a;
    }
}
