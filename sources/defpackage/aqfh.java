package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqfh extends ffhv implements ffjm {
    final /* synthetic */ aqfj a;
    final /* synthetic */ eqkt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqfh(aqfj aqfjVar, eqkt eqktVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqfjVar;
        this.b = eqktVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((aqfh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
        return null;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.c.a(this.b);
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqfh(this.a, this.b, ffguVar);
    }
}
