package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csom extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ cson b;

    public csom(cson csonVar, Consumer consumer) {
        this.a = consumer;
        this.b = csonVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(final ServiceState serviceState) {
        ekzm b = this.b.c.b("onServiceStateChanged");
        try {
            final Consumer consumer = this.a;
            axnw.h(elfo.f(new Runnable() { // from class: csol
                @Override // java.lang.Runnable
                public final void run() {
                    cson csonVar = csom.this.b;
                    consumer.accept(csonVar.e.a(serviceState, csonVar.f));
                }
            }, this.b.b));
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
