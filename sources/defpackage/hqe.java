package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqe implements hjj {
    public final hne a;
    public coq b;
    private final Set c;
    private final hne d;
    private final hne e;
    private final hne f;
    private final List g;
    private final cnv h;
    private final cnv i;
    private final hua j;

    public hqe(Set set, hua huaVar) {
        this.c = set;
        this.j = huaVar;
        hne hneVar = new hne(new hjl[16]);
        this.d = hneVar;
        this.e = hneVar;
        this.f = new hne(new Object[16]);
        this.a = new hne(new ffix[16]);
        this.g = new ArrayList();
        this.h = new cnv((byte[]) null);
        this.i = new cnv((byte[]) null);
    }

    private final void e(int i) {
        if (this.g.isEmpty()) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        List list = null;
        cnv cnvVar = null;
        cnv cnvVar2 = null;
        while (true) {
            cnv cnvVar3 = this.i;
            if (i3 >= cnvVar3.b) {
                break;
            }
            if (i <= cnvVar3.a(i3)) {
                Object remove = this.g.remove(i3);
                int c = this.i.c(i3);
                int c2 = this.h.c(i3);
                if (list == null) {
                    list = ffdx.i(remove);
                    cnvVar2 = new cnv((byte[]) null);
                    cnvVar2.e(c);
                    cnvVar = new cnv((byte[]) null);
                    cnvVar.e(c2);
                } else {
                    cnvVar.getClass();
                    cnvVar2.getClass();
                    list.add(remove);
                    cnvVar2.e(c);
                    cnvVar.e(c2);
                }
            } else {
                i3++;
            }
        }
        if (list != null) {
            cnvVar.getClass();
            cnvVar2.getClass();
            int size = list.size() - 1;
            while (i2 < size) {
                int i4 = i2 + 1;
                int size2 = list.size();
                for (int i5 = i4; i5 < size2; i5++) {
                    int a = cnvVar2.a(i2);
                    int a2 = cnvVar2.a(i5);
                    if (a < a2 || (a2 == a && cnvVar.a(i2) < cnvVar.a(i5))) {
                        Object obj = list.get(i2);
                        list.set(i2, list.get(i5));
                        list.set(i5, obj);
                        hqf.a(cnvVar, i2, i5);
                        hqf.a(cnvVar2, i2, i5);
                    }
                }
                i2 = i4;
            }
            hne hneVar = this.f;
            hneVar.p(hneVar.b, list);
        }
    }

    @Override // defpackage.hjj
    public final void a(hjl hjlVar) {
        this.e.n(hjlVar);
    }

    public final void b() {
        if (this.c.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            cos cosVar = new cos((cot) this.c);
            while (cosVar.hasNext()) {
                hjk hjkVar = (hjk) cosVar.next();
                cosVar.remove();
                hjkVar.g();
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        e(Integer.MIN_VALUE);
        if (this.f.b != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                coq coqVar = this.b;
                int i = this.f.b;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Object obj = this.f.a[i];
                    try {
                        if (obj instanceof hjl) {
                            hjk hjkVar = ((hjl) obj).a;
                            this.c.remove(hjkVar);
                            hjkVar.h();
                        }
                        if (obj instanceof hez) {
                            if (coqVar == null || !coqVar.j(obj)) {
                                ((hez) obj).b();
                            } else {
                                ((hez) obj).c();
                            }
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
        if (this.d.b != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                hne hneVar = this.d;
                Object[] objArr = hneVar.a;
                int i2 = hneVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    hjk hjkVar2 = ((hjl) objArr[i3]).a;
                    this.c.remove(hjkVar2);
                    try {
                        hjkVar2.i();
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void d(Object obj, int i, int i2, int i3) {
        e(i);
        if (i3 < 0 || i3 >= i) {
            this.f.n(obj);
            return;
        }
        this.g.add(obj);
        this.h.e(i2);
        this.i.e(i3);
    }
}
