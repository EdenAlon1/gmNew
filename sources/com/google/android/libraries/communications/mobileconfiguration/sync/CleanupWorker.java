package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.cgtm;
import defpackage.dlrt;
import defpackage.enip;
import defpackage.enrr;
import defpackage.ewim;
import defpackage.eznb;
import defpackage.eznc;
import defpackage.eznd;
import defpackage.ezne;
import defpackage.ppo;
import defpackage.ppp;
import defpackage.ppq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CleanupWorker extends Worker {
    private final dlrt e;

    public CleanupWorker(Context context, WorkerParameters workerParameters, dlrt dlrtVar) {
        super(context, workerParameters);
        this.e = dlrtVar;
    }

    @Override // androidx.work.Worker
    public final ppq c() {
        dlrt dlrtVar = this.e;
        Optional b = dlrtVar.b.b();
        if (b.isEmpty()) {
            ((enrr) ((enrr) dlrt.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 31, "CleanupWorkerHandler.java")).q("Error deleting stale configs");
            cgtm cgtmVar = dlrtVar.c;
            eznd ezndVar = (eznd) ezne.a.createBuilder();
            eznb eznbVar = (eznb) eznc.a.createBuilder();
            eznbVar.copyOnWrite();
            eznc ezncVar = (eznc) eznbVar.instance;
            ezncVar.c = ewim.a(3);
            ezncVar.b |= 1;
            ezndVar.copyOnWrite();
            ezne ezneVar = (ezne) ezndVar.instance;
            eznc ezncVar2 = (eznc) eznbVar.build();
            ezncVar2.getClass();
            ezneVar.c = ezncVar2;
            ezneVar.b = 4;
            cgtmVar.a((ezne) ezndVar.build());
            return new ppo();
        }
        int size = ((enip) b.get()).size();
        ((enrr) ((enrr) dlrt.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 36, "CleanupWorkerHandler.java")).r("Successfully deleted %d configs", size);
        cgtm cgtmVar2 = dlrtVar.c;
        eznd ezndVar2 = (eznd) ezne.a.createBuilder();
        eznb eznbVar2 = (eznb) eznc.a.createBuilder();
        eznbVar2.copyOnWrite();
        eznc ezncVar3 = (eznc) eznbVar2.instance;
        ezncVar3.c = ewim.a(4);
        ezncVar3.b |= 1;
        eznbVar2.copyOnWrite();
        eznc ezncVar4 = (eznc) eznbVar2.instance;
        ezncVar4.b |= 2;
        ezncVar4.d = size;
        ezndVar2.copyOnWrite();
        ezne ezneVar2 = (ezne) ezndVar2.instance;
        eznc ezncVar5 = (eznc) eznbVar2.build();
        ezncVar5.getClass();
        ezneVar2.c = ezncVar5;
        ezneVar2.b = 4;
        cgtmVar2.a((ezne) ezndVar2.build());
        return new ppp();
    }
}
