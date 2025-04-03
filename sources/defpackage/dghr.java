package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghr implements Parcelable.Creator {
    public static void a(FeedbackOptions feedbackOptions, Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, feedbackOptions.a, false);
        dfxk.p(parcel, 3, feedbackOptions.b);
        dfxk.m(parcel, 5, feedbackOptions.c, false);
        dfxk.k(parcel, 6, feedbackOptions.d, i, false);
        dfxk.m(parcel, 7, feedbackOptions.e, false);
        dfxk.k(parcel, 8, feedbackOptions.f, i, false);
        dfxk.m(parcel, 9, feedbackOptions.g, false);
        dfxk.n(parcel, 10, feedbackOptions.h, false);
        dfxk.d(parcel, 11, feedbackOptions.i);
        dfxk.k(parcel, 12, feedbackOptions.j, i, false);
        dfxk.k(parcel, 13, feedbackOptions.k, i, false);
        dfxk.d(parcel, 14, feedbackOptions.l);
        dfxk.k(parcel, 15, feedbackOptions.m, i, false);
        dfxk.m(parcel, 16, feedbackOptions.n, false);
        dfxk.d(parcel, 17, feedbackOptions.o);
        dfxk.j(parcel, 18, feedbackOptions.p);
        dfxk.d(parcel, 19, feedbackOptions.q);
        dfxk.m(parcel, 20, feedbackOptions.r, false);
        dfxk.k(parcel, 21, feedbackOptions.s, i, false);
        dfxk.c(parcel, a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str4 = null;
        ArrayList arrayList = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        Bitmap bitmap = null;
        String str5 = null;
        String str6 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 4:
                default:
                    dfxj.C(parcel, readInt);
                    break;
                case 5:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) dfxj.n(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) dfxj.n(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    arrayList = dfxj.z(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) dfxj.n(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) dfxj.n(parcel, readInt, LogOptions.CREATOR);
                    break;
                case 14:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 15:
                    bitmap = (Bitmap) dfxj.n(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 16:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 17:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 18:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 19:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 20:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 21:
                    additionalConsentConfig = (AdditionalConsentConfig) dfxj.n(parcel, readInt, AdditionalConsentConfig.CREATOR);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new FeedbackOptions(str, bundle, str2, applicationErrorReport, str3, bitmapTeleporter, str4, arrayList, z, themeSettings, logOptions, z2, bitmap, str5, z3, j, z4, str6, additionalConsentConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
