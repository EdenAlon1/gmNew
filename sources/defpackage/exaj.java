package defpackage;

import android.net.Uri;
import android.os.LocaleList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class exaj extends exan {
    public exaj(exao exaoVar) {
        super(exaoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.widget.TextView r25, defpackage.ewyx r26) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exaj.b(android.widget.TextView, ewyx):void");
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        LocaleList textLocales;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                int spanStart = spanned.getSpanStart(this);
                int spanEnd = spanned.getSpanEnd(this);
                if (spanStart < 0 || spanStart >= spanEnd || spanEnd > text.length()) {
                    Log.d("TextLinks", "Cannot show link toolbar. Invalid text indices");
                    return;
                }
                emxf.a(text != null);
                emxf.a(true);
                emxf.a(spanEnd <= text.length());
                emxf.a(true);
                textLocales = textView.getTextLocales();
                String str = null;
                kqx d = textLocales == null ? null : kqx.d(textLocales);
                try {
                    Uri parse = Uri.parse(text.subSequence(spanStart, spanEnd).toString());
                    String scheme = parse.getScheme();
                    if (scheme != null) {
                        str = scheme.toLowerCase(Locale.ROOT);
                    }
                    if (str != null && !scheme.equals(str)) {
                        String uri = parse.buildUpon().scheme(str).build().toString();
                        if (uri.length() == spanEnd - spanStart) {
                            text = new SpannableString(new SpannableStringBuilder(text).replace(spanStart, spanEnd, (CharSequence) uri));
                        }
                    }
                } catch (Exception e) {
                    Log.e("TextClassification", "Error fixing uri scheme", e);
                }
                exap.a.execute(new exai(textView, this, new ewyw(text, spanStart, spanEnd, d), spanned));
            }
        }
    }
}
