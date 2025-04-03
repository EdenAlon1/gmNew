package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyx extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ gzl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyx(ffjn ffjnVar, gzl gzlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjnVar;
        this.d = gzlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyx) c((hbq) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            hbq hbqVar = (hbq) this.b;
            ffjn ffjnVar = this.c;
            gzl gzlVar = this.d;
            this.a = 1;
            if (ffjnVar.a(gzlVar.h, hbqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        gyx gyxVar = new gyx(this.c, this.d, ffguVar);
        gyxVar.b = obj;
        return gyxVar;
    }
}
