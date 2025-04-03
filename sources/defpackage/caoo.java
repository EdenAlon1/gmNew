package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoo implements cbuv {
    private final Context a;

    public caoo(Context context) {
        this.a = context;
    }

    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        if (bcseVar.f() == 216) {
            Context context = this.a;
            return context.getString(R.string.e2ee_conversation_tombstone_v2, bcseVar.J(context));
        }
        String V = bcseVar.V(this.a);
        return V == null ? "" : V;
    }

    @Override // defpackage.cbuv
    public final void b(View view, TextView textView, bcse bcseVar, int i) {
        if (c(bcseVar)) {
            Context context = textView.getContext();
            if (bcseVar.f() == 216) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
                Drawable drawable = context.getDrawable(R.drawable.ic_lock_outline_black_12dp);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setTint(i);
                    spannableStringBuilder.setSpan(new cuxx(drawable), 0, 1, 34);
                }
                spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_conversation_tombstone_v2, bcseVar.J(context)));
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(bcseVar.V(context));
            }
            textView.setTextColor(i);
            if (bzwd.b()) {
                return;
            }
            textView.setPadding(0, 0, 0, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_min_height);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_top_padding);
            view.setMinimumHeight(dimensionPixelSize);
            view.setPadding(0, dimensionPixelSize2, 0, 0);
        }
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        int f = bcseVar.f();
        if (bzwd.f()) {
            return f == 216 || f == 215 || f == 214;
        }
        return false;
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return (bzwd.b() || z) ? false : true;
    }
}
