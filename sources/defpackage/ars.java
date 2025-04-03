package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ars {
    public final List a = DesugarCollections.synchronizedList(new ArrayList());
    private final boolean b;

    public ars(boolean z) {
        this.b = z;
    }

    public final CameraCaptureSession.CaptureCallback a(CameraCaptureSession.CaptureCallback captureCallback) {
        if (!this.b) {
            return captureCallback;
        }
        final arr arrVar = new arr();
        final ListenableFuture listenableFuture = arrVar.a;
        this.a.add(listenableFuture);
        Log.d("RequestMonitor", "RequestListener " + arrVar + " monitoring " + this);
        listenableFuture.b(new Runnable() { // from class: aro
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb = new StringBuilder("RequestListener ");
                sb.append(arrVar);
                sb.append(" done ");
                ars arsVar = ars.this;
                sb.append(arsVar);
                Log.d("RequestMonitor", sb.toString());
                arsVar.a.remove(listenableFuture);
            }
        }, bjb.a());
        return new ahw(Arrays.asList(arrVar, captureCallback));
    }

    public final ListenableFuture b() {
        return this.a.isEmpty() ? bkj.b(null) : bkj.d(bkj.f(bkj.e(new ArrayList(this.a)), new afd() { // from class: arp
            @Override // defpackage.afd
            public final Object a(Object obj) {
                return null;
            }
        }, bjb.a()));
    }

    public final void c() {
        LinkedList linkedList = new LinkedList(this.a);
        while (!linkedList.isEmpty()) {
            ListenableFuture listenableFuture = (ListenableFuture) linkedList.poll();
            listenableFuture.getClass();
            listenableFuture.cancel(true);
        }
    }
}
