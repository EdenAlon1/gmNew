package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkrd extends Thread implements eehs {
    public static final /* synthetic */ int e = 0;
    protected final dkgw d;
    private final ffbr g;
    private engw h;
    private Optional i;
    private String j;
    private final BlockingQueue k;
    private final dkur l;
    private final Object m;
    private final diod n;
    private final ffbr o;
    private volatile int p;
    static final diyy a = diyv.b("accept_messages_to_self_number");
    static final diyy b = diyv.b("validate_called_party_number");
    static final diyy c = diyv.b("log_recipient_verify_method");
    private static final dktn f = new dktn("ImsServiceDispatcher");

    public dkrd(dkgw dkgwVar, ffbr ffbrVar, dkur dkurVar, diod diodVar, final esfv esfvVar) {
        super("SipDispatcher");
        int i = engw.d;
        this.h = enou.a;
        this.i = Optional.empty();
        this.k = new LinkedBlockingQueue();
        this.m = new Object();
        this.p = 1;
        this.d = dkgwVar;
        this.g = ffbrVar;
        this.l = dkurVar;
        this.n = diodVar;
        ffbr ffbrVar2 = new ffbr() { // from class: dkrb
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return esfv.this.a();
            }
        };
        this.o = ffbrVar2;
        ffbrVar2.b();
        dkty.d(f, "SIP dispatcher is instantiated", new Object[0]);
    }

    public static Optional c(eenk eenkVar) {
        String j = eenkVar.j("P-Called-Party-ID");
        if (j == null) {
            return Optional.empty();
        }
        try {
            eehk eehkVar = dkut.a;
            return Optional.of(eehk.b(j).b.c());
        } catch (eeje unused) {
            return Optional.empty();
        }
    }

    private static String j(eenk eenkVar) {
        eell eellVar = eenkVar.y().f;
        if (eellVar != null) {
            eeit eeitVar = eellVar.a.b;
            if (eeitVar.l()) {
                return (String) Optional.ofNullable(((eeiq) eeitVar).a.b()).orElse("");
            }
            if (eeitVar instanceof eeir) {
                return ((eeir) eeitVar).b();
            }
        }
        return "";
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [esfl, java.lang.Object] */
    private final boolean k(String str, String str2, String str3) {
        if (TextUtils.equals(str, str2)) {
            dkty.d(f, "matches with username in configuration.", new Object[0]);
            return true;
        }
        if (((Boolean) a.a()).booleanValue() && TextUtils.equals(str, str3)) {
            dkty.d(f, "matches with self number.", new Object[0]);
            return true;
        }
        try {
            String str4 = "+" + String.valueOf(this.o.b().n(str2, null).a());
            if (!str.startsWith(str4)) {
                return false;
            }
            String substring = str2.substring(str4.length());
            String substring2 = str.substring(str4.length());
            return substring.length() > substring2.length() ? substring.endsWith(substring2) : substring2.endsWith(substring);
        } catch (esfg e2) {
            dkty.j(e2, f, "%s", e2.getMessage());
            return false;
        }
    }

    private final boolean l(eenk eenkVar) {
        if (!j(eenkVar).startsWith("anonymous")) {
            return false;
        }
        if (this.d.d(eenkVar.d()).isPresent()) {
            return true;
        }
        return this.d.c(eenkVar.d()).isPresent();
    }

    protected abstract void a(eenk eenkVar);

    protected abstract void b(eenk eenkVar);

    @Override // defpackage.eehs
    public final void d() {
        if (isAlive()) {
            return;
        }
        start();
    }

    @Override // defpackage.eehs
    public final void e(List list, String str) {
        this.h = engw.n(list);
        this.i = Collection.EL.stream(list).map(new Function() { // from class: dkqv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                int i = dkrd.e;
                try {
                    eehk eehkVar = dkut.a;
                    return eehk.b(str2).b;
                } catch (eeje unused) {
                    return null;
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dkqw
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((eeit) obj);
            }
        }).map(new Function() { // from class: dkqx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eeit eeitVar = (eeit) obj;
                eehk eehkVar = dkut.a;
                if (eeitVar instanceof eeiq) {
                    return ((eeiq) eeitVar).e();
                }
                if (eeitVar instanceof eeir) {
                    return ((eeir) eeitVar).b();
                }
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: dkqy
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                String str2 = (String) obj;
                int i = dkrd.e;
                return str2 != null && str2.startsWith("+");
            }
        }).findFirst();
        this.j = str;
        dkty.d(f, "selfNumber:%s", dktx.PHONE_NUMBER.c(this.i));
    }

    @Override // defpackage.eehs
    public final void f(eenk eenkVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                dkty.r(f, "ImsServiceDispatcher is not running, ignore the sip request", new Object[0]);
                return;
            }
            try {
                this.k.put(eenkVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                dkty.j(e2, f, "error buffering SIP request: %s", e2.getMessage());
            }
        }
    }

    @Override // defpackage.eehs
    public final void g(eenl eenlVar) {
        synchronized (this.m) {
            if (!isAlive()) {
                dkty.r(f, "ImsServiceDispatcher is not running, ignore the sip response", new Object[0]);
                return;
            }
            try {
                this.k.put(eenlVar);
                this.p = 3;
            } catch (InterruptedException e2) {
                dkty.j(e2, f, "error buffering SIP response: %s", e2.getMessage());
            }
        }
    }

    protected final void h(eenk eenkVar) {
        try {
            ((eehz) this.g).a.s(this.l.n(eenkVar));
        } catch (eejg e2) {
            dkty.j(e2, f, "sendFinalResponse failed to send %d response", Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED));
        }
    }

    public final void i(eenk eenkVar, int i, int i2) {
        try {
            ((eehz) this.g).a.s(this.l.o(eenkVar, i, i2));
        } catch (eejg e2) {
            dkty.j(e2, f, "sendFinalFailureRespons failed to send %d response", Integer.valueOf(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:235:0x017d, code lost:
    
        if (((java.lang.Boolean) r8.a()).booleanValue() == false) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x033f A[Catch: Exception -> 0x05b7, TryCatch #4 {Exception -> 0x05b7, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00ce, B:52:0x00df, B:54:0x00f9, B:56:0x00ff, B:57:0x01f8, B:59:0x0204, B:61:0x020c, B:63:0x0218, B:65:0x0220, B:66:0x0241, B:68:0x0247, B:70:0x02b4, B:88:0x02a5, B:89:0x050a, B:92:0x0538, B:94:0x0544, B:95:0x0549, B:97:0x0555, B:99:0x055b, B:101:0x0563, B:102:0x0568, B:103:0x0577, B:109:0x0583, B:126:0x0515, B:128:0x051b, B:130:0x0523, B:132:0x052b, B:133:0x0225, B:134:0x02c9, B:136:0x02d9, B:137:0x0304, B:139:0x030a, B:141:0x031c, B:142:0x0321, B:143:0x0336, B:144:0x033f, B:146:0x034f, B:148:0x0361, B:149:0x036a, B:151:0x0376, B:152:0x0391, B:154:0x039d, B:156:0x03ac, B:157:0x03b7, B:160:0x03e5, B:161:0x03e9, B:169:0x03f4, B:174:0x03d6, B:175:0x03f5, B:177:0x0401, B:181:0x0419, B:185:0x0427, B:189:0x0432, B:191:0x043a, B:192:0x043f, B:194:0x044f, B:196:0x0457, B:197:0x045c, B:199:0x046a, B:201:0x046e, B:202:0x0482, B:203:0x04b2, B:205:0x04b8, B:212:0x04c3, B:188:0x04cd, B:217:0x04d6, B:218:0x04e0, B:219:0x04e9, B:221:0x04f5, B:222:0x011e, B:224:0x0124, B:226:0x0141, B:228:0x014a, B:229:0x0151, B:231:0x0162, B:233:0x016b, B:234:0x0173, B:237:0x017f, B:239:0x019d, B:241:0x01a6, B:242:0x01ac, B:244:0x01b2, B:246:0x01bb, B:247:0x01c2, B:159:0x03bd, B:163:0x03ea, B:164:0x03ef, B:72:0x0259, B:73:0x026e, B:75:0x0274, B:77:0x027e, B:79:0x0286, B:81:0x028e, B:82:0x0294, B:84:0x029a, B:207:0x04be), top: B:39:0x007d, inners: #6, #9, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x05e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0204 A[Catch: Exception -> 0x05b7, TryCatch #4 {Exception -> 0x05b7, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00ce, B:52:0x00df, B:54:0x00f9, B:56:0x00ff, B:57:0x01f8, B:59:0x0204, B:61:0x020c, B:63:0x0218, B:65:0x0220, B:66:0x0241, B:68:0x0247, B:70:0x02b4, B:88:0x02a5, B:89:0x050a, B:92:0x0538, B:94:0x0544, B:95:0x0549, B:97:0x0555, B:99:0x055b, B:101:0x0563, B:102:0x0568, B:103:0x0577, B:109:0x0583, B:126:0x0515, B:128:0x051b, B:130:0x0523, B:132:0x052b, B:133:0x0225, B:134:0x02c9, B:136:0x02d9, B:137:0x0304, B:139:0x030a, B:141:0x031c, B:142:0x0321, B:143:0x0336, B:144:0x033f, B:146:0x034f, B:148:0x0361, B:149:0x036a, B:151:0x0376, B:152:0x0391, B:154:0x039d, B:156:0x03ac, B:157:0x03b7, B:160:0x03e5, B:161:0x03e9, B:169:0x03f4, B:174:0x03d6, B:175:0x03f5, B:177:0x0401, B:181:0x0419, B:185:0x0427, B:189:0x0432, B:191:0x043a, B:192:0x043f, B:194:0x044f, B:196:0x0457, B:197:0x045c, B:199:0x046a, B:201:0x046e, B:202:0x0482, B:203:0x04b2, B:205:0x04b8, B:212:0x04c3, B:188:0x04cd, B:217:0x04d6, B:218:0x04e0, B:219:0x04e9, B:221:0x04f5, B:222:0x011e, B:224:0x0124, B:226:0x0141, B:228:0x014a, B:229:0x0151, B:231:0x0162, B:233:0x016b, B:234:0x0173, B:237:0x017f, B:239:0x019d, B:241:0x01a6, B:242:0x01ac, B:244:0x01b2, B:246:0x01bb, B:247:0x01c2, B:159:0x03bd, B:163:0x03ea, B:164:0x03ef, B:72:0x0259, B:73:0x026e, B:75:0x0274, B:77:0x027e, B:79:0x0286, B:81:0x028e, B:82:0x0294, B:84:0x029a, B:207:0x04be), top: B:39:0x007d, inners: #6, #9, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0544 A[Catch: Exception -> 0x05b7, TryCatch #4 {Exception -> 0x05b7, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00ce, B:52:0x00df, B:54:0x00f9, B:56:0x00ff, B:57:0x01f8, B:59:0x0204, B:61:0x020c, B:63:0x0218, B:65:0x0220, B:66:0x0241, B:68:0x0247, B:70:0x02b4, B:88:0x02a5, B:89:0x050a, B:92:0x0538, B:94:0x0544, B:95:0x0549, B:97:0x0555, B:99:0x055b, B:101:0x0563, B:102:0x0568, B:103:0x0577, B:109:0x0583, B:126:0x0515, B:128:0x051b, B:130:0x0523, B:132:0x052b, B:133:0x0225, B:134:0x02c9, B:136:0x02d9, B:137:0x0304, B:139:0x030a, B:141:0x031c, B:142:0x0321, B:143:0x0336, B:144:0x033f, B:146:0x034f, B:148:0x0361, B:149:0x036a, B:151:0x0376, B:152:0x0391, B:154:0x039d, B:156:0x03ac, B:157:0x03b7, B:160:0x03e5, B:161:0x03e9, B:169:0x03f4, B:174:0x03d6, B:175:0x03f5, B:177:0x0401, B:181:0x0419, B:185:0x0427, B:189:0x0432, B:191:0x043a, B:192:0x043f, B:194:0x044f, B:196:0x0457, B:197:0x045c, B:199:0x046a, B:201:0x046e, B:202:0x0482, B:203:0x04b2, B:205:0x04b8, B:212:0x04c3, B:188:0x04cd, B:217:0x04d6, B:218:0x04e0, B:219:0x04e9, B:221:0x04f5, B:222:0x011e, B:224:0x0124, B:226:0x0141, B:228:0x014a, B:229:0x0151, B:231:0x0162, B:233:0x016b, B:234:0x0173, B:237:0x017f, B:239:0x019d, B:241:0x01a6, B:242:0x01ac, B:244:0x01b2, B:246:0x01bb, B:247:0x01c2, B:159:0x03bd, B:163:0x03ea, B:164:0x03ef, B:72:0x0259, B:73:0x026e, B:75:0x0274, B:77:0x027e, B:79:0x0286, B:81:0x028e, B:82:0x0294, B:84:0x029a, B:207:0x04be), top: B:39:0x007d, inners: #6, #9, #13, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0549 A[Catch: Exception -> 0x05b7, TryCatch #4 {Exception -> 0x05b7, blocks: (B:40:0x007d, B:42:0x0092, B:43:0x009a, B:45:0x00ae, B:48:0x00bd, B:50:0x00ce, B:52:0x00df, B:54:0x00f9, B:56:0x00ff, B:57:0x01f8, B:59:0x0204, B:61:0x020c, B:63:0x0218, B:65:0x0220, B:66:0x0241, B:68:0x0247, B:70:0x02b4, B:88:0x02a5, B:89:0x050a, B:92:0x0538, B:94:0x0544, B:95:0x0549, B:97:0x0555, B:99:0x055b, B:101:0x0563, B:102:0x0568, B:103:0x0577, B:109:0x0583, B:126:0x0515, B:128:0x051b, B:130:0x0523, B:132:0x052b, B:133:0x0225, B:134:0x02c9, B:136:0x02d9, B:137:0x0304, B:139:0x030a, B:141:0x031c, B:142:0x0321, B:143:0x0336, B:144:0x033f, B:146:0x034f, B:148:0x0361, B:149:0x036a, B:151:0x0376, B:152:0x0391, B:154:0x039d, B:156:0x03ac, B:157:0x03b7, B:160:0x03e5, B:161:0x03e9, B:169:0x03f4, B:174:0x03d6, B:175:0x03f5, B:177:0x0401, B:181:0x0419, B:185:0x0427, B:189:0x0432, B:191:0x043a, B:192:0x043f, B:194:0x044f, B:196:0x0457, B:197:0x045c, B:199:0x046a, B:201:0x046e, B:202:0x0482, B:203:0x04b2, B:205:0x04b8, B:212:0x04c3, B:188:0x04cd, B:217:0x04d6, B:218:0x04e0, B:219:0x04e9, B:221:0x04f5, B:222:0x011e, B:224:0x0124, B:226:0x0141, B:228:0x014a, B:229:0x0151, B:231:0x0162, B:233:0x016b, B:234:0x0173, B:237:0x017f, B:239:0x019d, B:241:0x01a6, B:242:0x01ac, B:244:0x01b2, B:246:0x01bb, B:247:0x01c2, B:159:0x03bd, B:163:0x03ea, B:164:0x03ef, B:72:0x0259, B:73:0x026e, B:75:0x0274, B:77:0x027e, B:79:0x0286, B:81:0x028e, B:82:0x0294, B:84:0x029a, B:207:0x04be), top: B:39:0x007d, inners: #6, #9, #13, #14 }] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r5v5, types: [eenj] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkrd.run():void");
    }
}
