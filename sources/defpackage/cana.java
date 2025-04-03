package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cana extends canr {
    public final MessageCoreData a;

    public cana(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        return camx.b(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cana) && ffkj.e(this.a, ((cana) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NonTombstone(message=" + this.a + ")";
    }
}
