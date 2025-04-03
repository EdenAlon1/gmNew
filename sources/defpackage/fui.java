package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fui extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fui(ffjn ffjnVar, float f) {
        super(2);
        this.a = ffjnVar;
        this.b = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(eba.h(0.0f, 0.0f, 0.0f, this.b, 7), hfdVar, 0);
        }
        return ffcu.a;
    }
}
