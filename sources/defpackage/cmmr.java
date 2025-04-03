package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmmr implements ejny {
    private static final cskc a = cskc.g("Bugle", "NotifyRcsUnavailableWorker");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker");
    private final Context c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final errl h;
    private final ffbr i;
    private final ffbr j;

    public cmmr(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.c = context;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = errlVar;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        final String d = workerParameters.b.d("sim_id");
        d.getClass();
        return elfo.g(new Callable() { // from class: cmmo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cmmr.this.c(d);
            }
        }, this.h);
    }

    public final ppq c(String str) {
        ppq ppoVar;
        djvo djvoVar;
        HttpURLConnection httpURLConnection;
        int responseCode;
        eqwf w = ((ckge) ((csjk) this.g.b()).a()).w(new djro(str));
        String str2 = (String) ((cort) this.i.b()).h(cors.a).map(new Function() { // from class: cmmp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cosz) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        int intValue = ((Integer) ((cort) this.i.b()).j(new djro(str)).map(new Function() { // from class: cmmq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cosz) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(-1)).intValue();
        boolean z = false;
        boolean z2 = intValue != -1 && ((cort) this.i.b()).t(intValue);
        boolean equals = str.equals(str2);
        boolean z3 = equals && z2;
        boolean z4 = w == eqwf.AVAILABLE;
        if (z3 && z4) {
            z = true;
        }
        if (!equals) {
            ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 189, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not the same as current default sim");
        }
        if (!z2) {
            ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 194, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not loaded");
        }
        if (!z4) {
            ((enrr) ((enrr) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 197, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not available");
        }
        if (z) {
            a.p("skipping request because conditions are not met");
            return new ppp();
        }
        djtp f = ((dkcp) this.d.b()).f(str);
        if (!f.O()) {
            a.r("skipping request because there is no config token");
            return new ppn();
        }
        cmbe d = ((dkcp) this.d.b()).d(str);
        String str3 = d.d;
        String str4 = f.k().mValue;
        int i = ((cguo) this.j.b()).c(str).k;
        String str5 = d.e;
        int b2 = f.b();
        f.F(-99);
        ffbr ffbrVar = this.g;
        dkbm m = dkbn.m(4);
        eqwf w2 = ((ckge) ((csjk) ffbrVar.b()).a()).w(new djro(str));
        a.p("Current availability is ".concat(String.valueOf(String.valueOf(w2))));
        if (djai.T() && w2 == eqwf.DISABLED_NOT_DEFAULT_SMS_APP) {
            m.l("default_sms_app", Integer.toString(2));
        }
        try {
            djxv djxvVar = (djxv) this.e.b();
            djxvVar.a.e(str3, f, null, str4, i, djxvVar.a(this.c, str5, str), Optional.of(m));
            dkbn j = m.j();
            djro djroVar = new djro(str);
            try {
                try {
                    djvoVar = (djvo) this.f.b();
                    Context context = this.c;
                    djvoVar.b.j(context, j, ((dkbc) j).a, djroVar);
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    try {
                        httpURLConnection = djvoVar.c.a(j);
                        try {
                            emyg c = emyg.c(emtt.a);
                            responseCode = httpURLConnection.getResponseCode();
                            long a2 = c.a(TimeUnit.MILLISECONDS);
                            dkbp f2 = dkbq.f(4, ((dkbc) j).a, ((dkbc) j).b);
                            eyze b3 = f2.b();
                            b3.copyOnWrite();
                            eyzf eyzfVar = (eyzf) b3.instance;
                            eyzf eyzfVar2 = eyzf.a;
                            eyzfVar.b |= 1;
                            eyzfVar.c = responseCode;
                            int min = (int) Math.min(2147483647L, a2);
                            b3.copyOnWrite();
                            eyzf eyzfVar3 = (eyzf) b3.instance;
                            eyzfVar3.b |= 2;
                            eyzfVar3.d = min;
                            djvoVar.b.k(context, f2.a(), djroVar);
                        } catch (Throwable th) {
                            th = th;
                            if (httpURLConnection != null) {
                                djvoVar.a(httpURLConnection, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
                            }
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnection = null;
                    }
                } catch (MalformedURLException unused) {
                    a.r("skipping request due to MalformedURLException");
                    return new ppn();
                }
            } catch (djvb e) {
                a.s("Unexpected HTTP response", e);
                ppoVar = e.a == 503 ? new ppo() : new ppn();
            } catch (IOException e2) {
                a.o("IOException while connecting to server", e2);
                ppoVar = new ppo();
            }
            if (responseCode != 200) {
                throw new djvb(responseCode);
            }
            if (httpURLConnection != null) {
                djvoVar.a(httpURLConnection, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
            }
            TrafficStats.clearThreadStatsTag();
            ppoVar = new ppp();
            f.F(b2);
            f.G(true);
            ((dkcp) this.d.b()).t(str, f);
            return ppoVar;
        } catch (MalformedURLException unused2) {
        }
    }
}
