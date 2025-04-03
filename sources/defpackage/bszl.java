package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bszl extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bszk(this);
    }

    public final void b(String str) {
        aq(new dtrt("emergency_sessions.emergency_destination", 1, String.valueOf(str)));
    }

    public final void c(aplf aplfVar) {
        aq(new dtwe("emergency_sessions.type", 1, Integer.valueOf(aplfVar == null ? 0 : aplfVar.ordinal())));
    }
}
