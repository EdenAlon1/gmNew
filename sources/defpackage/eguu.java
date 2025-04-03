package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eguu implements ffjm {
    final /* synthetic */ igz a;
    final /* synthetic */ long b;

    public eguu(igz igzVar, long j) {
        this.a = igzVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.b(this.a, null, null, this.b, hfdVar, 48, 4);
        }
        return ffcu.a;
    }
}
