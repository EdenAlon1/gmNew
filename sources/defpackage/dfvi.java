package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfvi extends dgxx {
    final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfvi(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
    }

    private static final void a(Message message) {
        dfvj dfvjVar = (dfvj) message.obj;
        dfvjVar.b();
        dfvjVar.f();
    }

    private static final boolean c(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj;
        if (this.a.r.get() != message.arg1) {
            if (c(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !this.a.q()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            this.a.o = new ConnectionResult(message.arg2);
            BaseGmsClient baseGmsClient = this.a;
            if (!baseGmsClient.p && !TextUtils.isEmpty(baseGmsClient.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.c());
                    BaseGmsClient baseGmsClient2 = this.a;
                    if (!baseGmsClient2.p) {
                        baseGmsClient2.gJ(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = this.a.o;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8);
            }
            this.a.i.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            ConnectionResult connectionResult2 = this.a.o;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8);
            }
            this.a.i.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.i.a(new ConnectionResult(message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            this.a.gJ(5, null);
            dfwa dfwaVar = this.a.s;
            if (dfwaVar != null) {
                dfwaVar.a.onConnectionSuspended(message.arg2);
            }
            BaseGmsClient baseGmsClient3 = this.a;
            int i = message.arg2;
            baseGmsClient3.L();
            this.a.F(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.p()) {
            a(message);
            return;
        }
        if (!c(message)) {
            Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        dfvj dfvjVar = (dfvj) message.obj;
        synchronized (dfvjVar) {
            obj = dfvjVar.d;
            if (dfvjVar.e) {
                Log.w("GmsClient", a.b(dfvjVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            dfvjVar.d();
        }
        synchronized (dfvjVar) {
            dfvjVar.e = true;
        }
        dfvjVar.f();
    }
}
