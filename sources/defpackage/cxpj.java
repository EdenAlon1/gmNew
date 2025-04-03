package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.android.apps.messaging.ui.attachment.video.inlineplayer.InlinePlayerCornersView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpj {
    public final InlinePlayerCornersView a;
    public final Paint b;
    public int d;
    public float[] e;
    public int g;
    public int h;
    public final RectF c = new RectF();
    public final Path f = new Path();

    public cxpj(InlinePlayerCornersView inlinePlayerCornersView) {
        this.a = inlinePlayerCornersView;
        Paint paint = new Paint();
        this.b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint.setAntiAlias(true);
        paint.setDither(true);
    }
}
