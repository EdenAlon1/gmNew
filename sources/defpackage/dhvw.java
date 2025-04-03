package defpackage;

import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.libraries.barhopper.Barcode;
import com.google.android.libraries.barhopper.Barhopper;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhvw implements Runnable {
    public dhwb a;
    public long d;
    public ByteBuffer f;
    final /* synthetic */ dhvy g;
    public final long b = SystemClock.elapsedRealtime();
    public final Object c = new Object();
    private boolean h = true;
    public int e = 0;

    public dhvw(dhvy dhvyVar, dhwb dhwbVar) {
        this.g = dhvyVar;
        this.a = dhwbVar;
    }

    public final void a(boolean z) {
        synchronized (this.c) {
            this.h = z;
            this.c.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        SparseArray sparseArray;
        while (true) {
            synchronized (this.c) {
                while (this.h) {
                    ByteBuffer byteBuffer = this.f;
                    if (byteBuffer == null) {
                        try {
                            this.c.wait();
                        } catch (InterruptedException e) {
                            Log.d("CameraSource", "Frame processing loop terminated.", e);
                            return;
                        }
                    } else {
                        dhwc dhwcVar = new dhwc();
                        dfvd dfvdVar = this.g.e;
                        int i = dfvdVar.a;
                        int i2 = dfvdVar.b;
                        if (byteBuffer.capacity() < i * i2) {
                            throw new IllegalArgumentException("Invalid image data size.");
                        }
                        dhwcVar.a = i;
                        dhwcVar.b = i2;
                        dhwcVar.f = 17;
                        dhwcVar.c = this.e;
                        dhwcVar.d = this.d;
                        dhwcVar.e = this.g.d;
                        ByteBuffer byteBuffer2 = this.f;
                        this.f = null;
                        try {
                            dhwb dhwbVar = this.a;
                            dfwv.n(dhwbVar);
                            dhwc dhwcVar2 = new dhwc(dhwcVar);
                            if (dhwcVar2.e % 2 != 0) {
                                int i3 = dhwcVar2.a;
                                dhwcVar2.a = dhwcVar2.b;
                                dhwcVar2.b = i3;
                            }
                            dhwcVar2.e = 0;
                            Barcode[] recognize = Barhopper.recognize(dhwcVar.a, dhwcVar.b, byteBuffer.array(), ((dbrs) dhwbVar).a);
                            if (recognize == null) {
                                csjy.n("Bugle", "Invalid QR detector frame. Check logcat output for info.");
                                sparseArray = ((dbrs) dhwbVar).b;
                            } else {
                                int length = recognize.length;
                                if (length == 0) {
                                    sparseArray = ((dbrs) dhwbVar).b;
                                } else {
                                    SparseArray sparseArray2 = new SparseArray(length);
                                    for (Barcode barcode : recognize) {
                                        sparseArray2.append(barcode.rawValue.hashCode(), barcode);
                                    }
                                    sparseArray = sparseArray2;
                                }
                            }
                            dhvz dhvzVar = new dhvz(sparseArray);
                            synchronized (dhwbVar.c) {
                                dhwa dhwaVar = dhwbVar.d;
                                if (dhwaVar == null) {
                                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                                }
                                dhwaVar.a(dhvzVar);
                            }
                        } catch (Exception e2) {
                            Log.e("CameraSource", "Exception thrown from receiver.", e2);
                        } finally {
                            Camera camera = this.g.c;
                            dfwv.n(camera);
                            dfwv.n(byteBuffer2);
                            camera.addCallbackBuffer(byteBuffer2.array());
                        }
                    }
                }
                return;
            }
        }
    }
}
