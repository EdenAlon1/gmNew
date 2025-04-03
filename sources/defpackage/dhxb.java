package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.CardRequirements;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import com.google.android.gms.wallet.ShippingAddressRequirements;
import com.google.android.gms.wallet.TransactionInfo;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhxb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CardRequirements cardRequirements = null;
        ShippingAddressRequirements shippingAddressRequirements = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        TransactionInfo transactionInfo = null;
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    cardRequirements = (CardRequirements) dfxj.n(parcel, readInt, CardRequirements.CREATOR);
                    break;
                case 4:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    shippingAddressRequirements = (ShippingAddressRequirements) dfxj.n(parcel, readInt, ShippingAddressRequirements.CREATOR);
                    break;
                case 6:
                    arrayList = dfxj.w(parcel, readInt);
                    break;
                case 7:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) dfxj.n(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 8:
                    transactionInfo = (TransactionInfo) dfxj.n(parcel, readInt, TransactionInfo.CREATOR);
                    break;
                case 9:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 10:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 12:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new PaymentDataRequest(z2, z3, cardRequirements, z4, shippingAddressRequirements, arrayList, paymentMethodTokenizationParameters, transactionInfo, z, str, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PaymentDataRequest[i];
    }
}
