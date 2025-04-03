package defpackage;

import android.util.Pair;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daul extends cslh {
    public static final /* synthetic */ int c = 0;
    final /* synthetic */ Optional a;
    final /* synthetic */ dauv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daul(dauv dauvVar, Optional optional) {
        super("Bugle.Async.markLastConversationNotYetDelivered.Duration");
        this.a = optional;
        this.b = dauvVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        ConversationIdType conversationIdType = (ConversationIdType) this.a.map(new Function() { // from class: dauj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bcqs) obj).e;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: dauk
            @Override // java.util.function.Supplier
            public final Object get() {
                int i = daul.c;
                return dauv.h();
            }
        });
        if (conversationIdType.b()) {
            return new Pair(bdgq.a, bdhg.a);
        }
        MessageCoreData g = this.b.g(conversationIdType);
        g.getClass();
        bdhg E = g.E();
        if (bdhg.j(E)) {
            return new Pair(conversationIdType, bdhg.a);
        }
        if (((ckds) this.b.w.b()).j(E) != ckdr.NONE) {
            ((baik) this.b.i.b()).a(E, false).t();
        } else {
            ensk j = dauv.c.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/ui/debug/DebugUtilsImpl$6", "doInBackgroundTimed", 5311, "DebugUtilsImpl.java")).q("client side fallback is disabled.");
        }
        return new Pair(conversationIdType, E);
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Pair pair = (Pair) obj;
        if (pair == null) {
            return;
        }
        if (pair.first == null) {
            ((ddzb) this.b.Y.b()).l("failed to find 1:1 RCS conversation");
            return;
        }
        if (pair.second == null) {
            ((ddzb) this.b.Y.b()).l("last 1:1 RCS conversation doesn't have any undelivered");
            return;
        }
        ((ddzb) this.b.Y.b()).l("marking rcs message " + bdhg.c((bdhg) pair.second) + " in conversation " + String.valueOf(pair.first) + " as not delivered");
    }
}
