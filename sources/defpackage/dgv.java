package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgv extends ffkk implements ffjm {
    final /* synthetic */ igq a;
    final /* synthetic */ String b;
    final /* synthetic */ hvi c;
    final /* synthetic */ huo d;
    final /* synthetic */ inp e;
    final /* synthetic */ float f;
    final /* synthetic */ ibx g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dgv(igq igqVar, String str, hvi hviVar, huo huoVar, inp inpVar, float f, ibx ibxVar, int i, int i2) {
        super(2);
        this.a = igqVar;
        this.b = str;
        this.c = hviVar;
        this.d = huoVar;
        this.e = inpVar;
        this.f = f;
        this.g = ibxVar;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dgx.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (hfd) obj, hip.a(this.h | 1), this.i);
        return ffcu.a;
    }
}
