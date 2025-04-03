package defpackage;

import android.content.Context;
import defpackage.ersy;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ersy {
    public static volatile Context a;
    private static final Map b = new ConcurrentHashMap();

    /* compiled from: PG */
    public interface a {
        ersy eW();
    }

    public static boolean a(String str, String str2) {
        Object obj;
        Supplier m108m = afg$$ExternalSyntheticApiModelOutline0.m108m(Map.EL.getOrDefault(b, str2, new Supplier() { // from class: ersx
            @Override // java.util.function.Supplier
            public final Object get() {
                return ((ersy.a) fazh.a(ersy.c(), ersy.a.class)).eW();
            }
        }));
        m108m.getClass();
        obj = m108m.get();
        return ((ersy) obj).b(str);
    }

    public static Context c() {
        Context context = a;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return applicationContext;
    }

    protected abstract boolean b(String str);
}
