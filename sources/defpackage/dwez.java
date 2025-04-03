package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwez implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ float b;

    public dwez(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dyc.b(ebs.m(hvi.e, this.a, this.b), hfdVar, 0);
        }
        return ffcu.a;
    }
}
