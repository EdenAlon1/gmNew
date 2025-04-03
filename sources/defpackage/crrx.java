package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crrx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crsa b;
    final /* synthetic */ crsd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crrx(ffgu ffguVar, crsa crsaVar, crsd crsdVar) {
        super(2, ffguVar);
        this.b = crsaVar;
        this.c = crsdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crrx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        crsa crsaVar = this.b;
        crsd crsdVar = this.c;
        this.a = 1;
        Object d = crsaVar.d(crsdVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crrx crrxVar = new crrx(ffguVar, this.b, this.c);
        crrxVar.d = obj;
        return crrxVar;
    }
}
