package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qxu implements qxp {
    public static final Bitmap.Config[] a;
    public static final Bitmap.Config[] b;
    public static final Bitmap.Config[] c;
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public final qxt f = new qxt();
    public final qxj g = new qxj();
    private final Map h = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        int length = configArr.length - 1;
        config = Bitmap.Config.RGBA_F16;
        configArr[length] = config;
        a = configArr;
        b = configArr;
        c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + String.valueOf(config) + ")";
    }

    @Override // defpackage.qxp
    public final String a(Bitmap bitmap) {
        return c(rkh.a(bitmap), bitmap.getConfig());
    }

    @Override // defpackage.qxp
    public final String b(int i, int i2, Bitmap.Config config) {
        return c(rkh.b(i, i2, config), config);
    }

    public final NavigableMap d(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.h.put(config, treeMap);
        return treeMap;
    }

    public final void e(Integer num, Bitmap bitmap) {
        NavigableMap d2 = d(bitmap.getConfig());
        Integer num2 = (Integer) d2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                d2.remove(num);
                return;
            } else {
                d2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + a(bitmap) + ", this: " + toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
