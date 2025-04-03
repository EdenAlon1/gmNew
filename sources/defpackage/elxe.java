package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elxe extends elxz {
    private final Optional a;
    private final Optional b;
    private final Optional c;
    private final Optional d;
    private final List e;

    public elxe(Optional optional, Optional optional2, Optional optional3, Optional optional4, List list) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
        this.d = optional4;
        this.e = list;
    }

    @Override // defpackage.elxz
    public final Optional a() {
        return this.d;
    }

    @Override // defpackage.elyv
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.elyv
    public final Optional c() {
        return this.b;
    }

    @Override // defpackage.elxz
    public final Optional d() {
        return this.c;
    }

    @Override // defpackage.elxz
    public final List e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elxz) {
            elxz elxzVar = (elxz) obj;
            if (this.a.equals(elxzVar.b()) && this.b.equals(elxzVar.c()) && this.c.equals(elxzVar.d()) && this.d.equals(elxzVar.a()) && this.e.equals(elxzVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        List list = this.e;
        Optional optional = this.d;
        Optional optional2 = this.c;
        Optional optional3 = this.b;
        return "CalendarEvent{id=" + String.valueOf(this.a) + ", name=" + String.valueOf(optional3) + ", startDate=" + String.valueOf(optional2) + ", endDate=" + String.valueOf(optional) + ", attendeeList=" + list.toString() + "}";
    }
}
