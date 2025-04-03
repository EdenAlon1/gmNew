package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.promo.GppExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvg {
    public static final cfup a = cfvl.h(cfvl.b, "gpp_esi_top_view_learn_more_url", "https://support.google.com/messages/answer/7611075");

    public dbvg(GppExpressSignInTopView gppExpressSignInTopView, final ffbr ffbrVar, elbx elbxVar) {
        final Context context = gppExpressSignInTopView.getContext();
        TextView textView = (TextView) gppExpressSignInTopView.findViewById(R.id.how_it_works_link);
        textView.setOnClickListener(new elay(elbxVar, "GppExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: dbve
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cfup cfupVar = dbvg.a;
                ((akvg) ffbr.this.b()).y(context, (String) dbvg.a.e());
            }
        }));
        ScrollView scrollView = (ScrollView) gppExpressSignInTopView.findViewById(R.id.scroll_view);
        scrollView.addOnLayoutChangeListener(new dbvf(scrollView, textView));
    }
}
