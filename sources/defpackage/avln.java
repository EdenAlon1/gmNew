package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avln {
    public static final entd a = entd.c("Bugle");
    public final ffbr b;
    public final azaw c;
    public final azaw d;
    private final errl e;

    public avln(errl errlVar, ffbr ffbrVar, azaw azawVar, azaw azawVar2) {
        this.e = errlVar;
        this.b = ffbrVar;
        this.c = azawVar2;
        this.d = azawVar;
    }

    public final elfl a(final aoku aokuVar, MessageCoreData messageCoreData) {
        ekzz f = eleg.f("RcsContactsCacheRefresher::refreshCapabilitiesForMessageProtocolAndCacheMismatch");
        try {
            final boolean C = bdjs.C(messageCoreData.d());
            final ConversationIdType z = messageCoreData.z();
            elfl h = elfo.h(new erog() { // from class: avll
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ConversationIdType conversationIdType = z;
                    if (!conversationIdType.b()) {
                        avln avlnVar = avln.this;
                        bseh r = ((bczy) avlnVar.b.b()).r(conversationIdType);
                        if (r == null) {
                            ((ensz) ((ensz) avln.a.j()).h("com/google/android/apps/messaging/shared/chatapi/capabilities/RcsCapabilitiesCacheRefresher", "shouldCheckCachedCapabilities", 93, "RcsCapabilitiesCacheRefresher.java")).t("Could not check cached capabilities, conversation data for conversationId=%s is null", conversationIdType);
                        } else {
                            boolean z2 = C;
                            if ((z2 || r.r() != 2) && byyr.c(r.k()) && !r.am()) {
                                aoku aokuVar2 = aokuVar;
                                return z2 ? avlnVar.d.c(aokuVar2) : avlnVar.c.c(aokuVar2);
                            }
                        }
                    }
                    return elfo.e(azau.c());
                }
            }, this.e).h(new emwl() { // from class: avlm
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = avln.a;
                    return null;
                }
            }, erpp.a);
            f.close();
            return h;
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
