package defpackage;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egka extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ EditablePhotoView a;

    public egka(EditablePhotoView editablePhotoView) {
        this.a = editablePhotoView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        float a = editablePhotoView.a() * scaleGestureDetector.getScaleFactor();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float min = Math.min(Math.max(a, editablePhotoView.i), editablePhotoView.j) / editablePhotoView.a();
        editablePhotoView.b.postScale(min, min, focusX, focusY);
        editablePhotoView.p.set(editablePhotoView.o);
        editablePhotoView.b.mapRect(editablePhotoView.p);
        float f = editablePhotoView.c.left;
        float f2 = editablePhotoView.c.right;
        RectF rectF = editablePhotoView.p;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = editablePhotoView.c.top;
        float f9 = editablePhotoView.c.bottom;
        RectF rectF2 = editablePhotoView.p;
        float f10 = rectF2.top;
        float f11 = rectF2.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        editablePhotoView.b.postTranslate(f7, f6);
        editablePhotoView.invalidate();
        editablePhotoView.f();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        editablePhotoView.h = editablePhotoView.g == 2;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        EditablePhotoView editablePhotoView = this.a;
        boolean z = editablePhotoView.h;
        editablePhotoView.k = !z;
        if (z) {
            editablePhotoView.r.a(dvxh.d(), editablePhotoView);
        } else {
            editablePhotoView.r.a(new dvxf(22).a(), this.a);
        }
        EditablePhotoView editablePhotoView2 = this.a;
        editablePhotoView2.setContentDescription(editablePhotoView2.getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fdrm.m() ? this.a.b() : this.a.a())));
    }
}
