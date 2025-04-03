package defpackage;

import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqn extends jqm {
    private final CharSequence a;
    private final TextPaint b;

    public jqn(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    @Override // defpackage.jqm
    public final int a(int i) {
        int textRunCursor;
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // defpackage.jqm
    public final int d(int i) {
        int textRunCursor;
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        textRunCursor = textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
