package com.google.android.gms.fido.u2f.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dglg;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator<RegisterRequestParams> CREATOR = new dglg();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final ChannelIdValue f;
    public final String g;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, ChannelIdValue channelIdValue, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        dfwv.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.d = list;
        this.e = list2;
        this.f = channelIdValue;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RegisterRequest registerRequest = (RegisterRequest) it.next();
            dfwv.b((uri == null && registerRequest.c == null) ? false : true, "register request has null appId and no request appId is provided");
            String str2 = registerRequest.c;
            if (str2 != null) {
                hashSet.add(Uri.parse(str2));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            RegisteredKey registeredKey = (RegisteredKey) it2.next();
            dfwv.b((uri == null && registeredKey.b == null) ? false : true, "registered key has null appId and no request appId is provided");
            String str3 = registeredKey.b;
            if (str3 != null) {
                hashSet.add(Uri.parse(str3));
            }
        }
        dfwv.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return dfwq.a(this.a, registerRequestParams.a) && dfwq.a(this.b, registerRequestParams.b) && dfwq.a(this.c, registerRequestParams.c) && dfwq.a(this.d, registerRequestParams.d) && (((list = this.e) == null && registerRequestParams.e == null) || (list != null && (list2 = registerRequestParams.e) != null && list.containsAll(list2) && registerRequestParams.e.containsAll(this.e))) && dfwq.a(this.f, registerRequestParams.f) && dfwq.a(this.g, registerRequestParams.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int a = dfxk.a(parcel);
        dfxk.x(parcel, 2, num);
        dfxk.r(parcel, 3, this.b);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.n(parcel, 5, this.d, false);
        dfxk.n(parcel, 6, this.e, false);
        dfxk.k(parcel, 7, this.f, i, false);
        dfxk.m(parcel, 8, this.g, false);
        dfxk.c(parcel, a);
    }
}
