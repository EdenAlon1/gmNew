package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dsd extends ffhv implements ffjm {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ dse c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsd(dse dseVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = dseVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsd) c(new iak(((iak) obj).a), (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        long j = this.b;
        dse dseVar = this.c;
        this.a = 1;
        Object a = drp.a(dseVar.b, j, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dsd dsdVar = new dsd(this.c, ffguVar);
        dsdVar.b = ((iak) obj).a;
        return dsdVar;
    }
}
