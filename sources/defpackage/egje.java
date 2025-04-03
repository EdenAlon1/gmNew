package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egje extends rip {
    final /* synthetic */ SquareImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egje(SquareImageView squareImageView, SquareImageView squareImageView2) {
        super(squareImageView2);
        this.b = squareImageView;
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
        this.b.b();
    }

    @Override // defpackage.rip
    protected final void b(Drawable drawable) {
        this.b.b();
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        SquareImageView squareImageView = this.b;
        squareImageView.a = (Bitmap) obj;
        squareImageView.c();
    }
}
