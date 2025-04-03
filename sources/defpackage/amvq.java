package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvq {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public amvq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    public final PenpalBotConversation a(BugleConversation bugleConversation, alxl alxlVar) {
        aqgc aqgcVar = (aqgc) this.a.b();
        aqgcVar.getClass();
        amvy amvyVar = (amvy) this.b.b();
        amvyVar.getClass();
        amvu amvuVar = (amvu) this.c.b();
        amvuVar.getClass();
        bugleConversation.getClass();
        alxlVar.getClass();
        return new PenpalBotConversation(aqgcVar, amvyVar, amvuVar, bugleConversation, alxlVar);
    }
}
