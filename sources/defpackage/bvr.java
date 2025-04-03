package defpackage;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvr implements bjt {
    final /* synthetic */ buy a;
    final /* synthetic */ bvu b;

    public bvr(bvu bvuVar, buy buyVar) {
        this.b = bvuVar;
        this.a = buyVar;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        if (this.b.j != this.a) {
            return;
        }
        avw.a("AudioSource", "Unable to get input buffer, the BufferProvider could be transitioning to INACTIVE state.");
        if (th instanceof IllegalStateException) {
            return;
        }
        this.b.a(th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cac cacVar = (cac) obj;
        bvu bvuVar = this.b;
        if (!bvuVar.h || bvuVar.j != this.a) {
            cacVar.d();
            return;
        }
        if (bvuVar.k) {
            ksw.c(bvuVar.l > 0);
            if (System.nanoTime() - bvuVar.l >= bvuVar.f) {
                bvu bvuVar2 = this.b;
                ksw.c(bvuVar2.k);
                try {
                    bvuVar2.d.b();
                    avw.a("AudioSource", "Retry start AudioStream succeed");
                    bwo bwoVar = bvuVar2.e;
                    bwoVar.c();
                    bwoVar.a.set(false);
                    bvuVar2.k = false;
                } catch (bvw e) {
                    avw.g("AudioSource", "Retry start AudioStream failed", e);
                    bvuVar2.l = System.nanoTime();
                }
            }
        }
        bvu bvuVar3 = this.b;
        bvy bvyVar = bvuVar3.k ? bvuVar3.e : bvuVar3.d;
        cacVar.c();
        ByteBuffer byteBuffer = cacVar.a;
        bwf bwfVar = (bwf) bvyVar.a(byteBuffer);
        int i = bwfVar.a;
        if (i > 0) {
            bvu bvuVar4 = this.b;
            if (bvuVar4.n) {
                byte[] bArr = bvuVar4.o;
                if (bArr == null || bArr.length < i) {
                    bvuVar4.o = new byte[i];
                }
                int position = byteBuffer.position();
                byteBuffer.put(bvuVar4.o, 0, i);
                byteBuffer.limit(byteBuffer.position()).position(position);
            }
            final bvu bvuVar5 = this.b;
            Executor executor = bvuVar5.i;
            if (executor != null) {
                long j = bwfVar.b;
                if (j - bvuVar5.q >= 200) {
                    bvuVar5.q = j;
                    final bsh bshVar = bvuVar5.t;
                    if (bvuVar5.r == 2) {
                        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
                        double d = eobe.a;
                        while (asShortBuffer.hasRemaining()) {
                            d = Math.max(d, Math.abs((int) asShortBuffer.get()));
                        }
                        bvuVar5.p = d / 32767.0d;
                        if (bshVar != null) {
                            executor.execute(new Runnable() { // from class: bvo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    bvu bvuVar6 = bvu.this;
                                    bshVar.b.X = bvuVar6.p;
                                }
                            });
                        }
                    }
                }
            }
            byteBuffer.limit(byteBuffer.position() + bwfVar.a);
            cacVar.b(TimeUnit.NANOSECONDS.toMicros(bwfVar.b));
            cacVar.e();
        } else {
            avw.f("AudioSource", "Unable to read data from AudioStream.");
            cacVar.d();
        }
        this.b.d();
    }
}
