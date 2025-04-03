package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camp extends canr {
    private final MessageCoreData a;
    private final caoa b;

    public camp(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        ffbz ffbzVar = caoa.a;
        int k = messageCoreData.k();
        caoa caoaVar = (caoa) ((Map) caoa.a.a()).get(Integer.valueOf(k));
        if (caoaVar == null) {
            throw new IllegalArgumentException(a.h(k, "Invalid group membership change tombstone status code "));
        }
        this.b = caoaVar;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        int ordinal = this.b.ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? camy.c : camy.d : camy.d : camy.d : camy.d : camy.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof camp) && ffkj.e(this.a, ((camp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GroupMembershipChangeTombstone(message=" + this.a + ")";
    }
}
