package defpackage;

import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface awy extends Closeable {
    int a();

    Size b();

    Surface c(Executor executor, ksp kspVar);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d(float[] fArr, float[] fArr2);
}
