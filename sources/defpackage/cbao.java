package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Locale;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbao extends cbam {
    private static Bitmap g;

    public cbao(Context context, crji crjiVar, cban cbanVar) {
        super(context, crjiVar, cbanVar);
    }

    @Override // defpackage.cbam, defpackage.cbcd, defpackage.cbbh
    protected final cbbk h(List list) {
        cbbk h;
        ekzz f = eleg.f("SimSelectorAvatarRequest.loadMediaInternal");
        try {
            efbd.b();
            Uri uri = ((cban) this.b).k;
            if (uri == null || !"s".equals(crjm.s(uri))) {
                h = super.h(list);
            } else {
                cban cbanVar = (cban) this.b;
                int i = cbanVar.b;
                int i2 = cbanVar.c;
                String t = crjm.t(uri);
                csix.l(uri);
                boolean parseBoolean = Boolean.parseBoolean(uri.getQueryParameter("s"));
                csix.l(uri);
                int parseInt = Integer.parseInt(emxe.b(uri.getQueryParameter("c")));
                Resources resources = this.a.getResources();
                float f2 = i / 2;
                float f3 = i2 / 2;
                int color = parseBoolean ? parseInt : this.a.getResources().getColor(R.color.sim_icon_background_color);
                int color2 = parseBoolean ? -1 : ((-16777216) & parseInt) != 0 ? parseInt : this.a.getResources().getColor(R.color.sim_icon_text_color);
                if (true == parseBoolean) {
                    parseInt = -1;
                }
                Bitmap b = m().b(i, i2, color);
                Paint paint = new Paint(1);
                Canvas canvas = new Canvas(b);
                if (g == null) {
                    g = ((BitmapDrawable) this.a.getResources().getDrawable(R.drawable.ic_sim_card_send)).getBitmap();
                    int density = b.getDensity();
                    if (g.getDensity() != density) {
                        g.setDensity(density);
                    }
                }
                paint.setColorFilter(new PorterDuffColorFilter(parseInt, PorterDuff.Mode.SRC_ATOP));
                paint.setAlpha(PrivateKeyType.INVALID);
                canvas.drawBitmap(g, f2 - (r10.getWidth() / 2), f3 - (g.getHeight() / 2), paint);
                paint.setColorFilter(null);
                paint.setAlpha(PrivateKeyType.INVALID);
                if (!TextUtils.isEmpty(t)) {
                    paint.setTypeface(crlw.f(this.a));
                    paint.setTextSize(resources.getDimensionPixelSize(R.dimen.sim_identifier_text_size));
                    paint.setColor(color2);
                    String upperCase = t.substring(0, 1).toUpperCase(Locale.US);
                    paint.getTextBounds(upperCase, 0, 1, new Rect());
                    canvas.drawText(upperCase, f2 - r7.centerX(), f3 - r7.centerY(), paint);
                }
                h = new cbaw(f(), b, 1, this.c, this.d);
            }
            f.close();
            return h;
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.cbbh
    public final int j() {
        return 2;
    }
}
