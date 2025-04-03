package com.google.android.ims.rcsservice.chatsession;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum MessageRevocationSupportedResult implements Parcelable {
    UNKNOWN,
    REVOCATION_ALLOWED,
    REVOCATION_DISALLOWED,
    UNSUPPORTED_CSAPK_VERSION,
    SESSION_NOT_FOUND,
    PROVIDER_NOT_FOUND;

    public static final Parcelable.Creator<MessageRevocationSupportedResult> CREATOR = new Parcelable.Creator() { // from class: dkmr
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            if (readString == null) {
                return MessageRevocationSupportedResult.UNKNOWN;
            }
            MessageRevocationSupportedResult messageRevocationSupportedResult = MessageRevocationSupportedResult.UNKNOWN;
            return (MessageRevocationSupportedResult) Enum.valueOf(MessageRevocationSupportedResult.class, readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new MessageRevocationSupportedResult[i];
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
