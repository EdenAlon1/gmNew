package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhul implements dhuj {
    public static final AtomicInteger a = new AtomicInteger(0);
    public final Context b;
    public final GlobalState c;
    public final Object d = new Object();
    public BroadcastReceiver e;

    public dhul(Context context, GlobalState globalState) {
        this.b = context;
        this.c = globalState;
    }

    public final String toString() {
        String str;
        synchronized (this.d) {
            str = "TimeSignalResultReceiverImpl{globalState=" + this.c.toString() + ", timeSignalReceiver=" + String.valueOf(this.e) + "}";
        }
        return str;
    }
}
