package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyb implements dsyi {
    final /* synthetic */ dsyc a;

    public dsyb(dsyc dsycVar) {
        this.a = dsycVar;
    }

    @Override // defpackage.dsyi
    public final void a(int i, float f) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((dsyi) it.next()).a(i, f);
        }
    }

    @Override // defpackage.dsyi
    public final void b(int i) {
        Iterator it = this.a.b.iterator();
        while (it.hasNext()) {
            ((dsyi) it.next()).b(i);
        }
    }
}
