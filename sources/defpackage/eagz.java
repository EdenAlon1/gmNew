package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.os.SystemClock;
import com.android.vcard.VCardConfig;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eagz extends BroadcastReceiver {
    public static final entd a = entd.c("GnpSdk");
    private static final AtomicBoolean b = new AtomicBoolean(false);

    public abstract eaha a(Context context);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        long startElapsedRealtime;
        context.getClass();
        if (intent == null) {
            ((ensz) ((ensz) a.i()).g(new IllegalArgumentException())).q("Null Intent received.");
            return;
        }
        if (intent.hasExtra("fms") && ffkj.e(intent.getStringExtra("fms"), "1")) {
            ((ensz) a.h()).q("Chime payload will be processed by Firebase service, returning.");
            return;
        }
        final long micros = TimeUnit.MILLISECONDS.toMicros(Instant.now().toEpochMilli());
        emxf.a(true);
        eafp c = eafp.c((intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) > 0 ? 8500L : 58500L);
        entd entdVar = a;
        ((ensz) entdVar.h()).D("Intent received for action [%s] package [%s].", intent.getAction(), context.getApplicationContext().getPackageName());
        try {
            eajk a2 = eajj.a(context);
            a2.getClass();
            a2.dT().a(context);
            ((ensz) entdVar.h()).q("Phenotype initialized.");
            elav a3 = a2.dN().a("GnpBroadcastReceiver");
            try {
                a2.ja();
                final eaha a4 = a(context);
                if (a4.b(intent)) {
                    ((ensz) entdVar.h()).t("Validation OK for action [%s].", intent.getAction());
                    eaim dO = a2.dO();
                    if (easb.d(context)) {
                        final fflb fflbVar = new fflb();
                        fflbVar.a = c;
                        if (b.compareAndSet(false, true)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            startElapsedRealtime = Process.getStartElapsedRealtime();
                            long j = elapsedRealtime - startElapsedRealtime;
                            if (j <= fdno.a.get().a()) {
                                if (!c.e()) {
                                    eaff eaffVar = new eaff();
                                    eaffVar.a = Long.valueOf(Math.max(0L, ((eafg) c).a.longValue() - j));
                                    eaffVar.b(((eafg) c).b);
                                    c = eaffVar.a();
                                }
                                fflbVar.a = c;
                            }
                        }
                        dO.a(goAsync(), isOrderedBroadcast(), new Runnable() { // from class: eagx
                            @Override // java.lang.Runnable
                            public final void run() {
                                ensz enszVar = (ensz) eagz.a.h();
                                eaha eahaVar = a4;
                                Intent intent2 = intent;
                                enszVar.t("Executing action in BroadcastReceiver [%s].", intent2.getAction());
                                eagy.a(eahaVar, intent2, (eafp) fflbVar.a, micros);
                            }
                        }, (eafp) fflbVar.a);
                    } else {
                        dO.b(new Runnable() { // from class: eagw
                            @Override // java.lang.Runnable
                            public final void run() {
                                ensz enszVar = (ensz) eagz.a.h();
                                eaha eahaVar = a4;
                                Intent intent2 = intent;
                                enszVar.t("Executing action in Service [%s].", intent2.getAction());
                                eagy.a(eahaVar, intent2, eafp.d(), micros);
                            }
                        });
                    }
                } else {
                    ((ensz) entdVar.h()).t("Validation failed for action [%s].", intent.getAction());
                }
                ffig.a(a3, null);
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(a3, th);
                    throw th2;
                }
            }
        } catch (RuntimeException e) {
            ((ensz) ((ensz) a.j()).g(e)).q("BroadcastReceiver stopped");
        }
    }
}
