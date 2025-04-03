package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnhs implements ejny {
    public static final entd a = entd.c("BugleNotifications");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker");
    public static final int[] c = {BasePaymentResult.ERROR_REQUEST_TIMEOUT, BasePaymentResult.ERROR_REQUEST_FAILED};
    public final Context d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    private final ffsk q;

    public cnhs(ffsk ffskVar, Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        ffskVar.getClass();
        context.getClass();
        ffbrVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar12.getClass();
        this.q = ffskVar;
        this.d = context;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
        this.n = ffbrVar10;
        this.o = ffbrVar11;
        this.p = ffbrVar12;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c2;
        workerParameters.getClass();
        c2 = axol.c(this.q, ffhe.a, ffsm.a, new cnhr(workerParameters, this, null));
        return c2;
    }
}
