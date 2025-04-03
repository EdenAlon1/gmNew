package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpl extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ float e;
    final /* synthetic */ ebe f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpl(hvi hviVar, ffjm ffjmVar, ffjm ffjmVar2, ffjm ffjmVar3, float f, ebe ebeVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = ffjmVar;
        this.c = ffjmVar2;
        this.d = ffjmVar3;
        this.e = f;
        this.f = ebeVar;
        this.g = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fpn.e(this.a, this.b, this.c, this.d, this.e, this.f, (hfd) obj, hip.a(this.g | 1));
        return ffcu.a;
    }
}
