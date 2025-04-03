package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.rcsservice.transportcontrol.TransportControlServiceResult;
import com.google.android.ims.rcsservice.transportcontrol.TransportOptions;
import defpackage.dkqn;
import defpackage.dkqo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ForwardingTransportControlEngine extends ITransportControl.Stub implements dkqo<ITransportControl> {
    private ITransportControl a;
    private final Context b;

    public ForwardingTransportControlEngine(Context context) {
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
    public synchronized ITransportControl getInterface() {
        return this.a;
    }

    @Override // defpackage.dkqo
    public synchronized void set(IBinder iBinder) {
        this.a = (ITransportControl) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.transportcontrol.ITransportControl
    public TransportControlServiceResult useTransport(TransportOptions transportOptions) {
        return ((ITransportControl) getDelegate()).useTransport(transportOptions);
    }
}
