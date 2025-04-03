package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfxk;
import defpackage.dhuv;
import defpackage.dhuw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ConsentInformation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConsentInformation> CREATOR;
    public final boolean a;
    public final boolean b;
    private final List c;

    /* compiled from: PG */
    public static class AccountConsentInformation extends AbstractSafeParcelable {
        public static final Parcelable.Creator<AccountConsentInformation> CREATOR = new dhuv();
        public final String a;
        public final byte[] b;
        public final List c;

        public AccountConsentInformation(String str, byte[] bArr, List list) {
            this.a = str;
            this.b = bArr;
            this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AccountConsentInformation)) {
                return false;
            }
            AccountConsentInformation accountConsentInformation = (AccountConsentInformation) obj;
            return dfwq.a(this.a, accountConsentInformation.a) && dfwq.a(this.b, accountConsentInformation.b) && dfwq.a(this.c, accountConsentInformation.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = dfxk.a(parcel);
            dfxk.m(parcel, 1, str, false);
            dfxk.f(parcel, 2, this.b, false);
            dfxk.w(parcel, 3, new ArrayList(this.c));
            dfxk.c(parcel, a);
        }
    }

    static {
        new ConsentInformation(null, false, false);
        CREATOR = new dhuw();
    }

    public ConsentInformation(List list, boolean z, boolean z2) {
        this.c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConsentInformation)) {
            return false;
        }
        ConsentInformation consentInformation = (ConsentInformation) obj;
        return dfwq.a(this.c, consentInformation.c) && dfwq.a(Boolean.valueOf(this.a), Boolean.valueOf(consentInformation.a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Boolean.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.n(parcel, 1, new ArrayList(this.c), false);
        dfxk.d(parcel, 2, this.a);
        dfxk.d(parcel, 3, this.b);
        dfxk.c(parcel, a);
    }
}
