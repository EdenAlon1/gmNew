package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydb implements cycv {
    public final ffbr a;
    private final errm b;

    public cydb(ffbr ffbrVar, errm errmVar) {
        this.a = ffbrVar;
        this.b = errmVar;
    }

    @Override // defpackage.cycv
    public final elfl a(final ConversationId conversationId) {
        ekzz f = eleg.f("AddContactBanner2DatabaseOperationsImpl#getConversationOpenCount");
        try {
            elfl g = elfo.g(new Callable() { // from class: cyda
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bseh r = ((bczy) cydb.this.a.b()).r(bdgq.b(conversationId.b()));
                    return Integer.valueOf(r != null ? r.o() : 0);
                }
            }, this.b);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cycv
    public final void b(final ConversationId conversationId) {
        ekzz f = eleg.f("AddContactBanner2DatabaseOperationsImpl#dismissAddContactBanner");
        try {
            axnw.h(elfo.g(new Callable() { // from class: cycz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bczy bczyVar = (bczy) cydb.this.a.b();
                    ConversationIdType b = bdgq.b(conversationId.b());
                    String[] strArr = bsom.a;
                    bsoe bsoeVar = new bsoe();
                    bsoeVar.ap("setConversationOpenCount");
                    bsoeVar.E(((Integer) cybw.a.e()).intValue() + 2);
                    return Boolean.valueOf(bczyVar.ak(b, bsoeVar));
                }
            }, this.b));
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cycv
    public final void c(final ConversationId conversationId) {
        ekzz f = eleg.f("AddContactBanner2DatabaseOperationsImpl#incrementConversationOpenCount");
        try {
            axnw.h(a(conversationId).i(new eroh() { // from class: cycy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Integer num = (Integer) obj;
                    if (num.intValue() <= ((Integer) cybw.a.e()).intValue() + 1) {
                        ConversationId conversationId2 = conversationId;
                        bczy bczyVar = (bczy) cydb.this.a.b();
                        ConversationIdType b = bdgq.b(conversationId2.b());
                        String[] strArr = bsom.a;
                        bsoe bsoeVar = new bsoe();
                        bsoeVar.ap("incrementConversationOpenCount");
                        bsoeVar.E(num.intValue() + 1);
                        bczyVar.ak(b, bsoeVar);
                    }
                    return elfo.e(null);
                }
            }, this.b));
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
