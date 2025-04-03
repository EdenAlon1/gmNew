package defpackage;

import android.os.CountDownTimer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efof extends CountDownTimer {
    final /* synthetic */ fagu a;
    final /* synthetic */ efog b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efof(efog efogVar, long j, fagu faguVar) {
        super(j, 100L);
        this.a = faguVar;
        this.b = efogVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        efog efogVar = this.b;
        efogVar.e.b(efogVar.j(this.a));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }
}
