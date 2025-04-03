package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahjt extends ahjv {
    private final MessageIdType a;
    private final SuperSortLabel b;
    private final Optional c;

    public ahjt(MessageIdType messageIdType, SuperSortLabel superSortLabel, Optional optional) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = superSortLabel;
        this.c = optional;
    }

    @Override // defpackage.ahjv
    public final SuperSortLabel a() {
        return this.b;
    }

    @Override // defpackage.ahjv
    public final MessageIdType b() {
        return this.a;
    }

    @Override // defpackage.ahjv
    public final Optional c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahjv) {
            ahjv ahjvVar = (ahjv) obj;
            if (this.a.equals(ahjvVar.b()) && this.b.equals(ahjvVar.a()) && this.c.equals(ahjvVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Optional optional = this.c;
        SuperSortLabel superSortLabel = this.b;
        return "ChangeCategoryEvent{messageId=" + this.a.toString() + ", label=" + superSortLabel.toString() + ", donationMessage=" + optional.toString() + "}";
    }
}
