package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djyt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djyp(ffgu ffguVar, djyt djytVar) {
        super(2, ffguVar);
        this.b = djytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djyp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            djyt djytVar = this.b;
            Object a = djyt.c.a();
            a.getClass();
            djytVar.v.set(((Boolean) a).booleanValue());
            this.b.p.set(djyi.b);
            djyt djytVar2 = this.b;
            Object obj2 = djytVar2.t;
            if (obj2 == null) {
                ffkj.c("initialState");
                obj2 = ffcu.a;
            }
            this.a = 1;
            if (djytVar2.g(obj2, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.p.set(djyi.c);
        enrr enrrVar = (enrr) djyt.d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$start$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 164, "StateMachineV2.kt");
        Object obj3 = this.b.t;
        if (obj3 == null) {
            ffkj.c("initialState");
            obj3 = ffcu.a;
        }
        enrrVar.t("Initialized StateMachineV2 to %s", obj3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djyp djypVar = new djyp(ffguVar, this.b);
        djypVar.c = obj;
        return djypVar;
    }
}
