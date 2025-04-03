package defpackage;

import android.os.AsyncTask;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exlf extends AsyncTask {
    final /* synthetic */ exlg a;

    public exlf(exlg exlgVar) {
        this.a = exlgVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        ByteBuffer byteBuffer = (ByteBuffer) objArr[0];
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr, 0, byteBuffer.limit());
        this.a.f.c(bArr, ((Long) objArr[1]).longValue());
        synchronized (this.a.b) {
            r0.c--;
            this.a.b.notifyAll();
        }
        return null;
    }
}
