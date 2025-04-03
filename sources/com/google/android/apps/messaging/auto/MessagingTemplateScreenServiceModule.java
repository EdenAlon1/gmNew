package com.google.android.apps.messaging.auto;

import android.content.Context;
import androidx.car.app.CarAppBinder;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.akzt;
import defpackage.asgw;
import defpackage.cfp;
import defpackage.clt;
import defpackage.clu;
import defpackage.ctbx;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.ffbr;
import defpackage.ljv;
import defpackage.lkr;
import defpackage.smx;
import defpackage.snp;
import defpackage.snt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessagingTemplateScreenServiceModule extends smx implements ljv {
    public static final enru c = enru.c("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule");
    public ffbr d;
    public ffbr e;
    public ffbr f;
    public ffbr g;
    public snp h;
    private cfp i;

    @Override // defpackage.cel
    public final clu b() {
        if ((getApplicationInfo().flags & 2) != 0) {
            return clu.a;
        }
        Context applicationContext = getApplicationContext();
        HashMap hashMap = new HashMap();
        String[] stringArray = applicationContext.getResources().getStringArray(R.array.hosts_allowlist_sample);
        if (stringArray == null) {
            throw new IllegalArgumentException("Invalid allowlist res id: 2130903101");
        }
        for (String str : stringArray) {
            String[] split = str.split(",", -1);
            if (split.length != 2) {
                throw new IllegalArgumentException(a.a(str, "Invalid allowed host entry: '", "'"));
            }
            String a = clt.a(split[1]);
            String a2 = clt.a(split[0]);
            a.getClass();
            a2.getClass();
            List list = (List) hashMap.get(a);
            if (list == null) {
                list = new ArrayList();
                hashMap.put(a, list);
            }
            list.add(a2);
        }
        return new clu(applicationContext.getPackageManager(), hashMap, false);
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        ensk e = c.e();
        e.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onResume", 96, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onResume");
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        ensk e = c.e();
        e.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onStop", 107, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onStop");
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
    }

    @Override // defpackage.cel
    public final cfp fg() {
        ekzz f = eleg.f("MessagingTemplateScreenServiceModule#onCreateSession");
        try {
            snt sntVar = new snt(this);
            this.i = sntVar;
            sntVar.a.c(this);
            f.close();
            return this.i;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        ensk e = c.e();
        e.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onStart", 87, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onStart");
        if (((asgw) this.g.b()).a()) {
            ((akzt) this.f.b()).c("Bugle.Auto.App.Open");
        }
    }

    @Override // defpackage.cel, android.app.Service
    public final void onDestroy() {
        ctbx ctbxVar;
        ensk e = c.e();
        e.Y(ente.a, "BugleAppOnAuto");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/auto/MessagingTemplateScreenServiceModule", "onDestroy", 118, "MessagingTemplateScreenServiceModule.java")).q("CarAppService onDestroy");
        snp snpVar = this.h;
        if (snpVar != null && (ctbxVar = snpVar.g) != null) {
            ctbxVar.a();
            snpVar.g = null;
        }
        this.i.a.d(this);
        synchronized (this.a) {
            Iterator it = this.a.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            this.a.clear();
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
