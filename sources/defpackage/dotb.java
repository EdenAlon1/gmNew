package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dotb {
    public final dosl a;
    public final dlsr b;
    public final List c;
    public final boolean d;
    public final boolean e;
    public final ffji f;
    private final dota g;

    public /* synthetic */ dotb(dosl doslVar, dlsr dlsrVar, List list, boolean z, boolean z2, ffji ffjiVar, dota dotaVar, int i) {
        list = (i & 4) != 0 ? ffel.a : list;
        boolean z3 = z | (!((i & 8) == 0));
        boolean z4 = z2 & ((i & 16) == 0);
        ffjiVar = (i & 32) != 0 ? new ffji() { // from class: dosz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((Context) obj).getClass();
                return ffcu.a;
            }
        } : ffjiVar;
        dotaVar = (i & 64) != 0 ? new dota(null) : dotaVar;
        dlsrVar.getClass();
        list.getClass();
        ffjiVar.getClass();
        dotaVar.getClass();
        this.a = doslVar;
        this.b = dlsrVar;
        this.c = list;
        this.d = z3;
        this.e = z4;
        this.f = ffjiVar;
        this.g = dotaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dotb)) {
            return false;
        }
        dotb dotbVar = (dotb) obj;
        return ffkj.e(this.a, dotbVar.a) && ffkj.e(this.b, dotbVar.b) && ffkj.e(this.c, dotbVar.c) && this.d == dotbVar.d && this.e == dotbVar.e && ffkj.e(this.f, dotbVar.f) && ffkj.e(this.g, dotbVar.g);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        ffji ffjiVar = this.f;
        return (((((((hashCode * 31) + dosy.a(this.d)) * 31) + dosy.a(this.e)) * 31) + ffjiVar.hashCode()) * 31) + 39584;
    }

    public final String toString() {
        return "TopAppBarUiData(middleUiData=" + this.a + ", onBackAction=" + this.b + ", actions=" + this.c + ", liftOnScroll=" + this.d + ", isTranslucent=" + this.e + ", onInteractive=" + this.f + ", flags=" + this.g + ")";
    }
}
