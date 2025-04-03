package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iui implements hez, iqn, iwy, ioh, jjp, ist, iww {
    public ffji A;
    public ffji B;
    public boolean C;
    public boolean D;
    public int E;
    private final boolean H;
    private int I;
    private final ivr J;
    private hne K;
    private boolean L;
    private iui M;
    private jjn N;
    private final hne O;
    private boolean P;
    private itq Q;
    private iwi R;
    private boolean S;
    private hvi T;
    private hvi U;
    private int V;
    public int d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public iui k;
    public iwx l;
    public kbs m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public ipn r;
    public jzn s;
    public kah t;
    public jgi u;
    public hgb v;
    public boolean w;
    public final ivu x;
    public final iun y;
    public ipa z;
    private static final iuf F = new iud();
    public static final ffix b = iub.a;
    private static final jgi G = new iuc();
    public static final Comparator c = new Comparator() { // from class: iua
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            iui iuiVar = (iui) obj;
            iui iuiVar2 = (iui) obj2;
            ffix ffixVar = iui.b;
            return iuiVar.m() == iuiVar2.m() ? ffkj.a(iuiVar.o(), iuiVar2.o()) : Float.compare(iuiVar.m(), iuiVar2.m());
        }
    };

    public iui() {
        this(false, 3, null);
    }

    private final String aG(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        hne s = s();
        Object[] objArr = s.a;
        int i3 = s.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((iui) objArr[i4]).aG(i + 1));
        }
        String sb2 = sb.toString();
        if (i != 0) {
            return sb2;
        }
        String substring = sb2.substring(0, sb2.length() - 1);
        substring.getClass();
        return substring;
    }

    private final String aH(iui iuiVar) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(iuiVar);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(at(this));
        sb.append(" Other tree: ");
        iui iuiVar2 = iuiVar.M;
        sb.append(iuiVar2 != null ? at(iuiVar2) : null);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aI(defpackage.hvi r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iui.aI(hvi):void");
    }

    private final void aJ() {
        iui iuiVar;
        if (this.I > 0) {
            this.L = true;
        }
        if (!this.H || (iuiVar = this.M) == null) {
            return;
        }
        iuiVar.aJ();
    }

    private final void aK(iui iuiVar) {
        if (iuiVar.y.k > 0) {
            this.y.g(r0.k - 1);
        }
        if (this.l != null) {
            iuiVar.M();
        }
        iuiVar.M = null;
        iuiVar.z().v = null;
        if (iuiVar.H) {
            this.I--;
            hne hneVar = iuiVar.J.a;
            Object[] objArr = hneVar.a;
            int i = hneVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                ((iui) objArr[i2]).z().v = null;
            }
        }
        aJ();
        Z();
    }

    private final void aL() {
        S();
        iui u = u();
        if (u != null) {
            u.Q();
        }
        R();
    }

    private final void aM() {
        ivu ivuVar = this.x;
        for (hvh hvhVar = ivuVar.d; hvhVar != null; hvhVar = hvhVar.s) {
            if (hvhVar.z) {
                hvhVar.G();
            }
        }
        ivuVar.f();
        ivuVar.c();
    }

    private final void aN(iui iuiVar) {
        if (ffkj.e(iuiVar, this.k)) {
            return;
        }
        this.k = iuiVar;
        if (iuiVar != null) {
            iun iunVar = this.y;
            if (iunVar.p == null) {
                iunVar.p = new ivd(iunVar);
            }
            iwi iwiVar = y().u;
            for (iwi z = z(); !ffkj.e(z, iwiVar) && z != null; z = z.u) {
                z.D();
            }
        } else {
            iun iunVar2 = this.y;
            iunVar2.p = null;
            iunVar2.e = false;
            iunVar2.d = false;
        }
        S();
    }

    static /* synthetic */ String at(iui iuiVar) {
        return iuiVar.aG(0);
    }

    public static /* synthetic */ void ax(iui iuiVar, boolean z, int i) {
        iui u;
        if (iuiVar.k == null) {
            imn.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        iwx iwxVar = iuiVar.l;
        if (iwxVar == null || iuiVar.o || iuiVar.H) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        iwxVar.v(iuiVar, true, z3, z2);
        if (i4 != 0) {
            ivd w = iuiVar.w();
            w.getClass();
            iui u2 = w.o().u();
            int i5 = w.o().E;
            if (u2 == null || i5 == 3) {
                return;
            }
            while (u2.E == i5 && (u = u2.u()) != null) {
                u2 = u;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                if (u2.k != null) {
                    ax(u2, z3, 6);
                    return;
                } else {
                    az(u2, z3, 6);
                    return;
                }
            }
            if (i6 != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent");
            }
            if (u2.k != null) {
                u2.ad(z3);
            } else {
                u2.ae(z3);
            }
        }
    }

    public static /* synthetic */ void az(iui iuiVar, boolean z, int i) {
        iwx iwxVar;
        iui u;
        if (iuiVar.o || iuiVar.H || (iwxVar = iuiVar.l) == null) {
            return;
        }
        int i2 = i & 2;
        int i3 = i & 1;
        int i4 = i & 4;
        boolean z2 = i2 != 0;
        boolean z3 = 1 == ((z ? 1 : 0) & (i3 ^ 1));
        iwxVar.v(iuiVar, false, z3, z2);
        if (i4 != 0) {
            ivm x = iuiVar.x();
            iui u2 = x.o().u();
            int i5 = x.o().E;
            if (u2 == null || i5 == 3) {
                return;
            }
            while (u2.E == i5 && (u = u2.u()) != null) {
                u2 = u;
            }
            int i6 = i5 - 1;
            if (i5 == 0) {
                throw null;
            }
            if (i6 == 0) {
                az(u2, z3, 6);
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("Intrinsics isn't used by the parent");
                }
                u2.ae(z3);
            }
        }
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return e();
    }

    @Override // defpackage.jjp
    public final jjn B() {
        if (e() && !this.D && this.x.j(8)) {
            return this.N;
        }
        return null;
    }

    @Override // defpackage.jjp
    public final jjp C() {
        return u();
    }

    public final Boolean D() {
        ivd w = w();
        if (w != null) {
            return Boolean.valueOf(w.n());
        }
        return null;
    }

    public final List E() {
        ivd w = w();
        w.getClass();
        w.o().G();
        if (!w.r) {
            return w.q.e();
        }
        iui o = w.o();
        hne hneVar = w.q;
        hne s = o.s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (hneVar.b <= i2) {
                ivd ivdVar = iuiVar.y.p;
                ivdVar.getClass();
                hneVar.n(ivdVar);
            } else {
                ivd ivdVar2 = iuiVar.y.p;
                ivdVar2.getClass();
                hneVar.d(i2, ivdVar2);
            }
        }
        hneVar.h(o.G().size(), hneVar.b);
        w.r = false;
        return w.q.e();
    }

    public final List F() {
        return x().q();
    }

    public final List G() {
        return s().e();
    }

    @Override // defpackage.jjp
    public final List H() {
        return G();
    }

    public final List I() {
        return this.J.a.e();
    }

    public final void J(iwx iwxVar) {
        iui iuiVar;
        jjn B;
        if (this.l != null) {
            imn.c("Cannot attach " + this + " as it already is attached.  Tree: " + at(this));
        }
        iui iuiVar2 = this.M;
        if (iuiVar2 != null && !ffkj.e(iuiVar2.l, iwxVar)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(iwxVar);
            sb.append(") than the parent's owner(");
            iui u = u();
            sb.append(u != null ? u.l : null);
            sb.append("). This tree: ");
            sb.append(at(this));
            sb.append(" Parent tree: ");
            iui iuiVar3 = this.M;
            sb.append(iuiVar3 != null ? at(iuiVar3) : null);
            imn.c(sb.toString());
        }
        iui u2 = u();
        if (u2 == null) {
            x().s = true;
            ivd w = w();
            if (w != null) {
                w.x = 1;
            }
        }
        z().v = u2 != null ? u2.y() : null;
        this.l = iwxVar;
        this.n = (u2 != null ? u2.n : -1) + 1;
        hvi hviVar = this.U;
        if (hviVar != null) {
            aI(hviVar);
        }
        this.U = null;
        AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
        androidComposeView.j.f(this.d, this);
        if (this.j) {
            aN(this);
        } else {
            iui iuiVar4 = this.M;
            if (iuiVar4 == null || (iuiVar = iuiVar4.k) == null) {
                iuiVar = this.k;
            }
            aN(iuiVar);
            if (this.k == null && this.x.j(512)) {
                aN(this);
            }
        }
        if (!this.D) {
            this.x.b();
        }
        hne hneVar = this.J.a;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((iui) objArr[i2]).J(iwxVar);
        }
        if (!this.D) {
            this.x.e();
        }
        S();
        if (u2 != null) {
            u2.S();
        }
        iwi iwiVar = y().u;
        for (iwi z = z(); !ffkj.e(z, iwiVar) && z != null; z = z.u) {
            z.au(z.w, true);
            iwu iwuVar = z.C;
            if (iwuVar != null) {
                iwuVar.invalidate();
            }
        }
        ffji ffjiVar = this.A;
        if (ffjiVar != null) {
            ffjiVar.invoke(iwxVar);
        }
        this.y.m();
        if (!this.D && this.x.j(8)) {
            T();
        }
        hvx hvxVar = androidComposeView.s;
        if (hvxVar == null || (B = B()) == null || !hvy.b(B)) {
            return;
        }
        hvxVar.g.e(this.d);
        hvxVar.h = true;
        hvxVar.j.a(hvxVar.b, this.d, true);
    }

    public final void K() {
        this.V = this.E;
        this.E = 3;
        hne s = s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (iuiVar.E != 3) {
                iuiVar.K();
            }
        }
    }

    public final void L() {
        this.V = this.E;
        this.E = 3;
        hne s = s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (iuiVar.E == 2) {
                iuiVar.L();
            }
        }
    }

    public final void M() {
        isa isaVar;
        iwx iwxVar = this.l;
        if (iwxVar == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            iui u = u();
            sb.append(u != null ? at(u) : null);
            imn.a(sb.toString());
            throw new ffbx();
        }
        iui u2 = u();
        if (u2 != null) {
            u2.Q();
            u2.S();
            x().G = 3;
            ivd w = w();
            if (w != null) {
                w.w = 3;
            }
        }
        iun iunVar = this.y;
        iunVar.o.w.h();
        ivd ivdVar = iunVar.p;
        if (ivdVar != null && (isaVar = ivdVar.p) != null) {
            isaVar.h();
        }
        ffji ffjiVar = this.B;
        if (ffjiVar != null) {
            ffjiVar.invoke(iwxVar);
        }
        this.x.f();
        this.o = true;
        hne hneVar = this.J.a;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((iui) objArr[i2]).M();
        }
        this.o = false;
        this.x.c();
        AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
        androidComposeView.j.d(this.d);
        ivf ivfVar = androidComposeView.y;
        ivfVar.b.e(this);
        ivfVar.e.a.m(this);
        androidComposeView.K();
        androidComposeView.k.f(this);
        hvx hvxVar = androidComposeView.s;
        if (hvxVar != null && hvxVar.g.f(this.d)) {
            hvxVar.h = true;
            hvxVar.j.a(hvxVar.b, this.d, false);
        }
        this.l = null;
        aN(null);
        this.n = 0;
        ivm x = x();
        x.i = Alert.DURATION_SHOW_INDEFINITELY;
        x.h = Alert.DURATION_SHOW_INDEFINITELY;
        x.s = false;
        ivd w2 = w();
        if (w2 != null) {
            w2.i = Alert.DURATION_SHOW_INDEFINITELY;
            w2.h = Alert.DURATION_SHOW_INDEFINITELY;
            w2.x = 3;
        }
        if (this.x.j(8)) {
            jjn jjnVar = this.N;
            this.N = null;
            this.p = false;
            androidComposeView.l.b(this, jjnVar);
            iwxVar.x();
        }
    }

    public final void N(ibt ibtVar, iga igaVar) {
        try {
            z().ad(ibtVar, igaVar);
        } catch (Throwable th) {
            aA(th);
            throw new ffbx();
        }
    }

    public final void O(long j, itl itlVar, int i, boolean z) {
        iwi z2 = z();
        ffji ffjiVar = iwi.n;
        z().ag(iwi.p, z2.ay(j), itlVar, i, z);
    }

    public final void P(int i, iui iuiVar) {
        if (iuiVar.M != null && iuiVar.l != null) {
            imn.c(aH(iuiVar));
        }
        iuiVar.M = this;
        this.J.b(i, iuiVar);
        Z();
        if (iuiVar.H) {
            this.I++;
        }
        aJ();
        iwx iwxVar = this.l;
        if (iwxVar != null) {
            iuiVar.J(iwxVar);
        }
        if (iuiVar.y.k > 0) {
            iun iunVar = this.y;
            iunVar.g(iunVar.k + 1);
        }
    }

    public final void Q() {
        if (this.S) {
            iwi y = y();
            iwi iwiVar = z().v;
            this.R = null;
            while (true) {
                if (ffkj.e(y, iwiVar)) {
                    break;
                }
                if ((y != null ? y.C : null) != null) {
                    this.R = y;
                    break;
                }
                y = y != null ? y.v : null;
            }
        }
        iwi iwiVar2 = this.R;
        if (iwiVar2 != null && iwiVar2.C == null) {
            imn.a("layer was not set");
            throw new ffbx();
        }
        if (iwiVar2 != null) {
            iwiVar2.ah();
            return;
        }
        iui u = u();
        if (u != null) {
            u.Q();
        }
    }

    public final void R() {
        iwi y = y();
        for (iwi z = z(); z != y; z = z.u) {
            z.getClass();
            iwu iwuVar = ((itx) z).C;
            if (iwuVar != null) {
                iwuVar.invalidate();
            }
        }
        iwu iwuVar2 = y().C;
        if (iwuVar2 != null) {
            iwuVar2.invalidate();
        }
    }

    public final void S() {
        if (this.H) {
            iui u = u();
            if (u != null) {
                u.S();
                return;
            }
            return;
        }
        this.h = true;
        if (this.k != null) {
            ax(this, false, 7);
        } else {
            az(this, false, 7);
        }
    }

    public final void T() {
        if (this.q) {
            return;
        }
        if (this.x.e.s != null || ak()) {
            this.p = true;
            return;
        }
        jjn jjnVar = this.N;
        this.q = true;
        fflb fflbVar = new fflb();
        fflbVar.a = new jjn();
        ixh ixhVar = ((AndroidComposeView) ium.a(this)).v;
        ixhVar.d(this, ixhVar.b, new iuh(this, fflbVar));
        this.q = false;
        this.N = (jjn) fflbVar.a;
        this.p = false;
        iwx a = ium.a(this);
        ((AndroidComposeView) a).l.b(this, jjnVar);
        a.x();
    }

    public final void U() {
        iui u;
        if (this.E == 3) {
            L();
        }
        ivd w = w();
        w.getClass();
        try {
            w.g = true;
            if (!w.k) {
                imn.c("replace() called on item that was not placed");
            }
            w.v = false;
            boolean n = w.n();
            w.D(w.m, w.n, w.o);
            if (n && !w.v && (u = w.o().u()) != null) {
                u.ad(false);
            }
        } finally {
            w.g = false;
        }
    }

    public final void V() {
        this.y.o.r();
    }

    public final void W() {
        this.y.d = true;
    }

    public final void X() {
        this.y.o.s();
    }

    public final void Y(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                this.J.b(i > i2 ? i2 + i4 : (i2 + i3) - 2, (iui) this.J.a(i > i2 ? i + i4 : i));
            }
            Z();
            aJ();
            S();
        }
    }

    public final void Z() {
        if (!this.H) {
            this.P = true;
            return;
        }
        iui u = u();
        if (u != null) {
            u.Z();
        }
    }

    @Override // defpackage.ioh
    public final int a() {
        return this.d;
    }

    public final void aA(Throwable th) {
        hua huaVar = (hua) this.v.a(huc.a);
        if (huaVar == null) {
            throw th;
        }
        huaVar.b(th, this);
        throw th;
    }

    public final void aB() {
        this.S = true;
    }

    public final void aC() {
        this.h = false;
    }

    public final int aD() {
        return this.y.q;
    }

    public final int aE() {
        return x().G;
    }

    public final int aF() {
        int i;
        ivd w = w();
        if (w == null || (i = w.w) == 0) {
            return 3;
        }
        return i;
    }

    public final void aa() {
        int i = this.J.a.b;
        while (true) {
            i--;
            if (i < 0) {
                ivr ivrVar = this.J;
                ivrVar.a.g();
                ivrVar.b.invoke();
                return;
            }
            aK((iui) this.J.a.a[i]);
        }
    }

    public final void ab(int i, int i2) {
        if (i2 < 0) {
            imn.b(a.f(i2, "count (", ") must be greater than 0"));
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            aK((iui) this.J.a.a[i3]);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void ac() {
        iui u;
        if (this.E == 3) {
            L();
        }
        ivm x = x();
        try {
            try {
                x.g = true;
                if (!x.k) {
                    imn.c("replace called on unplaced item");
                }
                boolean z = x.s;
                x.B(x.m, x.p, x.n, x.o);
                if (z && !x.B && (u = x.o().u()) != null) {
                    u.ae(false);
                }
            } catch (Exception e) {
                x.o().aA(e);
                throw new ffbx();
            }
        } finally {
            x.g = false;
        }
    }

    public final void ad(boolean z) {
        iwx iwxVar;
        if (this.H || (iwxVar = this.l) == null) {
            return;
        }
        iwxVar.w(this, true, z);
    }

    public final void ae(boolean z) {
        iwx iwxVar;
        this.h = true;
        if (this.H || (iwxVar = this.l) == null) {
            return;
        }
        iwxVar.w(this, false, z);
    }

    public final void af(iui iuiVar) {
        int aD = iuiVar.aD();
        int i = aD - 1;
        if (aD == 0) {
            throw null;
        }
        if (i != 4) {
            int aD2 = iuiVar.aD();
            Objects.toString(iue.a(aD2));
            throw new IllegalStateException("Unexpected state ".concat(iue.a(aD2)));
        }
        if (iuiVar.an()) {
            ax(iuiVar, true, 6);
            return;
        }
        if (iuiVar.am()) {
            iuiVar.ad(true);
        }
        if (iuiVar.ao()) {
            az(iuiVar, true, 6);
        } else if (iuiVar.al()) {
            iuiVar.ae(true);
        }
    }

    public final void ag() {
        hne s = s();
        Object[] objArr = s.a;
        int i = s.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            int i3 = iuiVar.V;
            iuiVar.E = i3;
            if (i3 != 3) {
                iuiVar.ag();
            }
        }
    }

    public final void ah(jzn jznVar) {
        if (ffkj.e(this.s, jznVar)) {
            return;
        }
        this.s = jznVar;
        aL();
        for (hvh hvhVar = this.x.e; hvhVar != null; hvhVar = hvhVar.t) {
            hvhVar.dL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void ai(jgi jgiVar) {
        if (ffkj.e(this.u, jgiVar)) {
            return;
        }
        this.u = jgiVar;
        ivu ivuVar = this.x;
        if ((ivuVar.a() & 16) != 0) {
            for (hvh hvhVar = ivuVar.e; hvhVar != null; hvhVar = hvhVar.t) {
                if ((hvhVar.q & 16) != 0) {
                    isz iszVar = hvhVar;
                    ?? r3 = 0;
                    while (iszVar != 0) {
                        if (iszVar instanceof ixl) {
                            ((ixl) iszVar).dW();
                        } else if ((iszVar.q & 16) != 0 && (iszVar instanceof isz)) {
                            hvh hvhVar2 = iszVar.n;
                            int i = 0;
                            iszVar = iszVar;
                            r3 = r3;
                            while (hvhVar2 != null) {
                                if ((hvhVar2.q & 16) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        iszVar = hvhVar2;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new hne(new hvh[16]);
                                        }
                                        if (iszVar != 0) {
                                            r3.n(iszVar);
                                        }
                                        r3.n(hvhVar2);
                                        iszVar = 0;
                                    }
                                }
                                hvhVar2 = hvhVar2.t;
                                iszVar = iszVar;
                                r3 = r3;
                            }
                            if (i != 1) {
                            }
                        }
                        iszVar = isx.a(r3);
                    }
                }
                if ((hvhVar.r & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void aj() {
        if (this.I <= 0 || !this.L) {
            return;
        }
        this.L = false;
        hne hneVar = this.K;
        if (hneVar == null) {
            hneVar = new hne(new iui[16]);
            this.K = hneVar;
        }
        hneVar.g();
        hne hneVar2 = this.J.a;
        Object[] objArr = hneVar2.a;
        int i = hneVar2.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            if (iuiVar.H) {
                hneVar.o(hneVar.b, iuiVar.s());
            } else {
                hneVar.n(iuiVar);
            }
        }
        this.y.d();
    }

    public final boolean ak() {
        return this.U != null;
    }

    public final boolean al() {
        return this.y.n();
    }

    public final boolean am() {
        return this.y.e;
    }

    public final boolean an() {
        return this.y.d;
    }

    public final boolean ao() {
        return this.y.o.u;
    }

    public final boolean ap() {
        return x().t;
    }

    @Override // defpackage.jjp
    public final boolean aq() {
        return z().aw();
    }

    public final boolean ar(jzk jzkVar) {
        if (jzkVar == null || this.k == null) {
            return false;
        }
        ivd w = w();
        w.getClass();
        return w.C(jzkVar.a);
    }

    public final boolean as(jzk jzkVar) {
        if (jzkVar == null) {
            return false;
        }
        if (this.E == 3) {
            K();
        }
        return x().C(jzkVar.a);
    }

    public final void au(long j, itl itlVar, boolean z) {
        iwi z2 = z();
        ffji ffjiVar = iwi.n;
        z().ag(iwi.q, z2.ay(j), itlVar, 1, z);
    }

    @Override // defpackage.hez
    public final void b() {
        kbs kbsVar = this.m;
        if (kbsVar != null) {
            kbsVar.b();
        }
        ipa ipaVar = this.z;
        if (ipaVar != null) {
            ipaVar.b();
        }
        this.D = true;
        aM();
        if (e()) {
            this.N = null;
            this.p = false;
        }
        iwx iwxVar = this.l;
        if (iwxVar != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
            androidComposeView.k.f(this);
            hvx hvxVar = androidComposeView.s;
            if (hvxVar == null || !hvxVar.g.f(this.d)) {
                return;
            }
            hvxVar.h = true;
            hvxVar.j.a(hvxVar.b, this.d, false);
        }
    }

    @Override // defpackage.hez
    public final void c() {
        kbs kbsVar = this.m;
        if (kbsVar != null) {
            kbsVar.c();
        }
        ipa ipaVar = this.z;
        if (ipaVar != null) {
            ipaVar.g();
        }
        iwi iwiVar = y().u;
        for (iwi z = z(); !ffkj.e(z, iwiVar) && z != null; z = z.u) {
            z.ao();
        }
    }

    @Override // defpackage.hez
    public final void d() {
        hvx hvxVar;
        if (!e()) {
            imn.b("onReuse is only expected on attached node");
        }
        kbs kbsVar = this.m;
        if (kbsVar != null) {
            kbsVar.d();
        }
        ipa ipaVar = this.z;
        if (ipaVar != null) {
            ipaVar.d();
        }
        this.q = false;
        if (this.D) {
            this.D = false;
        } else {
            aM();
        }
        int i = this.d;
        this.d = jjs.a();
        iwx iwxVar = this.l;
        if (iwxVar != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
            androidComposeView.j.d(i);
            androidComposeView.j.f(this.d, this);
        }
        this.x.b();
        this.x.e();
        if (this.x.j(8)) {
            T();
        }
        af(this);
        iwx iwxVar2 = this.l;
        if (iwxVar2 == null || (hvxVar = ((AndroidComposeView) iwxVar2).s) == null) {
            return;
        }
        if (hvxVar.g.f(i)) {
            hvxVar.h = true;
            hvxVar.j.a(hvxVar.b, i, false);
        }
        jjn B = B();
        if (B == null || !hvy.b(B)) {
            return;
        }
        hvxVar.g.e(this.d);
        hvxVar.h = true;
        hvxVar.j.a(hvxVar.b, this.d, true);
    }

    @Override // defpackage.ioh
    public final boolean e() {
        return this.l != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [hvh] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.iww
    public final void ev() {
        hvh hvhVar;
        iwi y = y();
        boolean h = iwk.h(128);
        if (h) {
            hvhVar = ((ito) y).f;
        } else {
            hvhVar = ((ito) y).f.s;
            if (hvhVar == null) {
                return;
            }
        }
        for (hvh Y = y.Y(h); Y != null && (Y.r & 128) != 0; Y = Y.t) {
            if ((Y.q & 128) != 0) {
                isz iszVar = Y;
                ?? r5 = 0;
                while (iszVar != 0) {
                    if (iszVar instanceof its) {
                        ((its) iszVar).dY(y());
                    } else if ((iszVar.q & 128) != 0 && (iszVar instanceof isz)) {
                        hvh hvhVar2 = iszVar.n;
                        int i = 0;
                        iszVar = iszVar;
                        r5 = r5;
                        while (hvhVar2 != null) {
                            if ((hvhVar2.q & 128) != 0) {
                                i++;
                                r5 = r5;
                                if (i == 1) {
                                    iszVar = hvhVar2;
                                } else {
                                    if (r5 == 0) {
                                        r5 = new hne(new hvh[16]);
                                    }
                                    if (iszVar != 0) {
                                        r5.n(iszVar);
                                    }
                                    r5.n(hvhVar2);
                                    iszVar = 0;
                                }
                            }
                            hvhVar2 = hvhVar2.t;
                            iszVar = iszVar;
                            r5 = r5;
                        }
                        if (i != 1) {
                        }
                    }
                    iszVar = isx.a(r5);
                }
            }
            if (Y == hvhVar) {
                return;
            }
        }
    }

    @Override // defpackage.ioh
    public final boolean f() {
        return this.D;
    }

    @Override // defpackage.ioh
    public final boolean g() {
        return x().s;
    }

    @Override // defpackage.iqn
    public final void h() {
        if (this.k != null) {
            ax(this, false, 5);
        } else {
            az(this, false, 5);
        }
        jzk b2 = this.y.b();
        if (b2 != null) {
            iwx iwxVar = this.l;
            if (iwxVar != null) {
                iwxVar.s(this, b2.a);
                return;
            }
            return;
        }
        iwx iwxVar2 = this.l;
        if (iwxVar2 != null) {
            iwxVar2.r(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [hvh] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [hne] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.ist
    public final void i(hgb hgbVar) {
        this.v = hgbVar;
        ah((jzn) hgbVar.a(jdr.e));
        kah kahVar = (kah) hgbVar.a(jdr.j);
        if (this.t != kahVar) {
            this.t = kahVar;
            aL();
            for (hvh hvhVar = this.x.e; hvhVar != null; hvhVar = hvhVar.t) {
                hvhVar.dK();
            }
        }
        ai((jgi) hgbVar.a(jdr.n));
        ivu ivuVar = this.x;
        if ((ivuVar.a() & 32768) != 0) {
            for (hvh hvhVar2 = ivuVar.e; hvhVar2 != null; hvhVar2 = hvhVar2.t) {
                if ((hvhVar2.q & 32768) != 0) {
                    isz iszVar = hvhVar2;
                    ?? r3 = 0;
                    while (iszVar != 0) {
                        if (iszVar instanceof isu) {
                            hvh C = ((isu) iszVar).C();
                            if (C.z) {
                                iwk.g(C);
                            } else {
                                C.x = true;
                            }
                        } else if ((iszVar.q & 32768) != 0 && (iszVar instanceof isz)) {
                            hvh hvhVar3 = iszVar.n;
                            int i = 0;
                            iszVar = iszVar;
                            r3 = r3;
                            while (hvhVar3 != null) {
                                if ((hvhVar3.q & 32768) != 0) {
                                    i++;
                                    r3 = r3;
                                    if (i == 1) {
                                        iszVar = hvhVar3;
                                    } else {
                                        if (r3 == 0) {
                                            r3 = new hne(new hvh[16]);
                                        }
                                        if (iszVar != 0) {
                                            r3.n(iszVar);
                                        }
                                        r3.n(hvhVar3);
                                        iszVar = 0;
                                    }
                                }
                                hvhVar3 = hvhVar3.t;
                                iszVar = iszVar;
                                r3 = r3;
                            }
                            if (i != 1) {
                            }
                        }
                        iszVar = isx.a(r3);
                    }
                }
                if ((hvhVar2.r & 32768) == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.ist
    public final void j(ipn ipnVar) {
        if (ffkj.e(this.r, ipnVar)) {
            return;
        }
        this.r = ipnVar;
        itq itqVar = this.Q;
        if (itqVar != null) {
            itqVar.b.b(ipnVar);
        }
        S();
    }

    @Override // defpackage.ist
    public final void k(hvi hviVar) {
        if (this.H && this.T != hvi.e) {
            imn.b("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.D) {
            imn.b("modifier is updated when deactivated");
        }
        if (!e()) {
            this.U = hviVar;
            return;
        }
        aI(hviVar);
        if (this.p) {
            T();
        }
    }

    public final float m() {
        return x().A;
    }

    public final int n() {
        return this.y.o.b;
    }

    public final int o() {
        return x().i;
    }

    public final int p() {
        return this.y.o.a;
    }

    public final View q() {
        kbs kbsVar = this.m;
        if (kbsVar != null) {
            return kbsVar.c;
        }
        return null;
    }

    public final hne r() {
        if (this.P) {
            this.O.g();
            hne hneVar = this.O;
            hneVar.o(hneVar.b, s());
            this.O.j(c);
            this.P = false;
        }
        return this.O;
    }

    public final hne s() {
        aj();
        if (this.I == 0) {
            return this.J.a;
        }
        hne hneVar = this.K;
        hneVar.getClass();
        return hneVar;
    }

    public final itq t() {
        itq itqVar = this.Q;
        if (itqVar != null) {
            return itqVar;
        }
        itq itqVar2 = new itq(this, this.r);
        this.Q = itqVar2;
        return itqVar2;
    }

    public final String toString() {
        return jew.a(this) + " children: " + G().size() + " measurePolicy: " + this.r;
    }

    public final iui u() {
        iui iuiVar = this.M;
        while (iuiVar != null && iuiVar.H) {
            iuiVar = iuiVar.M;
        }
        return iuiVar;
    }

    public final iul v() {
        return ((AndroidComposeView) ium.a(this)).c;
    }

    public final ivd w() {
        return this.y.p;
    }

    public final ivm x() {
        return this.y.o;
    }

    public final iwi y() {
        return this.x.b;
    }

    public final iwi z() {
        return this.x.c;
    }

    public iui(boolean z, int i) {
        this.H = z;
        this.d = i;
        this.e = 9223372034707292159L;
        this.f = 0L;
        this.g = 9223372034707292159L;
        this.h = true;
        this.J = new ivr(new hne(new iui[16]), new iug(this));
        this.O = new hne(new iui[16]);
        this.P = true;
        this.r = F;
        this.s = ium.a;
        this.t = kah.a;
        this.u = G;
        int i2 = hgb.so;
        this.v = hga.a;
        this.E = 3;
        this.V = 3;
        this.x = new ivu(this);
        this.y = new iun(this);
        this.S = true;
        this.T = hvi.e;
    }

    public /* synthetic */ iui(boolean z, int i, byte[] bArr) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), jjs.a());
    }

    @Override // defpackage.ist
    public final void l() {
    }
}
