package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermt {
    static final String a;
    public static final Comparator b;

    static {
        Comparator comparator;
        String concat = String.valueOf(ermt.class.getName()).concat("$UnsafeComparator");
        a = concat;
        try {
            Object[] enumConstants = Class.forName(concat).getEnumConstants();
            enumConstants.getClass();
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = erms.a;
        }
        b = comparator;
    }

    ermt() {
    }
}
