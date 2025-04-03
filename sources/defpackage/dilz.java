package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dilz extends ArrayList {
    private static final long serialVersionUID = -4357313952926383485L;
    public final dimb a;

    public dilz(dimb dimbVar) {
        this.a = dimbVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dilz)) {
            return false;
        }
        dilz dilzVar = (dilz) obj;
        if (this.a == dilzVar.a) {
            return super.equals(dilzVar);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "State: " + String.valueOf(this.a) + " " + Arrays.toString(toArray());
    }
}
