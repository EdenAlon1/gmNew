package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aak {
    public final float a;
    public final float b;
    public final int c;
    private final float d;

    public aak(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        backEvent.getClass();
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        this.d = touchX;
        this.a = touchY;
        this.b = progress;
        this.c = swipeEdge;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.d + ", touchY=" + this.a + ", progress=" + this.b + ", swipeEdge=" + this.c + '}';
    }
}
