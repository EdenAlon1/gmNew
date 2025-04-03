package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ekb extends ffkk implements ffjm {
    final /* synthetic */ Object a;
    final /* synthetic */ int b;
    final /* synthetic */ ekd c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekb(Object obj, int i, ekd ekdVar, ffjm ffjmVar, int i2) {
        super(2);
        this.a = obj;
        this.b = i;
        this.c = ekdVar;
        this.d = ffjmVar;
        this.e = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ekc.a(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
