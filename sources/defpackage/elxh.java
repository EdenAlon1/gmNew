package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elxh extends elyc {
    private final Optional a;
    private final Optional b;
    private final List c;

    public elxh(Optional optional, Optional optional2, List list) {
        this.a = optional;
        this.b = optional2;
        this.c = list;
    }

    @Override // defpackage.elyc
    public final List a() {
        return this.c;
    }

    @Override // defpackage.elyv
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.elyv
    public final Optional c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elyc) {
            elyc elycVar = (elyc) obj;
            if (this.a.equals(elycVar.b()) && this.b.equals(elycVar.c()) && this.c.equals(elycVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        List list = this.c;
        Optional optional = this.b;
        return "ItemList{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional) + ", listItems=" + list.toString() + "}";
    }
}
