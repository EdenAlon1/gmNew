package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czol {
    public final czoj a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final String g;
    public bcxr h;

    public czol(czoj czojVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, String str) {
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = czojVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = str;
    }

    public final CharSequence a(Context context, int i, int i2) {
        String string = context.getResources().getString(R.string.rbm_settings);
        string.getClass();
        String string2 = context.getResources().getString(R.string.rbm_unavailable_body, Integer.valueOf(i), Integer.valueOf(i2), string);
        string2.getClass();
        if (i == 0) {
            string2 = context.getResources().getString(R.string.rbm_no_rcs_body, string);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int Y = ffpc.Y(string2, string);
        spannableStringBuilder.setSpan(new czok(this, context), Y, string.length() + Y, 17);
        return spannableStringBuilder;
    }
}
