package defpackage;

import android.text.format.Time;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzye {
    public static boolean a(long j) {
        long rawOffset = TimeZone.getDefault().getRawOffset();
        int julianDay = Time.getJulianDay(j, rawOffset);
        dyhj.a();
        return julianDay == Time.getJulianDay(System.currentTimeMillis(), rawOffset);
    }
}
