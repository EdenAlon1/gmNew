package defpackage;

import android.media.ImageWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aoe {
    public ImageWriter a;
    public final AtomicBoolean b = new AtomicBoolean(true);
    public final Executor c;

    public aoe(Executor executor) {
        this.c = executor;
    }

    public final void a() {
        this.b.set(false);
    }
}
