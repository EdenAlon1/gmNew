package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehis {
    public boolean e;
    public ehtr g;
    private CharSequence h;
    private final TextPaint i;
    private final int j;
    private int k;
    public Layout.Alignment a = Layout.Alignment.ALIGN_NORMAL;
    public int b = Alert.DURATION_SHOW_INDEFINITELY;
    private float l = 0.0f;
    private float m = 1.0f;
    public int c = 1;
    public boolean d = true;
    public TextUtils.TruncateAt f = null;

    public ehis(CharSequence charSequence, TextPaint textPaint, int i) {
        this.h = charSequence;
        this.i = textPaint;
        this.j = i;
        this.k = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.h == null) {
            this.h = "";
        }
        int max = Math.max(0, this.j);
        CharSequence charSequence = this.h;
        if (this.b == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.i, max, this.f);
        }
        this.k = Math.min(charSequence.length(), this.k);
        if (this.e && this.b == 1) {
            this.a = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, this.k, this.i, max);
        obtain.setAlignment(this.a);
        obtain.setIncludePad(this.d);
        obtain.setTextDirection(this.e ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.b);
        float f = this.l;
        if (f != 0.0f || this.m != 1.0f) {
            obtain.setLineSpacing(f, this.m);
        }
        if (this.b > 1) {
            obtain.setHyphenationFrequency(this.c);
        }
        ehtr ehtrVar = this.g;
        if (ehtrVar != null) {
            obtain.setBreakStrategy(ehtrVar.a.k.getBreakStrategy());
        }
        return obtain.build();
    }

    public final void b(float f, float f2) {
        this.l = f;
        this.m = f2;
    }
}
