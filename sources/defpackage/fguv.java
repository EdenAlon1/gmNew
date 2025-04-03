package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguv extends ArrayList implements Serializable {
    private static final long serialVersionUID = 7308557606558767449L;

    /* JADX WARN: Multi-variable type inference failed */
    public final fguv a(String str) {
        fguv fguvVar = new fguv();
        int size = size();
        for (int i = 0; i < size; i++) {
            fgut fgutVar = (fgut) get(i);
            if (fgutVar.a.equals(str)) {
                fguvVar.add(fgutVar);
            }
        }
        return fguvVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        if (obj instanceof fgut) {
            return super.add(obj);
        }
        throw new IllegalArgumentException("Argument not a ".concat(String.valueOf(fgut.class.getName())));
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = size();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(get(i).toString());
        }
        return stringBuffer.toString();
    }
}
