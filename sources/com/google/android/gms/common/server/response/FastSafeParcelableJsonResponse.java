package com.google.android.gms.common.server.response;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.dfwq;
import defpackage.dfwv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field field : b().values()) {
            if (c(field)) {
                if (!fastJsonResponse.c(field) || !dfwq.a(a(field), fastJsonResponse.a(field))) {
                    return false;
                }
            } else if (fastJsonResponse.c(field)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (FastJsonResponse.Field field : b().values()) {
            if (c(field)) {
                Object a = a(field);
                dfwv.n(a);
                i = (i * 31) + a.hashCode();
            }
        }
        return i;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void f() {
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public void g() {
    }
}
