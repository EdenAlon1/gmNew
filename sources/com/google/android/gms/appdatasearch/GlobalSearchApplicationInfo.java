package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.devv;
import defpackage.dfxk;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class GlobalSearchApplicationInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GlobalSearchApplicationInfo> CREATOR = new devv();
    final String a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;

    public GlobalSearchApplicationInfo(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchApplicationInfo) {
            GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) obj;
            if (TextUtils.equals(this.a, globalSearchApplicationInfo.a) && TextUtils.equals(this.b, globalSearchApplicationInfo.b) && this.c == globalSearchApplicationInfo.c && this.d == globalSearchApplicationInfo.d && this.e == globalSearchApplicationInfo.e && TextUtils.equals(this.f, globalSearchApplicationInfo.f) && TextUtils.equals(this.g, globalSearchApplicationInfo.g) && TextUtils.equals(this.h, globalSearchApplicationInfo.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + this.a + ";sourceName=" + this.b + ";labelId=" + Integer.toHexString(this.c) + ";settingsDescriptionId=" + Integer.toHexString(this.d) + ";iconId=" + Integer.toHexString(this.e) + ";defaultIntentAction=" + this.f + ";defaultIntentData=" + this.g + ";defaultIntentActivity=" + this.h + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.i(parcel, 2, this.c);
        dfxk.i(parcel, 3, this.d);
        dfxk.i(parcel, 4, this.e);
        dfxk.m(parcel, 5, this.f, false);
        dfxk.m(parcel, 6, this.g, false);
        dfxk.m(parcel, 7, this.h, false);
        dfxk.m(parcel, 8, this.b, false);
        dfxk.c(parcel, a);
    }
}
