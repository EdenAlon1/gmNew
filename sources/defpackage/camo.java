package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camo extends canr {
    private final MessageCoreData a;

    public camo(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        return camy.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof camo) && ffkj.e(this.a, ((camo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericTombstone(message=" + this.a + ")";
    }
}
