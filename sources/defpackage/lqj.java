package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqj {
    public final String a;
    public final String b;

    static {
        lvf.N(0);
        lvf.N(1);
    }

    public lqj(String str, String str2) {
        this.a = lvf.P(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lqj lqjVar = (lqj) obj;
            String str = this.a;
            String str2 = lqjVar.a;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Objects.equals(this.b, lqjVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
