package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyu implements aqbq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final cqor e;

    public cjyu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = new cqoq("ProfileBugleSendMessageListener::onMessageSent");
    }

    @Override // defpackage.aqbq
    public final ekzz a() {
        return this.e.a();
    }

    @Override // defpackage.aqbq
    public final elfl b(apro aproVar) {
        aproVar.getClass();
        final apfz d = aproVar.d();
        if (d.g() == null) {
            ensk h = a.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener", "onMessageSent", 45, "ProfileBugleSendMessageListener.kt")).q("Not sending profile info, self identity null");
            elfl e = elfo.e(null);
            e.getClass();
            return e;
        }
        if (((aull) this.d.b()).a()) {
            Object b = this.c.b();
            b.getClass();
            cjyx cjyxVar = (cjyx) fflm.b((Optional) b);
            if (!ffkj.e(cjyxVar != null ? (ConversationId) cjyxVar.b.get() : null, aproVar.d().f())) {
                ensk h2 = a.h();
                h2.Y(ente.a, "BugleProfiles");
                ((enrr) h2.h("com/google/android/apps/messaging/shared/profile/transport/ProfileBugleSendMessageListener", "onMessageSent", 53, "ProfileBugleSendMessageListener.kt")).q("User didn't interact with conversation, not sharing profile");
                elfl e2 = elfo.e(null);
                e2.getClass();
                return e2;
            }
        }
        Optional optional = (Optional) this.b.b();
        final ffji ffjiVar = new ffji() { // from class: cjys
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cjyd cjydVar = (cjyd) obj;
                cjydVar.getClass();
                cjydVar.a(apfz.this);
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cjyt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        elfl e3 = elfo.e(null);
        e3.getClass();
        return e3;
    }
}
