package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyi {
    public static Uri a(String str, Context context) {
        return Uri.parse(str).buildUpon().appendQueryParameter("hl", ctid.c(context).getLanguage()).build();
    }

    public static SpannableStringBuilder b(final Context context, final ffbr ffbrVar, final ffbr ffbrVar2, String str, String str2, final cfva cfvaVar, final cfva cfvaVar2) {
        return e(context, str, str2, new View.OnClickListener() { // from class: ddyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cfva cfvaVar3 = cfva.this;
                Context context2 = context;
                if (cfvaVar3 != null && !TextUtils.isEmpty((CharSequence) cfvaVar3.e())) {
                    ((adtc) ffbrVar2.b()).e(context2, (String) cfvaVar3.e());
                    return;
                }
                cfva cfvaVar4 = cfvaVar2;
                if (cfvaVar4 == null || TextUtils.isEmpty((CharSequence) cfvaVar4.e())) {
                    return;
                }
                ((akvg) ffbrVar.b()).y(context2, (String) cfvaVar4.e());
            }
        });
    }

    public static SpannableStringBuilder c(Context context, ffbr ffbrVar, ffbr ffbrVar2, int i, cfva cfvaVar, cfva cfvaVar2) {
        String a = crmi.a(context);
        return b(context, ffbrVar, ffbrVar2, context.getString(i, a), a, cfvaVar, cfvaVar2);
    }

    public static SpannableStringBuilder d(Context context, int i) {
        String a = crmi.a(context);
        return e(context, context.getString(i, a), a, null);
    }

    public static SpannableStringBuilder e(Context context, String str, String str2, View.OnClickListener onClickListener) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        crmi.d(context, spannableStringBuilder, str2, onClickListener);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f(Context context, String str, String str2) {
        return e(context, str, str2, null);
    }
}
