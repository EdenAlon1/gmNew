package com.google.android.apps.messaging.multishare.chip;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.ahun;
import defpackage.ffkd;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ChipData implements Parcelable {
    public static final Parcelable.Creator<ChipData> CREATOR = new ahun();
    public final ChipId a;
    public final String b;
    public final String c;
    public final Uri d;
    public final boolean e;

    public ChipData(ChipId chipId, String str, String str2, Uri uri, boolean z) {
        chipId.getClass();
        str.getClass();
        this.a = chipId;
        this.b = str;
        this.c = str2;
        this.d = uri;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChipData)) {
            return false;
        }
        ChipData chipData = (ChipData) obj;
        return ffkj.e(this.a, chipData.a) && ffkj.e(this.b, chipData.b) && ffkj.e(this.c, chipData.c) && ffkj.e(this.d, chipData.d) && this.e == chipData.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int hashCode2 = ((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.d;
        return ((hashCode2 + (uri != null ? uri.hashCode() : 0)) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ChipData(chipId=" + this.a + ", text=" + this.b + ", lookupKey=" + this.c + ", photo=" + this.d + ", clip=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("chip_id", this.a);
        bundle.putString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, this.b);
        bundle.putString("lookup", this.c);
        bundle.putParcelable("photo", this.d);
        bundle.putBoolean("clip", this.e);
        parcel.writeBundle(bundle);
    }

    public /* synthetic */ ChipData(ChipId chipId, String str, String str2, Uri uri, boolean z, int i, ffkd ffkdVar) {
        this(chipId, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : uri, (!((i & 16) == 0)) | z);
    }
}
