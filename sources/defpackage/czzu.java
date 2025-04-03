package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzu {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversationlist/ShareIntentTabletModeCheckFragmentPeer");
    public final ffbr b;
    public final fazb c;
    public final ffbr d;
    public final ffbr e;
    public final AnonymousClass1 f;
    private final czzq g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;

    /* JADX WARN: Type inference failed for: r1v1, types: [czzu$1] */
    public czzu(czzq czzqVar, ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        fazbVar.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.g = czzqVar;
        this.b = ffbrVar;
        this.c = fazbVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.j = ffbrVar6;
        this.f = new ejwd<acmd>() { // from class: czzu.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                th.getClass();
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                acmd acmdVar = (acmd) obj;
                acmdVar.getClass();
                if (acmdVar != acmd.REMOTE) {
                    czzu.this.b();
                    return;
                }
                final czzu czzuVar = czzu.this;
                Optional optional = (Optional) czzuVar.c.b();
                final ffji ffjiVar = new ffji() { // from class: czzr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        acio acioVar = (acio) obj2;
                        acioVar.getClass();
                        acioVar.d(czzu.this.a().getIntent());
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: czzs
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                czzuVar.a().finish();
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        };
    }

    public final eg a() {
        return this.g.fe();
    }

    public final void b() {
        ((enrr) a.h().h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentTabletModeCheckFragmentPeer", "showShareIntentFragment", 104, "ShareIntentTabletModeCheckFragmentPeer.kt")).q("DRAFTBUG(b/348065860): showShareIntentFragment");
        if (!((Optional) this.h.b()).isPresent()) {
            czzi aY = czzi.aY();
            Bundle bundle = new Bundle(1);
            bundle.putInt("intent_source", equr.SHARE_INTENT.e);
            aY.at(bundle);
            aY.t(this.g.I(), "ShareIntentFragment");
            return;
        }
        if (((atdn) this.j.b()).a()) {
            IncomingDraft a2 = ((bdiw) this.i.b()).a(a().getIntent(), aygq.b);
            if (a2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ((ahtu) ((Optional) this.h.b()).get()).b(a(), null, a2, equr.SHARE_INTENT);
            a().finish();
            return;
        }
        MessageCoreData c = ((bdiw) this.i.b()).c(a().getIntent());
        if (c == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ((ahtu) ((Optional) this.h.b()).get()).a(a(), null, c, equr.SHARE_INTENT);
        a().finish();
    }
}
