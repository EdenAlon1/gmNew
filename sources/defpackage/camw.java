package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camw extends canr {
    private final MessageCoreData a;

    public camw(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        return this.a.cB() ? camy.d : camy.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof camw) && ffkj.e(this.a, ((camw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupRenameTombstone(message=" + this.a + ")";
    }
}
