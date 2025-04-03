package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.messaging.lighter.ui.overlay.OverlayView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadi {
    private static final eade f = new eade() { // from class: eadf
        @Override // defpackage.eade
        public final void a() {
        }
    };
    public final OverlayView a;
    public final dzxh b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Runnable d = new eadh(this);
    public eade e = f;

    public eadi(OverlayView overlayView, dzxh dzxhVar) {
        this.b = dzxhVar;
        this.a = overlayView;
    }

    public final void a() {
        this.a.setVisibility(8);
        this.e.a();
    }
}
