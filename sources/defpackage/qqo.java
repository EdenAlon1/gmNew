package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class qqo extends rhx implements Cloneable {
    private qqt A;
    private Object B;
    private List C;
    private qqo D;
    private qqo E;
    private Float F;
    private boolean G = true;
    private boolean H;
    private boolean I;
    public final qqs a;
    private final Context x;
    private final Class y;
    private final qpz z;

    static {
    }

    protected qqo(qpt qptVar, qqs qqsVar, Class cls, Context context) {
        this.a = qqsVar;
        this.y = cls;
        this.x = context;
        qpz qpzVar = qqsVar.a.c;
        qqt qqtVar = (qqt) qpzVar.e.get(cls);
        if (qqtVar == null) {
            for (Map.Entry entry : qpzVar.e.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    qqtVar = (qqt) entry.getValue();
                }
            }
        }
        this.A = qqtVar == null ? qpz.a : qqtVar;
        this.z = qptVar.c;
        Iterator it = qqsVar.d.iterator();
        while (it.hasNext()) {
            a((rif) it.next());
        }
        q(qqsVar.j());
    }

    private final qqo ak(qqo qqoVar) {
        PackageInfo packageInfo;
        qqo qqoVar2 = (qqo) qqoVar.X(this.x.getTheme());
        int i = rjj.b;
        ConcurrentMap concurrentMap = rjk.a;
        Context context = this.x;
        String packageName = context.getPackageName();
        qtp qtpVar = (qtp) rjk.a.get(packageName);
        if (qtpVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            rjn rjnVar = new rjn(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            qtpVar = (qtp) rjk.a.putIfAbsent(packageName, rjnVar);
            if (qtpVar == null) {
                qtpVar = rjnVar;
            }
        }
        return (qqo) qqoVar2.W(new rjj(context.getResources().getConfiguration().uiMode & 48, qtpVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final rib al(Object obj, rix rixVar, rif rifVar, rid ridVar, qqt qqtVar, qqe qqeVar, int i, int i2, rhx rhxVar, Executor executor) {
        rid ridVar2;
        rid ridVar3;
        qqo qqoVar;
        rib ribVar;
        qqe qqeVar2;
        rhx rhxVar2 = rhxVar;
        if (this.E != null) {
            ridVar3 = new rhy(obj, ridVar);
            ridVar2 = ridVar3;
        } else {
            ridVar2 = null;
            ridVar3 = ridVar;
        }
        qqo qqoVar2 = this.D;
        if (qqoVar2 == null) {
            qqoVar = this;
            ribVar = am(obj, rixVar, rifVar, rhxVar2, ridVar3, qqtVar, qqeVar, i, i2, executor);
        } else {
            if (this.I) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            qqt qqtVar2 = true == qqoVar2.G ? qqtVar : qqoVar2.A;
            if (super.ad(8)) {
                qqeVar2 = qqoVar2.d;
            } else {
                int i3 = qqn.b[qqeVar.ordinal()];
                if (i3 == 1) {
                    qqeVar2 = qqe.NORMAL;
                } else if (i3 == 2) {
                    qqeVar2 = qqe.HIGH;
                } else {
                    if (i3 != 3 && i3 != 4) {
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.d))));
                    }
                    qqeVar2 = qqe.IMMEDIATE;
                }
            }
            qqe qqeVar3 = qqeVar2;
            qqo qqoVar3 = this.D;
            int i4 = qqoVar3.k;
            int i5 = qqoVar3.j;
            if (rkh.p(i, i2) && !this.D.ae()) {
                i4 = rhxVar2.k;
                i5 = rhxVar2.j;
            }
            int i6 = i5;
            rij rijVar = new rij(obj, ridVar3);
            rib am = am(obj, rixVar, rifVar, rhxVar2, rijVar, qqtVar, qqeVar, i, i2, executor);
            this.I = true;
            qqo qqoVar4 = this.D;
            qqoVar = this;
            rib al = qqoVar4.al(obj, rixVar, rifVar, rijVar, qqtVar2, qqeVar3, i4, i6, qqoVar4, executor);
            rij rijVar2 = rijVar;
            qqoVar.I = false;
            rijVar2.a = am;
            rijVar2.b = al;
            rhxVar2 = rhxVar;
            ribVar = rijVar2;
        }
        rib ribVar2 = ribVar;
        if (ridVar2 == null) {
            return ribVar2;
        }
        qqo qqoVar5 = qqoVar.E;
        int i7 = qqoVar5.k;
        int i8 = qqoVar5.j;
        if (rkh.p(i, i2) && !qqoVar.E.ae()) {
            i7 = rhxVar2.k;
            i8 = rhxVar2.j;
        }
        int i9 = i8;
        qqo qqoVar6 = qqoVar.E;
        rhy rhyVar = ridVar2;
        rib al2 = qqoVar6.al(obj, rixVar, rifVar, rhyVar, qqoVar6.A, qqoVar6.d, i7, i9, qqoVar6, executor);
        rhyVar.a = ribVar2;
        rhyVar.b = al2;
        return rhyVar;
    }

    private final rib am(Object obj, rix rixVar, rif rifVar, rhx rhxVar, rid ridVar, qqt qqtVar, qqe qqeVar, int i, int i2, Executor executor) {
        Object obj2 = this.B;
        List list = this.C;
        rji rjiVar = qqtVar.a;
        Context context = this.x;
        Class cls = this.y;
        qpz qpzVar = this.z;
        return new rii(context, qpzVar, obj, obj2, cls, rhxVar, i, i2, qqeVar, rixVar, rifVar, list, ridVar, qpzVar.f, rjiVar, executor);
    }

    public qqo a(rif rifVar) {
        if (this.u) {
            return clone().a(rifVar);
        }
        if (rifVar != null) {
            if (this.C == null) {
                this.C = new ArrayList();
            }
            this.C.add(rifVar);
        }
        ah();
        return this;
    }

    @Override // defpackage.rhx
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public qqo q(rhx rhxVar) {
        rkf.f(rhxVar);
        return (qqo) super.q(rhxVar);
    }

    @Override // defpackage.rhx
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public qqo clone() {
        qqo qqoVar = (qqo) super.clone();
        qqoVar.A = qqoVar.A.clone();
        List list = qqoVar.C;
        if (list != null) {
            qqoVar.C = new ArrayList(list);
        }
        qqo qqoVar2 = qqoVar.D;
        if (qqoVar2 != null) {
            qqoVar.D = qqoVar2.clone();
        }
        qqo qqoVar3 = qqoVar.E;
        if (qqoVar3 != null) {
            qqoVar.E = qqoVar3.clone();
        }
        return qqoVar;
    }

    public qqo d(qqo qqoVar) {
        if (this.u) {
            return clone().d(qqoVar);
        }
        this.E = qqoVar;
        ah();
        return this;
    }

    public qqo e(Object obj) {
        return d(clone().d(null).o(null).k(obj));
    }

    @Override // defpackage.rhx
    public final boolean equals(Object obj) {
        if (obj instanceof qqo) {
            qqo qqoVar = (qqo) obj;
            if (super.equals(qqoVar) && Objects.equals(this.y, qqoVar.y) && this.A.equals(qqoVar.A) && Objects.equals(this.B, qqoVar.B) && Objects.equals(this.C, qqoVar.C) && Objects.equals(this.D, qqoVar.D) && Objects.equals(this.E, qqoVar.E)) {
                Float f = qqoVar.F;
                if (Objects.equals(null, null) && this.G == qqoVar.G && this.H == qqoVar.H) {
                    return true;
                }
            }
        }
        return false;
    }

    public qqo f(rif rifVar) {
        if (this.u) {
            return clone().f(rifVar);
        }
        this.C = null;
        return a(rifVar);
    }

    public qqo g(Bitmap bitmap) {
        return n(bitmap).q(rig.d(qvx.c));
    }

    public qqo h(Drawable drawable) {
        return n(drawable).q(rig.d(qvx.c));
    }

    @Override // defpackage.rhx
    public final int hashCode() {
        return rkh.e(this.H ? 1 : 0, rkh.e(this.G ? 1 : 0, rkh.f(null, rkh.f(this.E, rkh.f(this.D, rkh.f(this.C, rkh.f(this.B, rkh.f(this.A, rkh.f(this.y, super.hashCode())))))))));
    }

    public qqo i(Uri uri) {
        qqo n = n(uri);
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? n : ak(n);
    }

    public qqo j(Integer num) {
        return ak(n(num));
    }

    public qqo k(Object obj) {
        return n(obj);
    }

    public qqo l(String str) {
        return n(str);
    }

    public qqo m(byte[] bArr) {
        qqo n = n(bArr);
        if (!super.ad(4)) {
            n = n.q(rig.d(qvx.c));
        }
        if (super.ad(256)) {
            return n;
        }
        if (rig.a == null) {
            rig.a = (rig) ((rig) new rig().ai()).x();
        }
        return n.q(rig.a);
    }

    public final qqo n(Object obj) {
        if (this.u) {
            return clone().n(obj);
        }
        this.B = obj;
        this.H = true;
        ah();
        return this;
    }

    public qqo o(qqo qqoVar) {
        if (this.u) {
            return clone().o(qqoVar);
        }
        this.D = qqoVar;
        ah();
        return this;
    }

    public qqo p(qqt qqtVar) {
        if (this.u) {
            return clone().p(qqtVar);
        }
        rkf.f(qqtVar);
        this.A = qqtVar;
        this.G = false;
        ah();
        return this;
    }

    public final ria s() {
        return t(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public final ria t(int i, int i2) {
        rie rieVar = new rie(i, i2);
        u(rieVar, rieVar, this, rjx.b);
        return rieVar;
    }

    public final void u(rix rixVar, rif rifVar, rhx rhxVar, Executor executor) {
        rkf.f(rixVar);
        if (!this.H) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        rib al = al(new Object(), rixVar, rifVar, null, this.A, rhxVar.d, rhxVar.k, rhxVar.j, rhxVar, executor);
        rib d = rixVar.d();
        if (!al.m(d) || (!rhxVar.i && d.l())) {
            this.a.l(rixVar);
            rixVar.i(al);
            this.a.t(rixVar, al);
        } else {
            rkf.f(d);
            if (d.n()) {
                return;
            }
            d.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(android.widget.ImageView r4) {
        /*
            r3 = this;
            defpackage.rkh.j()
            defpackage.rkf.f(r4)
            r0 = 2048(0x800, float:2.87E-42)
            boolean r0 = super.ad(r0)
            if (r0 != 0) goto L4c
            boolean r0 = r3.n
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = defpackage.qqn.a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            rhx r0 = r3.clone()
            rhx r0 = r0.M()
            goto L4d
        L31:
            rhx r0 = r3.clone()
            rhx r0 = r0.N()
            goto L4d
        L3a:
            rhx r0 = r3.clone()
            rhx r0 = r0.M()
            goto L4d
        L43:
            rhx r0 = r3.clone()
            rhx r0 = r0.L()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            qpz r1 = r3.z
            java.lang.Class r2 = r3.y
            ris r1 = r1.c
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L61
            ril r1 = new ril
            r1.<init>(r4)
            goto L6e
        L61:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L75
            riq r1 = new riq
            r1.<init>(r4)
        L6e:
            r4 = 0
            java.util.concurrent.Executor r2 = defpackage.rjx.a
            r3.u(r1, r4, r0, r2)
            return
        L75:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unhandled class: "
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            java.lang.String r0 = defpackage.a.b(r2, r0, r1)
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqo.v(android.widget.ImageView):void");
    }

    public final void w(rix rixVar) {
        u(rixVar, null, this, rjx.a);
    }
}
