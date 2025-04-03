package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class riq extends rir {
    public riq(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.rir
    protected final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ImageView) this.a).setImageDrawable((Drawable) obj);
    }

    @Deprecated
    public riq(ImageView imageView, byte[] bArr) {
        super(imageView, null);
    }
}
