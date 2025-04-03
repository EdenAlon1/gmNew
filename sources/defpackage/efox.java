package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efox extends kzw {
    private final TextView f;

    public efox(TextView textView) {
        super(textView);
        this.f = textView;
    }

    private final CharSequence w(ClickableSpan clickableSpan) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.kzw, defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.ae(kxr.a);
        kxuVar.s(false);
    }

    @Override // defpackage.kzw
    protected final void k(List list) {
        CharSequence text = this.f.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.kzw
    protected final void l(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan u = u(i);
        if (u != null) {
            accessibilityEvent.setContentDescription(w(u));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.h(i, "LinkSpan is null for offset: "));
            accessibilityEvent.setContentDescription(this.f.getText());
        }
    }

    @Override // defpackage.kzw
    protected final void n(int i, kxu kxuVar) {
        ClickableSpan u = u(i);
        Rect rect = new Rect();
        if (u != null) {
            kxuVar.v(w(u));
        } else {
            Log.w("TvLinksAccessibilityHelper", a.h(i, "LinkSpan is null for offset: "));
            kxuVar.v(this.f.getText());
        }
        kxuVar.z(true);
        kxuVar.s(true);
        v(u, rect);
        if (rect.isEmpty()) {
            Log.w("TvLinksAccessibilityHelper", a.h(i, "LinkSpan bounds is empty for: "));
            rect.set(0, 0, 1, 1);
            kxuVar.n(rect);
        } else {
            v(u, rect);
            kxuVar.n(rect);
        }
        kxuVar.h(16);
    }

    @Override // defpackage.kzw
    public final boolean s(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        ClickableSpan u = u(i);
        if (u != null) {
            u.onClick(this.f);
            return true;
        }
        Log.e("TvLinksAccessibilityHelper", a.h(i, "LinkSpan is null for offset: "));
        return false;
    }

    final ClickableSpan u(int i) {
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    final void v(ClickableSpan clickableSpan, Rect rect) {
        Layout layout;
        CharSequence text = this.f.getText();
        if (!(text instanceof Spanned) || (layout = this.f.getLayout()) == null) {
            return;
        }
        Spanned spanned = (Spanned) text;
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        layout.getLineBounds(lineForOffset, rect);
        rect.right = (int) primaryHorizontal2;
        if (lineForOffset == lineForOffset2) {
            rect.left = (int) primaryHorizontal;
        } else {
            rect.left = 0;
        }
        rect.top = layout.getLineTop(lineForOffset2);
        rect.bottom = layout.getLineBottom(lineForOffset2);
        TextView textView = this.f;
        rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
    }
}
