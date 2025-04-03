package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.art.edit.ColorPickerView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwm extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ColorPickerView a;

    public efwm(ColorPickerView colorPickerView) {
        this.a = colorPickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        float width = this.a.getWidth() / 2.0f;
        double hypot = Math.hypot(motionEvent.getX() - width, motionEvent.getY() - width);
        ColorPickerView colorPickerView = this.a;
        colorPickerView.h = colorPickerView.g;
        colorPickerView.a.setStrokeWidth(colorPickerView.i);
        return hypot <= ((double) width);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ColorPickerView colorPickerView = this.a;
        colorPickerView.f = true;
        colorPickerView.f(motionEvent2.getX(), motionEvent2.getY(), motionEvent2, 8);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        this.a.f(motionEvent.getX(), motionEvent.getY(), motionEvent, null);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.a.f(motionEvent.getX(), motionEvent.getY(), motionEvent, 1);
        return true;
    }
}
