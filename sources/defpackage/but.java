package defpackage;

import android.util.Range;
import androidx.car.app.model.Alert;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class but {
    public static final Range e;
    public static final Range f;
    public static final bro g;

    static {
        Integer valueOf = Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY);
        e = new Range(0, valueOf);
        f = new Range(0, valueOf);
        List asList = Arrays.asList(brk.d, brk.c, brk.b);
        brk brkVar = brk.d;
        int i = bqy.d;
        g = bro.a(asList, new bqj(brkVar, 1));
    }

    public static bus e() {
        bqu bquVar = new bqu();
        bquVar.c(g);
        Range range = e;
        if (range == null) {
            throw new NullPointerException("Null frameRate");
        }
        bquVar.a = range;
        Range range2 = f;
        if (range2 == null) {
            throw new NullPointerException("Null bitrate");
        }
        bquVar.b = range2;
        bquVar.b(-1);
        return bquVar;
    }

    public abstract int a();

    public abstract Range b();

    public abstract Range c();

    public abstract bro d();
}
