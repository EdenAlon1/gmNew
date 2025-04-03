package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.profile.RcsProfileServiceResult;
import defpackage.dkqn;
import defpackage.dkqo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ForwardingRcsProfileBinder extends IRcsProfile.Stub implements dkqo<IRcsProfile> {
    private IRcsProfile a;
    private final Context b;

    public ForwardingRcsProfileBinder(Context context) {
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
    public synchronized IRcsProfile getInterface() {
        return this.a;
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public Bundle getRcsConfig() {
        return ((IRcsProfile) getDelegate()).getRcsConfig();
    }

    @Override // com.google.android.ims.rcsservice.profile.IRcsProfile
    public RcsProfileServiceResult getValue(int i) {
        return ((IRcsProfile) getDelegate()).getValue(i);
    }

    @Override // defpackage.dkqo
    public synchronized void set(IBinder iBinder) {
        this.a = (IRcsProfile) iBinder;
    }
}
