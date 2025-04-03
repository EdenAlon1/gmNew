package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessMultiSimPopup;
import com.google.android.apps.messaging.ui.rcs.setup.success.RcsSuccessSingleSimPopup;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddbs implements ajhy, ddbh {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public dcxs j;
    public CharSequence k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public cmem o;
    private final errl q;
    private final errl r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private ajid w;
    private crly x;
    private crly y;
    private boolean z = false;
    public Optional p = Optional.empty();

    public ddbs(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, errl errlVar, errl errlVar2, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.q = errlVar;
        this.r = errlVar2;
        this.g = ffbrVar6;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.u = ffbrVar9;
        this.h = ffbrVar10;
        this.v = ffbrVar11;
        this.i = ffbrVar12;
    }

    private final CharSequence m(Context context, String str) {
        String string = context.getResources().getString(true != l(str) ? R.string.rcs_success_popup_setting : R.string.rcs_success_popup_setting_rcs_default_on_oob);
        String string2 = context.getResources().getString(true != l(str) ? R.string.rcs_success_popup_body_v2 : R.string.rcs_success_popup_body_rcs_default_on_oob, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        int lastIndexOf = string2.lastIndexOf(string);
        spannableStringBuilder.setSpan(new ddbr(this, context), lastIndexOf, string.length() + lastIndexOf, 17);
        return spannableStringBuilder;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return ((cort) this.t.b()).d().h(new emwl() { // from class: ddbl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Iterator it = ((Set) obj).iterator();
                ddbs ddbsVar = ddbs.this;
                while (true) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    cosz coszVar = (cosz) it.next();
                    String str = coszVar.c;
                    try {
                        cmes b = ((cmel) ddbsVar.f.b()).b(str);
                        cmes cmesVar = cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
                        boolean z = ddbsVar.k(str) || djai.O();
                        if (b == cmesVar && z) {
                            if (ddbsVar.j(str)) {
                                ddbsVar.o = ddbsVar.j.a();
                            }
                            ((enrr) ((enrr) ddbs.a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "wantsToShowForAnySim", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "RcsSuccessPopupPresenter.java")).t("wantsToShowForAnySim: setting popupSimInfo for simId: %s", dktx.SIM_ID.c(str));
                            ddbsVar.p = Optional.of(coszVar);
                            return true;
                        }
                    } catch (eygu e) {
                        ((enrr) ((enrr) ((enrr) ddbs.a.j()).g(e)).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "wantsToShowForAnySim", 208, "RcsSuccessPopupPresenter.java")).t("wantsToShowForAnySim: failed to get rcsSuccessNotificationState for simId: %s", dktx.SIM_ID.c(str));
                    }
                }
            }
        }, this.r);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.w = ajidVar;
        this.x = new crly(viewGroup, R.id.conversation_list_rcs_success_single_sim_popup_stub, R.id.conversation_list_rcs_success_single_sim_popup);
        this.y = new crly(viewGroup, R.id.conversation_list_rcs_success_multi_sim_popup_stub, R.id.conversation_list_rcs_success_multi_sim_popup);
        this.j = ((dcxt) this.s.b()).a(epgt.PROVISIONING_UI_TYPE_RCS_SUCCESS, 5);
    }

    @Override // defpackage.ajhy
    public final void d() {
        this.x.e();
        this.y.e();
        this.w.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(final Context context, ViewGroup viewGroup, boolean z) {
        int e = ((ctwb) this.d.b()).e();
        final cosz coszVar = (cosz) this.p.orElse(null);
        if (coszVar == null) {
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 224, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            return false;
        }
        if (e > 1) {
            csjy.c("BugleRcs", "prepareMultiSimPopup");
            cosz coszVar2 = (cosz) this.p.orElse(null);
            if (coszVar2 == null) {
                ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 380, "RcsSuccessPopupPresenter.java")).q("popupSimInfo is empty");
            } else {
                String str = coszVar2.u;
                this.l = str;
                if (TextUtils.isEmpty(str)) {
                    ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "prepareMultiSimPopup", 385, "RcsSuccessPopupPresenter.java")).q("preferredSubscriptionName is empty");
                } else {
                    this.k = context.getString(R.string.rcs_success_popup_sim_slot_identifier, Integer.valueOf(coszVar2.e + 1));
                    this.m = (CharSequence) ((Optional) ((djsi) this.v.b()).f(new djro(coszVar2.c)).map(new Function() { // from class: ddbn
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Optional.of(((aolr) ddbs.this.i.b()).r(((djrj) obj).a));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(((ctwb) this.d.b()).h(coszVar2.d).i(true))).map(new Function() { // from class: ddbo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return context.getString(R.string.rcs_success_popup_title_multi_sim_v2, ((crnx) ddbs.this.g.b()).b(((aoku) obj).G().toString().replaceAll("\\s", " ")));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse(context.getString(R.string.rcs_success_popup_title_single_sim_v2));
                    this.n = m(context, coszVar2.c);
                    this.z = true;
                }
            }
            ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "show", 231, "RcsSuccessPopupPresenter.java")).q("show: returning false, multiSimEnabled but failed to prepare multi sim popup");
            return false;
        }
        this.z = false;
        String str2 = coszVar.c;
        csjy.c("BugleRcs", "prepareSingleSimPopup");
        this.m = context.getString(R.string.rcs_success_popup_title_single_sim_v2);
        this.n = m(context, str2);
        elfo.f(new Runnable() { // from class: ddbp
            @Override // java.lang.Runnable
            public final void run() {
                cosz coszVar3 = coszVar;
                ddbs ddbsVar = ddbs.this;
                String str3 = coszVar3.c;
                ((cmfb) ddbsVar.h.b()).d(ddbsVar.l(str3), epgr.RCS_PROVISIONING_SUCCESS_POPUP_SEEN, str3);
                if (ddbsVar.k(str3) || djai.O()) {
                    ((akzt) ddbsVar.c.b()).c("Bugle.FastTrack.Provisioning.SuccessPopup.Seen");
                    ((altk) ddbsVar.b.b()).aL(61);
                }
            }
        }, this.q).k(axnw.b(), erpp.a);
        if (l(coszVar.c)) {
            final dcxs dcxsVar = this.j;
            dcxsVar.getClass();
            axnw.h(elfo.f(new Runnable() { // from class: ddbq
                @Override // java.lang.Runnable
                public final void run() {
                    dcxs.this.e();
                }
            }, this.r));
        }
        if (this.z) {
            csjy.c("BugleRcs", "show: Show MultiSim rcs success popup");
            RcsSuccessMultiSimPopup rcsSuccessMultiSimPopup = (RcsSuccessMultiSimPopup) this.y.b();
            rcsSuccessMultiSimPopup.a = this;
            rcsSuccessMultiSimPopup.c();
            return true;
        }
        csjy.c("BugleRcs", "show: Show SingleSim rcs success popup");
        RcsSuccessSingleSimPopup rcsSuccessSingleSimPopup = (RcsSuccessSingleSimPopup) this.x.b();
        rcsSuccessSingleSimPopup.a = this;
        rcsSuccessSingleSimPopup.c();
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 4;
    }

    @Override // defpackage.ajhy
    public final void g() {
        csjy.c("BugleRcs", "provision notification: notified. user ignored.");
        ((cmfb) this.h.b()).d(false, epgr.RCS_PROVISIONING_SUCCESS_POPUP_IGNORED, ((cosz) this.p.orElseThrow(new Supplier() { // from class: ddbm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("popupSimInfo should not be empty");
            }
        })).c);
        i();
    }

    @Override // defpackage.ddbh
    public final void h(TextView textView) {
        egyl.b(textView);
        egyl.c(textView);
    }

    @Override // defpackage.ddbh
    public final void i() {
        csjy.c("BugleRcs", "provision notification: notified. user clicked.");
        final String str = ((cosz) this.p.orElseThrow(new Supplier() { // from class: ddbj
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalStateException("popupSimInfo should not be empty");
            }
        })).c;
        ((enrr) ((enrr) a.e()).h("com/google/android/apps/messaging/ui/rcs/setup/success/RcsSuccessPopupPresenter", "onDismissClicked", 309, "RcsSuccessPopupPresenter.java")).t("onDismissClicked: dismissed popup for simId: %s", dktx.SIM_ID.c(str));
        elfo.f(new Runnable() { // from class: ddbk
            @Override // java.lang.Runnable
            public final void run() {
                ((cmel) ddbs.this.f.b()).k(str, cmes.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED);
            }
        }, this.r).k(axnw.b(), erpp.a);
        ((cmfb) this.h.b()).d(false, epgr.RCS_PROVISIONING_SUCCESS_POPUP_DISMISSED, str);
        if (djai.X()) {
            ((cmel) this.f.b()).d.j(new emwl() { // from class: cmcg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = cmel.a;
                    cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                    cmbfVar.copyOnWrite();
                    ((cmbx) cmbfVar.instance).o = true;
                    return (cmbx) cmbfVar.build();
                }
            }).h(new emwl() { // from class: cmcn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cskc cskcVar = cmel.a;
                    return null;
                }
            }, erpp.a).k(axnw.b(), erpp.a);
        }
        d();
    }

    public final boolean j(String str) {
        return (djai.z() && djai.ac()) ? ((cguo) this.u.b()).c(str).s : djai.J();
    }

    public final boolean k(String str) {
        return (djai.z() && djai.ac()) ? ((cguo) this.u.b()).c(str).n : dimo.b();
    }

    public final boolean l(String str) {
        cmem cmemVar;
        return j(str) && (cmemVar = this.o) != null && cmemVar.equals(cmem.OOB_CONSENT);
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ int n() {
        return ajhx.a();
    }
}
