package com.google.android.gms.auth.proximity.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.proximity.AttestationVerifier;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfis;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.engw;
import defpackage.enou;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SyncedCryptauthDevice extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncedCryptauthDevice> CREATOR = new dfis();
    final byte[] a;
    final String b;
    final String c;
    final String d;
    final boolean e;
    final boolean f;
    final long g;
    final boolean h;
    final String i;
    final boolean j;
    final boolean k;
    final List l;
    final List m;
    final List n;
    final AttestationVerifier o;

    public SyncedCryptauthDevice(byte[] bArr, String str, String str2, String str3, boolean z, boolean z2, long j, boolean z3, String str4, boolean z4, boolean z5, List list, List list2, List list3, AttestationVerifier attestationVerifier) {
        engw n;
        dfwv.n(bArr);
        this.a = bArr;
        dfwv.l(str);
        this.b = str;
        this.c = str2 == null ? "" : str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = z3;
        this.i = str4;
        this.j = z4;
        this.k = z5;
        this.l = list;
        this.m = list2;
        if (list3 == null) {
            int i = engw.d;
            n = enou.a;
        } else {
            n = engw.n(list3);
        }
        this.n = n;
        this.o = attestationVerifier;
    }

    private static String a(List list) {
        return "[ " + TextUtils.join(", ", list) + " ]";
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SyncedCryptauthDevice)) {
            return false;
        }
        SyncedCryptauthDevice syncedCryptauthDevice = (SyncedCryptauthDevice) obj;
        if (Arrays.equals(this.a, syncedCryptauthDevice.a) && TextUtils.equals(this.b, syncedCryptauthDevice.b) && TextUtils.equals(this.c, syncedCryptauthDevice.c) && this.f == syncedCryptauthDevice.f && this.e == syncedCryptauthDevice.e && this.h == syncedCryptauthDevice.h && TextUtils.equals(this.d, syncedCryptauthDevice.d) && TextUtils.equals(this.i, syncedCryptauthDevice.i) && this.j == syncedCryptauthDevice.j && this.k == syncedCryptauthDevice.k) {
            if (this.m.size() == syncedCryptauthDevice.m.size() && this.m.containsAll(syncedCryptauthDevice.m)) {
                if (this.l.size() == syncedCryptauthDevice.l.size() && this.n.equals(syncedCryptauthDevice.n) && this.l.containsAll(syncedCryptauthDevice.l) && dfwq.a(this.o, syncedCryptauthDevice.o)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), this.l, this.m, this.n, this.o});
    }

    public final String toString() {
        return String.format("SyncedCryptauthDevice { mPublicKey='%s', mAccountId=%s, mName='%s', mIsUnlockable=%b, mIsUnlockKey=%b, mIsMobileHotspotSupported=%b, mBtMacAddress='%s', mDeviceType=%s, mIsPixelPhone=%s, isArcPlusPlus=%s, supportedFeatures=%s, enabledFeatures=%s}", dfyk.b(this.a), this.b, this.c, Boolean.valueOf(this.f), Boolean.valueOf(this.e), Boolean.valueOf(this.h), this.d, this.i, Boolean.valueOf(this.j), Boolean.valueOf(this.k), a(this.l), a(this.m));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = dfxk.a(parcel);
        dfxk.f(parcel, 1, bArr, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.d(parcel, 5, this.e);
        dfxk.d(parcel, 6, this.f);
        dfxk.j(parcel, 7, this.g);
        dfxk.d(parcel, 8, this.h);
        dfxk.m(parcel, 9, this.i, false);
        dfxk.d(parcel, 10, this.j);
        dfxk.d(parcel, 11, this.k);
        dfxk.D(parcel, 12, this.l);
        dfxk.D(parcel, 13, this.m);
        dfxk.n(parcel, 14, this.n, false);
        dfxk.k(parcel, 15, this.o, i, false);
        dfxk.c(parcel, a);
    }
}
