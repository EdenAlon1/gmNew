package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sln extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ slf c;
    final /* synthetic */ eoel d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sln(ffgu ffguVar, fflb fflbVar, slf slfVar, eoel eoelVar) {
        super(2, ffguVar);
        this.b = fflbVar;
        this.c = slfVar;
        this.d = eoelVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sln) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffud ffudVar = (ffud) this.b.a;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            slf slfVar = this.c;
            this.a = 1;
            if (slfVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.d.close();
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sln slnVar = new sln(ffguVar, this.b, this.c, this.d);
        slnVar.e = obj;
        return slnVar;
    }
}
