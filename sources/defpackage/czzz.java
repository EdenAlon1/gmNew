package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzz implements aeev {
    public final clya a;
    public final daab b;
    public final ejvp c;
    public final Context d;
    private final clyt e;
    private final errl f;

    public czzz(clya clyaVar, clyt clytVar, daab daabVar, ejvp ejvpVar, errl errlVar, Context context) {
        this.a = clyaVar;
        this.e = clytVar;
        this.b = daabVar;
        this.f = errlVar;
        this.c = ejvpVar;
        this.d = context;
    }

    @Override // defpackage.aeev
    public final elfl a() {
        return this.e.c(clxx.BANNER).h(new emwl() { // from class: czzv
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                char c;
                char c2;
                final clys clysVar = (clys) obj;
                aeey l = aefb.l();
                aees aeesVar = (aees) l;
                aeesVar.a = "google_tos_banner";
                l.c(R.drawable.gs_android_messages_vd_theme_24);
                String v = djai.v();
                switch (v.hashCode()) {
                    case -427685855:
                        if (v.equals("google_tos_banner_variant_a")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685854:
                        if (v.equals("google_tos_banner_variant_b")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685853:
                        if (v.equals("google_tos_banner_variant_c")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685852:
                        if (v.equals("google_tos_banner_variant_d")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685851:
                        if (v.equals("google_tos_banner_variant_e")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685850:
                        if (v.equals("google_tos_banner_variant_f")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case -427685849:
                        if (v.equals("google_tos_banner_variant_g")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                int i = R.string.google_tos_banner_title_text_variant_a;
                switch (c) {
                    case 1:
                        i = R.string.google_tos_banner_title_text_variant_b;
                        break;
                    case 2:
                        i = R.string.google_tos_banner_title_text_variant_c;
                        break;
                    case 3:
                        i = R.string.google_tos_banner_title_text_variant_d;
                        break;
                    case 4:
                        i = R.string.google_tos_banner_title_text_variant_e;
                        break;
                    case 5:
                        i = R.string.google_tos_banner_title_text_variant_f;
                        break;
                    case 6:
                        i = R.string.google_tos_banner_title_text_variant_g;
                        break;
                }
                final czzz czzzVar = czzz.this;
                aeesVar.b = czzzVar.d.getString(i);
                String v2 = djai.v();
                switch (v2.hashCode()) {
                    case -427685855:
                        if (v2.equals("google_tos_banner_variant_a")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685854:
                        if (v2.equals("google_tos_banner_variant_b")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685853:
                        if (v2.equals("google_tos_banner_variant_c")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685852:
                        if (v2.equals("google_tos_banner_variant_d")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685851:
                        if (v2.equals("google_tos_banner_variant_e")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685850:
                        if (v2.equals("google_tos_banner_variant_f")) {
                            c2 = 5;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case -427685849:
                        if (v2.equals("google_tos_banner_variant_g")) {
                            c2 = 6;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                int i2 = R.string.google_tos_banner_body_text_variant_a;
                switch (c2) {
                    case 1:
                        i2 = R.string.google_tos_banner_body_text_variant_b;
                        break;
                    case 2:
                        i2 = R.string.google_tos_banner_body_text_variant_c;
                        break;
                    case 3:
                        i2 = R.string.google_tos_banner_body_text_variant_d;
                        break;
                    case 4:
                        i2 = R.string.google_tos_banner_body_text_variant_e;
                        break;
                    case 5:
                        i2 = R.string.google_tos_banner_body_text_variant_f;
                        break;
                    case 6:
                        i2 = R.string.google_tos_banner_body_text_variant_g;
                        break;
                }
                aeesVar.c = czzzVar.d.getString(i2);
                aeesVar.d = czzzVar.d.getString(R.string.google_tos_banner_positive_button_text);
                aeesVar.f = new aefa() { // from class: czzw
                    @Override // defpackage.aefa
                    public final void a(ejlq ejlqVar, View view) {
                        czzz czzzVar2 = czzz.this;
                        czzzVar2.a.e(5);
                        czzzVar2.a.c(epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_ACCEPTED, clysVar);
                        czzzVar2.c.a(elfo.e(null), "POPUP_KEY");
                    }
                };
                l.e(czzzVar.d.getString(R.string.google_tos_banner_negative_button_text));
                aeesVar.e = new aefa() { // from class: czzx
                    @Override // defpackage.aefa
                    public final void a(ejlq ejlqVar, View view) {
                        czzz czzzVar2 = czzz.this;
                        czzzVar2.b.a(ejlqVar, view);
                        czzzVar2.a.e(6);
                        czzzVar2.a.c(epgr.RCS_PROVISIONING_GOOGLE_TOS_BANNER_DISMISSED, clysVar);
                    }
                };
                l.d(new czzy(czzzVar, clysVar));
                return l.a();
            }
        }, this.f);
    }

    @Override // defpackage.aeev
    public final elfl b() {
        final clyt clytVar = this.e;
        return clytVar.d().i(new eroh() { // from class: clyj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    clyt.a.m("shouldShowBanner: decided false, no ui was requested");
                    return elfo.e(false);
                }
                if (((clxx) optional.get()).equals(clxx.BANNER)) {
                    clyt.a.m("shouldShowBanner: decided true");
                    return elfo.e(true);
                }
                if (((clxx) optional.get()).equals(clxx.BOTTOMSHEET)) {
                    clyt clytVar2 = clyt.this;
                    return clytVar2.c.d().h(new emwl() { // from class: clyi
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            int a;
                            cskc cskcVar = clyt.a;
                            clxx clxxVar = clxx.BANNER;
                            Optional max = Collection.EL.stream((engw) obj2).filter(new clyp()).max(clyt.b);
                            if (!max.isEmpty()) {
                                clxx b = clxx.b(((clxy) max.get()).d);
                                if (b == null) {
                                    b = clxx.UNRECOGNIZED;
                                }
                                if (clxxVar.equals(b) && (a = clxv.a(((clxy) max.get()).e)) != 0 && a == 5) {
                                    clyt.a.m("shouldShowBanner: decided true, user just accepted banner");
                                    return true;
                                }
                            }
                            clyt.a.m("shouldShowBanner: decided false, bottomsheet was requested");
                            return false;
                        }
                    }, clytVar2.e);
                }
                clyt.a.m("shouldShowBanner: decided false");
                return elfo.e(false);
            }
        }, clytVar.d);
    }

    @Override // defpackage.aeev
    public final /* synthetic */ Set c() {
        return new enpx(cgix.HOME);
    }

    @Override // defpackage.aeev
    public final int d() {
        return 2;
    }
}
