package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekod {
    public static final enru a = enru.c("com/google/apps/tiktok/nav/gateway/GatewayMixin");
    private static final String h = "$GA$" + System.currentTimeMillis();
    public final ejlq b;
    public final eknz c;
    public final boolean d;
    public int f;
    public int g;
    private final Activity i;
    private final ekoc j = new ekoc(this);
    public final ejlr e = new ejlr<Void, eknx>() { // from class: ekod.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            ekod.this.b((eknx) obj2);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            ensk i = ekod.a.i();
            i.Y(ente.a, "GatewayActivityPeer");
            ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin$2", "onFailure", 'd', "GatewayMixin.java")).q("Couldn't get redirect intent.");
            ekod.this.b(eknx.a(null));
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
    
        if (r7.getBoolean("com.google.apps.tiktok.nav.gateway.skip_intent_filter_validation") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008d, code lost:
    
        if (r14.getAction() == null) goto L33;
     */
    /* JADX WARN: Type inference failed for: r12v14, types: [ffbr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ekod(android.app.Activity r11, java.util.Map r12, defpackage.emxc r13, defpackage.ejlq r14) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekod.<init>(android.app.Activity, java.util.Map, emxc, ejlq):void");
    }

    private static void d(Intent intent) {
        emxf.m((intent.getFlags() & 195) == 0, "Redirects to external apps must not grant Uri access.");
    }

    private static void e(Intent intent) {
        emxf.m(!intent.hasExtra(h), "GatewayHandlers must not blindly forward all intent extras.");
    }

    private static void f(Intent intent) {
        String str = h;
        intent.putExtra(str, str);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj instanceof Intent) {
                        f((Intent) obj);
                    }
                } catch (Throwable th) {
                    ensk i = a.i();
                    i.Y(ente.a, "GatewayActivityPeer");
                    ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "taintExtras", (char) 446, "GatewayMixin.java")).q("Failed to read extra from Intent. Removing it.");
                    arrayList.add(str2);
                }
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                intent.removeExtra((String) arrayList.get(i2));
            }
        }
    }

    public final void a() {
        int i = this.f;
        if (i != 0) {
            this.i.setTheme(i);
        }
        int i2 = this.g;
        if (i2 != 0) {
            this.i.setContentView(i2);
        }
    }

    public final void b(eknx eknxVar) {
        int i = eknxVar.a;
        Intent intent = null;
        if (i == 1) {
            List<Intent> list = eknxVar.b;
            emxf.l(!list.isEmpty());
            String packageName = this.i.getPackageName();
            for (Intent intent2 : list) {
                e(intent2);
                intent2.setPackage(packageName);
                if (intent2.getData() != null && intent2.getType() == null && "content".equals(intent2.getData().getScheme())) {
                    ensk i2 = a.i();
                    i2.Y(ente.a, "GatewayActivityPeer");
                    ((enrr) ((enrr) i2).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 229, "GatewayMixin.java")).q("Intent with [data] was missing [type]. Both must be set.");
                }
            }
            Intent intent3 = (Intent) list.get(list.size() - 1);
            if (list.size() == 1) {
                intent3.addFlags(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
            } else if (list.size() > 1) {
                emxf.b((((Intent) list.get(0)).getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) != 0, "Adding multiple activities requires using a new task.");
            }
            if (!eknxVar.c) {
                intent3.addFlags(65536);
            }
            try {
                Activity activity = this.i;
                Intent[] intentArr = (Intent[]) list.toArray(new Intent[0]);
                long j = eldl.a;
                activity.getClass();
                intentArr.getClass();
                int length = intentArr.length;
                if (length != 0) {
                    int i3 = length - 1;
                    Intent intent4 = new Intent(intentArr[i3]);
                    intentArr[i3] = intent4;
                    elcz u = eldl.u(intent4);
                    try {
                        activity.startActivities(intentArr);
                        ffig.a(u, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ffig.a(u, th);
                            throw th2;
                        }
                    }
                }
            } catch (ActivityNotFoundException | SecurityException e) {
                ensk i4 = a.i();
                i4.Y(ente.a, "GatewayActivityPeer");
                ((enrr) ((enrr) ((enrr) i4).g(e)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", (char) 253, "GatewayMixin.java")).q("Missing internal activity.");
            }
            this.i.finish();
            return;
        }
        if (i == 2) {
            Intent intent5 = (Intent) enjk.l(eknxVar.b);
            e(intent5);
            d(intent5);
            try {
                eldl.p(this.i, intent5);
            } catch (ActivityNotFoundException | SecurityException e2) {
                ensk i5 = a.i();
                i5.Y(ente.a, "GatewayActivityPeer");
                ((enrr) ((enrr) ((enrr) i5).g(e2)).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 264, "GatewayMixin.java")).t("Missing external activity for %s.", intent5);
            }
            this.i.finish();
            return;
        }
        if (i != 3) {
            if (i != 4) {
                if (i == 5) {
                    ensk g = a.g();
                    g.Y(ente.a, "GatewayActivityPeer");
                    ((enrr) ((enrr) g).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 315, "GatewayMixin.java")).q("Not redirecting");
                    this.i.finish();
                    return;
                }
                return;
            }
            if (eknxVar.b.isEmpty()) {
                Integer num = eknxVar.d;
                if (num != null) {
                    this.i.setResult(num.intValue());
                }
            } else {
                Intent intent6 = (Intent) enjk.l(eknxVar.b);
                d(intent6);
                e(intent6);
                this.i.setResult(eknxVar.d.intValue(), intent6);
            }
            this.i.finish();
            return;
        }
        Intent intent7 = this.i.getIntent();
        if (intent7.getPackage() != null) {
            this.i.finish();
        }
        Uri data = intent7.getData();
        if (data == null || !("https".equals(data.getScheme()) || "http".equals(data.getScheme()))) {
            ensk i6 = a.i();
            i6.Y(ente.a, "GatewayActivityPeer");
            ((enrr) ((enrr) i6).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 282, "GatewayMixin.java")).q("Can't redirect non-http(s) intent to browser.");
            this.i.finish();
            return;
        }
        Activity activity2 = this.i;
        Intent intent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
        intent8.addCategory("android.intent.category.BROWSABLE");
        String packageName2 = activity2.getPackageName();
        Iterator<ResolveInfo> it = activity2.getPackageManager().queryIntentActivities(intent8, 65536).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!packageName2.equals(activityInfo.packageName)) {
                intent = new Intent("android.intent.action.VIEW", data);
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                break;
            }
        }
        if (intent != null) {
            intent.addFlags(524288);
            eldl.p(this.i, intent);
        } else {
            ensk h2 = a.h();
            h2.Y(ente.a, "GatewayActivityPeer");
            ((enrr) ((enrr) h2).h("com/google/apps/tiktok/nav/gateway/GatewayMixin", "handleDestination", 292, "GatewayMixin.java")).q("No browser is installed on the device.");
        }
        this.i.finish();
    }

    public final void c() {
        ListenableFuture c = this.c.c();
        if (!c.isDone()) {
            this.c.d();
            this.f = 0;
            this.c.b();
            this.g = 0;
            a();
        }
        this.b.l(new ejlp(c), new ejlm(null), this.e);
    }
}
