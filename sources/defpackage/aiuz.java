package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiuz extends aivb {
    private final MessageIdType a;
    private final SuperSortLabel b;

    public aiuz(MessageIdType messageIdType, SuperSortLabel superSortLabel) {
        this.a = messageIdType;
        if (superSortLabel == null) {
            throw new NullPointerException("Null label");
        }
        this.b = superSortLabel;
    }

    @Override // defpackage.aivb
    public final SuperSortLabel a() {
        return this.b;
    }

    @Override // defpackage.aivb
    public final MessageIdType b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aivb) {
            aivb aivbVar = (aivb) obj;
            if (this.a.equals(aivbVar.b()) && this.b.equals(aivbVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        SuperSortLabel superSortLabel = this.b;
        return "SaveOtpEvent{messageId=" + this.a.toString() + ", label=" + superSortLabel.toString() + "}";
    }
}
