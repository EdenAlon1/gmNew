package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxf extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxf> CREATOR = new rxg();
    public final expv a;
    public final rwh b;

    public rxf(expv expvVar, rwh rwhVar) {
        this.a = expvVar;
        this.b = rwhVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        expv expvVar = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, expvVar, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.c(parcel, a);
    }
}
