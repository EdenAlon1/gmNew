package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caan implements awrh {
    public static final entd a = entd.c("BugleDataModel");
    public final avtx b;
    public final cadg c;
    public final cadh d;
    public final awso e;
    public final bzqa f;
    public final akzt g;
    public final ffbr h;
    public final ffbr i;
    public final errl j;
    public final errl k;
    public final ffbr l;

    public caan(avtx avtxVar, cadg cadgVar, cadh cadhVar, awso awsoVar, bzqa bzqaVar, akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3) {
        this.b = avtxVar;
        this.c = cadgVar;
        this.d = cadhVar;
        this.e = awsoVar;
        this.f = bzqaVar;
        this.g = akztVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = errlVar;
        this.k = errlVar2;
        this.l = ffbrVar3;
    }

    @Override // defpackage.awrh
    public final elfl a(awrj awrjVar) {
        throw null;
    }

    public final void b(bdhg bdhgVar, awrj awrjVar, boolean z, boolean z2) {
        awxk awxkVar = ((awnu) awrjVar).a;
        awuh awuhVar = awuh.GROUP;
        awui awuiVar = awxkVar.g;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuh b = awuh.b(awuiVar.c);
        if (b == null) {
            b = awuh.UNKNOWN_TYPE;
        }
        boolean equals = awuhVar.equals(b);
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.f, bdhgVar);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSinglePartIncomingChatMessageProcessor", "logHandlingAsUnencryptedMessage", 233, "EtouffeeSinglePartIncomingChatMessageProcessor.java")).K("[Chat API] Incoming Etouffee message, but Message will be processed as a basic text. isReceiveEtouffeeEnabled: %b, isE2eeProvisioned: %b, inGroup: %b, isGroupEtouffeeEnabled: %b.", Boolean.valueOf(bzwd.d()), Boolean.valueOf(z), Boolean.valueOf(equals), Boolean.valueOf(z2));
        if (equals && !z2) {
            ((bzzi) this.h.b()).c(bdhgVar, 45);
            return;
        }
        if (!bzwd.d()) {
            ((bzzi) this.h.b()).c(bdhgVar, 15);
            this.g.e("Bugle.Etouffee.DecryptionAborted.Reason", bzwg.ETOUFFEE_DISABLED.y);
        } else {
            if (z) {
                return;
            }
            ((bzzi) this.h.b()).c(bdhgVar, 17);
        }
    }
}
