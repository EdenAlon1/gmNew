package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dghe;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ErrorReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ErrorReport> CREATOR = new dghe();
    public String A;
    public String B;
    public String C;
    public Bundle D;
    public boolean E;
    public int F;
    public int G;
    public boolean H;
    public String I;
    public String J;
    public int K;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;

    @Deprecated
    public String Q;
    public String R;
    public BitmapTeleporter S;
    public String T;
    public FileTeleporter[] U;
    public String[] V;
    public boolean W;
    public String X;
    public ThemeSettings Y;
    public LogOptions Z;
    public ApplicationErrorReport a;

    @Deprecated
    public String aa;
    public boolean ab;
    public Bundle ac;
    public List ad;
    public boolean ae;
    public Bitmap af;
    public String ag;
    public List ah;
    public int ai;
    public int aj;
    public String[] ak;
    public String[] al;
    public String[] am;
    public boolean an;
    public boolean ao;
    public String ap;
    public AdditionalConsentConfig aq;
    public ServiceDump[] ar;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String[] q;
    public String[] r;
    public String[] s;
    public String t;
    public String u;
    public byte[] v;
    public int w;
    public int x;
    public int y;
    public int z;

    public ErrorReport() {
        this.a = new ApplicationErrorReport();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, this.a, i, false);
        dfxk.m(parcel, 3, this.b, false);
        dfxk.i(parcel, 4, this.c);
        dfxk.m(parcel, 5, this.d, false);
        dfxk.m(parcel, 6, this.e, false);
        dfxk.m(parcel, 7, this.f, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.m(parcel, 9, this.h, false);
        dfxk.m(parcel, 10, this.i, false);
        dfxk.m(parcel, 11, this.j, false);
        dfxk.i(parcel, 12, this.k);
        dfxk.m(parcel, 13, this.l, false);
        dfxk.m(parcel, 14, this.m, false);
        dfxk.m(parcel, 15, this.n, false);
        dfxk.m(parcel, 16, this.o, false);
        dfxk.m(parcel, 17, this.p, false);
        dfxk.C(parcel, 18, this.q);
        dfxk.C(parcel, 19, this.r);
        dfxk.C(parcel, 20, this.s);
        dfxk.m(parcel, 21, this.t, false);
        dfxk.m(parcel, 22, this.u, false);
        dfxk.f(parcel, 23, this.v, false);
        dfxk.i(parcel, 24, this.w);
        dfxk.i(parcel, 25, this.x);
        dfxk.i(parcel, 26, this.y);
        dfxk.i(parcel, 27, this.z);
        dfxk.m(parcel, 28, this.A, false);
        dfxk.m(parcel, 29, this.B, false);
        dfxk.m(parcel, 30, this.C, false);
        dfxk.p(parcel, 31, this.D);
        dfxk.d(parcel, 32, this.E);
        dfxk.i(parcel, 33, this.F);
        dfxk.i(parcel, 34, this.G);
        dfxk.d(parcel, 35, this.H);
        dfxk.m(parcel, 36, this.I, false);
        dfxk.m(parcel, 37, this.J, false);
        dfxk.i(parcel, 38, this.K);
        dfxk.m(parcel, 39, this.L, false);
        dfxk.m(parcel, 40, this.M, false);
        dfxk.m(parcel, 41, this.N, false);
        dfxk.m(parcel, 42, this.O, false);
        dfxk.m(parcel, 43, this.P, false);
        dfxk.m(parcel, 44, this.Q, false);
        dfxk.m(parcel, 45, this.R, false);
        dfxk.k(parcel, 46, this.S, i, false);
        dfxk.m(parcel, 47, this.T, false);
        dfxk.E(parcel, 48, this.U, i);
        dfxk.C(parcel, 49, this.V);
        dfxk.d(parcel, 50, this.W);
        dfxk.m(parcel, 51, this.X, false);
        dfxk.k(parcel, 52, this.Y, i, false);
        dfxk.k(parcel, 53, this.Z, i, false);
        dfxk.m(parcel, 54, this.aa, false);
        dfxk.d(parcel, 55, this.ab);
        dfxk.p(parcel, 56, this.ac);
        dfxk.n(parcel, 57, this.ad, false);
        dfxk.d(parcel, 58, this.ae);
        dfxk.k(parcel, 59, this.af, i, false);
        dfxk.m(parcel, 60, this.ag, false);
        dfxk.D(parcel, 61, this.ah);
        dfxk.i(parcel, 62, this.ai);
        dfxk.i(parcel, 63, this.aj);
        dfxk.C(parcel, 64, this.ak);
        dfxk.C(parcel, 65, this.al);
        dfxk.C(parcel, 66, this.am);
        dfxk.d(parcel, 67, this.an);
        dfxk.d(parcel, 68, this.ao);
        dfxk.m(parcel, 69, this.ap, false);
        dfxk.k(parcel, 70, this.aq, i, false);
        dfxk.E(parcel, 71, this.ar, i);
        dfxk.c(parcel, a);
    }

    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list, boolean z5, Bitmap bitmap, String str31, List list2, int i10, int i11, String[] strArr5, String[] strArr6, String[] strArr7, boolean z6, boolean z7, String str32, AdditionalConsentConfig additionalConsentConfig, ServiceDump[] serviceDumpArr) {
        new ApplicationErrorReport();
        this.a = applicationErrorReport;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = i2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = str13;
        this.q = strArr;
        this.r = strArr2;
        this.s = strArr3;
        this.t = str14;
        this.u = str15;
        this.v = bArr;
        this.w = i3;
        this.x = i4;
        this.y = i5;
        this.z = i6;
        this.A = str16;
        this.B = str17;
        this.C = str18;
        this.D = bundle;
        this.E = z;
        this.F = i7;
        this.G = i8;
        this.H = z2;
        this.I = str19;
        this.J = str20;
        this.K = i9;
        this.L = str21;
        this.M = str22;
        this.N = str23;
        this.O = str24;
        this.P = str25;
        this.Q = str26;
        this.R = str27;
        this.S = bitmapTeleporter;
        this.T = str28;
        this.U = fileTeleporterArr;
        this.V = strArr4;
        this.W = z3;
        this.X = str29;
        this.Y = themeSettings;
        this.Z = logOptions;
        this.aa = str30;
        this.ab = z4;
        this.ac = bundle2;
        this.ad = list;
        this.ae = z5;
        this.af = bitmap;
        this.ag = str31;
        this.ah = list2;
        this.ai = i10;
        this.aj = i11;
        this.ak = strArr5;
        this.al = strArr6;
        this.am = strArr7;
        this.an = z6;
        this.ao = z7;
        this.ap = str32;
        this.aq = additionalConsentConfig;
        this.ar = serviceDumpArr;
    }

    public ErrorReport(FeedbackOptions feedbackOptions, File file) {
        this.a = new ApplicationErrorReport();
        Bundle bundle = feedbackOptions.b;
        if (bundle != null && !bundle.isEmpty()) {
            this.D = feedbackOptions.b;
        }
        if (!TextUtils.isEmpty(feedbackOptions.a)) {
            this.B = feedbackOptions.a;
        }
        if (!TextUtils.isEmpty(feedbackOptions.c)) {
            this.b = feedbackOptions.c;
        }
        ApplicationErrorReport.CrashInfo crashInfo = feedbackOptions.d.crashInfo;
        if (crashInfo != null) {
            this.M = crashInfo.throwMethodName;
            this.K = crashInfo.throwLineNumber;
            this.L = crashInfo.throwClassName;
            this.N = crashInfo.stackTrace;
            this.I = crashInfo.exceptionClassName;
            this.O = crashInfo.exceptionMessage;
            this.J = crashInfo.throwFileName;
        }
        ThemeSettings themeSettings = feedbackOptions.j;
        if (themeSettings != null) {
            this.Y = themeSettings;
        }
        if (!TextUtils.isEmpty(feedbackOptions.e)) {
            this.P = feedbackOptions.e;
        }
        String str = feedbackOptions.g;
        if (!TextUtils.isEmpty(str)) {
            this.a.packageName = str;
        }
        if (!TextUtils.isEmpty(feedbackOptions.n)) {
            this.ag = feedbackOptions.n;
        }
        Bitmap bitmap = feedbackOptions.m;
        if (bitmap != null) {
            this.af = bitmap;
        }
        if (file != null) {
            this.S = feedbackOptions.f;
            List list = feedbackOptions.h;
            if (list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = file;
                }
                this.U = (FileTeleporter[]) list.toArray(new FileTeleporter[0]);
            }
        }
        LogOptions logOptions = feedbackOptions.k;
        if (logOptions != null) {
            this.Z = logOptions;
        }
        this.W = feedbackOptions.i;
        this.ae = feedbackOptions.l;
        this.E = feedbackOptions.o;
        this.an = feedbackOptions.q;
        this.ap = feedbackOptions.r;
        this.aq = feedbackOptions.s;
    }
}
