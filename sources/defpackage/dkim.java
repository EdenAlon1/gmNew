package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkim implements Runnable {
    final /* synthetic */ dkip a;

    public dkim(dkip dkipVar) {
        this.a = dkipVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String e;
        dkwz dkwzVar;
        try {
            dkip dkipVar = this.a;
            String str = dkipVar.a.c().mPublicIdentity;
            dkty.c("Publishing presence capabilities for %s", dktx.USER_ID.c(str));
            dkht b = dkipVar.h.b();
            dkiq dkiqVar = dkipVar.m;
            dkwz dkwzVar2 = (dkwz) dkiqVar.a.b();
            dkwzVar2.a = str;
            List b2 = dkwzVar2.b();
            b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.a));
            if (b.y()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.b));
            }
            if (b.C()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.c));
            }
            if (b.H()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.d));
            }
            if (b.A()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.e));
            }
            if (b.B()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.f));
            }
            if (b.D()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.g));
            }
            if (b.E()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.h));
            }
            if (b.x()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.i));
            }
            if (b.J()) {
                dkwzVar2.b().add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.j));
            }
            if (b.N()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.l));
            }
            if (b.M()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.k));
            }
            if (b.K()) {
                b2.add(dkiqVar.a(str, dkww.OPEN, dkiqVar.b.m));
            }
            if (b.G()) {
                dkxe a = dkiqVar.a(str, dkww.OPEN, dkiqVar.b.n);
                if (b.F()) {
                    a.g = engw.r(dkwp.VIDEO);
                }
                b2.add(a);
            }
            diul diulVar = dkipVar.o;
            synchronized (diulVar.c) {
                e = diulVar.a.e();
            }
            diul diulVar2 = dkipVar.o;
            synchronized (diulVar2.c) {
                try {
                    InputStream a2 = diulVar2.b.a("capabilities-pidf.xml");
                    if (a2 != null) {
                        try {
                            dkwzVar = diulVar2.d.a(a2);
                            a2.close();
                        } finally {
                        }
                    }
                } catch (IOException e2) {
                    dkty.i(e2, "Failed to load capabilities PIDF from disk", new Object[0]);
                }
                dkwzVar = null;
            }
            if (dkwzVar != null) {
                List<dkxe> list = dkwzVar.b;
                HashMap hashMap = new HashMap();
                if (list != null) {
                    for (dkxe dkxeVar : list) {
                        String str2 = dkxeVar.c.b;
                        if (str2 != null) {
                            hashMap.put(str2, dkxeVar);
                        }
                    }
                }
                List<dkxe> list2 = dkwzVar2.b;
                if (list2 != null) {
                    for (dkxe dkxeVar2 : list2) {
                        dkxe dkxeVar3 = (dkxe) hashMap.get(dkxeVar2.c.b);
                        if (dkxeVar3 != null) {
                            dkxeVar2.a = dkxeVar3.a;
                        }
                    }
                }
            }
            dkls dklsVar = dkipVar.i;
            dklsVar.b();
            try {
                try {
                    dklsVar.k = dkwzVar2;
                    dkgf dkgfVar = dklsVar.j;
                    if (dkgfVar == null) {
                        dkgfVar = new dkgf(dklsVar, dklsVar.h, dkwzVar2.a, dklsVar.f);
                        dkgfVar.j = dklsVar.q;
                        dklsVar.j = dkgfVar;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    dkxc.b(dkwzVar2, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (dkgfVar.i == 1) {
                        throw new IllegalStateException("publish() cannot be called in the PENDING state!");
                    }
                    dkgfVar.i = 1;
                    dkgfVar.d.a();
                    dkgfVar.e = -1;
                    if (e != null) {
                        dkty.c("Capabilities publication with existing etag. Performing modify. Etag %s", e);
                        dkgfVar.g = e;
                    }
                    try {
                        eehy eehyVar = ((eehz) dkgfVar.a).a;
                        eehyVar.k(dkgfVar.b.d(eehyVar, dkgfVar.d, dkgfVar.c, dkgfVar.e, dkgfVar.g, "application/pidf+xml", byteArray), dkgfVar.h);
                    } catch (eejg e3) {
                        dkty.i(e3, "Error while creating sip request: %s", e3.getMessage());
                        dkgfVar.i = 3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    throw new dklt("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (eejg e5) {
                e = e5;
                throw new dklt("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (dklt e6) {
            dkty.i(e6, "Can't send Publish for Presence", new Object[0]);
        }
    }
}
