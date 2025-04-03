package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrd {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public amrd(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
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
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
    }

    public final EmergencyConversation a(BugleConversation bugleConversation) {
        ffsk ffskVar = (ffsk) this.a.b();
        ffskVar.getClass();
        aqgc aqgcVar = (aqgc) this.b.b();
        aqgcVar.getClass();
        aprl aprlVar = (aprl) this.c.b();
        aprlVar.getClass();
        amrq amrqVar = (amrq) this.d.b();
        amrqVar.getClass();
        aple apleVar = (aple) this.g.b();
        apleVar.getClass();
        return new EmergencyConversation(ffskVar, aqgcVar, aprlVar, amrqVar, this.e, this.f, apleVar, bugleConversation);
    }
}
