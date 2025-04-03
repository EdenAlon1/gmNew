package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewi;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterCorpusInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusInfo> CREATOR = new dewi();
    public final String a;
    public final String b;
    public final Uri c;
    public final RegisterSectionInfo[] d;
    public final GlobalSearchCorpusConfig e;
    public final boolean f;
    public final Account g;
    public final RegisterCorpusIMEInfo h;
    public final String i;

    @Deprecated
    public final boolean j;
    public final int k;

    public RegisterCorpusInfo(String str, String str2, Uri uri, RegisterSectionInfo[] registerSectionInfoArr, GlobalSearchCorpusConfig globalSearchCorpusConfig, boolean z, Account account, RegisterCorpusIMEInfo registerCorpusIMEInfo, String str3, boolean z2, int i) {
        this.a = str;
        this.b = str2;
        this.c = uri;
        this.d = registerSectionInfoArr;
        this.e = globalSearchCorpusConfig;
        this.f = z;
        this.g = account;
        this.h = registerCorpusIMEInfo;
        this.i = str3;
        this.j = z2;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusInfo)) {
            return false;
        }
        RegisterCorpusInfo registerCorpusInfo = (RegisterCorpusInfo) obj;
        return this.j == registerCorpusInfo.j && this.k == registerCorpusInfo.k && this.f == registerCorpusInfo.f && dfwq.a(this.a, registerCorpusInfo.a) && dfwq.a(this.b, registerCorpusInfo.b) && dfwq.a(this.c, registerCorpusInfo.c) && dfwq.a(this.e, registerCorpusInfo.e) && dfwq.a(this.h, registerCorpusInfo.h) && dfwq.a(this.g, registerCorpusInfo.g) && dfwq.a(this.i, registerCorpusInfo.i) && Arrays.equals(this.d, registerCorpusInfo.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, Boolean.valueOf(this.f), this.g, this.h, this.i, Boolean.valueOf(this.j), Integer.valueOf(this.k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.E(parcel, 4, this.d, i);
        dfxk.k(parcel, 7, this.e, i, false);
        dfxk.d(parcel, 8, this.f);
        dfxk.k(parcel, 9, this.g, i, false);
        dfxk.k(parcel, 10, this.h, i, false);
        dfxk.m(parcel, 11, this.i, false);
        dfxk.d(parcel, 12, this.j);
        dfxk.i(parcel, 13, this.k);
        dfxk.c(parcel, a);
    }
}
