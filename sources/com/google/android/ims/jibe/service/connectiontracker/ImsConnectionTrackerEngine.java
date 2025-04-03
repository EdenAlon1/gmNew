package com.google.android.ims.jibe.service.connectiontracker;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import defpackage.dikz;
import defpackage.dkqd;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ImsConnectionTrackerEngine extends IImsConnectionTracker.Stub {
    private final Context a;
    private final ffbr b;

    public ImsConnectionTrackerEngine(Context context, ffbr<dikz> ffbrVar) {
        this.a = context;
        this.b = ffbrVar;
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public ImsRegistrationState getRegistrationState() {
        dkqd.d(this.a, Binder.getCallingUid());
        return ((dikz) this.b.b()).getRegistrationState();
    }

    @Override // com.google.android.ims.rcsservice.ims.IImsConnectionTracker
    public boolean isRegistered() {
        dkqd.d(this.a, Binder.getCallingUid());
        return ((dikz) this.b.b()).isRegistered();
    }
}
