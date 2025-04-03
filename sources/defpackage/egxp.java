package defpackage;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class egxp {
    public static qdk a(final egxq egxqVar, final LottieAnimationView lottieAnimationView, final boolean z, final egxt egxtVar) {
        qdk k = qcq.k(lottieAnimationView.getContext(), egxqVar.a(), null);
        k.e(new qdd() { // from class: egxl
            @Override // defpackage.qdd
            public final void a(Object obj) {
                LottieAnimationView lottieAnimationView2 = LottieAnimationView.this;
                lottieAnimationView2.h((qci) obj);
                egxqVar.e(lottieAnimationView2, z, egxtVar);
            }
        });
        k.getClass();
        return k;
    }

    public static void b(egxq egxqVar, LottieAnimationView lottieAnimationView, boolean z, egxt egxtVar) {
        String str;
        for (faxe faxeVar : egxqVar.c()) {
            if (z) {
                str = faxeVar.c;
                if (str == null) {
                    str = faxeVar.b;
                }
            } else {
                str = faxeVar.b;
            }
            Integer num = (Integer) egxtVar.a.get(str);
            if (num != null) {
                List list = faxeVar.a;
                final int intValue = num.intValue();
                String[] strArr = (String[]) list.toArray(new String[0]);
                qhq qhqVar = new qhq((String[]) Arrays.copyOf(strArr, strArr.length));
                String str2 = faxeVar.d;
                if (ffkj.e(str2, faxf.a.g)) {
                    lottieAnimationView.b(qhqVar, qdg.b, new qmb() { // from class: egxm
                        @Override // defpackage.qmb
                        public final Object a() {
                            return Integer.valueOf(intValue);
                        }
                    });
                } else if (ffkj.e(str2, faxf.b.g)) {
                    lottieAnimationView.b(qhqVar, qdg.a, new qmb() { // from class: egxn
                        @Override // defpackage.qmb
                        public final Object a() {
                            return Integer.valueOf(intValue);
                        }
                    });
                } else if (ffkj.e(str2, faxf.c.g)) {
                    final qdp qdpVar = new qdp(intValue);
                    lottieAnimationView.b(qhqVar, qdg.K, new qmb() { // from class: egxo
                        @Override // defpackage.qmb
                        public final Object a() {
                            return qdp.this;
                        }
                    });
                }
            }
        }
    }

    public static egxt c(egxq egxqVar, Context context) {
        Set d = egxqVar.d();
        if (d.isEmpty()) {
            return egxs.c(context);
        }
        Map a = egxr.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : a.entrySet()) {
            if (d.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        egxt a2 = egxs.a(context, linkedHashMap);
        Map b = egxr.b();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : b.entrySet()) {
            if (d.contains((String) entry2.getKey())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return a2.a(egxs.b(context, linkedHashMap2));
    }

    public static void d(egxq egxqVar, LottieAnimationView lottieAnimationView, egxt egxtVar) {
        lottieAnimationView.getClass();
        egxqVar.b(lottieAnimationView, false, egxtVar);
    }

    public static void e(egxq egxqVar, LottieAnimationView lottieAnimationView, boolean z) {
        lottieAnimationView.getClass();
        Context context = lottieAnimationView.getContext();
        context.getClass();
        egxqVar.b(lottieAnimationView, z, egxqVar.f(context));
    }
}
