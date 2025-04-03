package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzch implements ffau {
    public ffam a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ dyqv c;
    final /* synthetic */ UUID d;
    final /* synthetic */ dzja e;
    final /* synthetic */ dzci f;
    final /* synthetic */ dzfp g;

    public dzch(dzci dzciVar, SettableFuture settableFuture, dyqv dyqvVar, dzfp dzfpVar, UUID uuid, dzja dzjaVar) {
        this.b = settableFuture;
        this.c = dyqvVar;
        this.g = dzfpVar;
        this.d = uuid;
        this.e = dzjaVar;
        this.f = dzciVar;
    }

    @Override // defpackage.ffbc
    public final void a() {
        dymd dymdVar = (dymd) this.c;
        dyhr.a("MsgReceiver", "BindV2 stream onCompleted for ".concat(((dzim) dymdVar.a.b.c().f()).a));
        dymdVar.a.f();
        dyjw.a();
        Context context = dymdVar.a.c;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.processName.contains(context.getPackageName())) {
                    if (next.importance == 100 || next.importance == 200) {
                        dymdVar.a.b();
                    }
                }
            }
        }
        dymdVar.a.o.a();
        this.a = null;
    }

    @Override // defpackage.ffbc
    public final void b(Throwable th) {
        long j = 0;
        try {
            if (this.b.isDone()) {
                j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) this.b.get()).longValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            dyhr.b("Backend", "Unexpected exception", e);
        }
        dymd dymdVar = (dymd) this.c;
        dymdVar.a.f();
        Status c = Status.c(th);
        final dyme dymeVar = dymdVar.a;
        if (c == null || !Status.Code.CANCELLED.equals(c.getCode())) {
            dyhr.d("MsgReceiver", "BindV2 stream error for ".concat(((dzim) dymeVar.b.c().f()).a), th);
            dyka dykaVar = dymeVar.o;
            Context context = dymeVar.c;
            errl errlVar = dymeVar.j;
            if (fdql.a.get().l() && dyjr.a(context) && Status.Code.UNAVAILABLE.equals(c.getCode()) && dykaVar.b > 0) {
                int nextInt = dykaVar.a.nextInt(((dywz) dyxf.g).e);
                int i = dykaVar.b;
                int i2 = (i == 3 ? (int) ((dywz) dyxf.g).c : (int) (((dywz) dyxf.g).d * dykaVar.c)) + nextInt;
                dykaVar.c = i2;
                dykaVar.b = i - 1;
                final emyl emylVar = new emyl() { // from class: dyjz
                    @Override // defpackage.emyl
                    public final Object get() {
                        return dyme.this.b();
                    }
                };
                final long j2 = i2;
                dykaVar.d = erny.g(errlVar.submit(new Callable() { // from class: dyjj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long j3 = j2;
                        try {
                            if (dyjm.a == null) {
                                dyjm.a = dyjv.a();
                            }
                            Thread.sleep(j3);
                            return null;
                        } catch (InterruptedException e2) {
                            dyhr.d("FutureUtils", "error when sleeping", e2);
                            throw e2;
                        }
                    }
                }), new eroh() { // from class: dyjk
                    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return emyl.this.get();
                    }
                }, errlVar);
            } else {
                dymeVar.l.h(4);
            }
        } else {
            dyhr.b("MsgReceiver", "BindV2 stream CANCELLED for ".concat(((dzim) dymeVar.b.c().f()).a), th);
        }
        dzfp dzfpVar = this.g;
        UUID uuid = this.d;
        int value = Status.c(th).getCode().value();
        dzci dzciVar = this.f;
        dzhl r = dzhm.r();
        r.g(10003);
        r.n(dzfpVar.a.c().f());
        r.o(dzfpVar.a.d().E());
        r.p(uuid.toString());
        r.j(11);
        r.m(Integer.valueOf(value));
        r.f(5);
        r.e(j);
        dzciVar.c.b(r.a());
        this.a = null;
        if (dzcw.b().c(th) == fgtr.REGISTRATION_NOT_FOUND) {
            dyhr.f("Backend", "Registration was not found for streaming RPC. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
            this.f.e.d(this.e.c().f());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0619 A[Catch: ExecutionException -> 0x0631, InterruptedException | ExecutionException -> 0x0633, TRY_LEAVE, TryCatch #8 {InterruptedException | ExecutionException -> 0x0633, blocks: (B:26:0x0611, B:28:0x0619), top: B:25:0x0611 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x056a  */
    @Override // defpackage.ffbc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void c(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzch.c(java.lang.Object):void");
    }

    @Override // defpackage.ffau
    public final void d(ffam ffamVar) {
        this.b.set(Long.valueOf(SystemClock.elapsedRealtime()));
        this.a = ffamVar;
        ((dymd) this.c).b = new dzcg(this);
    }
}
