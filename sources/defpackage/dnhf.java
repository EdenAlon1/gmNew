package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhf implements ffjm {
    final /* synthetic */ dnhh a;
    final /* synthetic */ jpo b;

    public dnhf(dnhh dnhhVar, jpo jpoVar) {
        this.a = dnhhVar;
        this.b = jpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnhg.c(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
