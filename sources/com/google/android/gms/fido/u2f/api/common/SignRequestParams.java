package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dglj;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator<SignRequestParams> CREATOR = new dglj();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = list;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                RegisteredKey registeredKey = (RegisteredKey) it.next();
                dfwv.b((registeredKey.b == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                String str2 = registeredKey.c;
                dfwv.b(true, "register request has null challenge and no default challenge isprovided");
                String str3 = registeredKey.b;
                if (str3 != null) {
                    hashSet.add(Uri.parse(str3));
                }
            }
        }
        dfwv.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return dfwq.a(this.a, signRequestParams.a) && dfwq.a(this.b, signRequestParams.b) && dfwq.a(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d) && this.e.containsAll(signRequestParams.e) && signRequestParams.e.containsAll(this.e) && dfwq.a(this.f, signRequestParams.f) && dfwq.a(this.g, signRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = dfxk.a(parcel);
        dfxk.x(parcel, 2, num);
        dfxk.r(parcel, 3, this.b);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.f(parcel, 5, this.d, false);
        dfxk.n(parcel, 6, this.e, false);
        dfxk.k(parcel, 7, this.f, i, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.c(parcel, a);
    }
}
