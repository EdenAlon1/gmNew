package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dls extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ dly d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls(ffjn ffjnVar, dly dlyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ffjnVar;
        this.d = dlyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dls) c((dmu) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dmu dmuVar = (dmu) this.b;
            ffjn ffjnVar = this.c;
            dly dlyVar = this.d;
            this.a = 1;
            if (ffjnVar.a(dlyVar.d, dmuVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dls dlsVar = new dls(this.c, this.d, ffguVar);
        dlsVar.b = obj;
        return dlsVar;
    }
}
