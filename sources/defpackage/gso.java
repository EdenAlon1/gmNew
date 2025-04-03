package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gso extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gso(hvi hviVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.b;
        guj.l(this.a, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
