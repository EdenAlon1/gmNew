package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse;
import defpackage.a;
import defpackage.dfbg;
import defpackage.dfxk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AccountTransferMsg extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator<AccountTransferMsg> CREATOR = new dfbg();
    private static final HashMap f;
    final Set a;
    final int b;
    public ArrayList c;
    public int d;
    public AccountTransferProgress e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse.Field(11, true, 11, true, "authenticatorData", 2, AuthenticatorAnnotatedData.class));
        hashMap.put("progress", new FastJsonResponse.Field(11, false, 11, false, "progress", 4, AccountTransferProgress.class));
    }

    public AccountTransferMsg(Set set, int i, ArrayList arrayList, int i2, AccountTransferProgress accountTransferProgress) {
        this.a = set;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = accountTransferProgress;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object a(FastJsonResponse.Field field) {
        int i = field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return this.c;
        }
        if (i == 4) {
            return this.e;
        }
        throw new IllegalStateException(a.h(i, "Unknown SafeParcelable id="));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map b() {
        return f;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean c(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = dfxk.a(parcel);
        if (set.contains(1)) {
            dfxk.i(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            dfxk.n(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            dfxk.i(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            dfxk.k(parcel, 4, this.e, i, true);
        }
        dfxk.c(parcel, a);
    }

    public AccountTransferMsg() {
        this.a = new HashSet(1);
        this.b = 1;
    }
}
