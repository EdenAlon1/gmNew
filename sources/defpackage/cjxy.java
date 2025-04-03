package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjxz b;
    final /* synthetic */ eiks c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxy(cjxz cjxzVar, eiks eiksVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjxzVar;
        this.c = eiksVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cjxz cjxzVar = this.b;
            eiks eiksVar = this.c;
            this.a = 1;
            if (cjxzVar.b(eiksVar.c, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjxy(this.b, this.c, ffguVar);
    }
}
