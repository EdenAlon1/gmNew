package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxk implements ffjn {
    final /* synthetic */ jlm a;
    final /* synthetic */ hvi b;
    final /* synthetic */ jpo c;

    public czxk(jlm jlmVar, hvi hviVar, jpo jpoVar) {
        this.a = jlmVar;
        this.b = hviVar;
        this.c = jpoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            esa.c(this.a, this.b, this.c, null, 0, false, 0, 0, null, null, hfdVar, 0, 0, 2040);
        }
        return ffcu.a;
    }
}
