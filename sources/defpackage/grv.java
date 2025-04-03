package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class grv extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ float b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public grv(hvi hviVar, float f, ffjm ffjmVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = f;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        guj.B(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
