package defpackage;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkb extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public egkb(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditablePhotoView editablePhotoView = this.a;
            if (!editablePhotoView.k) {
                editablePhotoView.r.a(dvxh.b(), editablePhotoView);
            }
        }
        this.a.k = false;
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.a.s.isInProgress() && !this.a.h && Math.abs(motionEvent2.getEventTime() - this.a.l) > fdrm.b()) {
            EditablePhotoView editablePhotoView = this.a;
            editablePhotoView.n = true;
            float f3 = -f;
            float f4 = -f2;
            editablePhotoView.p.set(editablePhotoView.o);
            editablePhotoView.b.mapRect(editablePhotoView.p);
            float f5 = editablePhotoView.c.left;
            float f6 = editablePhotoView.c.right;
            RectF rectF = editablePhotoView.p;
            float f7 = rectF.left;
            float f8 = rectF.right;
            float f9 = f6 - f5;
            float max = f8 - f7 < f9 ? f5 + ((f9 - (f8 + f7)) / 2.0f) : Math.max(f6 - f8, Math.min(f5 - f7, f3));
            float f10 = editablePhotoView.c.top;
            float f11 = editablePhotoView.c.bottom;
            RectF rectF2 = editablePhotoView.p;
            float f12 = rectF2.top;
            float f13 = rectF2.bottom;
            float f14 = f11 - f10;
            editablePhotoView.b.postTranslate(max, f13 - f12 < f14 ? f10 + ((f14 - (f13 + f12)) / 2.0f) : Math.max(f11 - f13, Math.min(f10 - f12, f4)));
            editablePhotoView.invalidate();
            editablePhotoView.f();
        }
        return true;
    }
}
