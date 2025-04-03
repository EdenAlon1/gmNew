package defpackage;

import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.HashSet;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etgj {
    public static final /* synthetic */ int a = 0;

    static {
        Logger.getLogger(etgj.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(etfk.class);
        hashSet.add(etfp.class);
        hashSet.add(etgl.class);
        hashSet.add(etfr.class);
        hashSet.add(etfq.class);
        hashSet.add(etge.class);
        hashSet.add(etvo.class);
        hashSet.add(etgh.class);
        hashSet.add(etgi.class);
        DesugarCollections.unmodifiableSet(hashSet);
    }

    private etgj() {
    }

    public static Class a(Class cls) {
        try {
            return ((etsy) etse.a.b.get()).a(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static Object b(etzm etzmVar, Class cls) {
        String str = etzmVar.b;
        eyee eyeeVar = etzmVar.c;
        etft a2 = etri.a.a(str);
        if (a2.b().equals(cls)) {
            return a2.c(eyeeVar);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(a2.getClass()) + ", which only supports: " + a2.b().toString());
    }
}
