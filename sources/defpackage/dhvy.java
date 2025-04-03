package defpackage;

import android.content.Context;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.IdentityHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dhvy {
    public Context a;
    public Camera c;
    public int d;
    public dfvd e;
    public String g;
    public Thread h;
    public dhvw i;
    public final Object b = new Object();
    public boolean f = false;
    public final IdentityHashMap j = new IdentityHashMap();

    public final void a() {
        synchronized (this.b) {
            b();
            dhvw dhvwVar = this.i;
            dhwb dhwbVar = dhvwVar.a;
            if (dhwbVar != null) {
                synchronized (dhwbVar.c) {
                    if (dhwbVar.d != null) {
                        dhwbVar.d = null;
                    }
                }
                dhvwVar.a = null;
            }
        }
    }

    public final void b() {
        synchronized (this.b) {
            this.i.a(false);
            Thread thread = this.h;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.h = null;
            }
            Camera camera = this.c;
            if (camera != null) {
                camera.stopPreview();
                this.c.setPreviewCallbackWithBuffer(null);
                try {
                    this.c.setPreviewTexture(null);
                    this.c.setPreviewDisplay(null);
                } catch (Exception e) {
                    Log.e("CameraSource", a.G(e, "Failed to clear camera preview: "));
                }
                Camera camera2 = this.c;
                dfwv.n(camera2);
                camera2.release();
                this.c = null;
            }
            this.j.clear();
        }
    }

    public final byte[] c(dfvd dfvdVar) {
        byte[] bArr = new byte[((int) Math.ceil(((dfvdVar.b * dfvdVar.a) * ImageFormat.getBitsPerPixel(17)) / 8.0d)) + 1];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.j.put(bArr, wrap);
        return bArr;
    }
}
