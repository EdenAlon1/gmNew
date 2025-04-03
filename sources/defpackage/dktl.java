package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dktl {
    public static volatile String a = "CarrierServices";
    private static final Set b;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(csux.Q, csux.L, enrz.a, ente.a)));
        b = unmodifiableSet;
        enuc.a(unmodifiableSet);
        new AtomicBoolean(false);
    }
}
