package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsl implements cdsi {
    public final ffbr a;
    private final cefl b;
    private final atab c;

    public cdsl(ffbr ffbrVar, cefl ceflVar, atab atabVar) {
        this.a = ffbrVar;
        this.b = ceflVar;
        this.c = atabVar;
    }

    @Override // defpackage.cdsi
    public final void a(bseh bsehVar, eshh eshhVar, ConversationIdType conversationIdType) {
        String X = bsehVar.X();
        String ag = bsehVar.ag();
        byyt G = bsehVar.G();
        byyy H = bsehVar.H();
        String R = bsehVar.R();
        int m = bsehVar.m();
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.al();
        bsoeVar.ap("overwriteWithCmsConversation");
        bsoeVar.C(X);
        bsoeVar.k(R);
        bsoeVar.h(G);
        bsoeVar.Y(ag);
        bsoeVar.D(H);
        bsoeVar.A(m);
        String ad = bsehVar.ad();
        if (!TextUtils.isEmpty(ad)) {
            bsoeVar.Q(ad);
        }
        bsoeVar.l(csgg.MERGED_FROM_CMS);
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            bsoeVar.Z(bsehVar.x());
        }
        if (this.c.a()) {
            ckte L = bsehVar.L();
            if (!L.equals(ckte.a)) {
                bsoeVar.B(L);
            }
            bsoeVar.j(bsehVar.Q());
        }
        if (!bsoeVar.f(conversationIdType)) {
            throw new cdsk(String.format("Conversation Bugle update failed, conversation id = %s. cms_id = %s", conversationIdType, R));
        }
        if (csgj.a()) {
            this.b.b(eshhVar, conversationIdType.toString(), R, 3);
        }
    }
}
