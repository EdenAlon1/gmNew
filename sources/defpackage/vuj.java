package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vuj implements bcvm {
    final /* synthetic */ vvn a;

    public vuj(vvn vvnVar) {
        this.a = vvnVar;
    }

    @Override // defpackage.bcvm
    public final void b(bcvr bcvrVar, int i) {
        if (!this.a.N.aJ() && (i & 1) == 1 && bcyp.a(bcvrVar) && bcvrVar.u.isEmpty()) {
            if (bcvrVar.af()) {
                bcvrVar.K(false);
            }
            this.a.au(bcvrVar);
        }
    }

    @Override // defpackage.bcvm
    public final void fs() {
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$29", "onDraftAttachmentLoadFailed", 5018, "ConversationFragmentPeer.java")).q("ConversationFragment: Failed to load an attachment while trying to send message.");
    }

    @Override // defpackage.bcvm
    public final void fv(bcvr bcvrVar) {
        ensk j = vvn.a.j();
        j.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$29", "onDraftAttachmentLimitReached", 5008, "ConversationFragmentPeer.java")).q("ConversationFragment: Trying to send too many attachments! Attachments will be truncated.");
    }

    @Override // defpackage.bcvm
    public final void ft(bcvr bcvrVar) {
    }
}
