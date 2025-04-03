package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enry extends ensn {
    public enry(Class cls) {
        super("tags", cls, false);
    }

    @Override // defpackage.ensn
    public final /* bridge */ /* synthetic */ void a(Object obj, ensm ensmVar) {
        enwo enwoVar = (enwo) obj;
        if (enwoVar == null) {
            return;
        }
        enwk enwkVar = new enwk((enwl) enwoVar.c.d);
        while (enwkVar.hasNext()) {
            Map.Entry entry = (Map.Entry) enwkVar.next();
            if (((Set) entry.getValue()).isEmpty()) {
                ensmVar.a((String) entry.getKey(), null);
            } else {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    ensmVar.a((String) entry.getKey(), it.next());
                }
            }
        }
    }
}
