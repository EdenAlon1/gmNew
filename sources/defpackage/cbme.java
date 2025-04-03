package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbme extends cbne {
    private final Collection a;
    private final Map b;
    private final Collection c;
    private final Collection d;

    public cbme(Collection collection, Map map, Collection collection2, Collection collection3) {
        if (collection == null) {
            throw new NullPointerException("Null matchingMessageIds");
        }
        this.a = collection;
        this.b = map;
        this.c = collection2;
        this.d = collection3;
    }

    @Override // defpackage.cbne
    public final Collection a() {
        return this.c;
    }

    @Override // defpackage.cbne
    public final Collection b() {
        return this.d;
    }

    @Override // defpackage.cbne
    public final Collection c() {
        return this.a;
    }

    @Override // defpackage.cbne
    public final Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbne) {
            cbne cbneVar = (cbne) obj;
            if (this.a.equals(cbneVar.c()) && this.b.equals(cbneVar.d()) && this.c.equals(cbneVar.a()) && this.d.equals(cbneVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        Collection collection = this.d;
        Collection collection2 = this.c;
        Map map = this.b;
        return "IcingMessageSearchResults{matchingMessageIds=" + this.a.toString() + ", matchingConversationParts=" + map.toString() + ", matchingLinkIds=" + collection2.toString() + ", matchingLocationIds=" + collection.toString() + "}";
    }
}
