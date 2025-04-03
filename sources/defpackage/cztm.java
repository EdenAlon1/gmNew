package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztm implements ellf {
    public final List a;

    public cztm(List list) {
        list.getClass();
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cztm) && ffkj.e(this.a, ((cztm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CalendarBadgeClickEvent(suggestions=" + this.a + ")";
    }
}
