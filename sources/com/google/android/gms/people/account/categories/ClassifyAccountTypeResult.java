package com.google.android.gms.people.account.categories;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfxk;
import defpackage.dhgr;
import defpackage.dhgs;
import defpackage.dhgu;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.emxb;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClassifyAccountTypeResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClassifyAccountTypeResult> CREATOR = new dhgu();
    public final String a;
    public final String b;
    private final dhgr c;
    private final dhgs d;

    public ClassifyAccountTypeResult(String str, String str2, int i, int i2) {
        dhgr dhgrVar;
        this.a = str;
        this.b = str2;
        dhgs dhgsVar = null;
        switch (i) {
            case 0:
                dhgrVar = dhgr.UNKNOWN;
                break;
            case 1:
                dhgrVar = dhgr.NULL_ACCOUNT;
                break;
            case 2:
                dhgrVar = dhgr.GOOGLE;
                break;
            case 3:
                dhgrVar = dhgr.DEVICE;
                break;
            case 4:
                dhgrVar = dhgr.SIM;
                break;
            case 5:
                dhgrVar = dhgr.EXCHANGE;
                break;
            case 6:
                dhgrVar = dhgr.THIRD_PARTY_EDITABLE;
                break;
            case 7:
                dhgrVar = dhgr.THIRD_PARTY_READONLY;
                break;
            case 8:
                dhgrVar = dhgr.SIM_SDN;
                break;
            case 9:
                dhgrVar = dhgr.PRELOAD_SDN;
                break;
            default:
                dhgrVar = null;
                break;
        }
        this.c = dhgrVar == null ? dhgr.UNKNOWN : dhgrVar;
        if (i2 == 0) {
            dhgsVar = dhgs.UNKNOWN;
        } else if (i2 == 1) {
            dhgsVar = dhgs.NONE;
        } else if (i2 == 2) {
            dhgsVar = dhgs.EXACT;
        } else if (i2 == 3) {
            dhgsVar = dhgs.SUBSTRING;
        } else if (i2 == 4) {
            dhgsVar = dhgs.HEURISTIC;
        } else if (i2 == 5) {
            dhgsVar = dhgs.SHEEPDOG_ELIGIBLE;
        }
        this.d = dhgsVar == null ? dhgs.UNKNOWN : dhgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ClassifyAccountTypeResult classifyAccountTypeResult = (ClassifyAccountTypeResult) obj;
            if (emxb.a(this.a, classifyAccountTypeResult.a) && emxb.a(this.b, classifyAccountTypeResult.b) && this.c == classifyAccountTypeResult.c && this.d == classifyAccountTypeResult.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("accountType", this.a);
        b.b("dataSet", this.b);
        b.b("category", this.c);
        b.b("matchTag", this.d);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 1, str, false);
        dfxk.m(parcel, 2, this.b, false);
        dfxk.i(parcel, 3, this.c.k);
        dfxk.i(parcel, 4, this.d.g);
        dfxk.c(parcel, a);
    }
}
