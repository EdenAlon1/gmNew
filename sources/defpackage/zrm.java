package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrm implements zqz {
    private final MessageId a;
    private final Long b;
    private final boolean c = false;
    private final axrc d;

    public zrm(MessageId messageId, Long l, axrc axrcVar) {
        this.a = messageId;
        this.b = l;
        this.d = axrcVar;
    }

    @Override // defpackage.zqz
    public final MessageId a() {
        return this.a;
    }

    @Override // defpackage.zqz
    public final axrc b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zrm)) {
            return false;
        }
        zrm zrmVar = (zrm) obj;
        if (!ffkj.e(this.a, zrmVar.a) || !ffkj.e(this.b, zrmVar.b)) {
            return false;
        }
        boolean z = zrmVar.c;
        return ffkj.e(this.d, zrmVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "EagerBugleMessageUiDataWrapper(id=" + this.a + ", timestamp=" + this.b + ", requiresImmediateRefresh=false, value=" + this.d + ")";
    }
}
