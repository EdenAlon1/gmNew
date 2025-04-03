package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxf extends sxg {
    public final List a;
    public final boolean b;
    public final ffix c;

    public sxf(List list, boolean z, ffix ffixVar) {
        this.a = list;
        this.b = z;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxf)) {
            return false;
        }
        sxf sxfVar = (sxf) obj;
        return ffkj.e(this.a, sxfVar.a) && this.b == sxfVar.b && ffkj.e(this.c, sxfVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Success(blockedParticipantListItems=" + this.a + ", measureListInteractive=" + this.b + ", onListInteractive=" + this.c + ")";
    }
}
