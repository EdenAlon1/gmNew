package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dujx {
    public final String a;
    public final dujy b;
    private final Executor c;

    public dujx(String str, dujy dujyVar) {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        if (str == null) {
            throw new NullPointerException("Answer URL was missing");
        }
        if (dujyVar == null) {
            throw new NullPointerException("HaTS cookie store was missing");
        }
        if (executor == null) {
            throw new NullPointerException("Executor was missing");
        }
        this.a = str;
        this.b = dujyVar;
        this.c = executor;
    }

    public final void a(dujv dujvVar) {
        this.c.execute(new dujw(this, dujvVar.a(true)));
    }
}
