package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dzpf implements Parcelable {
    UNKNOWN(0),
    PHONE_NUMBER(1),
    EMAIL(2),
    HANDLER(3),
    DEVICE_ID(5);

    public static final Parcelable.Creator<dzpf> CREATOR = new Parcelable.Creator() { // from class: dzpe
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return dzpf.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new dzpf[i];
        }
    };
    public final int f;

    dzpf(int i) {
        this.f = i;
    }

    public static dzpf a(final int i) {
        return (dzpf) enfc.e(values()).a(new emxg() { // from class: dzpd
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                dzpf dzpfVar = dzpf.UNKNOWN;
                return ((dzpf) obj).f == i;
            }
        }).e(UNKNOWN);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f);
    }
}
