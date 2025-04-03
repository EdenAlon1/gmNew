package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eawo implements View.OnAttachStateChangeListener {
    final /* synthetic */ Drawable a;
    final /* synthetic */ boolean b;
    final /* synthetic */ eawp c;

    public eawo(eawp eawpVar, Drawable drawable, boolean z) {
        this.a = drawable;
        this.b = z;
        this.c = eawpVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        efbd.c();
        eawp eawpVar = this.c;
        ImageView imageView = (ImageView) eawpVar.a.get();
        if (!eawpVar.e && imageView != null) {
            imageView.setImageDrawable(this.a);
        }
        if (this.b) {
            this.c.c();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
