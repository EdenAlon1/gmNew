package com.google.android.libraries.jibe.service.locationsharing;

import android.content.Context;
import android.os.Binder;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;
import com.google.android.ims.rcsservice.locationsharing.LocationSharingResult;
import defpackage.dikt;
import defpackage.ditn;
import defpackage.dkqd;
import defpackage.dkrx;
import defpackage.dvvv;
import defpackage.eyrn;
import defpackage.eyrp;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LocationSharingEngine extends ILocationSharing.Stub {
    private final Context a;
    private final dkrx b;
    private final dikt c;
    private dvvv d;

    public LocationSharingEngine(Context context, dkrx dkrxVar, dikt diktVar) {
        this.a = context;
        this.b = dkrxVar;
        this.c = diktVar;
    }

    private final long a() {
        return this.b.c();
    }

    private final void b(Optional optional, String str) {
        eyrn eyrnVar = (eyrn) eyrp.a.createBuilder();
        eyrnVar.copyOnWrite();
        eyrp eyrpVar = (eyrp) eyrnVar.instance;
        eyrpVar.e = 3;
        eyrpVar.b |= 1;
        eyrnVar.copyOnWrite();
        eyrp eyrpVar2 = (eyrp) eyrnVar.instance;
        str.getClass();
        eyrpVar2.b |= 4;
        eyrpVar2.g = str;
        if (optional.isPresent()) {
            String obj = optional.get().toString();
            eyrnVar.copyOnWrite();
            eyrp eyrpVar3 = (eyrp) eyrnVar.instance;
            eyrpVar3.b |= 2;
            eyrpVar3.f = obj;
        }
        this.c.e(this.a, (eyrp) eyrnVar.build());
    }

    public long[] getActiveSessions() {
        dvvv dvvvVar = this.d;
        return dvvvVar == null ? new long[0] : dvvvVar.c();
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult pushLocation(String str, LocationInformation locationInformation, String str2) {
        b(Optional.empty(), str2);
        dkqd.d(this.a, Binder.getCallingUid());
        if (this.b.s()) {
            return new LocationSharingResult(-1L, str, 4, null);
        }
        dvvv dvvvVar = this.d;
        return dvvvVar == null ? new LocationSharingResult(-1L, str, 2, "Provider must not be null!") : dvvvVar.a(a(), str, locationInformation, str2);
    }

    @Override // com.google.android.ims.rcsservice.locationsharing.ILocationSharing
    public LocationSharingResult[] pushLocationToGroup(long j, LocationInformation locationInformation, String str) {
        b(Optional.of(Long.valueOf(j)), str);
        dkqd.d(this.a, Binder.getCallingUid());
        dvvv dvvvVar = this.d;
        return dvvvVar == null ? ditn.j(2, "Provider must not be null!") : dvvvVar.d(j, locationInformation, str);
    }

    public void registerProvider(dvvv dvvvVar) {
        this.d = dvvvVar;
    }

    public long registerSession(dvvv dvvvVar) {
        return a();
    }

    public void unregisterProvider(dvvv dvvvVar) {
        this.d = null;
    }

    public void unregisterSession(long j) {
    }
}
