package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjf {
    private static dyjf a;
    private final Set b = new HashSet();

    private dyjf() {
        dyji.a();
    }

    public static synchronized dyjf c() {
        dyjf dyjfVar;
        synchronized (dyjf.class) {
            if (a == null) {
                a = new dyjf();
            }
            dyjfVar = a;
        }
        return dyjfVar;
    }

    @SafeVarargs
    private static emxc d(Object... objArr) {
        return emxc.j(engw.p(objArr));
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0170. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, java.util.Collection] */
    public final synchronized List a() {
        engr engrVar;
        boolean v;
        boolean z;
        emxc d;
        emxc d2;
        emxc d3;
        int i = 209;
        engw C = engw.C(208, 199, 2003, 204, 2002, 2000, 213, 209, 205, 195, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED), 210, 2001, 196, Integer.valueOf(BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED), 212, 206, 194, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_TIMEOUT), 198, 211, 192, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED), 197, 193, 207);
        engrVar = new engr();
        int i2 = ((enou) C).c;
        int i3 = 0;
        while (i3 < i2) {
            Integer num = (Integer) C.get(i3);
            int intValue = num.intValue();
            if (intValue == 198) {
                v = fdql.a.get().v();
            } else if (intValue != 208) {
                if (intValue != i) {
                    switch (intValue) {
                        case 211:
                            v = fdql.o();
                            break;
                        case 212:
                            v = fdql.n();
                            break;
                        default:
                            switch (intValue) {
                                case 2001:
                                case 2003:
                                    break;
                                case 2002:
                                    v = fdpt.a.get().a();
                                    break;
                                default:
                                    v = true;
                                    break;
                            }
                        case 213:
                            v = false;
                            break;
                    }
                }
                v = false;
            } else {
                if (fdql.a.get().y() && !emxe.c(dyhl.a().b(1))) {
                    v = true;
                }
                v = false;
            }
            int intValue2 = num.intValue();
            if (intValue2 != 211) {
                if (intValue2 != 2001 && intValue2 != 2003) {
                }
                v = false;
            } else {
                v = fdql.o();
            }
            int intValue3 = num.intValue();
            switch (intValue3) {
                case 192:
                    z = false;
                    d = d(new Integer[0]);
                    break;
                case 193:
                    z = false;
                    d = d(new Integer[0]);
                    break;
                case 194:
                    z = false;
                    d = d(new Integer[0]);
                    break;
                case 195:
                    d = d(1);
                    z = false;
                    break;
                case 196:
                    d2 = d(2);
                    d = d2;
                    z = false;
                    break;
                case 197:
                    d2 = d(new Integer[0]);
                    d = d2;
                    z = false;
                    break;
                case 198:
                    d2 = d(2);
                    d = d2;
                    z = false;
                    break;
                case 199:
                    d2 = d(new Integer[0]);
                    d = d2;
                    z = false;
                    break;
                case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                    d2 = d(1);
                    d = d2;
                    z = false;
                    break;
                case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                    d2 = d(new Integer[0]);
                    d = d2;
                    z = false;
                    break;
                case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                    d2 = d(2);
                    d = d2;
                    z = false;
                    break;
                case 204:
                    d2 = d(new Integer[0]);
                    d = d2;
                    z = false;
                    break;
                case 205:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 206:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 207:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 208:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 209:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 210:
                    z = false;
                    d3 = d(new Integer[0]);
                    d = d3;
                    break;
                case 211:
                    d2 = d(2);
                    d = d2;
                    z = false;
                    break;
                case 212:
                    d2 = d(2);
                    d = d2;
                    z = false;
                    break;
                case 213:
                    d2 = d(new Integer[0]);
                    d = d2;
                    z = false;
                    break;
                default:
                    switch (intValue3) {
                        case 2000:
                            z = false;
                            d3 = d(new Integer[0]);
                            d = d3;
                            break;
                        case 2001:
                            z = false;
                            d3 = d(new Integer[0]);
                            d = d3;
                            break;
                        case 2002:
                            z = false;
                            d3 = d(new Integer[0]);
                            d = d3;
                            break;
                        case 2003:
                            z = false;
                            d3 = d(new Integer[0]);
                            d = d3;
                            break;
                        default:
                            d2 = emux.a;
                            d = d2;
                            z = false;
                            break;
                    }
                    break;
            }
            boolean containsAll = d.g() ? this.b.containsAll(d.c()) : z;
            if (v && containsAll) {
                engrVar.h(num);
            }
            i3++;
            i = 209;
        }
        return engrVar.g();
    }

    public final synchronized void b(engw engwVar) {
        this.b.addAll(engwVar);
    }
}
