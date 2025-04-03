package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddve extends ddvf {
    public final TextView A;
    public RecyclerView B;
    public ddsv C;
    public final TextView D;
    public final TextView E;
    public RecyclerView F;
    public ddsh G;
    public final TextView H;
    public final TextView I;
    public RecyclerView J;
    public ddrk K;
    public final TextView L;
    public final TextView M;
    public ddsy N;
    private final ffbr P;
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ZeroStateSearchMultipleResultsView h;
    public final ffbr i;
    public ddqp j;
    public final ResultsFilterView k;
    public final RecyclerView l;
    public final ddud m;
    public final TextView n;
    public final TextView o;
    public final RecyclerView p;
    public final ddui q;
    public final TextView r;
    public final TextView s;
    public RecyclerView t;
    public ddtd u;
    public final TextView v;
    public final TextView w;
    public RecyclerView x;
    public dduz y;
    public final TextView z;

    public ddve(ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        this.h = zeroStateSearchMultipleResultsView;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar7;
        this.f = ffbrVar8;
        this.g = ffbrVar9;
        this.P = ffbrVar10;
        this.i = ffbrVar11;
        this.k = (ResultsFilterView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_results_filter);
        this.n = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_header);
        TextView textView = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_see_all);
        this.o = textView;
        c(textView, 1);
        RecyclerView recyclerView = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_chat_results);
        this.l = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        zeroStateSearchMultipleResultsView.getContext();
        recyclerView.ap(new LinearLayoutManager());
        ddud a = ((ddue) ffbrVar6.b()).a(zeroStateSearchMultipleResultsView.getContext());
        this.m = a;
        recyclerView.am(new cxpo(a, 3));
        this.r = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_header);
        TextView textView2 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_see_all);
        this.s = textView2;
        c(textView2, 7);
        RecyclerView recyclerView2 = (RecyclerView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_starred_text_results);
        this.p = recyclerView2;
        recyclerView2.setNestedScrollingEnabled(false);
        ddui a2 = ((dduj) ffbrVar5.b()).a(zeroStateSearchMultipleResultsView.getContext());
        this.q = a2;
        zeroStateSearchMultipleResultsView.getContext();
        recyclerView2.ap(new LinearLayoutManager());
        recyclerView2.am(new cxpo(a2, 3));
        this.v = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_photo_header);
        TextView textView3 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_photo_see_all);
        this.w = textView3;
        c(textView3, 2);
        this.z = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_video_header);
        TextView textView4 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_video_see_all);
        this.A = textView4;
        c(textView4, 3);
        this.D = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_locations_header);
        TextView textView5 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_locations_see_all);
        this.E = textView5;
        c(textView5, 5);
        this.H = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_links_header);
        TextView textView6 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_links_see_all);
        this.I = textView6;
        c(textView6, 4);
        this.L = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_contact_header);
        TextView textView7 = (TextView) zeroStateSearchMultipleResultsView.findViewById(R.id.zero_state_search_contact_see_all);
        this.M = textView7;
        c(textView7, 6);
    }

    private final void c(View view, final int i) {
        view.setOnClickListener(new View.OnClickListener() { // from class: ddvd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ddve ddveVar = ddve.this;
                ddpm ddpmVar = (ddpm) ddveVar.b.b();
                int i2 = i;
                ddpmVar.a("Bugle.Search.Result.See.All.Clicked", i2);
                ((ddpl) ddveVar.g.b()).e(5, i2);
                ddveVar.j.h(((ddqh) ddveVar.a.b()).b(new SearchQuery.ContentSearchFilter(i2)));
            }
        });
    }

    public final void a(RecyclerView recyclerView) {
        recyclerView.w(((ddrn) this.P.b()).a(ehdr.b(recyclerView, R.attr.colorSurface), r0.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_large), r0.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_small), this.h.getContext().getResources().getDimensionPixelSize(R.dimen.containment_decoration_item_offset), new ddro() { // from class: ddvc
            @Override // defpackage.ddro
            public final boolean a(wr wrVar) {
                return (wrVar instanceof ddrj) || (wrVar instanceof dduc) || (wrVar instanceof dduh);
            }
        }));
    }

    public final void b(RecyclerView recyclerView, View view, TextView textView, boolean z, int i) {
        int i2;
        boolean z2;
        if (recyclerView == null || view == null || textView == null) {
            return;
        }
        if (!z) {
            recyclerView.setVisibility(8);
            view.setVisibility(8);
            textView.setVisibility(8);
            return;
        }
        recyclerView.setVisibility(0);
        view.setVisibility(0);
        vk vkVar = recyclerView.n;
        int a = vkVar == null ? 0 : vkVar.a();
        if (vkVar instanceof cxpo) {
            cxpo cxpoVar = (cxpo) vkVar;
            int i3 = cxpoVar.d;
            i2 = cxpoVar.a.a();
            z2 = i2 > i3;
            if (z2) {
                textView.setText(R.string.zero_state_search_see_all_v2);
            }
        } else {
            i2 = a;
            z2 = false;
        }
        textView.setVisibility(true == z2 ? 0 : 8);
        ((ddpm) this.b.b()).g(i);
        ((ddpm) this.b.b()).f(i, i2);
    }
}
