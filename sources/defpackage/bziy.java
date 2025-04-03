package defpackage;

import defpackage.bzid;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bziy extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ bzid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bziy(bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bziy) c((eisx) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ekhv.a(this.b.j, bzid.a.class, (eisx) this.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bziy bziyVar = new bziy(this.b, ffguVar);
        bziyVar.a = obj;
        return bziyVar;
    }
}
