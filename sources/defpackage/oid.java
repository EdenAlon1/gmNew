package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oid extends ffhv implements ffjm {
    final /* synthetic */ oie a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oid(oie oieVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = oieVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oid) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        oie oieVar = this.a;
        oieVar.g.b(new Integer(oieVar.e));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new oid(this.a, ffguVar);
    }
}
