package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiqn {
    public static final long a(Optional optional, long j) {
        optional.getClass();
        return (!optional.isPresent() || ((Number) optional.get()).longValue() <= j) ? j : ((Number) optional.get()).longValue();
    }
}
