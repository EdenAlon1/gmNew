package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tgk {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer");
    public static final cfup b = cfvl.h(cfvl.b, "fi_settings_page_learn_more_url", "https://support.google.com/fi/?p=transfertomessages");
    public static final emyl c = cfvl.w("fi_account_error_string_update");
    public final tgd d;
    public final eisx e;
    public final elhk f;
    public final tfw g;
    public final ffbr h;
    public final ffbr i;
    public final ejwl j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ejlr n = new tgj(this);
    public final asin o;
    public final arep p;
    public Preference q;
    private final eyga r;
    private final elbx s;

    public tgk(eyga eygaVar, tgd tgdVar, eisx eisxVar, elhk elhkVar, tfw tfwVar, ffbr ffbrVar, ffbr ffbrVar2, elbx elbxVar, ejwl ejwlVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, asin asinVar, arep arepVar) {
        this.r = eygaVar;
        this.d = tgdVar;
        this.e = eisxVar;
        this.f = elhkVar;
        this.g = tfwVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.s = elbxVar;
        this.j = ejwlVar;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
        this.m = ffbrVar5;
        this.o = asinVar;
        this.p = arepVar;
    }

    private final void e(String str) {
        View view = this.d.Q;
        view.getClass();
        View rootView = view.getRootView();
        rootView.getClass();
        Snackbar r = Snackbar.r(rootView, str, 0);
        r.o();
        r.i();
    }

    public final void a() {
        Intent b2 = tcn.b(this.d.z());
        if (((Boolean) csgj.a.e()).booleanValue()) {
            b2.putExtra("entry_point", this.r.b);
        }
        eiuy.c(b2, this.e);
        elhh.a(this.d, b2);
        ellj.f(new tih(), this.d);
    }

    public final void b() {
        if (((Boolean) ((cfup) c.get()).e()).booleanValue()) {
            e(this.d.Y(R.string.fi_account_invalid_fi_account_new));
        } else {
            e(this.d.Y(R.string.fi_account_invalid_fi_account));
        }
    }

    public final void c(Throwable th) {
        e(this.d.Y(R.string.fi_account_verify_fail_message));
        ensk j = a.j();
        j.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/cloudstore/fi/FiAccountFragmentPeer", "showErrorSnackBarForInternalError", 351, "FiAccountFragmentPeer.java")).r("Failure to validate fi account for accountId: %d", this.e.a());
    }

    public final void d() {
        AlertDialog.Builder message = new AlertDialog.Builder(this.d.z()).setTitle(this.d.Y(R.string.fi_account_rcs_enabled_dialog_title_v2)).setMessage(ddyi.c(this.d.z(), this.h, this.i, R.string.fi_account_rcs_enabled_dialog_body_v2, null, csgj.j));
        message.setPositiveButton(this.d.Y(R.string.fi_account_rcs_enabled_dialog_positive_button), new elbb(this.s, "FiAccountFragmentPeer:isRcsEnabledDialog:positive", new DialogInterface.OnClickListener() { // from class: tgg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                tgk tgkVar = tgk.this;
                ((ejlq) tgkVar.m.b()).g(ejlp.b(((cmgr) tgkVar.l.b()).h(cmip.TOGGLE_STATE_USER_DISABLED)), tgkVar.n);
            }
        })).setNegativeButton(this.d.Y(R.string.fi_account_rcs_enabled_dialog_negative_button), new elbb(this.s, "FiAccountFragmentPeer:isRcsEnabledDialog:negative", new DialogInterface.OnClickListener() { // from class: tgh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ellj.f(new tip(), tgk.this.d);
                dialogInterface.dismiss();
            }
        }));
        final AlertDialog create = message.create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: tgi
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                enru enruVar = tgk.a;
                TextView textView = (TextView) create.findViewById(android.R.id.message);
                egyl.b(textView);
                egyl.c(textView);
            }
        });
        create.show();
    }

    /* compiled from: PG */
    final class a implements ejwd<tif> {
        public a() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            if (tgk.this.o.a()) {
                return;
            }
            tgk.this.q.G(true);
            tgk.this.c(th);
            eixd.a();
            try {
                ellj.f(new tip(), tgk.this.d);
                efbd.c();
            } catch (Throwable th2) {
                try {
                    efbd.c();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void b(Object obj) {
            tif tifVar = (tif) obj;
            if (tgk.this.o.a()) {
                return;
            }
            if (tifVar.c) {
                if (tgk.this.p.a() || !tifVar.d) {
                    tgk.this.a();
                    return;
                } else {
                    tgk.this.d();
                    tgk.this.q.G(true);
                    return;
                }
            }
            tgk.this.b();
            tgk.this.q.G(true);
            eixd.a();
            try {
                ellj.f(new tip(), tgk.this.d);
                efbd.c();
            } catch (Throwable th) {
                try {
                    efbd.c();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    }
}
