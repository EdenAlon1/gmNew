package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class emn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ eot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emn(ild ildVar, eot eotVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = eotVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ild ildVar = this.b;
            emm emmVar = new emm(this.c, null);
            this.a = 1;
            if (dpu.b(ildVar, emmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new emn(this.b, this.c, ffguVar);
    }
}
