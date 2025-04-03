package defpackage;

import android.net.Uri;
import android.text.Spannable;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eacb extends eaca {
    private final eaby a;

    public eacb(eaby eabyVar) {
        this.a = eabyVar;
    }

    @Override // defpackage.fgsy, android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            int offsetForPosition = textView.getOffsetForPosition(motionEvent.getX(), motionEvent.getY());
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(offsetForPosition, offsetForPosition, URLSpan.class);
            if (uRLSpanArr.length == 1) {
                URLSpan uRLSpan = uRLSpanArr[0];
                if (uRLSpan != null) {
                    eaby eabyVar = this.a;
                    Uri parse = Uri.parse(uRLSpan.getURL());
                    eabz eabzVar = eabyVar.a;
                    if (eabzVar.i) {
                        eaau eaauVar = (eaau) eabzVar.h;
                        eaauVar.b.b(eaauVar.b(125).a());
                    } else {
                        dzyb dzybVar = eabzVar.h;
                        Integer num = (Integer) eaau.a.get(parse.getScheme());
                        eaau eaauVar2 = (eaau) dzybVar;
                        dzhn dzhnVar = eaauVar2.b;
                        dzhl b = eaauVar2.b(122);
                        b.k(num != null ? num.intValue() : 0);
                        dzhnVar.b(b.a());
                    }
                }
            }
        }
        return super.onTouchEvent(textView, spannable, motionEvent);
    }
}
