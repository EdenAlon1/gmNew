package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.mdh.TrivialBigtableKeyValue;
import defpackage.dheb;
import defpackage.dhfz;
import defpackage.dhga;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TrivialBigtableKeyValue extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TrivialBigtableKeyValue> CREATOR = new dhga(new dheb());
    public final byte[] a;
    public final byte[] b;
    public final byte[] c;

    public TrivialBigtableKeyValue(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = bArr2;
        this.c = bArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TrivialBigtableKeyValue trivialBigtableKeyValue = (TrivialBigtableKeyValue) obj;
            if (Arrays.equals(this.a, trivialBigtableKeyValue.a) && Arrays.equals(this.b, trivialBigtableKeyValue.b) && Arrays.equals(this.c, trivialBigtableKeyValue.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dhga.a(this, parcel, new dhfz() { // from class: dhea
            @Override // defpackage.dhfz
            public final void a(SafeParcelable safeParcelable, Parcel parcel2) {
                TrivialBigtableKeyValue trivialBigtableKeyValue = (TrivialBigtableKeyValue) safeParcelable;
                byte[] bArr = trivialBigtableKeyValue.a;
                int a = dfxk.a(parcel2);
                dfxk.f(parcel2, 1, bArr, false);
                dfxk.f(parcel2, 2, trivialBigtableKeyValue.b, false);
                dfxk.f(parcel2, 3, trivialBigtableKeyValue.c, false);
                dfxk.c(parcel2, a);
            }
        });
    }
}
