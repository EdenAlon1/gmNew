package defpackage;

import android.os.Bundle;
import android.os.ResultReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dedc extends ResultReceiver {
    final /* synthetic */ dede a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dedc(dede dedeVar) {
        super(null);
        this.a = dedeVar;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == 2 || i == 0) {
            cslq.b(new Runnable() { // from class: deda
                @Override // java.lang.Runnable
                public final void run() {
                    dedc.this.a.f(true);
                }
            });
            return;
        }
        if (i == 3 || i == 1) {
            cslq.b(new Runnable() { // from class: dedb
                @Override // java.lang.Runnable
                public final void run() {
                    dedc.this.a.f(false);
                }
            });
            return;
        }
        csjb b = dede.a.b();
        b.I("Received unexpected IME operation result:");
        b.G(i);
        b.r();
    }
}
