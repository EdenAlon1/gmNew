package defpackage;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khl extends khj {
    private static final ArrayList e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public khl(char[] cArr) {
        super(cArr);
    }

    public final khk A() {
        if (this.a.size() > 0) {
            return (khk) this.a.get(0);
        }
        return null;
    }

    public final void B(khk khkVar) {
        if (this.a.size() > 0) {
            this.a.set(0, khkVar);
        } else {
            this.a.add(khkVar);
        }
    }

    @Override // defpackage.khj, defpackage.khk
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khl) || Objects.equals(v(), ((khl) obj).v())) {
            return super.equals(obj);
        }
        return false;
    }
}
