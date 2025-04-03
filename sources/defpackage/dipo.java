package defpackage;

import android.content.Context;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dipo {
    public static final Object a = new Object();
    public static dipm b;

    public static dipm a(Context context) {
        dipm dipmVar;
        synchronized (a) {
            if (b == null) {
                b(context);
                fbbf fbbfVar = dipl.a;
                context.getClass();
                b = new dipk(context);
            }
            dipmVar = b;
            dipmVar.getClass();
        }
        return dipmVar;
    }

    public static void b(final Context context) {
        ersy.a = context;
        dipp.a.set(new Supplier() { // from class: dipn
            @Override // java.util.function.Supplier
            public final Object get() {
                return dipo.a(context);
            }
        });
    }
}
