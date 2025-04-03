package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oyh {
    public static volatile oyh a;
    public static final Object b = new Object();
    public final Context e;
    public final Set d = new HashSet();
    final Map c = new HashMap();

    public oyh(Context context) {
        this.e = context.getApplicationContext();
    }

    public final void a(Class cls, Set set) {
        if (ozg.c()) {
            try {
                ozg.a(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.c.containsKey(cls)) {
            this.c.get(cls);
        } else {
            set.add(cls);
            try {
                oyi oyiVar = (oyi) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> b2 = oyiVar.b();
                if (!b2.isEmpty()) {
                    for (Class cls2 : b2) {
                        if (!this.c.containsKey(cls2)) {
                            a(cls2, set);
                        }
                    }
                }
                Object a2 = oyiVar.a(this.e);
                set.remove(cls);
                this.c.put(cls, a2);
            } catch (Throwable th) {
                throw new oyj(th);
            }
        }
    }
}
