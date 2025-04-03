package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsc extends ffkk implements ffjm {
    final /* synthetic */ dse a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsc(dse dseVar) {
        super(2);
        this.a = dseVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        float floatValue = ((Number) obj).floatValue();
        float floatValue2 = ((Number) obj2).floatValue();
        dse dseVar = this.a;
        ffqy.d(dseVar.D(), null, null, new dsb(dseVar, floatValue, floatValue2, null), 3);
        return true;
    }
}
