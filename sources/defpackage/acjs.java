package defpackage;

import android.content.Intent;
import android.content.ServiceConnection;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acjs implements Closeable {
    final /* synthetic */ acjw a;
    private final ServiceConnection b;

    public acjs(acjw acjwVar, Intent intent, ServiceConnection serviceConnection) {
        this.a = acjwVar;
        this.b = serviceConnection;
        acjwVar.b.bindService(intent, serviceConnection, 20);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.b.unbindService(this.b);
    }
}
