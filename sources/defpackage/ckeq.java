package defpackage;

import android.net.Uri;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckeq {
    private final Lock a = new ReentrantLock();

    public final Uri a(emyl emylVar) {
        this.a.lock();
        try {
            return (Uri) emylVar.get();
        } finally {
            this.a.unlock();
        }
    }
}
