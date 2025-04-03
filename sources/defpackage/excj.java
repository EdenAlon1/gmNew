package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.util.Log;
import android.widget.TextView;
import androidx.core.app.RemoteActionCompat;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class excj {
    public static WeakReference a = new WeakReference(null);
    public final TextView b;
    public final Rect c = new Rect();
    public final exbz d;
    public final excg e;

    public excj(TextView textView) {
        this.b = textView;
        int highlightColor = textView.getHighlightColor();
        this.e = new excg(Color.argb(20, Color.red(highlightColor), Color.green(highlightColor), Color.blue(highlightColor)));
        exbv exbvVar = new exbv(textView);
        this.d = exbvVar;
        exbvVar.a.J = true;
    }

    static String a(TextView textView, excg excgVar) {
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            return null;
        }
        Spannable spannable = (Spannable) text;
        int spanStart = spannable.getSpanStart(excgVar);
        int spanEnd = spannable.getSpanEnd(excgVar);
        int max = Math.max(0, Math.min(spanStart, spanEnd));
        int[] iArr = {0, spanStart, spanEnd};
        emxf.a(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 > i) {
                i = i3;
            }
        }
        return textView.getText().subSequence(max, i).toString();
    }

    public static void b(exbz exbzVar) {
        ((exbv) exbzVar).a.e();
        exbzVar.c();
    }

    public static void c(String str) {
        if (Log.isLoggable("ToolbarController", 2)) {
            Log.v("ToolbarController", str);
        }
    }

    public static void d(TextView textView) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            for (excg excgVar : (excg[]) spannable.getSpans(0, text.length(), excg.class)) {
                spannable.removeSpan(excgVar);
            }
        }
    }

    public static void e(Rect rect, TextView textView, int i, int i2) {
        int[] h = h(textView, i, true);
        int[] h2 = h(textView, i2, false);
        rect.set(h[0], h[1], h2[0], h2[1]);
        rect.sort();
    }

    public static boolean f(TextView textView, boolean z) {
        boolean hasFocus = textView.hasFocus();
        boolean isAttachedToWindow = textView.isAttachedToWindow();
        boolean z2 = z && hasFocus && isAttachedToWindow;
        if (!z2) {
            c(String.format("canShowToolbar=false. Reason: windowFocus=%b, viewFocus=%b, viewAttached=%b", Boolean.valueOf(z), Boolean.valueOf(hasFocus), Boolean.valueOf(isAttachedToWindow)));
        }
        return z2;
    }

    static /* synthetic */ void g(RemoteActionCompat remoteActionCompat) {
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        PendingIntent pendingIntent = remoteActionCompat.d;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                pendingIntent.send();
            } else {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                pendingIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
            }
        } catch (PendingIntent.CanceledException e) {
            Log.e("ToolbarController", "Error performing smart action", e);
        }
    }

    private static int[] h(TextView textView, int i, boolean z) {
        Layout layout = textView.getLayout();
        int lineForOffset = layout.getLineForOffset(i);
        int primaryHorizontal = (int) layout.getPrimaryHorizontal(i);
        int lineTop = z ? layout.getLineTop(lineForOffset) : layout.getLineBottom(lineForOffset);
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        return new int[]{((primaryHorizontal + textView.getTotalPaddingLeft()) - textView.getScrollX()) + iArr[0], ((lineTop + textView.getTotalPaddingTop()) - textView.getScrollY()) + iArr[1]};
    }
}
