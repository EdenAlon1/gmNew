package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rou {
    private volatile boolean a;

    public final void a() {
        this.a = true;
    }

    public final void b() {
        if (this.a) {
            throw new IOException("Stream is closed");
        }
    }
}
