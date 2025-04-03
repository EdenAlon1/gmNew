package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghe implements Parcelable.Creator {
    public static final ErrorReport a(Parcel parcel) {
        int h = dfxj.h(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        String str32 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        ServiceDump[] serviceDumpArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < h) {
            int e = dfxj.e(parcel);
            switch (dfxj.d(e)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) dfxj.n(parcel, e, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = dfxj.t(parcel, e);
                    break;
                case 4:
                    i = dfxj.f(parcel, e);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, e);
                    break;
                case 6:
                    str3 = dfxj.t(parcel, e);
                    break;
                case 7:
                    str4 = dfxj.t(parcel, e);
                    break;
                case 8:
                    str5 = dfxj.t(parcel, e);
                    break;
                case 9:
                    str6 = dfxj.t(parcel, e);
                    break;
                case 10:
                    str7 = dfxj.t(parcel, e);
                    break;
                case 11:
                    str8 = dfxj.t(parcel, e);
                    break;
                case 12:
                    i2 = dfxj.f(parcel, e);
                    break;
                case 13:
                    str9 = dfxj.t(parcel, e);
                    break;
                case 14:
                    str10 = dfxj.t(parcel, e);
                    break;
                case 15:
                    str11 = dfxj.t(parcel, e);
                    break;
                case 16:
                    str12 = dfxj.t(parcel, e);
                    break;
                case 17:
                    str13 = dfxj.t(parcel, e);
                    break;
                case 18:
                    strArr = dfxj.K(parcel, e);
                    break;
                case 19:
                    strArr2 = dfxj.K(parcel, e);
                    break;
                case 20:
                    strArr3 = dfxj.K(parcel, e);
                    break;
                case 21:
                    str14 = dfxj.t(parcel, e);
                    break;
                case 22:
                    str15 = dfxj.t(parcel, e);
                    break;
                case 23:
                    bArr = dfxj.E(parcel, e);
                    break;
                case 24:
                    i3 = dfxj.f(parcel, e);
                    break;
                case 25:
                    i4 = dfxj.f(parcel, e);
                    break;
                case 26:
                    i5 = dfxj.f(parcel, e);
                    break;
                case 27:
                    i6 = dfxj.f(parcel, e);
                    break;
                case 28:
                    str16 = dfxj.t(parcel, e);
                    break;
                case 29:
                    str17 = dfxj.t(parcel, e);
                    break;
                case 30:
                    str18 = dfxj.t(parcel, e);
                    break;
                case 31:
                    bundle = dfxj.k(parcel, e);
                    break;
                case 32:
                    z = dfxj.D(parcel, e);
                    break;
                case 33:
                    i7 = dfxj.f(parcel, e);
                    break;
                case 34:
                    i8 = dfxj.f(parcel, e);
                    break;
                case 35:
                    z2 = dfxj.D(parcel, e);
                    break;
                case 36:
                    str19 = dfxj.t(parcel, e);
                    break;
                case 37:
                    str20 = dfxj.t(parcel, e);
                    break;
                case 38:
                    i9 = dfxj.f(parcel, e);
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    str21 = dfxj.t(parcel, e);
                    break;
                case 40:
                    str22 = dfxj.t(parcel, e);
                    break;
                case 41:
                    str23 = dfxj.t(parcel, e);
                    break;
                case 42:
                    str24 = dfxj.t(parcel, e);
                    break;
                case 43:
                    str25 = dfxj.t(parcel, e);
                    break;
                case 44:
                    str26 = dfxj.t(parcel, e);
                    break;
                case 45:
                    str27 = dfxj.t(parcel, e);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) dfxj.n(parcel, e, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    str28 = dfxj.t(parcel, e);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) dfxj.J(parcel, e, FileTeleporter.CREATOR);
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    strArr4 = dfxj.K(parcel, e);
                    break;
                case 50:
                    z3 = dfxj.D(parcel, e);
                    break;
                case 51:
                    str29 = dfxj.t(parcel, e);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) dfxj.n(parcel, e, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) dfxj.n(parcel, e, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = dfxj.t(parcel, e);
                    break;
                case 55:
                    z4 = dfxj.D(parcel, e);
                    break;
                case 56:
                    bundle2 = dfxj.k(parcel, e);
                    break;
                case 57:
                    arrayList = dfxj.z(parcel, e, RectF.CREATOR);
                    break;
                case 58:
                    z5 = dfxj.D(parcel, e);
                    break;
                case 59:
                    bitmap = (Bitmap) dfxj.n(parcel, e, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = dfxj.t(parcel, e);
                    break;
                case 61:
                    arrayList2 = dfxj.y(parcel, e);
                    break;
                case 62:
                    i10 = dfxj.f(parcel, e);
                    break;
                case 63:
                    i11 = dfxj.f(parcel, e);
                    break;
                case 64:
                    strArr5 = dfxj.K(parcel, e);
                    break;
                case 65:
                    strArr6 = dfxj.K(parcel, e);
                    break;
                case 66:
                    strArr7 = dfxj.K(parcel, e);
                    break;
                case 67:
                    z6 = dfxj.D(parcel, e);
                    break;
                case 68:
                    z7 = dfxj.D(parcel, e);
                    break;
                case 69:
                    str32 = dfxj.t(parcel, e);
                    break;
                case 70:
                    additionalConsentConfig = (AdditionalConsentConfig) dfxj.n(parcel, e, AdditionalConsentConfig.CREATOR);
                    break;
                case 71:
                    serviceDumpArr = (ServiceDump[]) dfxj.J(parcel, e, ServiceDump.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, e);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6, z7, str32, additionalConsentConfig, serviceDumpArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorReport[i];
    }
}
