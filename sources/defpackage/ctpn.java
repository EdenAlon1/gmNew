package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpn extends ffhv implements ffjm {
    final /* synthetic */ ctpo a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctpn(ffgu ffguVar, ctpo ctpoVar) {
        super(2, ffguVar);
        this.a = ctpoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctpn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (!((Boolean) aixc.a.e()).booleanValue()) {
            emrk emrkVar = emrk.a;
            emrkVar.getClass();
            return emrkVar;
        }
        String[] strArr = bvcy.a;
        bvcv bvcvVar = new bvcv(bvcy.a);
        bvcvVar.z("getNormalizedFeatures");
        bvcm bvcmVar = (bvcm) bvcvVar.b().o();
        try {
            emxf.b(bvcmVar.getCount() < 2, "More than one row found of Normalized Features");
            if (!bvcmVar.moveToFirst()) {
                bvcmVar.close();
                return emrk.a;
            }
            emrk c = bvcmVar.c();
            bvcmVar.close();
            return c;
        } catch (Throwable th) {
            try {
                bvcmVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctpn ctpnVar = new ctpn(ffguVar, this.a);
        ctpnVar.b = obj;
        return ctpnVar;
    }
}
