package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzss implements dygy {
    private static WeakReference a = new WeakReference(null);
    private final engw b = engw.r(2);

    private dzss() {
    }

    public static synchronized dzss c() {
        synchronized (dzss.class) {
            dzss dzssVar = (dzss) a.get();
            if (dzssVar != null) {
                return dzssVar;
            }
            dzss dzssVar2 = new dzss();
            a = new WeakReference(dzssVar2);
            return dzssVar2;
        }
    }

    @Override // defpackage.dygy
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.dygy
    public final List b(dzci dzciVar, dyqz dyqzVar, Context context) {
        return Arrays.asList(new dzst(context));
    }
}
