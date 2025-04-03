package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pio implements pim {
    final /* synthetic */ pir a;

    public pio(pir pirVar) {
        this.a = pirVar;
    }

    @Override // defpackage.pim
    public final void b() {
        Iterator it = this.a.d.iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    @Override // defpackage.pim
    public final void a() {
    }
}
