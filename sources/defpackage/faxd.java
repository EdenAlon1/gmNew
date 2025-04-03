package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class faxd extends UploadDataProvider {
    public faxc b;
    public final long c;
    private final ExecutorService f;
    private final favp g;
    private final dlpw h;
    private final boolean j;
    private long l;
    public int d = 0;
    public int e = 0;
    private int k = 0;
    public final AtomicLong a = new AtomicLong(0);
    private final byte[] i = new byte[65536];

    public faxd(ExecutorService executorService, favp favpVar, dlpw dlpwVar) {
        this.f = executorService;
        this.g = favpVar;
        this.h = dlpwVar;
        this.l = dlpwVar.a();
        boolean z = favpVar.e() == -1;
        this.j = z;
        this.c = z ? 0L : favpVar.e() - favpVar.d();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        if (this.j) {
            return -1L;
        }
        favp favpVar = this.g;
        long e = favpVar.e() - favpVar.d();
        favp favpVar2 = this.g;
        return Math.min(e, (favpVar2.b() + favpVar2.c()) - favpVar2.d());
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        boolean z = false;
        int a = this.g.a(this.i, 0, Math.min(65536, byteBuffer.capacity()));
        if (a > 0) {
            byteBuffer.put(this.i, 0, a);
            int i = this.k + a;
            this.k = i;
            if (i >= this.d) {
                if (this.e > 0) {
                    long a2 = this.h.a();
                    if (a2 - this.l >= this.e) {
                        this.l = a2;
                    }
                }
                this.a.getAndAdd(this.k);
                faxc faxcVar = this.b;
                if (faxcVar != null) {
                    this.f.execute(faxcVar);
                }
                this.k = 0;
            }
        }
        if (this.j && !this.g.i()) {
            z = true;
        }
        uploadDataSink.onReadSucceeded(z);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.g.h();
        uploadDataSink.onRewindSucceeded();
    }
}
