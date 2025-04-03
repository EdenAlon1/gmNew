package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eknx implements Parcelable {
    public static final Parcelable.Creator<eknx> CREATOR = new eknw();
    public final int a;
    public final List b;
    public boolean c;
    public final Integer d;
    private final String e;

    public eknx(int i, List list, String str, boolean z, Integer num) {
        this.a = i;
        this.b = list;
        this.e = str;
        this.c = z;
        this.d = num;
    }

    public static eknx a(String str) {
        int i = engw.d;
        return new eknx(4, enou.a, str);
    }

    public static eknx b(Intent intent) {
        return new eknx(1, engw.r(intent), null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeTypedList(this.b);
        parcel.writeString(this.e);
        parcel.writeInt(this.c ? 1 : 0);
        if (this.d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.d.intValue());
        }
    }

    public eknx(int i, List list, String str) {
        this(i, list, str, false, null);
    }
}
