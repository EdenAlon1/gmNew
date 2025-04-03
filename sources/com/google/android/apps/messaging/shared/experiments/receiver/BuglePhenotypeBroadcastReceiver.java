package com.google.android.apps.messaging.shared.experiments.receiver;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.experiments.receiver.BuglePhenotypeBroadcastReceiver;
import com.google.android.ims.util.common.RcsIntents;
import defpackage.cfvt;
import defpackage.ekzm;
import defpackage.ekzz;
import defpackage.elbx;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.entd;
import defpackage.errl;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class BuglePhenotypeBroadcastReceiver extends cfvt {
    public static final entd a = entd.c("BuglePhenotype");
    public ffbr b;
    public elbx c;
    public errl d;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.c.b("BuglePhenotypeBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return "Bugle.Broadcast.PhenotypeCommit.Latency";
    }

    @Override // defpackage.cniz
    protected final int e() {
        return 15;
    }

    @Override // defpackage.cnhy
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.PhenotypeCommit.Latency";
    }

    @Override // defpackage.cnhy
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.cnhy
    public final elfl j(final Context context, final Intent intent) {
        ekzz f = eleg.f("BuglePhenotypeBroadcastReceiver#doInBackgroundAsync");
        try {
            elfl f2 = elfo.f(new Runnable() { // from class: cfvr
                @Override // java.lang.Runnable
                public final void run() {
                    final String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                    boolean equals = "com.google.android.ims.library".equals(stringExtra);
                    BuglePhenotypeBroadcastReceiver buglePhenotypeBroadcastReceiver = BuglePhenotypeBroadcastReceiver.this;
                    if (equals) {
                        ensz enszVar = (ensz) BuglePhenotypeBroadcastReceiver.a.h();
                        enszVar.Y(cfvq.a, stringExtra);
                        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 82, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for cslib package");
                        final cfud cfudVar = (cfud) buglePhenotypeBroadcastReceiver.b.b();
                        ((cuaa) ((csjk) cfudVar.c.b()).a()).a(stringExtra, new cfua(eldl.a(new emwl() { // from class: cftz
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                ensk n = cfud.a.n();
                                ensn ensnVar = cfvq.a;
                                String str = stringExtra;
                                n.Y(ensnVar, str);
                                ((ensz) n.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 130, "PhenotypeHelper.java")).t("CsLib Ph flags committed. success: %b", (Boolean) obj);
                                cfud cfudVar2 = cfud.this;
                                if (!emuz.e(str, "com.google.android.ims.library")) {
                                    ensz enszVar2 = (ensz) cfud.a.h();
                                    enszVar2.Y(cfvq.b, "com.google.android.ims.library");
                                    enszVar2.Y(cfvq.a, str);
                                    ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 154, "PhenotypeHelper.java")).q("Skipping sending updates, package not current.");
                                    return null;
                                }
                                ensz enszVar3 = (ensz) cfud.a.h();
                                enszVar3.Y(cfvq.b, str);
                                ((ensz) enszVar3.h("com/google/android/apps/messaging/shared/experiments/PhenotypeHelper", "commitCsLibPhenotypeAsync", 137, "PhenotypeHelper.java")).q("Notify about updates in current package");
                                Intent a2 = akuv.c(cfudVar2.b, diyp.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a();
                                a2.putExtra(RcsIntents.EXTRA_MENDEL_PACKAGE_NAME, str);
                                cfudVar2.b.sendBroadcast(a2);
                                dimn.I(cfudVar2.b);
                                cfudVar2.a();
                                return null;
                            }
                        })));
                        return;
                    }
                    if (cfuf.a(context).equals(stringExtra)) {
                        ensz enszVar2 = (ensz) BuglePhenotypeBroadcastReceiver.a.h();
                        enszVar2.Y(cfvq.a, stringExtra);
                        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/experiments/receiver/BuglePhenotypeBroadcastReceiver", "doInBackgroundAsync", 91, "BuglePhenotypeBroadcastReceiver.java")).q("onReceive for bugle package");
                        ((cfud) buglePhenotypeBroadcastReceiver.b.b()).e();
                    }
                }
            }, this.d);
            f.b(f2);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cnhy
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.syncing_with_device_foreground_notification_text);
    }
}
