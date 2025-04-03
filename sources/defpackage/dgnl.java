package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgnl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        ArrayList arrayList = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        String str4 = null;
        Uri uri = null;
        ArrayList arrayList2 = null;
        ThemeSettings themeSettings = null;
        ArrayList arrayList3 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        String str6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayList4 = null;
        String str7 = null;
        ArrayList arrayList5 = null;
        String str8 = null;
        Intent intent = null;
        ArrayList arrayList6 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
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
                    account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 5:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    arrayList = dfxj.y(parcel, readInt);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 10:
                    bundle2 = dfxj.k(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) dfxj.n(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    arrayList2 = dfxj.z(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = dfxj.f(parcel, readInt);
                    break;
                case 18:
                    arrayList3 = dfxj.z(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 20:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 21:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                case 22:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) dfxj.n(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) dfxj.n(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) dfxj.n(parcel, readInt, TogglingData.CREATOR);
                    break;
                case 32:
                    i5 = dfxj.f(parcel, readInt);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) dfxj.n(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 34:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 35:
                    bitmap = (Bitmap) dfxj.n(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 36:
                    i6 = dfxj.f(parcel, readInt);
                    break;
                case 37:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 38:
                    z5 = dfxj.D(parcel, readInt);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i7 = dfxj.f(parcel, readInt);
                    break;
                case 40:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 41:
                    z6 = dfxj.D(parcel, readInt);
                    break;
                case 42:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 43:
                    z7 = dfxj.D(parcel, readInt);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) dfxj.n(parcel, readInt, ND4CSettings.CREATOR);
                    break;
                case 45:
                    z8 = dfxj.D(parcel, readInt);
                    break;
                case 46:
                    arrayList4 = dfxj.z(parcel, readInt, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case 47:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                case 48:
                    i8 = dfxj.f(parcel, readInt);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i9 = dfxj.f(parcel, readInt);
                    break;
                case 50:
                    arrayList5 = dfxj.z(parcel, readInt, TrailsInteraction.CREATOR);
                    break;
                case 51:
                    str8 = dfxj.t(parcel, readInt);
                    break;
                case 52:
                    intent = (Intent) dfxj.n(parcel, readInt, Intent.CREATOR);
                    break;
                case 53:
                    arrayList6 = dfxj.y(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, arrayList, bundle2, bitmap2, bArr, i2, i3, str4, uri, arrayList2, i4, themeSettings, arrayList3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5, i7, str5, z6, str6, z7, nD4CSettings, z8, arrayList4, str7, i8, i9, arrayList5, str8, intent, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
