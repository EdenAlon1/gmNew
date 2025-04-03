package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djym extends ffhv implements ffjm {
    final /* synthetic */ djyt a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djym(ffgu ffguVar, djyt djytVar, Object obj, Object obj2) {
        super(2, ffguVar);
        this.a = djytVar;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djym) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a.q.get()) {
            ((enrr) djyt.d.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 373, "StateMachineV2.kt")).t("Can't send message %s on a StateMachineV2 instance that has already quit.", this.b);
            return ffcu.a;
        }
        fflb fflbVar = new fflb();
        fflbVar.a = this.a.b();
        for (djyu djyuVar : this.a.x) {
            djyuVar.a();
        }
        if (!this.a.v.get()) {
            ((enrr) djyt.d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 383, "StateMachineV2.kt")).D("Pretend sent message %s to %s", this.b, this.a.a());
            return ffcu.a;
        }
        while (true) {
            djyk djykVar = (djyk) fflbVar.a;
            if (djykVar == null) {
                break;
            }
            if (djykVar.b.w(this.b, this.c)) {
                break;
            }
            ((enrr) djyt.d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 388, "StateMachineV2.kt")).D("Sent message %s to %s", this.b, fflbVar.a);
            djyt djytVar = this.a;
            Object obj2 = djytVar.g.get(((djyk) fflbVar.a).a);
            fflbVar.a = obj2 == null ? null : (djyk) djytVar.j.get(obj2);
            if (fflbVar.a == null && !this.a.q.get()) {
                if (((Boolean) djyt.b.a()).booleanValue()) {
                    throw new IllegalStateException("No state could handle the message: " + this.b + ", current states: " + this.a.e());
                }
                ((enrr) djyt.d.j().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$sendMessage$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 404, "StateMachineV2.kt")).D("No state could handle the message %s, current states: %s", this.b, this.a.e());
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        djym djymVar = new djym(ffguVar, this.a, this.b, this.c);
        djymVar.d = obj;
        return djymVar;
    }
}
