package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lkx extends Service implements lkr {
    private final lmj a = new lmj(this);

    @Override // defpackage.lkr
    public final lkk P() {
        return this.a.a;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        intent.getClass();
        this.a.a(lki.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.a.a(lki.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        lmj lmjVar = this.a;
        lmjVar.a(lki.ON_STOP);
        lmjVar.a(lki.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @ffbs
    public final void onStart(Intent intent, int i) {
        this.a.a(lki.ON_START);
        super.onStart(intent, i);
    }
}
