package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<rwt> CREATOR = new rwu();
    public final String a;

    @Deprecated
    public final float b;
    public final int c;
    public final float d;

    public rwt(String str, float f, int i, float f2) {
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.h(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.h(parcel, 4, this.d);
        dfxk.c(parcel, a);
    }
}
