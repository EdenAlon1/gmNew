package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deja implements ffjm {
    final /* synthetic */ deoa a;

    public deja(deoa deoaVar) {
        this.a = deoaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            deok.c(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
