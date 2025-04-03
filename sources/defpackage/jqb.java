package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqb {
    public final CharSequence a;
    public final TextPaint b;
    private final int d;
    private BoringLayout.Metrics f;
    private boolean g;
    private CharSequence h;
    private float e = Float.NaN;
    public float c = Float.NaN;

    public jqb(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.d = i;
    }

    private final CharSequence d() {
        CharSequence charSequence = this.h;
        if (charSequence == null) {
            charSequence = this.a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (jqd.a(spanned, CharacterStyle.class)) {
                    CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class);
                    if (characterStyleArr != null && (characterStyleArr.length) != 0) {
                        SpannableString spannableString = null;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                        }
                        if (spannableString != null) {
                            charSequence = spannableString;
                        }
                    }
                }
            }
            this.h = charSequence;
        }
        return charSequence;
    }

    public final float a(int i, int i2) {
        return Layout.getDesiredWidth(d(), i, i2, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        if (defpackage.jqd.a(r2, defpackage.jqy.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (r3.getLetterSpacing() != 0.0f) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            r5 = this;
            float r0 = r5.e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r5.e
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r5.c()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L2e
            java.lang.CharSequence r0 = r5.d()
            int r0 = r0.length()
            r2 = 0
            float r0 = r5.a(r2, r0)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
        L2e:
            java.lang.CharSequence r2 = r5.a
            android.text.TextPaint r3 = r5.b
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L37
            goto L58
        L37:
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L4d
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<jqz> r4 = defpackage.jqz.class
            boolean r4 = defpackage.jqd.a(r2, r4)
            if (r4 != 0) goto L55
            java.lang.Class<jqy> r4 = defpackage.jqy.class
            boolean r2 = defpackage.jqd.a(r2, r4)
            if (r2 != 0) goto L55
        L4d:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L58
        L55:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L58:
            r5.e = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqb.b():float");
    }

    public final BoringLayout.Metrics c() {
        if (!this.g) {
            int i = this.d;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.b;
            TextDirectionHeuristic b = jqj.b(i);
            BoringLayout.Metrics metrics = null;
            if (Build.VERSION.SDK_INT >= 33) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, b, true, null);
            } else if (!b.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            }
            this.f = metrics;
            this.g = true;
        }
        return this.f;
    }
}
