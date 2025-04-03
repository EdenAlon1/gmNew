package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.startchat.chip.ChipData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvrp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        ChipData.a aVar = (ChipData.a) ctba.a(ChipData.a.class);
        Bundle readBundle = parcel.readBundle(cvro.class.getClassLoader());
        if (readBundle == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = readBundle.getString(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aolm I = aVar.I();
        Parcelable parcelable = readBundle.getParcelable("identity");
        if (parcelable != null) {
            return new ChipData(I.c((eyjv) parcelable), string, readBundle.getString("lookup"), (Uri) readBundle.getParcelable("photo"), readBundle.getBoolean("pinned", false));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChipData[i];
    }
}
