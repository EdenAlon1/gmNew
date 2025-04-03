package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqd extends eiqg {
    private final Context a;

    public eiqd(Context context) {
        this.a = context;
    }

    @Override // defpackage.eiqg, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i;
        super.updateDrawState(textPaint);
        if (Build.VERSION.SDK_INT >= 31) {
            i = this.a.getResources().getConfiguration().fontWeightAdjustment;
            textPaint.setFakeBoldText(i == 300);
        }
        textPaint.setUnderlineText(true);
    }
}
