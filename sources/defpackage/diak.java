package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class diak extends dgxx {
    final /* synthetic */ diay a;
    private boolean b;
    private final diaj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diak(diay diayVar, Looper looper) {
        super(looper);
        this.a = diayVar;
        this.c = new diaj();
    }

    private final synchronized void c() {
        if (this.b) {
            return;
        }
        if (Log.isLoggable("WearableLS", 2)) {
            Log.v("WearableLS", "bindService: ".concat(String.valueOf(String.valueOf(this.a.F))));
        }
        diay diayVar = this.a;
        diayVar.bindService(diayVar.H, this.c, 1);
        this.b = true;
    }

    public final synchronized void a(String str) {
        if (this.b) {
            if (Log.isLoggable("WearableLS", 2)) {
                Log.v("WearableLS", "unbindService: " + str + ", " + String.valueOf(this.a.F));
            }
            try {
                this.a.unbindService(this.c);
            } catch (RuntimeException e) {
                Log.e("WearableLS", "Exception when unbinding from local service", e);
            }
            this.b = false;
        }
    }

    @Override // defpackage.dgxx
    protected final void b(Message message) {
        c();
        try {
            super.b(message);
            if (hasMessages(0)) {
                return;
            }
            a("dispatch");
        } catch (Throwable th) {
            if (!hasMessages(0)) {
                a("dispatch");
            }
            throw th;
        }
    }
}
