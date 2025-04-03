package defpackage;

import android.util.SparseIntArray;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvzz implements dvwk, dvzx {
    public final erhm a;
    public final List b;
    public final List c;
    public final SparseIntArray d;
    private final engw e;

    public dvzz(erhm erhmVar, List list, List list2, SparseIntArray sparseIntArray, List list3, SparseIntArray sparseIntArray2) {
        this.a = erhmVar;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = sparseIntArray;
        DesugarCollections.unmodifiableList(list3);
        emxf.b(!list.isEmpty(), "Must have at least one graft");
        emxf.b(list2.size() == sparseIntArray.size() && list3.size() == sparseIntArray2.size(), "All children must have a parent specified.");
        this.e = engw.r(dvzw.a((dvzy) list.get(0)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            emxf.a(dvzw.a((dvzy) it.next()).equals(this.e.get(0)));
        }
    }

    @Override // defpackage.dvzx
    public final /* synthetic */ dvxr a() {
        return dvzw.a(this);
    }

    @Override // defpackage.dvzx
    public final List b() {
        return this.e;
    }

    public final String toString() {
        emwz b = emxa.b(this);
        erhk erhkVar = dvzw.a(this).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        b.f("rootVeId", erhkVar.d);
        erhk erhkVar2 = dvzw.b(this).d;
        if (erhkVar2 == null) {
            erhkVar2 = erhk.a;
        }
        b.f("targetVeId", erhkVar2.d);
        return b.toString();
    }
}
