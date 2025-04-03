package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecwj {
    public static final /* synthetic */ int e = 0;
    private static volatile ecwi f = null;
    private static volatile boolean g = false;
    final ecwh b;
    final String c;
    public volatile int d = -1;
    private Object k;
    private volatile Object l;
    private final boolean m;
    private volatile boolean n;
    private static final Object a = new Object();
    private static final AtomicReference h = new AtomicReference();
    private static final ecxi i = new ecxi(new ecxj() { // from class: ecvw
        @Override // defpackage.ecxj
        public final void a() {
            int i2 = ecwj.e;
        }
    });
    private static final AtomicInteger j = new AtomicInteger();

    public ecwj(ecwh ecwhVar, String str, Object obj, boolean z) {
        String str2 = ecwhVar.a;
        if (str2 == null && ecwhVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && ecwhVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = ecwhVar;
        this.c = str;
        this.k = obj;
        this.m = z;
        this.n = false;
    }

    public static void e() {
        j.incrementAndGet();
    }

    public static void f(final Context context) {
        if (f != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (f == null) {
                synchronized (obj) {
                    ecwi ecwiVar = f;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (ecwiVar == null || ((ecup) ecwiVar).a != context) {
                        if (ecwiVar != null) {
                            ecus.b();
                            ecwo.b();
                            ecva.c();
                        }
                        f = new ecup(context, emys.a(new emyl() { // from class: ecvv
                            @Override // defpackage.emyl
                            public final Object get() {
                                int i2 = ecwj.e;
                                return ecvb.a(context);
                            }
                        }));
                        e();
                    }
                }
            }
        }
    }

    private final String h(String str) {
        return str.isEmpty() ? this.c : str.concat(String.valueOf(this.c));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(10:95|(7:97|(1:99)(1:107)|100|(1:102)|104|105|106)|108|109|110|111|(1:113)|104|105|106) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00df, code lost:
    
        if ("com.google.android.gms".equals(r9.packageName) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0169, code lost:
    
        if (defpackage.dubc.e(r6) != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x014e A[Catch: all -> 0x026b, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:20:0x0058, B:22:0x0063, B:24:0x0076, B:27:0x01c3, B:29:0x01cd, B:31:0x01d5, B:33:0x01db, B:34:0x01e1, B:56:0x022a, B:60:0x023a, B:62:0x0240, B:63:0x0232, B:67:0x0247, B:70:0x024a, B:72:0x0250, B:75:0x0258, B:76:0x025d, B:77:0x0261, B:79:0x0087, B:81:0x008f, B:83:0x010b, B:85:0x0111, B:86:0x0138, B:87:0x009c, B:88:0x009e, B:106:0x00fd, B:118:0x014d, B:119:0x014e, B:123:0x016f, B:142:0x0268, B:143:0x0165, B:147:0x0269, B:36:0x01e2, B:38:0x01e6, B:40:0x01ee, B:41:0x01f9, B:42:0x01f4, B:43:0x01fb, B:45:0x01ff, B:47:0x0203, B:50:0x0207, B:53:0x021d, B:54:0x0224, B:55:0x0229, B:125:0x0170, B:127:0x017a, B:132:0x0198, B:133:0x01a3, B:136:0x01bb, B:137:0x01be, B:139:0x01c0, B:129:0x0180, B:131:0x0188, B:134:0x019c, B:90:0x009f, B:92:0x00a7, B:93:0x00b3, B:95:0x00b5, B:97:0x00c1, B:100:0x00d1, B:102:0x00d7, B:104:0x00f2, B:105:0x00fc, B:108:0x00e1, B:110:0x00e5, B:111:0x00eb), top: B:7:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[Catch: all -> 0x026b, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:20:0x0058, B:22:0x0063, B:24:0x0076, B:27:0x01c3, B:29:0x01cd, B:31:0x01d5, B:33:0x01db, B:34:0x01e1, B:56:0x022a, B:60:0x023a, B:62:0x0240, B:63:0x0232, B:67:0x0247, B:70:0x024a, B:72:0x0250, B:75:0x0258, B:76:0x025d, B:77:0x0261, B:79:0x0087, B:81:0x008f, B:83:0x010b, B:85:0x0111, B:86:0x0138, B:87:0x009c, B:88:0x009e, B:106:0x00fd, B:118:0x014d, B:119:0x014e, B:123:0x016f, B:142:0x0268, B:143:0x0165, B:147:0x0269, B:36:0x01e2, B:38:0x01e6, B:40:0x01ee, B:41:0x01f9, B:42:0x01f4, B:43:0x01fb, B:45:0x01ff, B:47:0x0203, B:50:0x0207, B:53:0x021d, B:54:0x0224, B:55:0x0229, B:125:0x0170, B:127:0x017a, B:132:0x0198, B:133:0x01a3, B:136:0x01bb, B:137:0x01be, B:139:0x01c0, B:129:0x0180, B:131:0x0188, B:134:0x019c, B:90:0x009f, B:92:0x00a7, B:93:0x00b3, B:95:0x00b5, B:97:0x00c1, B:100:0x00d1, B:102:0x00d7, B:104:0x00f2, B:105:0x00fc, B:108:0x00e1, B:110:0x00e5, B:111:0x00eb), top: B:7:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01c3 A[Catch: all -> 0x026b, TRY_ENTER, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:20:0x0058, B:22:0x0063, B:24:0x0076, B:27:0x01c3, B:29:0x01cd, B:31:0x01d5, B:33:0x01db, B:34:0x01e1, B:56:0x022a, B:60:0x023a, B:62:0x0240, B:63:0x0232, B:67:0x0247, B:70:0x024a, B:72:0x0250, B:75:0x0258, B:76:0x025d, B:77:0x0261, B:79:0x0087, B:81:0x008f, B:83:0x010b, B:85:0x0111, B:86:0x0138, B:87:0x009c, B:88:0x009e, B:106:0x00fd, B:118:0x014d, B:119:0x014e, B:123:0x016f, B:142:0x0268, B:143:0x0165, B:147:0x0269, B:36:0x01e2, B:38:0x01e6, B:40:0x01ee, B:41:0x01f9, B:42:0x01f4, B:43:0x01fb, B:45:0x01ff, B:47:0x0203, B:50:0x0207, B:53:0x021d, B:54:0x0224, B:55:0x0229, B:125:0x0170, B:127:0x017a, B:132:0x0198, B:133:0x01a3, B:136:0x01bb, B:137:0x01be, B:139:0x01c0, B:129:0x0180, B:131:0x0188, B:134:0x019c, B:90:0x009f, B:92:0x00a7, B:93:0x00b3, B:95:0x00b5, B:97:0x00c1, B:100:0x00d1, B:102:0x00d7, B:104:0x00f2, B:105:0x00fc, B:108:0x00e1, B:110:0x00e5, B:111:0x00eb), top: B:7:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d5 A[Catch: all -> 0x026b, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:20:0x0058, B:22:0x0063, B:24:0x0076, B:27:0x01c3, B:29:0x01cd, B:31:0x01d5, B:33:0x01db, B:34:0x01e1, B:56:0x022a, B:60:0x023a, B:62:0x0240, B:63:0x0232, B:67:0x0247, B:70:0x024a, B:72:0x0250, B:75:0x0258, B:76:0x025d, B:77:0x0261, B:79:0x0087, B:81:0x008f, B:83:0x010b, B:85:0x0111, B:86:0x0138, B:87:0x009c, B:88:0x009e, B:106:0x00fd, B:118:0x014d, B:119:0x014e, B:123:0x016f, B:142:0x0268, B:143:0x0165, B:147:0x0269, B:36:0x01e2, B:38:0x01e6, B:40:0x01ee, B:41:0x01f9, B:42:0x01f4, B:43:0x01fb, B:45:0x01ff, B:47:0x0203, B:50:0x0207, B:53:0x021d, B:54:0x0224, B:55:0x0229, B:125:0x0170, B:127:0x017a, B:132:0x0198, B:133:0x01a3, B:136:0x01bb, B:137:0x01be, B:139:0x01c0, B:129:0x0180, B:131:0x0188, B:134:0x019c, B:90:0x009f, B:92:0x00a7, B:93:0x00b3, B:95:0x00b5, B:97:0x00c1, B:100:0x00d1, B:102:0x00d7, B:104:0x00f2, B:105:0x00fc, B:108:0x00e1, B:110:0x00e5, B:111:0x00eb), top: B:7:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecwj.b():java.lang.Object");
    }

    public final Object c() {
        if (this.n) {
            synchronized (this) {
                if (this.n) {
                    Object a2 = a(this.k);
                    a2.getClass();
                    this.k = a2;
                    this.n = false;
                }
            }
        }
        return this.k;
    }

    public final String d() {
        return h(this.b.d);
    }

    public final void g(Object obj) {
        this.l = obj;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        AtomicReference atomicReference = h;
        if (atomicReference.get() == null) {
            ArrayList arrayList = new ArrayList();
            while (!atomicReference.compareAndSet(null, arrayList) && atomicReference.get() == null) {
            }
        }
        Collection collection = (Collection) h.get();
        collection.getClass();
        collection.add(this);
    }

    public ecwj(ecwh ecwhVar, String str, String str2) {
        String str3 = ecwhVar.a;
        if (str3 == null && ecwhVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str3 != null && ecwhVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = ecwhVar;
        this.c = str;
        this.k = str2;
        this.m = true;
        this.n = true;
    }
}
