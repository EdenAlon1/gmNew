package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cg extends gg implements fm {
    final fr a;
    boolean b;
    int c;
    boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(cg cgVar) {
        super(null);
        cgVar.a.l();
        en enVar = cgVar.a.o;
        if (enVar != null) {
            enVar.c.getClassLoader();
        }
        ArrayList arrayList = cgVar.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new gf((gf) arrayList.get(i)));
        }
        this.f = cgVar.f;
        this.g = cgVar.g;
        this.h = cgVar.h;
        this.i = cgVar.i;
        this.j = cgVar.j;
        this.k = cgVar.k;
        this.l = cgVar.l;
        this.m = cgVar.m;
        this.p = cgVar.p;
        this.q = cgVar.q;
        this.n = cgVar.n;
        this.o = cgVar.o;
        if (cgVar.r != null) {
            this.r = new ArrayList();
            this.r.addAll(cgVar.r);
        }
        if (cgVar.s != null) {
            this.s = new ArrayList();
            this.s.addAll(cgVar.s);
        }
        this.t = cgVar.t;
        this.c = -1;
        this.d = false;
        this.a = cgVar.a;
        this.b = cgVar.b;
        this.c = cgVar.c;
        this.d = cgVar.d;
    }

    final void a(int i) {
        if (this.k) {
            if (fr.af(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.e.size();
            for (int i2 = 0; i2 < size; i2++) {
                gf gfVar = (gf) this.e.get(i2);
                ea eaVar = gfVar.b;
                if (eaVar != null) {
                    eaVar.A += i;
                    if (fr.af(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + gfVar.b + " to " + gfVar.b.A);
                    }
                }
            }
        }
    }

    final void b() {
        int size = this.e.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            gf gfVar = (gf) this.e.get(size);
            if (gfVar.c) {
                int i = size - 1;
                if (gfVar.a == 8) {
                    gfVar.c = false;
                    this.e.remove(i);
                    size = i;
                } else {
                    int i2 = gfVar.b.G;
                    gfVar.a = 2;
                    gfVar.c = false;
                    while (i >= 0) {
                        gf gfVar2 = (gf) this.e.get(i);
                        if (gfVar2.c && gfVar2.b.G == i2) {
                            this.e.remove(i);
                            size--;
                        }
                        i--;
                    }
                }
            }
        }
    }

    @Override // defpackage.gg
    public final void c() {
        w();
        this.a.O(this, false);
    }

    @Override // defpackage.gg
    public final void d() {
        w();
        this.a.O(this, true);
    }

    @Override // defpackage.gg
    public final void e(int i, ea eaVar, String str, int i2) {
        String str2 = eaVar.X;
        if (str2 != null) {
            lin.a(eaVar, str2);
        }
        Class<?> cls = eaVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = eaVar.H;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + eaVar + ": was " + eaVar.H + " now " + str);
            }
            eaVar.H = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + eaVar + " with tag " + str + " to container view with no id");
            }
            int i3 = eaVar.F;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + eaVar + ": was " + eaVar.F + " now " + i);
            }
            eaVar.F = i;
            eaVar.G = i;
        }
        r(new gf(i2, eaVar));
        eaVar.B = this.a;
    }

    public final void f(String str, PrintWriter printWriter) {
        g(str, printWriter, true);
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.c);
            printWriter.print(" mCommitted=");
            printWriter.println(this.b);
            if (this.j != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.j));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.h != 0 || this.i != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.h));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.i));
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.o);
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.q);
            }
        }
        if (this.e.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            gf gfVar = (gf) this.e.get(i);
            switch (gfVar.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + gfVar.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(gfVar.b);
            if (z) {
                if (gfVar.d != 0 || gfVar.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(gfVar.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(gfVar.e));
                }
                if (gfVar.f != 0 || gfVar.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(gfVar.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(gfVar.g));
                }
            }
        }
    }

    @Override // defpackage.fm
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        if (fr.af(2)) {
            toString();
            Log.v("FragmentManager", "Run: ".concat(toString()));
        }
        arrayList.add(this);
        arrayList2.add(false);
        if (!this.k) {
            return true;
        }
        this.a.c.add(this);
        return true;
    }

    @Override // defpackage.gg
    public final boolean i() {
        return this.e.isEmpty();
    }

    @Override // defpackage.gg
    public final void j() {
        m(false, true);
    }

    @Override // defpackage.gg
    public final void k() {
        m(true, true);
    }

    @Override // defpackage.gg
    public final void l(ea eaVar) {
        fr frVar = eaVar.B;
        if (frVar == null || frVar == this.a) {
            r(new gf(4, eaVar));
            return;
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
    }

    final void m(boolean z, boolean z2) {
        if (this.b) {
            throw new IllegalStateException("commit already called");
        }
        if (fr.af(2)) {
            toString();
            Log.v("FragmentManager", "Commit: ".concat(toString()));
            PrintWriter printWriter = new PrintWriter(new gv());
            f("  ", printWriter);
            printWriter.close();
        }
        this.b = true;
        if (this.k) {
            this.c = this.a.i.getAndIncrement();
        } else {
            this.c = -1;
        }
        if (z2) {
            this.a.N(this, z);
        }
    }

    @Override // defpackage.gg
    public final void n(ea eaVar) {
        fr frVar = eaVar.B;
        if (frVar == null || frVar == this.a) {
            r(new gf(3, eaVar));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.gg
    public final void o(ea eaVar, lkj lkjVar) {
        if (eaVar.B != this.a) {
            fr frVar = this.a;
            Objects.toString(frVar);
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ".concat(frVar.toString()));
        }
        if (lkjVar == lkj.INITIALIZED && eaVar.g >= 0) {
            throw new IllegalArgumentException(a.i(lkjVar, "Cannot set maximum Lifecycle to ", " after the Fragment has been created"));
        }
        if (lkjVar == lkj.DESTROYED) {
            throw new IllegalArgumentException(a.i(lkjVar, "Cannot set maximum Lifecycle to ", ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction."));
        }
        r(new gf(eaVar, lkjVar));
    }

    @Override // defpackage.gg
    public final void p(ea eaVar) {
        fr frVar = eaVar.B;
        if (frVar == null || frVar == this.a) {
            r(new gf(8, eaVar));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
    }

    @Override // defpackage.gg
    public final void q(ea eaVar) {
        fr frVar = eaVar.B;
        if (frVar == null || frVar == this.a) {
            r(new gf(5, eaVar));
            return;
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.c >= 0) {
            sb.append(" #");
            sb.append(this.c);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(fr frVar) {
        super(null);
        frVar.l();
        en enVar = frVar.o;
        if (enVar != null) {
            enVar.c.getClassLoader();
        }
        this.c = -1;
        this.d = false;
        this.a = frVar;
    }
}
