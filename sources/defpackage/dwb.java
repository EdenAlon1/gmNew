package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwb implements dvc {
    private final cxt a;

    public dwb(cxt cxtVar) {
        this.a = cxtVar;
    }

    @Override // defpackage.dvc
    public final /* bridge */ /* synthetic */ Object a(drd drdVar, Object obj, Object obj2, ffji ffjiVar, ffgu ffguVar) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        Object b = dvv.b(drdVar, Math.abs(floatValue) * Math.signum(floatValue2), floatValue, cxw.b(0.0f, floatValue2, 28), this.a, ffjiVar, ffguVar);
        return b == ffhh.a ? b : (dvb) b;
    }
}
