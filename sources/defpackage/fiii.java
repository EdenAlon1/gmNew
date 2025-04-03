package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiii implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fiii(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.h) {
            CronetUploadDataStream cronetUploadDataStream = this.a;
            if (cronetUploadDataStream.i == 0) {
                return;
            }
            cronetUploadDataStream.e(3);
            CronetUploadDataStream cronetUploadDataStream2 = this.a;
            if (cronetUploadDataStream2.g == null) {
                throw new IllegalStateException("Unexpected readData call. Buffer is null");
            }
            cronetUploadDataStream2.j = 0;
            try {
                this.a.a();
                CronetUploadDataStream cronetUploadDataStream3 = this.a;
                cronetUploadDataStream3.b.read(cronetUploadDataStream3, cronetUploadDataStream3.g);
                this.a.f.incrementAndGet();
            } catch (Exception e) {
                this.a.b(e);
            }
        }
    }
}
