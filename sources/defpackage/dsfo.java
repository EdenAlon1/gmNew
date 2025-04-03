package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsfo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsfv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfo(dsfv dsfvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsfvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsfo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsfv dsfvVar = this.b;
            dsfn dsfnVar = new dsfn(dsfvVar);
            this.a = 1;
            if (dsfvVar.i.a(dsfnVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsfo(this.b, ffguVar);
    }
}
