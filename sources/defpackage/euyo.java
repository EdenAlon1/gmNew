package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euyo implements euyu {
    private final String a;
    private final euyp b;

    public euyo(Set set, euyp euypVar) {
        this.a = b(set);
        this.b = euypVar;
    }

    private static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            euyq euyqVar = (euyq) it.next();
            sb.append(euyqVar.a());
            sb.append('/');
            sb.append(euyqVar.b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // defpackage.euyu
    public final String a() {
        if (this.b.a().isEmpty()) {
            return this.a;
        }
        return this.a + " " + b(this.b.a());
    }
}
