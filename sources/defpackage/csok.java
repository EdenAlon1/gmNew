package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csok extends PhoneStateListener {
    final /* synthetic */ Consumer a;
    final /* synthetic */ cson b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csok(cson csonVar, Executor executor, Consumer consumer) {
        super(executor);
        this.a = consumer;
        this.b = csonVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        ekzm b = this.b.c.b("onServiceStateChanged");
        try {
            Consumer consumer = this.a;
            cson csonVar = this.b;
            consumer.accept(csonVar.e.a(serviceState, csonVar.f));
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
