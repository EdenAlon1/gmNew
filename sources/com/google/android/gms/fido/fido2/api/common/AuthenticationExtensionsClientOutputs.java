package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgir;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new dgir();
    public final UvmEntries a;
    public final AuthenticationExtensionsDevicePublicKeyOutputs b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final AuthenticationExtensionsPrfOutputs d;
    public final String e;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs, String str) {
        this.a = uvmEntries;
        this.b = authenticationExtensionsDevicePublicKeyOutputs;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = authenticationExtensionsPrfOutputs;
        this.e = str;
    }

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.a;
            if (uvmEntries != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (uvmEntries.a != null) {
                        for (int i = 0; i < uvmEntries.a.size(); i++) {
                            UvmEntry uvmEntry = (UvmEntry) uvmEntries.a.get(i);
                            JSONArray jSONArray2 = new JSONArray();
                            jSONArray2.put(uvmEntry.a);
                            jSONArray2.put(Short.toString(uvmEntry.b));
                            jSONArray2.put(Short.toString(uvmEntry.c));
                            jSONArray.put(i, jSONArray2);
                        }
                    }
                    jSONObject.put("uvm", jSONArray);
                } catch (JSONException e2) {
                    throw new RuntimeException("Error encoding UvmEntries to JSON object", e2);
                }
            }
            AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = this.d;
            if (authenticationExtensionsPrfOutputs != null) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    if (authenticationExtensionsPrfOutputs.a) {
                        jSONObject3.put("enabled", true);
                    }
                    byte[] b = authenticationExtensionsPrfOutputs.b();
                    if (b != null) {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("first", AuthenticationExtensionsPrfOutputs.a(Arrays.copyOf(b, 32)));
                        if (b.length == 64) {
                            jSONObject4.put("second", AuthenticationExtensionsPrfOutputs.a(Arrays.copyOfRange(b, 32, 64)));
                        }
                        jSONObject3.put("results", jSONObject4);
                    }
                    jSONObject.put("prf", jSONObject3);
                } catch (JSONException e3) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e3);
                }
            }
            Object obj = this.e;
            if (obj != null) {
                jSONObject.put("txAuthSimple", obj);
            }
            return jSONObject;
        } catch (JSONException e4) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e4);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return dfwq.a(this.a, authenticationExtensionsClientOutputs.a) && dfwq.a(this.b, authenticationExtensionsClientOutputs.b) && dfwq.a(this.c, authenticationExtensionsClientOutputs.c) && dfwq.a(this.d, authenticationExtensionsClientOutputs.d) && dfwq.a(this.e, authenticationExtensionsClientOutputs.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return "AuthenticationExtensionsClientOutputs{" + a().toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UvmEntries uvmEntries = this.a;
        int a = dfxk.a(parcel);
        dfxk.k(parcel, 1, uvmEntries, i, false);
        dfxk.k(parcel, 2, this.b, i, false);
        dfxk.k(parcel, 3, this.c, i, false);
        dfxk.k(parcel, 4, this.d, i, false);
        dfxk.m(parcel, 5, this.e, false);
        dfxk.c(parcel, a);
    }
}
