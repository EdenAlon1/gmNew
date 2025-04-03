package com.google.android.apps.messaging.ui.conversation.suggestions.tooltip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.crjx;
import defpackage.csjy;
import defpackage.czwb;
import defpackage.ddyh;
import defpackage.egyl;
import defpackage.emxf;
import defpackage.enou;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationSuggestionsBugleTooltipView extends czwb {
    public View a;
    public crjx b;
    private TextView c;
    private TextView d;

    public ConversationSuggestionsBugleTooltipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(CharSequence charSequence, List list) {
        TextView textView = this.d;
        if (textView == null || charSequence == null) {
            return;
        }
        int currentTextColor = textView.getCurrentTextColor();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Html.fromHtml(charSequence.toString()));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
        enou enouVar = (enou) list;
        emxf.a(uRLSpanArr.length == enouVar.c);
        for (int i = 0; i < uRLSpanArr.length && i < enouVar.c; i++) {
            URLSpan uRLSpan = uRLSpanArr[i];
            View.OnClickListener onClickListener = (View.OnClickListener) list.get(i);
            int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
            int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
            int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
            spannableStringBuilder.setSpan(new ddyh(onClickListener), spanStart, spanEnd, spanFlags);
            spannableStringBuilder.setSpan(new TypefaceSpan("sans-serif"), spanStart, spanEnd, spanFlags);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(currentTextColor), spanStart, spanEnd, spanFlags);
            spannableStringBuilder.removeSpan(uRLSpan);
        }
        textView.setText(spannableStringBuilder);
        egyl.b(textView);
        egyl.c(textView);
    }

    public final void b(String str) {
        if (TextUtils.isEmpty(str)) {
            csjy.f("Bugle", "BugleTooltip: Title view is empty, cannot set the title text");
        } else {
            this.c.setText(str);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.tooltip_title);
        this.d = (TextView) findViewById(R.id.tooltip_content);
        this.a = findViewById(R.id.tooltip_dismiss_button);
        Drawable background = getBackground();
        if (background == null) {
            background = this.b.g() ? getContext().getDrawable(R.drawable.tooltip_dark) : getContext().getDrawable(R.drawable.tooltip_light);
        }
        if (background != null) {
            background.setAutoMirrored(true);
        }
        setBackground(background);
    }
}
