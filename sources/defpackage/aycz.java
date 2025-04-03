package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aycz implements ejny {
    public static final aycw a = new aycw();
    public static final entd b = entd.c("BugleContacts");
    public final aycf c;
    public final ffbr d;
    public final ejoc e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    private final ffsk j;

    public aycz(ffsk ffskVar, aycf aycfVar, ffbr ffbrVar, ejoc ejocVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        aycfVar.getClass();
        ffbrVar.getClass();
        ejocVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.j = ffskVar;
        this.c = aycfVar;
        this.d = ffbrVar;
        this.e = ejocVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.j, ffhe.a, ffsm.a, new aycy(this, workerParameters, null));
        return c;
    }
}
