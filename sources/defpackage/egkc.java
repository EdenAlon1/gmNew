package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egkc extends AnimatorListenerAdapter {
    final /* synthetic */ Matrix a;
    final /* synthetic */ EditablePhotoView b;

    public egkc(EditablePhotoView editablePhotoView, Matrix matrix) {
        this.a = matrix;
        this.b = editablePhotoView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.postRotate(-90.0f, this.b.c.centerX(), this.b.c.centerY());
        this.b.b.set(this.a);
        EditablePhotoView editablePhotoView = this.b;
        egkl egklVar = editablePhotoView.q;
        egklVar.k -= 90.0f;
        editablePhotoView.invalidate();
        this.b.f();
    }
}
