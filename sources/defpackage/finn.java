package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class finn implements fiqz {
    public static final Set a = new LinkedHashSet(Arrays.asList(fipg.class, fipp.class, fipn.class, fipq.class, fiqj.class, fipw.class, fipt.class));
    public static final Map b;
    public fiqr c;
    public boolean h;
    public final List i;
    public final fink j;
    private boolean o;
    private final List q;
    private int n = -1;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    private int p = 0;
    public int g = 0;
    public final fioa k = new fioa();
    public final List l = new ArrayList();
    public final List m = new ArrayList();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(fipg.class, new finf());
        hashMap.put(fipp.class, new finq());
        hashMap.put(fipn.class, new fino());
        hashMap.put(fipq.class, new fins());
        hashMap.put(fiqj.class, new fioi());
        hashMap.put(fipw.class, new fiob());
        hashMap.put(fipt.class, new finu());
        b = DesugarCollections.unmodifiableMap(hashMap);
    }

    public finn(List list, List list2) {
        this.q = list;
        this.i = list2;
        fink finkVar = new fink();
        this.j = finkVar;
        e(new finm(finkVar, 0));
    }

    private final finm d() {
        return (finm) this.l.remove(this.l.size() - 1);
    }

    private final void e(finm finmVar) {
        this.l.add(finmVar);
    }

    private final void f(finm finmVar) {
        while (!a().j(finmVar.a.b())) {
            b(1);
        }
        a().b().g(finmVar.a.b());
        e(finmVar);
    }

    private final void g(fiog fiogVar) {
        finz finzVar = fiogVar.b;
        finzVar.b();
        for (fipv fipvVar : finzVar.b) {
            fiqd fiqdVar = fiogVar.a;
            fipvVar.j();
            fipvVar.h = fiqdVar.h;
            fipy fipyVar = fipvVar.h;
            if (fipyVar != null) {
                fipyVar.i = fipvVar;
            }
            fipvVar.i = fiqdVar;
            fiqdVar.h = fipvVar;
            fipvVar.e = fiqdVar.e;
            if (fipvVar.h == null) {
                fipvVar.e.f = fipvVar;
            }
            fioa fioaVar = this.k;
            String a2 = fipa.a(fipvVar.a);
            if (!fioaVar.a.containsKey(a2)) {
                fioaVar.a.put(a2, fipvVar);
            }
        }
    }

    private final void h() {
        CharSequence subSequence;
        if (this.o) {
            int i = this.d + 1;
            CharSequence charSequence = this.c.a;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int a2 = fipd.a(this.e);
            StringBuilder sb = new StringBuilder(subSequence2.length() + a2);
            for (int i2 = 0; i2 < a2; i2++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            int i3 = this.d;
            if (i3 == 0) {
                subSequence = this.c.a;
            } else {
                CharSequence charSequence2 = this.c.a;
                subSequence = charSequence2.subSequence(i3, charSequence2.length());
            }
        }
        a().d(new fiqr(subSequence, null));
    }

    private final void i() {
        int i;
        char charAt = this.c.a.charAt(this.d);
        this.d++;
        if (charAt == '\t') {
            int i2 = this.e;
            i = i2 + fipd.a(i2);
        } else {
            i = this.e + 1;
        }
        this.e = i;
    }

    private final void j() {
        int i = this.d;
        int i2 = this.e;
        this.h = true;
        int length = this.c.a.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.c.a.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.h = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.f = i;
        this.p = i2;
        this.g = i2 - this.e;
    }

    private final void k(int i) {
        int i2;
        boolean z;
        int i3 = this.p;
        if (i >= i3) {
            this.d = this.f;
            this.e = i3;
        }
        int length = this.c.a.length();
        while (true) {
            i2 = this.e;
            if (i2 >= i || this.d == length) {
                break;
            } else {
                i();
            }
        }
        if (i2 > i) {
            this.d--;
            this.e = i;
            z = true;
        } else {
            z = false;
        }
        this.o = z;
    }

    private final void l(int i) {
        int i2 = this.f;
        if (i >= i2) {
            this.d = i2;
            this.e = this.p;
        }
        int length = this.c.a.length();
        while (true) {
            int i3 = this.d;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                i();
            }
        }
        this.o = false;
    }

    @Override // defpackage.fiqz
    public final fiqw a() {
        return ((finm) this.l.get(r0.size() - 1)).a;
    }

    public final void b(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            fiqw fiqwVar = d().a;
            if (fiqwVar instanceof fiog) {
                g((fiog) fiqwVar);
            }
            fiqwVar.k();
            this.m.add(fiqwVar);
        }
    }

    public final void c(CharSequence charSequence) {
        fiqy fiqyVar;
        List list;
        this.n++;
        this.d = 0;
        this.e = 0;
        this.o = false;
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt == 0) {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                }
                sb.append((char) 65533);
            } else if (sb != null) {
                sb.append(charAt);
            } else {
                sb = null;
            }
        }
        if (sb != null) {
            charSequence = sb.toString();
        }
        this.c = new fiqr(charSequence, null);
        int i2 = 1;
        for (int i3 = 1; i3 < this.l.size(); i3++) {
            finm finmVar = (finm) this.l.get(i3);
            fiqw fiqwVar = finmVar.a;
            j();
            fiqv c = fiqwVar.c(this);
            if (!(c instanceof fine)) {
                break;
            }
            finmVar.b = this.d;
            fine fineVar = (fine) c;
            if (fineVar.c) {
                b(this.l.size() - i3);
                return;
            }
            int i4 = fineVar.a;
            if (i4 != -1) {
                l(i4);
            } else {
                int i5 = fineVar.b;
                if (i5 != -1) {
                    k(i5);
                }
            }
            i2++;
        }
        int size = this.l.size() - i2;
        fiqw fiqwVar2 = ((finm) this.l.get(i2 - 1)).a;
        int i6 = this.d;
        boolean z = (fiqwVar2.b() instanceof fiqd) || fiqwVar2.g();
        boolean z2 = false;
        while (true) {
            if (!z) {
                break;
            }
            i6 = this.d;
            j();
            if (this.h || (this.g < 4 && Character.isLetter(Character.codePointAt(this.c.a, this.f)))) {
                break;
            }
            finl finlVar = new finl(fiqwVar2);
            Iterator it = this.q.iterator();
            while (true) {
                if (it.hasNext()) {
                    fiqyVar = ((fiqx) it.next()).a(this, finlVar);
                    if (fiqyVar instanceof finh) {
                        break;
                    }
                } else {
                    fiqyVar = null;
                    break;
                }
            }
            if (fiqyVar == null) {
                l(this.f);
                break;
            }
            int i7 = this.d;
            if (size > 0) {
                b(size);
                size = 0;
            }
            finh finhVar = (finh) fiqyVar;
            int i8 = finhVar.b;
            if (i8 != -1) {
                l(i8);
            } else {
                int i9 = finhVar.c;
                if (i9 != -1) {
                    k(i9);
                }
            }
            if (finhVar.d) {
                fiqw fiqwVar3 = d().a;
                if (fiqwVar3 instanceof fiog) {
                    g((fiog) fiqwVar3);
                }
                fiqwVar3.k();
                fiqwVar3.b().j();
                list = fiqwVar3.b().e();
            } else {
                list = null;
            }
            fiqw[] fiqwVarArr = finhVar.a;
            boolean z3 = true;
            for (int i10 = 0; i10 < fiqwVarArr.length; i10++) {
                fiqwVar2 = fiqwVarArr[i10];
                f(new finm(fiqwVar2, i7));
                if (list != null) {
                    fiqwVar2.b().i(list);
                }
                z3 = fiqwVar2.g();
            }
            z2 = true;
            z = z3;
        }
        l(this.f);
        if (!z2 && !this.h && a().f()) {
            ((finm) this.l.get(r13.size() - 1)).b = i6;
            h();
            return;
        }
        if (size > 0) {
            b(size);
        }
        if (!fiqwVar2.g()) {
            h();
        } else {
            if (this.h) {
                return;
            }
            f(new finm(new fiog(), i6));
            h();
        }
    }
}
