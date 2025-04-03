package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import defpackage.dfxk;
import defpackage.dghd;
import defpackage.dgnl;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleHelp> CREATOR = new dgnl();
    boolean A;
    public boolean B;
    int C;
    String D;
    boolean E;
    String F;
    public boolean G;
    ND4CSettings H;
    boolean I;
    List J;

    @Deprecated
    String K;
    public int L;
    public int M;
    public List N;
    String O;
    Intent P;
    List Q;
    public dghd R;
    final int a;
    String b;
    Account c;
    Bundle d;
    String e;
    String f;
    Bitmap g;
    boolean h;
    boolean i;
    List j;

    @Deprecated
    Bundle k;

    @Deprecated
    Bitmap l;

    @Deprecated
    byte[] m;

    @Deprecated
    int n;

    @Deprecated
    int o;
    String p;
    public Uri q;
    List r;
    public ThemeSettings s;
    List t;
    boolean u;
    ErrorReport v;
    public TogglingData w;
    int x;
    public PendingIntent y;
    public int z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5, int i7, String str5, boolean z6, String str6, boolean z7, ND4CSettings nD4CSettings, boolean z8, List list4, String str7, int i8, int i9, List list5, String str8, Intent intent, List list6) {
        this.v = new ErrorReport();
        if (TextUtils.isEmpty(str)) {
            throw new IllegalStateException("Help requires a non-empty appContext");
        }
        this.a = i;
        this.z = i6;
        this.A = z4;
        this.B = z5;
        this.C = i7;
        this.D = str5;
        this.b = str;
        this.c = account;
        this.d = bundle;
        this.e = str2;
        this.f = str3;
        this.g = bitmap;
        this.h = z;
        this.i = z2;
        this.E = z6;
        this.j = list;
        this.y = pendingIntent;
        this.k = bundle2;
        this.l = bitmap2;
        this.m = bArr;
        this.n = i2;
        this.o = i3;
        this.p = str4;
        this.q = uri;
        this.r = list2;
        if (i < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.a = i4;
            this.s = themeSettings2;
        } else {
            this.s = themeSettings == null ? new ThemeSettings() : themeSettings;
        }
        this.t = list3;
        this.u = z3;
        this.v = errorReport;
        if (errorReport != null) {
            errorReport.X = "GoogleHelp";
        }
        this.w = togglingData;
        this.x = i5;
        this.F = str6;
        this.G = z7;
        this.H = nD4CSettings;
        this.I = z8;
        this.J = list4;
        this.K = str7;
        this.L = i8;
        this.M = i9;
        this.N = list5;
        this.O = str8;
        this.P = intent;
        this.Q = list6;
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final void b(int i, String str, Intent intent) {
        this.r.add(new OverflowMenuItem(i, str, intent));
    }

    public final void c(FeedbackOptions feedbackOptions, File file) {
        this.R = feedbackOptions.t;
        ErrorReport errorReport = new ErrorReport(feedbackOptions, file);
        this.v = errorReport;
        errorReport.X = "GoogleHelp";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.p(parcel, 4, this.d);
        dfxk.d(parcel, 5, this.h);
        dfxk.d(parcel, 6, this.i);
        dfxk.D(parcel, 7, this.j);
        dfxk.p(parcel, 10, this.k);
        dfxk.k(parcel, 11, this.l, i, false);
        dfxk.m(parcel, 14, this.p, false);
        dfxk.k(parcel, 15, this.q, i, false);
        dfxk.n(parcel, 16, this.r, false);
        dfxk.i(parcel, 17, 0);
        dfxk.n(parcel, 18, this.t, false);
        dfxk.f(parcel, 19, this.m, false);
        dfxk.i(parcel, 20, this.n);
        dfxk.i(parcel, 21, this.o);
        dfxk.d(parcel, 22, this.u);
        dfxk.k(parcel, 23, this.v, i, false);
        dfxk.k(parcel, 25, this.s, i, false);
        dfxk.m(parcel, 28, this.e, false);
        dfxk.k(parcel, 31, this.w, i, false);
        dfxk.i(parcel, 32, this.x);
        dfxk.k(parcel, 33, this.y, i, false);
        dfxk.m(parcel, 34, this.f, false);
        dfxk.k(parcel, 35, this.g, i, false);
        dfxk.i(parcel, 36, this.z);
        dfxk.d(parcel, 37, this.A);
        dfxk.d(parcel, 38, this.B);
        dfxk.i(parcel, 39, this.C);
        dfxk.m(parcel, 40, this.D, false);
        dfxk.d(parcel, 41, this.E);
        dfxk.m(parcel, 42, this.F, false);
        dfxk.d(parcel, 43, this.G);
        dfxk.k(parcel, 44, this.H, i, false);
        dfxk.d(parcel, 45, this.I);
        dfxk.n(parcel, 46, this.J, false);
        dfxk.m(parcel, 47, this.K, false);
        dfxk.i(parcel, 48, this.L);
        dfxk.i(parcel, 49, this.M);
        dfxk.n(parcel, 50, this.N, false);
        dfxk.m(parcel, 51, this.O, false);
        dfxk.k(parcel, 52, this.P, i, false);
        dfxk.D(parcel, 53, this.Q);
        dfxk.c(parcel, a);
    }

    @Deprecated
    public GoogleHelp(String str) {
        this(23, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, BasePaymentResult.ERROR_REQUEST_FAILED, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
    }
}
