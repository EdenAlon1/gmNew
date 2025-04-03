package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecpc extends ecox implements ecgn, ecje {
    public final Context a;
    public final fazb b;
    public final fazb d;
    public final ffbr e;
    public final echj h;
    private final ecjc i;
    private final errm j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public ecpc(ecjd ecjdVar, Context context, ecgt ecgtVar, errm errmVar, fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, Executor executor, echj echjVar) {
        this.h = echjVar;
        this.i = ecjdVar.a(executor, fazbVar, ffbrVar);
        this.a = context;
        this.j = errmVar;
        this.b = fazbVar;
        this.d = fazbVar2;
        this.e = ffbrVar;
        ecgtVar.a(this);
    }

    @Override // defpackage.ecox
    public final void a(final ecou ecouVar) {
        String str;
        String str2;
        int i;
        if (ecouVar.b <= 0 && ecouVar.c <= 0 && ecouVar.d <= 0 && ecouVar.e <= 0 && ecouVar.q <= 0 && (i = ecouVar.w) != 3 && i != 4 && ecouVar.s <= 0) {
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).q("skip logging NetworkEvent due to empty bandwidth/latency data");
            ListenableFuture listenableFuture = erre.a;
            return;
        }
        ecjc ecjcVar = this.i;
        String str3 = ecouVar.g;
        if (str3 == null || !ecouVar.h) {
            str = ecouVar.f;
        } else {
            str = str3 + "/" + ecouVar.f;
        }
        String str4 = ecouVar.k;
        Pattern pattern = ecov.a;
        if (emxe.c(str)) {
            str = "";
        } else {
            Matcher matcher = ecov.a.matcher(str);
            if (matcher.find()) {
                str = matcher.group(1);
            } else {
                Matcher matcher2 = ecov.c.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.group(1);
                } else {
                    Matcher matcher3 = ecov.b.matcher(str);
                    if (matcher3.find() && str4 != null && !str4.startsWith("application/")) {
                        str = matcher3.group(1);
                    }
                }
            }
        }
        int i2 = ecouVar.u;
        if (i2 != 0) {
            switch (i2) {
                case 1:
                    str2 = "NONE";
                    break;
                case 2:
                    str2 = "MOBILE";
                    break;
                case 3:
                    str2 = "WIFI";
                    break;
                case 4:
                    str2 = "MOBILE_MMS";
                    break;
                case 5:
                    str2 = "MOBILE_SUPL";
                    break;
                case 6:
                    str2 = "MOBILE_DUN";
                    break;
                case 7:
                    str2 = "MOBILE_HIPRI";
                    break;
                case 8:
                    str2 = "WIMAX";
                    break;
                case 9:
                    str2 = "BLUETOOTH";
                    break;
                case 10:
                    str2 = "DUMMY";
                    break;
                case 11:
                    str2 = "ETHERNET";
                    break;
                case 12:
                    str2 = "MOBILE_FOTA";
                    break;
                case 13:
                    str2 = "MOBILE_IMS";
                    break;
                case 14:
                    str2 = "MOBILE_CBS";
                    break;
                case 15:
                    str2 = "WIFI_P2P";
                    break;
                case 16:
                    str2 = "MOBILE_IA";
                    break;
                case 17:
                    str2 = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str2 = "PROXY";
                    break;
                default:
                    str2 = "VPN";
                    break;
            }
        } else {
            str2 = null;
        }
        emww emwwVar = new emww(":");
        final long a = ecjcVar.a(new emws(emwwVar, emwwVar).g(str, ecouVar.k, str2, ecouVar.i));
        if (a == -1) {
            ListenableFuture listenableFuture2 = erre.a;
        } else {
            this.g.incrementAndGet();
            erqt.n(new erog() { // from class: ecoz
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ArrayList arrayList;
                    NetworkInfo activeNetworkInfo;
                    ecpc ecpcVar = ecpc.this;
                    long j = a;
                    try {
                        int a2 = fgpe.a(((fgpf) ecpcVar.e.b()).d);
                        ecou ecouVar2 = ecouVar;
                        if (a2 != 0 && a2 == 5) {
                            ecouVar2.t = emxc.j(Long.valueOf(j));
                        }
                        Context context = ecpcVar.a;
                        ecouVar2.l = ecpcVar.h.a();
                        int i3 = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                i3 = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException e) {
                            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).q("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                        }
                        int a3 = fgmv.a(i3);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        ecouVar2.u = a3;
                        int d = ((ecot) ecpcVar.b.b()).d();
                        synchronized (ecpcVar.c) {
                            ecpcVar.f.ensureCapacity(d);
                            ecpcVar.f.add(ecouVar2);
                            if (ecpcVar.f.size() >= d) {
                                arrayList = ecpcVar.f;
                                ecpcVar.f = new ArrayList(0);
                            } else {
                                arrayList = null;
                            }
                        }
                        return arrayList == null ? erre.a : ecpcVar.b(((ecov) ecpcVar.d.b()).c(arrayList));
                    } finally {
                        ecpcVar.g.decrementAndGet();
                    }
                }
            }, this.j);
        }
    }

    public final ListenableFuture b(fgqx fgqxVar) {
        fgmh fgmhVar;
        try {
            fgmhVar = (fgmh) ((ecow) ((ecot) this.b.b()).e().e(new ecow() { // from class: ecoy
                @Override // defpackage.ecow
                public final emxc a() {
                    return emux.a;
                }
            })).a().f();
        } catch (Exception e) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).q("Exception while getting network metric extension!");
            fgmhVar = null;
        }
        ecjc ecjcVar = this.i;
        eciu m = eciv.m();
        m.f(fgqxVar);
        ((ecim) m).b = fgmhVar;
        return ecjcVar.b(m.a());
    }

    public final ListenableFuture c() {
        if (this.g.get() > 0) {
            return erqt.k(new erog() { // from class: ecpa
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ecpc.this.c();
                }
            }, 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return erre.a;
            }
            final ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return erqt.n(new erog() { // from class: ecpb
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ecpc ecpcVar = ecpc.this;
                    return ecpcVar.b(((ecov) ecpcVar.d.b()).c(arrayList));
                }
            }, this.j);
        }
    }

    @Override // defpackage.ecgn
    public final void i(ecda ecdaVar) {
        c();
    }

    @Override // defpackage.ecje
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.ecgn
    public final /* synthetic */ void j(ecda ecdaVar) {
    }
}
