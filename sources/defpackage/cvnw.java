package defpackage;

import android.text.Layout;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.widget.TextView;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnw extends LinkMovementMethod {
    private final ffbr a;
    private final ffbr b;
    private final bcse c;
    private final MovementMethod d;

    public cvnw(ffbr ffbrVar, ffbr ffbrVar2, bcse bcseVar, MovementMethod movementMethod) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = bcseVar;
        this.d = movementMethod;
    }

    private static String a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int totalPaddingLeft = x - textView.getTotalPaddingLeft();
        int totalPaddingTop = y - textView.getTotalPaddingTop();
        int scrollX = totalPaddingLeft + textView.getScrollX();
        int scrollY = totalPaddingTop + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
        if (clickableSpanArr.length != 1) {
            return null;
        }
        ClickableSpan clickableSpan = clickableSpanArr[0];
        return spannable.subSequence(spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan)).toString();
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        String a;
        if (!cvns.a()) {
            if (motionEvent.getAction() == 1 && (a = a(textView, spannable, motionEvent)) != null) {
                ((cuks) this.a.b()).a(this.c.u(), a);
            }
            return this.d.onTouchEvent(textView, spannable, motionEvent);
        }
        if (motionEvent.getAction() == 1) {
            Optional a2 = cglt.a(a(textView, spannable, motionEvent));
            if (a2.isPresent()) {
                ((cvnt) this.b.b()).a((String) a2.get(), this.c);
                return true;
            }
        }
        return this.d.onTouchEvent(textView, spannable, motionEvent);
    }
}
