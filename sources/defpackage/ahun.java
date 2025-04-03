package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahun implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Bundle readBundle = parcel.readBundle(ahum.class.getClassLoader());
        if (readBundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Object a = ih.a(readBundle, "chip_id", ChipId.class);
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ChipId chipId = (ChipId) a;
        String string = readBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (string != null) {
            return new ChipData(chipId, string, readBundle.getString("lookup"), (Uri) ih.a(readBundle, "photo", Uri.class), readBundle.getBoolean("clip"));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipData[i];
    }
}
