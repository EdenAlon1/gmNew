package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edlk extends edpi {
    public final edph a;
    public final List b;
    public final List c;
    public final List d;

    public edlk(edph edphVar, List list, List list2, List list3) {
        this.a = edphVar;
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.b = list;
        if (list2 == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.c = list2;
        if (list3 == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.d = list3;
    }

    @Override // defpackage.edpi
    public final edph a() {
        return this.a;
    }

    @Override // defpackage.edpi
    public final List b() {
        return this.b;
    }

    @Override // defpackage.edpi
    public final List c() {
        return this.c;
    }

    @Override // defpackage.edpi
    public final List d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpi) {
            edpi edpiVar = (edpi) obj;
            edph edphVar = this.a;
            if (edphVar != null ? edphVar.equals(edpiVar.a()) : edpiVar.a() == null) {
                if (this.b.equals(edpiVar.b()) && this.c.equals(edpiVar.c()) && this.d.equals(edpiVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        edph edphVar = this.a;
        return (((((((edphVar == null ? 0 : edphVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        List list = this.d;
        List list2 = this.c;
        List list3 = this.b;
        return "OpeningHours{hoursType=" + String.valueOf(this.a) + ", periods=" + list3.toString() + ", specialDays=" + list2.toString() + ", weekdayText=" + list.toString() + "}";
    }
}
