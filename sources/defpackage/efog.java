package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import j$.time.Instant;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efog {
    protected final Context a;
    protected final String b;
    protected final String c;
    protected final String d;
    public efmo e;
    private final Handler f = new Handler(Looper.getMainLooper());

    public efog(Context context, String str, String str2, String str3) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void h(fags fagsVar, final fagu faguVar, efou efouVar) {
        if (faguVar == null) {
            Log.e("SurveyNetworkConnection", "Survey trigger response was null for trigger id: ".concat(String.valueOf(this.b)));
            i(2);
            return;
        }
        faje fajeVar = faguVar.d;
        if (fajeVar == null) {
            fajeVar = faje.a;
        }
        if (fajeVar.g.size() == 0) {
            i(3);
            return;
        }
        long j = efow.a;
        if (this.e == null) {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
            return;
        }
        faje fajeVar2 = faguVar.d;
        if (fajeVar2 == null) {
            fajeVar2 = faje.a;
        }
        fahw fahwVar = fajeVar2.e;
        if (fahwVar == null) {
            fahwVar = fahw.b;
        }
        fahu fahuVar = fahwVar.d;
        if (fahuVar == null) {
            fahuVar = fahu.a;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        eyev eyevVar = fahuVar.b;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        long millis = timeUnit.toMillis(eyevVar.b);
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        eyev eyevVar2 = fahuVar.b;
        if (eyevVar2 == null) {
            eyevVar2 = eyev.a;
        }
        final long millis2 = millis + timeUnit2.toMillis(eyevVar2.c);
        this.f.post(millis2 < 100 ? new Runnable() { // from class: efob
            @Override // java.lang.Runnable
            public final void run() {
                efog efogVar = efog.this;
                efogVar.e.b(efogVar.j(faguVar));
            }
        } : new Runnable() { // from class: efoc
            @Override // java.lang.Runnable
            public final void run() {
                new efof(efog.this, millis2, faguVar).start();
            }
        });
        efot.b(fagsVar, faguVar, efouVar, this.a, TextUtils.isEmpty(this.c) ? null : this.c);
    }

    public final void i(final int i) {
        if (this.e != null) {
            this.f.post(new Runnable() { // from class: efod
                @Override // java.lang.Runnable
                public final void run() {
                    efog efogVar = efog.this;
                    efogVar.e.a(efogVar.b, i);
                }
            });
        } else {
            Log.w("SurveyNetworkConnection", "RequestSurveyCallback was null for trigger request.");
        }
    }

    public final efnl j(fagu faguVar) {
        String str = faguVar.g;
        faje fajeVar = faguVar.d;
        if (fajeVar == null) {
            fajeVar = faje.a;
        }
        faje fajeVar2 = fajeVar;
        String str2 = this.b;
        if (TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
        if (fajeVar2 == null) {
            throw new IllegalArgumentException("Payload is null.");
        }
        fakk fakkVar = faguVar.c;
        if (fakkVar == null) {
            fakkVar = fakk.a;
        }
        fakk fakkVar2 = fakkVar;
        String str3 = faguVar.e;
        long currentTimeMillis = System.currentTimeMillis();
        engw n = engw.n(faguVar.f);
        if (currentTimeMillis != 0) {
            return new efnl(str2, str, currentTimeMillis, fakkVar2, fajeVar2, str3, n);
        }
        throw new IllegalStateException("Trigger time is not set");
    }

    public final void k(final efmw efmwVar) {
        this.f.post(new Runnable() { // from class: efoe
            @Override // java.lang.Runnable
            public final void run() {
                efou efouVar = new efou();
                efmw efmwVar2 = efmw.this;
                efmx efmxVar = efmwVar2.c;
                efmp efmpVar = efmwVar2.a;
                efog efogVar = efmwVar2.b;
                synchronized (efmx.b) {
                    if (TextUtils.isEmpty(efmpVar.b)) {
                        Log.w("SurveyController", "No trigger ID set, ignoring show request.");
                        efmpVar.c.a(efmpVar.b, 4);
                        return;
                    }
                    efmxVar.h = Instant.now().toEpochMilli();
                    efmxVar.c.c.put(efmpVar.b, Long.valueOf(Instant.now().toEpochMilli()));
                    fakt faktVar = (fakt) faku.a.createBuilder();
                    String str = efmpVar.b;
                    faktVar.copyOnWrite();
                    faku fakuVar = (faku) faktVar.instance;
                    str.getClass();
                    fakuVar.b = str;
                    efpb efpbVar = efor.c;
                    efor.c(fdwe.a.get().c(efor.b));
                    String language = Locale.getDefault().getLanguage();
                    efpb efpbVar2 = efor.c;
                    if (efor.b(fdvs.b(efor.b))) {
                        language = Locale.getDefault().toLanguageTag();
                    }
                    engw r = engw.r(language);
                    faktVar.copyOnWrite();
                    faku fakuVar2 = (faku) faktVar.instance;
                    eygr eygrVar = fakuVar2.c;
                    if (!eygrVar.c()) {
                        fakuVar2.c = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(r, fakuVar2.c);
                    boolean z = efmpVar.f;
                    faktVar.copyOnWrite();
                    ((faku) faktVar.instance).d = z;
                    faku fakuVar3 = (faku) faktVar.build();
                    fahm d = efow.d(efmpVar.a);
                    fagr fagrVar = (fagr) fags.a.createBuilder();
                    fagrVar.copyOnWrite();
                    fags fagsVar = (fags) fagrVar.instance;
                    fakuVar3.getClass();
                    fagsVar.c = fakuVar3;
                    fagsVar.b |= 1;
                    fagrVar.copyOnWrite();
                    fags fagsVar2 = (fags) fagrVar.instance;
                    d.getClass();
                    fagsVar2.d = d;
                    fagsVar2.b |= 2;
                    final fags fagsVar3 = (fags) fagrVar.build();
                    final efou efouVar2 = new efou();
                    if (fagsVar3 == null) {
                        Log.e("NetworkCallerGrpc", "Survey trigger request was null");
                    } else {
                        final efnz efnzVar = (efnz) efogVar;
                        efnp.a().execute(new Runnable() { // from class: efnt
                            @Override // java.lang.Runnable
                            public final void run() {
                                efnz.this.c(fagsVar3, efouVar2);
                            }
                        });
                    }
                    ezzl ezzlVar = (ezzl) ezzm.a.createBuilder();
                    String str2 = efmpVar.b;
                    ezzlVar.copyOnWrite();
                    ezzm ezzmVar = (ezzm) ezzlVar.instance;
                    str2.getClass();
                    ezzmVar.b = str2;
                    boolean z2 = efmpVar.f;
                    ezzlVar.copyOnWrite();
                    ((ezzm) ezzlVar.instance).c = z2;
                    ezzlVar.copyOnWrite();
                    ((ezzm) ezzlVar.instance).d = false;
                    ezzm ezzmVar2 = (ezzm) ezzlVar.build();
                    Context context = efmpVar.a;
                    Account account = efmpVar.e;
                    String str3 = account == null ? null : account.name;
                    efpb efpbVar3 = efor.c;
                    if (efor.c(fdul.b(efor.b))) {
                        efos a = efos.a();
                        ezza ezzaVar = (ezza) ezzn.a.createBuilder();
                        ezzaVar.copyOnWrite();
                        ezzn ezznVar = (ezzn) ezzaVar.instance;
                        ezzmVar2.getClass();
                        ezznVar.c = ezzmVar2;
                        ezznVar.b = 3;
                        a.c((ezzn) ezzaVar.build(), efouVar.b(), efouVar.a(), context, str3);
                    }
                }
            }
        });
    }
}
