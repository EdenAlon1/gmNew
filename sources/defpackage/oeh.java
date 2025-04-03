package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oeh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ffjn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeh(ffxx ffxxVar, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((oeh) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxy ffxyVar = (ffxy) this.d;
            fflb fflbVar = new fflb();
            fflbVar.a = oen.a;
            ffxx ffxxVar = this.b;
            oeg oegVar = new oeg(fflbVar, this.c, ffxyVar);
            this.a = 1;
            if (ffxxVar.a(oegVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        oeh oehVar = new oeh(this.b, this.c, ffguVar);
        oehVar.d = obj;
        return oehVar;
    }
}
