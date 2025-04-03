package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoy {
    public static final caoy a = new caoy();

    private caoy() {
    }

    public static final SpannableStringBuilder a(TextView textView, boolean z) {
        Context context = textView.getContext();
        String string = context.getString(R.string.details_link);
        string.getClass();
        String string2 = context.getString(R.string.rcs_chat_with_details, string);
        string2.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (z) {
            e(spannableStringBuilder, textView);
        }
        spannableStringBuilder.append((CharSequence) string2);
        f(spannableStringBuilder, textView, string);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder b(bcse bcseVar, TextView textView, boolean z, boolean z2) {
        String string;
        boolean z3;
        if (!z) {
            Context context = textView.getContext();
            String g = g(textView);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
            spannableStringBuilder.append((CharSequence) (h(bcseVar) ? context.getString(R.string.you_created_rcs_group_with_details, bcseVar.J(context), g) : context.getString(R.string.someone_else_created_rcs_group_with_details, bcseVar.P(false), bcseVar.J(context), g)));
            f(spannableStringBuilder, textView, g);
            return spannableStringBuilder;
        }
        Context context2 = textView.getContext();
        String g2 = g(textView);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("");
        e(spannableStringBuilder2, textView);
        if (!z2) {
            String g3 = g(textView);
            Context context3 = textView.getContext();
            fffs fffsVar = new fffs((byte[]) null);
            SelfIdentityId s = bcseVar.s();
            List<bcyy> list = bcseVar.i;
            if (list == null || s == null) {
                z3 = false;
            } else {
                z3 = false;
                for (bcyy bcyyVar : list) {
                    if (ffkj.e(bcyyVar.a, ((SelfIdentityIdImpl) s).a)) {
                        z3 = true;
                    } else {
                        String str = bcyyVar.b;
                        if (str == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        fffsVar.add(cuxh.b(str));
                    }
                }
            }
            List a2 = ffdx.a(fffsVar);
            if (z3) {
                fffs fffsVar2 = (fffs) a2;
                int i = fffsVar2.c;
                string = i != 0 ? i != 1 ? textView.getContext().getString(R.string.you_and_multiple_others_joined_group_with_details, String.valueOf(fffsVar2.c), g(textView)) : textView.getContext().getString(R.string.you_and_one_person_joined_group_with_details, a2.get(0), g(textView)) : textView.getContext().getString(R.string.you_joined_group_with_details, g(textView));
                string.getClass();
            } else {
                string = context3.getString(R.string.participant_joined_group_with_details, cuxt.c(textView.getResources(), a2), g3);
                string.getClass();
            }
        } else if (h(bcseVar)) {
            string = context2.getString(R.string.you_created_encrypted_rcs_group_with_details, bcseVar.J(context2), g2);
            string.getClass();
        } else {
            string = context2.getString(R.string.someone_else_created_encrypted_rcs_group_with_details, bcseVar.P(false), bcseVar.J(context2), g2);
            string.getClass();
        }
        spannableStringBuilder2.append((CharSequence) string);
        f(spannableStringBuilder2, textView, g2);
        return spannableStringBuilder2;
    }

    public static final SpannableStringBuilder c(TextView textView, bcse bcseVar, boolean z) {
        Context context = textView.getContext();
        String g = g(textView);
        String string = context.getString(R.string.chatting_tombstone_with_details, bcseVar.J(context), g);
        string.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (z) {
            e(spannableStringBuilder, textView);
        }
        spannableStringBuilder.append((CharSequence) string);
        f(spannableStringBuilder, textView, g);
        return spannableStringBuilder;
    }

    private static final void e(SpannableStringBuilder spannableStringBuilder, TextView textView) {
        Drawable drawable = textView.getContext().getDrawable(R.drawable.ic_lock_outline_black_12dp);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.setTint(textView.getCurrentTextColor());
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), 0, 1, 34);
    }

    private static final void f(SpannableStringBuilder spannableStringBuilder, final TextView textView, String str) {
        crmi.d(textView.getContext(), spannableStringBuilder, str, new View.OnClickListener() { // from class: caox
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ellj.g(new caqj(), textView);
            }
        });
        egyl.b(textView);
        egyl.d(textView, LinkMovementMethod.getInstance());
    }

    private static final String g(TextView textView) {
        String string = textView.getContext().getString(R.string.details_link);
        string.getClass();
        return string;
    }

    private static final boolean h(bcse bcseVar) {
        SelfIdentityId s = bcseVar.s();
        return TextUtils.equals(s != null ? ((SelfIdentityIdImpl) s).a : null, bcseVar.I());
    }
}
