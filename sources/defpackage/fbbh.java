package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbh implements fbba {
    public static final fbba a = fbbb.a(Collections.EMPTY_SET);
    private final List b;
    private final List c;

    public fbbh(List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    public static fbba a() {
        return a;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Set b() {
        List list = this.c;
        int size = this.b.size();
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = this.c.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) ((fbbf) this.c.get(i)).b();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(fbax.a(size));
        int size3 = this.b.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object b = ((fbbf) this.b.get(i2)).b();
            b.getClass();
            hashSet.add(b);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }
}
