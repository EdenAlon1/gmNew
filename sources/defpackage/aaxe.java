package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxe {
    public final List a;
    public final aaxg b;
    public final boolean c;
    public final Boolean d;
    private final ffbz e;

    public aaxe() {
        this(null, 15);
    }

    public final aaxf a() {
        return (aaxf) this.e.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaxe)) {
            return false;
        }
        aaxe aaxeVar = (aaxe) obj;
        return ffkj.e(this.a, aaxeVar.a) && ffkj.e(this.b, aaxeVar.b) && this.c == aaxeVar.c && ffkj.e(this.d, aaxeVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aaxg aaxgVar = this.b;
        int hashCode2 = (((hashCode + (aaxgVar == null ? 0 : aaxgVar.hashCode())) * 31) + (true != this.c ? 1237 : 1231)) * 31;
        Boolean bool = this.d;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "SelectionData(messages=" + this.a + ", offset=" + this.b + ", isOnFirstSelection=" + this.c + ", isSpatulaSettingsEnabled=" + this.d + ")";
    }

    public aaxe(List list, aaxg aaxgVar, boolean z, Boolean bool) {
        list.getClass();
        this.a = list;
        this.b = aaxgVar;
        this.c = z;
        this.d = bool;
        this.e = ffca.a(new ffix() { // from class: aaxd
            @Override // defpackage.ffix
            public final Object invoke() {
                Boolean bool2;
                aaxe aaxeVar = aaxe.this;
                List list2 = aaxeVar.a;
                boolean z2 = false;
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        appj g = ((alxr) it.next()).g();
                        if (cubs.f() && (bool2 = aaxeVar.d) != null && bool2.booleanValue() && (g instanceof appq)) {
                            appq appqVar = (appq) g;
                            if (appqVar.n() == 3 || appqVar.n() == 4) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                }
                int size = aaxeVar.a.size();
                return size != 0 ? size != 1 ? z2 ? aaxf.e : aaxf.c : z2 ? aaxf.d : aaxf.b : aaxf.a;
            }
        });
    }

    public /* synthetic */ aaxe(List list, int i) {
        this((i & 1) != 0 ? ffel.a : list, null, false, null);
    }
}
