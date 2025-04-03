package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyev implements cyet {
    private final errl a;
    private final byzz b;
    private final aqkp c;

    public cyev(errl errlVar, byzz byzzVar, aqkp aqkpVar) {
        errlVar.getClass();
        byzzVar.getClass();
        aqkpVar.getClass();
        this.a = errlVar;
        this.b = byzzVar;
        this.c = aqkpVar;
    }

    @Override // defpackage.cyet
    public final ejuh a(lkk lkkVar, ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byzz byzzVar = this.b;
        aqge d = this.c.d(new BugleConversationId(conversationIdType));
        Objects.toString(conversationIdType);
        return new ejuu(byzzVar.a(d, "ADD_COUNTRY_CODE_BANNER_STATE_KEY:".concat(conversationIdType.toString()), lkkVar), new emwl() { // from class: cyeu
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
            
                if (r1.h() == defpackage.aorb.MODIFIED_COUNTRY_CODE) goto L12;
             */
            @Override // defpackage.emwl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    engw r6 = (defpackage.engw) r6
                    cyew r0 = new cyew
                    int r1 = r6.size()
                    r2 = 0
                    r3 = 1
                    if (r1 != r3) goto L2b
                    java.lang.Object r1 = r6.get(r2)
                    com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
                    aoku r4 = r1.g()
                    boolean r4 = r4.r()
                    if (r4 == 0) goto L2b
                    android.net.Uri r4 = r1.e()
                    if (r4 == 0) goto L2b
                    aorb r1 = r1.h()
                    aorb r4 = defpackage.aorb.MODIFIED_COUNTRY_CODE
                    if (r1 != r4) goto L2b
                    goto L2c
                L2b:
                    r3 = r2
                L2c:
                    boolean r1 = r6.isEmpty()
                    if (r1 != 0) goto L39
                    java.lang.Object r6 = r6.get(r2)
                    com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r6 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6
                    goto L3a
                L39:
                    r6 = 0
                L3a:
                    r0.<init>(r3, r6)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyeu.apply(java.lang.Object):java.lang.Object");
            }
        }, this.a);
    }

    @Override // defpackage.cyet
    public final elfl b(ResolvedRecipient resolvedRecipient) {
        return this.c.D(resolvedRecipient.F(), aorb.MODIFIED_AND_INFORMED);
    }
}
