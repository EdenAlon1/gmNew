package defpackage;

import android.util.LruCache;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcv {
    public final cqvy a;
    public final ffsk b;
    public final LruCache c;
    public final LruCache d;

    public apcv(cqvy cqvyVar, ffsk ffskVar) {
        cqvyVar.getClass();
        ffskVar.getClass();
        this.a = cqvyVar;
        this.b = ffskVar;
        this.c = new LruCache(30);
        this.d = new LruCache(30);
    }

    public final void a(MessageId messageId) {
        if (this.d.get(messageId) == null) {
            synchronized (this.c) {
                if (this.c.get(messageId) == null) {
                    this.c.put(messageId, true);
                }
            }
        }
    }
}
