package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qaw implements ppc {
    final pwt a;
    final pyk b;
    public final qbc c;

    static {
        ppt.d("WMFgUpdater");
    }

    public qaw(WorkDatabase workDatabase, pwt pwtVar, qbc qbcVar) {
        this.a = pwtVar;
        this.c = qbcVar;
        this.b = workDatabase.D();
    }
}
