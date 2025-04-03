package com.google.android.ims.network.common;

import android.os.IBinder;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.dikz;
import defpackage.diyo;
import defpackage.djgy;
import defpackage.djjk;
import defpackage.djjq;
import defpackage.djjr;
import defpackage.dker;
import defpackage.dkpg;
import defpackage.dkvg;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface RcsEngine extends IRcsEngineTemporaryController, IBinder, dker, djjk, djjq, dikz, diyo, dkpg, djgy {
    public static final int[] DEFAULT_NETWORK_REGISTRATION_ORDER = {17, 1, 0};

    void dumpState(PrintWriter printWriter);

    djjr getImsModule();

    dkvg getSipConnectionType();

    void init();

    void onBackendChanged();

    void onReconfigurationRequested();

    void onSimLoaded(boolean z);

    void onSimRemoved();

    void shutdown();
}
