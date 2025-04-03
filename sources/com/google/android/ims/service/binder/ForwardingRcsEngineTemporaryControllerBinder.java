package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import defpackage.dkqn;
import defpackage.dkqo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingRcsEngineTemporaryControllerBinder extends IRcsEngineTemporaryController.Stub implements dkqo<IRcsEngineTemporaryController> {
    private IRcsEngineTemporaryController a;
    private final Context b;

    public ForwardingRcsEngineTemporaryControllerBinder(Context context) {
        this.b = context;
    }

    @Override // defpackage.dkqo
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.dkqo
    public Context getContext() {
        return this.b;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dkqn.a(this);
    }

    @Override // defpackage.dkqo
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsEngineTemporaryController) iBinder;
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStartRcsStack(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        ((IRcsEngineTemporaryController) getDelegate()).triggerStopRcsStack(str);
    }

    @Override // defpackage.dkqo
    public synchronized IRcsEngineTemporaryController getInterface() {
        return this.a;
    }
}
