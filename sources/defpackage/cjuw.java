package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjuw extends ffhv implements ffjm {
    final /* synthetic */ cjwc a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjuw(ffgu ffguVar, cjwc cjwcVar) {
        super(2, ffguVar);
        this.a = cjwcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjuw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjuw cjuwVar = new cjuw(ffguVar, this.a);
        cjuwVar.b = obj;
        return cjuwVar;
    }
}
