package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buob extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new buoa(this);
    }

    public final void b(String str) {
        aq(new dtrt("message_status.message_id", 1, String.valueOf(str)));
    }

    public final void c(long j) {
        aq(new dtwe("message_status.timestamp", 8, Long.valueOf(j)));
    }
}
