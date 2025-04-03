package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgli;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisteredKey> CREATOR = new dgli();
    public final KeyHandle a;
    public final String b;
    final String c;

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        dfwv.n(keyHandle);
        this.a = keyHandle;
        this.c = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisteredKey)) {
            return false;
        }
        RegisteredKey registeredKey = (RegisteredKey) obj;
        String str = this.c;
        if (str == null) {
            if (registeredKey.c != null) {
                return false;
            }
        } else if (!str.equals(registeredKey.c)) {
            return false;
        }
        if (!this.a.equals(registeredKey.a)) {
            return false;
        }
        String str2 = this.b;
        if (str2 == null) {
            if (registeredKey.b != null) {
                return false;
            }
        } else if (!str2.equals(registeredKey.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (((str == null ? 0 : str.hashCode()) + 31) * 31) + this.a.hashCode();
        String str2 = this.b;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("keyHandle", Base64.encodeToString(this.a.b, 11));
            if (this.a.c != ProtocolVersion.UNKNOWN) {
                jSONObject.put(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, this.a.c.d);
            }
            List list = this.a.d;
            if (list != null) {
                jSONObject.put("transports", list.toString());
            }
            String str = this.c;
            if (str != null) {
                jSONObject.put("challenge", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("appId", str2);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        KeyHandle keyHandle = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 2, keyHandle, i, false);
        dfxk.m(parcel, 3, this.c, false);
        dfxk.m(parcel, 4, this.b, false);
        dfxk.c(parcel, a);
    }
}
