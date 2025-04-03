package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IInterface;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehxc<E> {
    public static final cfva a = cfvl.q(160342172);
    public static final cfva b = cfvl.q(184728843);
    private static final cfva h = cfvl.q(181200999);
    public final Class c;
    public final Object d = new Object();
    public final Context e;
    public Object f;
    public ffbr g;
    private final ehxi i;
    private final int j;
    private final ehxd k;
    private final dktn l;
    private ServiceConnection m;
    private final ServiceConnection n;

    /* compiled from: PG */
    public interface a {
        ehxf ef();

        ffbr gv();
    }

    public ehxc(Class<E> cls, Context context, ehxi ehxiVar, int i, Optional<ehxd> optional) {
        ehxb ehxbVar = new ehxb(this);
        this.n = ehxbVar;
        csix.l(context);
        this.c = cls;
        this.e = context;
        this.i = ehxiVar;
        this.j = i;
        this.k = optional.orElse(new ehww());
        this.l = new dktn(String.format("JibeServiceBase<%s>", cls.getSimpleName()));
        try {
            a aVar = (a) ekhw.a(context, a.class);
            elbx elbxVar = (elbx) aVar.ef().a.b();
            elbxVar.getClass();
            cls.getClass();
            this.m = new ehxe(elbxVar, cls, ehxbVar);
            this.g = aVar.gv();
        } catch (Exception unused) {
            this.m = this.n;
        }
    }

    private final void h() {
        this.f = null;
        try {
            this.e.unbindService(this.m);
        } catch (Exception e) {
            csjy.p("RcsClientLib", e, "Unexpected error when trying to unbind " + this.c.getCanonicalName() + ": " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object a() {
        if (ersy.a("bugle.warn_on_legacy_rcs_service_use", "bugle")) {
            dkty.t(new RuntimeException(), this.l, "Actively accessing legacy Rcs services", new Object[0]);
        }
        if (!((Boolean) h.e()).booleanValue()) {
            return this.f;
        }
        Object obj = this.f;
        if (!isConnected(obj)) {
            throw new ehxj(getClass().getSimpleName());
        }
        dkty.m(this.l, "JibeServiceBase#checkPreconditions(jibeServiceInterface) thread trace", new Object[0]);
        return obj;
    }

    protected void b() {
        if (!isConnected()) {
            throw new ehxj();
        }
        dkty.m(this.l, "JibeServiceBase#checkPreconditions thread trace", new Object[0]);
    }

    public boolean bindToJibeServiceInBugle() {
        Intent b2 = dksh.b(this.c.getName());
        b2.putExtra("expected_version", this.j);
        return this.e.bindService(b2, this.m, 1);
    }

    protected final void c(ehxh ehxhVar) {
        csjy.o("RcsClientLib", "Service failed to connect with reason: %s", ehxhVar);
        synchronized (this.d) {
            h();
        }
        this.i.d(getClass().getName(), ehxhVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean connect() {
        /*
            r9 = this;
            boolean r0 = r9.f()
            java.lang.String r1 = "RcsClientLib"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = "Service is deprecated skipping connection attempt: %s"
            defpackage.csjy.o(r1, r0, r3)
            return r2
        L1c:
            java.lang.Class r0 = r9.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r0 = "Connecting %s"
            defpackage.csjy.j(r1, r0, r4)
            java.lang.String r0 = r9.getRcsServiceClass()
            android.content.Context r4 = r9.e
            boolean r4 = defpackage.dkuy.k(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L3f
            r6 = r3
            goto L40
        L3f:
            r6 = r2
        L40:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]
            r8[r2] = r5
            r8[r3] = r6
            java.lang.String r2 = "shouldUseCarrierServicesJibeService: %b, CarrierServices rcs service found: %b"
            defpackage.csjy.j(r1, r2, r8)
            if (r4 == 0) goto L76
            if (r0 == 0) goto L75
            java.lang.Class r1 = r9.c
            java.lang.String r1 = r1.getName()
            android.content.Intent r0 = defpackage.dksh.a(r0, r1)
            int r1 = r9.j
            java.lang.String r2 = "expected_version"
            r0.putExtra(r2, r1)
            eyrs r1 = r9.getServiceNameLoggingEnum()
            r9.g(r1, r7)
            android.content.Context r1 = r9.e
            android.content.ServiceConnection r2 = r9.m
            boolean r0 = r1.bindService(r0, r2, r3)
            goto Lbe
        L75:
            r0 = 0
        L76:
            boolean r2 = defpackage.dizg.y()
            if (r2 == 0) goto L8d
            if (r0 == 0) goto L8d
            java.lang.Class r2 = r9.c
            java.lang.String r2 = r2.getName()
            android.content.Intent r0 = defpackage.dksh.a(r0, r2)
            android.content.Context r2 = r9.e
            r2.stopService(r0)
        L8d:
            android.content.Context r0 = r9.e
            boolean r0 = defpackage.dkuy.d(r0)
            if (r0 == 0) goto La6
            java.lang.String r0 = "Starting Bugle JibeService."
            defpackage.csjy.c(r1, r0)
            android.content.Context r0 = r9.e
            java.lang.String r1 = "com.google.android.ims.JibeService"
            android.content.Intent r1 = defpackage.dksh.b(r1)
            r0.startService(r1)
            goto Lb3
        La6:
            android.content.Context r0 = r9.e
            boolean r0 = defpackage.dkuy.e(r0)
            if (r0 != 0) goto Lb3
            java.lang.String r0 = "Can't start Bugle JibeService in the background."
            defpackage.csjy.n(r1, r0)
        Lb3:
            eyrs r0 = r9.getServiceNameLoggingEnum()
            r9.g(r0, r7)
            boolean r0 = r9.bindToJibeServiceInBugle()
        Lbe:
            if (r0 != 0) goto Lcf
            ehxi r1 = r9.i
            java.lang.Class r2 = r9.getClass()
            java.lang.String r2 = r2.getName()
            ehxh r3 = defpackage.ehxh.UNKNOWN
            r1.d(r2, r3)
        Lcf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehxc.connect():boolean");
    }

    protected void d(String str) {
        csjy.j("RcsClientLib", "%s connected", str);
        this.i.e(str);
    }

    public void disconnect() {
        csjy.j("RcsClientLib", "Disconnecting %s", getClass().getSimpleName());
        synchronized (this.d) {
            h();
        }
    }

    protected void e(String str) {
        csjy.o("RcsClientLib", "%s disconnected", str);
        this.i.f(str);
    }

    protected boolean f() {
        throw null;
    }

    public final void g(eyrs eyrsVar, int i) {
        this.k.a(eyrsVar, i);
    }

    public String getRcsServiceClass() {
        Intent intent = new Intent("com.google.android.ims.START_RCS_ENGINE");
        intent.setPackage("com.google.android.ims");
        List<ResolveInfo> queryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 128);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            csjy.n("RcsClientLib", "No CS.apk RCS service found. Is RCS running in Bugle?");
            return null;
        }
        if (queryIntentServices.size() == 1) {
            return queryIntentServices.get(0).serviceInfo.name;
        }
        csjy.g("RcsClientLib", "There should be one and only one RCS service. Number of services: %d", Integer.valueOf(queryIntentServices.size()));
        return null;
    }

    public abstract String getRcsServiceMetaDataKey();

    public ServiceConnection getServiceConnection() {
        return this.m;
    }

    public ehxi getServiceListener() {
        return this.i;
    }

    public eyrs getServiceNameLoggingEnum() {
        return eyrs.UNKNOWN_SERVICE;
    }

    public boolean isConnected() {
        synchronized (this.d) {
            Object obj = this.f;
            if (obj == null) {
                return false;
            }
            boolean pingBinder = ((IInterface) obj).asBinder().pingBinder();
            if (!pingBinder) {
                csjy.j("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return pingBinder;
        }
    }

    public boolean isConnected(E e) {
        synchronized (this.d) {
            if (e == null) {
                return false;
            }
            boolean pingBinder = ((IInterface) e).asBinder().pingBinder();
            if (!pingBinder) {
                csjy.o("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return pingBinder;
        }
    }
}
