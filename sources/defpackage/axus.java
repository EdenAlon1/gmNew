package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axus implements ejny {
    public static final entd a = entd.c("BugleContacts");
    public final ffbr b;
    private final ffsk c;

    public axus(ffsk ffskVar, ffbr ffbrVar) {
        ffskVar.getClass();
        this.c = ffskVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        ((ensz) a.h()).q("Starting periodic contacts import.");
        c = axol.c(this.c, ffhe.a, ffsm.a, new axur(this, null));
        return c;
    }
}
