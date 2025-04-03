package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GenerateInviteLinkResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GenerateInviteLinkResponse> CREATOR = new dgey();
    public String a;
    public String b;
    public int c;

    public GenerateInviteLinkResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenerateInviteLinkResponse) {
            GenerateInviteLinkResponse generateInviteLinkResponse = (GenerateInviteLinkResponse) obj;
            if (dfwq.a(this.a, generateInviteLinkResponse.a) && dfwq.a(this.b, generateInviteLinkResponse.b) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(generateInviteLinkResponse.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, this.a, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.c(parcel, a);
    }

    public GenerateInviteLinkResponse(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
