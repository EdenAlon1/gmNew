package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapu implements zqy {
    public final dmiy a;
    private final MessageId b;
    private final String c;

    public aapu(dmiy dmiyVar, MessageId messageId) {
        this.a = dmiyVar;
        this.b = messageId;
        String a = messageId.a();
        a.getClass();
        this.c = a;
    }

    @Override // defpackage.zqy
    public final MessageId a() {
        return this.b;
    }

    @Override // defpackage.dnmw
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aapu)) {
            return false;
        }
        aapu aapuVar = (aapu) obj;
        return ffkj.e(this.a, aapuVar.a) && ffkj.e(this.b, aapuVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneUiData(cardstoneUiData=" + this.a + ", messageId=" + this.b + ")";
    }
}
