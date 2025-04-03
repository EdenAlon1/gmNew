package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedMultiAutoCompleteTextView;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateContentGridLayout;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.ResultsFilterView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.chip.ChipGroup;
import defpackage.ekkz;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddmw extends ddma implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    private ddnj a;
    private boolean ah;
    private Context d;
    private final lkv e = new lkv(this);
    private final ells ag = new ells();

    @Deprecated
    public ddmw() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ddnj.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final ddnj H = H();
            final View inflate = layoutInflater.inflate(true != ((auyd) H.w.b()).a() ? R.layout.zero_state_search_fragment : R.layout.zero_state_search_fragment_coolranch, viewGroup, false);
            if (!((auyd) H.w.b()).a()) {
                View findViewById = inflate.findViewById(R.id.zero_state_search_box_container);
                findViewById.setBackgroundTintList(ColorStateList.valueOf(cwoj.c(findViewById.getContext())));
            }
            H.z = (ZeroStateSearchBox) inflate.findViewById(R.id.zero_state_search_box);
            final ZeroStateSearchBox zeroStateSearchBox = H.z;
            final ddqu ddquVar = H.c;
            zeroStateSearchBox.e = ddquVar;
            zeroStateSearchBox.f = H;
            zeroStateSearchBox.o = new ddnt(zeroStateSearchBox.getContext(), ddquVar);
            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView = zeroStateSearchBox.d;
            ddnt ddntVar = zeroStateSearchBox.o;
            dbws dbwsVar = spannedMultiAutoCompleteTextView.g;
            if (dbwsVar == null) {
                spannedMultiAutoCompleteTextView.g = new dbws(spannedMultiAutoCompleteTextView);
            } else {
                ListAdapter listAdapter = spannedMultiAutoCompleteTextView.j;
                if (listAdapter != null) {
                    listAdapter.unregisterDataSetObserver(dbwsVar);
                }
            }
            spannedMultiAutoCompleteTextView.j = ddntVar;
            ddvl ddvlVar = null;
            if (ddntVar != null) {
                spannedMultiAutoCompleteTextView.h = ddntVar.b;
                ddntVar.registerDataSetObserver(spannedMultiAutoCompleteTextView.g);
            } else {
                spannedMultiAutoCompleteTextView.h = null;
            }
            spannedMultiAutoCompleteTextView.d().a.setAdapter((ListAdapter) ddntVar);
            zeroStateSearchBox.d.k = new ddmt(ddquVar);
            if (ddquVar.m() == null) {
                zeroStateSearchBox.d.m = new ddmi(zeroStateSearchBox);
            }
            zeroStateSearchBox.d.setOnEditorActionListener(new elbm(zeroStateSearchBox.l, new TextView.OnEditorActionListener() { // from class: ddmj
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (keyEvent == null) {
                        csjy.n("BugleZeroStateSearch", "The event is null");
                        return false;
                    }
                    if (keyEvent.getAction() == 1) {
                        return false;
                    }
                    if (i != 3 && (keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0)) {
                        return false;
                    }
                    ZeroStateSearchBox zeroStateSearchBox2 = ZeroStateSearchBox.this;
                    csjy.c("BugleZeroStateSearch", "Triggering search since the user tapped on the enter key");
                    if (!zeroStateSearchBox2.o.isEmpty()) {
                        SearchFilterDataItem item = zeroStateSearchBox2.o.getItem(0);
                        if (item instanceof ContentFilterDataItem) {
                            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = zeroStateSearchBox2.d;
                            spannedMultiAutoCompleteTextView2.h(spannedMultiAutoCompleteTextView2.e(item));
                            return true;
                        }
                    }
                    ((ddpm) zeroStateSearchBox2.i.b()).a("Bugle.Search.UI.Filter.Clicked", 1);
                    zeroStateSearchBox2.k.d(7);
                    zeroStateSearchBox2.d.g();
                    zeroStateSearchBox2.i(zeroStateSearchBox2.getContext(), zeroStateSearchBox2);
                    zeroStateSearchBox2.k(3);
                    return true;
                }
            }, "ZeroStateSearchBox autoCompleteTextView onEditorActionListener"));
            zeroStateSearchBox.d.setOnTouchListener(new View.OnTouchListener() { // from class: ddmk
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    List list = (List) ddquVar.e().a();
                    if (list == null || !Collection.EL.stream(list).anyMatch(new Predicate() { // from class: ddmm
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((SearchFilterDataItem) obj) instanceof ConversationListFilterDataItem;
                        }
                    })) {
                        return false;
                    }
                    ZeroStateSearchBox.this.c();
                    return false;
                }
            });
            SpannedMultiAutoCompleteTextView spannedMultiAutoCompleteTextView2 = zeroStateSearchBox.d;
            final elbx elbxVar = zeroStateSearchBox.l;
            final AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: ddml
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    ZeroStateSearchBox zeroStateSearchBox2 = ZeroStateSearchBox.this;
                    SearchFilterDataItem item = zeroStateSearchBox2.o.getItem(i);
                    if (item instanceof FreeTextFilterDataItem) {
                        csjy.c("BugleZeroStateSearch", "Triggering search since the user tapped free text suggestion");
                        ((ddpm) zeroStateSearchBox2.i.b()).b(1);
                        zeroStateSearchBox2.k.f(4, 8);
                        zeroStateSearchBox2.k(3);
                        return;
                    }
                    if (item instanceof ContentFilterDataItem) {
                        int i2 = ((ContentFilterDataItem) item).a().a;
                        ((ddpm) zeroStateSearchBox2.i.b()).b(i2);
                        zeroStateSearchBox2.k.e(4, i2);
                    } else if (item instanceof ContactFilterDataItem) {
                        ((ddpm) zeroStateSearchBox2.i.b()).b(6);
                        zeroStateSearchBox2.k.f(4, 7);
                    } else if (item instanceof StarFilterDataItem) {
                        ((ddpm) zeroStateSearchBox2.i.b()).b(7);
                        zeroStateSearchBox2.k.f(4, 10);
                    }
                }
            };
            spannedMultiAutoCompleteTextView2.i = new AdapterView.OnItemClickListener() { // from class: elba
                public final /* synthetic */ String b = "ZeroStateSearchBox autoCompleteTextView onItemClickListener";

                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    elbx elbxVar2 = elbx.this;
                    AdapterView.OnItemClickListener onItemClickListener2 = onItemClickListener;
                    ekzm b = elbxVar2.b(this.b);
                    try {
                        onItemClickListener2.onItemClick(adapterView, view, i, j);
                        b.close();
                    } finally {
                    }
                }
            };
            if (ddquVar.o() instanceof ConversationFilterDataItem) {
                zeroStateSearchBox.d.setHint(R.string.zero_state_search_box_text_hint_in_conversation);
            }
            Bundle bundle2 = H.b.m;
            int i = 5;
            if (bundle2 != null) {
                String string = bundle2.getString(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
                if (string != null && !TextUtils.isEmpty(string)) {
                    H.z.d.setText(string, TextView.BufferType.EDITABLE);
                    H.z.k(5);
                }
                SearchFilterDataItem searchFilterDataItem = (SearchFilterDataItem) bundle2.getParcelable("search_filter_data_item");
                if (searchFilterDataItem != null) {
                    H.z.h(searchFilterDataItem);
                }
            }
            ZeroStateSearchResultsView zeroStateSearchResultsView = H.C;
            if (zeroStateSearchResultsView != null) {
                ddvm H2 = zeroStateSearchResultsView.H();
                vx vxVar = H2.p.o;
                if (vxVar != null) {
                    if (vxVar == H2.b) {
                        i = 1;
                    } else if (vxVar == H2.k) {
                        i = 4;
                    } else if (vxVar != H2.i) {
                        if (vxVar == H2.e.e) {
                            i = 2;
                        } else if (vxVar == H2.m) {
                            i = 6;
                        } else if (vxVar == H2.f.e) {
                            i = 3;
                        } else {
                            emxf.l(vxVar == H2.d);
                            i = 7;
                        }
                    }
                    ddvlVar = new ddvl(i, vxVar.R());
                } else {
                    ddvlVar = new ddvl(-1, null);
                }
            }
            H.C = (ZeroStateSearchResultsView) inflate.findViewById(R.id.zero_state_search_results);
            if (!((auxx) H.v.b()).a()) {
                inflate.setSystemUiVisibility(768);
            }
            inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ddnb
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    View findViewById2 = view.findViewById(R.id.zero_state_search_box_container);
                    if (!findViewById2.isLaidOut()) {
                        inflate.requestApplyInsets();
                        return windowInsets;
                    }
                    ddnj ddnjVar = ddnj.this;
                    int dimensionPixelSize = ddnjVar.b.B().getDimensionPixelSize(R.dimen.zero_state_search_box_margin_top);
                    int measuredHeight = view.findViewById(R.id.zero_state_search_box).getMeasuredHeight() + dimensionPixelSize;
                    view.setPadding(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), 0);
                    findViewById2.setTranslationY(windowInsets.getSystemWindowInsetTop() + dimensionPixelSize);
                    if (((auyd) ddnjVar.w.b()).a()) {
                        View findViewById3 = view.findViewById(R.id.zero_state_search_box_protection);
                        int i2 = dimensionPixelSize + measuredHeight;
                        findViewById3.setTranslationY(windowInsets.getSystemWindowInsetTop());
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewById3.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = i2;
                            findViewById3.setLayoutParams(layoutParams);
                        }
                    }
                    ddnjVar.c(view, windowInsets, measuredHeight, ddnjVar.b.B().getDimensionPixelSize(true != ((auyd) ddnjVar.w.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch), R.id.zero_state_search_results, R.dimen.zero_state_search_top_singe_results_margin);
                    ddnjVar.c(view, windowInsets, measuredHeight, 0, R.id.zero_state_search_multiple_result_container, R.dimen.zero_state_search_top_multi_results_margin);
                    ddnjVar.c(view, windowInsets, measuredHeight, 0, R.id.zero_state_search_home_group, true != ((auyd) ddnjVar.w.b()).a() ? R.dimen.zero_state_search_top_margin : R.dimen.zero_state_search_top_margin_coolranch);
                    ddnj.e(view, windowInsets, R.id.zero_state_search_results);
                    ddnj.e(view, windowInsets, R.id.zero_state_multiple_results_group);
                    ddnj.e(view, windowInsets, R.id.zero_state_search_home_group);
                    return windowInsets;
                }
            });
            ddvm H3 = H.C.H();
            ddqu ddquVar2 = H.c;
            lkr Q = H.b.Q();
            H3.a.k = ddquVar2;
            H3.g = new ddsz(H3.p.getContext());
            H3.e = new ddtd(H3.p.getContext(), H3.q, (ddpl) H3.v.b(), (ddwg) H3.r.b());
            H3.e.i = ddquVar2;
            H3.f = ((ddva) H3.u.b()).a(H3.p.getContext(), Q);
            H3.f.i = ddquVar2;
            H3.h = new ddsv(H3.p.getContext(), ddquVar2, H3.q, (ddpl) H3.v.b(), H3.x, Q, (ddtl) H3.s.b(), true);
            H3.j = new ddsh(H3.p.getContext(), Q, ddquVar2, (ddtl) H3.s.b(), H3.q, H3.x, (ddpl) H3.v.b(), true);
            H3.l = ((ddrl) H3.t.b()).a();
            ddtd ddtdVar = H3.e;
            dduz dduzVar = H3.f;
            H3.o = new ddsy(-1, new ddsx(ddtdVar, ddtdVar.e), new ddsx(dduzVar, dduzVar.e));
            if (((auyd) H3.x.b()).a()) {
                H3.p.w(((ddrn) H3.w.b()).a(ehdr.b(H3.p, R.attr.colorSurface), r3.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_large), r3.getDimensionPixelSize(R.dimen.containment_decoration_corner_radius_small), H3.p.getContext().getResources().getDimensionPixelSize(R.dimen.containment_decoration_item_offset), new ddro() { // from class: ddvk
                    @Override // defpackage.ddro
                    public final boolean a(wr wrVar) {
                        return (wrVar instanceof ddrj) || (wrVar instanceof dduc) || (wrVar instanceof dduh);
                    }
                }));
            }
            H.C.H().n = ddvlVar;
            H.D = inflate.findViewById(R.id.zero_state_search_no_results_group);
            H.E = inflate.findViewById(R.id.zero_state_search_empty_results_group);
            H.A = (ZeroStateSearchHomeView) inflate.findViewById(R.id.zero_state_search_home_group);
            ZeroStateSearchHomeView zeroStateSearchHomeView = H.A;
            ZeroStateSearchBox zeroStateSearchBox2 = H.z;
            zeroStateSearchHomeView.c = (ZeroStateContentGridLayout) zeroStateSearchHomeView.b.b();
            zeroStateSearchHomeView.a.setVisibility(8);
            ddop H4 = zeroStateSearchHomeView.c.H();
            zeroStateSearchBox2.getClass();
            H4.e = zeroStateSearchBox2;
            H.B = (ZeroStateSearchMultipleResultsView) inflate.findViewById(R.id.zero_state_multiple_results_group);
            ddve H5 = H.B.H();
            final ZeroStateSearchBox zeroStateSearchBox3 = H.z;
            ddqu ddquVar3 = H.c;
            lkr Q2 = H.b.Q();
            H5.j = zeroStateSearchBox3;
            ddud ddudVar = H5.m;
            if (ddudVar != null) {
                ddudVar.k = ddquVar3;
            }
            final ddtf H6 = H5.k.H();
            H6.f = ddquVar3;
            ChipGroup chipGroup = (ChipGroup) ((ResultsFilterView) H6.b.b()).findViewById(R.id.chip_group);
            for (int i2 = 0; i2 < chipGroup.getChildCount(); i2++) {
                chipGroup.getChildAt(i2).setOnClickListener(new elay((elbx) H6.d.b(), "ResultsFilterViewPeer#setOnClickListener", new View.OnClickListener() { // from class: ddte
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SearchFilterDataItem searchFilterDataItem2;
                        int id = view.getId();
                        ddtf ddtfVar = ddtf.this;
                        if (id == R.id.starred_chip) {
                            searchFilterDataItem2 = ((ddqh) ddtfVar.c.b()).f(false);
                            ((ddpl) ddtfVar.e.b()).f(16, 10);
                        } else {
                            Integer num = (Integer) ddtf.a.get(Integer.valueOf(view.getId()));
                            num.getClass();
                            ffbr ffbrVar = ddtfVar.c;
                            int intValue = num.intValue();
                            ContentFilterDataItem b = ((ddqh) ffbrVar.b()).b(new SearchQuery.ContentSearchFilter(intValue));
                            ((ddpl) ddtfVar.e.b()).e(16, intValue);
                            searchFilterDataItem2 = b;
                        }
                        zeroStateSearchBox3.h(searchFilterDataItem2);
                    }
                }));
            }
            H6.a();
            ddsz ddszVar = new ddsz(H5.h.getContext());
            H5.t = (RecyclerView) H5.h.findViewById(R.id.zero_state_search_photo_results);
            H5.t.setNestedScrollingEnabled(false);
            H5.t.w(ddszVar);
            H5.u = new ddtd(H5.h.getContext(), H5.b, (ddpl) H5.g.b(), (ddwg) H5.c.b());
            H5.t.ap(H5.u.e);
            ddtd ddtdVar2 = H5.u;
            int m = ddtdVar2.m();
            cxpo cxpoVar = new cxpo(ddtdVar2, m + m);
            H5.t.am(cxpoVar);
            H5.u.i = ddquVar3;
            H5.x = (RecyclerView) H5.h.findViewById(R.id.zero_state_search_video_results);
            H5.x.setNestedScrollingEnabled(false);
            H5.x.w(ddszVar);
            H5.y = ((ddva) H5.f.b()).a(H5.h.getContext(), Q2);
            H5.x.ap(H5.y.e);
            dduz dduzVar2 = H5.y;
            int m2 = dduzVar2.m();
            cxpo cxpoVar2 = new cxpo(dduzVar2, m2 + m2);
            H5.x.am(cxpoVar2);
            H5.y.i = ddquVar3;
            H5.B = (RecyclerView) H5.h.findViewById(R.id.zero_state_search_location_results);
            H5.B.setNestedScrollingEnabled(false);
            H5.C = new ddsv(H5.h.getContext(), ddquVar3, H5.b, (ddpl) H5.g.b(), H5.i, Q2, (ddtl) H5.d.b(), false);
            H5.h.getContext();
            H5.B.ap(new LinearLayoutManager());
            H5.B.am(new cxpo(H5.C, 2));
            H5.F = (RecyclerView) H5.h.findViewById(R.id.zero_state_search_link_results);
            H5.F.setNestedScrollingEnabled(false);
            H5.G = new ddsh(H5.h.getContext(), Q2, ddquVar3, (ddtl) H5.d.b(), H5.b, H5.i, (ddpl) H5.g.b(), false);
            H5.h.getContext();
            H5.F.ap(new LinearLayoutManager());
            H5.F.am(new cxpo(H5.G, 2));
            H5.N = new ddsy(2, new ddsx(cxpoVar, H5.u.e), new ddsx(cxpoVar2, H5.y.e));
            H5.J = (RecyclerView) H5.h.findViewById(R.id.zero_state_search_contact_results);
            H5.K = ((ddrl) H5.e.b()).a();
            RecyclerView recyclerView = H5.J;
            H5.h.getContext();
            recyclerView.ap(new LinearLayoutManager());
            H5.J.am(new cxpo(H5.K, 3));
            if (((auyd) H5.i.b()).a()) {
                H5.a(H5.J);
                H5.a(H5.p);
                H5.a(H5.l);
            }
            H.A.setVisibility(8);
            H.D.setVisibility(8);
            H.E.setVisibility(8);
            H.C.setVisibility(8);
            H.B.setVisibility(8);
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ddne
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    ddnj ddnjVar = ddnj.this;
                    alrv alrvVar = ddnjVar.i;
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener2 = ddnjVar.K;
                    alrvVar.f(ddrd.a);
                    if (onPreDrawListener2 == null) {
                        return true;
                    }
                    inflate.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener2);
                    ddnjVar.K = null;
                    return true;
                }
            };
            H.K = onPreDrawListener;
            inflate.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
            if (inflate == null) {
                ddnl.a(this, H());
            }
            ekyf.q();
            return inflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.e;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.d == null) {
            this.d = new ekkn(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ddma, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            ddnl.a(this, H());
            bm(view, bundle);
            final ddnj H = H();
            if (((auyd) H.w.b()).a()) {
                view.setBackgroundColor(ehdr.b(view, R.attr.colorSurfaceContainer));
            }
            H.c.g().f(H.b.Q(), new elhd(H.h, new llh() { // from class: ddmz
                @Override // defpackage.llh
                public final void a(Object obj) {
                    boolean z;
                    ddqj ddqjVar = (ddqj) obj;
                    int e = ddqjVar.e() - 1;
                    ddnj ddnjVar = ddnj.this;
                    if (e == 0) {
                        if (ddnjVar.d(ddnjVar.A)) {
                            ddnjVar.z.e(ddnjVar.b.G(), ddnjVar.A, ddnjVar.b.P());
                            return;
                        }
                        return;
                    }
                    if (e == 1) {
                        if (!ddnjVar.c.v() || !ddnjVar.J) {
                            ddnjVar.d(ddnjVar.D);
                            ddnjVar.g.g(2);
                            return;
                        }
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ddnjVar.E.getLayoutParams();
                        layoutParams.getClass();
                        layoutParams.addRule(3, R.id.zero_state_search_box_container);
                        ddnjVar.E.setLayoutParams(layoutParams);
                        if (ddnjVar.d(ddnjVar.E)) {
                            ddnjVar.z.e(ddnjVar.b.G(), ddnjVar.E, ddnjVar.b.P());
                        }
                        ddnjVar.g.g(3);
                        return;
                    }
                    if (e != 2) {
                        if (cbpb.k(ddqjVar.a())) {
                            ddnjVar.b(ddqjVar.a());
                            return;
                        }
                        ddve H2 = ddnjVar.B.H();
                        cbpb a = ddqjVar.a();
                        H2.k.H().a();
                        if (H2.m != null) {
                            H2.m.F(ddqjVar.b());
                            H2.b(H2.l, H2.n, H2.o, !((ddpo) r4).b.isEmpty(), 1);
                        }
                        H2.q.F(ddqjVar.b());
                        H2.b(H2.p, H2.r, H2.s, !((ddpo) ddqjVar.b()).a.isEmpty(), 7);
                        ddtd ddtdVar = H2.u;
                        if (ddtdVar != null) {
                            ddtdVar.G(a.d());
                            H2.b(H2.t, H2.v, H2.w, !r5.isEmpty(), 2);
                        }
                        dduz dduzVar = H2.y;
                        if (dduzVar != null) {
                            dduzVar.G(a.h());
                            H2.b(H2.x, H2.z, H2.A, !r5.isEmpty(), 3);
                        }
                        ddsv ddsvVar = H2.C;
                        if (ddsvVar != null) {
                            engw f = a.f();
                            ddsvVar.M(ddqjVar.d());
                            H2.b(H2.B, H2.D, H2.E, !f.isEmpty(), 5);
                            z = f.isEmpty();
                        } else {
                            z = true;
                        }
                        if (H2.G != null) {
                            List c = ddqjVar.c();
                            ddsh ddshVar = H2.G;
                            ddshVar.f = z;
                            ddshVar.M(c);
                            H2.b(H2.F, H2.H, H2.I, !c.isEmpty(), 4);
                        }
                        ddrk ddrkVar = H2.K;
                        if (ddrkVar != null) {
                            ddrkVar.m(a.c());
                            H2.b(H2.J, H2.L, H2.M, !r1.isEmpty(), 6);
                        }
                        ddnjVar.d(ddnjVar.B);
                        ddnjVar.g.h(5, ddqjVar.a());
                        return;
                    }
                    if (cbpb.k(ddqjVar.a())) {
                        ddnjVar.b(ddqjVar.a());
                        return;
                    }
                    ddvm H3 = ddnjVar.C.H();
                    cbpb a2 = ddqjVar.a();
                    boolean isEmpty = ((ddpo) ddqjVar.b()).b.isEmpty();
                    int i = R.dimen.zero_state_search_text_result_start_end_padding_coolranch;
                    if (isEmpty) {
                        cbmd cbmdVar = (cbmd) a2.b();
                        if (cbmdVar.a.getCount() > 0) {
                            H3.c.F(ddqjVar.b());
                            Cursor cursor = cbmdVar.a;
                            ZeroStateSearchResultsView zeroStateSearchResultsView = H3.p;
                            ddui dduiVar = H3.c;
                            int count = cursor.getCount();
                            if (zeroStateSearchResultsView.n != dduiVar) {
                                if (zeroStateSearchResultsView.gr() > 0) {
                                    H3.p.ae(H3.g);
                                }
                                int dimensionPixelSize = H3.p.getContext().getResources().getDimensionPixelSize(true != ((auyd) H3.x.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                ZeroStateSearchResultsView zeroStateSearchResultsView2 = H3.p;
                                zeroStateSearchResultsView2.setPadding(dimensionPixelSize, zeroStateSearchResultsView2.getPaddingTop(), dimensionPixelSize, zeroStateSearchResultsView2.getPaddingBottom());
                                H3.p.am(H3.c);
                                H3.p.ap(H3.d);
                                H3.a(1);
                            }
                            ((ddpm) H3.q.b()).g(1);
                            ((ddpm) H3.q.b()).f(1, count);
                        } else {
                            engw d = a2.d();
                            boolean isEmpty2 = d.isEmpty();
                            int i2 = R.dimen.zero_state_search_media_edge_margin;
                            if (isEmpty2) {
                                engw h = a2.h();
                                if (!h.isEmpty()) {
                                    H3.f.G(h);
                                    int size = h.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView3 = H3.p;
                                    if (zeroStateSearchResultsView3.n != H3.f) {
                                        if (zeroStateSearchResultsView3.gr() <= 0) {
                                            H3.p.w(H3.g);
                                        }
                                        int dimensionPixelSize2 = H3.p.getContext().getResources().getDimensionPixelSize(true != ((auyd) H3.x.b()).a() ? R.dimen.zero_state_search_media_edge_margin : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                        ZeroStateSearchResultsView zeroStateSearchResultsView4 = H3.p;
                                        zeroStateSearchResultsView4.setPadding(dimensionPixelSize2, zeroStateSearchResultsView4.getPaddingTop(), dimensionPixelSize2, zeroStateSearchResultsView4.getPaddingBottom());
                                        H3.p.am(H3.f);
                                        H3.p.ap(H3.f.e);
                                        H3.a(3);
                                    }
                                    ((ddpm) H3.q.b()).g(3);
                                    ((ddpm) H3.q.b()).f(3, size);
                                }
                                engw f2 = a2.f();
                                if (!f2.isEmpty()) {
                                    H3.h.M(ddqjVar.d());
                                    int size2 = f2.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView5 = H3.p;
                                    if (zeroStateSearchResultsView5.n != H3.h) {
                                        if (zeroStateSearchResultsView5.gr() > 0) {
                                            H3.p.ae(H3.g);
                                        }
                                        int dimensionPixelSize3 = H3.p.getContext().getResources().getDimensionPixelSize(true != ((auyd) H3.x.b()).a() ? R.dimen.zero_state_search_media_edge_margin : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                        ZeroStateSearchResultsView zeroStateSearchResultsView6 = H3.p;
                                        zeroStateSearchResultsView6.setPadding(dimensionPixelSize3, zeroStateSearchResultsView6.getPaddingTop(), dimensionPixelSize3, zeroStateSearchResultsView6.getPaddingBottom());
                                        H3.p.am(H3.h);
                                        H3.p.ap(H3.i);
                                        H3.a(5);
                                    }
                                    ((ddpm) H3.q.b()).g(5);
                                    ((ddpm) H3.q.b()).f(5, size2);
                                }
                                List c2 = ddqjVar.c();
                                if (!c2.isEmpty()) {
                                    H3.j.M(c2);
                                    int i3 = ((enou) c2).c;
                                    ZeroStateSearchResultsView zeroStateSearchResultsView7 = H3.p;
                                    if (zeroStateSearchResultsView7.n != H3.j) {
                                        if (zeroStateSearchResultsView7.gr() > 0) {
                                            H3.p.ae(H3.g);
                                        }
                                        Resources resources = H3.p.getContext().getResources();
                                        if (true == ((auyd) H3.x.b()).a()) {
                                            i2 = R.dimen.zero_state_search_text_result_start_end_padding_coolranch;
                                        }
                                        int dimensionPixelSize4 = resources.getDimensionPixelSize(i2);
                                        ZeroStateSearchResultsView zeroStateSearchResultsView8 = H3.p;
                                        zeroStateSearchResultsView8.setPadding(dimensionPixelSize4, zeroStateSearchResultsView8.getPaddingTop(), dimensionPixelSize4, zeroStateSearchResultsView8.getPaddingBottom());
                                        H3.p.am(H3.j);
                                        H3.p.ap(H3.k);
                                        H3.a(4);
                                    }
                                    ((ddpm) H3.q.b()).g(4);
                                    ((ddpm) H3.q.b()).f(4, i3);
                                }
                                engw c3 = a2.c();
                                if (!c3.isEmpty()) {
                                    H3.l.m(c3);
                                    int size3 = c3.size();
                                    ZeroStateSearchResultsView zeroStateSearchResultsView9 = H3.p;
                                    if (zeroStateSearchResultsView9.n != H3.l) {
                                        if (zeroStateSearchResultsView9.gr() > 0) {
                                            H3.p.ae(H3.g);
                                        }
                                        int dimensionPixelSize5 = H3.p.getContext().getResources().getDimensionPixelSize(true != ((auyd) H3.x.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                                        ZeroStateSearchResultsView zeroStateSearchResultsView10 = H3.p;
                                        zeroStateSearchResultsView10.setPadding(dimensionPixelSize5, zeroStateSearchResultsView10.getPaddingTop(), dimensionPixelSize5, zeroStateSearchResultsView10.getPaddingBottom());
                                        H3.p.am(H3.l);
                                        H3.p.ap(H3.m);
                                        H3.a(6);
                                    }
                                    ((ddpm) H3.q.b()).g(6);
                                    ((ddpm) H3.q.b()).f(6, size3);
                                }
                            } else {
                                H3.e.G(d);
                                int size4 = d.size();
                                ZeroStateSearchResultsView zeroStateSearchResultsView11 = H3.p;
                                if (zeroStateSearchResultsView11.n != H3.e) {
                                    if (zeroStateSearchResultsView11.gr() <= 0) {
                                        H3.p.w(H3.g);
                                    }
                                    Resources resources2 = H3.p.getContext().getResources();
                                    if (true != ((auyd) H3.x.b()).a()) {
                                        i = R.dimen.zero_state_search_media_edge_margin;
                                    }
                                    int dimensionPixelSize6 = resources2.getDimensionPixelSize(i);
                                    ZeroStateSearchResultsView zeroStateSearchResultsView12 = H3.p;
                                    zeroStateSearchResultsView12.setPadding(dimensionPixelSize6, zeroStateSearchResultsView12.getPaddingTop(), dimensionPixelSize6, zeroStateSearchResultsView12.getPaddingBottom());
                                    H3.p.am(H3.e);
                                    H3.p.ap(H3.e.e);
                                    H3.a(2);
                                }
                                ((ddpm) H3.q.b()).g(2);
                                ((ddpm) H3.q.b()).f(2, size4);
                            }
                        }
                    } else {
                        H3.a.F(ddqjVar.b());
                        engw engwVar = ((ddpo) ddqjVar.b()).b;
                        ZeroStateSearchResultsView zeroStateSearchResultsView13 = H3.p;
                        ddud ddudVar = H3.a;
                        int size5 = engwVar.size();
                        if (zeroStateSearchResultsView13.n != ddudVar) {
                            if (zeroStateSearchResultsView13.gr() > 0) {
                                H3.p.ae(H3.g);
                            }
                            int dimensionPixelSize7 = H3.p.getContext().getResources().getDimensionPixelSize(true != ((auyd) H3.x.b()).a() ? R.dimen.zero_state_search_text_result_start_end_padding : R.dimen.zero_state_search_text_result_start_end_padding_coolranch);
                            ZeroStateSearchResultsView zeroStateSearchResultsView14 = H3.p;
                            zeroStateSearchResultsView14.setPadding(dimensionPixelSize7, zeroStateSearchResultsView14.getPaddingTop(), dimensionPixelSize7, zeroStateSearchResultsView14.getPaddingBottom());
                            H3.p.am(H3.a);
                        }
                        H3.p.ap(H3.b);
                        H3.a(1);
                        ((ddpm) H3.q.b()).g(1);
                        ((ddpm) H3.q.b()).f(1, size5);
                    }
                    ddnjVar.d(ddnjVar.C);
                    ddnjVar.g.h(4, ddqjVar.a());
                }
            }, "ZeroStateSearchFragmentPeer#onViewCreated observer"));
            H.c.a().f(H.b.Q(), new llh() { // from class: ddna
                @Override // defpackage.llh
                public final void a(Object obj) {
                    if (((dvvw) obj).a.compareAndSet(false, true)) {
                        final ddnj ddnjVar = ddnj.this;
                        ddnjVar.I = ddnjVar.f.f().toEpochMilli() + ddnjVar.A.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: ddnd
                            @Override // java.lang.Runnable
                            public final void run() {
                                ddnj.this.A.setVisibility(8);
                            }
                        }).getDuration();
                    }
                }
            });
            ((arcs) H.m.b()).d();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ddma
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.ddma, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    ddqu aj = ((ddqf) ((fbas) ((ekki) ((akgo) aX).d.j.b()).a).aX()).aj();
                    aj.getClass();
                    ayfg ayfgVar = (ayfg) ((akgo) aX).b.an.b();
                    dede dedeVar = (dede) ((akgo) aX).a.b.iq.b();
                    cqoh cqohVar = (cqoh) ((akgo) aX).a.cz.b();
                    ddpl ddplVar = (ddpl) ((akgo) aX).a.b.N.b();
                    elhe elheVar = (elhe) ((akgo) aX).dK.b();
                    alrv alrvVar = (alrv) ((akgo) aX).a.a.ej.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    tam tamVar = (tam) ((akgo) aX).d.s.b();
                    fbbf fbbfVar = ((akgo) aX).t;
                    akhy akhyVar = ((akgo) aX).b;
                    fbbf fbbfVar2 = akhyVar.ao;
                    fbbf fbbfVar3 = akhyVar.aE;
                    eisx eisxVar = (eisx) akhyVar.b.b();
                    ejxn ejxnVar = (ejxn) ((akgo) aX).n.b();
                    fbbf fbbfVar4 = ((akgo) aX).eV;
                    akis akisVar = ((akgo) aX).a;
                    akko akkoVar = akisVar.b;
                    fbbf fbbfVar5 = akkoVar.fo;
                    fbbf fbbfVar6 = akkoVar.kY;
                    akkp akkpVar = akisVar.a;
                    this.a = new ddnj(eaVar, aj, ayfgVar, dedeVar, cqohVar, ddplVar, elheVar, alrvVar, ejlqVar, tamVar, fbbfVar, fbbfVar2, fbbfVar3, eisxVar, ejxnVar, fbbfVar4, fbbfVar5, fbbfVar6, akkpVar.fx, akkpVar.kp, ((akgo) aX).d.N, ((akgo) aX).c.l, akkpVar.RR, akkoVar.kZ);
                    this.Z.c(new ekkg(this.c, this.e));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            ddnj H = H();
            H.j.k(H.x);
            H.y = new ddni(H);
            H.j.k(H.y);
            H.F = H.b.B().getInteger(R.integer.zero_state_fade_in_duration);
            H.G = H.b.B().getInteger(R.integer.zero_state_fade_out_duration);
            H.H = H.b.B().getDimension(R.dimen.zero_state_content_in_animation_translation_y);
            H.M = true;
            Bundle bundle2 = H.b.m;
            if (bundle2 != null) {
                SearchFilterDataItem searchFilterDataItem = (SearchFilterDataItem) bundle2.getParcelable("base_search_filter_data_item");
                H.J = bundle2.getBoolean("conversation_contain_message");
                H.l.a = bundle2.getBoolean("is_bubble_activity", false);
                if (searchFilterDataItem != null) {
                    H.c.s(searchFilterDataItem);
                }
            }
            H.j.k(((arcs) H.m.b()).d);
            H.k.g(R.id.category_content_data_source, new ddod((ddoe) H.p.b()), new ddnf(H));
            ((aiha) H.u.b()).a();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            ddnj H = H();
            ddqu ddquVar = H.c;
            if (ddquVar != null && !H.M) {
                ddquVar.w(5);
            }
            H.M = false;
            ddpl ddplVar = H.g;
            ddplVar.f = ((aleq) ddplVar.d.b()).b(176571, null);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekhu
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ddnj H() {
        ddnj ddnjVar = this.a;
        if (ddnjVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ddnjVar;
    }

    @Override // defpackage.ddma, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
