package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxcs extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bxcr(this);
    }

    public final void b(dtzj dtzjVar) {
        int intValue = bxct.e().intValue();
        if (intValue < 35070) {
            dtub.w("conversation_id", intValue);
        }
        aq(new dtru("reminders.conversation_id", 1, dtzjVar));
    }

    public final void c(String str) {
        aq(new dtrt("reminders._id", 1, String.valueOf(str)));
    }

    public final void d(byzf byzfVar) {
        aq(new dtwe("reminders.status", 1, Integer.valueOf(byzfVar == null ? 0 : byzfVar.ordinal())));
    }

    public final void e(long j) {
        aq(new dtwe("reminders.trigger_time", 8, Long.valueOf(j)));
    }
}
