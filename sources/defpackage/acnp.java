package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.gaia.gaiapairingsignin.GpWebTabletExpressSignInTopView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acnp {
    public static final cfup a = cfvl.h(cfvl.b, "gp_tablet_esi_top_view_learn_more_url", "https://support.google.com/messages/answer/7611075");
    public final ffbr b;
    public final ffbr c;
    public final ffsk d;
    private final GpWebTabletExpressSignInTopView e;
    private final ffbr f;
    private final elbx g;

    /* JADX WARN: Multi-variable type inference failed */
    public acnp(GpWebTabletExpressSignInTopView gpWebTabletExpressSignInTopView, ffbr ffbrVar, ffbr ffbrVar2, elbx elbxVar, ffbr ffbrVar3, ffsk ffskVar) {
        elbxVar.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.e = gpWebTabletExpressSignInTopView;
        this.f = ffbrVar;
        this.b = ffbrVar2;
        this.g = elbxVar;
        this.c = ffbrVar3;
        this.d = ffskVar;
        final Context context = gpWebTabletExpressSignInTopView.getContext();
        TextView textView = (TextView) gpWebTabletExpressSignInTopView.findViewById(R.id.how_it_works_link);
        textView.setOnClickListener(new elay(elbxVar, "GpWebTabletExpressSignInTopViewPeer#clickHowItWorks", new View.OnClickListener() { // from class: acnl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((akvg) acnp.this.b.b()).y(context, (String) acnp.a.e());
            }
        }));
        ScrollView scrollView = (ScrollView) gpWebTabletExpressSignInTopView.findViewById(R.id.scroll_view);
        scrollView.addOnLayoutChangeListener(new acnm(scrollView, textView));
        Activity activity = (Activity) ffbrVar.b();
        if (activity instanceof abe) {
            ((abe) activity).gE().b((lkr) activity, new acno(this, activity));
        }
    }
}
