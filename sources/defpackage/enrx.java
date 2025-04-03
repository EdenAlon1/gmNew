package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enrx extends ensn {
    public enrx(Class cls) {
        super("group_by", cls, true);
    }

    @Override // defpackage.ensn
    public final void b(Iterator it, ensm ensmVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                ensmVar.a(this.a, next);
                return;
            }
            StringBuilder sb = new StringBuilder("[");
            sb.append(next);
            do {
                sb.append(',');
                sb.append(it.next());
            } while (it.hasNext());
            String str = this.a;
            sb.append(']');
            ensmVar.a(str, sb.toString());
        }
    }
}
