package defpackage;

import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevg {
    public final String a;
    public final Map b;

    public fevg(String str, Map map) {
        str.getClass();
        this.a = str;
        map.getClass();
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fevg) {
            fevg fevgVar = (fevg) obj;
            if (this.a.equals(fevgVar.a) && this.b.equals(fevgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("policyName", this.a);
        b.b("rawConfigValue", this.b);
        return b.toString();
    }
}
