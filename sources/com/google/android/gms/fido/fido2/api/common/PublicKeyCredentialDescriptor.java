package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyk;
import defpackage.dgif;
import defpackage.dgjw;
import defpackage.dgkb;
import defpackage.dgkp;
import defpackage.enip;
import defpackage.eyee;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublicKeyCredentialDescriptor> CREATOR;
    public final List a;
    private final PublicKeyCredentialType b;
    private final eyee c;

    static {
        enip.r(dgkp.a, dgkp.b);
        CREATOR = new dgjw();
    }

    public PublicKeyCredentialDescriptor(String str, byte[] bArr, List list) {
        eyee x = eyee.x(bArr);
        dfwv.n(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            this.c = x;
            this.a = list;
        } catch (dgkb e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static PublicKeyCredentialDescriptor a(JSONObject jSONObject) {
        String string = jSONObject.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        byte[] decode = Base64.decode(jSONObject.getString("id"), 11);
        ArrayList arrayList = null;
        if (jSONObject.has("transports")) {
            JSONArray jSONArray = jSONObject.getJSONArray("transports");
            Transport transport = Transport.BLUETOOTH_CLASSIC;
            if (jSONArray != null) {
                HashSet hashSet = new HashSet(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string2 = jSONArray.getString(i);
                    if (string2 != null && !string2.isEmpty()) {
                        try {
                            hashSet.add(Transport.a(string2));
                        } catch (dgif unused) {
                            Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                        }
                    }
                }
                arrayList = new ArrayList(hashSet);
            }
        }
        return new PublicKeyCredentialDescriptor(string, decode, arrayList);
    }

    public final byte[] b() {
        return this.c.I();
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.b.equals(publicKeyCredentialDescriptor.b) || !dfwq.a(this.c, publicKeyCredentialDescriptor.c)) {
            return false;
        }
        List list2 = this.a;
        if (list2 == null && publicKeyCredentialDescriptor.a == null) {
            return true;
        }
        return list2 != null && (list = publicKeyCredentialDescriptor.a) != null && list2.containsAll(list) && publicKeyCredentialDescriptor.a.containsAll(this.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.b) + ", \n id=" + dfyk.c(b()) + ", \n transports=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b.b;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.f(parcel, 3, b(), false);
        dfxk.n(parcel, 4, this.a, false);
        dfxk.c(parcel, a);
    }
}
