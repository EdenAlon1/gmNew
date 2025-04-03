package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejug {
    public static final ejug a = new ejug(null, Instant.EPOCH, false);
    private final Object b;
    private final ejuf c;

    private ejug(Object obj, Instant instant, boolean z) {
        this.b = obj;
        this.c = new ejuf(instant, obj != null, z);
    }

    public static ejug a(Object obj, Instant instant) {
        obj.getClass();
        return new ejug(obj, instant, true);
    }

    public static ejug b(Object obj) {
        obj.getClass();
        return new ejug(obj, Instant.EPOCH, false);
    }

    public final ejug c(emwl emwlVar) {
        ejug ejugVar = a;
        return this == ejugVar ? ejugVar : g() ? a(emwlVar.apply(e()), d()) : b(emwlVar.apply(e()));
    }

    public final Instant d() {
        emxf.m(f(), "Cannot get timestamp for a CacheResult that does not have content");
        emxf.m(g(), "Cannot get timestamp for an invalid CacheResult");
        return this.c.a;
    }

    public final Object e() {
        emxf.m(f(), "Cannot get data for a CacheResult that does not have content");
        return this.b;
    }

    public final boolean f() {
        return this.c.b;
    }

    public final boolean g() {
        emxf.m(f(), "Cannot call isValid() for a CacheResult that does not have content");
        return this.c.c;
    }

    public final String toString() {
        ejuf ejufVar = this.c;
        if (!ejufVar.b) {
            return "CacheResult.cacheMiss";
        }
        if (!ejufVar.c) {
            return "CacheResult.cacheInvalid{data=" + String.valueOf(this.b) + "}";
        }
        Object obj = this.b;
        Instant instant = ejufVar.a;
        return "CacheResult.cacheHit{data=" + String.valueOf(obj) + ", timestamp=" + instant.toString() + "}";
    }
}
