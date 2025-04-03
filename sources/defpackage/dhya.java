package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhya implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Card card = null;
        ArrayList arrayList = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                card = (Card) dfxj.n(parcel, readInt, Card.CREATOR);
            } else if (d == 2) {
                arrayList = dfxj.z(parcel, readInt, UserAddress.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                bArr = dfxj.E(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SaveInstrumentRequest(card, arrayList, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveInstrumentRequest[i];
    }
}
