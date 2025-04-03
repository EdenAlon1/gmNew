package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmny implements ffjo {
    final /* synthetic */ dyh a;
    final /* synthetic */ dmof b;
    final /* synthetic */ dmnh c;
    final /* synthetic */ hho d;

    public dmny(dyh dyhVar, dmof dmofVar, dmnh dmnhVar, hho hhoVar) {
        this.a = dyhVar;
        this.b = dmofVar;
        this.c = dmnhVar;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cqq cqqVar = (cqq) obj;
        int intValue = ((Number) obj4).intValue();
        cqqVar.getClass();
        boolean s = cqqVar.a().s();
        dmof dmofVar = this.b;
        dmnh dmnhVar = this.c;
        dmob.b(this.a, ((Boolean) obj2).booleanValue(), dmofVar, dmnhVar, this.d, s, (hfd) obj3, intValue & 112);
        return ffcu.a;
    }
}
