package defpackage;

import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edax<T> implements emyl<T> {
    public static final /* synthetic */ int a = 0;
    private static volatile ecxi b = new ecxi(new ecxj() { // from class: edaw
        @Override // defpackage.ecxj
        public final void a() {
            int i = edax.a;
        }
    });
    private final String c;
    private final String d;
    private Object e;
    private final ecyy f;
    private eczv g;
    private volatile int h;
    private volatile Object i;
    private cpn j;
    private cpn k;
    private cpn l;
    private final boolean m;
    private final boolean n;
    private volatile boolean o;

    public edax(String str, String str2, ecyy ecyyVar, String str3) {
        this.h = -1;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = ecyyVar;
        this.m = true;
        this.o = true;
        this.n = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(final defpackage.ecvo r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edax.b(ecvo):java.lang.Object");
    }

    private final Object c(ecvo ecvoVar) {
        if (Objects.equals("", "")) {
            int i = this.h;
            if (i == -1 || i < this.g.a()) {
                synchronized (this) {
                    int i2 = this.h;
                    if (i2 == -1) {
                        this.g = this.f.c(ecvoVar, this.c);
                    }
                    int a2 = this.g.a();
                    if (i2 < a2) {
                        Object b2 = b(ecvoVar);
                        this.i = b2;
                        this.h = a2;
                        return b2;
                    }
                }
            }
            return this.i;
        }
        synchronized (this) {
            if (this.k == null) {
                emxf.l(this.j == null);
                emxf.l(this.l == null);
                this.k = new cpn();
                this.j = new cpn();
                this.l = new cpn();
            }
            eczv eczvVar = (eczv) this.k.get("");
            if (eczvVar != null && eczvVar.a() <= ((Integer) this.l.getOrDefault("", -1)).intValue()) {
                Object obj = this.j.get("");
                obj.getClass();
                return obj;
            }
            eczv c = this.f.c(ecvoVar, this.c);
            eczv eczvVar2 = (eczv) this.k.put("", c);
            emxf.m(eczvVar2 == null || eczvVar2 == c, "PackageVersionCache object should not change in the life of the process.");
            this.l.put("", Integer.valueOf(c.a()));
            Object b3 = b(ecvoVar);
            b3.getClass();
            this.j.put("", b3);
            return b3;
        }
    }

    public final Object a(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return c(ecvo.a(applicationContext));
    }

    @Override // defpackage.emyl
    public final T get() {
        Context context = ecvo.a;
        ecvq.b = true;
        if (ecvq.c == null) {
            ecvq.c = new ecvp();
        }
        Context context2 = ecvo.a;
        if (context2 != null) {
            return (T) c(ecvo.a(context2));
        }
        ecvq.a();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public edax(String str, String str2, Object obj, ecyy ecyyVar) {
        this.h = -1;
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.f = ecyyVar;
        this.m = true;
        this.o = false;
        this.n = true;
    }

    public edax(String str, String str2, Object obj, ecyy ecyyVar, boolean z) {
        this.h = -1;
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.f = ecyyVar;
        this.m = z;
        this.o = false;
        this.n = false;
    }
}
