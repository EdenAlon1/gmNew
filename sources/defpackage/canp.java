package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canp extends canr {
    public final MessageCoreData a;
    private final caof b;

    public canp(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        ffbz ffbzVar = caof.a;
        int k = messageCoreData.k();
        caof caofVar = (caof) ((Map) caof.a.a()).get(Integer.valueOf(k));
        if (caofVar == null) {
            throw new IllegalArgumentException(a.h(k, "Invalid protocol change tombstone status code "));
        }
        this.b = caofVar;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        return this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof canp) && ffkj.e(this.a, ((canp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProtocolSwitchTombstone(message=" + this.a + ")";
    }
}
