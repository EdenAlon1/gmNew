package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolb implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ hvi b;
    final /* synthetic */ long c;
    final /* synthetic */ jyj d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ jpo g;

    public dolb(String str, hvi hviVar, long j, jyj jyjVar, int i, int i2, jpo jpoVar) {
        this.a = str;
        this.b = hviVar;
        this.c = j;
        this.d = jyjVar;
        this.e = i;
        this.f = i2;
        this.g = jpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwjt.b(this.a, this.b, this.c, 0L, null, null, 0L, this.d, 0L, this.e, false, this.f, 0, null, this.g, hfdVar, 0, 0, 54776);
        }
        return ffcu.a;
    }
}
