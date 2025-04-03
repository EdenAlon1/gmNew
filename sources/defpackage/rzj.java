package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rzj> CREATOR = new rzk();
    public final String a;
    public final float b;

    public rzj(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.h(parcel, 2, this.b);
        dfxk.c(parcel, a);
    }
}
