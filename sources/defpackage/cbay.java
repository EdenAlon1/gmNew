package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.apps.messaging.R;
import defpackage.cbax;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbay {
    public final Paint b;
    public final Rect c;
    public int d;
    private final int f;
    private final crjx g;
    private static final String e = new StringBuilder().appendCodePoint(128522).toString();
    public static final cbaz a = new cbaz();

    public cbay(Context context) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Rect();
        int color = context.getColor(R.color.google_grey900);
        this.f = color;
        crjx a2 = ((cbax.a) ekhw.a(context, cbax.a.class)).a();
        this.g = a2;
        paint.setColor(a2.g() ? -1 : color);
    }

    private final void b(int i) {
        this.b.setTextSize(i);
        String str = e;
        this.b.getTextBounds(str, 0, str.length(), this.c);
    }

    public final synchronized void a(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        int i2 = i + 1;
        int i3 = 0;
        while (i2 - i3 > 1) {
            int i4 = (i3 + i2) / 2;
            b(i4);
            float measureText = this.b.measureText(e);
            int height = this.c.height();
            int i5 = this.d;
            if (height <= i5 && measureText <= i5) {
                i3 = i4;
            }
            i2 = i4;
        }
        b(i3);
    }
}
