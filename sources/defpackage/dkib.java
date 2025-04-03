package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkib {
    private static final long c = TimeUnit.SECONDS.toMillis(1);
    private final dipa d;
    public long a = ImsCapabilities.k;
    public long b = ImsCapabilities.k;
    private boolean f = false;
    private final Handler g = f();
    private final LinkedHashMap e = new LinkedHashMap(10, 0.5f, false);

    public dkib(dipa dipaVar) {
        this.d = dipaVar;
    }

    private static synchronized Handler f() {
        Handler handler;
        synchronized (dkib.class) {
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            handler = new Handler(myLooper);
        }
        return handler;
    }

    private final void g() {
        if (!this.f && this.e.size() > 0) {
            this.g.postDelayed(new Runnable() { // from class: dkia
                @Override // java.lang.Runnable
                public final void run() {
                    dkib.this.d();
                }
            }, c);
            this.f = true;
        }
    }

    public final dkht a() {
        return new dkht(this.b);
    }

    final dkht b() {
        return new dkht(this.a);
    }

    public final synchronized Optional c(String str) {
        ImsCapabilities imsCapabilities = (ImsCapabilities) this.e.get(str);
        if (imsCapabilities != null) {
            dkty.o("Found cached capabilities for %s: %s", dktx.PHONE_NUMBER.c(str), imsCapabilities);
            return Optional.of(imsCapabilities);
        }
        ditz f = this.d.f(str);
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(this.a);
        if (f.b == 2) {
            imsCapabilities2.e(true);
            imsCapabilities2.c = f.d;
            imsCapabilities2.g = f.e;
            imsCapabilities2.i(f.a(dity.HTTP_FT));
            imsCapabilities2.s(f.a(dity.STICKERS));
            imsCapabilities2.k(f.a(dity.LOCATION_PUSH));
            imsCapabilities2.o(f.a(dity.IP_VIDEO_CALL_ONLY));
            imsCapabilities2.m(f.a(dity.IP_CALL));
            imsCapabilities2.e = f.c;
            imsCapabilities2.g(f.a(dity.FILE_TRANSFER_VIA_SMS));
            imsCapabilities2.l(f.a(dity.LOCATION_VIA_SMS));
            imsCapabilities2.p(f.a(dity.UP_2_0));
            imsCapabilities2.r(f.a(dity.UP_2_0));
        }
        if (ditz.a.equals(f)) {
            dkty.o("Found no cached capabilities for %s", dktx.PHONE_NUMBER.c(str));
            return Optional.empty();
        }
        dkty.o("Found cached capabilities for %s in database: %s", dktx.PHONE_NUMBER.c(str), imsCapabilities2);
        if (str != null) {
            this.e.put(str, imsCapabilities2);
        }
        return Optional.of(imsCapabilities2);
    }

    final synchronized void d() {
        this.f = false;
        if (this.e.size() == 0) {
            dkty.c("The cache is empty. Nothing to do.", new Object[0]);
            return;
        }
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ImsCapabilities imsCapabilities = (ImsCapabilities) it.next();
            if (!imsCapabilities.O()) {
                dkty.c("Removing item %s", imsCapabilities);
                it.remove();
            }
        }
        g();
    }

    public final synchronized void e(String str, ImsCapabilities imsCapabilities) {
        int i = 1;
        if (TextUtils.isEmpty(str)) {
            dkty.q("Unable to cache capabilities for empty MSISDN: %s", imsCapabilities);
            return;
        }
        dipa dipaVar = this.d;
        if (true == imsCapabilities.y()) {
            i = 2;
        }
        dipaVar.k(str, i, imsCapabilities);
        this.e.remove(str);
        this.e.put(str, imsCapabilities);
        g();
    }
}
