package defpackage;

import android.util.SparseBooleanArray;
import j$.util.Optional;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgdo {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final Set b = new LinkedHashSet();
    public final AtomicReference c = new AtomicReference(Optional.empty());

    public final boolean a(eisx eisxVar) {
        return this.a.get(eisxVar.a());
    }
}
