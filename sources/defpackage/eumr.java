package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.apps.messaging.R;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eumr {
    public static final Object a = new Object();
    public static final Map b = new cmh();
    public final eupz c;
    public final euqj e;
    public final euug f;
    private final Context h;
    private final String i;
    private final eunc j;
    public final AtomicBoolean d = new AtomicBoolean(false);
    private final AtomicBoolean k = new AtomicBoolean();
    public final List g = new CopyOnWriteArrayList();

    protected eumr(final Context context, String str, eunc euncVar) {
        List<String> arrayList;
        new CopyOnWriteArrayList();
        dfwv.n(context);
        this.h = context;
        dfwv.l(str);
        this.i = str;
        this.j = euncVar;
        eund eundVar = euyv.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class.toString() + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new euug() { // from class: eupp
                @Override // defpackage.euug
                public final Object a() {
                    return eupq.a(str3);
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        eurt eurtVar = eurt.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        eupy.b(new FirebaseCommonRegistrar(), arrayList3);
        eupy.b(new ExecutorsRegistrar(), arrayList3);
        eupy.a(eupm.e(context, Context.class, new Class[0]), arrayList4);
        eupy.a(eupm.e(this, eumr.class, new Class[0]), arrayList4);
        eupy.a(eupm.e(euncVar, eunc.class, new Class[0]), arrayList4);
        euyx euyxVar = new euyx();
        if (krb.a(context) && euyv.b.get()) {
            eupy.a(eupm.e(eundVar, eund.class, new Class[0]), arrayList4);
        }
        eupz eupzVar = new eupz(eurtVar, arrayList3, arrayList4, euyxVar);
        this.c = eupzVar;
        Trace.endSection();
        this.e = new euqj(new euug() { // from class: eumn
            @Override // defpackage.euug
            public final Object a() {
                eumr eumrVar = eumr.this;
                eupz eupzVar2 = eumrVar.c;
                String h = eumrVar.h();
                return new euvp(context, h);
            }
        });
        this.f = eupn.a(eupzVar, euta.class);
        eumo eumoVar = new eumo(this);
        i();
        if (this.d.get() && dfsc.a.c()) {
            eumoVar.a(true);
        }
        this.g.add(eumoVar);
        Trace.endSection();
    }

    public static eumr b() {
        eumr eumrVar;
        synchronized (a) {
            eumrVar = (eumr) b.get("[DEFAULT]");
            if (eumrVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + dfyx.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            ((euta) eumrVar.f.a()).c();
        }
        return eumrVar;
    }

    public static eumr c(Context context) {
        synchronized (a) {
            if (b.containsKey("[DEFAULT]")) {
                return b();
            }
            dfwv.n(context);
            Resources resources = context.getResources();
            String resourcePackageName = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
            String a2 = dfxd.a("google_app_id", resources, resourcePackageName);
            eunc euncVar = TextUtils.isEmpty(a2) ? null : new eunc(a2, dfxd.a("google_api_key", resources, resourcePackageName), dfxd.a("firebase_database_url", resources, resourcePackageName), dfxd.a("ga_trackingId", resources, resourcePackageName), dfxd.a("gcm_defaultSenderId", resources, resourcePackageName), dfxd.a("google_storage_bucket", resources, resourcePackageName), dfxd.a("project_id", resources, resourcePackageName));
            if (euncVar != null) {
                return d(context, euncVar, "[DEFAULT]");
            }
            Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
            return null;
        }
    }

    public static eumr d(Context context, eunc euncVar, String str) {
        eumr eumrVar;
        AtomicReference atomicReference = eump.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (eump.a.get() == null) {
                eump eumpVar = new eump();
                AtomicReference atomicReference2 = eump.a;
                while (true) {
                    if (atomicReference2.compareAndSet(null, eumpVar)) {
                        dfsc.b(application);
                        dfsc.a.a(eumpVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (a) {
            Map map = b;
            dfwv.j(!map.containsKey(trim), a.a(trim, "FirebaseApp name ", " already exists!"));
            dfwv.o(context, "Application context cannot be null.");
            eumrVar = new eumr(context, trim, euncVar);
            map.put(trim, eumrVar);
        }
        eumrVar.j();
        return eumrVar;
    }

    public final Context a() {
        i();
        return this.h;
    }

    public final eunc e() {
        i();
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eumr) {
            return this.i.equals(((eumr) obj).g());
        }
        return false;
    }

    public final Object f(Class cls) {
        i();
        return eupn.c(this.c, cls);
    }

    public final String g() {
        i();
        return this.i;
    }

    public final String h() {
        return dfyk.c(g().getBytes(Charset.defaultCharset())) + "+" + dfyk.c(e().b.getBytes(Charset.defaultCharset()));
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final void i() {
        dfwv.j(!this.k.get(), "FirebaseApp was deleted");
    }

    public final void j() {
        HashMap hashMap;
        if (!krb.a(this.h)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ".concat(String.valueOf(g())));
            Context context = this.h;
            if (eumq.a.get() == null) {
                eumq eumqVar = new eumq(context);
                AtomicReference atomicReference = eumq.a;
                while (!atomicReference.compareAndSet(null, eumqVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(eumqVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app ".concat(String.valueOf(g())));
        eupz eupzVar = this.c;
        Boolean valueOf = Boolean.valueOf(k());
        while (true) {
            AtomicReference atomicReference2 = eupzVar.b;
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (eupzVar) {
                    hashMap = new HashMap(eupzVar.a);
                }
                eupzVar.f(hashMap);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((euta) this.f.a()).c();
    }

    public final boolean k() {
        return "[DEFAULT]".equals(g());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("name", this.i, arrayList);
        dfwp.b("options", this.j, arrayList);
        return dfwp.a(arrayList, this);
    }
}
