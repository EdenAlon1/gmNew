package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akme {
    public final WorkerParameters a;
    public final fbbf b;
    private final akis c;
    private final akme d = this;

    public akme(akis akisVar, WorkerParameters workerParameters) {
        this.c = akisVar;
        this.a = workerParameters;
        this.b = new akmd(akisVar, this);
    }
}
