package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvw extends ffkk implements ffjo {
    final /* synthetic */ hvx a;
    final /* synthetic */ jjp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvw(hvx hvxVar, jjp jjpVar) {
        super(4);
        this.a = hvxVar;
        this.b = jjpVar;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a.e.set(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
        iui iuiVar = (iui) this.b;
        hvx hvxVar = this.a;
        hvxVar.j.a.requestAutofill(hvxVar.b, iuiVar.d, hvxVar.e);
        return ffcu.a;
    }
}
