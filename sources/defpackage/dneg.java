package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dneg implements ffjm {
    final /* synthetic */ dnem a;

    public dneg(dnem dnemVar) {
        this.a = dnemVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnej.a(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
