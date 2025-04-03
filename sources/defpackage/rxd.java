package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxd extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxd> CREATOR = new rxe();
    public final Bitmap a;

    public rxd(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bitmap bitmap = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, bitmap, i, false);
        dfxk.c(parcel, a);
    }
}
