package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 7:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 9:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    arrayList = dfxj.z(parcel, readInt, Scope.CREATOR);
                    break;
                case 11:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 12:
                    str8 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleSignInAccount(str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
