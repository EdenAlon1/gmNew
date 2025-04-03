package com.google.android.apps.messaging.receiver;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.UserManager;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.ajpa;
import defpackage.akzt;
import defpackage.aliq;
import defpackage.alir;
import defpackage.almw;
import defpackage.altk;
import defpackage.axnw;
import defpackage.bavz;
import defpackage.cfup;
import defpackage.cgjb;
import defpackage.cgje;
import defpackage.cjbc;
import defpackage.cnew;
import defpackage.cnfa;
import defpackage.cnho;
import defpackage.cnhs;
import defpackage.cnjs;
import defpackage.cnjw;
import defpackage.cnjx;
import defpackage.cqlx;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csxu;
import defpackage.ctvs;
import defpackage.ctyx;
import defpackage.ejnt;
import defpackage.ejnx;
import defpackage.ejoe;
import defpackage.ejoi;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.ensz;
import defpackage.entd;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.pon;
import defpackage.pot;
import defpackage.poz;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PhoneBootAndPackageReplacedReceiver extends ajpa {
    public fazb a;
    public fazb b;
    public ffbr c;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.a.b()).b("PhoneBootAndPackageReplacedReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        cskc cskcVar = cnfa.a;
        return "Bugle.Broadcast.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.cnhy
    public final String f() {
        cskc cskcVar = cnfa.a;
        return "Bugle.Broadcast.ForegroundService.BootAndPackageReplaced.Latency";
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
        JobInfo pendingJob;
        boolean isManagedProfile;
        cnfa cnfaVar = (cnfa) this.b.b();
        if (cnfa.a(intent)) {
            ((almw) cnfaVar.j.b()).k(this);
            String action = intent.getAction();
            if (action != null) {
                cnho cnhoVar = (cnho) cnfaVar.t.b();
                entd entdVar = cnhs.a;
                pon ponVar = new pon();
                ponVar.e("intent_action", action);
                pot a = ponVar.a();
                ejoe n = ejoi.n(cnhs.class);
                n.g(new ejnx("BOOT_AND_PACKAGE_REPLACE_WORKER", poz.CANCEL_AND_REENQUEUE));
                ((ejnt) n).e = a;
                elfl g = elfl.g(cnhoVar.a.c(n.h()));
                g.getClass();
                axnw.h(g);
            }
        } else if (((ctvs) cnfaVar.d.b()).e()) {
            String action2 = intent.getAction();
            if ("android.intent.action.BOOT_COMPLETED".equals(action2) || "android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                long epochMilli = ((cqoh) cnfaVar.e.b()).f().toEpochMilli();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((ctyx) cnfaVar.f.b()).k("last_app_update_time_millis", epochMilli);
                    Iterator it = ((Set) cnfaVar.o.b()).iterator();
                    while (it.hasNext()) {
                        ((cnjx) it.next()).b();
                    }
                }
                if (((ctyx) cnfaVar.f.b()).e("app_install_time_millis", 0L) == 0) {
                    ((ctyx) cnfaVar.f.b()).k("app_install_time_millis", epochMilli);
                }
                ((ensz) ((ensz) cnfa.b.h()).h("com/google/android/apps/messaging/shared/receiver/BootAndPackageReplacedReceiverDelegate", "doSync", 170, "BootAndPackageReplacedReceiverDelegate.java")).q("Silently refreshing notifications after Boot/Package replacement");
                ((cjbc) cnfaVar.s.b()).f();
                ((cnew) cnfaVar.l.b()).a();
                if ("android.intent.action.MY_PACKAGE_REPLACED".equals(action2)) {
                    ((csxu) cnfaVar.g.b()).h();
                    ((akzt) cnfaVar.h.b()).c("Bugle.Receiver.BootAndPackageReplacedReceiver.RefreshGmsCore");
                    ((alir) cnfaVar.m.b()).f(aliq.PACKAGE_REPLACED, Optional.empty());
                }
                if ("android.intent.action.BOOT_COMPLETED".equals(action2)) {
                    ((cnjw) cnfaVar.c.b()).c();
                    ((altk) cnfaVar.i.b()).af();
                    ((alir) cnfaVar.m.b()).f(aliq.BOOT_COMPLETE, Optional.empty());
                    ((Optional) cnfaVar.n.b()).ifPresent(new Consumer() { // from class: cney
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((cnla) obj).j();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Iterator it2 = ((Set) cnfaVar.p.b()).iterator();
                    while (it2.hasNext()) {
                        ((cnjs) it2.next()).a();
                    }
                }
            } else if ("android.intent.action.LOCALE_CHANGED".equals(action2)) {
                cnfaVar.k.ifPresent(new Consumer() { // from class: cnez
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        cskc cskcVar = cnfa.a;
                        ((csll) ((ffbr) obj).b()).i();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                csjb a2 = cnfa.a.a();
                a2.I("refresh self participant on locale changed");
                a2.r();
                ((bavz) cnfaVar.q.b()).b().K();
                ((alir) cnfaVar.m.b()).f(aliq.LOCALE_CHANGED, Optional.empty());
            } else {
                csjb c = cnfa.a.c();
                c.I("got unexpected action:");
                c.I(intent.getAction());
                c.r();
            }
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null) {
                int[] iArr = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
                for (int i = 0; i < 2; i++) {
                    int i2 = iArr[i];
                    pendingJob = jobScheduler.getPendingJob(i2);
                    if (pendingJob != null) {
                        jobScheduler.cancel(i2);
                    }
                }
            } else {
                cnfa.a.n("JobScheduler is null");
            }
            ((almw) cnfaVar.j.b()).k(this);
            ((almw) cnfaVar.j.b()).j();
            Optional optional = (Optional) cnfaVar.r.b();
            if (optional.isPresent()) {
                axnw.h(((cqlx) optional.get()).a());
            }
        }
        UserManager userManager = (UserManager) context.getSystemService("user");
        userManager.getClass();
        isManagedProfile = userManager.isManagedProfile();
        if (isManagedProfile) {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.ConversationListActivity"), 2, 1);
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, "com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity"), 2, 1);
        }
        if (((Boolean) ((cfup) cgje.b.get()).e()).booleanValue() && "android.intent.action.MY_PACKAGE_REPLACED".equals(intent.getAction()) && ((Optional) this.c.b()).isPresent()) {
            ((cgjb) ((Optional) this.c.b()).get()).a();
        }
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return !cnfa.a(intent);
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        cskc cskcVar = cnfa.a;
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
