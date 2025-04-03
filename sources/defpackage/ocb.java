package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ocb extends oio {
    final /* synthetic */ ocd a;

    public ocb(ocd ocdVar) {
        this.a = ocdVar;
    }

    @Override // defpackage.oio
    public final void a(ofz ofzVar, ofx ofxVar) {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((ffjm) it.next()).a(ofzVar, ofxVar);
        }
    }
}
