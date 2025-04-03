package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountPreference;
import com.google.android.apps.messaging.cloudstore.fi.SyncPreference;
import defpackage.ekkz;
import java.util.Locale;
import thw.a;
import thw.b;
import thw.c;
import thw.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thf extends tit implements ekhu, fbas, ekhq, ekkk, elar {
    private thw aj;
    private Context ak;
    private final lkv al = new lkv(this);
    private final ekxu an = new ekxu(this);
    private boolean ao;

    @Deprecated
    public thf() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return thw.class;
    }

    @Override // defpackage.efad, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
        try {
            View M = super.M(layoutInflater, viewGroup, bundle);
            ekyf.q();
            return M;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.al;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.efad, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        elav j = this.an.j();
        try {
            boolean aM = super.aM(menuItem);
            j.close();
            return aM;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.an.h(i, i2);
        ekyf.q();
    }

    @Override // defpackage.ekhu
    /* renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final thw H() {
        thw thwVar = this.aj;
        if (thwVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return thwVar;
    }

    @Override // defpackage.tit
    protected final /* bridge */ /* synthetic */ ekky aV() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.ak == null) {
            this.ak = new ekkn(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
        try {
            super.ae(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        elav f = this.an.f();
        try {
            super.af(i, i2, intent);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tit, defpackage.efad, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ai() {
        elav b = this.an.b();
        try {
            super.ai();
            H();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void am() {
        this.an.k();
        try {
            super.am();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void ao() {
        elav b = this.an.b();
        try {
            super.ao();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.akuc, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
        try {
            super.ap(view, bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.elar
    public final elds bb() {
        return this.an.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.an.e(eldsVar, z);
    }

    @Override // defpackage.elar
    public final void be(elds eldsVar) {
        this.an.b = eldsVar;
    }

    @Override // defpackage.akuc
    protected final boolean bf() {
        return true;
    }

    @Override // defpackage.tit, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    Object aX = aX();
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    if (!(eaVar instanceof thf)) {
                        throw new IllegalStateException(a.J(eaVar, thw.class));
                    }
                    thf thfVar = (thf) eaVar;
                    axkm axkmVar = (axkm) ((akgo) aX).a.a.ck.b();
                    elhk elhkVar = (elhk) ((akgo) aX).i.b();
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    eixo eixoVar = (eixo) ((akgo) aX).a.a.as.b();
                    crue crueVar = (crue) ((akgo) aX).a.a.Gk.b();
                    akvg akvgVar = (akvg) ((akgo) aX).a.a.Px.b();
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    akis akisVar = ((akgo) aX).a;
                    akkp akkpVar = akisVar.a;
                    fbbf fbbfVar = akkpVar.cf;
                    asjq ai = akisVar.b.ai();
                    fbbf fbbfVar2 = akkpVar.qL;
                    asjt asjtVar = (asjt) akkpVar.ch.b();
                    akis akisVar2 = ((akgo) aX).a;
                    this.aj = new thw(thfVar, axkmVar, elhkVar, ejwlVar, eisxVar, elbxVar, eixoVar, crueVar, akvgVar, ejlqVar, fbbfVar, ai, fbbfVar2, asjtVar, akisVar2.a.f, ((akgo) aX).j, akisVar2.b.hq, ((akgo) aX).k);
                    this.Z.c(new ekkg(this.an, this.al));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lkr lkrVar = this.E;
            if (lkrVar instanceof elar) {
                ekxu ekxuVar = this.an;
                if (ekxuVar.a == null) {
                    ekxuVar.e(((elar) lkrVar).bb(), true);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.an.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            thw H = H();
            if (((Boolean) thw.b.e()).booleanValue()) {
                ((akzt) H.v.b()).c("Bugle.UI.FiSettingsPage.Entered");
            }
            H.j.k(H.l);
            H.j.k(H.m);
            H.f.b(H.d.e(), H.new d());
            if (H.k.a() != -1) {
                H.f.b(H.h.a(H.k), H.new a());
            }
            H.f.b(H.d.e(), H.new b());
            H.f.b(H.d.e(), H.new c());
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void i() {
        elav b = this.an.b();
        try {
            super.i();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void j() {
        elav a = this.an.a();
        try {
            super.j();
            this.ao = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
        try {
            super.k(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efad, defpackage.ont, defpackage.ea
    public final void m() {
        this.an.k();
        try {
            super.m();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ont
    public final void t(Bundle bundle) {
        final thw H = H();
        H.c.gi(R.xml.fi_settings_preferences);
        H.c.b().ag();
        thf thfVar = H.c;
        thfVar.b().getClass();
        FiAccountPreference fiAccountPreference = (FiAccountPreference) thfVar.a(thfVar.Y(R.string.fi_account_pref_key));
        fiAccountPreference.getClass();
        H.n = fiAccountPreference;
        H.n.G(false);
        if (((Boolean) ((cfup) csgj.m.get()).e()).booleanValue()) {
            FiAccountPreference fiAccountPreference2 = H.n;
            fiAccountPreference2.a = new elay(H.g, "FiSettingsFragmentPeer:deleteButtonClick", new View.OnClickListener() { // from class: thr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final thw thwVar = thw.this;
                    new AlertDialog.Builder(thwVar.c.z()).setTitle(R.string.fi_settings_delete_backup).setMessage(R.string.fi_settings_delete_backup_message).setNegativeButton(R.string.fi_settings_delete_backup_dialog_neutral, new elbb(thwVar.g, "FiSettingsFragmentPeer:deleteBackupConfirmationDialog:negative", new DialogInterface.OnClickListener() { // from class: thj
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cskc cskcVar = thw.a;
                            dialogInterface.dismiss();
                        }
                    })).setPositiveButton(R.string.fi_settings_delete_backup_dialog_positive, new elbb(thwVar.g, "FiSettingsFragmentPeer:deleteBackupConfirmationDialog:positive", new DialogInterface.OnClickListener() { // from class: thk
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            thw thwVar2 = thw.this;
                            thwVar2.c(false);
                            thwVar2.a();
                        }
                    })).show();
                }
            });
            fiAccountPreference2.d();
            H.n.k(new elay(H.g, "FiSettingsFragmentPeer:disableSyncButtonClick", new View.OnClickListener() { // from class: ths
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final thw thwVar = thw.this;
                    new AlertDialog.Builder(thwVar.c.z()).setTitle(R.string.fi_settings_disable_multidevice_dialog_title).setMessage(R.string.fi_settings_disable_multidevice_dialog_message).setNegativeButton(R.string.fi_settings_disable_multidevice_dialog_negative, new elbb(thwVar.g, "FiSettingsFragmentPeer:disableSyncDialog:negative", new DialogInterface.OnClickListener() { // from class: thl
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cskc cskcVar = thw.a;
                            dialogInterface.dismiss();
                        }
                    })).setPositiveButton(R.string.fi_settings_disable_multidevice_dialog_positive, new elbb(thwVar.g, "FiSettingsFragmentPeer:disableSyncDialog:positive", new DialogInterface.OnClickListener() { // from class: thm
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            thw thwVar2 = thw.this;
                            thwVar2.c(false);
                            thwVar2.b();
                            dialogInterface.dismiss();
                        }
                    })).show();
                }
            }));
        } else {
            H.n.k(new elay(H.g, "FiSettingsFragmentPeer:disconnectButtonClick", new View.OnClickListener() { // from class: tht
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    final thw thwVar = thw.this;
                    new AlertDialog.Builder(thwVar.c.z()).setTitle(R.string.fi_settings_disable_multidevice_dialog_title).setMessage(R.string.fi_settings_disable_multidevice_dialog_message).setNegativeButton(R.string.fi_settings_disable_multidevice_dialog_negative, new elbb(thwVar.g, "FiSettingsFragmentPeer:disableMultideviceDialog:negative", new DialogInterface.OnClickListener() { // from class: thp
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            cskc cskcVar = thw.a;
                            dialogInterface.dismiss();
                        }
                    })).setPositiveButton(R.string.fi_settings_disable_multidevice_dialog_positive, new elbb(thwVar.g, "FiSettingsFragmentPeer:disableMultideviceDialog:positive", new DialogInterface.OnClickListener() { // from class: thq
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            final thw thwVar2 = thw.this;
                            thwVar2.t = false;
                            AlertDialog.Builder positiveButton = new AlertDialog.Builder(thwVar2.c.z()).setTitle(R.string.fi_settings_delete_backup).setMessage(R.string.fi_settings_delete_backup_message).setNegativeButton(R.string.fi_settings_delete_backup_dialog_negative, new elbb(thwVar2.g, "FiSettingsFragmentPeer:deleteBackupsDialog:negative", new DialogInterface.OnClickListener() { // from class: thg
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i2) {
                                    cskc cskcVar = thw.a;
                                    dialogInterface2.dismiss();
                                }
                            })).setPositiveButton(R.string.fi_settings_delete_backup_dialog_positive, new elbb(thwVar2.g, "FiSettingsFragmentPeer:deleteBackupsDialog:positive", new DialogInterface.OnClickListener() { // from class: thn
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface2, int i2) {
                                    thw.this.t = true;
                                    dialogInterface2.dismiss();
                                }
                            }));
                            final DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: tho
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface2) {
                                    thw thwVar3 = thw.this;
                                    thwVar3.c(false);
                                    if (thwVar3.t) {
                                        thwVar3.a();
                                    } else {
                                        thwVar3.b();
                                    }
                                }
                            };
                            final elbx elbxVar = thwVar2.g;
                            positiveButton.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: elbh
                                public final /* synthetic */ String b = "FiSettingsFragmentPeer:deleteBackupsDialog:dismiss";

                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface2) {
                                    elbx elbxVar2 = elbx.this;
                                    DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
                                    ekzm b = elbxVar2.b(this.b);
                                    try {
                                        onDismissListener2.onDismiss(dialogInterface2);
                                        b.close();
                                    } catch (Throwable th) {
                                        try {
                                            b.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                }
                            });
                            positiveButton.show();
                            dialogInterface.dismiss();
                        }
                    })).show();
                }
            }));
        }
        thf thfVar2 = H.c;
        SyncPreference syncPreference = (SyncPreference) thfVar2.a(thfVar2.Y(R.string.fi_current_sync_pref_key));
        syncPreference.getClass();
        H.o = syncPreference;
        thf thfVar3 = H.c;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) thfVar3.a(thfVar3.Y(R.string.fi_enable_download_over_wifi_pref_key));
        switchPreferenceCompat.getClass();
        H.p = switchPreferenceCompat;
        H.p.G(false);
        H.p.N(false);
        H.p.n = new elhi(H.e, "FiSettingsFragmentPeer:clickDownloadOverWifiPreference", new onh() { // from class: thh
            @Override // defpackage.onh
            public final boolean a(Preference preference, Object obj) {
                elfl c;
                thw thwVar = thw.this;
                boolean equals = Boolean.TRUE.equals(obj);
                thwVar.p.G(false);
                axkt axktVar = (axkt) thwVar.z.b();
                c = axol.c(axktVar.a, ffhe.a, ffsm.a, new axks(axktVar, equals, null));
                thwVar.j.i(ejlp.b(c), new ejlm(Boolean.valueOf(equals)), thwVar.l);
                return false;
            }
        });
        thf thfVar4 = H.c;
        Preference a = thfVar4.a(thfVar4.Y(R.string.messages_for_web_preference_key));
        a.getClass();
        H.q = a;
        H.q.n(H.c.Z(R.string.messages_for_web_preference_summary, bzaq.i.e()));
        H.q.o = new elhj(H.e, "FiSettingsFragmentPeer:messagesForWebPreferenceClick", new oni() { // from class: thi
            @Override // defpackage.oni
            public final boolean a(Preference preference) {
                thw thwVar = thw.this;
                if (!adhu.b()) {
                    thwVar.i.I(thwVar.c.z());
                    return true;
                }
                akvg akvgVar = thwVar.i;
                thf thfVar5 = thwVar.c;
                akvgVar.J(thfVar5.z(), thwVar.k);
                return true;
            }
        });
    }

    @Override // defpackage.tit, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
