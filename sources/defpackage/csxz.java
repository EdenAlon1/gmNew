package defpackage;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxz extends csxu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl");
    public final Object b = new Object();
    public volatile boolean c;
    public final Context d;
    public final errl e;
    public final List f;
    private final BroadcastReceiver g;

    public csxz(Context context, errl errlVar, errl errlVar2) {
        csxy csxyVar = new csxy(this);
        this.g = csxyVar;
        this.f = new ArrayList();
        this.d = context;
        this.e = errlVar2;
        axnw.h(errlVar.submit(eldl.l(new Runnable() { // from class: csxx
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr;
                ekzz f = eleg.f("BugleGservicesImpl#initializeGservices");
                final csxz csxzVar = csxz.this;
                try {
                    Context context2 = csxzVar.d;
                    context2.getClass();
                    ContentResolver contentResolver = context2.getContentResolver();
                    String[] strArr2 = {"bugle_"};
                    digw digwVar = digu.a;
                    synchronized (digwVar) {
                        ((dihe) digwVar).c(contentResolver);
                        if (((dihe) digwVar).h.length == 0) {
                            ((dihe) digwVar).h = new String[1];
                            System.arraycopy(strArr2, 0, ((dihe) digwVar).h, 0, 1);
                            strArr = ((dihe) digwVar).h;
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Collections.addAll(linkedHashSet, ((dihe) digwVar).h);
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            String str = strArr2[0];
                            if (linkedHashSet.add(str)) {
                                linkedHashSet2.add(str);
                            }
                            if (linkedHashSet2.isEmpty()) {
                                strArr = new String[0];
                            } else {
                                ArrayList arrayList = new ArrayList(linkedHashSet);
                                Collections.sort(arrayList);
                                HashMap hashMap = new HashMap();
                                int size = arrayList.size();
                                String str2 = null;
                                for (int i = 0; i < size; i++) {
                                    String str3 = (String) arrayList.get(i);
                                    if (str2 == null || !str3.startsWith(str2)) {
                                        str2 = str3;
                                    } else {
                                        hashMap.put(str3, str2);
                                        linkedHashSet2.remove(str3);
                                    }
                                }
                                if (linkedHashSet2.isEmpty()) {
                                    strArr = new String[0];
                                } else {
                                    if (!hashMap.isEmpty()) {
                                        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                        Iterator it = linkedHashSet.iterator();
                                        while (it.hasNext()) {
                                            String str4 = (String) it.next();
                                            String str5 = (String) hashMap.get(str4);
                                            if (str5 != null) {
                                                linkedHashSet3.add(str5);
                                            } else {
                                                linkedHashSet3.add(str4);
                                            }
                                        }
                                        linkedHashSet = linkedHashSet3;
                                    }
                                    ((dihe) digwVar).h = (String[]) linkedHashSet.toArray(new String[0]);
                                    strArr = (String[]) linkedHashSet2.toArray(new String[0]);
                                }
                            }
                        }
                        if (!((dihe) digwVar).g) {
                            ((dihe) digwVar).b(contentResolver, ((dihe) digwVar).h);
                        } else if (strArr.length != 0) {
                            ((dihe) digwVar).g = false;
                            ((dihe) digwVar).b(contentResolver, strArr);
                        }
                    }
                    synchronized (csxzVar.b) {
                        csxzVar.c = true;
                        csxzVar.b.notifyAll();
                    }
                    f.close();
                    ensk e = csxz.a.e();
                    e.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "<init>", 83, "BugleGservicesImpl.java")).t("GServicesValues:\n%s", new enrw() { // from class: csxw
                        @Override // defpackage.enrw
                        public final Object a() {
                            return csxz.this.j();
                        }
                    });
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        })));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.gservices.intent.action.GSERVICES_CHANGED");
        koa.g(context, csxyVar, intentFilter);
    }

    private final Map k() {
        l("bugle_");
        Context context = this.d;
        context.getClass();
        return digu.d(context.getContentResolver(), "bugle_");
    }

    private final void l(String str) {
        ekzz f = eleg.f("BugleGservicesImpl#assertKeyAndWaitForGservices");
        try {
            boolean z = true;
            if (!str.startsWith("bugle_") && !str.equals("android_id") && !str.equals("device_country")) {
                z = false;
            }
            emxf.a(z);
            while (true) {
                if (this.c) {
                    break;
                }
                synchronized (this.b) {
                    if (this.c) {
                        break;
                    }
                    try {
                        this.b.wait(60000L);
                    } catch (InterruptedException e) {
                        ensk i = a.i();
                        i.Y(ente.a, "Bugle");
                        ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/gservices/BugleGservicesImpl", "assertKeyAndWaitForGservices", (char) 190, "BugleGservicesImpl.java")).q("Waited too long for gservices");
                    }
                }
            }
            f.close();
        } finally {
        }
    }

    @Override // defpackage.csxu
    public final float a(String str, float f) {
        Object obj;
        Float f2;
        l(str);
        if (csya.c(str)) {
            if (csya.c == null) {
                return 0.0f;
            }
            return csya.c.getFloat(str);
        }
        ContentResolver contentResolver = this.d.getContentResolver();
        digw digwVar = digu.a;
        dihe.e(contentResolver);
        synchronized (digwVar) {
            ((dihe) digwVar).c(contentResolver);
            obj = ((dihe) digwVar).f;
            f2 = (Float) dihe.f(((dihe) digwVar).e, str, Float.valueOf(f));
        }
        if (f2 != null) {
            return f2.floatValue();
        }
        String a2 = ((dihe) digwVar).a(contentResolver, str, null);
        if (a2 != null) {
            try {
                float parseFloat = Float.parseFloat(a2);
                f2 = Float.valueOf(parseFloat);
                f = parseFloat;
            } catch (NumberFormatException unused) {
            }
        }
        synchronized (digwVar) {
            ((dihe) digwVar).d(obj, ((dihe) digwVar).e, str, f2);
        }
        return f;
    }

    @Override // defpackage.csxu
    public final int b(String str, int i) {
        l(str);
        if (!csya.c(str)) {
            return digu.a(this.d.getContentResolver(), str, i);
        }
        if (csya.c == null) {
            return 0;
        }
        return csya.c.getInt(str);
    }

    @Override // defpackage.csxu
    public final long c(String str, long j) {
        l(str);
        if (!csya.c(str)) {
            return digu.b(this.d.getContentResolver(), str, j);
        }
        if (csya.c == null) {
            return 0L;
        }
        return csya.c.getLong(str);
    }

    @Override // defpackage.csxu
    public final String d() {
        return j();
    }

    @Override // defpackage.csxu
    public final String e(String str, String str2) {
        l(str);
        return csya.c(str) ? csya.c == null ? "" : emxe.b(csya.c.getString(str)) : digu.c(this.d.getContentResolver(), str, str2);
    }

    @Override // defpackage.csxu
    public final Map f() {
        return k();
    }

    @Override // defpackage.csxu
    public final void g(Runnable runnable) {
        synchronized (this.f) {
            this.f.add(runnable);
        }
    }

    @Override // defpackage.csxu
    public final void h() {
        this.d.sendBroadcast(new Intent("android.server.checkin.CHECKIN"));
    }

    @Override // defpackage.csxu
    public final boolean i(String str, boolean z) {
        l(str);
        if (!csya.c(str)) {
            return digu.e(this.d.getContentResolver(), str, z);
        }
        if (csya.c == null) {
            return false;
        }
        return csya.c.getBoolean(str);
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        Map k = k();
        if (k.isEmpty()) {
            sb.append("No bugle gservices keys/values");
        } else {
            for (String str : k.keySet()) {
                sb.append(String.format("%s: %s\n", str, (String) k.get(str)));
            }
        }
        return sb.toString();
    }
}
