package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqh {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public final Layout e;
    public final int f;
    public final int g;
    public final float h;
    public final float i;
    public final Rect j = new Rect();
    private final jqb k;
    private jqr l;
    private final int m;
    private final boolean n;
    private final Paint.FontMetricsInt o;
    private final int p;
    private final jrb[] q;
    private jpz r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jqh(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, defpackage.jqb r36) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqh.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, jqb):void");
    }

    public final float a(int i) {
        if (i == this.f - 1) {
            return this.h + this.i;
        }
        return 0.0f;
    }

    public final float b(int i) {
        return this.g + ((i != this.f + (-1) || this.o == null) ? this.e.getLineBaseline(i) : e(i) - this.o.ascent);
    }

    public final float c(int i) {
        if (i == this.f - 1 && this.o != null) {
            return this.e.getLineBottom(i - 1) + this.o.bottom;
        }
        return this.g + this.e.getLineBottom(i) + (i == this.f + (-1) ? this.m : 0);
    }

    public final float d(int i) {
        return c(i) - e(i);
    }

    public final float e(int i) {
        return this.e.getLineTop(i) + (i == 0 ? 0 : this.g);
    }

    public final float f(int i, boolean z) {
        return p().a(i, true, z) + a(l(i));
    }

    public final float g(int i, boolean z) {
        return p().a(i, false, z) + a(l(i));
    }

    public final int h() {
        return (this.d ? this.e.getLineBottom(this.f - 1) : this.e.getHeight()) + this.g + this.m + this.p;
    }

    public final int i(int i) {
        return this.e.getEllipsisCount(i);
    }

    public final int j(int i) {
        return this.e.getEllipsisStart(i);
    }

    public final int k(int i) {
        return (jqj.c(this.e, i) && this.b == TextUtils.TruncateAt.END) ? this.e.getText().length() : this.e.getLineEnd(i);
    }

    public final int l(int i) {
        return this.e.getLineForOffset(i);
    }

    public final int m(int i) {
        return this.e.getLineForVertical(i - this.g);
    }

    public final int n(int i) {
        return this.e.getLineStart(i);
    }

    public final int o(int i) {
        return this.e.getParagraphDirection(i);
    }

    public final jpz p() {
        jpz jpzVar = this.r;
        if (jpzVar != null) {
            return jpzVar;
        }
        jpz jpzVar2 = new jpz(this.e);
        this.r = jpzVar2;
        return jpzVar2;
    }

    public final jqr q() {
        jqr jqrVar = this.l;
        if (jqrVar != null) {
            return jqrVar;
        }
        Layout layout = this.e;
        jqr jqrVar2 = new jqr(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.l = jqrVar2;
        return jqrVar2;
    }

    public final CharSequence r() {
        return this.e.getText();
    }

    public final boolean s(int i) {
        return this.e.isRtlCharAt(i);
    }
}
