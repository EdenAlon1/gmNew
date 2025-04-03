package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.firstparty.setupwizard.SetupWizardInstrumentManagerParams;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhyc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        boolean z2 = false;
        Account account = null;
        byte[] bArr = null;
        BuyFlowConfig buyFlowConfig = null;
        String str = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 2:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 3:
                    buyFlowConfig = (BuyFlowConfig) dfxj.n(parcel, readInt, BuyFlowConfig.CREATOR);
                    break;
                case 4:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SetupWizardInstrumentManagerParams(account, bArr, buyFlowConfig, str, bArr2, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SetupWizardInstrumentManagerParams[i];
    }
}
