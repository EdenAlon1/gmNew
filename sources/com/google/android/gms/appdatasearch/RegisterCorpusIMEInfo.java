package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dewh;
import defpackage.dfwq;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterCorpusIMEInfo> CREATOR = new dewh();
    public final int a;
    public final String[] b;
    public final String c;
    public final String d;
    public final String[] e;
    public final String f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.a = i;
        this.b = strArr;
        this.c = str;
        this.d = str2;
        this.e = strArr2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        return this.a == registerCorpusIMEInfo.a && Arrays.equals(this.b, registerCorpusIMEInfo.b) && dfwq.a(this.c, registerCorpusIMEInfo.c) && dfwq.a(this.d, registerCorpusIMEInfo.d) && Arrays.equals(this.e, registerCorpusIMEInfo.e) && dfwq.a(this.f, registerCorpusIMEInfo.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.C(parcel, 2, this.b);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.m(parcel, 6, this.f, false);
        dfxk.C(parcel, 7, this.e);
        dfxk.c(parcel, a);
    }
}
