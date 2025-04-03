package defpackage;

import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerl {
    public static final void a(TextView textView) {
        if (b(textView, textView.getMinWidth())) {
            return;
        }
        int integer = textView.getResources().getInteger(R.integer.photos_onboarding_text_auto_size_step);
        int minWidth = textView.getMinWidth() + integer;
        int maxWidth = textView.getMaxWidth();
        if (integer <= 0) {
            throw new IllegalArgumentException(a.f(integer, "Step must be positive, was: ", "."));
        }
        int a = ffib.a(minWidth, maxWidth, integer);
        if (minWidth <= a) {
            while (!b(textView, minWidth) && minWidth != a) {
                minWidth += integer;
            }
        }
    }

    private static final boolean b(TextView textView, int i) {
        int justificationMode;
        TextDirectionHeuristic textDirectionHeuristic;
        boolean isFallbackLineSpacing;
        int compoundPaddingStart = (i - textView.getCompoundPaddingStart()) - textView.getCompoundPaddingEnd();
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(textView.getTypeface());
        textPaint.setTextSize(textView.getTextSize());
        textPaint.density = textView.getResources().getDisplayMetrics().density;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(textView.getText(), 0, textView.getText().length(), textView.getPaint(), compoundPaddingStart);
        obtain.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        obtain.setIncludePad(textView.getIncludeFontPadding());
        obtain.setBreakStrategy(textView.getBreakStrategy());
        obtain.setHyphenationFrequency(textView.getHyphenationFrequency());
        justificationMode = textView.getJustificationMode();
        obtain.setJustificationMode(justificationMode);
        if (Build.VERSION.SDK_INT >= 28) {
            isFallbackLineSpacing = textView.isFallbackLineSpacing();
            obtain.setUseLineSpacingFromFallbacks(isFallbackLineSpacing);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            obtain.setTextDirection(textDirectionHeuristic);
        }
        StaticLayout build = obtain.build();
        build.getClass();
        boolean z = build.getLineCount() <= textView.getMaxLines();
        if (!z) {
            return z;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = build.getHeight() + textView.getCompoundPaddingTop() + textView.getCompoundPaddingBottom();
        textView.setLayoutParams(layoutParams);
        return z;
    }
}
