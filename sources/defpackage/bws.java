package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bws {
    static int a(int i, int i2, int i3, int i4, int i5, Range range) {
        int doubleValue = (int) (i * new Rational(i2, i3).doubleValue() * new Rational(i4, i5).doubleValue());
        String format = avw.h("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue)) : "";
        if (!bqe.a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            doubleValue = num.intValue();
            if (avw.h("AudioConfigUtil")) {
                format = String.valueOf(format).concat(String.valueOf(String.format("\nClamped to range %s -> %dbps", range, num)));
            }
        }
        avw.a("AudioConfigUtil", format);
        return doubleValue;
    }

    static void b(bqe bqeVar) {
        int i = ((bqh) bqeVar).d;
        avw.a("AudioConfigUtil", "Using default AUDIO source format: 2");
    }

    static int c(Range range, int i, final int i2) {
        int i3 = 0;
        ArrayList arrayList = null;
        int i4 = i2;
        while (true) {
            if (!range.contains((Range) Integer.valueOf(i4))) {
                avw.a("AudioConfigUtil", "Sample rate " + i4 + "Hz is not in target range " + range);
            } else {
                if (bwb.h(i4, i, 2)) {
                    return i4;
                }
                avw.a("AudioConfigUtil", a.x(i, i4, "Sample rate ", "Hz is not supported by audio source with channel count ", " and source format 2"));
            }
            if (arrayList == null) {
                avw.a("AudioConfigUtil", a.f(i2, "Trying common sample rates in proximity order to target ", "Hz"));
                arrayList = new ArrayList(bve.a);
                Collections.sort(arrayList, new Comparator() { // from class: bwr
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int intValue = ((Integer) obj).intValue();
                        int i5 = i2;
                        int abs = Math.abs(intValue - i5) - Math.abs(((Integer) obj2).intValue() - i5);
                        return (int) (abs == 0 ? Math.signum(r4.intValue() - r5.intValue()) : Math.signum(abs));
                    }
                });
            }
            if (i3 >= arrayList.size()) {
                avw.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i4 = ((Integer) arrayList.get(i3)).intValue();
            i3++;
        }
    }

    static void d(bqe bqeVar) {
        int i = ((bqh) bqeVar).e;
        avw.a("AudioConfigUtil", "Using default AUDIO source: 5");
    }
}
