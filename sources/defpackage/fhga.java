package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhga extends fhgz {
    private static final fhgn a;
    private final List b;
    private final List c;

    static {
        Pattern pattern = fhgn.a;
        a = fhgm.a("application/x-www-form-urlencoded");
    }

    public fhga(List list, List list2) {
        this.b = fhhl.o(list);
        this.c = fhhl.o(list2);
    }

    private final long e(fhmu fhmuVar, boolean z) {
        fhmt r;
        if (z) {
            r = new fhmt();
        } else {
            fhmuVar.getClass();
            r = fhmuVar.r();
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                r.O(38);
            }
            r.aa((String) this.b.get(i));
            r.O(61);
            r.aa((String) this.c.get(i));
        }
        if (!z) {
            return 0L;
        }
        long j = r.b;
        r.A();
        return j;
    }

    @Override // defpackage.fhgz
    public final long a() {
        return e(null, true);
    }

    @Override // defpackage.fhgz
    public final fhgn b() {
        return a;
    }

    @Override // defpackage.fhgz
    public final void c(fhmu fhmuVar) {
        e(fhmuVar, false);
    }
}
