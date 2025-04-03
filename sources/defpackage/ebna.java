package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebna extends LinearLayout implements ebwc {
    public static final /* synthetic */ int t = 0;
    private static final String u = String.valueOf(ebna.class.getName()).concat(".superState");
    private static final String v = String.valueOf(ebna.class.getName()).concat(".collapsed");
    private static final Interpolator w = new ljm();
    public final MyAccountChip a;
    public final SelectedAccountView b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final ViewGroup e;
    public final llg f;
    public final llh g;
    public boolean h;
    public ebvw i;
    public ebgr j;
    public emxc k;
    public ebny l;
    public ebom m;
    public ebgs n;
    public ebbb o;
    public ezoo p;
    public emxc q;
    public eaxz r;
    public final eays s;

    public ebna(Context context) {
        super(context);
        int i = engw.d;
        this.f = new llg(enou.a);
        this.s = new ebmz(this);
        LayoutInflater.from(context).inflate(R.layout.has_selected_content, this);
        setOrientation(1);
        this.a = (MyAccountChip) findViewById(R.id.my_account_chip);
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account_view);
        this.b = selectedAccountView;
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.accounts);
        this.c = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.account_management_actions);
        this.d = recyclerView2;
        recyclerView.setFocusable(false);
        recyclerView2.setFocusable(false);
        this.e = (ViewGroup) findViewById(R.id.og_critical_alert_container);
        selectedAccountView.l(200L);
        selectedAccountView.m(new ljm());
        setLayoutTransition(i());
        if (!fdra.a.get().a(context)) {
            ((ViewGroup) recyclerView.getParent()).setLayoutTransition(i());
        }
        this.g = new llh() { // from class: ebmp
            @Override // defpackage.llh
            public final void a(Object obj) {
                final ebna ebnaVar = ebna.this;
                ebpa.a(new Runnable() { // from class: ebmo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebna ebnaVar2 = ebna.this;
                        if (ebnaVar2.q.g()) {
                            Object c = ebnaVar2.q.c();
                            Context context2 = ebnaVar2.getContext();
                            Object a = ((ebbg) ebnaVar2.o).b.a();
                            ViewGroup viewGroup = ebnaVar2.e;
                            ((eayd) c).p(context2, a, viewGroup, ebnaVar2.l, viewGroup, ebnaVar2.i, true, ebnaVar2.r.b);
                        }
                    }
                });
            }
        };
    }

    public static void d(RecyclerView recyclerView, vk vkVar) {
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.getContext();
        recyclerView.ap(new LinearLayoutManager());
        ebov.a(recyclerView, vkVar);
    }

    public static void f(vk vkVar, RecyclerView recyclerView, vt vtVar) {
        if (vkVar.a() > 0) {
            recyclerView.ae(vtVar);
            return;
        }
        for (int i = 0; i < recyclerView.gr(); i++) {
            if (recyclerView.h(i).equals(vtVar)) {
                return;
            }
        }
        recyclerView.w(vtVar);
    }

    public static eazt h(View view) {
        return new eazt(view, ebkq.b(view.getContext()));
    }

    private static LayoutTransition i() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(200L);
        Interpolator interpolator = w;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        return layoutTransition;
    }

    public final ebds a(lld lldVar, ebkq ebkqVar, int i) {
        Context context = getContext();
        ebbc ebbcVar = ((ebbg) this.o).b;
        if (lldVar == null) {
            int i2 = engw.d;
            lldVar = new llg(enou.a);
        }
        return new ebds(context, ebbcVar, lldVar, this.l, this.i, i);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.b(this.b, 90784);
        ebvwVar.b(this.b.i, 111271);
    }

    public final void c(boolean z) {
        efbd.c();
        this.h = z;
        int i = true != z ? 0 : 8;
        this.c.setVisibility(i);
        this.d.setVisibility(i);
        this.b.e(!z);
    }

    public final void g(ebbb ebbbVar, eazq eazqVar, ebds ebdsVar) {
        View.OnClickListener onClickListener;
        efbd.c();
        int i = (!((ebgd) ((ebbg) ebbbVar).e).g.e() || (eazqVar.a() <= 0 && ebdsVar.a() <= 0)) ? 3 : 1;
        this.b.n(i);
        SelectedAccountView selectedAccountView = this.b;
        int i2 = i - 1;
        if (i2 == 0) {
            onClickListener = new View.OnClickListener() { // from class: ebms
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebna ebnaVar = ebna.this;
                    ebnaVar.i.f(new dvxf(5), view);
                    ebnaVar.c(!ebnaVar.h);
                }
            };
        } else if (i2 != 1) {
            onClickListener = null;
        } else {
            emxf.l(false);
            ebon ebonVar = new ebon(new View.OnClickListener() { // from class: ebmt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ebna ebnaVar = ebna.this;
                    ebgp ebgpVar = (ebgp) ebnaVar.k.c();
                    ebnaVar.getContext();
                    ebgpVar.a();
                }
            });
            ebonVar.d = this.l.b();
            ebonVar.e = this.l.a();
            ebonVar.a(this.m, 56);
            onClickListener = new ebol(ebonVar);
        }
        selectedAccountView.setOnClickListener(onClickListener);
        this.b.setClickable(i != 3);
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        ebvwVar.e(this.b.i);
        ebvwVar.e(this.b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        MyAccountChip myAccountChip = this.a;
        CharSequence text = myAccountChip.getText();
        this.a.a.b(((View) myAccountChip.getParent()).getMeasuredWidth());
        if (TextUtils.equals(text, this.a.getText())) {
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(u);
            c(bundle.getBoolean(v));
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(u, super.onSaveInstanceState());
        bundle.putBoolean(v, this.h);
        return bundle;
    }
}
