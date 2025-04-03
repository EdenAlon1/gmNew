package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cufq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cufr b;
    final /* synthetic */ culf c;
    final /* synthetic */ cukx d;
    final /* synthetic */ erdy e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cufq(cufr cufrVar, culf culfVar, cukx cukxVar, erdy erdyVar, int i, int i2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cufrVar;
        this.c = culfVar;
        this.d = cukxVar;
        this.e = erdyVar;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cufq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cugj a = ((cugi) this.b.a.b()).a(this.c);
            cugi cugiVar = (cugi) this.b.a.b();
            culf culfVar = this.c;
            this.a = 1;
            obj = cugiVar.c(culfVar.a, culfVar.b, a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        cukx cukxVar = this.d;
        erdy erdyVar = this.e;
        int i2 = this.f;
        int i3 = this.g;
        ereo ereoVar = (ereo) obj;
        erdv a2 = cufr.a(cukxVar, erdyVar, i2);
        a2.copyOnWrite();
        erdw erdwVar = (erdw) a2.instance;
        erdw erdwVar2 = erdw.a;
        if (i3 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        erdwVar.i = i3 - 2;
        erdwVar.b |= 32;
        erdw erdwVar3 = (erdw) a2.build();
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
        return new cufq(this.b, this.c, this.d, this.e, this.f, this.g, ffguVar);
    }
}
