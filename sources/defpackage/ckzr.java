package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckzr implements amlb {
    public static final entd a = entd.c("BugleGroupManagement");
    private static final cqor c = new cqoq("RcsGroupRecovery::onConversationOpened");
    public final clas b;
    private final errl d;

    public ckzr(errl errlVar, clas clasVar) {
        this.d = errlVar;
        this.b = clasVar;
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return c.a();
    }

    @Override // defpackage.amlb
    public final elfl b(final BugleConversation bugleConversation, alxk alxkVar) {
        return elfo.f(new Runnable() { // from class: ckzp
            @Override // java.lang.Runnable
            public final void run() {
                bsob e = bsom.e();
                e.z("RcsGroupRecovery");
                bskp bskpVar = bsom.c;
                e.c(bskpVar.a, bskpVar.O, bskpVar.ao, bskpVar.N);
                final BugleConversationId bugleConversationId = ((DefaultConversation) bugleConversation).a;
                e.i(new Function() { // from class: ckzq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        entd entdVar = ckzr.a;
                        bsolVar.q(BugleConversationId.this.a);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                engw y = e.b().y();
                if (y.isEmpty()) {
                    ((ensz) ckzr.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupOpenConversationListener", "recoverRcsGroup", 76, "MapiRecoverDisabledRcsGroupOpenConversationListener.java")).t("Recover disabled RCS group disabled because conversation[%s] does not exist.", bugleConversationId.b());
                    return;
                }
                bseh bsehVar = (bseh) enjk.l(y);
                if (!byyr.d(bsehVar.k())) {
                    ((ensz) ckzr.a.n().h("com/google/android/apps/messaging/shared/rcs/groups/recovery/MapiRecoverDisabledRcsGroupOpenConversationListener", "recoverRcsGroup", 85, "MapiRecoverDisabledRcsGroupOpenConversationListener.java")).D("Recover disabled RCS group disabled because conversation[%s][%s] is not a RCS group", bugleConversationId.b(), byyr.a(bsehVar.k()));
                } else {
                    ((ckzy) ckzr.this.b).a(bsehVar.C(), bsehVar.m(), bsehVar.O());
                }
            }
        }, this.d);
    }
}
