package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgnr implements Parcelable.Creator {
    public static void a(InProductHelp inProductHelp, Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, inProductHelp.a, i, false);
        dfxk.m(parcel, 2, inProductHelp.b, false);
        dfxk.m(parcel, 3, inProductHelp.c, false);
        dfxk.i(parcel, 4, inProductHelp.d);
        dfxk.m(parcel, 5, inProductHelp.e, false);
        dfxk.i(parcel, 6, inProductHelp.f);
        dfxk.m(parcel, 7, inProductHelp.g, false);
        dfxk.c(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        GoogleHelp googleHelp = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    googleHelp = (GoogleHelp) dfxj.n(parcel, readInt, GoogleHelp.CREATOR);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 7:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new InProductHelp(googleHelp, str, str2, i, str3, i2, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InProductHelp[i];
    }
}
