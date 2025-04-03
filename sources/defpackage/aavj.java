package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavj {
    public final String a;
    public final MessageIdType b;
    public final eylg c;
    public final String d;

    public aavj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aavj)) {
            return false;
        }
        aavj aavjVar = (aavj) obj;
        return ffkj.e(this.a, aavjVar.a) && ffkj.e(this.b, aavjVar.b) && ffkj.e(this.c, aavjVar.c) && ffkj.e(this.d, aavjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        MessageIdType messageIdType = this.b;
        int hashCode2 = messageIdType == null ? 0 : messageIdType.hashCode();
        int i = hashCode * 31;
        eylg eylgVar = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (eylgVar == null ? 0 : eylgVar.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "EffectInfo(suggestionId=" + this.a + ", messageId=" + this.b + ", effect=" + this.c + ", effectLabel=" + this.d + ")";
    }

    public aavj(String str, MessageIdType messageIdType, eylg eylgVar, String str2) {
        this.a = str;
        this.b = messageIdType;
        this.c = eylgVar;
        this.d = str2;
    }

    public /* synthetic */ aavj(byte[] bArr) {
        this(null, null, null, null);
    }
}
