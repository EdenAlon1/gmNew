package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwd {
    public StaticLayout A;
    public int B;
    public int C;
    public int D;
    public Rect E;
    private final float F;
    private final float G;
    private final float H;
    private final Paint I;
    private final Paint J;
    public final float a;
    public final float b;
    public final TextPaint c;
    public CharSequence d;
    public Layout.Alignment e;
    public Bitmap f;
    public float g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public float m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public int v;
    public int w;
    public int x;
    public int y;
    public StaticLayout z;

    public nwd(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.a = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float f = context.getResources().getDisplayMetrics().densityDpi;
        float round = Math.round((f + f) / 160.0f);
        this.F = round;
        this.G = round;
        this.H = round;
        TextPaint textPaint = new TextPaint();
        this.c = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.I = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.J = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (r12 == 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r12 == 3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nwd.a(android.graphics.Canvas, boolean):void");
    }
}
