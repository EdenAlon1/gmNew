package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum edph implements Parcelable {
    ACCESS,
    BREAKFAST,
    BRUNCH,
    DELIVERY,
    DINNER,
    DRIVE_THROUGH,
    HAPPY_HOUR,
    KITCHEN,
    LUNCH,
    ONLINE_SERVICE_HOURS,
    PICKUP,
    SENIOR_HOURS,
    TAKEOUT;

    public static final Parcelable.Creator<edph> CREATOR = new Parcelable.Creator() { // from class: edpg
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return (edph) Enum.valueOf(edph.class, readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new edph[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
