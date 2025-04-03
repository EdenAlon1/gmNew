package defpackage;

import android.util.Log;
import org.chromium.net.impl.CronetUploadDataStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiik implements Runnable {
    final /* synthetic */ CronetUploadDataStream a;

    public fiik(CronetUploadDataStream cronetUploadDataStream) {
        this.a = cronetUploadDataStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a();
            this.a.b.close();
        } catch (Exception e) {
            Log.e("cn_".concat(String.valueOf(CronetUploadDataStream.a)), "Exception thrown when closing", e);
        }
    }
}
