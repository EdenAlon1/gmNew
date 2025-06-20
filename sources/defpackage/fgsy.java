package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgsy extends LinkMovementMethod {
    private final RectF a = new RectF();
    private boolean b;
    private ClickableSpan c;
    private int d;

    protected fgsy() {
    }

    private final void c(TextView textView) {
        this.c = null;
        b(textView);
    }

    protected void a(TextView textView, ClickableSpan clickableSpan, Spannable spannable) {
        if (this.b) {
            return;
        }
        this.b = true;
        int spanStart = spannable.getSpanStart(clickableSpan);
        int spanEnd = spannable.getSpanEnd(clickableSpan);
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(textView.getHighlightColor());
        spannable.setSpan(backgroundColorSpan, spanStart, spanEnd, 18);
        textView.setTag(R.id.bettermovementmethod_highlight_background_span, backgroundColorSpan);
        Selection.setSelection(spannable, spanStart, spanEnd);
    }

    protected void b(TextView textView) {
        if (this.b) {
            this.b = false;
            Spannable spannable = (Spannable) textView.getText();
            spannable.removeSpan((BackgroundColorSpan) textView.getTag(R.id.bettermovementmethod_highlight_background_span));
            Selection.removeSelection(spannable);
        }
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        boolean z = false;
        if (this.d != textView.hashCode()) {
            this.d = textView.hashCode();
            textView.setAutoLinkMask(0);
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int lineForVertical = layout.getLineForVertical(scrollY);
        float f = scrollX;
        int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, f);
        this.a.left = layout.getLineLeft(lineForVertical);
        this.a.top = layout.getLineTop(lineForVertical);
        this.a.right = layout.getLineWidth(lineForVertical) + this.a.left;
        this.a.bottom = layout.getLineBottom(lineForVertical);
        boolean contains = this.a.contains(f, scrollY);
        ClickableSpan clickableSpan = null;
        if (contains) {
            Object[] spans = spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            int length = spans.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Object obj = spans[i];
                if (obj instanceof ClickableSpan) {
                    clickableSpan = (ClickableSpan) obj;
                    break;
                }
                i++;
            }
        }
        if (motionEvent.getAction() == 0) {
            this.c = clickableSpan;
        }
        boolean z2 = this.c != null;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (clickableSpan != null) {
                a(textView, clickableSpan, spannable);
            }
            return z2;
        }
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    return false;
                }
                c(textView);
                return false;
            }
            if (clickableSpan != null) {
                a(textView, clickableSpan, spannable);
                return z2;
            }
            b(textView);
            return z2;
        }
        if (z2) {
            if (clickableSpan == this.c) {
                Spanned spanned = (Spanned) textView.getText();
                if (clickableSpan instanceof URLSpan) {
                    ((URLSpan) clickableSpan).getURL();
                } else {
                    spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan)).toString();
                }
                clickableSpan.onClick(textView);
            }
            z = true;
        }
        c(textView);
        return z;
    }
}
