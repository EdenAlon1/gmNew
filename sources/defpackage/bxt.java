package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface bxt extends AutoCloseable {
    long a();

    long b();

    MediaCodec.BufferInfo c();

    @Override // java.lang.AutoCloseable
    void close();

    ByteBuffer d();

    boolean e();
}
