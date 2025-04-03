package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.receiver.DefaultSmsPackageChangedReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cfvl;
import defpackage.cnfo;
import defpackage.cskc;
import defpackage.ekzm;
import defpackage.elbx;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.emyl;
import defpackage.erog;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class DefaultSmsPackageChangedReceiver extends cnfo {
    public static final cskc a = cskc.g("Bugle", "DefaultSmsPackageChangedReceiver");
    public static final emyl b = cfvl.x(188682638, "use_background_executor_for_default_sms_app_change_logging");
    public ffbr c;
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public ffbr h;
    public ffbr i;
    public Executor j;
    public Executor k;
    public ffbr l;
    public ffbr m;
    public ffbr n;
    public ffbr o;

    @Override // defpackage.cniz
    public final ekzm a() {
        return ((elbx) this.i.b()).b("DefaultSmsPackageChangedReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.DefaultPackageChanged.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 10;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return null;
    }

    @Override // defpackage.cnhy
    protected final elfl j(Context context, final Intent intent) {
        return elfo.h(new erog() { // from class: cnfj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                Intent intent2 = intent;
                if (intent2 == null) {
                    return elfo.e(null);
                }
                String action = intent2.getAction();
                csjb a2 = DefaultSmsPackageChangedReceiver.a.a();
                a2.I("onReceive");
                a2.I(intent2);
                a2.r();
                ArrayList arrayList = new ArrayList();
                if ("android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED".equals(action)) {
                    final DefaultSmsPackageChangedReceiver defaultSmsPackageChangedReceiver = DefaultSmsPackageChangedReceiver.this;
                    ((ctvs) ((ctvb) defaultSmsPackageChangedReceiver.e.b()).d.b()).c();
                    final boolean booleanExtra = intent2.getBooleanExtra("android.provider.extra.IS_DEFAULT_SMS_APP", false);
                    if (booleanExtra) {
                        DefaultSmsPackageChangedReceiver.a.p("default sms set, forceFullSync");
                        if (((ctud) defaultSmsPackageChangedReceiver.d.b()).k()) {
                            axnw.h(((cpdr) defaultSmsPackageChangedReceiver.c.b()).c());
                        }
                        arrayList.add(elfo.f(new Runnable() { // from class: cnfg
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((coxg) DefaultSmsPackageChangedReceiver.this.g.b()).k(eqqh.SELECTED_DEFAULT_SMS_APP);
                            }
                        }, defaultSmsPackageChangedReceiver.k));
                    } else {
                        ((akzt) defaultSmsPackageChangedReceiver.o.b()).e("Bugle.DefaultSmsChanged.State.Counts", 1);
                        cesz ceszVar = (cesz) defaultSmsPackageChangedReceiver.h.b();
                        cesy cesyVar = cesy.a;
                        cetp cetpVar = new cetp();
                        cetpVar.b = "update_unread_counter_dedupe";
                        ceszVar.a(cesyVar, cetpVar.a());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_default_sms_app", booleanExtra);
                    ((ckds) defaultSmsPackageChangedReceiver.f.b()).M(bundle);
                    arrayList.add(elfo.f(new Runnable() { // from class: cnfh
                        @Override // java.lang.Runnable
                        public final void run() {
                            altk altkVar = (altk) DefaultSmsPackageChangedReceiver.this.m.b();
                            boolean z = booleanExtra;
                            altkVar.v(!z, z);
                        }
                    }, ((Boolean) ((cfup) DefaultSmsPackageChangedReceiver.b.get()).e()).booleanValue() ? defaultSmsPackageChangedReceiver.k : defaultSmsPackageChangedReceiver.j));
                    Iterator it = ((Set) defaultSmsPackageChangedReceiver.n.b()).iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cnjv) it.next()).fM(booleanExtra));
                    }
                }
                return elfo.j(arrayList).a(new Callable() { // from class: cnfi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        cskc cskcVar = DefaultSmsPackageChangedReceiver.a;
                        return null;
                    }
                }, erpp.a);
            }
        }, (Executor) this.l.b());
    }

    @Override // defpackage.cnhy
    public final void g(Context context, Intent intent) {
    }
}
