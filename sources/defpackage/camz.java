package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class camz extends canr {
    private static final cskc b = cskc.g("BugleEtouffee", "NewConversationTombstone");
    public final MessageCoreData a;
    private final caoc c;

    public camz(MessageCoreData messageCoreData) {
        this.a = messageCoreData;
        ffbz ffbzVar = caoc.a;
        int k = messageCoreData.k();
        caoc caocVar = (caoc) ((Map) caoc.a.a()).get(Integer.valueOf(k));
        if (caocVar == null) {
            throw new IllegalArgumentException(a.h(k, "Invalid new conversation tombstone status code "));
        }
        this.c = caocVar;
    }

    @Override // defpackage.canr
    public final MessageCoreData a() {
        return this.a;
    }

    @Override // defpackage.canr
    public final camy b() {
        return this.c.a();
    }

    public final caoc c(camy camyVar) {
        camyVar.getClass();
        int ordinal = camyVar.ordinal();
        if (ordinal == 0) {
            b.r("Unknown group tombstone protocol");
            return null;
        }
        if (ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            caoc caocVar = this.c;
            int ordinal2 = caocVar.ordinal();
            return ordinal2 != 1 ? (ordinal2 == 3 || ordinal2 == 4) ? caoc.d : caocVar : caoc.b;
        }
        if (ordinal != 3) {
            throw new ffcd();
        }
        caoc caocVar2 = this.c;
        int ordinal3 = caocVar2.ordinal();
        return ordinal3 != 0 ? (ordinal3 == 2 || ordinal3 == 3) ? caoc.f : caocVar2 : caoc.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof camz) && ffkj.e(this.a, ((camz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NewConversationTombstone(message=" + this.a + ")";
    }
}
