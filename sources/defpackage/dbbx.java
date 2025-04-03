package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbbx extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffsk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbbx(ffsk ffskVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffskVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbbx) c((dbcc) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dbcc dbccVar = (dbcc) this.b;
        this.a = 1;
        Duration ofSeconds = Duration.ofSeconds(1L);
        dtyx b = dbccVar.a.b();
        b.z("BugleDbCmsColumnsDebugData.countsPerLifeCycle");
        b.r();
        b.v(dbccVar.a.a().a());
        b.n(new dtzr("COUNT(*)"), "count");
        ffxx b2 = fgau.b(axty.a(dtyu.a(b.b()), ofSeconds), new dbcb(dbccVar, null));
        return b2 == ffhhVar ? ffhhVar : b2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbbx dbbxVar = new dbbx(this.c, ffguVar);
        dbbxVar.b = obj;
        return dbbxVar;
    }
}
