package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import defpackage.dkqn;
import defpackage.dkqo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingBusinessInfoBinder extends IBusinessInfo.Stub implements dkqo<IBusinessInfo> {
    private IBusinessInfo a;
    private final Context b;

    public ForwardingBusinessInfoBinder(Context context) {
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

    @Override // com.google.android.ims.rcsservice.businessinfo.IBusinessInfo
    public void retrieveBusinessInfo(String str) {
        ((IBusinessInfo) getDelegate()).retrieveBusinessInfo(str);
    }

    @Override // defpackage.dkqo
    public synchronized void set(IBinder iBinder) {
        this.a = (IBusinessInfo) iBinder;
    }

    @Override // defpackage.dkqo
    public synchronized IBusinessInfo getInterface() {
        return this.a;
    }
}
