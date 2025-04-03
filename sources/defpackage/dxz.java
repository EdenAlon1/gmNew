package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dxz extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxz(hvi hviVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.b | 1);
        dyc.b(this.a, (hfd) obj, a);
        return ffcu.a;
    }
}
