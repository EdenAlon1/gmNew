package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyfk implements cyfg {
    public final ffsk a;
    public final ffbr b;
    public final ctwb c;
    private final errl d;
    private final ejvb e;
    private final byzz f;
    private final aqkp g;

    public cyfk(errl errlVar, ffsk ffskVar, ejvb ejvbVar, ffbr ffbrVar, ctwb ctwbVar, byzz byzzVar, aqkp aqkpVar) {
        errlVar.getClass();
        ffskVar.getClass();
        ejvbVar.getClass();
        ffbrVar.getClass();
        ctwbVar.getClass();
        byzzVar.getClass();
        aqkpVar.getClass();
        this.d = errlVar;
        this.a = ffskVar;
        this.e = ejvbVar;
        this.b = ffbrVar;
        this.c = ctwbVar;
        this.f = byzzVar;
        this.g = aqkpVar;
    }

    @Override // defpackage.cyfg
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        byzz byzzVar = this.f;
        aqge d = this.g.d(new BugleConversationId(conversationIdType));
        Objects.toString(conversationIdType);
        return ejvb.a(byzzVar.a(d, "ROAMING_SHORT_CODE_BANNER_STATE_KEY:".concat(conversationIdType.toString()), lkkVar), new ejuy(this.e, new eros() { // from class: cyfh
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c;
                cyfk cyfkVar = cyfk.this;
                c = axol.c(cyfkVar.a, ffhe.a, ffsm.a, new cyfj(cyfkVar, conversationIdType, null));
                return new erph(c);
            }
        }, a.i(conversationIdType, "ROAMING_SHORT_CODE_BANNER_STATE_KEY:", "*")), new ejke() { // from class: cyfi
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
            
                if (((com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r6.get(0)).g().D() != false) goto L16;
             */
            @Override // defpackage.ejke
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r6, java.lang.Object r7) {
                /*
                    r5 = this;
                    engw r6 = (defpackage.engw) r6
                    bcyk r7 = (defpackage.bcyk) r7
                    r6.getClass()
                    cyfl r0 = new cyfl
                    r1 = 0
                    if (r7 == 0) goto L15
                    int r7 = r7.M()
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    goto L16
                L15:
                    r7 = r1
                L16:
                    r2 = 0
                    if (r7 == 0) goto L43
                    int r3 = r6.size()
                    r4 = 1
                    if (r3 != r4) goto L43
                    cyfk r3 = defpackage.cyfk.this
                    ctwb r3 = r3.c
                    int r7 = r7.intValue()
                    ctwi r7 = r3.h(r7)
                    boolean r7 = r7.C()
                    if (r7 == 0) goto L43
                    java.lang.Object r7 = r6.get(r2)
                    com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r7 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r7
                    aoku r7 = r7.g()
                    boolean r7 = r7.D()
                    if (r7 == 0) goto L43
                    goto L44
                L43:
                    r4 = r2
                L44:
                    boolean r7 = r6.isEmpty()
                    if (r7 != 0) goto L51
                    java.lang.Object r6 = r6.get(r2)
                    r1 = r6
                    com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
                L51:
                    r0.<init>(r4, r1)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cyfi.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, this.d);
    }
}
