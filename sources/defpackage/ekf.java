package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekf {
    public final List a = new ArrayList();
    final /* synthetic */ ekh b;

    public ekf(ekh ekhVar) {
        this.b = ekhVar;
    }

    public final void a(int i) {
        long j = eki.a;
        ekh ekhVar = this.b;
        elu eluVar = ekhVar.c;
        if (eluVar == null) {
            return;
        }
        this.a.add(new elt(eluVar, i, j, ekhVar.b, null));
    }
}
