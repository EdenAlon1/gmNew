package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnr extends ffkk implements ffjm {
    final /* synthetic */ fnx a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnr(fnx fnxVar, hvi hviVar, ffjn ffjnVar, int i) {
        super(2);
        this.a = fnxVar;
        this.b = hviVar;
        this.c = ffjnVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.d | 1);
        fnu.b(this.a, this.b, this.c, (hfd) obj, a);
        return ffcu.a;
    }
}
