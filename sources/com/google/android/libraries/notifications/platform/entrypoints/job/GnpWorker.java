package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.akgw;
import defpackage.eahg;
import defpackage.eajj;
import defpackage.ensz;
import defpackage.entd;
import defpackage.ffbr;
import defpackage.ffgu;
import defpackage.ffkj;
import defpackage.pot;
import defpackage.ppn;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class GnpWorker extends CoroutineWorker {
    private static final entd f = entd.c("GnpSdk");
    public eahg e;
    private final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(ffgu ffguVar) {
        ffbr ffbrVar = (ffbr) eajj.a(this.a).fJ().get(GnpWorker.class);
        if (ffbrVar == null) {
            ((ensz) f.j()).q("Failed to inject dependencies.");
            return new ppn();
        }
        Object b = ffbrVar.b();
        b.getClass();
        eahg eahgVar = (eahg) ((akgw) b).a.b.gl.b();
        this.e = eahgVar;
        if (eahgVar == null) {
            ffkj.c("gnpWorkerHandler");
            eahgVar = null;
        }
        WorkerParameters workerParameters = this.g;
        pot potVar = workerParameters.b;
        potVar.getClass();
        return eahgVar.a(potVar, workerParameters.e, ffguVar);
    }
}
