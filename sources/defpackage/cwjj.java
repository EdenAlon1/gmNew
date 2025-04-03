package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dtub;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwjj extends cpdo {
    public static final entd a = entd.c("BugleStartup");
    public final Context b;
    public final errl c;
    public final ffbr d;
    public final cqoh e;
    public final ffbr f;
    public final Optional g;
    public final asmj h;
    public final ffbr i;
    private final ffbr j;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public cwjj(Context context, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, ffbr ffbrVar3, ffbr ffbrVar4, cqoh cqohVar, ffbr ffbrVar5, ffbr ffbrVar6, Optional optional, asmj asmjVar, ffbr ffbrVar7) {
        this.b = context;
        this.j = ffbrVar;
        this.l = ffbrVar2;
        this.c = errlVar;
        this.m = ffbrVar3;
        this.d = ffbrVar4;
        this.e = cqohVar;
        this.n = ffbrVar5;
        this.f = ffbrVar6;
        this.g = optional;
        this.h = asmjVar;
        this.i = ffbrVar7;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("PhoneAsyncAppCreateStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        if (!((dtqv) dtub.c).k) {
            throw new IllegalStateException("do not use the bugle database on non-primary processes");
        }
        ((dtub.a) ekhw.a(dtub.b, dtub.a.class)).fH();
        if (((ctvs) this.f.b()).e()) {
            this.n.b();
            diom.b(this.b);
            diom.a(this.b);
        }
        son sonVar = (son) this.m.b();
        sonVar.a(((ctyx) this.l.b()).a(), snz.a(sonVar.a, new enpx(sonVar.b)));
        final akvb akvbVar = (akvb) this.j.b();
        return elfo.f(new Runnable() { // from class: akva
            @Override // java.lang.Runnable
            public final void run() {
                final akvb akvbVar2 = akvb.this;
                akvbVar2.p.b();
                ((cfud) akvbVar2.o.b()).d(akvbVar2.c);
                ((akzt) akvbVar2.e.b()).i();
                ((albq) akvbVar2.f.b()).j();
                ((albq) akvbVar2.g.b()).j();
                ((albq) akvbVar2.h.b()).j();
                ((altk) akvbVar2.i.b()).l();
                ((bzea) akvbVar2.j.b()).a();
                algy algyVar = (algy) akvbVar2.k.b();
                efbd.b();
                boolean i = ((csxu) algyVar.c.b()).i("bugle_enable_analytics", true);
                if (i) {
                    algyVar.b = (akxl) algyVar.a.b();
                }
                algyVar.d.set(i);
                ((csxu) akvbVar2.d.b()).g(new Runnable() { // from class: akuy
                    @Override // java.lang.Runnable
                    public final void run() {
                        akvb.this.a();
                    }
                });
                akvbVar2.a();
                boolean e = ((ctvs) akvbVar2.l.b()).e();
                Optional a2 = ((cqdt) akvbVar2.q.b()).a();
                if (e && a2.isPresent()) {
                    csjy.l("BugleDatabase", "full sync request on startup for reason [" + a2.get().toString() + "]");
                    ((coxg) akvbVar2.m.b()).k((eqqh) a2.get());
                }
                if (ctid.l.get()) {
                    ((akzt) akvbVar2.e.b()).c("Bugle.OsUtil.GetProcessName.Failure.Count");
                    if (((Boolean) ((cfup) akvb.b.get()).e()).booleanValue()) {
                        ((ensz) ((ensz) ((ensz) ((entd) akvb.a.get()).j()).g((Throwable) ctid.m.get())).h("com/google/android/apps/messaging/shared/SharedAsyncAppCreateStartupTask", "run", 160, "SharedAsyncAppCreateStartupTask.java")).q("Failure detected retrieving process name from in process data.");
                    }
                }
            }
        }, akvbVar.n).i(new eroh() { // from class: cwjf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cwjn cwjnVar = (cwjn) cwjj.this.d.b();
                return ctid.d ? cwjn.b.b().h(new emwl() { // from class: cwjm
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        List historicalProcessExitReasons;
                        String processName;
                        int reason;
                        int status;
                        int status2;
                        int status3;
                        int status4;
                        int status5;
                        if (!((Boolean) obj2).booleanValue()) {
                            return null;
                        }
                        cwjn cwjnVar2 = cwjn.this;
                        int i = 0;
                        historicalProcessExitReasons = ((ActivityManager) cwjnVar2.d.b()).getHistoricalProcessExitReasons(cwjnVar2.c.getPackageName(), 0, 0);
                        String a2 = ctid.a(cwjnVar2.c);
                        Iterator it = historicalProcessExitReasons.iterator();
                        while (it.hasNext()) {
                            ApplicationExitInfo m = aeb$$ExternalSyntheticApiModelOutline0.m(it.next());
                            processName = m.getProcessName();
                            if (TextUtils.equals(processName, a2)) {
                                reason = m.getReason();
                                switch (reason) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        status = m.getStatus();
                                        if (status != OsConstants.SIGILL) {
                                            status2 = m.getStatus();
                                            if (status2 != OsConstants.SIGABRT) {
                                                status3 = m.getStatus();
                                                if (status3 != OsConstants.SIGBUS) {
                                                    status4 = m.getStatus();
                                                    if (status4 != OsConstants.SIGKILL) {
                                                        status5 = m.getStatus();
                                                        if (status5 != OsConstants.SIGSEGV) {
                                                            i = 2;
                                                            break;
                                                        } else {
                                                            i = 111;
                                                            break;
                                                        }
                                                    } else {
                                                        i = 109;
                                                        break;
                                                    }
                                                } else {
                                                    i = 107;
                                                    break;
                                                }
                                            } else {
                                                i = 106;
                                                break;
                                            }
                                        } else {
                                            i = 104;
                                            break;
                                        }
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 4;
                                        break;
                                    case 5:
                                        i = 5;
                                        break;
                                    case 6:
                                        i = 6;
                                        break;
                                    case 7:
                                        i = 7;
                                        break;
                                    case 8:
                                        i = 8;
                                        break;
                                    case 9:
                                        i = 9;
                                        break;
                                    case 10:
                                        i = 10;
                                        break;
                                    case 11:
                                        i = 11;
                                        break;
                                    case 12:
                                        i = 12;
                                        break;
                                    case 13:
                                        i = 13;
                                        break;
                                }
                                ((ensz) cwjn.a.n().h("com/google/android/apps/messaging/startup/ProcessHistoryLogger", "logApplicationExitReasonInternal", 87, "ProcessHistoryLogger.java")).B("%s process exit reason: %d", a2, i);
                                ((akzt) cwjnVar2.e.b()).e("Bugle.Process.Main.ExitReason.Count", i);
                                return null;
                            }
                        }
                        return null;
                    }
                }, cwjnVar.f) : elfo.e(null);
            }
        }, this.c).i(new eroh() { // from class: cwjg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final cwjj cwjjVar = cwjj.this;
                return !((ctvs) cwjjVar.f.b()).e() ? elfo.e(null) : (csjc.j() || ((Long) cful.H.e()).longValue() == 0) ? elfo.e(null) : elfo.f(new Runnable() { // from class: cwje
                    @Override // java.lang.Runnable
                    public final void run() {
                        long longValue = ((Long) cful.H.e()).longValue();
                        if (longValue == 0) {
                            return;
                        }
                        cwjj cwjjVar2 = cwjj.this;
                        ContentResolver contentResolver = cwjjVar2.b.getContentResolver();
                        final Uri build = Telephony.Sms.CONTENT_URI.buildUpon().appendPath("raw").build();
                        try {
                            final String s = a.s(cwjjVar2.e.f().toEpochMilli() - longValue, "deleted = 0 AND date < ");
                            final int delete = contentResolver.delete(build, s, null);
                            if (cwjjVar2.h.a()) {
                                ((azei) cwjjVar2.i.b()).d(new Consumer() { // from class: cwjh
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        entd entdVar = cwjj.a;
                                        ((cpdd) obj2).a(build, s, null, delete);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            } else {
                                cwjjVar2.g.ifPresent(new Consumer() { // from class: cwji
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj2) {
                                        entd entdVar = cwjj.a;
                                        ((cpdd) ((ffbr) obj2).b()).a(build, s, null, delete);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            ((ensz) cwjj.a.n().h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", 123, "PhoneAsyncAppCreateStartupTask.java")).r("%d raw messages are deleted from Telephony", delete);
                        } catch (Exception e) {
                            ((ensz) ((ensz) ((ensz) cwjj.a.i()).g(e)).h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", '}', "PhoneAsyncAppCreateStartupTask.java")).q("cannot remove raw messages");
                        }
                    }
                }, cwjjVar.c);
            }
        }, this.c);
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return false;
    }
}
