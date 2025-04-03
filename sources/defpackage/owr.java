package defpackage;

import android.os.Bundle;
import java.util.Map;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class owr {
    public static final Map a(Bundle bundle) {
        ffga ffgaVar = new ffga(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            ffgaVar.put(str, bundle.get(str));
        }
        return ffew.b(ffgaVar);
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
