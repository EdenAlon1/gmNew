package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ziv implements ffjn {
    final /* synthetic */ hjz a;

    public ziv(hjz hjzVar) {
        this.a = hjzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            zjc.j(this.a, hfdVar, 6);
        }
        return ffcu.a;
    }
}
