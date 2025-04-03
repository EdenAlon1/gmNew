package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drzx extends wr {
    public static final /* synthetic */ int v = 0;
    public final View s;
    public final ffbz t;
    final /* synthetic */ drzy u;
    private final ffbz w;
    private final ffbz x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drzx(drzy drzyVar, View view) {
        super(view);
        this.u = drzyVar;
        this.s = view;
        this.w = ffca.a(new ffix() { // from class: drzs
            @Override // defpackage.ffix
            public final Object invoke() {
                return (TextView) drzx.this.s.findViewById(R.id.proxy_screen_search_row_text);
            }
        });
        this.t = ffca.a(new ffix() { // from class: drzt
            @Override // defpackage.ffix
            public final Object invoke() {
                return (ImageView) drzx.this.s.findViewById(R.id.proxy_screen_search_row_start_icon);
            }
        });
        this.x = ffca.a(new ffix() { // from class: drzu
            @Override // defpackage.ffix
            public final Object invoke() {
                return (ImageView) drzx.this.s.findViewById(R.id.proxy_screen_search_row_end_icon);
            }
        });
    }

    private final ImageView D() {
        Object a = this.x.a();
        a.getClass();
        return (ImageView) a;
    }

    public final void C(String str, final drzq drzqVar) {
        str.getClass();
        drzqVar.getClass();
        Object a = this.w.a();
        a.getClass();
        TextView textView = (TextView) a;
        SpannableString spannableString = new SpannableString(drzqVar.b());
        int Q = ffpc.Q(spannableString, str, 0, false, 6);
        dtbz dtbzVar = this.u.a;
        if (Q > 0) {
            spannableString.setSpan(dtbzVar.a(), 0, Q, 33);
        }
        if (Q >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(((Number) dtbzVar.a.a()).intValue()), Q, str.length() + Q, 33);
            if (spannableString.length() > str.length() + Q) {
                spannableString.setSpan(dtbzVar.a(), Q + str.length(), spannableString.length(), 33);
            }
        } else {
            spannableString.setSpan(dtbzVar.a(), 0, spannableString.length(), 33);
        }
        textView.setText(spannableString);
        ImageView D = D();
        final drzy drzyVar = this.u;
        D.setContentDescription(D().getContext().getString(R.string.search_end_icon_content_description_with_search_term, drzqVar.b()));
        D.setOnClickListener(drzyVar.d.b("SearchRowsAdapter.ViewHolder#onEndIconClick", new View.OnClickListener() { // from class: drzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = drzx.v;
                drzy.this.f.invoke(drzqVar.b());
            }
        }));
        D.setRotation(true != dslh.f(D) ? -45.0f : 45.0f);
    }
}
