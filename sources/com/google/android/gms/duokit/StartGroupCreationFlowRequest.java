package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dggd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartGroupCreationFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartGroupCreationFlowRequest> CREATOR = new dggd();
    public DuoId[] a;
    public String b;
    public boolean c;

    public StartGroupCreationFlowRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartGroupCreationFlowRequest) {
            StartGroupCreationFlowRequest startGroupCreationFlowRequest = (StartGroupCreationFlowRequest) obj;
            if (Arrays.equals(this.a, startGroupCreationFlowRequest.a) && dfwq.a(this.b, startGroupCreationFlowRequest.b) && dfwq.a(Boolean.valueOf(this.c), Boolean.valueOf(startGroupCreationFlowRequest.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.E(parcel, 1, this.a, i);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.d(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public StartGroupCreationFlowRequest(DuoId[] duoIdArr, String str, boolean z) {
        this.a = duoIdArr;
        this.b = str;
        this.c = z;
    }
}
