package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.BrowserResolutionCookie;
import com.google.android.gms.auth.NotificationParams;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.firstparty.dataservice.AccountInterruptControls;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfai implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        BrowserResolutionCookie[] browserResolutionCookieArr = null;
        NotificationParams notificationParams = null;
        AccountInterruptControls accountInterruptControls = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    browserResolutionCookieArr = (BrowserResolutionCookie[]) dfxj.J(parcel, readInt, BrowserResolutionCookie.CREATOR);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    notificationParams = (NotificationParams) dfxj.n(parcel, readInt, NotificationParams.CREATOR);
                    break;
                case 8:
                    accountInterruptControls = (AccountInterruptControls) dfxj.n(parcel, readInt, AccountInterruptControls.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ResolutionData(i, str, i2, str2, browserResolutionCookieArr, z, notificationParams, accountInterruptControls);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolutionData[i];
    }
}
