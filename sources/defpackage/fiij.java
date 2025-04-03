package defpackage;

import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiij implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fiij(CronetUploadDataStream cronetUploadDataStream) {
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
            this.a.j = 1;
            try {
                this.a.a();
                CronetUploadDataStream cronetUploadDataStream2 = this.a;
                cronetUploadDataStream2.b.rewind(cronetUploadDataStream2);
            } catch (Exception e) {
                this.a.b(e);
            }
        }
    }
}
