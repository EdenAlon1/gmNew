package com.google.android.gms.learning;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dgtz;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Features extends AbstractSafeParcelable {
    Bundle a;
    Bundle b;
    private static final Charset c = Charset.forName("UTF-8");
    public static final Parcelable.Creator<Features> CREATOR = new dgtz();

    public Features(Bundle bundle, Bundle bundle2) {
        this.a = bundle;
        this.b = bundle2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Features{");
        boolean z = true;
        for (String str : this.a.keySet()) {
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            sb.append("=");
            Object obj = this.a.get(str);
            if (obj == null) {
                sb.append("feature_missing");
            } else if (obj instanceof float[]) {
                sb.append(Arrays.toString(this.a.getFloatArray(str)));
            } else if (obj instanceof long[]) {
                sb.append(Arrays.toString(this.a.getLongArray(str)));
            } else {
                if (!(obj instanceof byte[])) {
                    throw new IllegalStateException("inconsistent example with feature of type: ".concat(String.valueOf(obj.getClass().getSimpleName())));
                }
                sb.append("[");
                byte[] byteArray = this.a.getByteArray(str);
                int[] intArray = this.b.getIntArray(str);
                int length = intArray.length;
                ByteBuffer[] byteBufferArr = new ByteBuffer[length];
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    byteBufferArr[i2] = ByteBuffer.wrap(byteArray, i, intArray[i2] - i).asReadOnlyBuffer();
                    i = intArray[i2];
                }
                byte[][] bArr = new byte[length][];
                for (int i3 = 0; i3 < length; i3++) {
                    byte[] bArr2 = new byte[byteBufferArr[i3].remaining()];
                    bArr[i3] = bArr2;
                    byteBufferArr[i3].get(bArr2);
                }
                boolean z2 = true;
                int i4 = 0;
                while (i4 < length) {
                    byte[] bArr3 = bArr[i4];
                    if (!z2) {
                        sb.append(",");
                    }
                    sb.append(new String(bArr3, c));
                    i4++;
                    z2 = false;
                }
                sb.append("]");
            }
            z = false;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.p(parcel, 1, this.a);
        dfxk.p(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }

    public Features() {
        this(new Bundle(), new Bundle());
    }
}
