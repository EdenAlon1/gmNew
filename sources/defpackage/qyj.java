package defpackage;

import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyj {
    public final int a;
    public final int b;
    public final int c;
    private final Context d;

    public qyj(qyh qyhVar) {
        this.d = qyhVar.a;
        int i = true != qyhVar.b.isLowRamDevice() ? 4194304 : 2097152;
        this.c = i;
        int round = Math.round(r2.getMemoryClass() * 1048576 * (true != qyhVar.b.isLowRamDevice() ? 0.4f : 0.33f));
        float f = qyhVar.d.a.widthPixels * qyhVar.d.a.heightPixels * 4;
        int round2 = Math.round(qyhVar.c * f);
        int round3 = Math.round(f + f);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f2 = i2 / (qyhVar.c + 2.0f);
            this.b = Math.round(f2 + f2);
            this.a = Math.round(f2 * qyhVar.c);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            String a = a(this.b);
            String a2 = a(this.a);
            String a3 = a(i);
            boolean z = i3 > round;
            Log.d("MemorySizeCalculator", "Calculation complete, Calculated memory cache size: " + a + ", pool size: " + a2 + ", byte array size: " + a3 + ", memory class limited? " + z + ", max size: " + a(round) + ", memoryClass: " + qyhVar.b.getMemoryClass() + ", isLowMemoryDevice: " + qyhVar.b.isLowRamDevice());
        }
    }

    private final String a(int i) {
        return Formatter.formatFileSize(this.d, i);
    }
}
