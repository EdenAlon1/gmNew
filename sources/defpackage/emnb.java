package defpackage;

import com.google.chat.smartmessaging.smartreply.android.models.assistant.IntentClassifierJni;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnb extends IntentClassifierJni {
    public final AtomicLong a;

    public emnb(long j) {
        this.a = new AtomicLong(j);
    }

    protected final void finalize() {
        long andSet = this.a.getAndSet(0L);
        if (andSet != 0) {
            IntentClassifierJni.nativeDestroy(andSet);
        }
    }
}
