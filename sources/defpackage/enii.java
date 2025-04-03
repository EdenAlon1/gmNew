package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enii implements Serializable {
    private static final long serialVersionUID = 0;
    private final enhk a;

    public enii(enhk enhkVar) {
        this.a = enhkVar;
    }

    Object readResolve() {
        if (this.a.isEmpty()) {
            return enij.a;
        }
        ArrayList arrayList = new ArrayList();
        enqu listIterator = this.a.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            enih.b((enop) entry.getKey(), entry.getValue(), arrayList);
        }
        return enih.a(arrayList);
    }
}
