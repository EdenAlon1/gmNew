package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxs {
    public static final egxt a(Context context, Map map) {
        List ak = ffdx.ak(map.entrySet());
        ArrayList arrayList = new ArrayList(ffdx.n(ak, 10));
        Iterator it = ak.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        int[] ax = ffdx.ax(arrayList);
        fflb fflbVar = new fflb();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ax);
        try {
            ArrayList arrayList2 = new ArrayList(ffdx.n(ak, 10));
            int i = 0;
            for (Object obj : ak) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                arrayList2.add(new ffcf((String) ((Map.Entry) obj).getKey(), Integer.valueOf(obtainStyledAttributes.getColor(i, -16777216))));
                i = i2;
            }
            fflbVar.a = ffew.k(arrayList2);
            obtainStyledAttributes.recycle();
            return new egxt((Map) fflbVar.a);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static final egxt b(Context context, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), Integer.valueOf(((dwej) entry.getValue()).a(context)));
        }
        return new egxt(linkedHashMap);
    }

    public static final egxt c(Context context) {
        context.getClass();
        return a(context, egxr.a()).a(b(context, egxr.b()));
    }
}
