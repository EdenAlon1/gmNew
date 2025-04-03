package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fflm {
    public static final Object a(Optional optional, Object obj) {
        optional.getClass();
        return optional.isPresent() ? optional.get() : obj;
    }

    public static final Object b(Optional optional) {
        optional.getClass();
        return optional.orElse(null);
    }
}
