package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsx implements ffjm {
    final /* synthetic */ boolean a;

    public dmsx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmsz.b(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
