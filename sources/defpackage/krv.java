package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krv {
    public static Typeface a(Context context, List list, int i, boolean z, int i2, Handler handler, kru kruVar) {
        kre kreVar = new kre(kruVar, new kry(handler));
        if (z) {
            if (list.size() > 1) {
                throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
            }
            krj krjVar = (krj) list.get(0);
            ExecutorService executorService = krq.b;
            String b = krq.b(krk.a(new Object[]{krjVar}), i);
            Typeface typeface = (Typeface) krq.a.c(b);
            if (typeface != null) {
                kreVar.a(new krp(typeface));
                return typeface;
            }
            if (i2 == -1) {
                krp a = krq.a(b, context, krk.a(new Object[]{krjVar}), i);
                kreVar.a(a);
                return a.a;
            }
            try {
                krp krpVar = (krp) ksb.a(krq.b, new krl(b, context, krjVar, i), i2);
                kreVar.a(krpVar);
                return krpVar.a;
            } catch (InterruptedException unused) {
                kreVar.a(new krp(-3));
                return null;
            }
        }
        String b2 = krq.b(list, i);
        Typeface typeface2 = (Typeface) krq.a.c(b2);
        if (typeface2 != null) {
            kreVar.a(new krp(typeface2));
            return typeface2;
        }
        krm krmVar = new krm(kreVar);
        synchronized (krq.c) {
            ArrayList arrayList = (ArrayList) krq.d.get(b2);
            if (arrayList != null) {
                arrayList.add(krmVar);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(krmVar);
            krq.d.put(b2, arrayList2);
            krn krnVar = new krn(b2, context, list, i);
            krq.b.execute(new ksa(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), krnVar, new kro(b2)));
            return null;
        }
    }

    public static Typeface b(Context context, krt[] krtVarArr) {
        return kpz.c(context, krtVarArr, 0);
    }

    public static krs c(Context context, krj krjVar) {
        return kri.a(context, krr.a(new Object[]{krjVar}));
    }
}
