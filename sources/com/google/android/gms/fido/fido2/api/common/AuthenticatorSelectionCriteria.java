package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dgio;
import defpackage.dgiz;
import defpackage.dgkf;
import defpackage.dgkm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new dgiz();
    public final Boolean a;
    private final Attachment b;
    private final UserVerificationRequirement c;
    private final ResidentKeyRequirement d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a = null;
        } else {
            try {
                a = Attachment.a(str);
            } catch (dgio | dgkf | dgkm e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.b = a;
        this.a = bool;
        this.c = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.d = residentKeyRequirement;
    }

    public final ResidentKeyRequirement a() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.a;
        return (bool == null || !bool.booleanValue()) ? ResidentKeyRequirement.RESIDENT_KEY_DISCOURAGED : ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return dfwq.a(this.b, authenticatorSelectionCriteria.b) && dfwq.a(this.a, authenticatorSelectionCriteria.a) && dfwq.a(this.c, authenticatorSelectionCriteria.c) && dfwq.a(a(), authenticatorSelectionCriteria.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, a()});
    }

    public final String toString() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        UserVerificationRequirement userVerificationRequirement = this.c;
        return "AuthenticatorSelectionCriteria{\n attachment=" + String.valueOf(this.b) + ", \n requireResidentKey=" + this.a + ", \n requireUserVerification=" + String.valueOf(userVerificationRequirement) + ", \n residentKeyRequirement=" + String.valueOf(residentKeyRequirement) + "\n }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        Attachment attachment = this.b;
        dfxk.m(parcel, 2, attachment == null ? null : attachment.c, false);
        dfxk.o(parcel, 3, this.a);
        UserVerificationRequirement userVerificationRequirement = this.c;
        dfxk.m(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.d, false);
        ResidentKeyRequirement a2 = a();
        dfxk.m(parcel, 5, a2 != null ? a2.d : null, false);
        dfxk.c(parcel, a);
    }
}
