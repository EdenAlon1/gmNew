package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ales extends ffhv implements ffjm {
    int a;
    final /* synthetic */ int b;
    final /* synthetic */ fagh c;
    final /* synthetic */ long d;
    final /* synthetic */ alex e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ales(int i, fagh faghVar, long j, alex alexVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = i;
        this.c = faghVar;
        this.d = j;
        this.e = alexVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ales) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dvxm a = dvxn.a(this.b);
            a.c(dvyd.b());
            fagh faghVar = this.c;
            long j = this.d;
            faghVar.getClass();
            eyfw eyfwVar = dvyl.a;
            epns epnsVar = (epns) epnt.a.createBuilder();
            epnsVar.getClass();
            fapb fapbVar = (fapb) fape.a.createBuilder();
            fapbVar.getClass();
            fapc fapcVar = (fapc) fapd.a.createBuilder();
            fapcVar.getClass();
            int a2 = faghVar.a();
            fapcVar.copyOnWrite();
            fapd fapdVar = (fapd) fapcVar.instance;
            fapdVar.b |= 1;
            fapdVar.c = a2;
            eyfy build = fapcVar.build();
            build.getClass();
            fapbVar.copyOnWrite();
            fape fapeVar = (fape) fapbVar.instance;
            fapeVar.c = (fapd) build;
            fapeVar.b |= 2;
            eyev d = eyki.d(j);
            d.getClass();
            fapbVar.copyOnWrite();
            fape fapeVar2 = (fape) fapbVar.instance;
            fapeVar2.d = d;
            fapeVar2.b |= 4;
            MessageType build2 = fapbVar.build();
            build2.getClass();
            epnsVar.copyOnWrite();
            epnt epntVar = (epnt) epnsVar.instance;
            epntVar.d = (fape) build2;
            epntVar.c |= 1;
            eyfy build3 = epnsVar.build();
            build3.getClass();
            a.b(new dvxg(eyfwVar, (epnt) build3));
            a.b(alfb.b(this.e.a));
            alex alexVar = this.e;
            dvxn a3 = a.a();
            this.a = 1;
            if (alexVar.c(a3, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ales(this.b, this.c, this.d, this.e, ffguVar);
    }
}
