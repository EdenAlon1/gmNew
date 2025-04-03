package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.CountrySpecification;
import com.google.android.gms.wallet.MaskedWalletRequest;
import com.google.android.gms.wallet.PaymentMethodTokenizationParameters;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhwv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Cart cart = null;
        CountrySpecification[] countrySpecificationArr = null;
        ArrayList arrayList = null;
        PaymentMethodTokenizationParameters paymentMethodTokenizationParameters = null;
        ArrayList arrayList2 = null;
        String str5 = null;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 9:
                    cart = (Cart) dfxj.n(parcel, readInt, Cart.CREATOR);
                    break;
                case 10:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 11:
                    z7 = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    countrySpecificationArr = (CountrySpecification[]) dfxj.J(parcel, readInt, CountrySpecification.CREATOR);
                    break;
                case 13:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 14:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 15:
                    arrayList = dfxj.z(parcel, readInt, com.google.android.gms.identity.intents.model.CountrySpecification.CREATOR);
                    break;
                case 16:
                    paymentMethodTokenizationParameters = (PaymentMethodTokenizationParameters) dfxj.n(parcel, readInt, PaymentMethodTokenizationParameters.CREATOR);
                    break;
                case 17:
                    arrayList2 = dfxj.w(parcel, readInt);
                    break;
                case 18:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new MaskedWalletRequest(str, z3, z4, z5, str2, str3, str4, cart, z6, z7, countrySpecificationArr, z, z2, arrayList, paymentMethodTokenizationParameters, arrayList2, str5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MaskedWalletRequest[i];
    }
}
