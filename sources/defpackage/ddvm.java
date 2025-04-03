package defpackage;

import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.apps.messaging.ui.search.resultsview.ZeroStateSearchResultsView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddvm extends ddvn {
    public final ddud a;
    public final LinearLayoutManager b;
    public final ddui c;
    public final LinearLayoutManager d;
    public ddtd e;
    public dduz f;
    public ddsz g;
    public ddsv h;
    public final LinearLayoutManager i;
    public ddsh j;
    public final LinearLayoutManager k;
    public ddrk l;
    public final LinearLayoutManager m;
    public ddvl n;
    public ddsy o;
    public final ZeroStateSearchResultsView p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final ffbr x;

    public ddvm(ZeroStateSearchResultsView zeroStateSearchResultsView, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.p = zeroStateSearchResultsView;
        this.q = ffbrVar;
        this.r = ffbrVar2;
        this.s = ffbrVar3;
        this.t = ffbrVar6;
        this.v = ffbrVar8;
        this.u = ffbrVar7;
        this.w = ffbrVar9;
        this.x = ffbrVar10;
        zeroStateSearchResultsView.aL();
        zeroStateSearchResultsView.getContext();
        this.b = new LinearLayoutManager();
        this.a = ((ddue) ffbrVar4.b()).a(zeroStateSearchResultsView.getContext());
        this.c = ((dduj) ffbrVar5.b()).a(zeroStateSearchResultsView.getContext());
        zeroStateSearchResultsView.getContext();
        this.d = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.i = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.k = new LinearLayoutManager();
        zeroStateSearchResultsView.getContext();
        this.m = new LinearLayoutManager();
    }

    public final void a(int i) {
        Parcelable parcelable;
        vx vxVar;
        ddvl ddvlVar = this.n;
        if (ddvlVar == null || ddvlVar.a != i || (parcelable = ddvlVar.b) == null || (vxVar = this.p.o) == null) {
            this.n = null;
        } else {
            vxVar.aa(parcelable);
            this.n = null;
        }
    }
}
