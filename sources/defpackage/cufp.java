package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cufr b;
    final /* synthetic */ culf c;
    final /* synthetic */ cugj d;
    final /* synthetic */ cukx e;
    final /* synthetic */ erdy f;
    final /* synthetic */ int g;
    final /* synthetic */ eres h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufp(cufr cufrVar, culf culfVar, cugj cugjVar, cukx cukxVar, erdy erdyVar, int i, eres eresVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cufrVar;
        this.c = culfVar;
        this.d = cugjVar;
        this.e = cukxVar;
        this.f = erdyVar;
        this.g = i;
        this.h = eresVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cugi cugiVar = (cugi) this.b.a.b();
            culf culfVar = this.c;
            cugj cugjVar = this.d;
            this.a = 1;
            obj = cugiVar.c(culfVar.a, culfVar.b, cugjVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cukx cukxVar = this.e;
        erdy erdyVar = this.f;
        int i2 = this.g;
        eres eresVar = this.h;
        ereo ereoVar = (ereo) obj;
        erdv a = cufr.a(cukxVar, erdyVar, i2);
        a.copyOnWrite();
        erdw erdwVar = (erdw) a.instance;
        erdw erdwVar2 = erdw.a;
        erdwVar.j = eresVar.a();
        erdwVar.b |= 64;
        erdw erdwVar3 = (erdw) a.build();
        ereoVar.copyOnWrite();
        ereq ereqVar = (ereq) ereoVar.instance;
        ereq ereqVar2 = ereq.a;
        erdwVar3.getClass();
        ereqVar.d = erdwVar3;
        ereqVar.c = 4;
        cufu cufuVar = (cufu) this.b.b.b();
        erdk erdkVar = (erdk) erdl.a.createBuilder();
        erdkVar.copyOnWrite();
        erdl erdlVar = (erdl) erdkVar.instance;
        ereq ereqVar3 = (ereq) ereoVar.build();
        ereqVar3.getClass();
        erdlVar.c = ereqVar3;
        erdlVar.b = 1;
        eyfy build = erdkVar.build();
        build.getClass();
        cufuVar.b((erdl) build);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cufp(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
