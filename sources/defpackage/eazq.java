package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eazq extends vk {
    public final eave a;
    public final emxc d;
    public Object e;
    public engw g;
    private final eawd h;
    private final eayo i;
    private final ebvw j;
    private final eaxz k;
    private final eazf l;
    private final ebny n;
    private final boolean p;
    private final int q;
    private final List m = new ArrayList();
    private final eays o = new eazo(this);
    public boolean f = false;
    private final llh r = new llh() { // from class: eazi
        @Override // defpackage.llh
        public final void a(Object obj) {
            eazq.this.F();
        }
    };

    public eazq(final Context context, final eazh eazhVar, final eaze eazeVar, final ebny ebnyVar, ezoo ezooVar, ebvw ebvwVar, int i, eaxz eaxzVar, boolean z) {
        eazs eazsVar = (eazs) eazhVar;
        this.h = eazsVar.a;
        this.a = eazsVar.b;
        eayo eayoVar = eazsVar.c;
        this.i = eayoVar;
        this.d = eazsVar.e;
        this.j = ebvwVar;
        this.k = eaxzVar;
        this.n = ebnyVar;
        ksp kspVar = new ksp() { // from class: eazj
            @Override // defpackage.ksp
            public final void accept(final Object obj) {
                final eazq eazqVar = eazq.this;
                if (eazqVar.d.g()) {
                    final eazh eazhVar2 = eazhVar;
                    final Context context2 = context;
                    ebnx.a(ebnyVar, new Runnable() { // from class: eazl
                        @Override // java.lang.Runnable
                        public final void run() {
                            adib adibVar = ((eayy) eazq.this.d.c()).b;
                            Activity activity = adibVar.a;
                            final eixn eixnVar = (eixn) obj;
                            emxc j = emxc.j(activity.getString(R.string.account_switch_dialog_title));
                            SpannableString spannableString = new SpannableString(activity.getString(R.string.account_switch_dialog_explanation));
                            String string = activity.getString(R.string.account_switch_dialog_positive_button_text);
                            final ffbr ffbrVar = adibVar.b;
                            final eayt eaytVar = new eayt(j, spannableString, emxc.j(new eayu(string, new ksp() { // from class: adhz
                                @Override // defpackage.ksp
                                public final void accept(Object obj2) {
                                    ((adhn) ffbr.this.b()).a(new adhm(adhl.SIGN_OUT_ACCOUNT, eixnVar.a()));
                                }
                            })));
                            final Context context3 = context2;
                            Drawable a = ebor.a(context3, R.drawable.quantum_gm_ic_info_outline_vd_theme_24, ebnr.b(context3, R.attr.ogCustomDialogIconColor));
                            ehft ehftVar = new ehft(context3, ebnr.d(context3, R.attr.ogMaterialAlertDialogCentered));
                            ehftVar.y((CharSequence) eaytVar.a.e(context3.getString(R.string.og_account_switching_deactivated)));
                            ehftVar.k(a);
                            ehftVar.n(eaytVar.b);
                            emxc emxcVar = eaytVar.c;
                            ehftVar.u(((eayu) ((emxn) emxcVar).a).a, new DialogInterface.OnClickListener() { // from class: eayx
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    ((eayu) ((emxn) ((eayt) eayw.this).c).a).b.accept(context3);
                                }
                            });
                            ehftVar.o(R.string.og_dismiss, null);
                            iv create = ehftVar.create();
                            create.show();
                            TextView textView = (TextView) create.findViewById(android.R.id.message);
                            if (textView != null) {
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                                textView.setMinHeight((int) (context3.getResources().getDisplayMetrics().density * 48.0f));
                            }
                        }
                    });
                }
            }
        };
        ebtw ebtwVar = eazsVar.d;
        ezooVar.getClass();
        this.l = new eazf(eayoVar, ebtwVar, ezooVar, ebvwVar, new eaze() { // from class: eazk
            @Override // defpackage.eaze
            public final void a(Object obj) {
                eazq.this.f = true;
                eazeVar.a(obj);
            }
        }, kspVar);
        this.q = i;
        this.p = z;
    }

    public static int m(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        return dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start);
    }

    public final void F() {
        if (this.f && this.p) {
            return;
        }
        efbd.c();
        ArrayList arrayList = new ArrayList(this.m);
        engw engwVar = this.g;
        emxc emxcVar = this.k.a;
        if (emxcVar.g() && ((eaye) emxcVar.c()).c.g()) {
            engr engrVar = new engr();
            engr engrVar2 = new engr();
            int size = engwVar.size();
            for (int i = 0; i < size; i++) {
                Object obj = engwVar.get(i);
                if (((eayd) ((eaye) this.k.a.c()).c.c()).b(obj) != null) {
                    engrVar.h(obj);
                } else {
                    engrVar2.h(obj);
                }
            }
            engr engrVar3 = new engr();
            engrVar3.j(engrVar.g());
            engrVar3.j(engrVar2.g());
            engwVar = engrVar3.g();
        }
        ArrayList arrayList2 = new ArrayList(engwVar);
        Object obj2 = this.e;
        if (obj2 != null) {
            arrayList2.remove(obj2);
        }
        mq a = mv.a(new eazp(this, arrayList, arrayList2));
        this.m.clear();
        this.m.addAll(arrayList2);
        a.c(this);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.m.size();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new eazb(viewGroup, this.a, this.h, this.d, this.k, this.q, this.j, this.n);
    }

    @Override // defpackage.vk
    public final /* synthetic */ void g(wr wrVar, int i) {
        float f;
        float f2;
        final eazb eazbVar = (eazb) wrVar;
        final Object obj = this.m.get(i);
        final eazf eazfVar = this.l;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eazc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eazf eazfVar2 = eazf.this;
                eazfVar2.b.a(eazfVar2.a.a(), eazfVar2.c);
                eazfVar2.e.f(new dvxf(5), view);
                eazfVar2.f.a(obj);
                eazfVar2.b.a(eazfVar2.a.a(), eazfVar2.d);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: eazd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eazf.this.g.accept(obj);
            }
        };
        AccountParticle accountParticle = eazbVar.s;
        accountParticle.m = true;
        accountParticle.b(eazbVar.w);
        eazbVar.x = obj;
        eazbVar.s.i.a(obj, new eaxw() { // from class: eaza
            @Override // defpackage.eaxw
            public final String a(String str) {
                eazb eazbVar2 = eazb.this;
                emxc emxcVar = eazbVar2.t;
                Context context = eazbVar2.a.getContext();
                boolean g = emxcVar.g();
                int i2 = R.string.og_use_account_a11y_no_period;
                if (g && ((eayy) eazbVar2.t.c()).a.a(obj)) {
                    eazbVar2.t.c();
                    i2 = R.string.og_account_deactivated_a11y;
                }
                return context.getString(i2, str);
            }
        });
        boolean z = eazbVar.t.g() && ((eayy) eazbVar.t.c()).a.a(obj);
        AccountParticle accountParticle2 = eazbVar.s;
        if (true == z) {
            onClickListener = onClickListener2;
        }
        accountParticle2.setOnClickListener(onClickListener);
        TextView textView = eazbVar.s.k;
        float f3 = 1.0f;
        if (z) {
            eazbVar.t.c();
            f = 0.62f;
        } else {
            f = 1.0f;
        }
        textView.setAlpha(f);
        TextView textView2 = eazbVar.s.l;
        if (z) {
            eazbVar.t.c();
            f2 = 0.74f;
        } else {
            f2 = 1.0f;
        }
        textView2.setAlpha(f2);
        AccountParticleDisc accountParticleDisc = eazbVar.s.j;
        if (z) {
            eazbVar.t.c();
            f3 = 0.38f;
        }
        accountParticleDisc.setAlpha(f3);
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            accountParticleDisc.a.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            accountParticleDisc.a.setColorFilter((ColorFilter) null);
        }
        eazbVar.s.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(true != z ? 8 : 0);
        emxc emxcVar = eazbVar.v;
        if (emxcVar.g() && ((eaye) emxcVar.c()).c.g()) {
            ((lld) ((eaye) eazbVar.v.c()).c.c()).f(((eaye) eazbVar.v.c()).a, eazbVar.u);
        }
    }

    @Override // defpackage.vk
    public final void h(RecyclerView recyclerView) {
        this.i.d(this.o);
        emxc emxcVar = this.k.a;
        if (emxcVar.g() && ((eaye) emxcVar.c()).c.g()) {
            emxc emxcVar2 = ((eaye) emxcVar.c()).c;
            ((lld) emxcVar2.c()).k(this.r);
        }
        this.m.clear();
    }

    @Override // defpackage.vk
    public final void hc(RecyclerView recyclerView) {
        this.i.c(this.o);
        this.e = this.i.a();
        this.g = engw.n(this.i.b());
        emxc emxcVar = this.k.a;
        if (emxcVar.g() && ((eaye) emxcVar.c()).c.g()) {
            emxc emxcVar2 = ((eaye) this.k.a.c()).c;
            eaxz eaxzVar = this.k;
            ((lld) emxcVar2.c()).f(((eaye) eaxzVar.a.c()).a, this.r);
        }
        F();
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void k(wr wrVar) {
        eazb eazbVar = (eazb) wrVar;
        eazbVar.s.ho(eazbVar.w);
        eazbVar.s.m = false;
        emxc emxcVar = eazbVar.v;
        if (emxcVar.g() && ((eaye) emxcVar.c()).c.g()) {
            ((lld) ((eaye) eazbVar.v.c()).c.c()).k(eazbVar.u);
        }
    }
}
