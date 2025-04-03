package com.google.android.libraries.onegoogle.expresssignin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import defpackage.ebnr;
import defpackage.eboc;
import defpackage.ebod;
import defpackage.ebpn;
import defpackage.ebqh;
import defpackage.ebrp;
import defpackage.ebrs;
import defpackage.ebry;
import defpackage.ebsc;
import defpackage.ebsp;
import defpackage.ebss;
import defpackage.emux;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.fdrd;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ExpressSignInLayout<AccountT> extends FrameLayout implements eboc {
    public ebrp a;
    private final ebod b;

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }

    public final void a(ebrs ebrsVar, ebry ebryVar) {
        c(ebrsVar, ebryVar, false, emux.a);
    }

    @Override // android.view.ViewGroup
    public final void addView(final View view, final int i, final ViewGroup.LayoutParams layoutParams) {
        d(new ebqh() { // from class: ebqa
            @Override // defpackage.ebqh
            public final void a(ebrp ebrpVar) {
                ebrpVar.addView(view, i, layoutParams);
            }
        });
    }

    @Override // defpackage.eboc
    public final boolean b() {
        return this.a != null;
    }

    public final void c(final ebrs ebrsVar, final ebry ebryVar, boolean z, final emxc emxcVar) {
        emxf.m(!b(), "initialize() has to be called only once.");
        ebpn ebpnVar = (ebpn) ebryVar;
        ebss ebssVar = ((ebsc) ebpnVar.b).g;
        Context context = getContext();
        context.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, ebssVar.a);
        ebrp ebrpVar = new ebrp(contextThemeWrapper, z, (ebsp) ((ebsc) ebpnVar.b).f.d(((!z && fdrd.a.get().b(contextThemeWrapper) && ebnr.f(contextThemeWrapper)) || (z && fdrd.a.get().a(contextThemeWrapper))) ? new emyl() { // from class: ebqb
            @Override // defpackage.emyl
            public final Object get() {
                return new ebsr();
            }
        } : new emyl() { // from class: ebqc
            @Override // defpackage.emyl
            public final Object get() {
                return new ebsq();
            }
        }));
        this.a = ebrpVar;
        super.addView(ebrpVar, -1, new ViewGroup.LayoutParams(-1, -1));
        d(new ebqh() { // from class: ebqd
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v3, types: [acd] */
            /* JADX WARN: Type inference failed for: r3v36 */
            /* JADX WARN: Type inference failed for: r3v37 */
            @Override // defpackage.ebqh
            public final void a(final ebrp ebrpVar2) {
                ?? r3;
                engw r;
                final ebrs ebrsVar2 = ebrs.this;
                ebrpVar2.e = ebrsVar2;
                Context context2 = ebrpVar2.getContext();
                emxc emxcVar2 = emxcVar;
                if (emxcVar2.g()) {
                    r3 = emxcVar2.c();
                } else {
                    acd acdVar = (acd) ebnz.a(context2, acd.class);
                    emxf.b(acdVar != null, "Express Sign In's onBackPressedDispatcherOwner has to be set or one of the context baseContexts should be a OnBackPressedDispatcherOwner");
                    r3 = acdVar;
                }
                final ebry ebryVar2 = ebryVar;
                ebrpVar2.x = r3;
                ebpn ebpnVar2 = (ebpn) ebryVar2;
                ebsj ebsjVar = ebpnVar2.b;
                ebrpVar2.q = (Button) ebrpVar2.findViewById(R.id.continue_as_button);
                ebrpVar2.r = (Button) ebrpVar2.findViewById(R.id.secondary_action_button);
                ebrpVar2.s = new eboz(ebrpVar2.r);
                ebrpVar2.t = new eboz(ebrpVar2.q);
                ebpl ebplVar = (ebpl) ebrsVar2;
                final ebvw ebvwVar = ebplVar.e;
                ebvwVar.a(ebrpVar2, 90569);
                ebrpVar2.b(ebvwVar);
                ebsc ebscVar = (ebsc) ebpnVar2.b;
                ebrpVar2.d = ebscVar.h;
                if (ebscVar.d.g()) {
                    ebscVar.d.c();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout = (FrameLayout) ebrpVar2.findViewById(R.id.express_sign_in_header_logo_container);
                    Context context3 = ebrpVar2.getContext();
                    ImageView imageView = new ImageView(context3);
                    imageView.setImageDrawable(ku.a(context3, true != eboq.g(context3) ? R.drawable.googlelogo_light_color_74x24_vd : R.drawable.googlelogo_standard_color_74x24_vd));
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.setVisibility(0);
                }
                ebse ebseVar = (ebse) ebscVar.e.f();
                ebst ebstVar = (ebst) ebscVar.a.f();
                if (ebseVar != null) {
                    ebrpVar2.w = ebseVar;
                    ebrpVar2.p(new View.OnClickListener() { // from class: ebqo
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ebrp ebrpVar3 = ebrp.this;
                            ((ebpl) ebrpVar3.e).e.f(new dvxf(5), view);
                            ebrpVar3.c();
                        }
                    }, ebseVar.a());
                } else if (ebstVar != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: ebqn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ebrp ebrpVar3 = ebrp.this;
                            ((ebpl) ebrpVar3.e).e.f(new dvxf(5), view);
                            ebrpVar3.g(ebryVar2, null);
                        }
                    };
                    Context context4 = ebrpVar2.getContext();
                    ebrpVar2.p(onClickListener, engw.t(context4.getResources().getString(R.string.sign_in_app_name_without_account, ebstVar.a), context4.getResources().getString(R.string.sign_in_without_account), context4.getResources().getString(R.string.sign_in_without_account_short)));
                }
                ebrpVar2.v = null;
                ebsg ebsgVar = ebrpVar2.v;
                ebsf ebsfVar = (ebsf) ebscVar.c.f();
                if (ebsfVar != null) {
                    ebrpVar2.findViewById(R.id.esi_custom_header_container).setVisibility(0);
                    TextView textView = (TextView) ebrpVar2.findViewById(R.id.esi_custom_header_title);
                    TextView textView2 = (TextView) ebrpVar2.findViewById(R.id.esi_custom_header_subtitle);
                    textView.setText(ebsfVar.d());
                    eavn.a(textView);
                    textView2.setVisibility(8);
                }
                ebrpVar2.A = ebscVar.i;
                if (ebscVar.d.g()) {
                    ((ViewGroup.MarginLayoutParams) ebrpVar2.k.getLayoutParams()).topMargin = ebrpVar2.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                    ebrpVar2.k.requestLayout();
                    View findViewById = ebrpVar2.findViewById(R.id.esi_custom_header_container);
                    ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = 0;
                    findViewById.requestLayout();
                }
                ebsg ebsgVar2 = ebrpVar2.v;
                if (ebrpVar2.c) {
                    ((ViewGroup.MarginLayoutParams) ebrpVar2.k.getLayoutParams()).bottomMargin = 0;
                    ebrpVar2.k.requestLayout();
                    ((ViewGroup.MarginLayoutParams) ebrpVar2.q.getLayoutParams()).bottomMargin = 0;
                    ebrpVar2.q.requestLayout();
                }
                ebrpVar2.g.setOnClickListener(new View.OnClickListener() { // from class: ebqv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebrp ebrpVar3 = ebrp.this;
                        if (ebrpVar3.b) {
                            ebvwVar.f(new dvxf(5), view);
                            ebrpVar3.u(32);
                            ebrpVar3.l(false);
                        }
                    }
                });
                ebrpVar2.j.j(ebplVar.c, ((ebph) ebplVar.f).a, eaxz.a().a(), new eaxw() { // from class: ebqw
                    @Override // defpackage.eaxw
                    public final String a(String str) {
                        return ebrp.this.getResources().getString(R.string.og_selected_account_a11y, str);
                    }
                }, ebrpVar2.getResources().getString(R.string.og_collapse_account_list_a11y), ebrpVar2.getResources().getString(R.string.og_expand_account_list_a11y));
                eaze eazeVar = new eaze() { // from class: ebqx
                    @Override // defpackage.eaze
                    public final void a(Object obj) {
                        ((ebpl) ebrsVar2).b.h(obj);
                        final ebrp ebrpVar3 = ebrp.this;
                        ebrpVar3.post(new Runnable() { // from class: ebqu
                            @Override // java.lang.Runnable
                            public final void run() {
                                ebrp.this.l(false);
                            }
                        });
                    }
                };
                Context context5 = ebrpVar2.getContext();
                eazr eazrVar = new eazr();
                eazrVar.b = ((ebph) ebplVar.f).a;
                eazrVar.c = ebplVar.b;
                eazrVar.a = ebplVar.c;
                eazrVar.d = ebplVar.d;
                eazq eazqVar = new eazq(context5, eazrVar.a(), eazeVar, new ebrd(), ebrp.a(), ebvwVar, ((ebpi) ebrpVar2.f).c, eaxz.a().a(), false);
                Context context6 = ebrpVar2.getContext();
                ebno a = ebnk.a(ebplVar.b, new eavd() { // from class: ebql
                    @Override // defpackage.eavd
                    public final void a(View view, Object obj) {
                        ebrp ebrpVar3 = ebrp.this;
                        ebrpVar3.j(view);
                        ebrpVar3.l(false);
                    }
                }, ebrpVar2.getContext());
                if (a == null) {
                    int i = engw.d;
                    r = enou.a;
                } else {
                    r = engw.r(a);
                }
                ebpf ebpfVar = new ebpf(context6, r, ebvwVar, ((ebpi) ebrpVar2.f).c);
                ebrp.o(ebrpVar2.h, eazqVar);
                ebrp.o(ebrpVar2.i, ebpfVar);
                ebrpVar2.f(eazqVar, ebpfVar);
                ebre ebreVar = new ebre(ebrpVar2, eazqVar, ebpfVar);
                eazqVar.A(ebreVar);
                ebpfVar.A(ebreVar);
                ebrpVar2.q.setOnClickListener(new View.OnClickListener() { // from class: ebqy
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebvwVar.f(new dvxf(5), view);
                        ebrp.this.g(ebryVar2, ((ebpl) ebrsVar2).b.a());
                    }
                });
                final ebqz ebqzVar = new ebqz(ebrpVar2, ebryVar2);
                ebrpVar2.k.setOnClickListener(new View.OnClickListener() { // from class: ebqj
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebvwVar.f(new dvxf(5), view);
                        ((ebpl) ebrsVar2).b.d = ebqzVar;
                        ebrp.this.j(view);
                    }
                });
                ebrf ebrfVar = new ebrf(ebrpVar2, ebrsVar2);
                ebrpVar2.addOnAttachStateChangeListener(ebrfVar);
                ebrg ebrgVar = new ebrg(ebrpVar2);
                ebrpVar2.addOnAttachStateChangeListener(ebrgVar);
                int[] iArr = kvo.a;
                if (ebrpVar2.isAttachedToWindow()) {
                    ebrfVar.onViewAttachedToWindow(ebrpVar2);
                    ebrgVar.onViewAttachedToWindow(ebrpVar2);
                }
                ebrpVar2.k(false);
            }
        });
        this.b.b();
    }

    public final void d(final ebqh ebqhVar) {
        this.b.c(new Runnable() { // from class: ebqe
            @Override // java.lang.Runnable
            public final void run() {
                ebrp ebrpVar = ExpressSignInLayout.this.a;
                ebrpVar.getClass();
                ebqhVar.a(ebrpVar);
            }
        });
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new ebod(this);
    }
}
