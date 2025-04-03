package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvo {
    public final Executor c;
    public final qxf d;
    public final float e;
    public int g;
    public final Canvas a = new Canvas();
    public final TextPaint b = new TextPaint();
    public final Rect f = new Rect();

    public duvo(qxf qxfVar, float f) {
        this.d = qxfVar;
        this.e = f;
        if (duvs.a == null) {
            duvs.a(null);
        }
        duvs duvsVar = duvs.a;
        duvsVar.getClass();
        this.c = dunl.b(duvsVar.b);
    }

    public static int b(int i, float f) {
        if (i != 0) {
            f = Math.min(i, f);
        }
        return (int) f;
    }

    public static StaticLayout c(CharSequence charSequence, TextPaint textPaint) {
        d();
        int ceil = (int) Math.ceil(StaticLayout.getDesiredWidth(charSequence, textPaint));
        d();
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_CENTER).setLineSpacing(0.0f, 1.0f).setIncludePad(false).build();
    }

    public static void d() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedException();
        }
    }

    public final float a(float f, float f2) {
        return Math.max(this.e, (float) Math.floor(f * f2));
    }
}
