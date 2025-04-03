package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.search.ZeroStateSearchBox;
import com.google.android.apps.messaging.ui.search.homeview.ZeroStateSearchHomeView;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchMultipleResultsView;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnj implements ddmu {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/search/ZeroStateSearchFragmentPeer");
    public ZeroStateSearchHomeView A;
    public ZeroStateSearchMultipleResultsView B;
    public ZeroStateSearchResultsView C;
    public View D;
    public View E;
    public int F;
    public int G;
    public float H;
    public long I;
    public boolean J;
    public ViewTreeObserver.OnPreDrawListener K;
    public View L;
    public boolean M;
    private final ffbr N;
    private final ffbr O;
    public final ea b;
    public final ddqu c;
    public final ayfg d;
    public final dede e;
    public final cqoh f;
    public final ddpl g;
    public final elhe h;
    public final alrv i;
    public final ejlq j;
    public final ejxn k;
    public final tam l;
    public final ffbr m;
    public final ffbr n;
    public final eisx o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final ejlr x = new ddnh(this);
    public ejlr y;
    public ZeroStateSearchBox z;

    public ddnj(ea eaVar, ddqu ddquVar, ayfg ayfgVar, dede dedeVar, cqoh cqohVar, ddpl ddplVar, elhe elheVar, alrv alrvVar, ejlq ejlqVar, tam tamVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, eisx eisxVar, ejxn ejxnVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.b = eaVar;
        this.c = ddquVar;
        this.d = ayfgVar;
        this.e = dedeVar;
        this.f = cqohVar;
        this.g = ddplVar;
        this.h = elheVar;
        this.i = alrvVar;
        this.j = ejlqVar;
        this.l = tamVar;
        this.m = ffbrVar;
        this.N = ffbrVar2;
        this.n = ffbrVar3;
        this.o = eisxVar;
        this.k = ejxnVar;
        this.p = ffbrVar4;
        this.q = ffbrVar5;
        this.r = ffbrVar6;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.u = ffbrVar9;
        this.O = ffbrVar10;
        this.v = ffbrVar11;
        this.w = ffbrVar12;
    }

    static final void e(View view, WindowInsets windowInsets, int i) {
        View findViewById = view.findViewById(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = windowInsets.getSystemWindowInsetTop();
            findViewById.setLayoutParams(marginLayoutParams);
        }
    }

    final void a(Recipient recipient) {
        this.j.i(new ejlp(((alxl) this.N.b()).k(engw.r(recipient), null)), new ejlm(recipient), this.x);
    }

    final void b(cbpb cbpbVar) {
        ConversationFilterDataItem m = this.c.m();
        m.getClass();
        ConversationIdType conversationIdType = m.a().a;
        FreeTextFilterDataItem n = this.c.n();
        n.getClass();
        String str = n.a().a;
        MessageIdType messageIdType = bdhb.a;
        if (!cbpbVar.g().isEmpty()) {
            messageIdType = new MessageIdType(((Long) enjk.j(cbpbVar.g())).longValue());
        }
        try {
            ((aigz) this.O.b()).h(new aijv(conversationIdType, messageIdType, str, this.l.a));
            this.g.h(6, cbpbVar);
            this.g.a();
        } catch (aigy e) {
            throw new IllegalArgumentException("navigation target disabled", e);
        }
    }

    final void c(View view, WindowInsets windowInsets, int i, int i2, int i3, int i4) {
        view.findViewById(i3).setPadding(i2, i + this.b.B().getDimensionPixelSize(i4), i2, windowInsets.getSystemWindowInsetBottom());
    }

    final boolean d(View view) {
        if (this.L == view) {
            return false;
        }
        long max = Math.max(0L, this.I - this.f.f().toEpochMilli());
        View view2 = this.L;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView = this.B;
        if (view2 == zeroStateSearchMultipleResultsView) {
            zeroStateSearchMultipleResultsView.setOnScrollChangeListener(null);
        } else {
            ZeroStateSearchResultsView zeroStateSearchResultsView = this.C;
            if (view2 == zeroStateSearchResultsView) {
                zeroStateSearchResultsView.D();
            }
        }
        final View view3 = this.L;
        if (view3 != null) {
            if (view3.getAlpha() == 0.0f) {
                view3.setVisibility(8);
            } else {
                view3.animate().alpha(0.0f).setStartDelay(0L).setDuration(this.G).withEndAction(new Runnable() { // from class: ddmx
                    @Override // java.lang.Runnable
                    public final void run() {
                        view3.setVisibility(8);
                    }
                });
                max = Math.max(max, this.G);
            }
        }
        this.L = view;
        view.setAlpha(0.0f);
        this.L.setTranslationY(this.H);
        this.L.setVisibility(0);
        this.L.animate().alpha(1.0f).translationY(0.0f).setStartDelay(this.L != null ? max : 0L).setDuration(this.F).setInterpolator(new ljn()).withEndAction(new Runnable() { // from class: ddmy
            @Override // java.lang.Runnable
            public final void run() {
                ddnj ddnjVar = ddnj.this;
                if (ddnjVar.L == ddnjVar.A) {
                    ddnjVar.z.e(ddnjVar.b.G(), ddnjVar.L, ddnjVar.b.P());
                }
                if (ddnjVar.L == ddnjVar.E) {
                    ddnjVar.z.e(ddnjVar.b.G(), ddnjVar.L, ddnjVar.b.P());
                }
            }
        });
        View view4 = this.L;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView2 = this.B;
        if (view4 == zeroStateSearchMultipleResultsView2) {
            zeroStateSearchMultipleResultsView2.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: ddnc
                @Override // android.view.View.OnScrollChangeListener
                public final void onScrollChange(View view5, int i, int i2, int i3, int i4) {
                    if (i2 != i4) {
                        ddnj ddnjVar = ddnj.this;
                        ddnjVar.e.i(ddnjVar.b.z(), view5);
                    }
                }
            });
        } else {
            ZeroStateSearchResultsView zeroStateSearchResultsView2 = this.C;
            if (view4 == zeroStateSearchResultsView2) {
                zeroStateSearchResultsView2.z(new ddng(this));
            }
        }
        View view5 = this.L;
        ZeroStateSearchMultipleResultsView zeroStateSearchMultipleResultsView3 = this.B;
        if (view5 == zeroStateSearchMultipleResultsView3) {
            zeroStateSearchMultipleResultsView3.scrollTo(0, 0);
            return true;
        }
        ZeroStateSearchResultsView zeroStateSearchResultsView3 = this.C;
        if (view5 != zeroStateSearchResultsView3) {
            return true;
        }
        zeroStateSearchResultsView3.ak(0);
        return true;
    }
}
