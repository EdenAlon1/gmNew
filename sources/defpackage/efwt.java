package defpackage;

import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwt extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    final /* synthetic */ EditableArtView a;

    public efwt(EditableArtView editableArtView) {
        this.a = editableArtView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        EditableArtView editableArtView = this.a;
        editableArtView.o(editableArtView.a() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        EditableArtView editableArtView = this.a;
        editableArtView.l = editableArtView.k == 2;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        EditableArtView editableArtView = this.a;
        boolean z = editableArtView.l;
        editableArtView.n = !z;
        if (z) {
            editableArtView.t.a(dvxh.d(), editableArtView);
        } else {
            editableArtView.t.a(new dvxf(22).a(), this.a);
        }
        EditableArtView editableArtView2 = this.a;
        editableArtView2.setContentDescription(editableArtView2.getResources().getString(R.string.op3_edit_photo_a11y_label, Float.valueOf(fdrm.m() ? this.a.b() : this.a.a())));
        this.a.s.h = true;
    }
}
