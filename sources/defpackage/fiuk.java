package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiuk {
    public final firb a;
    public final Locale b;
    public firk c;
    public Integer d;
    public fiui[] e;
    public int f;
    public boolean g;
    private final firk h;
    private Object i;

    public fiuk(firb firbVar) {
        firb c = firh.c(firbVar);
        firk z = c.z();
        this.h = z;
        this.a = c.a();
        this.b = Locale.getDefault();
        this.c = z;
        this.e = new fiui[8];
    }

    static int a(firl firlVar, firl firlVar2) {
        if (firlVar == null || !firlVar.f()) {
            return (firlVar2 == null || !firlVar2.f()) ? 0 : -1;
        }
        if (firlVar2 == null || !firlVar2.f()) {
            return 1;
        }
        return -firlVar.compareTo(firlVar2);
    }

    public final Object b() {
        if (this.i == null) {
            this.i = new fiuj(this);
        }
        return this.i;
    }

    public final fiui c() {
        fiui[] fiuiVarArr = this.e;
        int i = this.f;
        int length = fiuiVarArr.length;
        if (i == length || this.g) {
            if (i == length) {
                length = i + i;
            }
            fiui[] fiuiVarArr2 = new fiui[length];
            System.arraycopy(fiuiVarArr, 0, fiuiVarArr2, 0, i);
            this.e = fiuiVarArr2;
            this.g = false;
            fiuiVarArr = fiuiVarArr2;
        }
        this.i = null;
        fiui fiuiVar = fiuiVarArr[i];
        if (fiuiVar == null) {
            fiuiVar = new fiui();
            fiuiVarArr[i] = fiuiVar;
        }
        this.f = i + 1;
        return fiuiVar;
    }

    public final void d(firf firfVar, int i) {
        c().c(firfVar.a(this.a), i);
    }

    public final void e(Integer num) {
        this.i = null;
        this.d = num;
    }

    public final void f(firk firkVar) {
        this.i = null;
        this.c = firkVar;
    }

    public final long g(CharSequence charSequence) {
        fiui[] fiuiVarArr = this.e;
        int i = this.f;
        if (this.g) {
            fiuiVarArr = (fiui[]) fiuiVarArr.clone();
            this.e = fiuiVarArr;
            this.g = false;
        }
        if (i > 10) {
            Arrays.sort(fiuiVarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2;
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    if (fiuiVarArr[i4].compareTo(fiuiVarArr[i3]) > 0) {
                        fiui fiuiVar = fiuiVarArr[i3];
                        fiuiVarArr[i3] = fiuiVarArr[i4];
                        fiuiVarArr[i4] = fiuiVar;
                        i3 = i4;
                    }
                }
            }
        }
        long j = 0;
        if (i > 0) {
            firl a = firn.e.a(this.a);
            firl a2 = firn.g.a(this.a);
            firl q = fiuiVarArr[0].a.q();
            if (a(q, a) >= 0 && a(q, a2) <= 0) {
                d(firf.f, 2000);
                return g(charSequence);
            }
        }
        for (int i5 = 0; i5 < i; i5++) {
            try {
                j = fiuiVarArr[i5].b(j, true);
            } catch (firo e) {
                if (charSequence != null) {
                    String a3 = a.a((String) charSequence, "Cannot parse \"", "\"");
                    String str = e.a;
                    if (str == null) {
                        e.a = a3;
                    } else {
                        e.a = a.w(str, a3, ": ");
                    }
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            fiuiVarArr[i6].a.v();
            j = fiuiVarArr[i6].b(j, i6 == i + (-1));
            i6++;
        }
        if (this.d != null) {
            return j - r0.intValue();
        }
        firk firkVar = this.c;
        if (firkVar != null) {
            int b = firkVar.b(j);
            j -= b;
            if (b != this.c.a(j)) {
                String str2 = "Illegal instant due to time zone offset transition (" + String.valueOf(this.c) + ")";
                if (charSequence != null) {
                    str2 = a.m(str2, (String) charSequence, "Cannot parse \"", "\": ");
                }
                throw new firp(str2);
            }
        }
        return j;
    }

    public final void h(Object obj) {
        if (obj instanceof fiuj) {
            fiuj fiujVar = (fiuj) obj;
            if (this != fiujVar.e) {
                return;
            }
            this.c = fiujVar.a;
            this.d = fiujVar.b;
            this.e = fiujVar.c;
            int i = fiujVar.d;
            if (i < this.f) {
                this.g = true;
            }
            this.f = i;
            this.i = obj;
        }
    }
}
