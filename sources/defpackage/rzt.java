package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rzt> CREATOR = new rzu();
    public final float[] a;

    public rzt(float[] fArr) {
        int length = fArr.length;
        float[] fArr2 = new float[length];
        this.a = fArr2;
        System.arraycopy(fArr, 0, fArr2, 0, length);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float[] fArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.s(parcel, fArr);
        dfxk.c(parcel, a);
    }
}
