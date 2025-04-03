package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyl extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djyt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djyl(ffgu ffguVar, djyt djytVar) {
        super(2, ffguVar);
        this.b = djytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djyl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        djyt djytVar;
        Object obj2;
        Object obj3;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
        }
        do {
            diyy diyyVar = djyt.a;
            if (this.b.l.isEmpty()) {
                return ffcu.a;
            }
            ffcf ffcfVar = (ffcf) this.b.l.removeFirst();
            ((enrr) djyt.d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendDeferredMessages$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 353, "StateMachineV2.kt")).D("Sending deferred %s to %s", ffcfVar.a, this.b.b());
            djytVar = this.b;
            obj2 = ffcfVar.a;
            obj3 = ffcfVar.b;
            this.a = 1;
        } while (djytVar.f(obj2, obj3, this) != ffhhVar);
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djyl djylVar = new djyl(ffguVar, this.b);
        djylVar.c = obj;
        return djylVar;
    }
}
