package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkao {
    public final djsz a;
    private final djrl b;

    public dkao(djrl djrlVar, djsz djszVar) {
        this.b = djrlVar;
        this.a = djszVar;
    }

    public final void a(djro djroVar) {
        djsz djszVar = this.a;
        djrl djrlVar = this.b;
        Set t = djszVar.t();
        djrlVar.b(t);
        ensk h = dkaw.a.h();
        h.Y(ente.a, "RcsProvisioningManager");
        ((enrr) ((enrr) h).h("com/google/android/ims/provisioning/manager/RcsProvisioningManager$CommonRcsProvisioningChangeListenerHandler", "notifyListener", 1356, "RcsProvisioningManager.java")).J("CommonRcsProvisioningChangeListenerHandler.notifyListener : Notify RcsProvisioningChangeListener %s onRcsProvisioningChange, SIM = %s, available rcs provisioning ids  = %s", this.b, dktx.SIM_ID.c(djroVar), Collection.EL.stream(t).map(new Function() { // from class: dkan
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return dktx.SIM_ID.c(djrn.a((djrm) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(",")));
    }
}
