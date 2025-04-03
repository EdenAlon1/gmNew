package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdn extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdn(hvi hviVar, long j, int i) {
        super(2);
        this.a = hviVar;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        gdo.b(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
