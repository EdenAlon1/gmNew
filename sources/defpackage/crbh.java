package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crbh extends crei {
    public final MessageCoreData a;
    public final crbv b;

    public crbh(MessageCoreData messageCoreData, crbv crbvVar) {
        this.a = messageCoreData;
        this.b = crbvVar;
    }

    @Override // defpackage.crei
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.crei
    public final crbv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crei) {
            crei creiVar = (crei) obj;
            if (this.a.equals(creiVar.a()) && this.b.equals(creiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        crbv crbvVar = this.b;
        return "SendFileTransferRequest{messageCoreData=" + this.a.toString() + ", fileUploadInfo=" + crbvVar.toString() + "}";
    }
}
