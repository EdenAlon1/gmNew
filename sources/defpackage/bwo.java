package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwo implements bvy {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public long c;
    public Executor d;
    public bvs e;
    private final int f;
    private final int g;
    private byte[] h;

    public bwo(bve bveVar) {
        this.f = bveVar.c();
        this.g = bveVar.e();
    }

    @Override // defpackage.bvy
    public final bvx a(ByteBuffer byteBuffer) {
        c();
        ksw.d(this.a.get(), "AudioStream has not been started.");
        long remaining = byteBuffer.remaining();
        int i = this.f;
        long j = i;
        boolean z = j > 0;
        long b = bwc.b(remaining, i);
        ksw.b(z, "bytesPerFrame must be greater than 0.");
        int i2 = (int) (j * b);
        if (i2 <= 0) {
            return new bwf(0, this.c);
        }
        long a = this.c + bwc.a(b, this.g);
        long nanoTime = a - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException e) {
                avw.g("SilentAudioStream", "Ignore interruption", e);
            }
        }
        ksw.c(i2 <= byteBuffer.remaining());
        byte[] bArr = this.h;
        if (bArr == null || bArr.length < i2) {
            this.h = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.h, 0, i2).limit(position + i2).position(position);
        bwf bwfVar = new bwf(i2, this.c);
        this.c = a;
        return bwfVar;
    }

    @Override // defpackage.bvy
    public final void b() {
        throw null;
    }

    public final void c() {
        ksw.d(!this.b.get(), "AudioStream has been released.");
    }
}
