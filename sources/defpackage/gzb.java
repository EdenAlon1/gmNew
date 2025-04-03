package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzb extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjo c;
    final /* synthetic */ gzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzb(ffjo ffjoVar, gzl gzlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjoVar;
        this.d = gzlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzb) c((ffcf) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffcf ffcfVar = (ffcf) this.b;
            hbq hbqVar = (hbq) ffcfVar.a;
            Object obj2 = ffcfVar.b;
            ffjo ffjoVar = this.c;
            gzl gzlVar = this.d;
            this.a = 1;
            if (ffjoVar.a(gzlVar.h, hbqVar, obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        gzb gzbVar = new gzb(this.c, this.d, ffguVar);
        gzbVar.b = obj;
        return gzbVar;
    }
}
