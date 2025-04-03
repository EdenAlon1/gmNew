package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qm {
    final vj e;
    private final kst f = new ksu(30);
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public int d = 0;
    final uv c = new uv(this);

    public qm(vj vjVar) {
        this.e = vjVar;
    }

    private final int m(int i, int i2) {
        int size = this.b.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ql qlVar = (ql) this.b.get(size);
            int i3 = qlVar.a;
            if (i3 == 8) {
                int i4 = qlVar.b;
                int i5 = qlVar.d;
                int i6 = i4 < i5 ? i5 : i4;
                int i7 = i4 < i5 ? i4 : i5;
                if (i < i7 || i > i6) {
                    if (i < i4) {
                        if (i2 == 1) {
                            qlVar.b = i4 + 1;
                            qlVar.d = i5 + 1;
                        } else if (i2 == 2) {
                            qlVar.b = i4 - 1;
                            qlVar.d = i5 - 1;
                        }
                    }
                } else if (i7 == i4) {
                    if (i2 == 1) {
                        qlVar.d = i5 + 1;
                    } else if (i2 == 2) {
                        qlVar.d = i5 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        qlVar.b = i4 + 1;
                    } else if (i2 == 2) {
                        qlVar.b = i4 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = qlVar.b;
                if (i8 <= i) {
                    if (i3 == 1) {
                        i -= qlVar.d;
                    } else if (i3 == 2) {
                        i += qlVar.d;
                    }
                } else if (i2 == 1) {
                    qlVar.b = i8 + 1;
                } else if (i2 == 2) {
                    qlVar.b = i8 - 1;
                }
            }
        }
        int size2 = this.b.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return i;
            }
            ql qlVar2 = (ql) this.b.get(size2);
            if (qlVar2.a == 8) {
                int i9 = qlVar2.d;
                if (i9 == qlVar2.b || i9 < 0) {
                    this.b.remove(size2);
                    h(qlVar2);
                }
            } else if (qlVar2.d <= 0) {
                this.b.remove(size2);
                h(qlVar2);
            }
        }
    }

    private final void n(ql qlVar) {
        int i;
        int i2 = qlVar.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(qlVar.b, i2);
        int i3 = qlVar.b;
        int i4 = qlVar.a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                Objects.toString(qlVar);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(qlVar)));
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < qlVar.d; i6++) {
            int m2 = m(qlVar.b + (i * i6), qlVar.a);
            int i7 = qlVar.a;
            if (i7 == 2 ? m2 != m : !(i7 == 4 && m2 == m + 1)) {
                ql c = c(i7, m, i5, qlVar.c);
                f(c, i3);
                h(c);
                if (qlVar.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            } else {
                i5++;
            }
        }
        Object obj = qlVar.c;
        h(qlVar);
        if (i5 > 0) {
            ql c2 = c(qlVar.a, m, i5, obj);
            f(c2, i3);
            h(c2);
        }
    }

    private final void o(ql qlVar) {
        this.b.add(qlVar);
        int i = qlVar.a;
        if (i == 1) {
            this.e.d(qlVar.b, qlVar.d);
            return;
        }
        if (i == 2) {
            vj vjVar = this.e;
            vjVar.a.V(qlVar.b, qlVar.d, false);
            vjVar.a.P = true;
            return;
        }
        if (i == 4) {
            this.e.c(qlVar.b, qlVar.d, qlVar.c);
        } else if (i == 8) {
            this.e.e(qlVar.b, qlVar.d);
        } else {
            Objects.toString(qlVar);
            throw new IllegalArgumentException("Unknown update op type for ".concat(String.valueOf(qlVar)));
        }
    }

    private final boolean p(int i) {
        int size = this.b.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            ql qlVar = (ql) this.b.get(i2);
            int i4 = qlVar.a;
            if (i4 == 8) {
                if (b(qlVar.d, i3) == i) {
                    return true;
                }
            } else if (i4 == 1) {
                int i5 = qlVar.b;
                int i6 = qlVar.d + i5;
                while (i5 < i6) {
                    if (b(i5, i3) == i) {
                        return true;
                    }
                    i5++;
                }
            } else {
                continue;
            }
            i2 = i3;
        }
        return false;
    }

    final int a(int i) {
        return b(i, 0);
    }

    final int b(int i, int i2) {
        int size = this.b.size();
        while (i2 < size) {
            ql qlVar = (ql) this.b.get(i2);
            int i3 = qlVar.a;
            if (i3 == 8) {
                int i4 = qlVar.b;
                if (i4 == i) {
                    i = qlVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (qlVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = qlVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = qlVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += qlVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final ql c(int i, int i2, int i3, Object obj) {
        ql qlVar = (ql) this.f.a();
        if (qlVar == null) {
            return new ql(i, i2, i3, obj);
        }
        qlVar.a = i;
        qlVar.b = i2;
        qlVar.d = i3;
        qlVar.c = obj;
        return qlVar;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.e.b((ql) this.b.get(i));
        }
        i(this.b);
        this.d = 0;
    }

    public final void e() {
        d();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ql qlVar = (ql) this.a.get(i);
            int i2 = qlVar.a;
            if (i2 == 1) {
                this.e.b(qlVar);
                this.e.d(qlVar.b, qlVar.d);
            } else if (i2 == 2) {
                this.e.b(qlVar);
                this.e.f(qlVar.b, qlVar.d);
            } else if (i2 == 4) {
                this.e.b(qlVar);
                this.e.c(qlVar.b, qlVar.d, qlVar.c);
            } else if (i2 == 8) {
                this.e.b(qlVar);
                this.e.e(qlVar.b, qlVar.d);
            }
        }
        i(this.a);
        this.d = 0;
    }

    final void f(ql qlVar, int i) {
        this.e.b(qlVar);
        int i2 = qlVar.a;
        if (i2 == 2) {
            this.e.f(i, qlVar.d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.e.c(i, qlVar.d, qlVar.c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm.g():void");
    }

    public final void h(ql qlVar) {
        qlVar.c = null;
        this.f.b(qlVar);
    }

    final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            h((ql) list.get(i));
        }
        list.clear();
    }

    public final void j() {
        i(this.a);
        i(this.b);
        this.d = 0;
    }

    public final boolean k(int i) {
        return (i & this.d) != 0;
    }

    public final boolean l() {
        return this.a.size() > 0;
    }
}
