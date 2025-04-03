package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqoo {
    public static final Object a(String str, Supplier supplier) {
        Object obj;
        ekzz f = eleg.f(str);
        try {
            obj = supplier.get();
            ffig.a(f, null);
            return obj;
        } finally {
        }
    }

    public static final void b(String str, Runnable runnable) {
        ekzz f = eleg.f(str);
        try {
            runnable.run();
            ffig.a(f, null);
        } finally {
        }
    }
}
