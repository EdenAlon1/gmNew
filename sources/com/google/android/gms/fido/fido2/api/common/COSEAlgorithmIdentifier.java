package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwv;
import defpackage.dgim;
import defpackage.dgjc;
import defpackage.dgjd;
import defpackage.dgjh;
import defpackage.dgkd;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator<COSEAlgorithmIdentifier> CREATOR = new dgjc();
    public final dgim a;

    public COSEAlgorithmIdentifier(dgim dgimVar) {
        dfwv.n(dgimVar);
        this.a = dgimVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSEAlgorithmIdentifier a(int i) {
        dgkd dgkdVar;
        if (i == dgkd.LEGACY_RS1.i) {
            dgkdVar = dgkd.RS1;
        } else {
            dgkd[] values = dgkd.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    for (dgjh dgjhVar : dgjh.values()) {
                        if (dgjhVar.h == i) {
                            dgkdVar = dgjhVar;
                        }
                    }
                    throw new dgjd(i);
                }
                dgkd dgkdVar2 = values[i2];
                if (dgkdVar2.i == i) {
                    dgkdVar = dgkdVar2;
                    break;
                }
                i2++;
            }
        }
        return new COSEAlgorithmIdentifier(dgkdVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof COSEAlgorithmIdentifier) && this.a.a() == ((COSEAlgorithmIdentifier) obj).a.a();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "COSEAlgorithmIdentifier{algorithm=" + this.a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.a());
    }
}
