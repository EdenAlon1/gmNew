package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajis implements ajhy, ajiw {
    public ajid a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private crly e;
    private final errl f;

    public ajis(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.f = errlVar;
    }

    @Override // defpackage.ajhy
    public final elfl b() {
        return elfo.g(new Callable() { // from class: ajir
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ajis ajisVar = ajis.this;
                boolean z = false;
                if (ajisVar.a.c()) {
                    culz culzVar = (culz) ajisVar.b.b();
                    if (culw.b().booleanValue()) {
                        culw culwVar = (culw) culzVar.b.b();
                        if (!((cufk) culwVar.d.b()).a()) {
                            ctzf a = culwVar.a();
                            if (!a.a() && !a.d()) {
                                if (!culzVar.d()) {
                                    if (!culzVar.g()) {
                                        culzVar.c();
                                    }
                                    z = true;
                                }
                                culzVar.b();
                            }
                        }
                    } else {
                        ctzf a2 = ((ctzg) culzVar.e.b()).a("spam_protection_feature_consent");
                        if (!a2.a() && !a2.d() && (!a2.c() || !culzVar.f(a2, ((ctyx) culzVar.d.b()).q(culzVar.a.getString(R.string.spam_detection_pref_key), false)))) {
                            if (!culzVar.d()) {
                                if (!culzVar.g()) {
                                    culzVar.c();
                                }
                                z = true;
                            }
                            culzVar.a(a2);
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        }, this.f);
    }

    @Override // defpackage.ajhy
    public final void c(ajid ajidVar, ViewGroup viewGroup) {
        this.a = ajidVar;
    }

    @Override // defpackage.ajhy
    public final void d() {
        crly crlyVar = this.e;
        if (crlyVar != null) {
            crlyVar.e();
        }
        this.a.b();
    }

    @Override // defpackage.ajhy
    public final boolean e(Context context, ViewGroup viewGroup, boolean z) {
        crly crlyVar = new crly(LayoutInflater.from(context).inflate(R.layout.spam_popup_stub, viewGroup, true), R.id.spam_popup_stub, R.id.spam_popup, R.layout.spam_popup_view);
        this.e = crlyVar;
        ((SpamPopupView) crlyVar.b()).e = this;
        this.e.g(0);
        culz culzVar = (culz) this.b.b();
        csix.g();
        if (((ctyx) culzVar.d.b()).e("spam_popup_seen_timestamp", -1L) == -1) {
            ((ctyx) culzVar.d.b()).k("spam_popup_seen_timestamp", culzVar.c.f().toEpochMilli());
        }
        if (cubs.e()) {
            ((alef) this.d.b()).d(2);
        }
        return true;
    }

    @Override // defpackage.ajhy
    public final int f() {
        return 12;
    }

    @Override // defpackage.ajhy
    public final int n() {
        return ajic.a(2);
    }

    @Override // defpackage.ajhy
    public final /* synthetic */ void g() {
    }
}
