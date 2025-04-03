package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipb implements eiph {
    public static final eipn a = new eipn("FooterBarMixin");
    public final Context b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    public LinearLayout g;
    public eipc h;
    public eipc i;
    public int j;
    int k;
    int l;
    final int m;
    final int n;
    public final eiop o;
    private final ViewStub p;
    private int q;
    private int r;
    private int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;

    public eipb(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        eiop eiopVar = new eiop();
        this.o = eiopVar;
        Context context = templateLayout.getContext();
        this.b = context;
        this.p = (ViewStub) templateLayout.g(R.id.suc_layout_footer);
        eipe.a.clear();
        einu einuVar = (einu) templateLayout;
        this.c = einuVar.e();
        this.d = einuVar.d();
        this.e = einuVar.f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, einv.a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.m = dimensionPixelSize;
        this.r = obtainStyledAttributes.getDimensionPixelSize(16, dimensionPixelSize);
        this.s = obtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize);
        this.k = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.l = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        int color = obtainStyledAttributes.getColor(18, 0);
        this.t = color;
        int color2 = obtainStyledAttributes.getColor(22, 0);
        this.u = color2;
        this.f = obtainStyledAttributes.getBoolean(0, false);
        int color3 = obtainStyledAttributes.getColor(21, 0);
        this.v = color3;
        int color4 = obtainStyledAttributes.getColor(25, 0);
        this.w = color4;
        obtainStyledAttributes.getColor(20, 0);
        obtainStyledAttributes.getColor(24, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = obtainStyledAttributes.getResourceId(19, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(23, 0);
        obtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            eipc a2 = eipd.a(resourceId2, context);
            eioc.b("setSecondaryButton");
            i();
            einz einzVar = new einz(h(a2, true != eios.q(context) ? R.style.SucPartnerCustomizationButton_Secondary : R.style.SucGlifMaterialButton_Secondary, eioq.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR), eioq.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR, eioq.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, eioq.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, eioq.CONFIG_FOOTER_SECONDARY_BUTTON_DISABLED_TEXT_COLOR, j(a2.a), eioq.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR, eioq.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START, eioq.CONFIG_FOOTER_BUTTON_TEXT_SIZE, eioq.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, eioq.CONFIG_FOOTER_BUTTON_FONT_FAMILY, eioq.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, eioq.CONFIG_FOOTER_BUTTON_TEXT_STYLE, eioq.CONFIG_FOOTER_BUTTON_RADIUS, eioq.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object k = k(a2, einzVar);
            final Button button = (Button) k;
            this.q = button.getId();
            if (k instanceof eipg) {
            } else if (button instanceof FooterActionButton) {
                ((FooterActionButton) k).b = false;
            } else {
                a.d("Set the primary button style error when setting secondary button.");
            }
            this.i = a2;
            c(button, color2);
            l(button, einzVar);
            if (eios.q(context)) {
                boolean z = this.i.c;
                eipe.c(button, color4);
            }
            d();
            button.post(new Runnable() { // from class: eioz
                @Override // java.lang.Runnable
                public final void run() {
                    eipb eipbVar = eipb.this;
                    if (eios.r(eipbVar.b) && eipm.a(eipbVar.b)) {
                        if (eipbVar.j == 0 || eipbVar.a().getVisibility() != 0) {
                            button.requestFocus();
                        }
                    }
                }
            });
            eiopVar.b(true, true);
        }
        if (resourceId != 0) {
            eipc a3 = eipd.a(resourceId, context);
            eioc.b("setPrimaryButton");
            i();
            einz einzVar2 = new einz(h(a3, true != eios.q(context) ? R.style.SucPartnerCustomizationButton_Primary : R.style.SucGlifMaterialButton_Primary, eioq.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR), eioq.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR, eioq.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, eioq.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, eioq.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, j(a3.a), eioq.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, eioq.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, eioq.CONFIG_FOOTER_BUTTON_TEXT_SIZE, eioq.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, eioq.CONFIG_FOOTER_BUTTON_FONT_FAMILY, eioq.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, eioq.CONFIG_FOOTER_BUTTON_TEXT_STYLE, eioq.CONFIG_FOOTER_BUTTON_RADIUS, eioq.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object k2 = k(a3, einzVar2);
            final Button button2 = (Button) k2;
            this.j = button2.getId();
            if (k2 instanceof eipg) {
            } else if (button2 instanceof FooterActionButton) {
                ((FooterActionButton) k2).b = true;
            } else {
                a.d("Set the primary button style error when setting primary button.");
            }
            this.h = a3;
            c(button2, color);
            l(button2, einzVar2);
            if (eios.q(context)) {
                boolean z2 = this.h.c;
                eipe.c(button2, color3);
            }
            d();
            button2.post(new Runnable() { // from class: eioy
                @Override // java.lang.Runnable
                public final void run() {
                    eipb eipbVar = eipb.this;
                    if (eios.r(eipbVar.b) && eipm.a(eipbVar.b)) {
                        button2.requestFocus();
                    }
                }
            });
            eiopVar.c(true, true);
        }
    }

    private final int h(eipc eipcVar, int i, eioq eioqVar) {
        int i2 = eipcVar.d;
        if (i2 != 0 && !this.c && !eios.q(this.b)) {
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        Context context = this.b;
        return eios.h(context).c(context, eioqVar) == 0 ? true != eios.q(this.b) ? R.style.SucPartnerCustomizationButton_Secondary : R.style.SucGlifMaterialButton_Secondary : true != eios.q(this.b) ? R.style.SucPartnerCustomizationButton_Primary : R.style.SucGlifMaterialButton_Primary;
    }

    private final LinearLayout i() {
        if (this.g == null) {
            if (this.p == null) {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
            this.p.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.b, R.style.SucPartnerCustomizationButtonBar_Stackable)));
            this.p.setLayoutResource(R.layout.suc_footer_button_bar);
            LinearLayout linearLayout = (LinearLayout) this.p.inflate();
            this.g = linearLayout;
            if (linearLayout != null) {
                linearLayout.setId(View.generateViewId());
                linearLayout.setPadding(this.k, this.r, this.l, this.s);
                if (e()) {
                    linearLayout.setGravity(8388629);
                }
            }
            LinearLayout linearLayout2 = this.g;
            if (linearLayout2 != null && this.c) {
                if (!this.e) {
                    Context context = this.b;
                    linearLayout2.setBackgroundColor(eios.h(context).c(context, eioq.CONFIG_FOOTER_BAR_BG_COLOR));
                }
                if (eios.h(this.b).s(eioq.CONFIG_FOOTER_BUTTON_PADDING_TOP)) {
                    Context context2 = this.b;
                    this.r = (int) eios.h(context2).a(context2, eioq.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                }
                if (eios.h(this.b).s(eioq.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM)) {
                    Context context3 = this.b;
                    this.s = (int) eios.h(context3).a(context3, eioq.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                }
                if (eios.h(this.b).s(eioq.CONFIG_FOOTER_BAR_PADDING_START)) {
                    Context context4 = this.b;
                    this.k = (int) eios.h(context4).a(context4, eioq.CONFIG_FOOTER_BAR_PADDING_START);
                }
                if (eios.h(this.b).s(eioq.CONFIG_FOOTER_BAR_PADDING_END)) {
                    Context context5 = this.b;
                    this.l = (int) eios.h(context5).a(context5, eioq.CONFIG_FOOTER_BAR_PADDING_END);
                }
                linearLayout2.setPadding(this.k, this.r, this.l, this.s);
                if (eios.h(this.b).s(eioq.CONFIG_FOOTER_BAR_MIN_HEIGHT)) {
                    Context context6 = this.b;
                    int a2 = (int) eios.h(context6).a(context6, eioq.CONFIG_FOOTER_BAR_MIN_HEIGHT);
                    if (a2 > 0) {
                        linearLayout2.setMinimumHeight(a2);
                    }
                }
            }
        }
        return this.g;
    }

    private static eioq j(int i) {
        switch (i) {
            case 1:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return eioq.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.eipf k(defpackage.eipc r7, defpackage.einz r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.b
            int r8 = r8.o
            boolean r1 = defpackage.eios.q(r0)
            r2 = 0
            if (r1 == 0) goto L45
            r1 = 2132149524(0x7f160514, float:1.9941057E38)
            if (r8 != r1) goto L1e
            eipg r3 = new eipg     // Catch: java.lang.IllegalArgumentException -> L2c
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper     // Catch: java.lang.IllegalArgumentException -> L2c
            r4.<init>(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L2c
            r5 = 2130970670(0x7f04082e, float:1.7550057E38)
            r3.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L59
        L1e:
            eipg r3 = new eipg     // Catch: java.lang.IllegalArgumentException -> L2c
            android.view.ContextThemeWrapper r4 = new android.view.ContextThemeWrapper     // Catch: java.lang.IllegalArgumentException -> L2c
            r4.<init>(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L2c
            r5 = 2130970671(0x7f04082f, float:1.7550059E38)
            r3.<init>(r4, r5)     // Catch: java.lang.IllegalArgumentException -> L2c
            goto L59
        L2c:
            r3 = move-exception
            eipn r4 = defpackage.eipb.a
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "Applyed invalid material theme: "
            java.lang.String r3 = r5.concat(r3)
            r4.d(r3)
            if (r8 != r1) goto L42
            r8 = 2132149527(0x7f160517, float:1.9941063E38)
            goto L45
        L42:
            r8 = 2132149528(0x7f160518, float:1.9941065E38)
        L45:
            android.view.ContextThemeWrapper r1 = new android.view.ContextThemeWrapper
            r1.<init>(r0, r8)
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r1)
            r0 = 2131624801(0x7f0e0361, float:1.8876792E38)
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r1, r2)
            r3 = r8
            eipf r3 = (defpackage.eipf) r3
        L59:
            r8 = r3
            android.widget.Button r8 = (android.widget.Button) r8
            int r0 = android.view.View.generateViewId()
            r8.setId(r0)
            java.lang.CharSequence r0 = r7.b
            r8.setText(r0)
            r8.setOnClickListener(r7)
            r8.setVisibility(r2)
            r0 = 1
            r8.setEnabled(r0)
            boolean r0 = r3 instanceof defpackage.eipg
            if (r0 == 0) goto L7c
            r0 = r3
            eipg r0 = (defpackage.eipg) r0
            r0.k = r7
            goto L8d
        L7c:
            boolean r0 = r8 instanceof com.google.android.setupcompat.template.FooterActionButton
            if (r0 == 0) goto L86
            r0 = r3
            com.google.android.setupcompat.template.FooterActionButton r0 = (com.google.android.setupcompat.template.FooterActionButton) r0
            r0.a = r7
            goto L8d
        L86:
            eipn r7 = defpackage.eipb.a
            java.lang.String r0 = "Set the footer button error!"
            r7.d(r0)
        L8d:
            r8.getId()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eipb.k(eipc, einz):eipf");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0224  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l(android.widget.Button r19, defpackage.einz r20) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eipb.l(android.widget.Button, einz):void");
    }

    public final Button a() {
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.j);
    }

    public final Button b() {
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.q);
    }

    protected final void c(Button button, int i) {
        if (!this.d && i != 0) {
            HashMap hashMap = eipe.a;
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.g.addView(button);
        Button a2 = a();
        Button b = b();
        int i2 = 0;
        boolean z = a2 != null && a2.getVisibility() == 0;
        boolean z2 = b != null && b.getVisibility() == 0;
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            if (!z && !z2) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    protected final void d() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout i = i();
        Button a2 = a();
        Button b = b();
        i.removeAllViews();
        int i2 = this.b.getResources().getConfiguration().orientation;
        if (b != null) {
            i.addView(b);
        }
        if (!e() && !eios.q(this.b)) {
            Context context = this.b;
            LinearLayout i3 = i();
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            i3.addView(view);
        }
        if (a2 != null) {
            i.addView(a2);
        }
        if (a2 != null && (layoutParams2 = (LinearLayout.LayoutParams) a2.getLayoutParams()) != null) {
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            a2.setLayoutParams(layoutParams2);
        }
        if (b != null && (layoutParams = (LinearLayout.LayoutParams) b.getLayoutParams()) != null) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            b.setLayoutParams(layoutParams);
        }
        if (eios.q(this.b)) {
            this.g.post(new Runnable() { // from class: eipa
                /* JADX WARN: Removed duplicated region for block: B:69:0x021a  */
                /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0228  */
                /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 558
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.eipa.run():void");
                }
            });
        }
    }

    protected final boolean e() {
        if (!eios.h(this.b).s(eioq.CONFIG_FOOTER_BUTTON_ALIGNED_END)) {
            return this.f;
        }
        Context context = this.b;
        return eios.h(context).l(context, eioq.CONFIG_FOOTER_BUTTON_ALIGNED_END, false);
    }

    public final boolean f() {
        return a() != null && a().getVisibility() == 0;
    }

    public final boolean g() {
        return b() != null && b().getVisibility() == 0;
    }
}
