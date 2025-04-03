package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caoq implements cbuv {
    private final Context a;

    public caoq(Context context, asnt asntVar) {
        context.getClass();
        asntVar.getClass();
        this.a = context;
    }

    private static final String e(bcse bcseVar) {
        cfva cfvaVar = aoqm.a;
        if (((Boolean) new aooy().get()).booleanValue()) {
            String str = bcseVar.bg().a;
            str.getClass();
            return str;
        }
        String O = bcseVar.O();
        O.getClass();
        return O;
    }

    @Override // defpackage.cbuv
    public final String a(bcse bcseVar) {
        bcseVar.getClass();
        if (bcseVar.f() != 224) {
            String V = bcseVar.V(this.a);
            return V == null ? "" : V;
        }
        String string = this.a.getString(R.string.e2ee_conversation_tombstone_v2, e(bcseVar));
        string.getClass();
        return string;
    }

    @Override // defpackage.cbuv
    public final void b(View view, TextView textView, bcse bcseVar, int i) {
        textView.getClass();
        bcseVar.getClass();
        if (c(bcseVar)) {
            if (bcseVar.f() == 224) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
                Drawable drawable = this.a.getDrawable(R.drawable.ic_lock_outline_black_12dp);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setTint(i);
                    spannableStringBuilder.setSpan(new cuxx(drawable), 0, 1, 34);
                }
                String string = this.a.getString(R.string.chatting_conversation_tombstone_v2, e(bcseVar));
                string.getClass();
                spannableStringBuilder.append((CharSequence) string);
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(bcseVar.V(this.a));
            }
            textView.setTextColor(i);
            textView.setPadding(0, 0, 0, 0);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_min_height);
            int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_top_padding);
            view.setMinimumHeight(dimensionPixelSize);
            view.setPadding(0, dimensionPixelSize2, 0, 0);
        }
    }

    @Override // defpackage.cbuv
    public final boolean c(bcse bcseVar) {
        bcseVar.getClass();
        int f = bcseVar.f();
        if (bzwd.f()) {
            return f == 222 || f == 223 || f == 224;
        }
        return false;
    }

    @Override // defpackage.cbuv
    public final boolean d(boolean z) {
        return !z;
    }
}
