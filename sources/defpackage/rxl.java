package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rxl extends AbstractSafeParcelable implements SafeParcelable {
    public static final Parcelable.Creator<rxl> CREATOR = new rxm();
    public final String a;
    public final String b;
    public final rxi c;

    public rxl(String str, String str2, rxi rxiVar) {
        this.a = str;
        this.b = str2;
        this.c = rxiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
