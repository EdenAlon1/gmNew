package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emej implements ffjm {
    final /* synthetic */ emge a;

    public emej(emge emgeVar) {
        this.a = emgeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            emfy.b(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
