package defpackage;

import com.google.android.apps.messaging.shared.annotation.VisibleForGson;

/* compiled from: PG */
@VisibleForGson
/* loaded from: classes8.dex */
public final class ckml {
    private final Boolean isFi;
    private final String mcc;
    private final String mnc;
    private final String networkOperator;
    private final String operatorName;
    private final eqwf rcsAvailability;
    private final int subId;
    private final String transportName;

    public /* synthetic */ ckml(String str, String str2, int i, eqwf eqwfVar, String str3, String str4, String str5, Boolean bool, ffkd ffkdVar) {
        this(str, str2, i, eqwfVar, str3, str4, str5, bool);
    }

    /* renamed from: copy-Ot2XPwA$default, reason: not valid java name */
    public static /* synthetic */ ckml m217copyOt2XPwA$default(ckml ckmlVar, String str, String str2, int i, eqwf eqwfVar, String str3, String str4, String str5, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ckmlVar.operatorName;
        }
        if ((i2 & 2) != 0) {
            str2 = ckmlVar.networkOperator;
        }
        if ((i2 & 4) != 0) {
            i = ckmlVar.subId;
        }
        if ((i2 & 8) != 0) {
            eqwfVar = ckmlVar.rcsAvailability;
        }
        if ((i2 & 16) != 0) {
            str3 = ckmlVar.transportName;
        }
        if ((i2 & 32) != 0) {
            str4 = ckmlVar.mcc;
        }
        if ((i2 & 64) != 0) {
            str5 = ckmlVar.mnc;
        }
        if ((i2 & 128) != 0) {
            bool = ckmlVar.isFi;
        }
        String str6 = str5;
        Boolean bool2 = bool;
        String str7 = str3;
        String str8 = str4;
        return ckmlVar.m219copyOt2XPwA(str, str2, i, eqwfVar, str7, str8, str6, bool2);
    }

    public final String component1() {
        return this.operatorName;
    }

    public final String component2() {
        return this.networkOperator;
    }

    /* renamed from: component3-zXW0w0o, reason: not valid java name */
    public final int m218component3zXW0w0o() {
        return this.subId;
    }

    public final eqwf component4() {
        return this.rcsAvailability;
    }

    public final String component5() {
        return this.transportName;
    }

    public final String component6() {
        return this.mcc;
    }

    public final String component7() {
        return this.mnc;
    }

    public final Boolean component8() {
        return this.isFi;
    }

    /* renamed from: copy-Ot2XPwA, reason: not valid java name */
    public final ckml m219copyOt2XPwA(String str, String str2, int i, eqwf eqwfVar, String str3, String str4, String str5, Boolean bool) {
        str3.getClass();
        return new ckml(str, str2, i, eqwfVar, str3, str4, str5, bool, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ckml)) {
            return false;
        }
        ckml ckmlVar = (ckml) obj;
        return ffkj.e(this.operatorName, ckmlVar.operatorName) && ffkj.e(this.networkOperator, ckmlVar.networkOperator) && djrq.b(this.subId, ckmlVar.subId) && this.rcsAvailability == ckmlVar.rcsAvailability && ffkj.e(this.transportName, ckmlVar.transportName) && ffkj.e(this.mcc, ckmlVar.mcc) && ffkj.e(this.mnc, ckmlVar.mnc) && ffkj.e(this.isFi, ckmlVar.isFi);
    }

    public final String getMcc() {
        return this.mcc;
    }

    public final String getMnc() {
        return this.mnc;
    }

    public final String getNetworkOperator() {
        return this.networkOperator;
    }

    public final String getOperatorName() {
        return this.operatorName;
    }

    public final eqwf getRcsAvailability() {
        return this.rcsAvailability;
    }

    /* renamed from: getSubId-zXW0w0o, reason: not valid java name */
    public final int m220getSubIdzXW0w0o() {
        return this.subId;
    }

    public final String getTransportName() {
        return this.transportName;
    }

    public int hashCode() {
        String str = this.operatorName;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.networkOperator;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode * 31;
        int i2 = this.subId;
        eqwf eqwfVar = this.rcsAvailability;
        int hashCode3 = (((((((i + hashCode2) * 31) + i2) * 31) + (eqwfVar == null ? 0 : eqwfVar.hashCode())) * 31) + this.transportName.hashCode()) * 31;
        String str3 = this.mcc;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.mnc;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.isFi;
        return hashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isFi() {
        return this.isFi;
    }

    public String toString() {
        return "RcsFeedbackSimInfo(operatorName=" + this.operatorName + ", networkOperator=" + this.networkOperator + ", subId=" + djrq.a(this.subId) + ", rcsAvailability=" + this.rcsAvailability + ", transportName=" + this.transportName + ", mcc=" + this.mcc + ", mnc=" + this.mnc + ", isFi=" + this.isFi + ")";
    }

    private ckml(String str, String str2, int i, eqwf eqwfVar, String str3, String str4, String str5, Boolean bool) {
        str3.getClass();
        this.operatorName = str;
        this.networkOperator = str2;
        this.subId = i;
        this.rcsAvailability = eqwfVar;
        this.transportName = str3;
        this.mcc = str4;
        this.mnc = str5;
        this.isFi = bool;
    }
}
