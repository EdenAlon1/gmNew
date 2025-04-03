package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnee implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ dnem b;

    public dnee(String str, dnem dnemVar) {
        this.a = str;
        this.b = dnemVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnej.c(this.a, this.b.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
