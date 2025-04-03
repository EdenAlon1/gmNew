package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryd extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<ryd> CREATOR = new rye();

    @Deprecated
    public final byte[] a;
    public final String b;
    public final int c;
    public final ParcelFileDescriptor d;
    public final String e;

    public ryd(byte[] bArr, String str, int i, ParcelFileDescriptor parcelFileDescriptor, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = i;
        this.d = parcelFileDescriptor;
        this.e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, bArr, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
