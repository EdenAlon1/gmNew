package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coit extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new cois(this);
    }

    public final void b(dtzj dtzjVar) {
        aq(new dtru("scheduled_send.conversation_id", 1, dtzjVar));
    }

    public final void c(String str) {
        aq(new dtrt("scheduled_send._id", 1, str));
    }

    public final void d(coiu coiuVar) {
        aq(new dtwe("scheduled_send.status", 1, Integer.valueOf(coiuVar == null ? 0 : coiuVar.ordinal())));
    }
}
