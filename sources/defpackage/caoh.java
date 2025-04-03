package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoh implements cbuv {
    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        bcseVar.getClass();
        return "";
    }

    @Override // defpackage.cbuv
    public final void b(View view, TextView textView, bcse bcseVar, int i) {
        SpannableStringBuilder b;
        SpannableStringBuilder b2;
        textView.getClass();
        bcseVar.getClass();
        int f = bcseVar.f();
        if (f == 203) {
            b = caoy.b(bcseVar, textView, false, true);
            textView.setText(b);
        } else if (f == 226) {
            textView.setText(caoy.b(bcseVar, textView, true, false));
        } else {
            if (f != 229) {
                return;
            }
            b2 = caoy.b(bcseVar, textView, true, true);
            textView.setText(b2);
        }
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        bcseVar.getClass();
        int f = bcseVar.f();
        return f == 203 || f == 226 || f == 229;
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return false;
    }
}
