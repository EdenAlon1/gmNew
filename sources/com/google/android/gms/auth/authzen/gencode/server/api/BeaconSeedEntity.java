package com.google.android.gms.auth.authzen.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.a;
import defpackage.dfeq;
import defpackage.dfvc;
import defpackage.dfxk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BeaconSeedEntity extends FastSafeParcelableJsonResponse implements dfvc {
    public static final Parcelable.Creator<BeaconSeedEntity> CREATOR = new dfeq();
    private static final HashMap e;
    final Set a;
    String b;
    long c;
    long d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put(GroupManagementRequest.DATA_TAG, new FastJsonResponse.Field(7, false, 7, false, GroupManagementRequest.DATA_TAG, 2, null));
        hashMap.put("endTimeMillis", new FastJsonResponse.Field(2, false, 2, false, "endTimeMillis", 3, null));
        hashMap.put("startTimeMillis", new FastJsonResponse.Field(2, false, 2, false, "startTimeMillis", 4, null));
    }

    public BeaconSeedEntity(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Long.valueOf(this.c);
        }
        if (i == 4) {
            return Long.valueOf(this.d);
        }
        throw new IllegalStateException(a.h(i, "Unknown safe parcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean c(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        throw null;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof BeaconSeedEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BeaconSeedEntity beaconSeedEntity = (BeaconSeedEntity) obj;
        for (FastJsonResponse.Field field : e.values()) {
            if (c(field)) {
                if (!beaconSeedEntity.c(field) || !a(field).equals(beaconSeedEntity.a(field))) {
                    return false;
                }
            } else if (beaconSeedEntity.c(field)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field field : e.values()) {
            if (c(field)) {
                i = i + field.g + a(field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = dfxk.a(parcel);
        if (set.contains(2)) {
            dfxk.m(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            dfxk.j(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            dfxk.j(parcel, 4, this.d);
        }
        dfxk.c(parcel, a);
    }

    public BeaconSeedEntity() {
        this.a = new HashSet();
    }
}
