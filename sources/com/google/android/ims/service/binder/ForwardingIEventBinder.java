package com.google.android.ims.service.binder;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.events.IEventObserver;
import defpackage.dkqn;
import defpackage.dkqo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ForwardingIEventBinder extends IEvent.Stub implements dkqo<IEvent> {
    private IEvent a;
    Context context;

    public ForwardingIEventBinder(Context context) {
        this.context = context;
    }

    @Override // defpackage.dkqo
    public synchronized void clear() {
        this.a = null;
    }

    @Override // defpackage.dkqo
    public Context getContext() {
        return this.context;
    }

    public /* synthetic */ IInterface getDelegate() {
        return dkqn.a(this);
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void ping() {
        ((IEvent) getDelegate()).ping();
    }

    @Override // defpackage.dkqo
    public synchronized void set(IBinder iBinder) {
        this.a = (IEvent) iBinder;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public int subscribe(int i, IEventObserver iEventObserver) {
        return ((IEvent) getDelegate()).subscribe(i, iEventObserver);
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void unsubscribe(int i, int i2) {
        ((IEvent) getDelegate()).unsubscribe(i, i2);
    }

    @Override // defpackage.dkqo
    public synchronized IEvent getInterface() {
        return this.a;
    }
}
