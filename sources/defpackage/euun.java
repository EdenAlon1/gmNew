package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euun implements euuo {
    public static final Object a = new Object();
    private static final ThreadFactory g = new euum();
    public final eumr b;
    public final euvi c;
    public final euvb d;
    public final euuw e;
    public final euva f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public euun(eumr eumrVar, euug euugVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        euvi euviVar = new euvi(eumrVar.a(), euugVar);
        euvb euvbVar = new euvb(eumrVar);
        euuw b = euuw.b();
        euva euvaVar = new euva(eumrVar);
        int i = euuu.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = eumrVar;
        this.c = euviVar;
        this.d = euvbVar;
        this.e = b;
        this.f = euvaVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private final synchronized String k() {
        return this.k;
    }

    private final void l(euuv euuvVar) {
        synchronized (this.h) {
            this.m.add(euuvVar);
        }
    }

    private final void m() {
        dfwv.m(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwv.m(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwv.m(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c = c();
        long j = euuw.a;
        dfwv.b(c.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        dfwv.b(euuw.b.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.euuo
    public final dhre a() {
        m();
        String k = k();
        if (k != null) {
            return dhrt.c(k);
        }
        dhri dhriVar = new dhri();
        l(new euus(dhriVar));
        dhrm dhrmVar = dhriVar.a;
        this.i.execute(new Runnable() { // from class: euuk
            @Override // java.lang.Runnable
            public final void run() {
                euun.this.i();
            }
        });
        return dhrmVar;
    }

    final String b() {
        return this.b.e().a;
    }

    final String c() {
        return this.b.e().b;
    }

    final String d() {
        return this.b.e().d;
    }

    public final void e(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((euuv) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(euvd euvdVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((euuv) it.next()).b(euvdVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.k = str;
    }

    public final synchronized void h(euvd euvdVar, euvd euvdVar2) {
        if (this.l.size() != 0 && !((euuz) euvdVar).a.equals(((euuz) euvdVar2).a)) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((euux) it.next()).a();
            }
        }
    }

    public final void i() {
        euvd a2;
        String str;
        String string;
        synchronized (a) {
            euui b = euui.b(this.b.a());
            try {
                a2 = this.d.a();
                if (a2.k()) {
                    if ((this.b.g().equals("CHIME_ANDROID_SDK") || this.b.k()) && ((euuz) a2).g == 1) {
                        euva euvaVar = this.f;
                        synchronized (euvaVar.b) {
                            synchronized (euvaVar.b) {
                                str = null;
                                string = euvaVar.b.getString("|S|id", null);
                            }
                            if (string == null) {
                                synchronized (euvaVar.b) {
                                    String string2 = euvaVar.b.getString("|S||P|", null);
                                    if (string2 != null) {
                                        PublicKey b2 = euva.b(string2);
                                        if (b2 != null) {
                                            str = euva.a(b2);
                                        }
                                    }
                                }
                                string = str;
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = euuu.a();
                        }
                    } else {
                        string = euuu.a();
                    }
                    euvb euvbVar = this.d;
                    euuy euuyVar = new euuy(a2);
                    euuyVar.a = string;
                    euuyVar.c(3);
                    a2 = euuyVar.a();
                    euvbVar.b(a2);
                }
            } finally {
                if (b != null) {
                    b.a();
                }
            }
        }
        f(a2);
        this.j.execute(new Runnable() { // from class: euuj
            /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x01ae A[Catch: euup -> 0x01af, TRY_ENTER, TRY_LEAVE, TryCatch #0 {euup -> 0x01af, blocks: (B:11:0x001b, B:13:0x0023, B:15:0x0029, B:17:0x0031, B:23:0x0059, B:55:0x006a, B:56:0x0071, B:57:0x0072, B:58:0x0078, B:59:0x009a, B:61:0x009c, B:63:0x00a4, B:65:0x00ac, B:66:0x00b0, B:79:0x00f1, B:83:0x0115, B:84:0x011a, B:85:0x0121, B:86:0x0122, B:87:0x01ae, B:100:0x00ef, B:68:0x00b1, B:70:0x00b6, B:72:0x00ca, B:75:0x00d0, B:89:0x00d8, B:77:0x00e5, B:93:0x00e8, B:96:0x00eb), top: B:10:0x001b, inners: #6 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 446
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.euuj.run():void");
            }
        });
    }

    @Override // defpackage.euuo
    public final dhre j() {
        m();
        dhri dhriVar = new dhri();
        l(new euur(this.e, dhriVar));
        dhrm dhrmVar = dhriVar.a;
        this.i.execute(new Runnable() { // from class: euul
            @Override // java.lang.Runnable
            public final void run() {
                euun.this.i();
            }
        });
        return dhrmVar;
    }
}
