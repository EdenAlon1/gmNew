package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgii implements awmk {
    public final aqkp a;
    public final alxl b;
    public final ejvp c;
    public final ffbr d;
    private final ffsk e;
    private final cghm f;

    public cgii(cghm cghmVar, ffsk ffskVar, aqkp aqkpVar, alxl alxlVar, ejvp ejvpVar, ffbr ffbrVar) {
        cghmVar.getClass();
        ffskVar.getClass();
        aqkpVar.getClass();
        alxlVar.getClass();
        ejvpVar.getClass();
        ffbrVar.getClass();
        this.f = cghmVar;
        this.e = ffskVar;
        this.a = aqkpVar;
        this.b = alxlVar;
        this.c = ejvpVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.awmk
    public final elfl a(awui awuiVar, ConversationIdType conversationIdType, awws awwsVar) {
        elfl c;
        awuiVar.getClass();
        awwsVar.getClass();
        if (this.f.b() && awwsVar.b.size() + awwsVar.c.size() > 0) {
            c = axol.c(this.e, ffhe.a, ffsm.a, new cgih(this, conversationIdType, null));
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
