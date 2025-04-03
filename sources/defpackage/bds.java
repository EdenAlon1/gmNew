package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bds {
    public static final Set a = DesugarCollections.unmodifiableSet(EnumSet.of(bbz.PASSIVE_FOCUSED, bbz.PASSIVE_NOT_FOCUSED, bbz.LOCKED_FOCUSED, bbz.LOCKED_NOT_FOCUSED));
    public static final Set b = DesugarCollections.unmodifiableSet(EnumSet.of(bca.CONVERGED, bca.UNKNOWN));
    public static final Set c;
    public static final Set d;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(EnumSet.of(bby.CONVERGED, bby.FLASH_REQUIRED, bby.UNKNOWN));
        c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(bby.FLASH_REQUIRED);
        copyOf.remove(bby.UNKNOWN);
        d = DesugarCollections.unmodifiableSet(copyOf);
    }
}
