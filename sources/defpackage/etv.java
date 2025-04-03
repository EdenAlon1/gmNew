package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ fhi c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etv(ild ildVar, fhi fhiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = fhiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((etv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = this.b;
            etu etuVar = new etu(this.c);
            this.a = 1;
            if (dtr.i(ildVar, null, null, null, etuVar, this, 7) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new etv(this.b, this.c, ffguVar);
    }
}
