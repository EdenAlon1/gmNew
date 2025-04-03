package defpackage;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fcr implements fen {
    private final cnf a;
    private final List b;
    private final int c;
    private final int d;
    private final boolean e;
    private final fcy f;

    public fcr(cnf cnfVar, List list, int i, int i2, boolean z, fcy fcyVar) {
        this.a = cnfVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = fcyVar;
        if (list.size() > 1) {
            return;
        }
        dwv.d("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    public static final void n(coc cocVar, fcy fcyVar, fcw fcwVar, int i, int i2) {
        fcy c = fcyVar.c ? fcwVar.c(i2, i) : fcwVar.c(i, i2);
        if (i > i2) {
            Objects.toString(c);
            dwv.d("minOffset should be less than or equal to maxOffset: ".concat(c.toString()));
        }
        cocVar.g(fcwVar.a, c);
    }

    private final int p(long j) {
        try {
            return this.a.b(j);
        } catch (NoSuchElementException e) {
            throw new IllegalStateException(a.s(j, "Invalid selectableId: "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int q(int i, boolean z) {
        int o = o() - 1;
        int i2 = z;
        if (o != 1) {
            i2 = (o == 2 || z == 0) ? 1 : 0;
        }
        return (i - (i2 ^ 1)) / 2;
    }

    @Override // defpackage.fen
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fen
    public final int b() {
        return this.b.size();
    }

    @Override // defpackage.fen
    public final int c() {
        return this.c;
    }

    @Override // defpackage.fen
    public final cnj d(fcy fcyVar) {
        fcx fcxVar = fcyVar.a;
        long j = fcxVar.c;
        fcx fcxVar2 = fcyVar.b;
        if (j == fcxVar2.c) {
            if (!fcyVar.c ? fcxVar.b > fcxVar2.b : fcxVar.b < fcxVar2.b) {
                Objects.toString(fcyVar);
                dwv.d("unexpectedly miss-crossed selection: ".concat(fcyVar.toString()));
            }
            return cnk.b(fcyVar.a.c, fcyVar);
        }
        int i = cnk.a;
        coc cocVar = new coc((byte[]) null);
        n(cocVar, fcyVar, g(), (fcyVar.c ? fcyVar.b : fcyVar.a).b, g().a());
        k(new fcq(cocVar, fcyVar));
        n(cocVar, fcyVar, h(), 0, (fcyVar.c ? fcyVar.a : fcyVar.b).b);
        return cocVar;
    }

    @Override // defpackage.fen
    public final fcw e() {
        return this.e ? i() : f();
    }

    @Override // defpackage.fen
    public final fcw f() {
        return (fcw) this.b.get(q(this.d, false));
    }

    @Override // defpackage.fen
    public final fcw g() {
        return o() == 1 ? f() : i();
    }

    public final fcw h() {
        return o() == 1 ? i() : f();
    }

    @Override // defpackage.fen
    public final fcw i() {
        return (fcw) this.b.get(q(this.c, true));
    }

    @Override // defpackage.fen
    public final fcy j() {
        return this.f;
    }

    @Override // defpackage.fen
    public final void k(ffji ffjiVar) {
        int p = p(g().a);
        int p2 = p(h().a);
        int i = p + 1;
        if (i < p2) {
            while (i < p2) {
                ffjiVar.invoke(this.b.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.fen
    public final boolean l() {
        return this.e;
    }

    @Override // defpackage.fen
    public final boolean m(fen fenVar) {
        if (this.f == null || fenVar == null || !(fenVar instanceof fcr) || this.e != fenVar.l() || this.c != fenVar.c() || this.d != fenVar.a()) {
            return true;
        }
        fcr fcrVar = (fcr) fenVar;
        if (b() != fcrVar.b()) {
            return true;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((fcw) this.b.get(i)).e((fcw) fcrVar.b.get(i))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fen
    public final int o() {
        int i = this.c;
        int i2 = this.d;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return ((fcw) this.b.get(i / 2)).f();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb.append(this.e);
        sb.append(", startPosition=");
        boolean z = true;
        sb.append((this.c + 1) / 2.0f);
        sb.append(", endPosition=");
        sb.append((this.d + 1) / 2.0f);
        sb.append(", crossed=");
        sb.append((Object) fcm.a(o()));
        sb.append(", infos=");
        StringBuilder sb2 = new StringBuilder("[\n\t");
        List list = this.b;
        int size = list.size();
        int i = 0;
        while (i < size) {
            fcw fcwVar = (fcw) list.get(i);
            if (!z) {
                sb2.append(",\n\t");
            }
            StringBuilder sb3 = new StringBuilder();
            i++;
            sb3.append(i);
            sb3.append(" -> ");
            sb3.append(fcwVar);
            sb2.append(sb3.toString());
            z = false;
        }
        sb2.append("\n]");
        sb.append(sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
