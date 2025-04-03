package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.messaging.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alzj implements alzc, alzk, ctbj {
    private static final cskc g = cskc.g("Bugle", "ConfigurationStore");
    public final alzt a;
    public final alzt b;
    public final alzt c;
    public final SharedPreferences.OnSharedPreferenceChangeListener d;
    public final alzi e;
    public final ctyw f;
    private final ctyx h;
    private final ctwb i;
    private final ctud j;
    private final Executor k;

    public alzj(ctyx ctyxVar, ctyw ctywVar, ctwb ctwbVar, ctud ctudVar, errl errlVar, ctbk ctbkVar, alzv alzvVar, elbx elbxVar, alzu alzuVar) {
        this.h = ctyxVar;
        this.f = ctywVar;
        this.i = ctwbVar;
        this.j = ctudVar;
        this.k = new ersb(errlVar);
        this.a = alzuVar;
        alzw a = alzvVar.a(R.string.send_seen_report_rcs_pref_key, R.bool.send_seen_report_rcs_pref_default, alzo.SEND, alzo.DO_NOT_SEND);
        this.b = a;
        alzw a2 = alzvVar.a(R.string.share_typing_status_rcs_pref_key, R.bool.share_typing_status_rcs_pref_default, alzp.SEND, alzp.DO_NOT_SEND);
        this.c = a2;
        alzi alziVar = new alzi(enip.s("rcs_settings_value", a.a, a2.a), ctbkVar.a(this));
        this.e = alziVar;
        this.d = new elbe(elbxVar, alziVar, "ConfigurationStore#init");
    }

    @Override // defpackage.alzc
    public final ctbx a(alzb alzbVar, String str) {
        return this.e.a.a(alzbVar, "Subscribe configuration updates", str, "Unsubscribe configuration updates");
    }

    @Override // defpackage.alzc
    public final elfl d() {
        ekzz f = eleg.f("Load global configuration");
        try {
            elfl g2 = elfo.g(new Callable() { // from class: alzd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    alzj alzjVar = alzj.this;
                    alzn c = ((alzu) alzjVar.a).c();
                    if (c == null) {
                        throw new NullPointerException("Null rcsSetting");
                    }
                    alzo alzoVar = (alzo) alzjVar.b.a();
                    if (alzoVar == null) {
                        throw new NullPointerException("Null readReceiptBehavior");
                    }
                    alzp alzpVar = (alzp) alzjVar.c.a();
                    if (alzpVar != null) {
                        return new alyy(c, alzoVar, alzpVar);
                    }
                    throw new NullPointerException("Null typingIndicatorBehavior");
                }
            }, this.k);
            f.b(g2);
            f.close();
            return g2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.alzk
    public final elfl e(final alzm alzmVar) {
        ekzz f = eleg.f("Update global configuration");
        try {
            elfl g2 = elfo.g(new Callable() { // from class: alze
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    alza alzaVar = (alza) alzmVar;
                    alzj alzjVar = alzj.this;
                    boolean a = alzs.a(alzjVar.a, alzaVar.a);
                    boolean a2 = alzs.a(alzjVar.b, alzaVar.b);
                    boolean a3 = alzs.a(alzjVar.c, alzaVar.c);
                    if (!a && !a2 && !a3) {
                        return null;
                    }
                    alzjVar.e.a();
                    return null;
                }
            }, this.k);
            f.b(g2);
            f.close();
            return g2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ctbj
    public final void fN() {
        if (this.j.l()) {
            this.i.o(new ctwa() { // from class: alzf
                @Override // defpackage.ctwa
                public final boolean a(int i) {
                    alzj alzjVar = alzj.this;
                    alzjVar.f.a(i).m(alzjVar.d);
                    return true;
                }
            });
        } else {
            g.r("Cannot register for subscription prefs changes, no phone permission");
        }
        this.h.m(this.d);
    }

    @Override // defpackage.ctbj
    public final void fO() {
        if (this.j.l()) {
            this.i.o(new ctwa() { // from class: alzg
                @Override // defpackage.ctwa
                public final boolean a(int i) {
                    alzj alzjVar = alzj.this;
                    alzjVar.f.a(i).o(alzjVar.d);
                    return true;
                }
            });
        } else {
            g.r("Cannot unregister subscription prefs changes, no phone permission");
        }
        this.h.o(this.d);
    }
}
