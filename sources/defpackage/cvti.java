package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvti implements ffjn {
    final /* synthetic */ cvvz a;

    public cvti(cvvz cvvzVar) {
        this.a = cvvzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((edi) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cvwb.a(this.a.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
