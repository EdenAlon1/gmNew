package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxr implements apxs {
    public final aptd a;
    public final enhk b;
    public final amfx c;
    public final aoug d;
    private final ffsk e;

    public apxr(ffsk ffskVar, aptd aptdVar, aoug aougVar, enhk enhkVar, amfx amfxVar) {
        ffskVar.getClass();
        aougVar.getClass();
        enhkVar.getClass();
        amfxVar.getClass();
        this.e = ffskVar;
        this.a = aptdVar;
        this.d = aougVar;
        this.b = enhkVar;
        this.c = amfxVar;
    }

    @Override // defpackage.apxs
    public final elfl a(MessageId messageId) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new apxq(this, messageId, null));
        return c;
    }
}
