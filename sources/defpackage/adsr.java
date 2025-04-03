package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsr implements adso {
    private static final cskc a = cskc.g("Bugle", "GaiaPairingPromo");

    @Override // defpackage.adso
    public final void b(Activity activity) {
        if (adhu.b()) {
            ea h = ((eg) activity).a().h("conversation_list_root_fragment_tag");
            ea eaVar = null;
            if (h != null && h.I() != null) {
                eaVar = h.I().h("home_fragment_tag");
            }
            if (eaVar == null) {
                a.p("Fragment is null");
                return;
            }
            final aedh aedhVar = (aedh) ekhs.a(eaVar);
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onGaiaPromoAllowButtonClicked", 2810, "HomeFragmentPeer.java")).q("HomeFragment onGaiaPromoAllowButtonClicked called");
            ((Optional) aedhVar.d.b()).ifPresent(new Consumer() { // from class: aebx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    aedh aedhVar2 = aedh.this;
                    ((adst) obj).c(aedhVar2.al, aedhVar2.B, aedhVar2.aB);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.adso
    public final /* synthetic */ void a(Activity activity) {
    }
}
