package com.google.android.apps.messaging.label.data.classification;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum SuperSortLabel implements Parcelable {
    UNKNOWN(0),
    PERSONAL(1),
    TRANSACTION(2),
    PROMOTION(3),
    UPDATE(4),
    OTP(5),
    ALL(6),
    BUSINESS_UPDATE(7);

    public static final Parcelable.Creator<SuperSortLabel> CREATOR = new Parcelable.Creator() { // from class: afai
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return SuperSortLabel.a(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new SuperSortLabel[i];
        }
    };
    public final int i;

    SuperSortLabel(int i) {
        this.i = i;
    }

    public static SuperSortLabel a(int i) {
        for (SuperSortLabel superSortLabel : values()) {
            if (superSortLabel.i == i) {
                return superSortLabel;
            }
        }
        return UNKNOWN;
    }

    public final boolean b() {
        return (this == UNKNOWN || this == ALL) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.i);
    }
}
