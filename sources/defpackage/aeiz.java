package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.CancellationSignal;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.material.snackbar.Snackbar;
import j$.util.Optional;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeiz extends lml implements aeix {
    public static final cskc a = cskc.g("BugleSuperSort", "ConversationListViewModelImpl");
    private static final enru c = enru.c("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl");
    public aeij b;
    private final aeik e;
    private final errl f;
    private final int g;
    private List h;
    private final ffbr i;
    private Parcelable j;
    private lld k;
    private Snackbar l;
    private final aekm q;
    private final ffbr r;
    private aeiy s;
    private final Object d = new Object();
    private Boolean m = true;
    private Boolean n = true;
    private Boolean o = false;
    private Boolean p = false;

    public aeiz(aeik aeikVar, Context context, errl errlVar, ffbr ffbrVar, aekm aekmVar, ffbr ffbrVar2) {
        int i;
        this.e = aeikVar;
        this.f = errlVar;
        this.q = aekmVar;
        this.r = ffbrVar2;
        try {
            i = (context.getResources().getDisplayMetrics().heightPixels / context.getResources().getDimensionPixelSize(R.dimen.conversation_list_item_view_min_height_m2)) + 1;
        } catch (Resources.NotFoundException unused) {
            i = 20;
        }
        this.g = i;
        this.i = ffbrVar;
    }

    @Override // defpackage.aeix
    public final int a() {
        return this.g;
    }

    @Override // defpackage.aeix
    public final Parcelable b() {
        return this.j;
    }

    @Override // defpackage.aeix
    public final lld c(cgix cgixVar, aeho aehoVar) {
        oft oftVar;
        cskc cskcVar = a;
        csjb c2 = cskcVar.c();
        c2.I("ConversationListViewModelImpl getConversationList called");
        c2.y("instance", hashCode());
        c2.r();
        if (!((aubi) this.r.b()).a()) {
            aeij aeijVar = this.b;
            if (aeijVar != null) {
                aeijVar.c();
            }
            csjb c3 = cskcVar.c();
            c3.I("Reusing livePagedList:");
            c3.J(this.k != null);
            c3.r();
            lld lldVar = this.k;
            if (lldVar != null) {
                return lldVar;
            }
        } else if (this.k != null) {
            enru enruVar = c;
            ensk e = enruVar.e();
            e.Y(ente.a, "ConversationListViewModelImpl");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "getConversationList", 146, "ConversationListViewModelImpl.java")).q("Reuse livePagedList");
            if (this.b != null) {
                ensk h = enruVar.h();
                h.Y(ente.a, "ConversationListViewModelImpl");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "getConversationList", 148, "ConversationListViewModelImpl.java")).q("getConversationList invalidate data source");
                this.b.c();
            }
            return this.k;
        }
        synchronized (this.d) {
            if (this.b == null) {
                this.b = this.e.a(cgixVar, this.g);
            }
            List list = this.h;
            if (list != null) {
                this.b.d(list);
                this.h = null;
            }
            aeij aeijVar2 = this.b;
            int i = this.g;
            int i2 = i + i;
            if (i2 <= 0) {
                throw new IllegalArgumentException("Page size must be a positive number");
            }
            oin oinVar = new oin(i2, i2, i2 * 3);
            aeijVar2.getClass();
            fftv fftvVar = fftv.a;
            fftu.b(aer.b);
            errl errlVar = this.f;
            errlVar.getClass();
            ffsd b = fftu.b(errlVar);
            oftVar = new oft(fftvVar, aehoVar, oinVar, new olk(b, new ods(b, aeijVar2)), fftu.b(aer.a), b);
            this.k = oftVar;
        }
        return oftVar;
    }

    @Override // defpackage.aeix
    public final aekm d() {
        return this.q;
    }

    @Override // defpackage.aeix
    public final Snackbar e() {
        return this.l;
    }

    @Override // defpackage.aeix
    public final Boolean f() {
        return this.m;
    }

    @Override // defpackage.aeix
    public final Boolean g() {
        return this.p;
    }

    @Override // defpackage.aeix
    public final Boolean h() {
        return this.n;
    }

    @Override // defpackage.aeix
    public final Boolean i() {
        return this.o;
    }

    @Override // defpackage.aeix
    public final void j(cgix cgixVar) {
        csjb d = a.d();
        d.v("Fetching conversation list");
        d.A("ConversationListDataSource", this.b);
        d.y("instance", hashCode());
        d.r();
        synchronized (this.d) {
            if (this.b == null) {
                this.b = this.e.a(cgixVar, this.g);
            }
        }
        final aeij aeijVar = this.b;
        ekzz f = eleg.f("ConversationListDataSources#getFirstLoadList");
        try {
            ((ecrj) aeijVar.n.b()).e(aeir.b);
            aeijVar.q = true;
            aeijVar.s = aeii.NOT_STARTED;
            ekzz f2 = eleg.f("ConversationListDataSources#getNudgeSettings");
            try {
                aeijVar.v = elfo.e(ctsx.a);
                f2.close();
                elfl h = aeijVar.v.h(new emwl() { // from class: aeia
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        aeij aeijVar2 = aeij.this;
                        ctsx ctsxVar = (ctsx) obj;
                        SuperSortLabel superSortLabel = (SuperSortLabel) aeijVar2.l.get();
                        ekzz f3 = eleg.f("ConversationListDataSources#prefetchInitialQuery");
                        try {
                            aeijVar2.f();
                            aeze aezeVar = aeijVar2.m;
                            cgix cgixVar2 = aeijVar2.k;
                            int i = aeijVar2.t;
                            Map map = aeijVar2.w;
                            aeib aeibVar = new aeib(aeijVar2);
                            ekzz f4 = eleg.f("ConversationListDataSources#buildFirstPageQuery");
                            try {
                                boolean z = true;
                                aeze.c("prefetchFirstPage", cgixVar2, superSortLabel, true);
                                if (aezeVar.d != null) {
                                    z = false;
                                }
                                emxf.l(z);
                                aglz b = aezeVar.b(cgixVar2, superSortLabel);
                                agzg g = agzh.g();
                                g.d(i);
                                g.e(ctsxVar);
                                aezeVar.d = b.g(g.a(), aezeVar.b);
                                aezeVar.e = aeibVar;
                                f4.close();
                                try {
                                    CancellationSignal cancellationSignal = new CancellationSignal();
                                    agkk agkkVar = aezeVar.d;
                                    agkkVar.getClass();
                                    dtrs dtrsVar = aezeVar.e;
                                    dtrsVar.getClass();
                                    agkk a2 = aezeVar.a(agkkVar, dtrsVar, cancellationSignal);
                                    a2.getClass();
                                    List d2 = aezeVar.d(a2, map, superSortLabel, cancellationSignal);
                                    int size = d2.size();
                                    ((ecrj) aeijVar2.n.b()).g(aeir.b, null, null, ecrh.SUCCESS);
                                    aeijVar2.e.a(aemg.a);
                                    aehh aehhVar = new aehh(d2, 0, size, false);
                                    f3.close();
                                    return aehhVar;
                                } catch (dtyy e) {
                                    throw new IllegalStateException("This should never happen, prefetch is never cancelled.", e);
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            try {
                                f3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, aeijVar.g);
                f.b(h);
                aeijVar.u = h;
                f.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aeix
    public final void k() {
        if (this.b == null) {
            a.r("Cannot init reminder trigger listener because the data source is still null.");
        } else if (ddjr.c() && ((Optional) this.i.b()).isPresent()) {
            this.s = new aeiy(this);
            ((cnla) ((Optional) this.i.b()).get()).k(this.s);
        }
    }

    @Override // defpackage.aeix
    public final void l(String str) {
        if (!((aubi) this.r.b()).a()) {
            aeij aeijVar = this.b;
            if (aeijVar != null) {
                aeijVar.e(this.q.a);
                this.b.c();
                return;
            }
            return;
        }
        aeij aeijVar2 = this.b;
        if (aeijVar2 == null || !aeijVar2.r) {
            ensk e = c.e();
            e.Y(ente.a, "ConversationListViewModelImpl");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "onConversationListAggregatorUpdate", 309, "ConversationListViewModelImpl.java")).t("list not loaded, suppress %s invalidate data source", str);
        } else {
            ensk h = c.h();
            h.Y(ente.a, "ConversationListViewModelImpl");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/list/ConversationListViewModelImpl", "onConversationListAggregatorUpdate", 304, "ConversationListViewModelImpl.java")).t("%s invalidate data source", str);
            this.b.e(this.q.a);
            this.b.c();
        }
    }

    @Override // defpackage.aeix
    public final void m() {
        aeze aezeVar;
        agkk agkkVar;
        dtrs dtrsVar;
        if (this.s != null && ddjr.c() && ((Optional) this.i.b()).isPresent()) {
            ((cnla) ((Optional) this.i.b()).get()).q(this.s);
        }
        aeij aeijVar = this.b;
        if (aeijVar == null || (agkkVar = (aezeVar = aeijVar.m).d) == null || (dtrsVar = aezeVar.e) == null) {
            return;
        }
        agkkVar.P(dtrsVar);
    }

    @Override // defpackage.aeix
    public final void n(List list) {
        aeij aeijVar = this.b;
        if (aeijVar == null) {
            this.h = list;
        } else {
            aeijVar.d(list);
        }
    }

    @Override // defpackage.aeix
    public final void o(Snackbar snackbar) {
        this.l = snackbar;
    }

    @Override // defpackage.aeix
    public final void p(Boolean bool) {
        this.m = bool;
    }

    @Override // defpackage.aeix
    public final void q(Boolean bool) {
        this.p = bool;
    }

    @Override // defpackage.aeix
    public final void r(Boolean bool) {
        this.n = bool;
    }

    @Override // defpackage.aeix
    public final void s(Boolean bool) {
        this.o = bool;
    }

    @Override // defpackage.aeix
    public final void t(Parcelable parcelable) {
        this.j = parcelable;
    }

    @Override // defpackage.aeix
    public final boolean u() {
        aeij aeijVar = this.b;
        if (aeijVar == null) {
            return false;
        }
        aeii aeiiVar = aeijVar.s;
        return aeiiVar == aeii.REFRESHING || aeiiVar == aeii.FINISHED;
    }

    @Override // defpackage.aeix
    public final boolean v() {
        aeij aeijVar = this.b;
        return aeijVar != null && aeijVar.s == aeii.FINISHED;
    }

    @Override // defpackage.aeix
    public final boolean w() {
        return this.j == null;
    }
}
