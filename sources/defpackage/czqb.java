package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czqb {
    public boolean a;
    public String b;
    public engw c;
    public int d;
    private final HashSet e = new HashSet();

    public final void a(czqa czqaVar) {
        this.e.add(czqaVar);
    }

    public final void b() {
        this.a = false;
        this.b = null;
        this.d = 0;
        this.c = null;
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            czqa czqaVar = (czqa) it.next();
            boolean z = this.a;
            String str = this.b;
            engw engwVar = this.c;
            if (engwVar == null) {
                int i = engw.d;
                engwVar = enou.a;
            }
            int i2 = this.d;
            engw engwVar2 = this.c;
            czqaVar.a(new czpt(z, str, engw.n(engwVar), i2, (engwVar2 == null || engwVar2.isEmpty()) ? bdhb.a : (MessageIdType) engwVar2.get((engwVar2.size() - i2) - 1)));
        }
    }

    public final void d(czqa czqaVar) {
        this.e.remove(czqaVar);
    }
}
