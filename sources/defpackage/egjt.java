package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjt extends rim {
    final /* synthetic */ EditActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egjt(EditActivity editActivity, int i, int i2) {
        super(i, i2);
        this.a = editActivity;
    }

    @Override // defpackage.rim, defpackage.rix
    public final void a(Drawable drawable) {
        this.a.A.c();
        this.a.D();
        this.a.B();
        this.a.C.g();
        this.a.C.setVisibility(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    @Override // defpackage.rix
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void c(java.lang.Object r7, defpackage.rjh r8) {
        /*
            r6 = this;
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            com.google.android.libraries.user.profile.photopicker.edit.EditActivity r8 = r6.a
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r8.A
            android.graphics.drawable.Drawable r0 = r8.a
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L42
            r4 = 0
            r0.setCallback(r4)
            android.graphics.drawable.Drawable r0 = r8.a
            boolean r4 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L20
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r7 != r0) goto L20
            goto L62
        L20:
            android.graphics.drawable.Drawable r0 = r8.a
            int r0 = r0.getIntrinsicWidth()
            int r4 = r7.getWidth()
            if (r0 != r4) goto L3b
            android.graphics.drawable.Drawable r0 = r8.a
            int r0 = r0.getIntrinsicHeight()
            int r4 = r7.getHeight()
            if (r0 == r4) goto L39
            goto L3b
        L39:
            r0 = r3
            goto L3c
        L3b:
            r0 = r2
        L3c:
            r8.i = r1
            r8.c()
            goto L43
        L42:
            r0 = r3
        L43:
            android.graphics.drawable.Drawable r4 = r8.a
            if (r4 != 0) goto L57
            android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r5 = r8.getResources()
            r4.<init>(r5, r7)
            r8.a = r4
            android.graphics.drawable.Drawable r7 = r8.a
            r7.setCallback(r8)
        L57:
            r8.d(r0)
            r8.requestLayout()
            r8.invalidate()
            r8.f = r2
        L62:
            com.google.android.libraries.user.profile.photopicker.edit.EditActivity r7 = r6.a
            com.google.android.material.progressindicator.LinearProgressIndicator r8 = r7.B
            r0 = 8
            r8.setVisibility(r0)
            com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView r8 = r7.C
            r8.setVisibility(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = r7.D
            r0 = 3
            r8.D(r0)
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r7.A
            r8.setVisibility(r3)
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r8 = r7.A
            float r8 = r8.getAlpha()
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 != 0) goto L9d
            com.google.android.libraries.user.profile.photopicker.edit.EditablePhotoView r7 = r7.A
            android.view.ViewPropertyAnimator r7 = r7.animate()
            r8 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r7 = r7.alpha(r8)
            ljm r8 = new ljm
            r8.<init>()
            android.view.ViewPropertyAnimator r7 = r7.setInterpolator(r8)
            r7.start()
        L9d:
            com.google.android.libraries.user.profile.photopicker.edit.EditActivity r7 = r6.a
            egko r8 = r7.x
            llg r8 = r8.h
            egjs r0 = new egjs
            r0.<init>()
            r8.f(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egjt.c(java.lang.Object, rjh):void");
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
        this.a.A.c();
        this.a.D();
        this.a.B();
    }

    @Override // defpackage.rim, defpackage.rix
    public final void g(Drawable drawable) {
        this.a.D();
        EditActivity editActivity = this.a;
        editActivity.B.setVisibility(0);
        editActivity.D.D(5);
        editActivity.A.setVisibility(8);
    }
}
