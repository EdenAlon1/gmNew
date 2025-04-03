package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdws {
    public static String a(double d, double d2) {
        return String.format(Locale.US, "https://www.google.com/maps/place/%1$.5f,%2$.5f/", Double.valueOf(d), Double.valueOf(d2));
    }
}
