package defpackage;

import io.grpc.Status;
import java.nio.charset.Charset;
import java.util.ArrayList;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexx implements feih {
    final /* synthetic */ fexz a;

    public fexx(fexz fexzVar) {
        this.a = fexzVar;
    }

    @Override // defpackage.feih
    public final void a(Status status) {
        int i = ffbo.a;
        fexy fexyVar = this.a.f;
        int i2 = fexy.z;
        synchronized (fexyVar.a) {
            this.a.f.r(status, true, null);
        }
    }

    @Override // defpackage.feih
    public final void b(fevx fevxVar, boolean z, boolean z2, int i) {
        fhmt fhmtVar;
        int i2 = ffbo.a;
        if (fevxVar == null) {
            fhmtVar = fexz.a;
        } else {
            fhmtVar = ((feyo) fevxVar).a;
            int i3 = (int) fhmtVar.b;
            if (i3 > 0) {
                this.a.w(i3);
            }
        }
        fexy fexyVar = this.a.f;
        int i4 = fexy.z;
        synchronized (fexyVar.a) {
            fexy fexyVar2 = this.a.f;
            if (!fexyVar2.f) {
                if (fexyVar2.u) {
                    fexyVar2.c.id(fhmtVar, (int) fhmtVar.b);
                    fexyVar2.d |= z;
                    fexyVar2.e |= z2;
                } else {
                    emxf.m(fexyVar2.x != -1, "streamId should be set");
                    fexyVar2.h.a(z, fexyVar2.w, fhmtVar, z2);
                }
            }
            fevw fevwVar = this.a.r;
            if (i != 0) {
                fevwVar.g += i;
                fevwVar.b.a();
            }
        }
    }

    @Override // defpackage.feih
    public final void c(febo feboVar) {
        int i = ffbo.a;
        String t = a.t(this.a.b.b, "/");
        fexy fexyVar = this.a.f;
        int i2 = fexy.z;
        synchronized (fexyVar.a) {
            fexy fexyVar2 = this.a.f;
            fexz fexzVar = fexyVar2.y;
            String str = fexzVar.e;
            String str2 = fexzVar.c;
            SSLSocketFactory sSLSocketFactory = fexyVar2.i.t;
            fezo fezoVar = fexo.a;
            feboVar.getClass();
            str.getClass();
            feboVar.e(fend.h);
            feboVar.e(fend.i);
            feboVar.e(fend.j);
            Charset charset = fdzx.a;
            ArrayList arrayList = new ArrayList(feboVar.f + 7);
            if (sSLSocketFactory == null) {
                arrayList.add(fexo.b);
            } else {
                arrayList.add(fexo.a);
            }
            arrayList.add(fexo.c);
            arrayList.add(new fezo(fezo.e, str));
            arrayList.add(new fezo(fezo.c, t));
            arrayList.add(new fezo(fend.j.a, str2));
            arrayList.add(fexo.e);
            arrayList.add(fexo.f);
            byte[][] a = fevt.a(feboVar);
            for (int i3 = 0; i3 < a.length; i3 += 2) {
                fhmx f = fhmx.f(a[i3]);
                if (f.b() != 0 && f.a(0) != 58) {
                    arrayList.add(new fezo(f, fhmx.f(a[i3 + 1])));
                }
            }
            fexyVar2.b = arrayList;
            feyg feygVar = fexyVar2.i;
            fexz fexzVar2 = fexyVar2.y;
            Status status = feygVar.p;
            if (status != null) {
                fexzVar2.f.k(status, fejt.MISCARRIED, true, new febo());
            } else if (feygVar.k.size() >= feygVar.u) {
                feygVar.v.add(fexzVar2);
                feygVar.k(fexzVar2);
            } else {
                feygVar.m(fexzVar2);
            }
        }
    }
}
