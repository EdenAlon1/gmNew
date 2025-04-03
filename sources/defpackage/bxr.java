package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxr implements bxt {
    private final ByteBuffer a;
    private final MediaCodec.BufferInfo b;
    private final kfb c;

    public bxr(bxt bxtVar) {
        bxv bxvVar = (bxv) bxtVar;
        MediaCodec.BufferInfo bufferInfo = bxvVar.a;
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        this.b = bufferInfo2;
        ByteBuffer d = bxtVar.d();
        MediaCodec.BufferInfo bufferInfo3 = bxvVar.a;
        d.position(bufferInfo3.offset);
        d.limit(bufferInfo3.offset + bufferInfo3.size);
        ByteBuffer allocate = ByteBuffer.allocate(bufferInfo3.size);
        allocate.order(d.order());
        allocate.put(d);
        allocate.flip();
        this.a = allocate;
        final AtomicReference atomicReference = new AtomicReference();
        kfg.a(new kfd() { // from class: bxq
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                atomicReference.set(kfbVar);
                return "Data closed";
            }
        });
        kfb kfbVar = (kfb) atomicReference.get();
        ksw.h(kfbVar);
        this.c = kfbVar;
    }

    @Override // defpackage.bxt
    public final long a() {
        return this.b.presentationTimeUs;
    }

    @Override // defpackage.bxt
    public final long b() {
        return this.b.size;
    }

    @Override // defpackage.bxt
    public final MediaCodec.BufferInfo c() {
        return this.b;
    }

    @Override // defpackage.bxt, java.lang.AutoCloseable
    public final void close() {
        this.c.b(null);
    }

    @Override // defpackage.bxt
    public final ByteBuffer d() {
        return this.a;
    }

    @Override // defpackage.bxt
    public final boolean e() {
        throw null;
    }
}
