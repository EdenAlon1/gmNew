package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czuz extends rip {
    final /* synthetic */ ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czuz(ImageView imageView) {
        super(imageView);
        this.b = imageView;
    }

    @Override // defpackage.rix
    public final /* bridge */ /* synthetic */ void c(Object obj, rjh rjhVar) {
        this.b.setImageDrawable((Drawable) obj);
    }

    @Override // defpackage.rix
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.rip
    protected final void b(Drawable drawable) {
    }
}
