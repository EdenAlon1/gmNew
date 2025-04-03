package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddtd extends ddsw {
    public ddqu i;
    public final ffbr j;
    public final ddpl k;
    private final ddwg l;

    public ddtd(Context context, ffbr ffbrVar, ddpl ddplVar, ddwg ddwgVar) {
        super(context, context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_photo_corner_radius));
        this.j = ffbrVar;
        this.k = ddplVar;
        this.l = ddwgVar;
    }

    @Override // defpackage.ddsw
    public final int F(boolean z) {
        return z ? 6 : 4;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        final ddtc ddtcVar = new ddtc(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_photo_result_item, viewGroup, false));
        ddtcVar.s.setOnClickListener(new View.OnClickListener() { // from class: ddtb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ddtd ddtdVar = ddtd.this;
                ddtdVar.i.u(new ddpq(2, ddtcVar.fr()));
                ((ddpm) ddtdVar.j.b()).e(2);
                ddtdVar.k.f(6, 3);
            }
        });
        return ddtcVar;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        ddtc ddtcVar = (ddtc) wrVar;
        ImageView imageView = ddtcVar.t;
        int bN = this.e.bN(ddtcVar.s);
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = bN;
        layoutParams.height = bN;
        MediaSearchResult mediaSearchResult = (MediaSearchResult) this.g.get(i);
        imageView.setContentDescription(this.l.a(mediaSearchResult, false));
        boolean o = mediaSearchResult.o();
        crly crlyVar = ddtcVar.u;
        if (!crlyVar.i()) {
            if (o) {
                o = true;
            }
            this.a.f(mediaSearchResult.h()).q(this.f.P(bN)).p(rff.c(this.h)).v(imageView);
        }
        ((ImageView) crlyVar.b()).setVisibility(true != o ? 8 : 0);
        this.a.f(mediaSearchResult.h()).q(this.f.P(bN)).p(rff.c(this.h)).v(imageView);
    }
}
