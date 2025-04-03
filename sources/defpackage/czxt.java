package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czxt implements ffjn {
    final /* synthetic */ jlm a;
    final /* synthetic */ jpo b;

    public czxt(jlm jlmVar, jpo jpoVar) {
        this.a = jlmVar;
        this.b = jpoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebq) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            esa.c(this.a, null, this.b, null, 0, false, 0, 0, null, null, hfdVar, 0, 0, 2042);
        }
        return ffcu.a;
    }
}
