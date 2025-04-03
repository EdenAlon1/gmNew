package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drss extends ffhv implements ffjm {
    int a;
    final /* synthetic */ doxj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drss(doxj doxjVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = doxjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drss) c((edfo) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            edfo edfoVar = (edfo) this.c;
            doxj doxjVar = this.b;
            eddt eddtVar = (eddt) eddu.a.createBuilder();
            eddtVar.getClass();
            eddtVar.copyOnWrite();
            eddu edduVar = (eddu) eddtVar.instance;
            edduVar.b |= 1;
            edduVar.c = doxjVar.a;
            eyfy build = eddtVar.build();
            build.getClass();
            this.a = 1;
            obj = edfoVar.e((eddu) build, new febo(), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        int i2 = ((eddx) obj).b;
        eddv eddvVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : eddv.SIGNED_IN_SETUP_COMPLETE : eddv.SIGNED_IN_SETUP_PENDING : eddv.SIGNED_OUT : eddv.UNKNOWN;
        return eddvVar == null ? eddv.UNRECOGNIZED : eddvVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        drss drssVar = new drss(this.b, ffguVar);
        drssVar.c = obj;
        return drssVar;
    }
}
