package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abof {
    public final ConversationId a;
    public final ffbr b;
    public final aigz c;
    private final ffsk d;
    private final ffbr e;
    private final ffxx f;

    public abof(ffsk ffskVar, ffbr ffbrVar, ffxx ffxxVar, ffxx ffxxVar2, ConversationId conversationId, abol abolVar, ablw ablwVar, ffbr ffbrVar2, aigz aigzVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        conversationId.getClass();
        ffbrVar2.getClass();
        aigzVar.getClass();
        this.d = ffskVar;
        this.e = ffbrVar;
        this.f = ffxxVar2;
        this.a = conversationId;
        this.b = ffbrVar2;
        this.c = aigzVar;
        ffxx a = axrb.a(abolVar.a, "ActionsUiAdapter");
        abmg abmgVar = (abmg) ablwVar;
        fgdj c = axrb.c(abmgVar.g, "BackBehaviorUiData");
        fgdj c2 = axrb.c(abmgVar.h, "BackBehaviorOverrideSystemBack");
        ffxx a2 = axrb.a(new aboe(ffxxVar), "Recipient");
        ffxx a3 = axrb.a(ffxxVar2, "RecipientBusinessInfo");
        long j = ffpw.a;
        Object b = ffbrVar.b();
        b.getClass();
        ffxx a4 = axsp.a(a, c, c2, a2, a3, ffskVar, ffpy.e(((Number) b).longValue(), ffpz.c), new abob(this, null));
        int i = fgcz.a;
        fgbn.b(a4, ffskVar, fgcy.a(0L, 3), null);
    }
}
