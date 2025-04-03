package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jip implements ScrollCaptureCallback {
    public final jjw a;
    public final jiu b;
    public final jiy c;
    private final kac d;
    private final View e;
    private final ffsk f;

    public jip(jjw jjwVar, kac kacVar, ffsk ffskVar, jiy jiyVar, View view) {
        this.a = jjwVar;
        this.d = kacVar;
        this.c = jiyVar;
        this.e = view;
        this.f = ffsl.d(ffskVar, jis.a);
        this.b = new jiu(kacVar.a(), new jio(this, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.ScrollCaptureSession r11, defpackage.kac r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.a(android.view.ScrollCaptureSession, kac, ffgu):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        ffqy.d(this.f, ffuw.a, null, new jik(this, runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        final ffud d = ffqy.d(this.f, null, null, new jil(this, scrollCaptureSession, rect, consumer, null), 3);
        d.hZ(new jir(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: jiq
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                ffud.this.t(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(icz.b(this.d));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.b.b = 0.0f;
        this.c.a(true);
        runnable.run();
    }
}
