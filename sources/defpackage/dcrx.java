package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrx extends cxpz {
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ dcry d;

    public dcrx(dcry dcryVar, int i, View view) {
        this.b = i;
        this.c = view;
        this.d = dcryVar;
    }

    @Override // defpackage.cxpz
    public final void a() {
        dcry dcryVar = this.d;
        int i = this.b;
        if (i == dcryVar.e) {
            return;
        }
        dcryVar.f = i;
        dcryVar.a.au(i);
    }

    @Override // defpackage.cxpz, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        this.c.performHapticFeedback(0);
    }

    @Override // defpackage.cxpz
    public final void b() {
    }
}
