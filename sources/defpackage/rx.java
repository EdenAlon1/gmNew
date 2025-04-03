package defpackage;

import android.graphics.Paint;
import android.widget.TextView;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rx {
    public static final cnq a = new cnq(30);
    public static Paint b;

    static void a(TextView textView, String str) {
        String fontVariationSettings;
        fontVariationSettings = textView.getFontVariationSettings();
        if (Objects.equals(fontVariationSettings, str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
