package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<dlkk> CREATOR = new dlkl();
    public final Integer a;

    public dlkk(Integer num) {
        this.a = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.a;
        int a = dfxk.a(parcel);
        dfxk.x(parcel, 1, num);
        dfxk.c(parcel, a);
    }
}
