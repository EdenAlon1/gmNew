package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehes extends ehfj {
    public ehee a;
    public RecyclerView ag;
    public View ah;
    public int ai;
    private int ak;
    private ehef al;
    private View am;
    private View an;
    private View ao;
    public eheb b;
    public ehfd c;
    public ehed d;
    public RecyclerView e;

    static int a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    }

    private final void p(int i) {
        this.ag.post(new ehei(this, i));
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(z(), this.ak);
        this.d = new ehed(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        ehfd ehfdVar = this.b.a;
        boolean aY = ehez.aY(contextThemeWrapper);
        View inflate = cloneInContext.inflate(true != aY ? R.layout.mtrl_calendar_horizontal : R.layout.mtrl_calendar_vertical, viewGroup, false);
        Resources resources = A().getResources();
        inflate.setMinimumHeight(resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height) + (ehfe.a * resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + ((ehfe.a - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        kvo.p(gridView, new ehej());
        int i = this.b.e;
        gridView.setAdapter((ListAdapter) (i > 0 ? new eheg(i) : new eheg()));
        gridView.setNumColumns(ehfdVar.d);
        gridView.setEnabled(false);
        this.ag = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.ag.ap(new ehek(this, aY ? 1 : 0, aY ? 1 : 0));
        this.ag.setTag("MONTHS_VIEW_GROUP_TAG");
        ehfh ehfhVar = new ehfh(contextThemeWrapper, this.a, this.b, this.al, new ehel(this));
        this.ag.am(ehfhVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.e = recyclerView;
        if (recyclerView != null) {
            recyclerView.aL();
            this.e.ap(new GridLayoutManager(integer, 1));
            this.e.am(new ehfr(this));
            this.e.w(new ehen(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            kvo.p(materialButton, new eheo(this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.am = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.an = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.ao = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.ah = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            f(1);
            materialButton.setText(this.c.f());
            this.ag.z(new ehep(this, ehfhVar, materialButton));
            materialButton.setOnClickListener(new eheq(this));
            this.an.setOnClickListener(new eher(this, ehfhVar));
            this.am.setOnClickListener(new eheh(this, ehfhVar));
        }
        if (!ehez.aY(contextThemeWrapper)) {
            new va().f(this.ag);
        }
        this.ag.ak(ehfhVar.m(this.c));
        kvo.p(this.ag, new ehem());
        return inflate;
    }

    final LinearLayoutManager b() {
        return (LinearLayoutManager) this.ag.o;
    }

    final void e(ehfd ehfdVar) {
        ehfh ehfhVar = (ehfh) this.ag.n;
        int m = ehfhVar.m(ehfdVar);
        int m2 = m - ehfhVar.m(this.c);
        int abs = Math.abs(m2);
        this.c = ehfdVar;
        if (abs <= 3) {
            p(m);
        } else if (m2 > 0) {
            this.ag.ak(m - 3);
            p(m);
        } else {
            this.ag.ak(m + 3);
            p(m);
        }
    }

    final void f(int i) {
        this.ai = i;
        if (i != 2) {
            this.ao.setVisibility(8);
            this.ah.setVisibility(0);
            this.am.setVisibility(0);
            this.an.setVisibility(0);
            e(this.c);
            return;
        }
        RecyclerView recyclerView = this.e;
        recyclerView.o.ab(((ehfr) recyclerView.n).m(this.c.c));
        this.ao.setVisibility(0);
        this.ah.setVisibility(8);
        this.am.setVisibility(8);
        this.an.setVisibility(8);
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.ak = bundle.getInt("THEME_RES_ID_KEY");
        this.a = (ehee) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.b = (eheb) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.al = (ehef) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.c = (ehfd) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.ak);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.a);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.al);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.c);
    }
}
