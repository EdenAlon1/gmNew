package defpackage;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwc {
    private static final WeakHashMap a = new WeakHashMap();

    public static /* synthetic */ String a(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        if (1 == (i3 & 1)) {
            i2 = 1;
        }
        sb.append(i2);
        sb.append(".40.false.");
        sb.append(Locale.getDefault().toLanguageTag());
        String sb2 = sb.toString();
        WeakHashMap weakHashMap = a;
        Object obj = weakHashMap.get(sb2);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(sb2, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
