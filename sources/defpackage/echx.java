package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class echx extends echv implements ecgw, ecgn, ecje {
    final AtomicBoolean a = new AtomicBoolean();
    private final Context b;
    private final ecgx c;
    private final Executor d;
    private final ecij e;
    private final ffbr f;
    private final ecjc g;
    private final AtomicBoolean h;
    private final ecgt i;

    /* JADX WARN: Multi-variable type inference failed */
    public echx(ecjd ecjdVar, Context context, ecgx ecgxVar, ecgt ecgtVar, errm errmVar, fazb<echt> fazbVar, ecij ecijVar, ffbr<echq> ffbrVar, ffbr<fgpf> ffbrVar2, Executor executor) {
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = ecgtVar;
        this.g = ecjdVar.a(executor, fazbVar, ffbrVar2);
        this.b = context;
        this.c = ecgxVar;
        this.d = Build.VERSION.SDK_INT < 31 ? executor : errmVar;
        this.e = ecijVar;
        this.f = ffbrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0336, code lost:
    
        if ((r9 / r11) <= 3.472222222222222E-5d) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0090 A[Catch: all -> 0x05e2, TryCatch #1 {all -> 0x05e2, blocks: (B:10:0x0014, B:15:0x0043, B:18:0x0047, B:22:0x004d, B:23:0x0088, B:178:0x0090, B:180:0x0096, B:182:0x009e, B:184:0x00a3, B:186:0x00a9, B:187:0x00ab, B:189:0x00b2, B:190:0x00bb, B:192:0x00c1, B:193:0x00ca, B:195:0x00d0, B:196:0x00d9, B:226:0x0058, B:227:0x006c, B:229:0x002e), top: B:9:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.common.util.concurrent.ListenableFuture k(defpackage.echx r18, defpackage.fgkx r19, defpackage.ecda r20) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.echx.k(echx, fgkx, ecda):com.google.common.util.concurrent.ListenableFuture");
    }

    private final ListenableFuture o(final fgkx fgkxVar) {
        return erqt.n(new erog() { // from class: echw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return echx.k(echx.this, fgkxVar, null);
            }
        }, this.d);
    }

    @Override // defpackage.ecgw
    public void a(Activity activity, Bundle bundle) {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.ecgn
    public void i(ecda ecdaVar) {
        l();
    }

    @Override // defpackage.ecgn
    public void j(ecda ecdaVar) {
        if (this.a.get()) {
            return;
        }
        m();
    }

    public ListenableFuture<Void> l() {
        if (!dubc.e(this.b)) {
            return erre.a;
        }
        try {
            emxf.l(this.a.getAndSet(false));
            return o(fgkx.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return erqt.h(e);
        }
    }

    public ListenableFuture<Void> m() {
        if (!dubc.e(this.b)) {
            return erre.a;
        }
        if (!this.a.getAndSet(true)) {
            return o(fgkx.BACKGROUND_TO_FOREGROUND);
        }
        ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 141, "BatteryMetricServiceImpl.java")).q("App is already in the foreground.");
        return erqt.g();
    }

    @Override // defpackage.ecje
    public void n() {
        this.i.a(this);
        this.c.a(this);
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void c(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void f(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void g(Activity activity) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void h(int i) {
    }

    @Override // defpackage.ecgw
    public /* synthetic */ void e(Activity activity, Bundle bundle) {
    }
}
