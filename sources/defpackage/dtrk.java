package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtrk extends dtzh {
    private final String a;
    private final List b;

    public dtrk(String str, List list) {
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null args");
        }
        this.b = list;
    }

    @Override // defpackage.dtzh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dtzh
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtzh) {
            dtzh dtzhVar = (dtzh) obj;
            String str = this.a;
            if (str != null ? str.equals(dtzhVar.a()) : dtzhVar.a() == null) {
                if (this.b.equals(dtzhVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SqlAndArgs{sql=" + this.a + ", args=" + this.b.toString() + "}";
    }
}
