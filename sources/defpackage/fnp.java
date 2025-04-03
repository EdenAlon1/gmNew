package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fnp extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ ffjn b;
    final /* synthetic */ int c;
    final /* synthetic */ fnv d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnp(fnv fnvVar, hvi hviVar, ffjn ffjnVar, int i) {
        super(2);
        this.d = fnvVar;
        this.a = hviVar;
        this.b = ffjnVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        fnu.a(this.d, this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
