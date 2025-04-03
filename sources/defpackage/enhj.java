package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
class enhj implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public enhj(enhk enhkVar) {
        Object[] objArr = new Object[enhkVar.size()];
        Object[] objArr2 = new Object[enhkVar.size()];
        enqu listIterator = enhkVar.entrySet().listIterator();
        int i = 0;
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public enhd a(int i) {
        return new enhd(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof enip) {
            enip enipVar = (enip) obj;
            engi engiVar = (engi) this.b;
            enhd a = a(enipVar.size());
            enqu listIterator = enipVar.listIterator();
            enqu listIterator2 = engiVar.listIterator();
            while (listIterator.hasNext()) {
                a.k(listIterator.next(), listIterator2.next());
            }
            return a.c();
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        enhd a2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            a2.k(objArr[i], ((Object[]) obj2)[i]);
        }
        return a2.c();
    }
}
