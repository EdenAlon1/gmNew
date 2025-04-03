package defpackage;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvv implements Camera.PreviewCallback {
    final /* synthetic */ dhvy a;

    public dhvv(dhvy dhvyVar) {
        this.a = dhvyVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        dhvw dhvwVar = this.a.i;
        synchronized (dhvwVar.c) {
            ByteBuffer byteBuffer = dhvwVar.f;
            if (byteBuffer != null) {
                camera.addCallbackBuffer(byteBuffer.array());
                dhvwVar.f = null;
            }
            if (!dhvwVar.g.j.containsKey(bArr)) {
                Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                return;
            }
            dhvwVar.d = SystemClock.elapsedRealtime() - dhvwVar.b;
            dhvwVar.e++;
            dhvwVar.f = (ByteBuffer) dhvwVar.g.j.get(bArr);
            dhvwVar.c.notifyAll();
        }
    }
}
