package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbvz {
    public static final entd a = entd.c("BugleGDitto");
    public final dbvr b;
    public final ejxn c;
    public final Optional d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final abo m;
    public final ejxk n;

    public dbvz(dbvr dbvrVar, ejxn ejxnVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ejxnVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = dbvrVar;
        this.c = ejxnVar;
        this.d = optional;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.m = new dbvy(this);
        this.n = new ejxk() { // from class: dbvw
            @Override // defpackage.ejxk
            public final /* synthetic */ void a(Throwable th) {
                ejxj.a(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxk
            public final void b(Object obj) {
                Spanned fromHtml;
                Spanned fromHtml2;
                Spanned fromHtml3;
                bzma bzmaVar = (bzma) obj;
                bzlz b = bzlz.b(bzmaVar.c);
                if (b == null) {
                    b = bzlz.UNRECOGNIZED;
                }
                final dbvz dbvzVar = dbvz.this;
                int ordinal = b.ordinal();
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        ensz enszVar = (ensz) dbvz.a.h();
                        enszVar.Y(csux.O, dbvzVar.getClass().getSimpleName());
                        enszVar.q("Dismissed by selecting correct emoji.");
                        ((bznq) dbvzVar.i.b()).a(1);
                        dbvzVar.a();
                        return;
                    }
                    if (ordinal == 4) {
                        ensz enszVar2 = (ensz) dbvz.a.h();
                        enszVar2.Y(csux.O, dbvzVar.getClass().getSimpleName());
                        enszVar2.q("Swapping to wrong emoji prompt");
                        dbvzVar.g();
                        ((bznq) dbvzVar.i.b()).a(2);
                        ea h = dbvzVar.b.I().h("gaia_pairing_verification_wrong_code");
                        if (h == null) {
                            int i = dbwg.b;
                            h = new dbwe();
                            fbae.e(h);
                        }
                        cg cgVar = new cg(dbvzVar.b.I());
                        cgVar.x(R.id.fragment_container, h, "gaia_pairing_verification_wrong_code");
                        cgVar.c();
                        dbvzVar.f(dbvzVar.b.N(), false);
                        return;
                    }
                    if (ordinal == 9) {
                        ensz enszVar3 = (ensz) dbvz.a.h();
                        enszVar3.Y(csux.O, dbvzVar.getClass().getSimpleName());
                        enszVar3.q("Dismissed by failing to download emojis.");
                        ((akzt) dbvzVar.h.b()).e("Bugle.Gaia.Verification.Prompt.Emoji.Download", 2);
                        dbvzVar.a();
                        return;
                    }
                    if (ordinal != 10) {
                        ensz enszVar4 = (ensz) dbvz.a.e();
                        enszVar4.Y(csux.O, dbvzVar.getClass().getSimpleName());
                        bzlz b2 = bzlz.b(bzmaVar.c);
                        if (b2 == null) {
                            b2 = bzlz.UNRECOGNIZED;
                        }
                        enszVar4.t("Dismissed. DataStatus: %s", b2.name());
                        dbvzVar.a();
                        return;
                    }
                    dbvzVar.g();
                    ensz enszVar5 = (ensz) dbvz.a.h();
                    enszVar5.Y(csux.O, dbvzVar.getClass().getSimpleName());
                    enszVar5.q("Swapping to secure account prompt");
                    ((bznq) dbvzVar.i.b()).a(3);
                    bzlq bzlqVar = bzmaVar.k;
                    if (bzlqVar == null) {
                        bzlqVar = bzlq.a;
                    }
                    String str = bzlqVar.e;
                    str.getClass();
                    ea h2 = dbvzVar.b.I().h("gaia_pairing_verification_secure_account");
                    if (h2 == null) {
                        cfup cfupVar = dbwd.a;
                        h2 = new dbwb();
                        fbae.e(h2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("dusi", str);
                    h2.at(bundle);
                    cg cgVar2 = new cg(dbvzVar.b.I());
                    cgVar2.x(R.id.fragment_container, h2, "gaia_pairing_verification_secure_account");
                    cgVar2.c();
                    dbvzVar.f(dbvzVar.b.N(), false);
                    return;
                }
                if (bzmaVar.n) {
                    View N = dbvzVar.b.N();
                    dbvzVar.e(N, R.id.gaia_pairing_verification_code_button_start);
                    dbvzVar.e(N, R.id.gaia_pairing_verification_code_button_middle);
                    dbvzVar.e(N, R.id.gaia_pairing_verification_code_button_end);
                    ((Button) N.findViewById(R.id.gaia_pairing_cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: dbvt
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dbvz dbvzVar2 = dbvz.this;
                            dbvzVar2.c(1);
                            ensz enszVar6 = (ensz) dbvz.a.h();
                            enszVar6.Y(csux.O, dbvzVar2.getClass().getSimpleName());
                            enszVar6.q("Dismissed by tapping the cancel button");
                            ((bznq) dbvzVar2.i.b()).a(4);
                        }
                    });
                    ((Button) N.findViewById(R.id.gaia_pairing_not_me_button)).setOnClickListener(new View.OnClickListener() { // from class: dbvu
                        /* JADX WARN: Type inference failed for: r4v3, types: [bzme, java.lang.Object] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dbvz dbvzVar2 = dbvz.this;
                            dbvzVar2.d.isPresent();
                            ((akzt) dbvzVar2.h.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled", 2);
                            axnw.h(dbvzVar2.d.get().g(bzlz.ERROR_NOT_ME));
                        }
                    });
                    N.findViewById(R.id.standard_bottom_sheet).setOnClickListener(null);
                    N.findViewById(R.id.bottom_sheet_container).setOnTouchListener(new View.OnTouchListener() { // from class: dbvs
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            dbvz dbvzVar2 = dbvz.this;
                            dbvzVar2.c(3);
                            ensz enszVar6 = (ensz) dbvz.a.h();
                            enszVar6.Y(csux.O, dbvzVar2.getClass().getSimpleName());
                            enszVar6.q("Dismissed by tapping outside the prompt");
                            ((bznq) dbvzVar2.i.b()).a(6);
                            return false;
                        }
                    });
                }
                View findViewById = dbvzVar.b.N().findViewById(R.id.standard_bottom_sheet);
                LinearLayout linearLayout = (LinearLayout) dbvzVar.b.N().findViewById(R.id.gaia_pairing_action_buttons_container);
                View findViewById2 = dbvzVar.b.N().findViewById(R.id.gaia_pairing_not_me_button);
                View findViewById3 = dbvzVar.b.N().findViewById(R.id.gaia_pairing_cancel_button);
                View findViewById4 = dbvzVar.b.N().findViewById(R.id.gaia_pairing_action_buttons_gap);
                int dimensionPixelSize = dbvzVar.b.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_layout_margin);
                if (findViewById2.getWidth() + findViewById3.getWidth() + dimensionPixelSize + dimensionPixelSize > findViewById.getWidth()) {
                    findViewById4.setVisibility(8);
                    linearLayout.setOrientation(1);
                } else {
                    findViewById4.setVisibility(0);
                    linearLayout.setOrientation(0);
                }
                dbvzVar.b(0);
                dbvzVar.d(8);
                int width = dbvzVar.b.N().findViewById(R.id.standard_bottom_sheet).getWidth();
                dbvr dbvrVar2 = dbvzVar.b;
                float dimensionPixelSize2 = dbvrVar2.B().getDimensionPixelSize(dbvrVar2.B().getConfiguration().orientation == 2 ? R.dimen.gaia_pairing_verification_layout_width_landscape : R.dimen.gaia_pairing_verification_layout_width_portrait);
                float dimensionPixelSize3 = dbvzVar.b.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_image_button_size);
                float dimensionPixelSize4 = dbvzVar.b.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_image_button_padding);
                ImageButton imageButton = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_start);
                ImageButton imageButton2 = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_middle);
                ImageButton imageButton3 = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_end);
                float f = width / dimensionPixelSize2;
                float f2 = dimensionPixelSize3 * f;
                if (f2 > dimensionPixelSize3) {
                    float f3 = dimensionPixelSize4 * f;
                    ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
                    int i2 = (int) f2;
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                    imageButton.setLayoutParams(layoutParams);
                    imageButton2.setLayoutParams(layoutParams);
                    imageButton3.setLayoutParams(layoutParams);
                    int i3 = (int) f3;
                    imageButton.setPadding(i3, i3, i3, i3);
                    imageButton2.setPadding(i3, i3, i3, i3);
                    imageButton3.setPadding(i3, i3, i3, i3);
                }
                eygr eygrVar = bzmaVar.f;
                eygrVar.getClass();
                eygr eygrVar2 = bzmaVar.d;
                eygrVar2.getClass();
                ImageButton imageButton4 = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_start);
                ImageButton imageButton5 = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_middle);
                ImageButton imageButton6 = (ImageButton) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_code_button_end);
                ((ekmz) dbvzVar.e.b()).g((String) eygrVar2.get(0)).f(new elgc(new dbvx(1, dbvzVar), (elbx) dbvzVar.f.b())).v(imageButton4);
                imageButton4.setContentDescription(((bzls) eygrVar.get(0)).c);
                ((ekmz) dbvzVar.e.b()).g((String) eygrVar2.get(1)).f(new elgc(new dbvx(2, dbvzVar), (elbx) dbvzVar.f.b())).v(imageButton5);
                imageButton5.setContentDescription(((bzls) eygrVar.get(1)).c);
                ((ekmz) dbvzVar.e.b()).g((String) eygrVar2.get(2)).f(new elgc(new dbvx(3, dbvzVar), (elbx) dbvzVar.f.b())).v(imageButton6);
                imageButton6.setContentDescription(((bzls) eygrVar.get(2)).c);
                if ((bzmaVar.b & 4) != 0) {
                    bzlq bzlqVar2 = bzmaVar.k;
                    if (bzlqVar2 == null) {
                        bzlqVar2 = bzlq.a;
                    }
                    String str2 = bzlqVar2.b;
                    str2.getClass();
                    if (str2.length() > 0) {
                        TextView textView = (TextView) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_info);
                        bzlq bzlqVar3 = bzmaVar.k;
                        if (bzlqVar3 == null) {
                            bzlqVar3 = bzlq.a;
                        }
                        String str3 = bzlqVar3.c;
                        str3.getClass();
                        if (str3.length() > 0) {
                            Resources B = dbvzVar.b.B();
                            bzlq bzlqVar4 = bzmaVar.k;
                            String str4 = (bzlqVar4 == null ? bzlq.a : bzlqVar4).b;
                            if (bzlqVar4 == null) {
                                bzlqVar4 = bzlq.a;
                            }
                            fromHtml3 = Html.fromHtml(B.getString(R.string.gaia_pairing_verification_location_device_info_text, str4, bzlqVar4.c), 63);
                            textView.setText(fromHtml3);
                            Resources B2 = dbvzVar.b.B();
                            bzlq bzlqVar5 = bzmaVar.k;
                            String str5 = (bzlqVar5 == null ? bzlq.a : bzlqVar5).b;
                            if (bzlqVar5 == null) {
                                bzlqVar5 = bzlq.a;
                            }
                            textView.setContentDescription(B2.getString(R.string.gaia_pairing_verification_location_device_info_a11y, str5, bzlqVar5.c));
                        } else {
                            bzlq bzlqVar6 = bzmaVar.k;
                            if (bzlqVar6 == null) {
                                bzlqVar6 = bzlq.a;
                            }
                            String str6 = bzlqVar6.d;
                            str6.getClass();
                            if (str6.length() > 0) {
                                Resources B3 = dbvzVar.b.B();
                                bzlq bzlqVar7 = bzmaVar.k;
                                String str7 = (bzlqVar7 == null ? bzlq.a : bzlqVar7).b;
                                if (bzlqVar7 == null) {
                                    bzlqVar7 = bzlq.a;
                                }
                                fromHtml2 = Html.fromHtml(B3.getString(R.string.gaia_pairing_verification_location_device_info_text, str7, bzlqVar7.d), 63);
                                textView.setText(fromHtml2);
                                Resources B4 = dbvzVar.b.B();
                                bzlq bzlqVar8 = bzmaVar.k;
                                String str8 = (bzlqVar8 == null ? bzlq.a : bzlqVar8).b;
                                if (bzlqVar8 == null) {
                                    bzlqVar8 = bzlq.a;
                                }
                                textView.setContentDescription(B4.getString(R.string.gaia_pairing_verification_location_device_info_a11y, str8, bzlqVar8.d));
                            } else {
                                Resources B5 = dbvzVar.b.B();
                                bzlq bzlqVar9 = bzmaVar.k;
                                if (bzlqVar9 == null) {
                                    bzlqVar9 = bzlq.a;
                                }
                                fromHtml = Html.fromHtml(B5.getString(R.string.gaia_pairing_verification_location_info_text, bzlqVar9.b), 63);
                                textView.setText(fromHtml);
                                Resources B6 = dbvzVar.b.B();
                                bzlq bzlqVar10 = bzmaVar.k;
                                if (bzlqVar10 == null) {
                                    bzlqVar10 = bzlq.a;
                                }
                                textView.setContentDescription(B6.getString(R.string.gaia_pairing_verification_location_info_a11y, bzlqVar10.b));
                            }
                        }
                    }
                }
                ((TextView) dbvzVar.b.N().findViewById(R.id.gaia_pairing_verification_info)).setVisibility(0);
            }
        };
    }

    public final void a() {
        eg G = this.b.G();
        if (G != null) {
            G.finish();
        }
    }

    public final void b(int i) {
        ((ProgressBar) this.b.N().findViewById(R.id.loading_progress)).setVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [bzme, java.lang.Object] */
    public final void c(int i) {
        this.d.isPresent();
        ((akzt) this.h.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled.Operation", i);
        ((akzt) this.h.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled", 1);
        axnw.h(this.d.get().g(bzlz.ERROR_USER_CANCELED_VERIFICATION));
    }

    public final void d(int i) {
        this.b.N().findViewById(R.id.gaia_pairing_verification_code_container).setVisibility(i);
    }

    public final void e(View view, int i) {
        ((ImageButton) view.findViewById(i)).setOnClickListener(new elay((elbx) this.f.b(), "GaiaPairingVerificationFragmentPeer::gaiaPairingVerificationCodeOnClickListener", new View.OnClickListener() { // from class: dbvv
            /* JADX WARN: Type inference failed for: r0v2, types: [bzme, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                dbvz dbvzVar = dbvz.this;
                dbvzVar.d.isPresent();
                ?? r0 = dbvzVar.d.get();
                view2.getClass();
                r0.j(((ImageButton) view2).getContentDescription().toString());
            }
        }));
    }

    public final void f(View view, boolean z) {
        float f = this.b.B().getConfiguration().fontScale;
        int i = this.b.B().getDisplayMetrics().heightPixels;
        if (!ctid.f) {
            i -= ddzb.d(this.b.G());
        }
        BottomSheetBehavior v = BottomSheetBehavior.v(view.findViewById(R.id.standard_bottom_sheet));
        v.getClass();
        int i2 = v.d ? -1 : v.c;
        if (f > 1.0f && z) {
            i2 = (int) (i2 * f);
            v.C(i2);
            view.requestLayout();
        }
        if (i > i2) {
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.gaia_pairing_action_buttons_container).getLayoutParams();
            layoutParams.getClass();
            ((au) layoutParams).bottomMargin = (i - i2) + this.b.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_action_button_margin_bottom);
        }
    }

    public final void g() {
        this.b.N().findViewById(R.id.gaia_pairing_verification_container).setVisibility(8);
    }
}
