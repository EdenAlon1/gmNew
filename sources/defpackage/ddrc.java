package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrc extends lml implements ddqu {
    public static final entd a = entd.c("BugleSearch");
    public final cbnj b;
    public final ddqh c;
    public final azze d;
    public final ddpt e;
    public SelectedSearchResult f;
    public SearchFilterDataItem g;
    public final llg h;
    private final cbop i;
    private final cbmp j;
    private ddrb k;
    private ecri l;
    private final daxg m;
    private final errl n;
    private final ddpl o;
    private final alrv p;
    private final Locale q;
    private final ffbr r;
    private final ArrayList s;
    private boolean t;
    private final llg u;
    private final llg v;
    private final llg w;
    private final ddqe x;
    private final ddqa y;

    public ddrc(Context context, cbnj cbnjVar, cbop cbopVar, cbmp cbmpVar, ddqh ddqhVar, ddqe ddqeVar, ddqa ddqaVar, azze azzeVar, daxg daxgVar, errl errlVar, ddpt ddptVar, ddpl ddplVar, alrv alrvVar, ffbr ffbrVar) {
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        llg llgVar = new llg();
        this.u = llgVar;
        llg llgVar2 = new llg();
        this.v = llgVar2;
        this.h = new llg();
        this.w = new llg();
        this.i = cbopVar;
        this.j = cbmpVar;
        this.c = ddqhVar;
        this.x = ddqeVar;
        this.y = ddqaVar;
        this.d = azzeVar;
        this.m = daxgVar;
        this.n = errlVar;
        this.e = ddptVar;
        this.o = ddplVar;
        this.p = alrvVar;
        this.r = ffbrVar;
        this.q = ctid.c(context);
        llgVar.m(arrayList);
        this.b = cbnjVar;
        F(llgVar2, ddqj.g());
    }

    private final int D() {
        for (int i = 0; i < this.s.size(); i++) {
            if (this.s.get(i) instanceof FreeTextFilterDataItem) {
                return i;
            }
        }
        return -1;
    }

    private final engw E(boolean z) {
        int i = engw.d;
        engr engrVar = new engr();
        SearchFilterDataItem searchFilterDataItem = this.g;
        if (searchFilterDataItem != null) {
            engrVar.h(searchFilterDataItem.a());
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SearchFilterDataItem searchFilterDataItem2 = (SearchFilterDataItem) arrayList.get(i2);
            if (!z || !(searchFilterDataItem2 instanceof FreeTextFilterDataItem)) {
                engrVar.h(searchFilterDataItem2.a());
            }
        }
        return engrVar.g();
    }

    private static void F(llg llgVar, ddqj ddqjVar) {
        ddqj ddqjVar2 = (ddqj) llgVar.a();
        llgVar.m(ddqjVar);
        if (ddqjVar2 != null) {
            final Cursor cursor = ((cbmd) ddqjVar2.a().a()).a;
            final Cursor cursor2 = ((cbmd) ddqjVar2.a().b()).a;
            efbd.d(new Runnable() { // from class: ddqv
                @Override // java.lang.Runnable
                public final void run() {
                    cursor.close();
                }
            }, 1000L);
            efbd.d(new Runnable() { // from class: ddqv
                @Override // java.lang.Runnable
                public final void run() {
                    cursor2.close();
                }
            }, 1000L);
        }
    }

    private final void G(ecrh ecrhVar) {
        ecri ecriVar = this.l;
        if (ecriVar != null) {
            this.p.R.h(ecriVar, ddrd.b, ecrhVar);
            this.l = null;
        }
    }

    private final void H(final int i) {
        efbd.c();
        entd entdVar = a;
        ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 579, "ZeroStateSearchPresenterImpl.java")).q("Search for results.");
        FreeTextFilterDataItem y = y();
        if (y != null && this.m.a(y.a().a)) {
            ((ensz) entdVar.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 581, "ZeroStateSearchPresenterImpl.java")).q("Search query is a debug hook.");
            return;
        }
        ddrb ddrbVar = this.k;
        if (ddrbVar != null) {
            ddrbVar.a.cancel();
            ddrbVar.b = true;
            ((ensz) ((ensz) entdVar.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 588, "ZeroStateSearchPresenterImpl.java")).q("Concurrent search, cancelling previous request.");
            this.k = null;
            G(ecrh.CANCEL);
        }
        if (this.s.isEmpty() && this.g == null) {
            C(ddqj.g());
            B();
            return;
        }
        final engw E = E(!this.t);
        this.l = this.p.a();
        final ddpl ddplVar = this.o;
        elfo.g(new Callable() { // from class: ddph
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ddpl ddplVar2 = ddpl.this;
                if (!((altk) ddplVar2.b.b()).am()) {
                    ddpl.a.m("Clearcut loggings are disabled.");
                    return true;
                }
                List list = E;
                int i2 = i;
                epiq epiqVar = (epiq) epis.a.createBuilder();
                epiqVar.copyOnWrite();
                epis episVar = (epis) epiqVar.instance;
                episVar.c = i2 - 1;
                episVar.b |= 1;
                epit epitVar = (epit) epiu.a.createBuilder();
                enqv it = ((engw) list).iterator();
                while (it.hasNext()) {
                    SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) it.next();
                    if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                        epitVar.copyOnWrite();
                        epiu epiuVar = (epiu) epitVar.instance;
                        epiuVar.b |= 4;
                        epiuVar.e = true;
                    } else if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                        epitVar.copyOnWrite();
                        epiu epiuVar2 = (epiu) epitVar.instance;
                        epiuVar2.b |= 2;
                        epiuVar2.d = true;
                    } else if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                        epitVar.copyOnWrite();
                        epiu epiuVar3 = (epiu) epitVar.instance;
                        epiuVar3.b |= 1;
                        epiuVar3.c = true;
                    } else if (searchFilter instanceof SearchQuery.ContentSearchFilter) {
                        int c = ddpl.c(((SearchQuery.ContentSearchFilter) searchFilter).a);
                        epitVar.copyOnWrite();
                        epiu epiuVar4 = (epiu) epitVar.instance;
                        epiuVar4.f = c - 1;
                        epiuVar4.b |= 8;
                    } else if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                        epitVar.copyOnWrite();
                        epiu epiuVar5 = (epiu) epitVar.instance;
                        epiuVar5.b |= 16;
                        epiuVar5.g = true;
                    }
                }
                epiu epiuVar6 = (epiu) epitVar.build();
                epiqVar.copyOnWrite();
                epis episVar2 = (epis) epiqVar.instance;
                epiuVar6.getClass();
                episVar2.d = epiuVar6;
                episVar2.b |= 2;
                epis episVar3 = (epis) epiqVar.build();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.SEARCH_QUERY;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b = 1 | eolvVar.b;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                episVar3.getClass();
                eolvVar2.ap = episVar3;
                eolvVar2.d |= 256;
                ((akxl) ddplVar2.c.b()).j(eoluVar);
                return true;
            }
        }, ddplVar.e).k(axou.a(new ddpi()), erpp.a);
        final ddrb ddrbVar2 = new ddrb(this);
        this.k = ddrbVar2;
        axnw.a(this.b.b(x(E, true, ddrbVar2.a), ddrbVar2.a).i(new eroh() { // from class: ddqw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cbpb cbpbVar = (cbpb) obj;
                if (cbpbVar.i() != 1) {
                    return elfo.e(cbpbVar);
                }
                ddrb ddrbVar3 = ddrbVar2;
                engw engwVar = E;
                ddrc ddrcVar = ddrc.this;
                return ddrcVar.b.b(ddrcVar.x(engwVar, false, ddrbVar3.a), ddrbVar3.a);
            }
        }, this.n).h(new emwl() { // from class: ddqx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cbpb cbpbVar = (cbpb) obj;
                entd entdVar2 = ddrc.a;
                ddrb ddrbVar3 = ddrb.this;
                boolean z = true;
                if (ddrbVar3.b) {
                    if (cbpbVar != null) {
                        ((cbmd) cbpbVar.a()).a.close();
                        ((cbmd) cbpbVar.b()).a.close();
                    }
                } else if (cbpbVar == null) {
                    ((ensz) ((ensz) ddrc.a.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl$CancelableSearchResultsHandler", "getSearchResultsToViewStateTransform", 709, "ZeroStateSearchPresenterImpl.java")).q("No results.");
                    ddrbVar3.c.B();
                    ddrbVar3.c.C(ddqj.f());
                    z = false;
                } else {
                    int i2 = cbpbVar.i();
                    if (i2 == 0) {
                        ((ensz) ((ensz) ddrc.a.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl$CancelableSearchResultsHandler", "getSearchResultsToViewStateTransform", 717, "ZeroStateSearchPresenterImpl.java")).q("Asking view to go to the no results screen.");
                        ddrbVar3.c.B();
                        ddrbVar3.c.C(ddqj.f());
                    } else {
                        ddrc ddrcVar = ddrbVar3.c;
                        FreeTextFilterDataItem y2 = ddrcVar.y();
                        String str = y2 == null ? "" : y2.a().a;
                        ddpp ddppVar = i2 == 1 ? new ddpp(cbpbVar, 3, ddrcVar.e.a(cbpbVar, str), ddrcVar.A(cbpbVar), ddrcVar.z(cbpbVar)) : new ddpp(cbpbVar, 4, ddrcVar.e.a(cbpbVar, str), ddrcVar.A(cbpbVar), ddrcVar.z(cbpbVar));
                        ddrc ddrcVar2 = ddrbVar3.c;
                        SelectedSearchResult selectedSearchResult = ddrcVar2.f;
                        if (selectedSearchResult != null) {
                            ddrcVar2.h.m(selectedSearchResult.c(ddppVar));
                            ddrcVar2.f = null;
                        } else {
                            SelectedSearchResult selectedSearchResult2 = (SelectedSearchResult) ddrcVar2.h.a();
                            if (selectedSearchResult2 != null) {
                                SelectedSearchResult c = selectedSearchResult2.c(ddppVar);
                                if (!selectedSearchResult2.equals(c)) {
                                    ddrcVar2.h.m(c);
                                }
                            }
                        }
                        ddrbVar3.c.C(ddppVar);
                    }
                }
                return Boolean.valueOf(z);
            }
        }, new Executor() { // from class: ddqy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                efbd.e(runnable);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List A(cbpb cbpbVar) {
        if (cbpbVar.f().isEmpty()) {
            return enou.a;
        }
        engr engrVar = new engr();
        engw f = cbpbVar.f();
        int size = f.size();
        for (int i = 0; i < size; i++) {
            cbni cbniVar = (cbni) f.get(i);
            ddqe ddqeVar = this.x;
            Context context = (Context) ddqeVar.a.b();
            context.getClass();
            ((ctyn) ddqeVar.b.b()).getClass();
            errl errlVar = (errl) ddqeVar.c.b();
            errlVar.getClass();
            ((errl) ddqeVar.d.b()).getClass();
            ddwg ddwgVar = (ddwg) ddqeVar.e.b();
            ddwgVar.getClass();
            ((bdwr) ddqeVar.f.b()).getClass();
            ctyz ctyzVar = (ctyz) ddqeVar.g.b();
            ctyzVar.getClass();
            cqoh cqohVar = (cqoh) ddqeVar.h.b();
            cqohVar.getClass();
            ((ctyg) ddqeVar.i.b()).getClass();
            ames amesVar = (ames) ddqeVar.j.b();
            amesVar.getClass();
            cbniVar.getClass();
            engrVar.h(new ddqd(context, errlVar, ddwgVar, ctyzVar, cqohVar, amesVar, cbniVar));
        }
        return engrVar.g();
    }

    public final void B() {
        if (this.f != null) {
            this.h.m(null);
        }
        this.f = null;
    }

    public final void C(ddqj ddqjVar) {
        if (((ddpp) ddqjVar).b != 1) {
            G(ecrh.SUCCESS);
        }
        F(this.v, ddqjVar);
    }

    @Override // defpackage.ddqt
    public final lld a() {
        return this.w;
    }

    @Override // defpackage.ddqt
    public final void b() {
        this.w.j(new dvvw());
    }

    @Override // defpackage.ddqp
    public final SearchFilterDataItem c() {
        SearchFilterDataItem searchFilterDataItem;
        FreeTextFilterDataItem y = y();
        if (y != null && this.t) {
            j(y);
            return y;
        }
        int size = this.s.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            searchFilterDataItem = (SearchFilterDataItem) this.s.get(size);
        } while (searchFilterDataItem instanceof FreeTextFilterDataItem);
        j(searchFilterDataItem);
        return searchFilterDataItem;
    }

    @Override // defpackage.ddqu
    public final lld e() {
        return this.u;
    }

    @Override // defpackage.ddqp
    public final boolean f(SearchFilterDataItem searchFilterDataItem) {
        cbon c = this.b.c(SearchQuery.d(E(true)));
        return searchFilterDataItem instanceof ContentFilterDataItem ? c.a(((ContentFilterDataItem) searchFilterDataItem).a().a) : searchFilterDataItem instanceof ContactFilterDataItem ? c.c() : searchFilterDataItem instanceof StarFilterDataItem ? c.d() : searchFilterDataItem instanceof ConversationListFilterDataItem ? c.a.f() : (searchFilterDataItem instanceof FreeTextFilterDataItem) && c.b();
    }

    @Override // defpackage.lml
    protected final void fD() {
        C(ddqj.g());
        ((cbmd) cbnb.c).a.close();
    }

    @Override // defpackage.ddqu
    public final lld g() {
        return this.v;
    }

    @Override // defpackage.ddqp
    public final void h(SearchFilterDataItem searchFilterDataItem) {
        if (this.s.contains(searchFilterDataItem)) {
            ensk o = a.o();
            o.Y(ddoa.a, searchFilterDataItem);
            ((ensz) o.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addFilter", 209, "ZeroStateSearchPresenterImpl.java")).q("Search Filter not added because it is already present.");
        } else if (this.s.add(searchFilterDataItem)) {
            ensk o2 = a.o();
            o2.Y(ddoa.a, searchFilterDataItem);
            ((ensz) o2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addFilter", 218, "ZeroStateSearchPresenterImpl.java")).q("Search Filter added.");
            this.u.m(this.s);
            w(3);
        }
    }

    @Override // defpackage.ddqu
    public final lld i() {
        return this.h;
    }

    @Override // defpackage.ddqp
    public final void j(SearchFilterDataItem searchFilterDataItem) {
        if (!this.s.remove(searchFilterDataItem)) {
            ensk o = a.o();
            o.Y(ddoa.a, searchFilterDataItem);
            ((ensz) o.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "removeFilter", 242, "ZeroStateSearchPresenterImpl.java")).q("Search Filter not removed because it is not present.");
        } else {
            ensk o2 = a.o();
            o2.Y(ddoa.a, searchFilterDataItem);
            ((ensz) o2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "removeFilter", 233, "ZeroStateSearchPresenterImpl.java")).q("Search Filter removed.");
            this.u.m(this.s);
            w(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ddqu
    public final SearchQuery.ParticipantSearchFilter k() {
        engw E = E(true);
        int i = ((enou) E).c;
        int i2 = 0;
        while (i2 < i) {
            SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) E.get(i2);
            i2++;
            if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                return (SearchQuery.ParticipantSearchFilter) searchFilter;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ddqu
    public final SearchQuery.StarSearchFilter l() {
        engw E = E(true);
        int i = ((enou) E).c;
        int i2 = 0;
        while (i2 < i) {
            SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) E.get(i2);
            i2++;
            if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                return (SearchQuery.StarSearchFilter) searchFilter;
            }
        }
        return null;
    }

    @Override // defpackage.ddqu
    public final ConversationFilterDataItem m() {
        return (ConversationFilterDataItem) this.g;
    }

    @Override // defpackage.ddqu
    public final FreeTextFilterDataItem n() {
        return y();
    }

    @Override // defpackage.ddqu
    public final SearchFilterDataItem o() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ddqu
    public final /* synthetic */ ListenableFuture p(final String str) {
        entd entdVar = a;
        ensk o = entdVar.o();
        o.Y(ddoa.b, str);
        ((ensz) o.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 301, "ZeroStateSearchPresenterImpl.java")).q("Getting suggestions for prefix");
        final ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            ((ensz) entdVar.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 305, "ZeroStateSearchPresenterImpl.java")).q("Empty prefix thus returning empty results");
            return elfo.e(arrayList);
        }
        boolean z = true;
        final cbon c = this.b.c(SearchQuery.d(E(true)));
        engw u = engw.u(this.c.b(new SearchQuery.ContentSearchFilter(2)), this.c.b(new SearchQuery.ContentSearchFilter(3)), this.c.b(new SearchQuery.ContentSearchFilter(5)), this.c.b(new SearchQuery.ContentSearchFilter(4)));
        int i = ((enou) u).c;
        int i2 = 0;
        while (i2 < i) {
            ContentFilterDataItem contentFilterDataItem = (ContentFilterDataItem) u.get(i2);
            Locale locale = this.q;
            ddps ddpsVar = contentFilterDataItem.a;
            boolean z2 = z;
            if (Objects.equals(ddpsVar.d, locale)) {
                csix.f(ddpsVar.c.isEmpty());
            } else {
                ddpsVar.c.clear();
                ddpsVar.d = locale;
                String[] stringArray = ddpsVar.a.getStringArray(ddpsVar.b);
                int length = stringArray.length;
                int i3 = 0;
                while (i3 < length) {
                    String[] strArr = stringArray;
                    ddpsVar.c.add(strArr[i3].toLowerCase(locale));
                    i3++;
                    stringArray = strArr;
                    u = u;
                }
            }
            engw engwVar = u;
            String lowerCase = str.toLowerCase(locale);
            csix.f(ddpsVar.c.isEmpty());
            ArrayList arrayList2 = ddpsVar.c;
            int size = arrayList2.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    boolean startsWith = ((String) arrayList2.get(i4)).startsWith(lowerCase);
                    i4++;
                    if (startsWith) {
                        if (c.a(contentFilterDataItem.a().a)) {
                            ensk o2 = a.o();
                            o2.Y(ddoa.c, contentFilterDataItem.e());
                            o2.Y(ddoa.b, str);
                            ((ensz) o2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addSupportedContentFiltersMatchingPrefix", 472, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                            arrayList.add(contentFilterDataItem);
                        }
                    }
                }
            }
            i2++;
            z = z2;
            u = engwVar;
        }
        boolean z3 = z;
        StarFilterDataItem f = this.c.f(false);
        if (c.d()) {
            Locale locale2 = this.q;
            if (f.f().toLowerCase(locale2).startsWith(str.toLowerCase(locale2))) {
                ensk o3 = a.o();
                o3.Y(ddoa.c, f.e());
                o3.Y(ddoa.b, str);
                ((ensz) o3.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addStarFilterIfMatchingPrefix", 490, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                arrayList.add(f);
            }
        }
        elfl e = elfo.e(enou.a);
        if (c.c()) {
            final elfl a2 = ((cbmu) this.j).a(str, Alert.DURATION_SHOW_INDEFINITELY, null);
            SearchFilterDataItem searchFilterDataItem = this.g;
            final elfl b = this.i.b(str, searchFilterDataItem instanceof ConversationFilterDataItem ? ((ConversationFilterDataItem) searchFilterDataItem).a().a : bdgq.a);
            ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
            listenableFutureArr[0] = b;
            listenableFutureArr[z3 ? 1 : 0] = a2;
            e = elfo.m(listenableFutureArr).a(new Callable() { // from class: ddra
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ddrc ddrcVar;
                    List list = (List) erqt.q(b);
                    List<qmc> list2 = (List) erqt.q(a2);
                    ArrayList arrayList3 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        ddrcVar = ddrc.this;
                        if (!it.hasNext()) {
                            break;
                        }
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        String T = bindData.T();
                        String R = bindData.R();
                        if (!TextUtils.isEmpty(R) && !TextUtils.isEmpty(T)) {
                            arrayList3.add(ddrcVar.c.a(new SearchQuery.ParticipantSearchFilter(T), ddrcVar.d.a(bindData), R));
                            hashSet.add(T);
                            i6++;
                            if (i6 >= 3) {
                                break;
                            }
                        } else {
                            ((ensz) ((ensz) ddrc.a.j()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "createContactSearchFilter", 420, "ZeroStateSearchPresenterImpl.java")).q("Participant that is not in the contact list was returned.");
                        }
                    }
                    if (!(ddrcVar.g instanceof ConversationFilterDataItem)) {
                        for (qmc qmcVar : list2) {
                            String str2 = qmcVar.k;
                            if (!TextUtils.isEmpty(str2)) {
                                if (!hashSet.contains(str2)) {
                                    arrayList3.add(ddrcVar.c.a(new SearchQuery.ParticipantSearchFilter(str2), ddrcVar.d.a(bdqu.t(qmcVar)), qmcVar.b));
                                    hashSet.add(str2);
                                    i5++;
                                    if (i5 >= 6 - i6) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                ((ensz) ((ensz) ddrc.a.j()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "createContactSearchFilter", 441, "ZeroStateSearchPresenterImpl.java")).q("Empty lookup key while searching recipient contacts.");
                            }
                        }
                    }
                    return arrayList3;
                }
            }, this.n);
        }
        return e.h(new emwl() { // from class: ddqz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList3 = arrayList;
                arrayList3.addAll(list);
                if (c.b()) {
                    String str2 = str;
                    ddrc ddrcVar = ddrc.this;
                    ensk o4 = ddrc.a.o();
                    o4.Y(ddoa.c, str2);
                    o4.Y(ddoa.b, str2);
                    ((ensz) o4.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 330, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                    arrayList3.add(ddrcVar.c.e(new SearchQuery.FreeTextSearchFilter(str2)));
                }
                return arrayList3;
            }
        }, this.n);
    }

    @Override // defpackage.ddqu
    public final void q(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f = (SelectedSearchResult) bundle.getParcelable("selected");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("zero_state_search_filters");
        if (parcelableArrayList != null) {
            this.s.clear();
            this.s.addAll(parcelableArrayList);
        }
        this.u.m(this.s);
        this.g = (SearchFilterDataItem) bundle.getParcelable("base_filter");
        this.t = bundle.getBoolean("performed_search_with_free_text");
        H(5);
    }

    @Override // defpackage.ddqu
    public final void r(Bundle bundle) {
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) this.h.a();
        if (selectedSearchResult != null) {
            bundle.putParcelable("selected", selectedSearchResult);
        }
        bundle.putParcelableArrayList("zero_state_search_filters", new ArrayList<>(this.s));
        bundle.putParcelable("base_filter", this.g);
        bundle.putBoolean("performed_search_with_free_text", this.t);
    }

    @Override // defpackage.ddqu
    public final void s(SearchFilterDataItem searchFilterDataItem) {
        this.g = searchFilterDataItem;
        w(2);
    }

    @Override // defpackage.ddqu
    public final void t(String str) {
        efbd.c();
        boolean z = this.t;
        this.t = false;
        int D = D();
        if (TextUtils.isEmpty(str)) {
            if (D != -1) {
                ((ensz) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 561, "ZeroStateSearchPresenterImpl.java")).q("Free text search filter removed");
                j((SearchFilterDataItem) this.s.get(D));
                return;
            }
            return;
        }
        FreeTextFilterDataItem e = this.c.e(new SearchQuery.FreeTextSearchFilter(str));
        if (D == -1) {
            ((ensz) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 557, "ZeroStateSearchPresenterImpl.java")).t("Free text search filter %s added", str);
            this.s.add(e);
        } else if (str.equals(((FreeTextFilterDataItem) this.s.get(D)).a().a)) {
            this.t = z;
        } else {
            ((ensz) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 553, "ZeroStateSearchPresenterImpl.java")).t("Free text search filter %s replaced", str);
            this.s.set(D, e);
        }
    }

    @Override // defpackage.ddqu
    public final void u(SelectedSearchResult selectedSearchResult) {
        this.h.m(selectedSearchResult);
    }

    @Override // defpackage.ddqu
    public final boolean v() {
        if (m() == null) {
            return false;
        }
        List list = (List) this.u.a();
        list.getClass();
        return list.isEmpty();
    }

    @Override // defpackage.ddqu
    public final void w(int i) {
        efbd.c();
        this.t = true;
        H(i);
    }

    public final SearchQuery x(engw engwVar, boolean z, CancellationSignal cancellationSignal) {
        if (!z) {
            if (!((avej) this.r.b()).a()) {
                return SearchQuery.d(engwVar);
            }
            cbmi cbmiVar = new cbmi();
            cbmiVar.b(engwVar);
            cbmiVar.b = cancellationSignal;
            return cbmiVar.a();
        }
        int max = Math.max(6, 4);
        cbmk cbmkVar = new cbmk();
        cbmkVar.a(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.d(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.e(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.g(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.c(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.f = Alert.DURATION_SHOW_INDEFINITELY;
        cbmkVar.i = (byte) (cbmkVar.i | 32);
        cbmkVar.f(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        cbmkVar.a(4);
        cbmkVar.d(4);
        cbmkVar.c(3);
        int i = max + max + 1;
        cbmkVar.e(i);
        cbmkVar.g(i);
        cbmkVar.b(4);
        cbmkVar.f(4);
        if (cbmkVar.i == -1) {
            cbml cbmlVar = new cbml(cbmkVar.a, cbmkVar.b, cbmkVar.c, cbmkVar.d, cbmkVar.e, cbmkVar.f, cbmkVar.g, cbmkVar.h);
            if (!((avej) this.r.b()).a()) {
                cbmi cbmiVar2 = new cbmi();
                cbmiVar2.b(engwVar);
                cbmiVar2.a = cbmlVar;
                return cbmiVar2.a();
            }
            cbmi cbmiVar3 = new cbmi();
            cbmiVar3.b(engwVar);
            cbmiVar3.a = cbmlVar;
            cbmiVar3.b = cancellationSignal;
            return cbmiVar3.a();
        }
        StringBuilder sb = new StringBuilder();
        if ((cbmkVar.i & 1) == 0) {
            sb.append(" chatLimit");
        }
        if ((cbmkVar.i & 2) == 0) {
            sb.append(" messageLimit");
        }
        if ((cbmkVar.i & 4) == 0) {
            sb.append(" photoLimit");
        }
        if ((cbmkVar.i & 8) == 0) {
            sb.append(" videoLimit");
        }
        if ((cbmkVar.i & 16) == 0) {
            sb.append(" linkLimit");
        }
        if ((cbmkVar.i & 32) == 0) {
            sb.append(" locationLimit");
        }
        if ((cbmkVar.i & 64) == 0) {
            sb.append(" starredLimit");
        }
        if ((cbmkVar.i & 128) == 0) {
            sb.append(" contactLimit");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final FreeTextFilterDataItem y() {
        int D = D();
        if (D < 0) {
            return null;
        }
        return (FreeTextFilterDataItem) this.s.get(D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List z(cbpb cbpbVar) {
        if (cbpbVar.e().isEmpty()) {
            return enou.a;
        }
        engr engrVar = new engr();
        engw e = cbpbVar.e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            UrlSearchResult urlSearchResult = (UrlSearchResult) e.get(i);
            ddqa ddqaVar = this.y;
            cqoh cqohVar = (cqoh) ddqaVar.a.b();
            cqohVar.getClass();
            bdwr bdwrVar = (bdwr) ddqaVar.b.b();
            bdwrVar.getClass();
            errl errlVar = (errl) ddqaVar.c.b();
            errlVar.getClass();
            cbpl cbplVar = (cbpl) ddqaVar.d.b();
            cbplVar.getClass();
            ddwg ddwgVar = (ddwg) ddqaVar.e.b();
            ddwgVar.getClass();
            ctyz ctyzVar = (ctyz) ddqaVar.f.b();
            ctyzVar.getClass();
            ahor ahorVar = (ahor) ddqaVar.g.b();
            ahorVar.getClass();
            avei aveiVar = (avei) ddqaVar.h.b();
            aveiVar.getClass();
            urlSearchResult.getClass();
            engrVar.h(new ddpz(cqohVar, bdwrVar, errlVar, cbplVar, ddwgVar, ctyzVar, ahorVar, aveiVar, urlSearchResult));
        }
        return engrVar.g();
    }
}
