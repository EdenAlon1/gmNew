package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceom extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceok b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceom(ffgu ffguVar, ceok ceokVar) {
        super(2, ffguVar);
        this.b = ceokVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceom) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ceoj cP = this.b.cP();
        this.a = 1;
        Object a = ffsl.a(new ceoi(cP, null), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceom ceomVar = new ceom(ffguVar, this.b);
        ceomVar.c = obj;
        return ceomVar;
    }
}
