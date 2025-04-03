package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcs implements amlb {
    public final aleq a;
    public final ctvs b;
    public final akvz c;
    private final ffsk d;
    private final cqor e;

    public xcs(ffsk ffskVar, aleq aleqVar, ctvs ctvsVar, akvz akvzVar) {
        ffskVar.getClass();
        aleqVar.getClass();
        ctvsVar.getClass();
        akvzVar.getClass();
        this.d = ffskVar;
        this.a = aleqVar;
        this.b = ctvsVar;
        this.c = akvzVar;
        this.e = new cqoq("GilMetadataOpenConversationListener::onConversationOpened");
    }

    @Override // defpackage.amlb
    public final ekzz a() {
        return this.e.a();
    }

    @Override // defpackage.amlb
    public final elfl b(BugleConversation bugleConversation, alxk alxkVar) {
        alxkVar.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.d, ekxi.a(ffheVar), ffsmVar, new xcr(null, bugleConversation, this)));
    }
}
