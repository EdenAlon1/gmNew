package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rns {
    private static HashSet h;
    public final Canvas a;
    public final rle b;
    public rnh c;
    public rno d;
    public Stack e;
    public Stack f;
    public Stack g;

    protected rns(Canvas canvas, rle rleVar) {
        this.a = canvas;
        this.b = rleVar;
    }

    private final void A(rlm rlmVar, String str) {
        rmp a = rlmVar.t.a(str);
        if (a == null) {
            h("Gradient reference '%s' not found", str);
            return;
        }
        if (!(a instanceof rlm)) {
            e("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (a == rlmVar) {
            e("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        rlm rlmVar2 = (rlm) a;
        if (rlmVar.b == null) {
            rlmVar.b = rlmVar2.b;
        }
        if (rlmVar.c == null) {
            rlmVar.c = rlmVar2.c;
        }
        if (rlmVar.e == 0) {
            rlmVar.e = rlmVar2.e;
        }
        if (rlmVar.a.isEmpty()) {
            rlmVar.a = rlmVar2.a;
        }
        try {
            if (rlmVar instanceof rmo) {
                rmo rmoVar = (rmo) rlmVar;
                rmo rmoVar2 = (rmo) a;
                if (rmoVar.f == null) {
                    rmoVar.f = rmoVar2.f;
                }
                if (rmoVar.g == null) {
                    rmoVar.g = rmoVar2.g;
                }
                if (rmoVar.h == null) {
                    rmoVar.h = rmoVar2.h;
                }
                if (rmoVar.i == null) {
                    rmoVar.i = rmoVar2.i;
                }
            } else {
                rms rmsVar = (rms) rlmVar;
                rms rmsVar2 = (rms) a;
                if (rmsVar.f == null) {
                    rmsVar.f = rmsVar2.f;
                }
                if (rmsVar.g == null) {
                    rmsVar.g = rmsVar2.g;
                }
                if (rmsVar.h == null) {
                    rmsVar.h = rmsVar2.h;
                }
                if (rmsVar.i == null) {
                    rmsVar.i = rmsVar2.i;
                }
                if (rmsVar.j == null) {
                    rmsVar.j = rmsVar2.j;
                }
            }
        } catch (ClassCastException unused) {
        }
        String str2 = rlmVar2.d;
        if (str2 != null) {
            A(rlmVar, str2);
        }
    }

    private final void B(rma rmaVar, String str) {
        rmp a = rmaVar.t.a(str);
        if (a == null) {
            h("Pattern reference '%s' not found", str);
            return;
        }
        if (!(a instanceof rma)) {
            e("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (a == rmaVar) {
            e("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        rma rmaVar2 = (rma) a;
        if (rmaVar.a == null) {
            rmaVar.a = rmaVar2.a;
        }
        if (rmaVar.b == null) {
            rmaVar.b = rmaVar2.b;
        }
        if (rmaVar.c == null) {
            rmaVar.c = rmaVar2.c;
        }
        if (rmaVar.d == null) {
            rmaVar.d = rmaVar2.d;
        }
        if (rmaVar.e == null) {
            rmaVar.e = rmaVar2.e;
        }
        if (rmaVar.f == null) {
            rmaVar.f = rmaVar2.f;
        }
        if (rmaVar.g == null) {
            rmaVar.g = rmaVar2.g;
        }
        if (rmaVar.i.isEmpty()) {
            rmaVar.i = rmaVar2.i;
        }
        if (rmaVar.w == null) {
            rmaVar.w = rmaVar2.w;
        }
        if (rmaVar.v == null) {
            rmaVar.v = rmaVar2.v;
        }
        String str2 = rmaVar2.h;
        if (str2 != null) {
            B(rmaVar, str2);
        }
    }

    private static synchronized void C() {
        synchronized (rns.class) {
            HashSet hashSet = new HashSet();
            h = hashSet;
            hashSet.add("Structure");
            h.add("BasicStructure");
            h.add("ConditionalProcessing");
            h.add("Image");
            h.add("Style");
            h.add("ViewportAttribute");
            h.add("Shape");
            h.add("BasicText");
            h.add("PaintAttribute");
            h.add("BasicPaintAttribute");
            h.add("OpacityAttribute");
            h.add("BasicGraphicsAttribute");
            h.add("Marker");
            h.add("Gradient");
            h.add("Pattern");
            h.add("Clip");
            h.add("BasicClip");
            h.add("Mask");
            h.add("View");
        }
    }

    private final void D() {
        this.f.pop();
        this.g.pop();
    }

    private final void E(rml rmlVar) {
        this.f.push(rmlVar);
        this.g.push(this.a.getMatrix());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void F(rmp rmpVar) {
        rlr rlrVar;
        rlr rlrVar2;
        rlr rlrVar3;
        String str;
        int indexOf;
        Set g;
        rlr rlrVar4;
        if (rmpVar instanceof rlv) {
            return;
        }
        M();
        d(rmpVar);
        if (rmpVar instanceof rmh) {
            rmh rmhVar = (rmh) rmpVar;
            G(rmhVar, rmhVar.c, rmhVar.d);
        } else {
            if (rmpVar instanceof rnf) {
                rnf rnfVar = (rnf) rmpVar;
                rlr rlrVar5 = rnfVar.e;
                if ((rlrVar5 == null || !rlrVar5.f()) && ((rlrVar4 = rnfVar.f) == null || !rlrVar4.f())) {
                    O(this.d, rnfVar);
                    if (Q()) {
                        rmp a = rnfVar.t.a(rnfVar.a);
                        if (a == null) {
                            e("Use reference '%s' not found", rnfVar.a);
                        } else {
                            Matrix matrix = rnfVar.b;
                            if (matrix != null) {
                                this.a.concat(matrix);
                            }
                            Matrix matrix2 = new Matrix();
                            rlr rlrVar6 = rnfVar.c;
                            float c = rlrVar6 != null ? rlrVar6.c(this) : 0.0f;
                            rlr rlrVar7 = rnfVar.d;
                            matrix2.preTranslate(c, rlrVar7 != null ? rlrVar7.d(this) : 0.0f);
                            this.a.concat(matrix2);
                            s(rnfVar);
                            boolean R = R();
                            E(rnfVar);
                            if (a instanceof rmh) {
                                M();
                                rmh rmhVar2 = (rmh) a;
                                rlr rlrVar8 = rnfVar.e;
                                if (rlrVar8 == null) {
                                    rlrVar8 = rmhVar2.c;
                                }
                                rlr rlrVar9 = rnfVar.f;
                                if (rlrVar9 == null) {
                                    rlrVar9 = rmhVar2.d;
                                }
                                G(rmhVar2, rlrVar8, rlrVar9);
                                L();
                            } else if (a instanceof rmv) {
                                rlr rlrVar10 = rnfVar.e;
                                if (rlrVar10 == null) {
                                    rlrVar10 = new rlr(100.0f, 9);
                                }
                                rlr rlrVar11 = rnfVar.f;
                                if (rlrVar11 == null) {
                                    rlrVar11 = new rlr(100.0f, 9);
                                }
                                M();
                                rmv rmvVar = (rmv) a;
                                if (!rlrVar10.f() && !rlrVar11.f()) {
                                    rld rldVar = rmvVar.v;
                                    if (rldVar == null) {
                                        rldVar = rld.b;
                                    }
                                    O(this.d, rmvVar);
                                    float c2 = rlrVar10.c(this);
                                    float c3 = rlrVar11.c(this);
                                    rno rnoVar = this.d;
                                    rnoVar.f = new rle(0.0f, 0.0f, c2, c3);
                                    if (!rnoVar.a.o.booleanValue()) {
                                        rle rleVar = this.d.f;
                                        K(rleVar.a, rleVar.b, rleVar.c, rleVar.d);
                                    }
                                    rle rleVar2 = rmvVar.w;
                                    if (rleVar2 != null) {
                                        this.a.concat(U(this.d.f, rleVar2, rldVar));
                                        this.d.g = rmvVar.w;
                                    }
                                    boolean R2 = R();
                                    H(rmvVar, true);
                                    if (R2) {
                                        Z();
                                    }
                                    N(rmvVar);
                                }
                                L();
                            } else {
                                F(a);
                            }
                            D();
                            if (R) {
                                Z();
                            }
                            N(rnfVar);
                        }
                    }
                }
            } else if (rmpVar instanceof rmu) {
                rmu rmuVar = (rmu) rmpVar;
                O(this.d, rmuVar);
                if (Q()) {
                    Matrix matrix3 = rmuVar.b;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    s(rmuVar);
                    boolean R3 = R();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = rmuVar.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        rmp rmpVar2 = (rmp) it.next();
                        if (rmpVar2 instanceof rmi) {
                            rmi rmiVar = (rmi) rmpVar2;
                            if (rmiVar.c() == null && ((g = rmiVar.g()) == null || (!g.isEmpty() && g.contains(language)))) {
                                Set d = rmiVar.d();
                                if (d != null) {
                                    if (h == null) {
                                        C();
                                    }
                                    if (!d.isEmpty() && h.containsAll(d)) {
                                    }
                                }
                                Set f = rmiVar.f();
                                if (f == null) {
                                    Set e = rmiVar.e();
                                    if (e == null) {
                                        F(rmpVar2);
                                        break;
                                    }
                                    e.isEmpty();
                                } else {
                                    f.isEmpty();
                                }
                            }
                        }
                    }
                    if (R3) {
                        Z();
                    }
                    N(rmuVar);
                }
            } else if (rmpVar instanceof rlo) {
                rlo rloVar = (rlo) rmpVar;
                O(this.d, rloVar);
                if (Q()) {
                    Matrix matrix4 = rloVar.b;
                    if (matrix4 != null) {
                        this.a.concat(matrix4);
                    }
                    s(rloVar);
                    boolean R4 = R();
                    H(rloVar, true);
                    if (R4) {
                        Z();
                    }
                    N(rloVar);
                }
            } else if (rmpVar instanceof rlq) {
                rlq rlqVar = (rlq) rmpVar;
                rlr rlrVar12 = rlqVar.d;
                if (rlrVar12 != null && !rlrVar12.f() && (rlrVar3 = rlqVar.e) != null && !rlrVar3.f() && (str = rlqVar.a) != null) {
                    rld rldVar2 = rlqVar.v;
                    if (rldVar2 == null) {
                        rldVar2 = rld.b;
                    }
                    Bitmap bitmap = null;
                    if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) != -1 && indexOf >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                        byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                        bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    }
                    if (bitmap != null) {
                        O(this.d, rlqVar);
                        if (Q() && i()) {
                            Matrix matrix5 = rlqVar.f;
                            if (matrix5 != null) {
                                this.a.concat(matrix5);
                            }
                            rlr rlrVar13 = rlqVar.b;
                            float c4 = rlrVar13 != null ? rlrVar13.c(this) : 0.0f;
                            rlr rlrVar14 = rlqVar.c;
                            float d2 = rlrVar14 != null ? rlrVar14.d(this) : 0.0f;
                            float c5 = rlqVar.d.c(this);
                            float c6 = rlqVar.e.c(this);
                            rno rnoVar2 = this.d;
                            rnoVar2.f = new rle(c4, d2, c5, c6);
                            if (!rnoVar2.a.o.booleanValue()) {
                                rle rleVar3 = this.d.f;
                                K(rleVar3.a, rleVar3.b, rleVar3.c, rleVar3.d);
                            }
                            rlqVar.n = new rle(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                            this.a.concat(U(this.d.f, rlqVar.n, rldVar2));
                            N(rlqVar);
                            s(rlqVar);
                            boolean R5 = R();
                            P();
                            this.a.drawBitmap(bitmap, 0.0f, 0.0f, new Paint());
                            if (R5) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rmpVar instanceof rlx) {
                rlx rlxVar = (rlx) rmpVar;
                if (rlxVar.a != null) {
                    O(this.d, rlxVar);
                    if (Q() && i()) {
                        rno rnoVar3 = this.d;
                        if (rnoVar3.c || rnoVar3.b) {
                            Matrix matrix6 = rlxVar.e;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path path = new rnk(rlxVar.a).a;
                            if (rlxVar.n == null) {
                                rlxVar.n = T(path);
                            }
                            N(rlxVar);
                            u(rlxVar);
                            s(rlxVar);
                            boolean R6 = R();
                            rno rnoVar4 = this.d;
                            if (rnoVar4.b) {
                                int i = rnoVar4.a.D;
                                path.setFillType(i == 0 ? Path.FillType.WINDING : i + (-1) != 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                w(rlxVar, path);
                            }
                            if (this.d.c) {
                                x(path);
                            }
                            J(rlxVar);
                            if (R6) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rmpVar instanceof rmd) {
                rmd rmdVar = (rmd) rmpVar;
                rlr rlrVar15 = rmdVar.c;
                if (rlrVar15 != null && (rlrVar2 = rmdVar.d) != null && !rlrVar15.f() && !rlrVar2.f()) {
                    O(this.d, rmdVar);
                    if (Q() && i()) {
                        Matrix matrix7 = rmdVar.e;
                        if (matrix7 != null) {
                            this.a.concat(matrix7);
                        }
                        Path o = o(rmdVar);
                        N(rmdVar);
                        u(rmdVar);
                        s(rmdVar);
                        boolean R7 = R();
                        if (this.d.b) {
                            w(rmdVar, o);
                        }
                        if (this.d.c) {
                            x(o);
                        }
                        if (R7) {
                            Z();
                        }
                    }
                }
            } else if (rmpVar instanceof rlg) {
                rlg rlgVar = (rlg) rmpVar;
                rlr rlrVar16 = rlgVar.c;
                if (rlrVar16 != null && !rlrVar16.f()) {
                    O(this.d, rlgVar);
                    if (Q() && i()) {
                        Matrix matrix8 = rlgVar.e;
                        if (matrix8 != null) {
                            this.a.concat(matrix8);
                        }
                        Path l = l(rlgVar);
                        N(rlgVar);
                        u(rlgVar);
                        s(rlgVar);
                        boolean R8 = R();
                        if (this.d.b) {
                            w(rlgVar, l);
                        }
                        if (this.d.c) {
                            x(l);
                        }
                        if (R8) {
                            Z();
                        }
                    }
                }
            } else if (rmpVar instanceof rll) {
                rll rllVar = (rll) rmpVar;
                rlr rlrVar17 = rllVar.c;
                if (rlrVar17 != null && (rlrVar = rllVar.d) != null && !rlrVar17.f() && !rlrVar.f()) {
                    O(this.d, rllVar);
                    if (Q() && i()) {
                        Matrix matrix9 = rllVar.e;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        Path m = m(rllVar);
                        N(rllVar);
                        u(rllVar);
                        s(rllVar);
                        boolean R9 = R();
                        if (this.d.b) {
                            w(rllVar, m);
                        }
                        if (this.d.c) {
                            x(m);
                        }
                        if (R9) {
                            Z();
                        }
                    }
                }
            } else if (rmpVar instanceof rls) {
                rls rlsVar = (rls) rmpVar;
                O(this.d, rlsVar);
                if (Q() && i() && this.d.c) {
                    Matrix matrix10 = rlsVar.e;
                    if (matrix10 != null) {
                        this.a.concat(matrix10);
                    }
                    rlr rlrVar18 = rlsVar.a;
                    float c7 = rlrVar18 == null ? 0.0f : rlrVar18.c(this);
                    rlr rlrVar19 = rlsVar.b;
                    float d3 = rlrVar19 == null ? 0.0f : rlrVar19.d(this);
                    rlr rlrVar20 = rlsVar.c;
                    float c8 = rlrVar20 == null ? 0.0f : rlrVar20.c(this);
                    rlr rlrVar21 = rlsVar.d;
                    r3 = rlrVar21 != null ? rlrVar21.d(this) : 0.0f;
                    if (rlsVar.n == null) {
                        rlsVar.n = new rle(Math.min(c7, d3), Math.min(d3, r3), Math.abs(c8 - c7), Math.abs(r3 - d3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(c7, d3);
                    path2.lineTo(c8, r3);
                    N(rlsVar);
                    u(rlsVar);
                    s(rlsVar);
                    boolean R10 = R();
                    x(path2);
                    J(rlsVar);
                    if (R10) {
                        Z();
                    }
                }
            } else if (rmpVar instanceof rmc) {
                rmc rmcVar = (rmc) rmpVar;
                O(this.d, rmcVar);
                if (Q() && i()) {
                    rno rnoVar5 = this.d;
                    if (rnoVar5.c || rnoVar5.b) {
                        Matrix matrix11 = rmcVar.e;
                        if (matrix11 != null) {
                            this.a.concat(matrix11);
                        }
                        if (rmcVar.a.length >= 2) {
                            Path n = n(rmcVar);
                            N(rmcVar);
                            u(rmcVar);
                            s(rmcVar);
                            boolean R11 = R();
                            if (this.d.b) {
                                w(rmcVar, n);
                            }
                            if (this.d.c) {
                                x(n);
                            }
                            J(rmcVar);
                            if (R11) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rmpVar instanceof rmb) {
                rmb rmbVar = (rmb) rmpVar;
                O(this.d, rmbVar);
                if (Q() && i()) {
                    rno rnoVar6 = this.d;
                    if (rnoVar6.c || rnoVar6.b) {
                        Matrix matrix12 = rmbVar.e;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        if (rmbVar.a.length >= 2) {
                            Path n2 = n(rmbVar);
                            N(rmbVar);
                            u(rmbVar);
                            s(rmbVar);
                            boolean R12 = R();
                            if (this.d.b) {
                                w(rmbVar, n2);
                            }
                            if (this.d.c) {
                                x(n2);
                            }
                            J(rmbVar);
                            if (R12) {
                                Z();
                            }
                        }
                    }
                }
            } else if (rmpVar instanceof rmy) {
                rmy rmyVar = (rmy) rmpVar;
                O(this.d, rmyVar);
                if (Q()) {
                    Matrix matrix13 = rmyVar.a;
                    if (matrix13 != null) {
                        this.a.concat(matrix13);
                    }
                    List list = rmyVar.b;
                    float c9 = (list == null || list.size() == 0) ? 0.0f : ((rlr) rmyVar.b.get(0)).c(this);
                    List list2 = rmyVar.c;
                    float d4 = (list2 == null || list2.size() == 0) ? 0.0f : ((rlr) rmyVar.c.get(0)).d(this);
                    List list3 = rmyVar.d;
                    float c10 = (list3 == null || list3.size() == 0) ? 0.0f : ((rlr) rmyVar.d.get(0)).c(this);
                    List list4 = rmyVar.e;
                    if (list4 != null && list4.size() != 0) {
                        r3 = ((rlr) rmyVar.e.get(0)).d(this);
                    }
                    int S = S();
                    if (S != 1) {
                        float j = j(rmyVar);
                        if (S == 2) {
                            j /= 2.0f;
                        }
                        c9 -= j;
                    }
                    if (rmyVar.n == null) {
                        rnp rnpVar = new rnp(this, c9, d4);
                        y(rmyVar, rnpVar);
                        RectF rectF = rnpVar.c;
                        rmyVar.n = new rle(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    N(rmyVar);
                    u(rmyVar);
                    s(rmyVar);
                    boolean R13 = R();
                    y(rmyVar, new rnm(this, c9 + c10, d4 + r3));
                    if (R13) {
                        Z();
                    }
                }
            }
        }
        L();
    }

    private final void G(rmh rmhVar, rlr rlrVar, rlr rlrVar2) {
        f(rmhVar, rlrVar, rlrVar2, rmhVar.w, rmhVar.v);
    }

    private final void H(rml rmlVar, boolean z) {
        if (z) {
            E(rmlVar);
        }
        Iterator it = rmlVar.n().iterator();
        while (it.hasNext()) {
            F((rmp) it.next());
        }
        if (z) {
            D();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0102, code lost:
    
        if (r11.d.a.o.booleanValue() != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        K(r0, r1, r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0107, code lost:
    
        r3.reset();
        r3.preScale(r6, r5);
        r11.a.concat(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I(defpackage.rlt r12, defpackage.rnj r13) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.I(rlt, rnj):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void J(defpackage.rln r15) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.J(rln):void");
    }

    private final void K(float f, float f2, float f3, float f4) {
        rlf rlfVar = this.d.a.p;
        float f5 = f4 + f2;
        float f6 = f3 + f;
        if (rlfVar != null) {
            f += rlfVar.d.c(this);
            f2 += this.d.a.p.a.d(this);
            f6 -= this.d.a.p.b.c(this);
            f5 -= this.d.a.p.c.d(this);
        }
        this.a.clipRect(f, f2, f6, f5);
    }

    private final void L() {
        this.a.restore();
        this.d = (rno) this.e.pop();
    }

    private final void M() {
        this.a.save();
        this.e.push(this.d);
        this.d = (rno) this.d.clone();
    }

    private final void N(rmm rmmVar) {
        if (rmmVar.u == null || rmmVar.n == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.g.peek()).invert(matrix)) {
            rle rleVar = rmmVar.n;
            float f = rleVar.a;
            float f2 = rleVar.b;
            float a = rleVar.a();
            rle rleVar2 = rmmVar.n;
            float f3 = rleVar2.b;
            float a2 = rleVar2.a();
            float b = rmmVar.n.b();
            rle rleVar3 = rmmVar.n;
            float[] fArr = {f, f2, a, f3, a2, b, rleVar3.a, rleVar3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                if (fArr[i] < rectF.left) {
                    rectF.left = fArr[i];
                }
                if (fArr[i] > rectF.right) {
                    rectF.right = fArr[i];
                }
                int i2 = i + 1;
                if (fArr[i2] < rectF.top) {
                    rectF.top = fArr[i2];
                }
                if (fArr[i2] > rectF.bottom) {
                    rectF.bottom = fArr[i2];
                }
            }
            rmm rmmVar2 = (rmm) this.f.peek();
            rle rleVar4 = rmmVar2.n;
            if (rleVar4 == null) {
                rmmVar2.n = rle.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            rle c = rle.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
            float f6 = c.a;
            float f7 = rleVar4.a;
            if (f6 < f7) {
                rleVar4.a = f6;
            } else {
                f6 = f7;
            }
            float f8 = c.b;
            float f9 = rleVar4.b;
            if (f8 < f9) {
                rleVar4.b = f8;
            } else {
                f8 = f9;
            }
            if (c.a() > rleVar4.a()) {
                rleVar4.c = c.a() - f6;
            }
            if (c.b() > rleVar4.b()) {
                rleVar4.d = c.b() - f8;
            }
        }
    }

    private final void O(rno rnoVar, rmn rmnVar) {
        rml rmlVar = rmnVar.u;
        rmg rmgVar = rnoVar.a;
        rmgVar.t = Boolean.TRUE;
        rmgVar.o = rmlVar == null ? Boolean.TRUE : Boolean.FALSE;
        rmgVar.p = null;
        rmgVar.x = null;
        Float valueOf = Float.valueOf(1.0f);
        rmgVar.j = valueOf;
        rmgVar.v = rli.a;
        rmgVar.w = valueOf;
        rmgVar.y = null;
        rmgVar.z = null;
        rmgVar.A = valueOf;
        rmgVar.B = null;
        rmgVar.C = valueOf;
        rmgVar.L = 1;
        rmg rmgVar2 = rmnVar.q;
        if (rmgVar2 != null) {
            g(rnoVar, rmgVar2);
        }
        List list = this.c.c.a;
        if (list != null && !list.isEmpty()) {
            for (rkv rkvVar : this.c.c.a) {
                rkx rkxVar = rkvVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj = rmnVar.u; obj != null; obj = ((rmp) obj).u) {
                    arrayList.add(0, obj);
                }
                int size = arrayList.size() - 1;
                if (rkxVar.a() == 1 ? rkz.e(rkxVar.b(0), arrayList, size, rmnVar) : rkz.d(rkxVar, rkxVar.a() - 1, arrayList, size, rmnVar)) {
                    g(rnoVar, rkvVar.b);
                }
            }
        }
        rmg rmgVar3 = rmnVar.r;
        if (rmgVar3 != null) {
            g(rnoVar, rmgVar3);
        }
    }

    private final void P() {
        int i;
        rmg rmgVar = this.d.a;
        rmq rmqVar = rmgVar.B;
        if (rmqVar instanceof rli) {
            i = ((rli) rmqVar).b;
        } else if (!(rmqVar instanceof rlj)) {
            return;
        } else {
            i = rmgVar.k.b;
        }
        Float f = rmgVar.C;
        if (f != null) {
            i |= W(f.floatValue()) << 24;
        }
        this.a.drawColor(i);
    }

    private final boolean Q() {
        Boolean bool = this.d.a.t;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final boolean R() {
        rno rnoVar = this.d;
        if (rnoVar.a.y != null) {
            boolean z = rnoVar.i;
            h("Masks are not supported when using getPicture()", new Object[0]);
        }
        if (this.d.a.j.floatValue() >= 1.0f) {
            rno rnoVar2 = this.d;
            if (rnoVar2.a.y != null) {
                boolean z2 = rnoVar2.i;
            }
            return false;
        }
        this.a.saveLayerAlpha(null, W(this.d.a.j.floatValue()), 31);
        this.e.push(this.d);
        rno rnoVar3 = (rno) this.d.clone();
        this.d = rnoVar3;
        if (rnoVar3.a.y == null) {
            return true;
        }
        boolean z3 = rnoVar3.i;
        return true;
    }

    private final int S() {
        int i;
        rmg rmgVar = this.d.a;
        return (rmgVar.I == 1 || (i = rmgVar.J) == 2) ? rmgVar.J : i == 1 ? 3 : 1;
    }

    private static final rle T(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new rle(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r7 != 9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.graphics.Matrix U(defpackage.rle r9, defpackage.rle r10, defpackage.rld r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            rlc r1 = r11.c
            if (r1 != 0) goto La
            return r0
        La:
            float r1 = r9.c
            float r2 = r10.c
            float r1 = r1 / r2
            float r2 = r9.d
            float r3 = r10.d
            float r2 = r2 / r3
            float r3 = r10.a
            float r3 = -r3
            float r4 = r10.b
            float r4 = -r4
            rld r5 = defpackage.rld.a
            boolean r5 = r11.equals(r5)
            if (r5 != 0) goto L7c
            int r5 = r11.d
            r6 = 2
            if (r5 != r6) goto L2c
            float r1 = java.lang.Math.max(r1, r2)
            goto L30
        L2c:
            float r1 = java.lang.Math.min(r1, r2)
        L30:
            float r2 = r9.c
            float r2 = r2 / r1
            float r5 = r9.d
            float r5 = r5 / r1
            rlc r7 = r11.c
            int r7 = r7.ordinal()
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 == r6) goto L56
            r6 = 3
            if (r7 == r6) goto L52
            r6 = 5
            if (r7 == r6) goto L56
            r6 = 6
            if (r7 == r6) goto L52
            r6 = 8
            if (r7 == r6) goto L56
            r6 = 9
            if (r7 == r6) goto L52
            goto L5b
        L52:
            float r6 = r10.c
            float r6 = r6 - r2
            goto L5a
        L56:
            float r6 = r10.c
            float r6 = r6 - r2
            float r6 = r6 / r8
        L5a:
            float r3 = r3 - r6
        L5b:
            rlc r11 = r11.c
            int r11 = r11.ordinal()
            switch(r11) {
                case 4: goto L69;
                case 5: goto L69;
                case 6: goto L69;
                case 7: goto L65;
                case 8: goto L65;
                case 9: goto L65;
                default: goto L64;
            }
        L64:
            goto L6e
        L65:
            float r10 = r10.d
            float r10 = r10 - r5
            goto L6d
        L69:
            float r10 = r10.d
            float r10 = r10 - r5
            float r10 = r10 / r8
        L6d:
            float r4 = r4 - r10
        L6e:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r1)
            r0.preTranslate(r3, r4)
            return r0
        L7c:
            float r10 = r9.a
            float r9 = r9.b
            r0.preTranslate(r10, r9)
            r0.preScale(r1, r2)
            r0.preTranslate(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.U(rle, rle, rld):android.graphics.Matrix");
    }

    private static final Typeface V(String str, Integer num, int i) {
        int i2 = 2;
        if (num.intValue() > 500) {
            i2 = i == 2 ? 3 : 1;
        } else if (i != 2) {
            i2 = 0;
        }
        if (str.equals("serif")) {
            return Typeface.create(Typeface.SERIF, i2);
        }
        if (str.equals("sans-serif")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("monospace")) {
            return Typeface.create(Typeface.MONOSPACE, i2);
        }
        if (str.equals("cursive")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        if (str.equals("fantasy")) {
            return Typeface.create(Typeface.SANS_SERIF, i2);
        }
        return null;
    }

    private static final int W(float f) {
        int i = (int) (f * 256.0f);
        if (i < 0) {
            return 0;
        }
        return i > 255 ? PrivateKeyType.INVALID : i;
    }

    private final void X(rmp rmpVar, rno rnoVar) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (rmpVar instanceof rmn) {
                arrayList.add(0, (rmn) rmpVar);
            }
            Object obj = rmpVar.u;
            if (obj == null) {
                break;
            } else {
                rmpVar = (rmp) obj;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            O(rnoVar, (rmn) arrayList.get(i));
        }
        rnoVar.g = this.c.a.w;
        if (rnoVar.g == null) {
            rnoVar.g = this.b;
        }
        rnoVar.f = this.b;
        boolean z = this.d.i;
        rnoVar.i = false;
    }

    private static final boolean Y(rmg rmgVar, long j) {
        return (j & rmgVar.a) != 0;
    }

    private final void Z() {
        rno rnoVar = this.d;
        if (rnoVar.a.y != null) {
            boolean z = rnoVar.i;
        }
        L();
    }

    private static final void aa(rno rnoVar, boolean z, rmq rmqVar) {
        int i;
        rmg rmgVar = rnoVar.a;
        boolean z2 = rmqVar instanceof rli;
        float floatValue = (z ? rmgVar.c : rmgVar.e).floatValue();
        if (z2) {
            i = ((rli) rmqVar).b;
        } else if (!(rmqVar instanceof rlj)) {
            return;
        } else {
            i = rnoVar.a.k.b;
        }
        int W = i | (W(floatValue) << 24);
        if (z) {
            rnoVar.d.setColor(W);
        } else {
            rnoVar.e.setColor(W);
        }
    }

    public static void c(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, rlz rlzVar) {
        float f8;
        float f9;
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            rlzVar.e(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = (float) Math.toRadians(f5 % 360.0d);
        float cos = (float) Math.cos(radians);
        float sin = (float) Math.sin(radians);
        float f10 = abs * abs;
        float f11 = abs2 * abs2;
        float f12 = (f - f6) / 2.0f;
        float f13 = (f2 - f7) / 2.0f;
        float f14 = ((-sin) * f12) + (cos * f13);
        float f15 = f14 * f14;
        float f16 = (f12 * cos) + (f13 * sin);
        float f17 = f16 * f16;
        float f18 = (f17 / f10) + (f15 / f11);
        if (f18 > 1.0f) {
            double d = f18;
            f8 = 2.0f;
            f9 = f15;
            abs *= (float) Math.sqrt(d);
            abs2 *= (float) Math.sqrt(d);
            f11 = abs2 * abs2;
            f10 = abs * abs;
        } else {
            f8 = 2.0f;
            f9 = f15;
        }
        float f19 = z == z2 ? -1.0f : 1.0f;
        float f20 = f10 * f9;
        float f21 = f17 * f11;
        float f22 = (((f10 * f11) - f20) - f21) / (f20 + f21);
        if (f22 < 0.0f) {
            f22 = 0.0f;
        }
        float f23 = (f + f6) / f8;
        float f24 = (f2 + f7) / f8;
        float sqrt = (float) (f19 * Math.sqrt(f22));
        float f25 = ((abs * f14) / abs2) * sqrt;
        float f26 = cos * f25;
        float f27 = sqrt * (-((abs2 * f16) / abs));
        float f28 = sin * f27;
        float f29 = sin * f25;
        float f30 = cos * f27;
        float f31 = f16 - f25;
        float f32 = f14 - f27;
        float f33 = -f16;
        float f34 = -f14;
        float f35 = f31 / abs;
        float f36 = f32 / abs2;
        float f37 = (f35 * f35) + (f36 * f36);
        float degrees = (float) Math.toDegrees((f36 < 0.0f ? -1.0f : 1.0f) * Math.acos(f35 / ((float) Math.sqrt(f37))));
        float f38 = (f33 - f25) / abs;
        float f39 = (f34 - f27) / abs2;
        float sqrt2 = (float) Math.sqrt(f37 * ((f38 * f38) + (f39 * f39)));
        float degrees2 = (float) Math.toDegrees(((f35 * f39) - (f36 * f38) < 0.0f ? -1.0f : 1.0f) * Math.acos(((f35 * f38) + (f36 * f39)) / sqrt2));
        if (z2) {
            if (degrees2 < 0.0f) {
                degrees2 += 360.0f;
            }
        } else if (degrees2 > 0.0f) {
            degrees2 -= 360.0f;
        }
        double d2 = degrees2 % 360.0f;
        int ceil = (int) Math.ceil(Math.abs(d2) / 90.0d);
        double radians2 = Math.toRadians(degrees % 360.0f);
        double radians3 = (float) (Math.toRadians(d2) / ceil);
        double d3 = radians3 / 2.0d;
        double sin2 = Math.sin(d3) * 1.3333333333333333d;
        double cos2 = Math.cos(d3) + 1.0d;
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d4 = sin2 / cos2;
            int i4 = ceil;
            int i5 = i2;
            double d5 = (i2 * r4) + radians2;
            double cos3 = Math.cos(d5);
            double sin3 = Math.sin(d5);
            fArr[i3] = (float) (cos3 - (d4 * sin3));
            fArr[i3 + 1] = (float) (sin3 + (cos3 * d4));
            double d6 = d5 + radians3;
            double cos4 = Math.cos(d6);
            double sin4 = Math.sin(d6);
            fArr[i3 + 2] = (float) (cos4 + (d4 * sin4));
            fArr[i3 + 3] = (float) (sin4 - (d4 * cos4));
            int i6 = i3 + 5;
            fArr[i3 + 4] = (float) cos4;
            i3 += 6;
            fArr[i6] = (float) sin4;
            i2 = i5 + 1;
            ceil = i4;
            cos2 = cos2;
            f28 = f28;
            f23 = f23;
            radians2 = radians2;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate(f23 + (f26 - f28), f24 + f29 + f30);
        matrix.mapPoints(fArr);
        if (i >= 2) {
            fArr[i - 2] = f6;
            fArr[i - 1] = f7;
        }
        for (int i7 = 0; i7 < i; i7 += 6) {
            rlzVar.c(fArr[i7], fArr[i7 + 1], fArr[i7 + 2], fArr[i7 + 3], fArr[i7 + 4], fArr[i7 + 5]);
        }
    }

    public static void e(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void h(String str, Object... objArr) {
        Log.w("SVGAndroidRenderer", String.format(str, objArr));
    }

    private final float j(rna rnaVar) {
        rnr rnrVar = new rnr(this);
        y(rnaVar, rnrVar);
        return rnrVar.a;
    }

    private final Path.FillType k() {
        int i = this.d.a.K;
        return (i != 0 && i + (-1) == 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    private final Path l(rlg rlgVar) {
        rlr rlrVar = rlgVar.a;
        float c = rlrVar != null ? rlrVar.c(this) : 0.0f;
        rlr rlrVar2 = rlgVar.b;
        float d = rlrVar2 != null ? rlrVar2.d(this) : 0.0f;
        float a = rlgVar.c.a(this);
        float f = c - a;
        float f2 = d - a;
        float f3 = c + a;
        float f4 = d + a;
        if (rlgVar.n == null) {
            float f5 = a + a;
            rlgVar.n = new rle(f, f2, f5, f5);
        }
        float f6 = a * 0.5522848f;
        Path path = new Path();
        path.moveTo(c, f2);
        float f7 = c + f6;
        float f8 = d - f6;
        path.cubicTo(f7, f2, f3, f8, f3, d);
        float f9 = d + f6;
        path.cubicTo(f3, f9, f7, f4, c, f4);
        float f10 = c - f6;
        path.cubicTo(f10, f4, f, f9, f, d);
        path.cubicTo(f, f8, f10, f2, c, f2);
        path.close();
        return path;
    }

    private final Path m(rll rllVar) {
        rlr rlrVar = rllVar.a;
        float c = rlrVar != null ? rlrVar.c(this) : 0.0f;
        rlr rlrVar2 = rllVar.b;
        float d = rlrVar2 != null ? rlrVar2.d(this) : 0.0f;
        float c2 = rllVar.c.c(this);
        float d2 = rllVar.d.d(this);
        float f = c - c2;
        float f2 = d - d2;
        float f3 = c + c2;
        float f4 = d + d2;
        if (rllVar.n == null) {
            rllVar.n = new rle(f, f2, c2 + c2, d2 + d2);
        }
        float f5 = c2 * 0.5522848f;
        float f6 = d2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(c, f2);
        float f7 = c + f5;
        float f8 = d - f6;
        path.cubicTo(f7, f2, f3, f8, f3, d);
        float f9 = d + f6;
        path.cubicTo(f3, f9, f7, f4, c, f4);
        float f10 = c - f5;
        path.cubicTo(f10, f4, f, f9, f, d);
        path.cubicTo(f, f8, f10, f2, c, f2);
        path.close();
        return path;
    }

    private final Path n(rmb rmbVar) {
        Path path = new Path();
        float[] fArr = rmbVar.a;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = rmbVar.a;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (rmbVar instanceof rmc) {
            path.close();
        }
        if (rmbVar.n == null) {
            rmbVar.n = T(path);
        }
        path.setFillType(k());
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.graphics.Path o(defpackage.rmd r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.o(rmd):android.graphics.Path");
    }

    private final rno p(rmp rmpVar) {
        rno rnoVar = new rno();
        g(rnoVar, rmg.a());
        X(rmpVar, rnoVar);
        return rnoVar;
    }

    private final String q(String str, boolean z, boolean z2) {
        if (this.d.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    private final void r(rmp rmpVar, boolean z, Path path, Matrix matrix) {
        Path n;
        if (Q()) {
            this.a.save();
            this.e.push(this.d);
            rno rnoVar = (rno) this.d.clone();
            this.d = rnoVar;
            if (rmpVar instanceof rnf) {
                if (z) {
                    rnf rnfVar = (rnf) rmpVar;
                    O(rnoVar, rnfVar);
                    if (Q() && i()) {
                        Matrix matrix2 = rnfVar.b;
                        if (matrix2 != null) {
                            matrix.preConcat(matrix2);
                        }
                        rmp a = rnfVar.t.a(rnfVar.a);
                        if (a == null) {
                            e("Use reference '%s' not found", rnfVar.a);
                        } else {
                            s(rnfVar);
                            r(a, false, path, matrix);
                        }
                    }
                } else {
                    e("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
            } else if (rmpVar instanceof rlx) {
                rlx rlxVar = (rlx) rmpVar;
                O(rnoVar, rlxVar);
                if (Q() && i()) {
                    Matrix matrix3 = rlxVar.e;
                    if (matrix3 != null) {
                        matrix.preConcat(matrix3);
                    }
                    Path path2 = new rnk(rlxVar.a).a;
                    if (rlxVar.n == null) {
                        rlxVar.n = T(path2);
                    }
                    s(rlxVar);
                    path.setFillType(k());
                    path.addPath(path2, matrix);
                }
            } else if (rmpVar instanceof rmy) {
                rmy rmyVar = (rmy) rmpVar;
                O(rnoVar, rmyVar);
                if (Q()) {
                    Matrix matrix4 = rmyVar.a;
                    if (matrix4 != null) {
                        matrix.preConcat(matrix4);
                    }
                    List list = rmyVar.b;
                    float f = 0.0f;
                    float c = (list == null || list.size() == 0) ? 0.0f : ((rlr) rmyVar.b.get(0)).c(this);
                    List list2 = rmyVar.c;
                    float d = (list2 == null || list2.size() == 0) ? 0.0f : ((rlr) rmyVar.c.get(0)).d(this);
                    List list3 = rmyVar.d;
                    float c2 = (list3 == null || list3.size() == 0) ? 0.0f : ((rlr) rmyVar.d.get(0)).c(this);
                    List list4 = rmyVar.e;
                    if (list4 != null && list4.size() != 0) {
                        f = ((rlr) rmyVar.e.get(0)).d(this);
                    }
                    if (this.d.a.J != 1) {
                        float j = j(rmyVar);
                        if (this.d.a.J == 2) {
                            j /= 2.0f;
                        }
                        c -= j;
                    }
                    if (rmyVar.n == null) {
                        rnp rnpVar = new rnp(this, c, d);
                        y(rmyVar, rnpVar);
                        RectF rectF = rnpVar.c;
                        rmyVar.n = new rle(rectF.left, rectF.top, rectF.width(), rectF.height());
                    }
                    s(rmyVar);
                    Path path3 = new Path();
                    y(rmyVar, new rnn(this, c + c2, d + f, path3));
                    path.setFillType(k());
                    path.addPath(path3, matrix);
                }
            } else if (rmpVar instanceof rln) {
                rln rlnVar = (rln) rmpVar;
                O(rnoVar, rlnVar);
                if (Q() && i()) {
                    Matrix matrix5 = rlnVar.e;
                    if (matrix5 != null) {
                        matrix.preConcat(matrix5);
                    }
                    if (rlnVar instanceof rmd) {
                        n = o((rmd) rlnVar);
                    } else if (rlnVar instanceof rlg) {
                        n = l((rlg) rlnVar);
                    } else if (rlnVar instanceof rll) {
                        n = m((rll) rlnVar);
                    } else if (rlnVar instanceof rmb) {
                        n = n((rmb) rlnVar);
                    }
                    s(rlnVar);
                    path.setFillType(n.getFillType());
                    path.addPath(n, matrix);
                }
            } else {
                e("Invalid %s element found in clipPath definition", rmpVar.getClass().getSimpleName());
            }
            this.a.restore();
            this.d = (rno) this.e.pop();
        }
    }

    private final void s(rmm rmmVar) {
        t(rmmVar, rmmVar.n);
    }

    private final void t(rmm rmmVar, rle rleVar) {
        String str = this.d.a.x;
        if (str == null) {
            return;
        }
        rmp a = rmmVar.t.a(str);
        if (a == null) {
            e("ClipPath reference '%s' not found", this.d.a.x);
            return;
        }
        rlh rlhVar = (rlh) a;
        if (rlhVar.i.isEmpty()) {
            this.a.clipRect(0, 0, 0, 0);
            return;
        }
        Boolean bool = rlhVar.a;
        boolean z = bool == null || bool.booleanValue();
        if ((rmmVar instanceof rlo) && !z) {
            h("<clipPath clipPathUnits=\"objectBoundingBox\"> is not supported when referenced from container elements (like %s)", rmmVar.getClass().getSimpleName());
            return;
        }
        this.e.push(this.d);
        this.d = (rno) this.d.clone();
        Matrix matrix = new Matrix();
        if (!z) {
            Matrix matrix2 = new Matrix();
            matrix2.preTranslate(rleVar.a, rleVar.b);
            matrix2.preScale(rleVar.c, rleVar.d);
            this.a.concat(matrix2);
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
        Matrix matrix4 = rlhVar.b;
        if (matrix4 != null) {
            this.a.concat(matrix4);
            Matrix matrix5 = new Matrix();
            if (matrix4.invert(matrix5)) {
                matrix.postConcat(matrix5);
            }
        }
        this.d = p(rlhVar);
        s(rlhVar);
        Path path = new Path();
        Iterator it = rlhVar.i.iterator();
        while (it.hasNext()) {
            r((rmp) it.next(), true, path, new Matrix());
        }
        this.a.clipPath(path);
        this.d = (rno) this.e.pop();
        this.a.concat(matrix);
    }

    private final void u(rmm rmmVar) {
        rmq rmqVar = this.d.a.b;
        if (rmqVar instanceof rlw) {
            v(true, rmmVar.n, (rlw) rmqVar);
        }
        rmq rmqVar2 = this.d.a.d;
        if (rmqVar2 instanceof rlw) {
            v(false, rmmVar.n, (rlw) rmqVar2);
        }
    }

    private final void v(boolean z, rle rleVar, rlw rlwVar) {
        float f;
        Paint paint;
        boolean z2;
        float f2;
        float f3;
        float f4;
        float b;
        float f5;
        Paint paint2;
        float b2;
        float b3;
        float b4;
        float b5;
        float f6;
        float f7;
        float f8;
        float f9;
        boolean z3 = z;
        rmp a = this.c.a(rlwVar.a);
        if (a == null) {
            e("%s reference '%s' not found", true != z3 ? "Stroke" : "Fill", rlwVar.a);
            rmq rmqVar = rlwVar.b;
            if (rmqVar != null) {
                aa(this.d, z3, rmqVar);
                return;
            } else if (z3) {
                this.d.b = false;
                return;
            } else {
                this.d.c = false;
                return;
            }
        }
        if (a instanceof rmo) {
            rmo rmoVar = (rmo) a;
            String str = rmoVar.d;
            if (str != null) {
                A(rmoVar, str);
            }
            Boolean bool = rmoVar.b;
            boolean z4 = bool != null && bool.booleanValue();
            if (z3) {
                paint2 = this.d.d;
                z3 = true;
            } else {
                paint2 = this.d.e;
                z3 = false;
            }
            boolean z5 = z3;
            if (z4) {
                rle b6 = b();
                rlr rlrVar = rmoVar.f;
                b2 = rlrVar != null ? rlrVar.c(this) : 0.0f;
                f = 0.0f;
                rlr rlrVar2 = rmoVar.g;
                b3 = rlrVar2 != null ? rlrVar2.d(this) : 0.0f;
                rlr rlrVar3 = rmoVar.h;
                b4 = rlrVar3 != null ? rlrVar3.c(this) : b6.c;
                rlr rlrVar4 = rmoVar.i;
                if (rlrVar4 != null) {
                    b5 = rlrVar4.d(this);
                    f6 = b4;
                    f7 = b2;
                    f8 = b3;
                    f9 = b5;
                }
                f6 = b4;
                f7 = b2;
                f8 = b3;
                f9 = f;
            } else {
                f = 0.0f;
                rlr rlrVar5 = rmoVar.f;
                b2 = rlrVar5 != null ? rlrVar5.b(this, 1.0f) : 0.0f;
                rlr rlrVar6 = rmoVar.g;
                b3 = rlrVar6 != null ? rlrVar6.b(this, 1.0f) : 0.0f;
                rlr rlrVar7 = rmoVar.h;
                b4 = rlrVar7 != null ? rlrVar7.b(this, 1.0f) : 1.0f;
                rlr rlrVar8 = rmoVar.i;
                if (rlrVar8 != null) {
                    b5 = rlrVar8.b(this, 1.0f);
                    f6 = b4;
                    f7 = b2;
                    f8 = b3;
                    f9 = b5;
                }
                f6 = b4;
                f7 = b2;
                f8 = b3;
                f9 = f;
            }
            M();
            this.d = p(rmoVar);
            Matrix matrix = new Matrix();
            if (!z4) {
                matrix.preTranslate(rleVar.a, rleVar.b);
                matrix.preScale(rleVar.c, rleVar.d);
            }
            Matrix matrix2 = rmoVar.c;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = rmoVar.a.size();
            if (size == 0) {
                L();
                if (z5) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr = new int[size];
                float[] fArr = new float[size];
                Iterator it = rmoVar.a.iterator();
                int i = 0;
                float f10 = -1.0f;
                while (it.hasNext()) {
                    rmf rmfVar = (rmf) ((rmp) it.next());
                    Float f11 = rmfVar.a;
                    float floatValue = f11 != null ? f11.floatValue() : f;
                    if (i == 0 || floatValue >= f10) {
                        fArr[i] = floatValue;
                        f10 = floatValue;
                    } else {
                        fArr[i] = f10;
                    }
                    M();
                    O(this.d, rmfVar);
                    rmg rmgVar = this.d.a;
                    rli rliVar = (rli) rmgVar.v;
                    if (rliVar == null) {
                        rliVar = rli.a;
                    }
                    iArr[i] = (W(rmgVar.w.floatValue()) << 24) | rliVar.b;
                    L();
                    i++;
                }
                if ((f7 == f6 && f8 == f9) || size == 1) {
                    L();
                    paint2.setColor(iArr[size - 1]);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    int i2 = rmoVar.e;
                    if (i2 != 0) {
                        if (i2 == 2) {
                            tileMode = Shader.TileMode.MIRROR;
                        } else if (i2 == 3) {
                            tileMode = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    LinearGradient linearGradient = new LinearGradient(f7, f8, f6, f9, iArr, fArr, tileMode);
                    linearGradient.setLocalMatrix(matrix);
                    paint2.setShader(linearGradient);
                }
            }
        } else {
            f = 0.0f;
        }
        if (a instanceof rms) {
            rms rmsVar = (rms) a;
            String str2 = rmsVar.d;
            if (str2 != null) {
                A(rmsVar, str2);
            }
            Boolean bool2 = rmsVar.b;
            boolean z6 = bool2 != null && bool2.booleanValue();
            if (z3) {
                paint = this.d.d;
                z2 = true;
            } else {
                paint = this.d.e;
                z2 = false;
            }
            if (z6) {
                rlr rlrVar9 = new rlr(50.0f, 9);
                rlr rlrVar10 = rmsVar.f;
                float c = rlrVar10 != null ? rlrVar10.c(this) : rlrVar9.c(this);
                rlr rlrVar11 = rmsVar.g;
                float d = rlrVar11 != null ? rlrVar11.d(this) : rlrVar9.d(this);
                rlr rlrVar12 = rmsVar.h;
                b = rlrVar12 != null ? rlrVar12.a(this) : rlrVar9.a(this);
                f4 = c;
                f5 = d;
            } else {
                rlr rlrVar13 = rmsVar.f;
                if (rlrVar13 != null) {
                    f2 = 1.0f;
                    f3 = rlrVar13.b(this, 1.0f);
                } else {
                    f2 = 1.0f;
                    f3 = 0.5f;
                }
                rlr rlrVar14 = rmsVar.g;
                float b7 = rlrVar14 != null ? rlrVar14.b(this, f2) : 0.5f;
                rlr rlrVar15 = rmsVar.h;
                f4 = f3;
                b = rlrVar15 != null ? rlrVar15.b(this, f2) : 0.5f;
                f5 = b7;
            }
            M();
            this.d = p(rmsVar);
            Matrix matrix3 = new Matrix();
            if (!z6) {
                matrix3.preTranslate(rleVar.a, rleVar.b);
                matrix3.preScale(rleVar.c, rleVar.d);
            }
            Matrix matrix4 = rmsVar.c;
            if (matrix4 != null) {
                matrix3.preConcat(matrix4);
            }
            int size2 = rmsVar.a.size();
            if (size2 == 0) {
                L();
                if (z2) {
                    this.d.b = false;
                } else {
                    this.d.c = false;
                }
            } else {
                int[] iArr2 = new int[size2];
                float[] fArr2 = new float[size2];
                Iterator it2 = rmsVar.a.iterator();
                int i3 = 0;
                float f12 = -1.0f;
                while (it2.hasNext()) {
                    rmf rmfVar2 = (rmf) ((rmp) it2.next());
                    Float f13 = rmfVar2.a;
                    float floatValue2 = f13 != null ? f13.floatValue() : f;
                    if (i3 == 0 || floatValue2 >= f12) {
                        fArr2[i3] = floatValue2;
                        f12 = floatValue2;
                    } else {
                        fArr2[i3] = f12;
                    }
                    M();
                    O(this.d, rmfVar2);
                    rmg rmgVar2 = this.d.a;
                    rli rliVar2 = (rli) rmgVar2.v;
                    if (rliVar2 == null) {
                        rliVar2 = rli.a;
                    }
                    iArr2[i3] = (W(rmgVar2.w.floatValue()) << 24) | rliVar2.b;
                    L();
                    i3++;
                }
                if (b == f || size2 == 1) {
                    L();
                    paint.setColor(iArr2[size2 - 1]);
                } else {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    int i4 = rmsVar.e;
                    if (i4 != 0) {
                        if (i4 == 2) {
                            tileMode2 = Shader.TileMode.MIRROR;
                        } else if (i4 == 3) {
                            tileMode2 = Shader.TileMode.REPEAT;
                        }
                    }
                    L();
                    RadialGradient radialGradient = new RadialGradient(f4, f5, b, iArr2, fArr2, tileMode2);
                    radialGradient.setLocalMatrix(matrix3);
                    paint.setShader(radialGradient);
                }
            }
        }
        if (a instanceof rme) {
            rme rmeVar = (rme) a;
            if (z3) {
                if (Y(rmeVar.q, 2147483648L)) {
                    rno rnoVar = this.d;
                    rmg rmgVar3 = rnoVar.a;
                    rmq rmqVar2 = rmeVar.q.z;
                    rmgVar3.b = rmqVar2;
                    rnoVar.b = rmqVar2 != null;
                }
                if (Y(rmeVar.q, 4294967296L)) {
                    this.d.a.c = rmeVar.q.A;
                }
                if (Y(rmeVar.q, 6442450944L)) {
                    rno rnoVar2 = this.d;
                    aa(rnoVar2, true, rnoVar2.a.b);
                    return;
                }
                return;
            }
            if (Y(rmeVar.q, 2147483648L)) {
                rno rnoVar3 = this.d;
                rmg rmgVar4 = rnoVar3.a;
                rmq rmqVar3 = rmeVar.q.z;
                rmgVar4.d = rmqVar3;
                rnoVar3.c = rmqVar3 != null;
            }
            if (Y(rmeVar.q, 4294967296L)) {
                this.d.a.e = rmeVar.q.A;
            }
            if (Y(rmeVar.q, 6442450944L)) {
                rno rnoVar4 = this.d;
                aa(rnoVar4, false, rnoVar4.a.d);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void w(defpackage.rmm r21, android.graphics.Path r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rns.w(rmm, android.graphics.Path):void");
    }

    private final void x(Path path) {
        rno rnoVar = this.d;
        if (rnoVar.a.L != 2) {
            this.a.drawPath(path, rnoVar.e);
            return;
        }
        Matrix matrix = this.a.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        this.a.setMatrix(new Matrix());
        Shader shader = this.d.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        this.a.drawPath(path2, this.d.e);
        this.a.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    private final void y(rna rnaVar, rnq rnqVar) {
        float f;
        float f2;
        float f3;
        if (Q()) {
            Iterator it = rnaVar.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                rmp rmpVar = (rmp) it.next();
                if (rmpVar instanceof rnd) {
                    rnqVar.a(q(((rnd) rmpVar).a, z, !it.hasNext()));
                } else if (rnqVar.b((rna) rmpVar)) {
                    if (rmpVar instanceof rnb) {
                        M();
                        rnb rnbVar = (rnb) rmpVar;
                        O(this.d, rnbVar);
                        if (Q() && i()) {
                            rmp a = rnbVar.t.a(rnbVar.a);
                            if (a == null) {
                                e("TextPath reference '%s' not found", rnbVar.a);
                            } else {
                                rlx rlxVar = (rlx) a;
                                Path path = new rnk(rlxVar.a).a;
                                Matrix matrix = rlxVar.e;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                rlr rlrVar = rnbVar.b;
                                r3 = rlrVar != null ? rlrVar.b(this, pathMeasure.getLength()) : 0.0f;
                                int S = S();
                                if (S != 1) {
                                    float j = j(rnbVar);
                                    if (S == 2) {
                                        j /= 2.0f;
                                    }
                                    r3 -= j;
                                }
                                u(rnbVar.c);
                                boolean R = R();
                                y(rnbVar, new rnl(this, path, r3));
                                if (R) {
                                    Z();
                                }
                            }
                        }
                        L();
                    } else if (rmpVar instanceof rmx) {
                        M();
                        rmx rmxVar = (rmx) rmpVar;
                        O(this.d, rmxVar);
                        if (Q()) {
                            boolean z2 = rnqVar instanceof rnm;
                            if (z2) {
                                List list = rmxVar.b;
                                float c = (list == null || list.size() == 0) ? ((rnm) rnqVar).b : ((rlr) rmxVar.b.get(0)).c(this);
                                List list2 = rmxVar.c;
                                f2 = (list2 == null || list2.size() == 0) ? ((rnm) rnqVar).c : ((rlr) rmxVar.c.get(0)).d(this);
                                List list3 = rmxVar.d;
                                f3 = (list3 == null || list3.size() == 0) ? 0.0f : ((rlr) rmxVar.d.get(0)).c(this);
                                List list4 = rmxVar.e;
                                if (list4 != null && list4.size() != 0) {
                                    r3 = ((rlr) rmxVar.e.get(0)).d(this);
                                }
                                float f4 = c;
                                f = r3;
                                r3 = f4;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            u(rmxVar.a);
                            if (z2) {
                                rnm rnmVar = (rnm) rnqVar;
                                rnmVar.b = r3 + f3;
                                rnmVar.c = f2 + f;
                            }
                            boolean R2 = R();
                            y(rmxVar, rnqVar);
                            if (R2) {
                                Z();
                            }
                        }
                        L();
                    } else if (rmpVar instanceof rmw) {
                        M();
                        rmw rmwVar = (rmw) rmpVar;
                        O(this.d, rmwVar);
                        if (Q()) {
                            u(rmwVar.b);
                            rmp a2 = rmpVar.t.a(rmwVar.a);
                            if (a2 == null || !(a2 instanceof rna)) {
                                e("Tref reference '%s' not found", rmwVar.a);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                z((rna) a2, sb);
                                if (sb.length() > 0) {
                                    rnqVar.a(sb.toString());
                                }
                            }
                        }
                        L();
                    }
                }
                z = false;
            }
        }
    }

    private final void z(rna rnaVar, StringBuilder sb) {
        Iterator it = rnaVar.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            rmp rmpVar = (rmp) it.next();
            if (rmpVar instanceof rna) {
                z((rna) rmpVar, sb);
            } else if (rmpVar instanceof rnd) {
                sb.append(q(((rnd) rmpVar).a, z, !it.hasNext()));
            }
            z = false;
        }
    }

    protected final float a() {
        return this.d.d.getTextSize();
    }

    protected final rle b() {
        rno rnoVar = this.d;
        rle rleVar = rnoVar.g;
        return rleVar != null ? rleVar : rnoVar.f;
    }

    public final void d(rmp rmpVar) {
        Boolean bool;
        if ((rmpVar instanceof rmn) && (bool = ((rmn) rmpVar).p) != null) {
            this.d.h = bool.booleanValue();
        }
    }

    public final void f(rmh rmhVar, rlr rlrVar, rlr rlrVar2, rle rleVar, rld rldVar) {
        float f;
        if (rlrVar == null || !rlrVar.f()) {
            if (rlrVar2 == null || !rlrVar2.f()) {
                if (rldVar == null && (rldVar = rmhVar.v) == null) {
                    rldVar = rld.b;
                }
                O(this.d, rmhVar);
                if (Q()) {
                    if (rmhVar.u != null) {
                        rlr rlrVar3 = rmhVar.a;
                        float c = rlrVar3 != null ? rlrVar3.c(this) : 0.0f;
                        rlr rlrVar4 = rmhVar.b;
                        r1 = c;
                        f = rlrVar4 != null ? rlrVar4.d(this) : 0.0f;
                    } else {
                        f = 0.0f;
                    }
                    rle b = b();
                    float c2 = rlrVar != null ? rlrVar.c(this) : b.c;
                    float d = rlrVar2 != null ? rlrVar2.d(this) : b.d;
                    rno rnoVar = this.d;
                    rnoVar.f = new rle(r1, f, c2, d);
                    if (!rnoVar.a.o.booleanValue()) {
                        rle rleVar2 = this.d.f;
                        K(rleVar2.a, rleVar2.b, rleVar2.c, rleVar2.d);
                    }
                    t(rmhVar, this.d.f);
                    if (rleVar != null) {
                        this.a.concat(U(this.d.f, rleVar, rldVar));
                        this.d.g = rmhVar.w;
                    } else {
                        this.a.translate(r1, f);
                    }
                    boolean R = R();
                    P();
                    H(rmhVar, true);
                    if (R) {
                        Z();
                    }
                    N(rmhVar);
                }
            }
        }
    }

    public final void g(rno rnoVar, rmg rmgVar) {
        if (Y(rmgVar, 4096L)) {
            rnoVar.a.k = rmgVar.k;
        }
        if (Y(rmgVar, 2048L)) {
            rnoVar.a.j = rmgVar.j;
        }
        if (Y(rmgVar, 1L)) {
            rnoVar.a.b = rmgVar.b;
            rnoVar.b = rmgVar.b != null;
        }
        if (Y(rmgVar, 4L)) {
            rnoVar.a.c = rmgVar.c;
        }
        if (Y(rmgVar, 6149L)) {
            aa(rnoVar, true, rnoVar.a.b);
        }
        if (Y(rmgVar, 2L)) {
            rnoVar.a.D = rmgVar.D;
        }
        if (Y(rmgVar, 8L)) {
            rnoVar.a.d = rmgVar.d;
            rnoVar.c = rmgVar.d != null;
        }
        if (Y(rmgVar, 16L)) {
            rnoVar.a.e = rmgVar.e;
        }
        if (Y(rmgVar, 6168L)) {
            aa(rnoVar, false, rnoVar.a.d);
        }
        if (Y(rmgVar, 34359738368L)) {
            rnoVar.a.L = rmgVar.L;
        }
        if (Y(rmgVar, 32L)) {
            rmg rmgVar2 = rnoVar.a;
            rmgVar2.f = rmgVar.f;
            rnoVar.e.setStrokeWidth(rmgVar2.f.a(this));
        }
        Typeface typeface = null;
        if (Y(rmgVar, 64L)) {
            rnoVar.a.E = rmgVar.E;
            int i = rmgVar.E;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                rnoVar.e.setStrokeCap(Paint.Cap.BUTT);
            } else if (i2 == 1) {
                rnoVar.e.setStrokeCap(Paint.Cap.ROUND);
            } else if (i2 == 2) {
                rnoVar.e.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (Y(rmgVar, 128L)) {
            rnoVar.a.F = rmgVar.F;
            int i3 = rmgVar.F;
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == 0) {
                rnoVar.e.setStrokeJoin(Paint.Join.MITER);
            } else if (i4 == 1) {
                rnoVar.e.setStrokeJoin(Paint.Join.ROUND);
            } else if (i4 == 2) {
                rnoVar.e.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (Y(rmgVar, 256L)) {
            rnoVar.a.g = rmgVar.g;
            rnoVar.e.setStrokeMiter(rmgVar.g.floatValue());
        }
        if (Y(rmgVar, 512L)) {
            rnoVar.a.h = rmgVar.h;
        }
        if (Y(rmgVar, 1024L)) {
            rnoVar.a.i = rmgVar.i;
        }
        if (Y(rmgVar, 1536L)) {
            rlr[] rlrVarArr = rnoVar.a.h;
            if (rlrVarArr == null) {
                rnoVar.e.setPathEffect(null);
            } else {
                int length = rlrVarArr.length;
                int i5 = (length & 1) == 0 ? length : length + length;
                float[] fArr = new float[i5];
                float f = 0.0f;
                for (int i6 = 0; i6 < i5; i6++) {
                    float a = rnoVar.a.h[i6 % length].a(this);
                    fArr[i6] = a;
                    f += a;
                }
                if (f == 0.0f) {
                    rnoVar.e.setPathEffect(null);
                } else {
                    float a2 = rnoVar.a.i.a(this);
                    if (a2 < 0.0f) {
                        a2 = (a2 % f) + f;
                    }
                    rnoVar.e.setPathEffect(new DashPathEffect(fArr, a2));
                }
            }
        }
        if (Y(rmgVar, 16384L)) {
            float a3 = a();
            rnoVar.a.m = rmgVar.m;
            rnoVar.d.setTextSize(rmgVar.m.b(this, a3));
            rnoVar.e.setTextSize(rmgVar.m.b(this, a3));
        }
        if (Y(rmgVar, 8192L)) {
            rnoVar.a.l = rmgVar.l;
        }
        if (Y(rmgVar, 32768L)) {
            if (rmgVar.n.intValue() == -1 && rnoVar.a.n.intValue() > 100) {
                rnoVar.a.n = Integer.valueOf(r0.n.intValue() - 100);
            } else if (rmgVar.n.intValue() != 1 || rnoVar.a.n.intValue() >= 900) {
                rnoVar.a.n = rmgVar.n;
            } else {
                rmg rmgVar3 = rnoVar.a;
                rmgVar3.n = Integer.valueOf(rmgVar3.n.intValue() + 100);
            }
        }
        if (Y(rmgVar, 65536L)) {
            rnoVar.a.G = rmgVar.G;
        }
        if (Y(rmgVar, 106496L)) {
            List<String> list = rnoVar.a.l;
            if (list != null && this.c != null) {
                for (String str : list) {
                    rmg rmgVar4 = rnoVar.a;
                    typeface = V(str, rmgVar4.n, rmgVar4.G);
                    if (typeface != null) {
                        break;
                    }
                }
            }
            if (typeface == null) {
                rmg rmgVar5 = rnoVar.a;
                typeface = V("sans-serif", rmgVar5.n, rmgVar5.G);
            }
            rnoVar.d.setTypeface(typeface);
            rnoVar.e.setTypeface(typeface);
        }
        if (Y(rmgVar, 131072L)) {
            rnoVar.a.H = rmgVar.H;
            rnoVar.d.setStrikeThruText(rmgVar.H == 4);
            rnoVar.d.setUnderlineText(rmgVar.H == 2);
            rnoVar.e.setStrikeThruText(rmgVar.H == 4);
            rnoVar.e.setUnderlineText(rmgVar.H == 2);
        }
        if (Y(rmgVar, 68719476736L)) {
            rnoVar.a.I = rmgVar.I;
        }
        if (Y(rmgVar, 262144L)) {
            rnoVar.a.J = rmgVar.J;
        }
        if (Y(rmgVar, 524288L)) {
            rnoVar.a.o = rmgVar.o;
        }
        if (Y(rmgVar, 2097152L)) {
            rnoVar.a.q = rmgVar.q;
        }
        if (Y(rmgVar, 4194304L)) {
            rnoVar.a.r = rmgVar.r;
        }
        if (Y(rmgVar, 8388608L)) {
            rnoVar.a.s = rmgVar.s;
        }
        if (Y(rmgVar, 16777216L)) {
            rnoVar.a.t = rmgVar.t;
        }
        if (Y(rmgVar, 33554432L)) {
            rnoVar.a.u = rmgVar.u;
        }
        if (Y(rmgVar, 1048576L)) {
            rnoVar.a.p = rmgVar.p;
        }
        if (Y(rmgVar, 268435456L)) {
            rnoVar.a.x = rmgVar.x;
        }
        if (Y(rmgVar, 536870912L)) {
            rnoVar.a.K = rmgVar.K;
        }
        if (Y(rmgVar, 1073741824L)) {
            rnoVar.a.y = rmgVar.y;
        }
        if (Y(rmgVar, 67108864L)) {
            rnoVar.a.v = rmgVar.v;
        }
        if (Y(rmgVar, 134217728L)) {
            rnoVar.a.w = rmgVar.w;
        }
        if (Y(rmgVar, 8589934592L)) {
            rnoVar.a.B = rmgVar.B;
        }
        if (Y(rmgVar, 17179869184L)) {
            rnoVar.a.C = rmgVar.C;
        }
    }

    public final boolean i() {
        Boolean bool = this.d.a.u;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
