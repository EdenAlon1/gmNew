package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ykr extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ yks d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykr(yks yksVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = yksVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        ykr ykrVar = new ykr(this.d, (ffgu) obj4);
        ykrVar.a = (xlt) obj;
        ykrVar.b = booleanValue;
        ykrVar.c = (ajmx) obj3;
        return ykrVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        String string;
        Integer num;
        ffci.b(obj);
        Object obj2 = this.a;
        final boolean z = this.b;
        Object obj3 = this.c;
        if (obj2 == null) {
            return this.d.q;
        }
        final yks yksVar = this.d;
        ffix ffixVar = new ffix() { // from class: yko
            @Override // defpackage.ffix
            public final Object invoke() {
                final yks yksVar2 = yksVar;
                if (z) {
                    ekzm b = yksVar2.g.b("ComposeRowSendButton.onSend");
                    try {
                        if (yksVar2.p.g(false, true)) {
                            if (((aull) yksVar2.m.b()).a()) {
                                Optional optional = (Optional) yksVar2.l.b();
                                final ffji ffjiVar = new ffji() { // from class: yjv
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj4) {
                                        cjyx cjyxVar = (cjyx) obj4;
                                        cjyxVar.getClass();
                                        AtomicReference atomicReference = cjyxVar.b;
                                        ConversationId conversationId = yks.this.i;
                                        if (!ffkj.e(atomicReference.getAndSet(conversationId), conversationId)) {
                                            ensk h = cjyx.a.h();
                                            h.Y(ente.a, "BugleProfiles");
                                            ((enrr) h.h("com/google/android/apps/messaging/shared/profile/transport/ProfileInteractionTrackerImpl", "setLastConversationInteraction", 26, "ProfileInteractionTrackerImpl.kt")).t("Setting conversation interaction: %s", conversationId.b());
                                        }
                                        return ffcu.a;
                                    }
                                };
                                optional.ifPresent(new Consumer() { // from class: yjw
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj4) {
                                        enru enruVar = yks.a;
                                        ffji.this.invoke(obj4);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            axol.k(yksVar2.f, yksVar2.d, new ykd(yksVar2, (xhu) yksVar2.r.a.c(), yksVar2.n.a(), null), 2);
                        } else {
                            ensk h = yks.a.h();
                            h.Y(ente.a, "BugleComposeRow2");
                            ((enrr) h.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/send/SendButtonUiAdapterImpl", "onSend", 158, "SendButtonUiAdapterImpl.kt")).q("Skipping SendButtonUiAdapterImpl.onSend");
                        }
                        ffig.a(b, null);
                    } finally {
                    }
                } else {
                    yksVar2.c();
                }
                return ffcu.a;
            }
        };
        ffix ykpVar = z ? new ykp(yksVar) : new ykq(yksVar);
        Context context = yksVar.c;
        ffix ffixVar2 = ykpVar;
        String str = obj3 != null ? ((ajmx) obj3).a : null;
        if (str == null || (num = ((xlt) obj2).e) == null) {
            string = context.getString(((xlt) obj2).b);
            string.getClass();
        } else {
            string = context.getString(num.intValue(), str);
            string.getClass();
        }
        String str2 = string;
        xlt xltVar = (xlt) obj2;
        Integer num2 = xltVar.c;
        return dmof.a(yksVar.q, xltVar.a, ffixVar, ffixVar2, str2, num2 != null ? this.d.c.getString(num2.intValue()) : null, z, null, 64);
    }
}
