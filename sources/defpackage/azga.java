package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azga {
    public static final azga a = new azga(ffen.a, ffem.a);
    public final Set b;
    public final Map c;
    private final ffbz d;

    public azga(Set set, Map map) {
        set.getClass();
        this.b = set;
        this.c = map;
        this.d = ffca.a(new ffix() { // from class: azfy
            @Override // defpackage.ffix
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                azga azgaVar = azga.this;
                for (Object obj : azgaVar.b) {
                    Map map2 = azgaVar.c;
                    if (map2.values().contains(((azfx) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return ffdx.ar(arrayList);
            }
        });
        ffca.a(new ffix() { // from class: azfz
            @Override // defpackage.ffix
            public final Object invoke() {
                ArrayList arrayList = new ArrayList();
                azga azgaVar = azga.this;
                for (Object obj : azgaVar.b) {
                    Map map2 = azgaVar.c;
                    if (!map2.values().contains(((azfx) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                return ffdx.ar(arrayList);
            }
        });
    }

    public final Set a() {
        return (Set) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azga)) {
            return false;
        }
        azga azgaVar = (azga) obj;
        return ffkj.e(this.b, azgaVar.b) && ffkj.e(this.c, azgaVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "GroupMembers(members=" + this.b + ", activeMyIdentitiesInGroup=" + this.c + ")";
    }
}
