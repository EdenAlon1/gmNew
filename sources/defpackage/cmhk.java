package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmhk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmii b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmhk(ffgu ffguVar, cmii cmiiVar) {
        super(2, ffguVar);
        this.b = cmiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmhk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cmii cmiiVar = this.b;
            this.a = 1;
            obj = cmiiVar.i(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((cmip) obj).equals(cmip.TOGGLE_STATE_ENABLED));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmhk cmhkVar = new cmhk(ffguVar, this.b);
        cmhkVar.c = obj;
        return cmhkVar;
    }
}
