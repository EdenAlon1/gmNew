package com.google.android.gms.people.cpg.callingcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhii;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CallingCardMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CallingCardMetadata> CREATOR = new dhii();
    public final CallingCardFontData a;
    public final CallingCardFullScreenImageData b;

    public CallingCardMetadata(CallingCardFontData callingCardFontData, CallingCardFullScreenImageData callingCardFullScreenImageData) {
        this.a = callingCardFontData;
        this.b = callingCardFullScreenImageData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallingCardMetadata) {
            CallingCardMetadata callingCardMetadata = (CallingCardMetadata) obj;
            if (emxb.a(this.a, callingCardMetadata.a) && emxb.a(this.b, callingCardMetadata.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        CallingCardFontData callingCardFontData = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, callingCardFontData, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
