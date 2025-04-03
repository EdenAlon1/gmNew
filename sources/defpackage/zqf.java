package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zqf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffxx b;
    final /* synthetic */ ajiy c;
    final /* synthetic */ zqj d;
    final /* synthetic */ fflb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zqf(ffxx ffxxVar, ajiy ajiyVar, zqj zqjVar, fflb fflbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffxxVar;
        this.c = ajiyVar;
        this.d = zqjVar;
        this.e = fflbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zqf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx ffxxVar = this.b;
            zqe zqeVar = new zqe(this.c, this.d, this.e);
            this.a = 1;
            if (ffxxVar.a(zqeVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new zqf(this.b, this.c, this.d, this.e, ffguVar);
    }
}
