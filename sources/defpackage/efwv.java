package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwv extends AnimatorListenerAdapter {
    final /* synthetic */ Matrix a;
    final /* synthetic */ float b;
    final /* synthetic */ EditableArtView c;

    public efwv(EditableArtView editableArtView, Matrix matrix, float f) {
        this.a = matrix;
        this.b = f;
        this.c = editableArtView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.postRotate(this.b, this.c.c.centerX(), this.c.c.centerY());
        this.c.b.set(this.a);
        EditableArtView editableArtView = this.c;
        editableArtView.s.k += this.b;
        editableArtView.invalidate();
        this.c.s();
    }
}
