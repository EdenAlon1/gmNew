package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ena extends ffkk implements ffjn {
    final /* synthetic */ eot a;
    final /* synthetic */ kah b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ena(eot eotVar, kah kahVar) {
        super(3);
        this.a = eotVar;
        this.b = kahVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        float floatValue3 = ((Number) obj3).floatValue();
        eot eotVar = this.a;
        boolean b = dvj.b(eotVar, floatValue);
        if (eotVar.x().e != dqs.a && this.b != kah.a) {
            b = !b;
        }
        int i = eotVar.x().b;
        float a = i == 0 ? 0.0f : dvj.a(eotVar) / i;
        int a2 = dvh.a(eotVar.o, floatValue);
        if (dve.a(a2, 0)) {
            floatValue2 = Math.abs(a - ((float) ((int) a))) > 0.5f ? floatValue3 : floatValue3;
        } else {
            if (!dve.a(a2, 1)) {
                if (!dve.a(a2, 2)) {
                    floatValue2 = 0.0f;
                }
            }
        }
        return Float.valueOf(floatValue2);
    }
}
