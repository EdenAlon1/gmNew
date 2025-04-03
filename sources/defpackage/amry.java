package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amry {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public amry(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
    }

    public final EmergencySosConversation a(BugleConversation bugleConversation) {
        aqgc aqgcVar = (aqgc) this.a.b();
        aqgcVar.getClass();
        amsd amsdVar = (amsd) this.b.b();
        amsdVar.getClass();
        apli apliVar = (apli) this.d.b();
        apliVar.getClass();
        bugleConversation.getClass();
        return new EmergencySosConversation(aqgcVar, amsdVar, this.c, apliVar, this.e, bugleConversation);
    }
}
