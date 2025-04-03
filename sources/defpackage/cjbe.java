package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Duration;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjbe implements cjbc {
    public final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cjbe(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.a = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
    }

    @Override // defpackage.cjbc
    public final void a(ConversationIdType conversationIdType) {
        ((ciwj) this.b.b()).b(cixf.NT_INCOMING_MESSAGE, ((cjcj) this.d.b()).a(conversationIdType));
    }

    @Override // defpackage.cjbc
    public final void b(final ConversationIdType conversationIdType, final Duration duration, final boolean z) {
        if (!((asqe) this.e.b()).a()) {
            g(conversationIdType, duration, z);
            return;
        }
        ((amoe) this.f.b()).b(new BugleConversationId(conversationIdType)).h(new emwl() { // from class: cjbd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                amod amodVar = (amod) obj;
                int ordinal = amodVar.ordinal();
                cjbe cjbeVar = cjbe.this;
                ConversationIdType conversationIdType2 = conversationIdType;
                if (ordinal == 1) {
                    cjbeVar.g(conversationIdType2, duration, z);
                    return null;
                }
                if (ordinal != 2) {
                    throw new IllegalStateException(String.format("Unknown ConversationTrustedContactsNotificationState: %s", amodVar.name()));
                }
                ((cjdh) cjbeVar.a.b()).a(new BugleConversationId(conversationIdType2));
                return null;
            }
        }, (Executor) this.g.b()).k(axnw.b(), (Executor) this.g.b());
    }

    @Override // defpackage.cjbc
    public final void c() {
        d(true);
    }

    @Override // defpackage.cjbc
    public final void d(boolean z) {
        ciwj ciwjVar = (ciwj) this.b.b();
        civa civaVar = (civa) this.c.b();
        cjav cjavVar = (cjav) cjax.a.createBuilder();
        cjavVar.copyOnWrite();
        cjax cjaxVar = (cjax) cjavVar.instance;
        cjaxVar.b |= 2;
        cjaxVar.e = false;
        cjavVar.copyOnWrite();
        cjax cjaxVar2 = (cjax) cjavVar.instance;
        cjaxVar2.b |= 1;
        cjaxVar2.d = true;
        cjavVar.copyOnWrite();
        cjax cjaxVar3 = (cjax) cjavVar.instance;
        cjaxVar3.b |= 4;
        cjaxVar3.f = z;
        ciwjVar.c(civaVar, (cjax) cjavVar.build(), true);
    }

    @Override // defpackage.cjbc
    public final void e() {
        ciwj ciwjVar = (ciwj) this.b.b();
        civa civaVar = (civa) this.c.b();
        cjav cjavVar = (cjav) cjax.a.createBuilder();
        cjavVar.copyOnWrite();
        cjax cjaxVar = (cjax) cjavVar.instance;
        cjaxVar.b |= 2;
        cjaxVar.e = false;
        cjavVar.copyOnWrite();
        cjax cjaxVar2 = (cjax) cjavVar.instance;
        cjaxVar2.b |= 1;
        cjaxVar2.d = false;
        ciwjVar.c(civaVar, (cjax) cjavVar.build(), true);
    }

    @Override // defpackage.cjbc
    public final void f() {
        ciwj ciwjVar = (ciwj) this.b.b();
        civa civaVar = (civa) this.c.b();
        cjav cjavVar = (cjav) cjax.a.createBuilder();
        cjavVar.copyOnWrite();
        cjax cjaxVar = (cjax) cjavVar.instance;
        cjaxVar.b |= 2;
        cjaxVar.e = true;
        cjavVar.copyOnWrite();
        cjax cjaxVar2 = (cjax) cjavVar.instance;
        cjaxVar2.b |= 1;
        cjaxVar2.d = false;
        ciwjVar.c(civaVar, (cjax) cjavVar.build(), true);
    }

    public final void g(ConversationIdType conversationIdType, Duration duration, boolean z) {
        cjav cjavVar = (cjav) cjax.a.createBuilder();
        String a = conversationIdType.a();
        cjao cjaoVar = (cjao) cjap.a.createBuilder();
        long millis = duration.toMillis();
        cjaoVar.copyOnWrite();
        cjap cjapVar = (cjap) cjaoVar.instance;
        cjapVar.b |= 1;
        cjapVar.c = millis;
        cjavVar.b(a, (cjap) cjaoVar.build());
        cjavVar.copyOnWrite();
        cjax cjaxVar = (cjax) cjavVar.instance;
        cjaxVar.b |= 2;
        cjaxVar.e = false;
        cjavVar.copyOnWrite();
        cjax cjaxVar2 = (cjax) cjavVar.instance;
        cjaxVar2.b |= 1;
        cjaxVar2.d = false;
        ((ciwj) this.b.b()).c((civa) this.c.b(), (cjax) cjavVar.build(), z);
    }
}
