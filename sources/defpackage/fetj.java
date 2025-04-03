package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetj {
    final boolean a;
    final List b;
    final Collection c;
    final Collection d;
    final int e;
    final fets f;
    final boolean g;
    final boolean h;

    public fetj(List list, Collection collection, Collection collection2, fets fetsVar, boolean z, boolean z2, boolean z3, int i) {
        this.b = list;
        collection.getClass();
        this.c = collection;
        this.f = fetsVar;
        this.d = collection2;
        this.g = z;
        this.a = z2;
        this.h = z3;
        this.e = i;
        emxf.m(!z2 || list == null, "passThrough should imply buffer is null");
        emxf.m((z2 && fetsVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        emxf.m(!z2 || (collection.size() == 1 && collection.contains(fetsVar)) || (collection.size() == 0 && fetsVar.b), "passThrough should imply winningSubstream is drained");
        emxf.m((z && fetsVar == null) ? false : true, "cancelled should imply committed");
    }

    final fetj a(fets fetsVar) {
        Collection unmodifiableCollection;
        emxf.m(!this.h, "hedging frozen");
        emxf.m(this.f == null, "already committed");
        Collection collection = this.d;
        if (collection == null) {
            unmodifiableCollection = Collections.singleton(fetsVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(fetsVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        return new fetj(this.b, this.c, unmodifiableCollection, this.f, this.g, this.a, this.h, this.e + 1);
    }

    final fetj b() {
        return this.h ? this : new fetj(this.b, this.c, this.d, this.f, this.g, this.a, true, this.e);
    }

    final fetj c(fets fetsVar) {
        Collection unmodifiableCollection;
        emxf.m(!this.a, "Already passThrough");
        if (fetsVar.b) {
            unmodifiableCollection = this.c;
        } else if (this.c.isEmpty()) {
            unmodifiableCollection = Collections.singletonList(fetsVar);
        } else {
            ArrayList arrayList = new ArrayList(this.c);
            arrayList.add(fetsVar);
            unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
        }
        Collection collection = unmodifiableCollection;
        fets fetsVar2 = this.f;
        boolean z = fetsVar2 != null;
        List list = this.b;
        if (z) {
            emxf.m(fetsVar2 == fetsVar, "Another RPC attempt has already committed");
            list = null;
        }
        return new fetj(list, collection, this.d, this.f, this.g, z, this.h, this.e);
    }
}
