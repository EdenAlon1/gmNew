package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnru extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dnto b;
    final /* synthetic */ fgcm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnru(dnto dntoVar, fgcm fgcmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dntoVar;
        this.c = fgcmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnru) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffud ffudVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffudVar = (ffud) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffud d = ffqy.d((ffsk) this.d, null, null, new dnrt(this.c, this.b, null), 3);
            long longValue = ((dnsl) this.b).e.longValue();
            dnrr dnrrVar = new dnrr(longValue, null);
            this.d = d;
            this.a = 1;
            if (ffvm.c(longValue, dnrrVar, this) == ffhhVar) {
                return ffhhVar;
            }
            ffudVar = d;
        }
        ffudVar.t(null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dnru dnruVar = new dnru(this.b, this.c, ffguVar);
        dnruVar.d = obj;
        return dnruVar;
    }
}
