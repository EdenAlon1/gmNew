package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqm implements eiph {
    public final TemplateLayout a;
    public float c;
    public float d;
    public int e;
    private float g;
    public boolean b = false;
    final ArrayList f = new ArrayList();

    public eiqm(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        TextView a;
        TextView a2;
        this.a = templateLayout;
        TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, einv.c, i, 0);
        CharSequence text = obtainStyledAttributes.getText(4);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
        obtainStyledAttributes.recycle();
        if (a() != null) {
            a().getTextSize();
            a().getLineHeight();
        }
        c();
        if (text != null && (a2 = a()) != null) {
            if (this.b) {
                b(a2);
            }
            a2.setText(text);
        }
        if (colorStateList == null || (a = a()) == null) {
            return;
        }
        a.setTextColor(colorStateList);
    }

    public final TextView a() {
        return (TextView) this.a.g(R.id.suc_layout_title);
    }

    public final void b(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setTextSize(0, this.g);
        textView.getTextSize();
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setLineHeight(Math.round(this.d + this.g));
            textView.getLineHeight();
        }
        textView.setMaxLines(6);
        eiql eiqlVar = new eiql(this, textView);
        textView.getViewTreeObserver().addOnPreDrawListener(eiqlVar);
        this.f.add(eiqlVar);
    }

    public final void c() {
        TemplateLayout templateLayout = this.a;
        Context context = templateLayout.getContext();
        if (!eiqx.c(templateLayout)) {
            this.b = false;
            return;
        }
        if (eios.h(context).s(eioq.CONFIG_HEADER_AUTO_SIZE_ENABLED)) {
            this.b = eios.h(context).l(context, eioq.CONFIG_HEADER_AUTO_SIZE_ENABLED, this.b);
        }
        if (this.b) {
            Context context2 = this.a.getContext();
            if (eios.h(context2).s(eioq.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE)) {
                this.g = eios.h(context2).a(context2, eioq.CONFIG_HEADER_AUTO_SIZE_MAX_TEXT_SIZE);
            }
            if (eios.h(context2).s(eioq.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE)) {
                this.c = eios.h(context2).a(context2, eioq.CONFIG_HEADER_AUTO_SIZE_MIN_TEXT_SIZE);
            }
            if (eios.h(context2).s(eioq.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA)) {
                this.d = eios.h(context2).a(context2, eioq.CONFIG_HEADER_AUTO_SIZE_LINE_SPACING_EXTRA);
            }
            if (eios.h(context2).s(eioq.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE)) {
                this.e = eios.h(context2).d(context2, eioq.CONFIG_HEADER_AUTO_SIZE_MAX_LINE_OF_MAX_SIZE, 0);
            }
            if (this.e > 0) {
                float f = this.c;
                if (f > 0.0f && this.g >= f) {
                    return;
                }
            }
            Log.w("HeaderMixin", "Invalid configs, disable auto text size.");
            this.b = false;
        }
    }
}
