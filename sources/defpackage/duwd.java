package defpackage;

import android.os.Parcel;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duwd implements duvz {
    public static final /* synthetic */ int c = 0;
    private static final int d = duwh.values().length;
    public final String a;
    public final Class b;
    private volatile duwf e;
    private final Object[] f;
    private boolean[] g;
    private Map h;

    public duwd(String str, Class cls) {
        this.a = str;
        this.b = cls;
        this.f = (Object[]) Array.newInstance((Class<?>) cls, d);
    }

    private final synchronized duwf j() {
        int i = d;
        while (true) {
            i--;
            if (i < 0) {
                return null;
            }
            Object obj = this.f[i];
            if (obj != null && !m(i)) {
                return new duwf(obj, i);
            }
        }
    }

    private static Object k(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        return eoeg.e.j((byte[]) obj);
    }

    private final void l() {
        if (duzy.a && this.e == null) {
            throw new IllegalStateException("Flag: " + this.a + " is invalid.");
        }
    }

    private final synchronized boolean m(int i) {
        boolean[] zArr = this.g;
        if (zArr != null) {
            if (zArr[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(int i) {
        return i == 3 || i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (n(r1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized boolean o() {
        /*
            r4 = this;
            monitor-enter(r4)
            duwf r0 = r4.e     // Catch: java.lang.Throwable -> L34
            duwf r1 = r4.j()     // Catch: java.lang.Throwable -> L34
            r4.e = r1     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L31
            if (r1 == 0) goto L31
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r3 = r0.a     // Catch: java.lang.Throwable -> L34
            boolean r2 = j$.util.Objects.deepEquals(r3, r2)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L18
            goto L2b
        L18:
            int r0 = r0.b     // Catch: java.lang.Throwable -> L34
            int r1 = r1.b     // Catch: java.lang.Throwable -> L34
            if (r0 != r1) goto L1f
            goto L31
        L1f:
            boolean r0 = n(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L2b
            boolean r0 = n(r1)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L31
        L2b:
            r4.e()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r4)
            r0 = 1
            return r0
        L31:
            monitor-exit(r4)
            r0 = 0
            return r0
        L34:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L34
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duwd.o():boolean");
    }

    @Override // defpackage.duvz
    public final synchronized Object a(duwh duwhVar, boolean z) {
        if (z) {
            if (m(duwhVar.g)) {
                return null;
            }
        }
        return this.f[duwhVar.g];
    }

    @Override // defpackage.duvz
    public final Object b() {
        duwf duwfVar = this.e;
        if (duwfVar != null) {
            return duwfVar.a;
        }
        throw new IllegalStateException("Invalid flag: ".concat(toString()));
    }

    @Override // defpackage.duvz
    public final synchronized void c(duvy duvyVar) {
        f(duvyVar, duoc.b);
    }

    @Override // defpackage.duvz
    public final synchronized void d(duvy duvyVar) {
        l();
        Map map = this.h;
        if (map != null) {
            map.remove(duvyVar);
            if (this.h.isEmpty()) {
                this.h = null;
            }
        }
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    final synchronized void e() {
        Map map = this.h;
        if (map != null) {
            Set entrySet = map.entrySet();
            eniq eniqVar = new eniq();
            Iterator it = entrySet.iterator();
            while (it.hasNext()) {
                eniqVar.i((Map.Entry) it.next());
            }
            enit f = eniqVar.a().f();
            enqu listIterator = f.x().listIterator();
            while (listIterator.hasNext()) {
                Executor executor = (Executor) listIterator.next();
                final enip c2 = f.c(executor);
                executor.execute(new Runnable() { // from class: duwc
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = duwd.c;
                        enqu listIterator2 = enip.this.listIterator();
                        while (listIterator2.hasNext()) {
                            ((duvy) listIterator2.next()).a();
                        }
                    }
                });
            }
        }
    }

    public final synchronized void f(duvy duvyVar, Executor executor) {
        l();
        if (this.h == null) {
            this.h = new WeakHashMap();
        }
        this.h.put(duvyVar, executor);
    }

    final synchronized void g(duwh duwhVar) {
        if (duwhVar == duwh.DEFAULT) {
            throw new IllegalStateException("Ignoring default value is disallowed [" + this.a + "].");
        }
        if (this.g == null) {
            this.g = new boolean[d];
        }
        boolean[] zArr = this.g;
        int i = duwhVar.g;
        zArr[i] = true;
        if (this.f[i] != null && zArr != null) {
            o();
        }
    }

    public final synchronized void h(duwh duwhVar, Object obj) {
        if (duwhVar == duwh.DEFAULT) {
            i(obj);
        } else {
            this.f[duwhVar.g] = obj;
            o();
        }
    }

    final synchronized void i(Object obj) {
        int i = duwh.DEFAULT.g;
        Object[] objArr = this.f;
        Object obj2 = objArr[i];
        if (obj2 != null) {
            if (Objects.deepEquals(obj2, obj)) {
                throw new IllegalStateException("Flag [" + this.a + "] was already created.");
            }
            throw new IllegalStateException("Resetting default value is disallowed [" + this.a + "].");
        }
        objArr[i] = obj;
        o();
    }

    public final synchronized String toString() {
        emwz emwzVar;
        String simpleName = this.b.getSimpleName();
        duwf duwfVar = this.e;
        emwzVar = new emwz(this.a);
        emwzVar.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, simpleName);
        emwzVar.b("finalValue", duwfVar != null ? k(duwfVar.a) : null);
        for (duwh duwhVar : duwh.values()) {
            Object a = a(duwhVar, true);
            if (a != null) {
                emwzVar.b(duwhVar.name(), k(a));
            }
        }
        return emwzVar.toString();
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
