package com.google.android.rcs.client.lifecycle;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.csjy;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.ehxc;
import defpackage.ehxg;
import defpackage.ehxi;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RcsEngineLifecycleService extends ehxc<IRcsEngineTemporaryController> {
    public static final diyy h = diyv.b("rcs_engine_lifecycle_service_connection_deprecated");

    public RcsEngineLifecycleService(Context context, ehxi ehxiVar) {
        super(IRcsEngineTemporaryController.class, context, ehxiVar, 1, Optional.empty());
    }

    @Override // defpackage.ehxc
    protected final boolean f() {
        return ((Boolean) h.a()).booleanValue();
    }

    @Override // defpackage.ehxc
    public String getRcsServiceMetaDataKey() {
        return "RcsEngineLifecycleServiceVersions";
    }

    public RcsEngineLifecycleServiceResult triggerStartRcsStack(String str) {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStartRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            csjy.p("RcsClientLib", e, "Error while starting RCS engine.");
            throw new ehxg("Error while starting RCS engine.");
        }
    }

    public RcsEngineLifecycleServiceResult triggerStopRcsStack(String str) {
        b();
        try {
            ((IRcsEngineTemporaryController) a()).triggerStopRcsStack(str);
            return new RcsEngineLifecycleServiceResult(0);
        } catch (RemoteException | IllegalStateException e) {
            csjy.p("RcsClientLib", e, "Error while stopping RCS engine.");
            throw new ehxg("Error while stopping RCS engine.");
        }
    }
}
