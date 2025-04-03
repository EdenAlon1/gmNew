package j$.util.concurrent;

/* loaded from: classes9.dex */
final class r extends k {
    r e;
    r f;
    r g;
    r h;
    boolean i;

    r(int i, Object obj, Object obj2, k kVar, r rVar) {
        super(i, obj, obj2, kVar);
        this.e = rVar;
    }

    @Override // j$.util.concurrent.k
    final k a(int i, Object obj) {
        return b(i, obj, null);
    }

    final r b(int i, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        r rVar = this;
        do {
            r rVar2 = rVar.f;
            r rVar3 = rVar.g;
            int i2 = rVar.a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = rVar.b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return rVar;
                    }
                    if (rVar2 != null) {
                        if (rVar3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                int i3 = ConcurrentHashMap.g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        rVar2 = rVar3;
                                    }
                                }
                            }
                            r b = rVar3.b(i, obj, cls);
                            if (b != null) {
                                return b;
                            }
                        }
                    }
                }
                rVar = rVar3;
            }
            rVar = rVar2;
        } while (rVar != null);
        return null;
    }
}
