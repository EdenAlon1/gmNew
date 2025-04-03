package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caon implements cbuv {
    final Context a;
    final ffbr b;
    final bzqa c;
    final adsd d;

    public caon(Context context, ffbr ffbrVar, bzqa bzqaVar, adsd adsdVar) {
        this.a = context;
        this.b = ffbrVar;
        this.c = bzqaVar;
        this.d = adsdVar;
    }

    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        if (TextUtils.isEmpty((String) bzwd.t.e())) {
            Context context = this.a;
            return context.getString(R.string.e2ee_conversation_tombstone_v2, bcseVar.J(context));
        }
        Context context2 = this.a;
        return context2.getString(R.string.e2ee_conversation_tombstone_with_learn_more_v2, bcseVar.J(context2), crmi.a(context2));
    }

    @Override // defpackage.cbuv
    public final void b(View view, TextView textView, bcse bcseVar, int i) {
        if (c(bcseVar)) {
            final Context context = textView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
            Drawable drawable = context.getDrawable(R.drawable.ic_lock_outline_black_12dp);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.setTint(textView.getCurrentTextColor());
                spannableStringBuilder.setSpan(new cuxx(drawable), 0, 1, 34);
            }
            final String str = (String) bzwd.t.e();
            if (TextUtils.isEmpty(str)) {
                spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_conversation_tombstone_v2, bcseVar.J(context)));
            } else {
                String a = crmi.a(context);
                spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_tombstone_with_details, bcseVar.J(context), a));
                crmi.d(textView.getContext(), spannableStringBuilder, a, new View.OnClickListener() { // from class: caom
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ((akvg) caon.this.b.b()).y(context, str);
                    }
                });
                egyl.b(textView);
                egyl.d(textView, LinkMovementMethod.getInstance());
                if (this.c.l()) {
                    textView.setTag(R.id.growthkit_view_tag, "etouffee_initialization_tombstone");
                    this.d.a(18);
                }
            }
            textView.setText(spannableStringBuilder);
        }
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        int f = bcseVar.f();
        return f == 213 ? bzwd.f() && !bzwd.b() : f == 219 && bzwd.f();
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return false;
    }
}
