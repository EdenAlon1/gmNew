package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzgj implements dygy {
    private static WeakReference b = new WeakReference(null);
    public dzgm a;
    private final engw c;

    private dzgj() {
        int i = engw.d;
        this.c = enou.a;
        this.a = null;
    }

    public static synchronized dzgj c() {
        dzgj d;
        synchronized (dzgj.class) {
            d = d();
        }
        return d;
    }

    public static synchronized dzgj d() {
        synchronized (dzgj.class) {
            dzgj dzgjVar = (dzgj) b.get();
            if (dzgjVar != null) {
                return dzgjVar;
            }
            dzgj dzgjVar2 = new dzgj();
            b = new WeakReference(dzgjVar2);
            return dzgjVar2;
        }
    }

    @Override // defpackage.dygy
    public final engw a() {
        return this.c;
    }

    @Override // defpackage.dygy
    public final List b(dzci dzciVar, dyqz dyqzVar, Context context) {
        this.a = new dzgr(context, dyqzVar, new dzgu(dzciVar));
        return engw.r(new dzgk());
    }
}
