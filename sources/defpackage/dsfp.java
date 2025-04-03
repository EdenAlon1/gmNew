package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsfp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsfv b;
    final /* synthetic */ dsar c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsfp(dsfv dsfvVar, dsar dsarVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsfvVar;
        this.c = dsarVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsfp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsfv dsfvVar = this.b;
            dsar dsarVar = this.c;
            this.a = 1;
            if (dsfvVar.r(dsarVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsfp(this.b, this.c, ffguVar);
    }
}
