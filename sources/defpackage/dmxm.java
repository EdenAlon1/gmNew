package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxm implements ffjm {
    final /* synthetic */ float a;

    public dmxm(float f) {
        this.a = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ebv.a(jfw.a(ebs.k(hvi.e, this.a), "AnimationPlaceholder"), hfdVar);
        }
        return ffcu.a;
    }
}
