package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ril extends rir {
    public ril(ImageView imageView) {
        super(imageView);
    }

    @Override // defpackage.rir
    protected final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ImageView) this.a).setImageBitmap((Bitmap) obj);
    }
}
