package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwr extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rwr> CREATOR = new rws();
    public final int a;
    public final String b;
    public final Bitmap c;
    public final int d;
    public final ParcelFileDescriptor e;
    public final boolean f;

    public rwr(int i, String str, Bitmap bitmap, int i2, ParcelFileDescriptor parcelFileDescriptor, boolean z) {
        this.a = i;
        this.b = str;
        this.c = bitmap;
        this.d = i2;
        this.e = parcelFileDescriptor;
        this.f = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, i2);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.i(parcel, 4, this.d);
        dfxk.k(parcel, 5, this.e, i, false);
        dfxk.d(parcel, 6, this.f);
        dfxk.c(parcel, a);
    }
}
