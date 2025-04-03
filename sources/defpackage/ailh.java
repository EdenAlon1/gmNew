package defpackage;

import android.support.v7.widget.AppCompatTextView;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailh implements aigt {
    private final ahnp a;

    public ailh(ahnp ahnpVar) {
        ahnpVar.getClass();
        this.a = ahnpVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        ailg ailgVar = (ailg) aihsVar;
        SpannableString spannableString = new SpannableString(ailgVar.a.subSequence(ailgVar.c, ailgVar.d).toString());
        spannableString.setSpan(ailgVar.b, 0, spannableString.length(), 33);
        ClickableSpan clickableSpan = ailgVar.b;
        float f = ailgVar.e;
        float f2 = ailgVar.f;
        efbd.c();
        ahnp ahnpVar = this.a;
        ahnpVar.a();
        AppCompatTextView appCompatTextView = new AppCompatTextView(ahnpVar.a);
        appCompatTextView.setAlpha(0.0f);
        appCompatTextView.setTextSize(0, 1.0f);
        appCompatTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        appCompatTextView.setX(f);
        appCompatTextView.setY(f2);
        appCompatTextView.setFocusable(true);
        appCompatTextView.setFocusableInTouchMode(true);
        appCompatTextView.requestFocus();
        ahnpVar.a.addContentView(appCompatTextView, ahnpVar.b);
        ahnpVar.c = appCompatTextView;
        TextView textView = ahnpVar.c;
        textView.getClass();
        clickableSpan.onClick(textView);
        return ffcu.a;
    }
}
