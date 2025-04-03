package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finz {
    public StringBuilder d;
    public String e;
    public char f;
    public StringBuilder g;
    public int i = 1;
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean h = false;

    final fiqs a() {
        fiqs fiqsVar = new fiqs();
        fiqsVar.a.addAll(this.a);
        return fiqsVar;
    }

    public final void b() {
        if (this.h) {
            String b = fipa.b(this.e);
            StringBuilder sb = this.g;
            fipv fipvVar = new fipv(this.d.toString(), b, sb != null ? fipa.b(sb.toString()) : null);
            fipvVar.i(this.c);
            this.c.clear();
            this.b.add(fipvVar);
            this.d = null;
            this.h = false;
            this.e = null;
            this.g = null;
        }
    }
}
