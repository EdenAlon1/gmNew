package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehez extends dn {
    private int aA;
    private CharSequence aB;
    private int aC;
    private CharSequence aD;
    private TextView aE;
    private TextView aF;
    private ehop aG;
    private boolean aH;
    private CharSequence aI;
    private CharSequence aJ;
    public int ai;
    public CheckableImageButton aj;
    public Button ak;
    private int an;
    private ehee ao;
    private ehfj ap;
    private eheb aq;
    private ehef ar;
    private ehes as;
    private int at;
    private CharSequence au;
    private boolean av;
    private int aw;
    private CharSequence ax;
    private int ay;
    private CharSequence az;
    public final LinkedHashSet ag = new LinkedHashSet();
    public final LinkedHashSet ah = new LinkedHashSet();
    private final LinkedHashSet al = new LinkedHashSet();
    private final LinkedHashSet am = new LinkedHashSet();

    public static boolean aY(Context context) {
        return aZ(context, R.attr.windowFullscreen);
    }

    public static boolean aZ(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ehmp.e(context, ehes.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private static int ba(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_content_padding);
        int i = new ehfd(ehfo.d()).d;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int bb() {
        int i = this.an;
        return i != 0 ? i : aT().d();
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != this.av ? com.google.android.apps.messaging.R.layout.mtrl_picker_dialog : com.google.android.apps.messaging.R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = inflate.getContext();
        if (this.ar != null) {
            throw null;
        }
        if (this.av) {
            inflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(ba(context), -2));
        } else {
            inflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(ba(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_header_selection_text);
        this.aF = textView;
        textView.setAccessibilityLiveRegion(1);
        this.aj = (CheckableImageButton) inflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_header_toggle);
        this.aE = (TextView) inflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_title_text);
        this.aj.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.aj;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, ku.a(context, com.google.android.apps.messaging.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], ku.a(context, com.google.android.apps.messaging.R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.aj.setChecked(this.ai != 0);
        kvo.p(this.aj, null);
        aX(this.aj);
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: eheu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehez ehezVar = ehez.this;
                ehezVar.ak.setEnabled(ehezVar.aT().c());
                ehezVar.aj.toggle();
                ehezVar.ai = ehezVar.ai == 1 ? 0 : 1;
                ehezVar.aX(ehezVar.aj);
                ehezVar.aV();
            }
        });
        this.ak = (Button) inflate.findViewById(com.google.android.apps.messaging.R.id.confirm_button);
        if (aT().c()) {
            this.ak.setEnabled(true);
        } else {
            this.ak.setEnabled(false);
        }
        this.ak.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.ax;
        if (charSequence != null) {
            this.ak.setText(charSequence);
        } else {
            int i = this.aw;
            if (i != 0) {
                this.ak.setText(i);
            }
        }
        CharSequence charSequence2 = this.az;
        if (charSequence2 != null) {
            this.ak.setContentDescription(charSequence2);
        } else if (this.ay != 0) {
            this.ak.setContentDescription(z().getResources().getText(this.ay));
        }
        this.ak.setOnClickListener(new View.OnClickListener() { // from class: ehev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehez ehezVar = ehez.this;
                Iterator it = ehezVar.ag.iterator();
                while (it.hasNext()) {
                    ehfa ehfaVar = (ehfa) it.next();
                    ehezVar.aT().i();
                    ehfaVar.a();
                }
                ehezVar.hw();
            }
        });
        Button button = (Button) inflate.findViewById(com.google.android.apps.messaging.R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.aB;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.aA;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.aD;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.aC != 0) {
            button.setContentDescription(z().getResources().getText(this.aC));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: ehew
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ehez ehezVar = ehez.this;
                Iterator it = ehezVar.ah.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                ehezVar.hw();
            }
        });
        return inflate;
    }

    public final ehee aT() {
        if (this.ao == null) {
            this.ao = (ehee) this.m.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.ao;
    }

    public final String aU() {
        return aT().f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [ehfb] */
    public final void aV() {
        A();
        int bb = bb();
        ehee aT = aT();
        eheb ehebVar = this.aq;
        ehef ehefVar = this.ar;
        ehes ehesVar = new ehes();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", bb);
        bundle.putParcelable("GRID_SELECTOR_KEY", aT);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", ehebVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", ehefVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", ehebVar.d);
        ehesVar.at(bundle);
        this.as = ehesVar;
        if (this.ai == 1) {
            ehee aT2 = aT();
            eheb ehebVar2 = this.aq;
            ?? ehfbVar = new ehfb();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", bb);
            bundle2.putParcelable("DATE_SELECTOR_KEY", aT2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", ehebVar2);
            ehfbVar.at(bundle2);
            ehesVar = ehfbVar;
        }
        this.ap = ehesVar;
        this.aE.setText((this.ai == 1 && B().getConfiguration().orientation == 2) ? this.aJ : this.aI);
        aW(aU());
        cg cgVar = new cg(I());
        cgVar.E(com.google.android.apps.messaging.R.id.mtrl_calendar_frame, this.ap);
        cgVar.c();
        this.ap.aj.add(new ehey(this));
    }

    final void aW(String str) {
        TextView textView = this.aF;
        ehee aT = aT();
        A();
        textView.setContentDescription(aT.e());
        this.aF.setText(str);
    }

    public final void aX(CheckableImageButton checkableImageButton) {
        this.aj.setContentDescription(this.ai == 1 ? checkableImageButton.getContext().getString(com.google.android.apps.messaging.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.google.android.apps.messaging.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.an = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.ao = (ehee) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.aq = (eheb) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.ar = (ehef) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.at = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.au = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.ai = bundle.getInt("INPUT_MODE_KEY");
        this.aw = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.ax = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.ay = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.az = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.aA = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.aB = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.aC = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.aD = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.au;
        if (charSequence == null) {
            charSequence = A().getResources().getText(this.at);
        }
        this.aI = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(charSequence.toString(), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.aJ = charSequence;
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Context A = A();
        A();
        Dialog dialog = new Dialog(A, bb());
        Context context = dialog.getContext();
        this.av = aY(context);
        this.aG = new ehop(context, null, com.google.android.apps.messaging.R.attr.materialCalendarStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ehfk.a, com.google.android.apps.messaging.R.attr.materialCalendarStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.aG.K(context);
        this.aG.O(ColorStateList.valueOf(color));
        this.aG.N(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.an);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.ao);
        int i = ehdz.a;
        eheb ehebVar = this.aq;
        long j = ehebVar.a.f;
        long j2 = ehebVar.b.f;
        Long valueOf = Long.valueOf(ehebVar.d.f);
        int i2 = ehebVar.e;
        ehea eheaVar = ehebVar.c;
        ehes ehesVar = this.as;
        ehfd ehfdVar = ehesVar == null ? null : ehesVar.c;
        if (ehfdVar != null) {
            valueOf = Long.valueOf(ehfdVar.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", eheaVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new eheb(ehfd.c(j), ehfd.c(j2), (ehea) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), ehfd.c(valueOf.longValue()), i2));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.ar);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.at);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.au);
        bundle.putInt("INPUT_MODE_KEY", this.ai);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.aw);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.ax);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.ay);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.az);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.aA);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.aB);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.aC);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.aD);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() {
        super.l();
        Window window = hn().getWindow();
        if (this.av) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.aG);
            if (!this.aH) {
                View findViewById = N().findViewById(com.google.android.apps.messaging.R.id.fullscreen_header);
                Integer g = ehjg.g(findViewById);
                boolean z = g == null || g.intValue() == 0;
                int c = ehdr.c(window.getContext(), R.attr.colorBackground, -16777216);
                if (z) {
                    g = Integer.valueOf(c);
                }
                Integer valueOf = Integer.valueOf(c);
                kwg.a(window, false);
                window.getContext();
                int h = Build.VERSION.SDK_INT < 27 ? kps.h(ehdr.c(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(h);
                ehhu.a(window, ehhu.b(0, ehdr.i(g.intValue())));
                valueOf.getClass();
                new kxp(window, window.getDecorView()).a(ehhu.b(h, ehdr.i(c)));
                ehex ehexVar = new ehex(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                int[] iArr = kvo.a;
                kvd.k(findViewById, ehexVar);
                this.aH = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = B().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.aG, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ehfs(hn(), rect));
        }
        aV();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void m() {
        this.ap.aj.clear();
        super.m();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.al.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.am.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
