package defpackage;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhj {
    public static final qgp a(hho hhoVar) {
        return (qgp) hhoVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(android.content.Context r13, defpackage.qgw r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhj.b(android.content.Context, qgw, java.lang.String, java.lang.String, java.lang.String, java.lang.String, ffgu):java.lang.Object");
    }

    public static final String c(String str) {
        if (str == null || ffpc.J(str)) {
            return null;
        }
        return (str.length() <= 0 || !ffol.e(str.charAt(ffpc.u(str)), '/', false)) ? str.concat("/") : str;
    }

    public static final qgp d(qgw qgwVar, hfd hfdVar) {
        qgw qgwVar2;
        hfdVar.v(-1248473602);
        hfdVar.v(100458137);
        Object f = hfdVar.f();
        if (f == hfc.a) {
            f = new qhh(null);
            hfdVar.y(f);
        }
        ffjn ffjnVar = (ffjn) f;
        hfdVar.o();
        Context context = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        hfdVar.v(100461544);
        boolean D = hfdVar.D(qgwVar);
        Object f2 = hfdVar.f();
        if (D || f2 == hfc.a) {
            Object hicVar = new hic(new qgp(), hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        hfdVar.o();
        hfdVar.v(100470879);
        boolean D2 = hfdVar.D(qgwVar) | hfdVar.D("__LottieInternalDefaultCacheKey__");
        Object f3 = hfdVar.f();
        if (D2 || f3 == hfc.a) {
            f3 = e(context, qgwVar, "__LottieInternalDefaultCacheKey__", true);
            hfdVar.y(f3);
        }
        hfdVar.o();
        hfdVar.v(100475538);
        boolean D3 = hfdVar.D(hhoVar) | hfdVar.F(ffjnVar) | hfdVar.F(context) | hfdVar.F(qgwVar) | hfdVar.D(null) | hfdVar.D("fonts/") | hfdVar.D(".ttf") | hfdVar.D("__LottieInternalDefaultCacheKey__");
        Object f4 = hfdVar.f();
        if (D3 || f4 == hfc.a) {
            qgwVar2 = qgwVar;
            Object qhiVar = new qhi(ffjnVar, context, qgwVar2, hhoVar, null);
            hfdVar.y(qhiVar);
            f4 = qhiVar;
        } else {
            qgwVar2 = qgwVar;
        }
        hfdVar.o();
        hgs.f(qgwVar2, "__LottieInternalDefaultCacheKey__", (ffjm) f4, hfdVar);
        qgp a = a(hhoVar);
        hfdVar.o();
        return a;
    }

    private static final qdk e(Context context, qgw qgwVar, final String str, boolean z) {
        if (qgwVar instanceof qgu) {
            return ffkj.e(str, "__LottieInternalDefaultCacheKey__") ? qcq.j(context, ((qgu) qgwVar).a) : qcq.k(context, ((qgu) qgwVar).a, str);
        }
        if (qgwVar instanceof qgv) {
            if (ffkj.e(str, "__LottieInternalDefaultCacheKey__")) {
                throw null;
            }
            throw null;
        }
        if (qgwVar instanceof qgs) {
            if (z) {
                return null;
            }
            throw null;
        }
        if (qgwVar instanceof qgq) {
            return ffkj.e(str, "__LottieInternalDefaultCacheKey__") ? qcq.h(context, ((qgq) qgwVar).a) : qcq.i(context, ((qgq) qgwVar).a, str);
        }
        if (qgwVar instanceof qgt) {
            if (ffkj.e(str, "__LottieInternalDefaultCacheKey__")) {
                str = String.valueOf(((qgt) qgwVar).a.hashCode());
            }
            final String str2 = ((qgt) qgwVar).a;
            Map map = qcq.a;
            return qcq.g(str, new Callable() { // from class: qcl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Map map2 = qcq.a;
                    fhnp fhnpVar = new fhnp(fhne.b(new ByteArrayInputStream(str2.getBytes())));
                    String[] strArr = qlk.a;
                    return qcq.d(new qll(fhnpVar), str);
                }
            });
        }
        if (!(qgwVar instanceof qgr)) {
            throw new ffcd();
        }
        context.getContentResolver();
        throw null;
    }
}
