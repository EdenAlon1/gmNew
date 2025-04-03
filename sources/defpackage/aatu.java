package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatu implements aata {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl");
    public final ffsk b;
    public final alye c;
    public final AtomicBoolean d;
    public aasu e;
    public final ffxx f;
    public final ffxx g;
    public final aaub h;
    public final apvw i;
    private final ffbr j;
    private final MessageId k;

    public aatu(ffsk ffskVar, aaub aaubVar, apvw apvwVar, alye alyeVar, ffbr ffbrVar, OpenConversation2Arguments openConversation2Arguments, askj askjVar, ffbr ffbrVar2) {
        ffxx ffygVar;
        ffxx ffygVar2;
        ffskVar.getClass();
        apvwVar.getClass();
        alyeVar.getClass();
        ffbrVar.getClass();
        openConversation2Arguments.getClass();
        ffbrVar2.getClass();
        this.b = ffskVar;
        this.h = aaubVar;
        this.i = apvwVar;
        this.c = alyeVar;
        this.j = ffbrVar;
        this.d = new AtomicBoolean(false);
        if (((ersq) ((armv) askjVar).a.b()).a("bugle.use_last_read_marker")) {
            ffxx g = axol.g(new ffix() { // from class: aatb
                @Override // defpackage.ffix
                public final Object invoke() {
                    elfl w = aatu.this.c.w();
                    w.getClass();
                    return w;
                }
            });
            long j = ffpw.a;
            Object b = ffbrVar.b();
            b.getClass();
            ffygVar = axta.b(g, ffpy.e(((Number) b).longValue(), ffpz.c), new aatk(null));
        } else {
            ffygVar = new ffyg(null);
        }
        this.f = ffygVar;
        if (((askx) ffbrVar2.b()).a()) {
            ffxx g2 = axol.g(new ffix() { // from class: aatc
                @Override // defpackage.ffix
                public final Object invoke() {
                    return aatu.this.c.t();
                }
            });
            long j2 = ffpw.a;
            Object b2 = ffbrVar.b();
            b2.getClass();
            ffygVar2 = axta.b(g2, ffpy.e(((Number) b2).longValue(), ffpz.c), new aatj(null));
        } else {
            ffygVar2 = new ffyg(null);
        }
        this.g = ffygVar2;
        this.k = openConversation2Arguments.b;
    }

    @Override // defpackage.aata
    public final ffxx a() {
        ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingDataProviderImpl", "getInitialMessageId", 145, "MessageListPagingDataProviderImpl.kt")).t("getInitialMessageId - searchedMessagedId: %s", this.k);
        MessageId messageId = this.k;
        return messageId != null ? new ffyg(new aasx(messageId)) : new aatf(this.f);
    }
}
