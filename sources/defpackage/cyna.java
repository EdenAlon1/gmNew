package defpackage;

import android.view.ScaleGestureDetector;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyna extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public float a = 1.0f;
    private final fazb b;

    public cyna(fazb fazbVar) {
        this.b = fazbVar;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(final ScaleGestureDetector scaleGestureDetector) {
        super.onScale(scaleGestureDetector);
        ((Optional) this.b.b()).ifPresent(new Consumer() { // from class: cymz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).j(scaleGestureDetector.getScaleFactor() - cyna.this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a = scaleGestureDetector.getScaleFactor();
        return false;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.a = 1.0f;
        super.onScaleEnd(scaleGestureDetector);
    }
}
