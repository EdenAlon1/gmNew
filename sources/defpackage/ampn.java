package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ampn implements aqge {
    public static final entd a = entd.c("BugleConversation");
    private final aral b;

    public ampn(errl errlVar, becj becjVar, ConversationId conversationId) {
        emxf.a(true);
        bsob e = bsom.e();
        e.z("DatabaseConversationDisableModeObserver");
        e.c(bsom.c.ak);
        final BugleConversationId bugleConversationId = (BugleConversationId) conversationId;
        e.i(new Function() { // from class: ampk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                entd entdVar = ampn.a;
                bsolVar.q(BugleConversationId.this.a);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsnz b = e.b();
        this.b = new aral(becjVar.a(b, "DatabaseConversationDisableModeObserver"), new ampm(errlVar, b, bugleConversationId));
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.b.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.b.b();
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        return this.b.c();
    }
}
