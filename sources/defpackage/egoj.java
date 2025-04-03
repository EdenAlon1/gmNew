package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewAnimator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egoj extends egnu {
    public MaterialTextView aA;
    public FullscreenErrorView aB;
    public Toolbar aC;
    public dwck aD;
    public eghx aE;
    private ViewAnimator aF;
    private dwck aG;
    public dvxi ag;
    public egaj ah;
    public egok ai;
    public egda aj;
    public egcw ak;
    public egdg al;
    public emxc am;
    public emxc an;
    public egcx ao;
    public String ap;
    public egqg aq;
    egpq ar;
    egpm as;
    public egdc at;
    public ImageView au;
    public MaterialButton av;
    public MaterialButton aw;
    public MaterialButton ax;
    public MaterialTextView ay;
    public MaterialTextView az;
    public lmw b;
    public lmw c;
    public egrf d;
    public dvyc e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.profile_picture_preview_fragment, viewGroup, false);
        this.e.b.a(90302).b(inflate);
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        eghx eghxVar = this.aE;
        eghxVar.a.b(100);
        eghxVar.b.a(100);
        eghxVar.c.b(100);
        egok egokVar = this.ai;
        emyg emygVar = (emyg) egokVar.b.b();
        emygVar.f();
        egokVar.c = emxc.j(emygVar);
        egdg egdgVar = egokVar.a;
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 12;
        exgeVar.b |= 1;
        egdgVar.e((exge) exgdVar.build());
        this.at = this.aj.b(5);
        this.d.k(this);
        ((MaterialToolbar) this.Q.findViewById(R.id.photo_picker_google_account_toolbar)).t(new View.OnClickListener() { // from class: egnv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egoj.this.d.l();
            }
        });
        this.aC = (Toolbar) this.Q.findViewById(R.id.photo_picker_preview_action_toolbar);
        dwck dwckVar = new dwck(this.e.b.a(92715).b(this.aC));
        this.aG = dwckVar;
        dwck dwckVar2 = new dwck(dwckVar.c(89755).a(Integer.valueOf(R.id.photo_picker_overflow_menu)));
        this.aD = dwckVar2;
        dwckVar2.c(89753).a(Integer.valueOf(R.id.photo_picker_past_profile_photos_menu_item));
        this.aD.c(89747).a(Integer.valueOf(R.id.photo_picker_help_menu_item));
        this.aD.c(89742).a(Integer.valueOf(R.id.photo_picker_send_feedback_menu_item));
        this.aC.o(R.menu.photo_picker_common_menu);
        Toolbar toolbar = this.aC;
        toolbar.x = new zd() { // from class: egny
            @Override // defpackage.zd
            public final boolean a(MenuItem menuItem) {
                egoj egojVar = egoj.this;
                egojVar.aC.B();
                og ogVar = (og) menuItem;
                egojVar.ag.b(dvxh.e(), egojVar.aD.b(Integer.valueOf(ogVar.a)));
                int i = ogVar.a;
                if (i == R.id.photo_picker_past_profile_photos_menu_item) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.valueOf(String.format("https://accounts.google.com/AccountChooser?Email=%s&continue=", egojVar.am.c())).concat(String.valueOf(Uri.encode("https://myaccount.google.com/profile-picture/past-photos?interop=standalone&opts=ppo")))));
                    if (!egojVar.ao.a(intent)) {
                        return true;
                    }
                    egojVar.aQ(intent);
                    return true;
                }
                if (i == R.id.photo_picker_help_menu_item) {
                    egojVar.ak.b(egojVar.ap);
                    return false;
                }
                if (i != R.id.photo_picker_send_feedback_menu_item) {
                    return false;
                }
                egojVar.ak.a();
                return true;
            }
        };
        toolbar.h().findItem(R.id.photo_picker_past_profile_photos_menu_item).setVisible(false);
        this.ar = (egpq) this.b.a(egpq.class);
        this.as = (egpm) this.c.a(egpm.class);
        ViewAnimator viewAnimator = (ViewAnimator) this.Q.findViewById(R.id.photo_picker_view_animator_container);
        this.aF = viewAnimator;
        this.au = (ImageView) viewAnimator.findViewById(R.id.photo_picker_preview_profile_image);
        this.av = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_edit_button);
        this.aw = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_delete_button);
        this.ax = (MaterialButton) this.aF.findViewById(R.id.photo_picker_preview_add_button);
        this.aB = (FullscreenErrorView) this.aF.findViewById(R.id.photo_picker_error_view);
        this.ay = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_visibility_message);
        this.az = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_info_message);
        this.aA = (MaterialTextView) this.aF.findViewById(R.id.photo_picker_preview_intro_message);
        this.av.c(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_edit_vd_theme_24));
        this.aw.c(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_delete_vd_theme_24));
        this.ax.c(ku.a(this.aF.getContext(), R.drawable.quantum_gm_ic_add_a_photo_vd_theme_24));
        this.e.b.a(95413).b(this.au);
        this.e.b.a(94212).b(this.ax);
        this.e.b.a(89731).b(this.av);
        this.e.b.a(89759).b(this.aw);
        this.e.b.a(89777).b(this.ay);
        this.aw.setOnClickListener(new View.OnClickListener() { // from class: egoc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egoj egojVar = egoj.this;
                egojVar.ag.a(dvxh.e(), egojVar.aw);
                new egoz().t(egojVar.I(), null);
            }
        });
        this.aB.b(new View.OnClickListener() { // from class: egod
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egoj egojVar = egoj.this;
                egpq egpqVar = egojVar.ar;
                egpqVar.a.b();
                egpqVar.b.b();
                eghx eghxVar2 = egojVar.aE;
                eghxVar2.a.c();
                eghxVar2.b.c();
                eghxVar2.c.c();
            }
        });
        this.ar.c.f(Q(), new llh() { // from class: egoe
            @Override // defpackage.llh
            public final void a(Object obj) {
                final egoj egojVar = egoj.this;
                egpn egpnVar = (egpn) obj;
                egojVar.at.b();
                if (egpnVar.a().g()) {
                    int ordinal = ((egdp) egpnVar.a().c()).ordinal();
                    if (ordinal == 0) {
                        egojVar.aB.f();
                    } else if (ordinal == 1) {
                        egojVar.aB.g();
                    } else if (ordinal == 2) {
                        egojVar.aB.d();
                    }
                    egojVar.p(R.id.photo_picker_error_view);
                    egok egokVar2 = egojVar.ai;
                    engr engrVar = new engr();
                    engrVar.j(egpnVar.d());
                    engrVar.h(egojVar.at.a());
                    egokVar2.a(engrVar.g());
                    return;
                }
                if (!egpnVar.b().g() || !egpnVar.c().g()) {
                    egojVar.p(R.id.photo_picker_loading_view);
                    return;
                }
                egojVar.p(R.id.photo_picker_content_view);
                egaj egajVar = egojVar.ah;
                Bitmap a = ((egiw) egpnVar.b().c()).a();
                egal egalVar = new egal();
                egalVar.b();
                egalVar.c();
                egajVar.d(a, egalVar, egojVar.au);
                egojVar.au.setContentDescription(((egiw) egpnVar.b().c()).c() ? egojVar.B().getString(R.string.op3_profile_picture_monogram_content_description) : egojVar.B().getString(R.string.op3_profile_picture_content_description));
                boolean c = ((egiw) egpnVar.b().c()).c();
                boolean e = ((egiy) egpnVar.c().c()).e();
                if (c) {
                    egojVar.ax.setVisibility(0);
                    egojVar.av.setVisibility(8);
                    egojVar.aw.setVisibility(8);
                } else {
                    egojVar.ax.setVisibility(8);
                    egojVar.av.setVisibility(0);
                    egojVar.aw.setVisibility(0);
                }
                boolean z = !e;
                egojVar.au.setEnabled(z);
                egojVar.av.setEnabled(z);
                egojVar.aw.setEnabled(z);
                egojVar.ax.setEnabled(z);
                egojVar.aq.b(egqe.GOOGLE_PHOTOS, ((egiy) egpnVar.c().c()).c());
                List a2 = egojVar.aq.a();
                final Runnable runnable = ((egqf) a2.get(0)).e() == egqe.ART ? new Runnable() { // from class: egog
                    @Override // java.lang.Runnable
                    public final void run() {
                        egoj.this.d.f();
                    }
                } : (a2.size() == 1 && ((egqf) a2.get(0)).e() == egqe.DEVICE_PHOTOS) ? new Runnable() { // from class: egoh
                    @Override // java.lang.Runnable
                    public final void run() {
                        egoj.this.d.j();
                    }
                } : new Runnable() { // from class: egnw
                    @Override // java.lang.Runnable
                    public final void run() {
                        new egot().t(egoj.this.I(), null);
                    }
                };
                egojVar.au.setOnClickListener(new View.OnClickListener() { // from class: egnz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egoj egojVar2 = egoj.this;
                        egojVar2.ag.a(dvxh.e(), egojVar2.au);
                        runnable.run();
                    }
                });
                egojVar.av.setOnClickListener(new View.OnClickListener() { // from class: egoa
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egoj egojVar2 = egoj.this;
                        egojVar2.ag.a(dvxh.e(), egojVar2.av);
                        runnable.run();
                    }
                });
                egojVar.ax.setOnClickListener(new View.OnClickListener() { // from class: egob
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        egoj egojVar2 = egoj.this;
                        egojVar2.ag.a(dvxh.e(), egojVar2.ax);
                        runnable.run();
                    }
                });
                int f = ((egiy) egpnVar.c().c()).f() - 1;
                if (f == 0) {
                    egdg egdgVar2 = egojVar.al;
                    exfm exfmVar = (exfm) exfn.a.createBuilder();
                    exfmVar.copyOnWrite();
                    exfn exfnVar = (exfn) exfmVar.instance;
                    exfnVar.c = 117;
                    exfnVar.b |= 1;
                    egdgVar2.a((exfn) exfmVar.build());
                    egojVar.f();
                } else if (f != 1) {
                    String Y = egojVar.Y(R.string.op3_preview_visibility_message_learn_more);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(egojVar.Z(R.string.op3_preview_visibility_message, Y));
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: egnx
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            egoj egojVar2 = egoj.this;
                            egojVar2.ag.a(dvxh.e(), egojVar2.ay);
                            egojVar2.ak.b(egojVar2.ap);
                        }
                    };
                    int indexOf = spannableStringBuilder.toString().indexOf(Y);
                    spannableStringBuilder.setSpan(new egoi(onClickListener), indexOf, Y.length() + indexOf, 33);
                    egojVar.ay.setText(spannableStringBuilder);
                    egojVar.ay.setMovementMethod(LinkMovementMethod.getInstance());
                } else {
                    egdg egdgVar3 = egojVar.al;
                    exfm exfmVar2 = (exfm) exfn.a.createBuilder();
                    exfmVar2.copyOnWrite();
                    exfn exfnVar2 = (exfn) exfmVar2.instance;
                    exfnVar2.c = 118;
                    exfnVar2.b |= 1;
                    egdgVar3.a((exfn) exfmVar2.build());
                    egojVar.f();
                }
                int ordinal2 = ((egiy) egpnVar.c().c()).b().ordinal();
                if (ordinal2 == 0) {
                    egdg egdgVar4 = egojVar.al;
                    exfm exfmVar3 = (exfm) exfn.a.createBuilder();
                    exfmVar3.copyOnWrite();
                    exfn exfnVar3 = (exfn) exfmVar3.instance;
                    exfnVar3.c = 119;
                    exfnVar3.b = 1 | exfnVar3.b;
                    egdgVar4.a((exfn) exfmVar3.build());
                } else if (ordinal2 == 2) {
                    egojVar.az.setText(true != fdrm.v() ? R.string.op3_preview_info_message_contact_admin : R.string.op3_preview_info_message_managed_organization);
                    egojVar.az.setVisibility(0);
                    if (fdrm.v()) {
                        float f2 = egojVar.B().getDisplayMetrics().density;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) egojVar.az.getLayoutParams();
                        marginLayoutParams.bottomMargin = 0;
                        egojVar.az.setLayoutParams(marginLayoutParams);
                        egojVar.az.setCompoundDrawablePadding((int) (12.0f * f2));
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) egojVar.ay.getLayoutParams();
                        marginLayoutParams2.topMargin = (int) (f2 * 8.0f);
                        egojVar.ay.setLayoutParams(marginLayoutParams2);
                        egojVar.aA.setVisibility(8);
                    }
                    egok egokVar3 = egojVar.ai;
                    engr engrVar2 = new engr();
                    engrVar2.j(egpnVar.d());
                    engrVar2.h(egojVar.at.a());
                    egokVar3.a(engrVar2.g());
                }
                egojVar.az.setVisibility(8);
                egok egokVar32 = egojVar.ai;
                engr engrVar22 = new engr();
                engrVar22.j(egpnVar.d());
                engrVar22.h(egojVar.at.a());
                egokVar32.a(engrVar22.g());
            }
        });
        this.as.d.f(Q(), new llh() { // from class: egof
            @Override // defpackage.llh
            public final void a(Object obj) {
                egpj egpjVar = (egpj) obj;
                if (fdrm.u()) {
                    egoj egojVar = egoj.this;
                    if (egojVar.an.g()) {
                        efmf efmfVar = new efmf(egojVar.G(), egpjVar.c());
                        efmfVar.c = (Account) egojVar.an.c();
                        efmfVar.b(R.id.photo_picker_prompt_parent_sheet, 340);
                        int i = engw.d;
                        engr engrVar = new engr();
                        enqu listIterator = egpjVar.a().entrySet().listIterator();
                        while (listIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            engrVar.h(new ksr((String) entry.getKey(), (String) entry.getValue()));
                        }
                        efmfVar.d = engrVar.g();
                        efmq.a(efmfVar.a());
                    }
                }
            }
        });
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        egpq egpqVar = this.ar;
        if (!fdrm.k() || (fdrm.k() && !egpqVar.d.a().a(egpqVar.e.a()).g())) {
            egpqVar.a.b();
            egpqVar.b.b();
        }
    }

    public final void f() {
        this.aA.setVisibility(8);
        this.aF.findViewById(R.id.photo_picker_preview_visibility_message).setVisibility(8);
        this.aF.findViewById(R.id.photo_picker_preview_divider).setVisibility(8);
    }

    @Override // defpackage.egnu, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        fazg.a(this);
    }

    public final void p(int i) {
        ViewAnimator viewAnimator = this.aF;
        this.aF.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }
}
