package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebmc {
    public final ebbb a;
    public final eays b;
    private final ecau c;
    private final ecaq d;
    private final ecaq e;
    private final ecaq f;
    private final ecaq g;
    private final ecaq h;
    private final ecaq i;
    private final ecaq j;
    private final ecaq k;
    private final ecaq l = new ecaq() { // from class: eblq
        @Override // defpackage.ecaq
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return ebmc.c(layoutInflater);
        }
    };
    private int m;

    public ebmc(final ebbb ebbbVar, final ecau ecauVar, final ezoo ezooVar) {
        ecat ecatVar;
        ecas ecasVar;
        ecar ecarVar;
        ebvw ebvwVar;
        ebpc ebpcVar;
        this.a = ebbbVar;
        this.c = ecauVar;
        new ebmb(ecauVar);
        ebzk ebzkVar = new ebzk();
        ebzkVar.a = new ecat() { // from class: ecak
            @Override // defpackage.ecat
            public final void a(View view) {
            }
        };
        ebzkVar.b = new ecas() { // from class: ecal
            @Override // defpackage.ecas
            public final void a() {
            }
        };
        ebzkVar.c = new ecar() { // from class: ecam
            @Override // defpackage.ecar
            public final void a() {
            }
        };
        ebzkVar.a();
        ebzkVar.b();
        ebzkVar.d = new ecan();
        ebzkVar.a = new ecat() { // from class: ebln
            @Override // defpackage.ecat
            public final void a(View view) {
                ebmc ebmcVar = ebmc.this;
                ebbg ebbgVar = (ebbg) ebmcVar.a;
                ebbgVar.k.a(view, true != ((ebgd) ebbgVar.e).g.e() ? 90575 : 90576);
                ebmcVar.d(37);
                ebga ebgaVar = ((ebbg) ebmcVar.a).e;
            }
        };
        ebzkVar.b = new ecas() { // from class: eblo
            @Override // defpackage.ecas
            public final void a() {
                ebmc.this.d(38);
            }
        };
        ebzkVar.c = new ecar() { // from class: eblp
            @Override // defpackage.ecar
            public final void a() {
                ebga ebgaVar = ((ebbg) ebmc.this.a).e;
            }
        };
        ebbg ebbgVar = (ebbg) ebbbVar;
        ebzkVar.d = ebbgVar.k;
        ebga ebgaVar = ebbgVar.e;
        ebzkVar.a();
        ebga ebgaVar2 = ((ebbg) ebbbVar).e;
        ebzkVar.b();
        ebzkVar.e = ((ebgd) ((ebbg) ebbbVar).e).o;
        if (ebzkVar.f != 1 || (ecatVar = ebzkVar.a) == null || (ecasVar = ebzkVar.b) == null || (ecarVar = ebzkVar.c) == null || (ebvwVar = ebzkVar.d) == null || ebzkVar.g == 0 || (ebpcVar = ebzkVar.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (ebzkVar.a == null) {
                sb.append(" onViewCreatedCallback");
            }
            if (ebzkVar.b == null) {
                sb.append(" onDismissCallback");
            }
            if (ebzkVar.c == null) {
                sb.append(" onDestroyCallback");
            }
            if (ebzkVar.d == null) {
                sb.append(" visualElements");
            }
            if (ebzkVar.f == 0) {
                sb.append(" isExperimental");
            }
            if (ebzkVar.g == 0) {
                sb.append(" largeScreenDialogAlignment");
            }
            if (ebzkVar.e == null) {
                sb.append(" materialVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ebzl ebzlVar = new ebzl(ecatVar, ecasVar, ecarVar, ebvwVar, ebpcVar);
        if (ecauVar.an == null) {
            emxf.m(ecauVar.al == null, "initialize() must be called before setViewProviders()");
            ecauVar.an = ebzlVar;
            ecauVar.ao.b();
        }
        final ebly eblyVar = new ebly(ecauVar);
        this.d = new ecaq() { // from class: ebmk
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                eaym eaymVar = new eaym(layoutInflater.getContext());
                final ebbb ebbbVar2 = ebbb.this;
                ebbg ebbgVar2 = (ebbg) ebbbVar2;
                ebgw ebgwVar = ((ebgd) ebbgVar2.e).e;
                final eayh eayhVar = new eayh(ebbgVar2.c, emux.a, ebbgVar2.m);
                ksz kszVar = new ksz() { // from class: ebml
                    @Override // defpackage.ksz
                    public final Object a() {
                        ebbg ebbgVar3 = (ebbg) ebbb.this;
                        emxc emxcVar = ebbgVar3.h;
                        return ebbgVar3.b.a();
                    }
                };
                ebtw ebtwVar = ebbgVar2.f;
                ezoo ezooVar2 = ezooVar;
                if (ezooVar2 == null) {
                    throw new NullPointerException("Null logContext");
                }
                ebny ebnyVar = eblyVar;
                ebvw ebvwVar2 = ebbgVar2.k;
                eavd eavdVar = (eavd) ebgwVar.c().e(new eavd() { // from class: ebmm
                    @Override // defpackage.eavd
                    public final void a(View view, Object obj) {
                        eayh eayhVar2 = eayh.this;
                        eayn.a(view, eayhVar2.b, ewom.MISC_PRIVACY_POLICY_SCREEN, eayhVar2.a, obj, "https://www.google.com/policies/privacy");
                    }
                });
                eavd eavdVar2 = (eavd) ebgwVar.d().e(new eavd() { // from class: ebmn
                    @Override // defpackage.eavd
                    public final void a(View view, Object obj) {
                        eayh eayhVar2 = eayh.this;
                        eayn.a(view, eayhVar2.b, ewom.TERMS_OF_SERVICE_SCREEN, eayhVar2.a, obj, "https://myaccount.google.com/termsofservice");
                    }
                });
                emxc b = ebgwVar.b();
                emxc a = ebgwVar.a();
                emxf.a(true);
                eayg eaygVar = new eayg(kszVar, ebtwVar, ezooVar2, ebvwVar2, eavdVar, eavdVar2, b, a, ebnyVar);
                eaymVar.o = eaygVar.b;
                eaymVar.p = eaygVar.c;
                eaymVar.t = eaygVar.d;
                eaymVar.q = eaygVar.a;
                eaymVar.s = eaygVar.g;
                eaymVar.n.clear();
                eaymVar.i.setOnClickListener(eaymVar.g(eaygVar.e, 18));
                eaymVar.j.setOnClickListener(eaymVar.g(eaygVar.f, 19));
                eaymVar.n.add(new eayl(eaymVar));
                eaymVar.r = new eayk(eaymVar);
                eaymVar.b(eaymVar.t);
                int c = ebnr.c(eaymVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + ebnr.c(eaymVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                eaymVar.setPadding(eaymVar.getPaddingLeft() + c, eaymVar.getPaddingTop(), eaymVar.getPaddingRight() + c, eaymVar.getPaddingBottom());
                return eaymVar;
            }
        };
        this.e = new ecaq() { // from class: ebnc
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Context context = layoutInflater.getContext();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, eblj.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                try {
                    obtainStyledAttributes.getColor(4, ebli.a(context, R.color.og_background_light));
                    obtainStyledAttributes.getColor(10, ebli.a(context, R.color.og_default_icon_color_light));
                    obtainStyledAttributes.getColor(11, ebli.a(context, R.color.og_incognito_top_tight_icon_color_light));
                    obtainStyledAttributes.getColor(8, ebli.a(context, R.color.og_menu_title_color_light));
                    obtainStyledAttributes.getColor(9, ebli.a(context, R.color.google_white));
                    Drawable a = ku.a(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                    obtainStyledAttributes.recycle();
                    ImageView imageView = new ImageView(layoutInflater.getContext());
                    imageView.setImageDrawable(a);
                    return imageView;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            }
        };
        this.f = new ecaq() { // from class: ebnb
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Context context = layoutInflater.getContext();
                TextView textView = new TextView(context);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(ebnr.d(context, R.attr.ogTextAppearanceSubhead1));
                textView.setTextColor(dtqo.a(context, R.attr.colorOnSurface));
                textView.setGravity(1);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                eavn.a(textView);
                return textView;
            }
        };
        this.g = new ecaq() { // from class: eblr
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                ecau ecauVar2 = ecau.this;
                if (ecauVar2.Q == null) {
                    return ebmc.c(layoutInflater);
                }
                final ezoo ezooVar2 = ezooVar;
                ebny ebnyVar = eblyVar;
                final ebbb ebbbVar2 = ebbbVar;
                ebnh ebnhVar = new ebnh(layoutInflater.getContext());
                lkr Q = ecauVar2.Q();
                View findViewById = ebnhVar.findViewById(R.id.sign_in_button);
                ebon ebonVar = new ebon(new View.OnClickListener() { // from class: ebng
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ezon ezonVar = (ezon) ezooVar2.toBuilder();
                        ezonVar.copyOnWrite();
                        ezoo ezooVar3 = (ezoo) ezonVar.instance;
                        ezooVar3.c = 10;
                        ezooVar3.b |= 1;
                        ezoo ezooVar4 = (ezoo) ezonVar.build();
                        ebbg ebbgVar2 = (ebbg) ebbb.this;
                        ebbgVar2.f.a(null, ezooVar4);
                        ((ebbe) ebbgVar2.d).b.a(view, null);
                    }
                });
                ebonVar.d = ebnyVar.b();
                ebonVar.e = ebnyVar.a();
                findViewById.setOnClickListener(new ebol(ebonVar));
                ebmh ebmhVar = new ebmh(ebbbVar2, ebnhVar.getContext(), Q);
                ebmhVar.b();
                ebmhVar.c();
                ebbk ebbkVar = new ebbk(ebbbVar2);
                ebbkVar.b();
                ebmhVar.d = ebbkVar.a();
                ebmg a = ebmhVar.a();
                int c = ebnr.c(ebnhVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + ebnr.c(ebnhVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                ebkq ebkqVar = ((ebgd) ((ebbg) ebbbVar2).e).o;
                ebmd ebmdVar = (ebmd) a;
                ebnh.b((RecyclerView) ebnhVar.findViewById(R.id.cards_and_actions), ebnhVar.a(ebmdVar.a, ebkqVar, ebbbVar2, ebnyVar, c));
                ebnh.b((RecyclerView) ebnhVar.findViewById(R.id.common_actions), ebnhVar.a(ebmdVar.b, ebkqVar, ebbbVar2, ebnyVar, c));
                return ebnhVar;
            }
        };
        this.h = new ecaq() { // from class: ebls
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                ecau ecauVar2 = ecau.this;
                if (ecauVar2.Q == null) {
                    return ebmc.c(layoutInflater);
                }
                ezoo ezooVar2 = ezooVar;
                final ebny ebnyVar = eblyVar;
                final ebbb ebbbVar2 = ebbbVar;
                lkr Q = ecauVar2.Q();
                ebmj ebmjVar = new ebmj(layoutInflater.getContext());
                eaxz b = ebmc.b(ebbbVar2, Q);
                int c = ebnr.c(ebmjVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing);
                ebbg ebbgVar2 = (ebbg) ebbbVar2;
                ebmj.b((RecyclerView) ebmjVar.findViewById(R.id.accounts), new eazq(ebmjVar.getContext(), eblm.a(ebbbVar2), new eaze() { // from class: ebmi
                    @Override // defpackage.eaze
                    public final void a(Object obj) {
                        ebny.this.a().run();
                        ((ebbg) ebbbVar2).b.h(obj);
                    }
                }, ebnyVar, ezooVar2, ebbgVar2.k, c, b, true));
                ebmh ebmhVar = new ebmh(ebbbVar2, ebmjVar.getContext(), Q);
                ebmhVar.e = ebll.a(ebmjVar.getContext(), ebbbVar2, ezooVar2);
                ebmhVar.b();
                ebmhVar.c();
                ebbk ebbkVar = new ebbk(ebbbVar2);
                ebbkVar.b();
                ebmhVar.d = ebbkVar.a();
                ebmg a = ebmhVar.a();
                ebkq ebkqVar = ((ebgd) ebbgVar2.e).o;
                ebmd ebmdVar = (ebmd) a;
                ebmj.b((RecyclerView) ebmjVar.findViewById(R.id.cards_and_actions), ebmjVar.a(ebmdVar.a, ebkqVar, ebbbVar2, ebnyVar, c));
                ebmj.b((RecyclerView) ebmjVar.findViewById(R.id.common_actions), ebmjVar.a(ebmdVar.b, ebkqVar, ebbbVar2, ebnyVar, c + ebnr.c(ebmjVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing)));
                return ebmjVar;
            }
        };
        this.i = new ecaq() { // from class: eblt
            /* JADX WARN: Removed duplicated region for block: B:28:0x0204  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0302  */
            /* JADX WARN: Type inference failed for: r11v5, types: [ebgv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v23, types: [ebgv, java.lang.Object] */
            @Override // defpackage.ecaq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View a(android.view.LayoutInflater r32, android.view.ViewGroup r33) {
                /*
                    Method dump skipped, instructions count: 780
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eblt.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
            }
        };
        this.j = new ecaq() { // from class: eblu
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                ebne ebneVar = new ebne(layoutInflater.getContext());
                final ebbb ebbbVar2 = ebbb.this;
                ebbg ebbgVar2 = (ebbg) ebbbVar2;
                ebga ebgaVar3 = ebbgVar2.e;
                lkr Q = ecauVar.Q();
                emxf.a(false);
                MaterialButton materialButton = (MaterialButton) ebneVar.findViewById(R.id.turn_off_incognito_button);
                ebgt ebgtVar = (ebgt) ((ebgd) ebbgVar2.e).b.c();
                materialButton.setText(ebgtVar.b());
                ebneVar.getContext();
                materialButton.c(ebgtVar.c());
                final ezoo ezooVar2 = ezooVar;
                ebon ebonVar = new ebon(new View.OnClickListener() { // from class: ebnd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ebbg ebbgVar3 = (ebbg) ebbb.this;
                        ezon ezonVar = (ezon) ezooVar2.toBuilder();
                        ezonVar.copyOnWrite();
                        ezoo ezooVar3 = (ezoo) ezonVar.instance;
                        ezooVar3.c = 7;
                        ezooVar3.b |= 1;
                        ((ebtv) ebbgVar3.f).b(3, null, (ezoo) ezonVar.build());
                    }
                });
                ebny ebnyVar = eblyVar;
                ebonVar.d = ebnyVar.b();
                ebonVar.e = ebnyVar.a();
                materialButton.setOnClickListener(new ebol(ebonVar));
                ebmh ebmhVar = new ebmh(ebbbVar2, ebneVar.getContext(), Q);
                ebbk ebbkVar = new ebbk(ebbbVar2);
                ebbkVar.b();
                ebmhVar.d = ebbkVar.a();
                lld lldVar = ((ebmd) ebmhVar.a()).b;
                Context context = ebneVar.getContext();
                if (lldVar == null) {
                    lldVar = new llg();
                }
                lld lldVar2 = lldVar;
                ebbc ebbcVar = ebbgVar2.b;
                ebvw ebvwVar2 = ebbgVar2.k;
                ebga ebgaVar4 = ebbgVar2.e;
                ebov.a(ebneVar.a, new ebds(context, ebbcVar, lldVar2, ebnyVar, ebvwVar2, ebnr.c(ebneVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + ebnr.c(ebneVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing)));
                ebneVar.a.setNestedScrollingEnabled(false);
                RecyclerView recyclerView = ebneVar.a;
                ebneVar.getContext();
                recyclerView.ap(new LinearLayoutManager());
                return ebneVar;
            }
        };
        this.k = new ecaq() { // from class: eblv
            @Override // defpackage.ecaq
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                return frameLayout;
            }
        };
        this.b = new eblz(this);
        ebma ebmaVar = new ebma(this, ebbbVar);
        ebma ebmaVar2 = ecauVar.ap;
        if (ebmaVar2 != null && ecauVar.aj) {
            ebmaVar2.b();
        }
        ecauVar.ap = ebmaVar;
        if (ecauVar.aj) {
            ebmaVar.a();
        }
    }

    public static final eaxz b(ebbb ebbbVar, lkr lkrVar) {
        emux emuxVar = emux.a;
        emxc emxcVar = ((ebgd) ((ebbg) ebbbVar).e).h;
        if (emxcVar == null) {
            throw new NullPointerException("Null criticalAlertFeature");
        }
        eaya a = eaxz.a();
        a.b(eayb.a(lkrVar, emuxVar, emxcVar));
        return a.a();
    }

    static /* synthetic */ View c(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    public final void a() {
        int i;
        ExpandableDialogView expandableDialogView;
        ebbg ebbgVar = (ebbg) this.a;
        ebbc ebbcVar = ebbgVar.b;
        if (ebbcVar.e()) {
            emxc emxcVar = ebbgVar.h;
            i = ebbcVar.b().isEmpty() ? 3 : ((ebbg) this.a).b.a() != null ? 5 : 4;
        } else {
            i = 1;
        }
        int i2 = this.m;
        if (i != i2) {
            this.m = i;
            emxf.l(true);
            int i3 = i - 1;
            ecaq ecaqVar = i3 != 0 ? i3 != 3 ? this.e : this.f : this.l;
            if (ecaqVar == null) {
                throw new NullPointerException("Null headerViewProvider");
            }
            ecaq ecaqVar2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? this.i : this.h : this.g : this.j : this.k;
            if (ecaqVar2 == null) {
                throw new NullPointerException("Null contentViewProvider");
            }
            ecaq ecaqVar3 = i == 1 ? this.l : this.d;
            if (ecaqVar3 == null) {
                throw new NullPointerException("Null footerViewProvider");
            }
            int a = i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.og_account_and_settings : R.string.og_choose_an_account_title : R.string.og_sign_in_ : ((ebgt) ((ebgd) ((ebbg) this.a).e).b.c()).a();
            ecau ecauVar = this.c;
            ebzm ebzmVar = new ebzm(ecaqVar, ecaqVar2, ecaqVar3, a);
            efbd.c();
            ecauVar.al = ebzmVar;
            ExpandableDialogView expandableDialogView2 = ecauVar.am;
            if (expandableDialogView2 != null) {
                ecauVar.aT(ebzmVar, expandableDialogView2);
            }
            Dialog dialog = ecauVar.d;
            if (dialog != null) {
                dialog.setTitle(ebzmVar.d);
            }
        }
        if (i2 == 0) {
            ecau ecauVar2 = this.c;
            efbd.c();
            SparseArray sparseArray = ecauVar2.ak;
            if (sparseArray == null || (expandableDialogView = ecauVar2.am) == null) {
                return;
            }
            expandableDialogView.restoreHierarchyState(sparseArray);
        }
    }

    public final void d(int i) {
        ebbg ebbgVar = (ebbg) this.a;
        Object a = ebbgVar.b.a();
        ezon ezonVar = (ezon) ezoo.a.createBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        ezooVar.d = 1;
        ezooVar.b |= 2;
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        ezooVar2.f = 8;
        ezooVar2.b |= 32;
        ezonVar.copyOnWrite();
        ezoo ezooVar3 = (ezoo) ezonVar.instance;
        ezooVar3.e = 3;
        ezooVar3.b = 8 | ezooVar3.b;
        ezonVar.copyOnWrite();
        ezoo ezooVar4 = (ezoo) ezonVar.instance;
        ezooVar4.c = i - 1;
        ezooVar4.b |= 1;
        ebbgVar.f.a(a, (ezoo) ezonVar.build());
    }
}
