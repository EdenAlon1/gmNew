package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aenq implements aeev {
    public static final enru a = enru.c("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner");
    public final ffsk b;
    public final ffsk c;
    public final cnoc d;
    public final elbx e;
    public final ffbr f;
    public final AtomicBoolean g;
    public final ffxx h;
    private final Context i;
    private final ausa j;
    private final cnpd k;

    public aenq(ffsk ffskVar, ffsk ffskVar2, Context context, cnoc cnocVar, ausa ausaVar, elbx elbxVar, ffbr ffbrVar, cnpd cnpdVar) {
        ffxx ffzbVar;
        ffskVar.getClass();
        ffskVar2.getClass();
        context.getClass();
        cnocVar.getClass();
        ausaVar.getClass();
        elbxVar.getClass();
        cnpdVar.getClass();
        this.b = ffskVar;
        this.c = ffskVar2;
        this.i = context;
        this.d = cnocVar;
        this.j = ausaVar;
        this.e = elbxVar;
        this.f = ffbrVar;
        this.k = cnpdVar;
        this.g = new AtomicBoolean(false);
        if (ausaVar.a()) {
            ffzbVar = new ffzb(new fgbt(ffyy.a(new aenp(cnpdVar.h(), this)), new aenk(null)), new aenl(this, null));
        } else {
            ((enrr) a.h().h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner", "<init>", 52, "SatelliteManualConnectionBanner.kt")).q("SatelliteManualConnectionBanner is disabled by flag");
            ffzbVar = new ffyg(false);
        }
        this.h = ffzbVar;
    }

    @Override // defpackage.aeev
    public final elfl a() {
        aeey l = aefb.l();
        aees aeesVar = (aees) l;
        aeesVar.a = "satellite_manual_connection_banner";
        l.c(R.drawable.gs_android_satellite_vd_theme_24);
        aeesVar.c = this.i.getString(R.string.satellite_manual_connection_banner_body_text);
        l.b(false);
        l.e(this.i.getString(R.string.satellite_manual_connection_banner_negative_button_text));
        aeesVar.e = new aefa() { // from class: aenf
            @Override // defpackage.aefa
            public final void a(ejlq ejlqVar, View view) {
                ensk h = aenq.a.h();
                h.Y(ente.a, "BugleSatellite");
                ((enrr) h.h("com/google/android/apps/messaging/home/satellite/SatelliteManualConnectionBanner", "get$lambda$2", 84, "SatelliteManualConnectionBanner.kt")).q("Connect button clicked on SatelliteManualConnectionBanner");
                aenq aenqVar = aenq.this;
                ekzm b = aenqVar.e.b("SatelliteManualConnectionBanner#onClick");
                try {
                    axol.k(aenqVar.c, null, new aeni(aenqVar, null), 3);
                    ffig.a(b, null);
                } finally {
                }
            }
        };
        l.d(new aeez() { // from class: aeng
            @Override // defpackage.aeez
            public final void q() {
            }
        });
        elfl e = elfo.e(l.a());
        e.getClass();
        return e;
    }

    @Override // defpackage.aeev
    public final elfl b() {
        elfl c;
        c = axol.c(this.b, ffhe.a, ffsm.a, new aenj(this, null));
        return c;
    }

    @Override // defpackage.aeev
    public final /* synthetic */ Set c() {
        return new enpx(cgix.HOME);
    }

    @Override // defpackage.aeev
    public final int d() {
        return 1;
    }
}
