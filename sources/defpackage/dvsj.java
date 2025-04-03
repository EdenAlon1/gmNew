package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvsj extends dn {
    public static final entd ag = entd.c("GnpSdk");
    public Map ai;
    public dvqv aj;
    public eafz ak;
    public Context al;
    public dvdp am;
    public dvqr ao;
    private Handler ap;
    private evzm aq;
    boolean ah = false;
    public Boolean an = false;

    public static dvsj aT(dvdp dvdpVar, evzm evzmVar) {
        dvsj dvsjVar = new dvsj();
        Bundle bundle = new Bundle();
        bundle.putParcelable("promo_context", dvdpVar);
        bundle.putInt("theme", evzmVar.d);
        dvsjVar.at(bundle);
        return dvsjVar;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        try {
            ((dvbo) ((ffbr) eajj.a(context).fM().get(dvsj.class)).b()).a(this);
            this.ah = true;
        } catch (Exception e) {
            ((ensz) ((ensz) ((ensz) ag.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "onAttach", 'g', "PromoUiDialogFragment.java")).q("Failed to inject members.");
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ap = new Handler();
        boolean z = false;
        if (bundle != null && bundle.getBoolean("IS_IMPRESSION_REPORTED")) {
            z = true;
        }
        this.an = Boolean.valueOf(z);
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        kb kbVar = null;
        if (this.ah) {
            Bundle bundle2 = this.m;
            bundle2.setClassLoader(dvdp.class.getClassLoader());
            this.am = (dvdp) bundle2.getParcelable("promo_context");
            this.aq = evzm.b(bundle2.getInt("theme", evzm.UNSPECIFIED.d));
            final eg G = G();
            final dvdp dvdpVar = this.am;
            evzm evzmVar = this.aq;
            evzd evzdVar = dvdpVar.c().f;
            if (evzdVar == null) {
                evzdVar = evzd.a;
            }
            Map map = this.ai;
            evzc b = evzc.b(evzdVar.e);
            if (b == null) {
                b = evzc.UITYPE_NONE;
            }
            ffbr ffbrVar = (ffbr) map.get(b);
            if (ffbrVar == null) {
                ((ensz) ((ensz) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "buildDialog", 129, "PromoUiDialogFragment.java")).t("buildDialog called with a non-dialog uiType: %s", evzdVar);
                this.ao.b(dvdpVar, dvqt.FAILED_UNSUPPORTED_UI);
            } else {
                final dvqm a = ((dvql) ffbrVar.b()).a(G, evzdVar, evzmVar, new Runnable() { // from class: dvsh
                    @Override // java.lang.Runnable
                    public final void run() {
                        dvsj dvsjVar = dvsj.this;
                        if (!dvsjVar.an.booleanValue()) {
                            dvsjVar.ao.b(dvsjVar.am, dvqt.SUCCESS);
                        }
                        dvsjVar.an = true;
                    }
                });
                if (a == null) {
                    ((ensz) ((ensz) ag.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "buildDialog", 139, "PromoUiDialogFragment.java")).q("Failed to build dialog.");
                    this.ao.b(dvdpVar, dvqt.FAILED_UNKNOWN);
                } else {
                    ArrayList arrayList = a.b;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((View) arrayList.get(i)).setOnClickListener(new View.OnClickListener() { // from class: dvsi
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Intent intent;
                                dvsj dvsjVar = dvsj.this;
                                elav a2 = dvsjVar.ak.a("PromoUiDialog");
                                dvdp dvdpVar2 = dvdpVar;
                                dvqm dvqmVar = a;
                                try {
                                    evxi evxiVar = (evxi) view.getTag();
                                    dvsjVar.ao.a(dvdpVar2, dvsjVar.aj.a(evxiVar));
                                    dvqmVar.a.dismiss();
                                    int i2 = evxiVar.c;
                                    eg egVar = G;
                                    if (i2 == 8) {
                                        dvqv dvqvVar = dvsjVar.aj;
                                        evvw b2 = evvw.b(((evvx) evxiVar.d).g);
                                        if (b2 == null) {
                                            b2 = evvw.UNKNOWN;
                                        }
                                        enhk b3 = dvdpVar2.b();
                                        evxg b4 = evxg.b(evxiVar.e);
                                        if (b4 == null) {
                                            b4 = evxg.ACTION_UNKNOWN;
                                        }
                                        dvqvVar.b(egVar, b2, (Intent) b3.get(b4));
                                    }
                                    if (evxiVar.c == 14) {
                                        int ordinal = evww.a(((evwy) evxiVar.d).b).ordinal();
                                        if (ordinal == 0) {
                                            entd entdVar = dvui.a;
                                            dvui a3 = dvuh.a(dvdpVar2);
                                            cg cgVar = new cg(egVar.a());
                                            cgVar.u(a3, "PermissionRequestFrag");
                                            cgVar.k();
                                        } else if (ordinal == 1) {
                                            if (kqq.b()) {
                                                evsn evsnVar = evsn.ANDROID_POST_NOTIFICATIONS;
                                                evwy evwyVar = evxiVar.c == 14 ? (evwy) evxiVar.d : evwy.a;
                                                evsn b5 = evsn.b((evwyVar.b == 2 ? (evwf) evwyVar.c : evwf.a).c);
                                                if (b5 == null) {
                                                    b5 = evsn.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                                }
                                                if (evsnVar.equals(b5)) {
                                                    intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                                                    intent.putExtra("android.provider.extra.APP_PACKAGE", dvsjVar.al.getPackageName());
                                                    dvsjVar.aj.b(egVar, evvw.ACTIVITY, intent);
                                                }
                                            }
                                            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                                            intent.setData(Uri.parse(String.format("package:%s", dvsjVar.al.getPackageName())));
                                            dvsjVar.aj.b(egVar, evvw.ACTIVITY, intent);
                                        } else if (ordinal == 3) {
                                            ((ensz) ((ensz) dvsj.ag.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/gm/dialogs/PromoUiDialogFragment", "buildDialog", 195, "PromoUiDialogFragment.java")).t("Custom action data type is not supported [%s].", evww.a((evxiVar.c == 14 ? (evwy) evxiVar.d : evwy.a).b));
                                        }
                                    }
                                    a2.close();
                                } catch (Throwable th) {
                                    try {
                                        a2.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        });
                    }
                    kbVar = a.a;
                }
            }
        }
        if (kbVar != null) {
            return kbVar;
        }
        final iv create = new iu(z()).create();
        this.ap.post(new Runnable() { // from class: dvsg
            @Override // java.lang.Runnable
            public final void run() {
                entd entdVar = dvsj.ag;
                create.dismiss();
            }
        });
        return create;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putBoolean("IS_IMPRESSION_REPORTED", this.an.booleanValue());
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ao.a(this.am, evvt.DISMISSED);
    }
}
