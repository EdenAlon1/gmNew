package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import com.google.android.gms.appdatasearch.RegisterCorpusIMEInfo;
import com.google.android.gms.appdatasearch.RegisterCorpusInfo;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dewi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        int i = 0;
        String str = null;
        Uri uri = null;
        RegisterSectionInfo[] registerSectionInfoArr = null;
        GlobalSearchCorpusConfig globalSearchCorpusConfig = null;
        Account account = null;
        RegisterCorpusIMEInfo registerCorpusIMEInfo = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = "0";
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    registerSectionInfoArr = (RegisterSectionInfo[]) dfxj.J(parcel, readInt, RegisterSectionInfo.CREATOR);
                    break;
                case 5:
                case 6:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 7:
                    globalSearchCorpusConfig = (GlobalSearchCorpusConfig) dfxj.n(parcel, readInt, GlobalSearchCorpusConfig.CREATOR);
                    break;
                case 8:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 9:
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    registerCorpusIMEInfo = (RegisterCorpusIMEInfo) dfxj.n(parcel, readInt, RegisterCorpusIMEInfo.CREATOR);
                    break;
                case 11:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 12:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 13:
                    i = dfxj.f(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new RegisterCorpusInfo(str, str3, uri, registerSectionInfoArr, globalSearchCorpusConfig, z2, account, registerCorpusIMEInfo, str2, z, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterCorpusInfo[i];
    }
}
