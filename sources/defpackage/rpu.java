package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rpu {
    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    public final synchronized rpv a(String str) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (((rpt) this.a.get(i)).a.equals(str)) {
                return (rpv) this.b.get(i);
            }
        }
        return null;
    }

    public final synchronized void b(rpt rptVar, rpv rpvVar) {
        this.a.add(rptVar);
        this.b.add(rpvVar);
    }
}
