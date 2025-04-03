package defpackage;

import android.util.Range;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bqe {
    public static final Range a;
    public static final Range b;

    static {
        Integer valueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
        a = new Range(0, valueOf);
        b = new Range(0, valueOf);
        bqd d = d();
        d.b(0);
        d.a();
    }

    public static bqd d() {
        bqg bqgVar = new bqg();
        bqgVar.b = -1;
        bqgVar.c = -1;
        bqgVar.b(-1);
        Range range = a;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        bqgVar.a = range;
        Range range2 = b;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        bqgVar.d = range2;
        return bqgVar;
    }

    public abstract int a();

    public abstract Range b();

    public abstract Range c();

    public abstract void e();

    public abstract void f();
}
