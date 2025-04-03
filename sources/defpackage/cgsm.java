package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgsm extends fipe {
    private final Stack c = new Stack();
    public final List a = new ArrayList();
    public final StringBuilder b = new StringBuilder();
    private int d = 1;

    private final void y(fipy fipyVar) {
        if (this.c.isEmpty()) {
            return;
        }
        fipy a = ((cgsk) this.c.peek()).a();
        if (a == null || ffkj.e(a, fipyVar)) {
            cgsk cgskVar = (cgsk) this.c.pop();
            y(cgskVar.b());
            if (cgskVar instanceof cgsi) {
                cgsi cgsiVar = (cgsi) cgskVar;
                this.a.add(new dltp(cgsiVar.b, cgsiVar.a, this.b.length(), (ffji) null, 56));
                return;
            }
            if (!(cgskVar instanceof cgsj)) {
                if ((cgskVar instanceof cgsh) && (fipyVar instanceof fiqi)) {
                    this.a.add(new dltn(((cgsh) cgskVar).a, ((fiqi) fipyVar).a, this.b.length(), null, 24));
                    return;
                }
                return;
            }
            List list = this.a;
            cgsj cgsjVar = (cgsj) cgskVar;
            dlus dlusVar = cgsjVar.b;
            int i = cgsjVar.a;
            list.add(new dlto(dlusVar, i, a == null ? i : this.b.length(), (ffji) null, 24));
        }
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void a(fiph fiphVar) {
        if (this.b.length() > 0) {
            this.b.append("\n");
        }
        x(fiphVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void b(fipi fipiVar) {
        dlus dlusVar = dlus.g;
        StringBuilder sb = this.b;
        this.a.add(new dlto(dlusVar, sb.length(), sb.length() + fipiVar.a.length(), (ffji) null, 24));
        this.b.append(fipiVar.a);
        x(fipiVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void c(fipk fipkVar) {
        if (fipkVar instanceof fimr) {
            this.c.push(new cgsj(this.b.length(), dlus.f, fipkVar, ((fimr) fipkVar).g));
        }
        if (((Boolean) ((cfup) ctjd.aE.get()).e()).booleanValue()) {
            if (fipkVar instanceof fimy) {
                this.c.push(new cgsj(this.b.length(), dlus.n, fipkVar, ((fimy) fipkVar).g));
            } else if (fipkVar instanceof fimv) {
                this.c.push(new cgsj(this.b.length(), dlus.o, fipkVar, ((fimv) fipkVar).g));
            } else if (fipkVar instanceof fimz) {
                this.c.push(new cgsj(this.b.length(), dlus.p, fipkVar, ((fimz) fipkVar).g));
            } else if (fipkVar instanceof fimx) {
                this.c.push(new cgsj(this.b.length(), dlus.q, fipkVar, ((fimx) fipkVar).g));
                this.b.append("\u200b");
            }
        }
        x(fipkVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void d(fipm fipmVar) {
        this.c.push(new cgsj(this.b.length(), dlus.e, fipmVar, fipmVar.g));
        x(fipmVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void e(fipn fipnVar) {
        this.b.append("\n");
        StringBuilder sb = this.b;
        this.a.add(new dltm(sb.length(), sb.length() + fipnVar.d.length()));
        this.b.append(fipnVar.d);
        x(fipnVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void f(fipo fipoVar) {
        this.b.append("\n\n");
        x(fipoVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void g(fipp fippVar) {
        if (this.b.length() > 0) {
            this.b.append("\n\n");
        }
        this.c.push(new cgsj(this.b.length(), dlus.k, fippVar, fippVar.g));
        x(fippVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void h(fips fipsVar) {
        if (fipsVar.g == null) {
            List list = this.a;
            String str = fipsVar.a;
            str.getClass();
            list.add(new dltn(str, null, this.b.length(), null, 24));
            if (cgsn.a(fipsVar)) {
                this.b.append("\u200b");
                return;
            }
            return;
        }
        Stack stack = this.c;
        int length = this.b.length();
        fipy fipyVar = fipsVar.g;
        String str2 = fipsVar.a;
        str2.getClass();
        stack.push(new cgsh(length, fipsVar, fipyVar, str2));
        if (cgsn.a(fipsVar)) {
            this.b.append("\u200b");
        }
        x(fipsVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void i(fipu fipuVar) {
        int length = this.b.length();
        fipy fipyVar = fipuVar.g;
        String str = fipuVar.a;
        str.getClass();
        this.c.push(new cgsi(length, fipuVar, fipyVar, str));
        x(fipuVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void j(fipx fipxVar) {
        fipy fipyVar;
        fipy fipyVar2 = fipxVar.g;
        if (fipyVar2 != null && (fipyVar = fipyVar2.g) != null) {
            this.c.push(new cgsj(this.b.length(), fipxVar.b() instanceof fiqc ? dlus.j : dlus.i, fipxVar, fipyVar));
            if (fipxVar.b() instanceof fiqc) {
                this.b.append(this.d + ".\t");
                this.d = this.d + 1;
            }
        }
        x(fipxVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void k(fiqc fiqcVar) {
        if (this.b.length() > 0) {
            this.b.append("\n");
        }
        x(fiqcVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (defpackage.cgsn.c(((defpackage.cgsj) r0).b) != false) goto L21;
     */
    @Override // defpackage.fipe, defpackage.fiqk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.fiqd r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = r3.b
            int r0 = r0.length()
            if (r0 <= 0) goto L66
            java.lang.StringBuilder r0 = r3.b
            ffpa r1 = new ffpa
            java.lang.String r2 = "\\n\u200b*$"
            r1.<init>(r2)
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L66
            java.util.Stack r0 = r3.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L40
            java.util.Stack r0 = r3.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L66
            java.util.Stack r0 = r3.c
            java.lang.Object r0 = r0.peek()
            cgsk r0 = (defpackage.cgsk) r0
            r0.getClass()
            boolean r1 = r0 instanceof defpackage.cgsj
            if (r1 == 0) goto L40
            cgsj r0 = (defpackage.cgsj) r0
            dlus r0 = r0.b
            boolean r0 = defpackage.cgsn.c(r0)
            if (r0 != 0) goto L66
        L40:
            java.util.List r0 = r3.a
            boolean r0 = defpackage.cgsn.d(r0)
            java.lang.String r1 = "\n"
            if (r0 == 0) goto L53
            r0 = 1
            r3.d = r0
            java.lang.StringBuilder r0 = r3.b
            r0.append(r1)
            goto L66
        L53:
            fipy r0 = r4.h
            boolean r0 = r0 instanceof defpackage.fipp
            if (r0 == 0) goto L5f
            java.lang.StringBuilder r0 = r3.b
            r0.append(r1)
            goto L66
        L5f:
            java.lang.StringBuilder r0 = r3.b
            java.lang.String r1 = "\n\n"
            r0.append(r1)
        L66:
            r3.x(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgsm.l(fiqd):void");
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void m(fiqe fiqeVar) {
        if (fiqeVar.i instanceof fips) {
            this.b.append("\u200b");
        } else {
            this.b.append("\n");
        }
        x(fiqeVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void n(fiqh fiqhVar) {
        this.c.push(new cgsj(this.b.length(), dlus.d, fiqhVar, fiqhVar.g));
        x(fiqhVar);
    }

    @Override // defpackage.fipe, defpackage.fiqk
    public final void o(fiqi fiqiVar) {
        if (!(fiqiVar.e instanceof fips)) {
            this.b.append(fiqiVar.a);
            this.b.append("\u200b");
        }
        y(fiqiVar);
    }
}
