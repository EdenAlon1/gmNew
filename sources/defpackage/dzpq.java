package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.InvalidParameterException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzpq implements Parcelable {
    ONE_TO_ONE(0),
    GROUP(1);

    public static final Parcelable.Creator<dzpq> CREATOR = new Parcelable.Creator() { // from class: dzpp
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return dzpq.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new dzpq[i];
        }
    };
    public final int c;

    dzpq(int i) {
        this.c = i;
    }

    public static dzpq a(final int i) {
        dzpq dzpqVar = (dzpq) enfc.e(values()).a(new emxg() { // from class: dzpo
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dzpq dzpqVar2 = dzpq.ONE_TO_ONE;
                return ((dzpq) obj).c == i;
            }
        }).f();
        if (dzpqVar != null) {
            return dzpqVar;
        }
        throw new InvalidParameterException("Invalid conversation IdType.");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
    }
}
