package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsk extends dgxx {
    public dfsk() {
        super(Looper.getMainLooper());
    }

    public final void a(dfrm dfrmVar, dfrl dfrlVar) {
        ThreadLocal threadLocal = BasePendingResult.b;
        sendMessage(obtainMessage(1, new Pair(dfrmVar, dfrlVar)));
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                ((BasePendingResult) message.obj).j(Status.d);
                return;
            }
            Log.wtf("BasePendingResult", "Don't know how to handle message: " + message.what, new Exception());
            return;
        }
        Pair pair = (Pair) message.obj;
        dfrm dfrmVar = (dfrm) pair.first;
        dfrl dfrlVar = (dfrl) pair.second;
        try {
            dfrmVar.a(dfrlVar);
        } catch (RuntimeException e) {
            BasePendingResult.k(dfrlVar);
            throw e;
        }
    }

    public dfsk(Looper looper) {
        super(looper);
    }
}
