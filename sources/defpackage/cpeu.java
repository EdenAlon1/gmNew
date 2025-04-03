package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cpeu {
    SEND_BUTTON_ACCURATE(new ecda("MLA::pressButton")),
    NOTIFICATION(new ecda("MLA::notification")),
    TACHYGRAM_FINISHED_SENDING(new ecda("MLA::tachygramFinishedSending")),
    TICKLE_ARRIVED(new ecda("MLA::tickle")),
    TACHYGRAM_MESSAGE_ARRIVED(new ecda("MLA::tachygramArrived"));

    final ecda f;

    cpeu(ecda ecdaVar) {
        this.f = ecdaVar;
    }
}
