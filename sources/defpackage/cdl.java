package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdl extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ cdm a;

    public cdl(cdm cdmVar) {
        this.a = cdmVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        motionEvent.getClass();
        this.a.m = motionEvent.getX();
        cdm cdmVar = this.a;
        cdmVar.n = motionEvent.getY();
        cdmVar.o = 1;
        return true;
    }
}
