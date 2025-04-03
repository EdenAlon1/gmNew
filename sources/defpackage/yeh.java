package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yeh implements yei {
    private static final enru c = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments");
    public final ffhd a;
    public final xgp b;
    private final dpar d;

    public yeh(ffhd ffhdVar, dpar dparVar, xgp xgpVar) {
        ffhdVar.getClass();
        this.a = ffhdVar;
        this.d = dparVar;
        this.b = xgpVar;
    }

    private final ydv f(List list) {
        yds ydsVar;
        ydu yduVar = (ydu) ydv.a.createBuilder();
        yduVar.getClass();
        DesugarCollections.unmodifiableList(((ydv) yduVar.instance).c).getClass();
        ArrayList<xho> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xhp xhpVar = (xhp) it.next();
            xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
            if (xhoVar != null) {
                arrayList.add(xhoVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (xho xhoVar2 : arrayList) {
            try {
                ydr ydrVar = (ydr) yds.a.createBuilder();
                ydrVar.getClass();
                ydt.c(this.d.a(xhoVar2.a), ydrVar);
                Uri uri = xhoVar2.b.c;
                if (uri != null) {
                    ydt.b(uri.toString(), ydrVar);
                }
                ydsVar = ydt.a(ydrVar);
            } catch (dpap e) {
                ensk i = c.i();
                i.Y(ente.a, "BugleComposeRow2");
                ((enrr) ((enrr) i).g(e).h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments", "trySerialize", 112, "Attachments.kt")).t("Failed to serialize %s", xhoVar2);
                ydsVar = null;
            }
            if (ydsVar != null) {
                arrayList2.add(ydsVar);
            }
        }
        ydw.b(arrayList2, yduVar);
        return ydw.a(yduVar);
    }

    @Override // defpackage.yei
    public final Object a(xhs xhsVar, bswn bswnVar, ffgu ffguVar) {
        Object a = ffra.a(ekxi.a(this.a), new yef(null, xhsVar, bswnVar, this), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.doza r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            java.lang.String r0 = "No AttachmentDeserializer found for "
            boolean r1 = r9 instanceof defpackage.yeg
            if (r1 == 0) goto L15
            r1 = r9
            yeg r1 = (defpackage.yeg) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.c = r2
            goto L1a
        L15:
            yeg r1 = new yeg
            r1.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r1.a
            ffhh r2 = defpackage.ffhh.a
            int r3 = r1.c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            doza r8 = r1.d
            defpackage.ffci.b(r9)     // Catch: defpackage.dpap -> L2c
            goto L67
        L2c:
            r9 = move-exception
            goto L8d
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ffci.b(r9)
            dpar r9 = r7.d     // Catch: defpackage.dpap -> L2c
            r1.d = r8     // Catch: defpackage.dpap -> L2c
            r1.c = r5     // Catch: defpackage.dpap -> L2c
            dpaq r3 = new dpaq     // Catch: defpackage.dpap -> L2c
            java.lang.String r5 = r8.c     // Catch: defpackage.dpap -> L2c
            r5.getClass()     // Catch: defpackage.dpap -> L2c
            int r6 = r8.d     // Catch: defpackage.dpap -> L2c
            r3.<init>()     // Catch: defpackage.dpap -> L2c
            java.util.Map r9 = r9.a     // Catch: defpackage.dpap -> L2c
            java.lang.Object r9 = r9.get(r3)     // Catch: defpackage.dpap -> L2c
            boolean r3 = r9 instanceof defpackage.dpao     // Catch: defpackage.dpap -> L2c
            if (r3 == 0) goto L58
            dpao r9 = (defpackage.dpao) r9     // Catch: defpackage.dpap -> L2c
            goto L59
        L58:
            r9 = r4
        L59:
            if (r9 == 0) goto L6a
            eyee r0 = r8.e     // Catch: defpackage.dpap -> L2c
            r0.getClass()     // Catch: defpackage.dpap -> L2c
            java.lang.Object r9 = r9.e(r0, r1)     // Catch: defpackage.dpap -> L2c
            if (r9 != r2) goto L67
            return r2
        L67:
            doxs r9 = (defpackage.doxs) r9     // Catch: defpackage.dpap -> L2c
            return r9
        L6a:
            dpap r9 = new dpap     // Catch: defpackage.dpap -> L2c
            java.lang.String r1 = r8.c     // Catch: defpackage.dpap -> L2c
            int r2 = r8.d     // Catch: defpackage.dpap -> L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: defpackage.dpap -> L2c
            r3.<init>(r0)     // Catch: defpackage.dpap -> L2c
            r3.append(r1)     // Catch: defpackage.dpap -> L2c
            java.lang.String r0 = " with version "
            r3.append(r0)     // Catch: defpackage.dpap -> L2c
            r3.append(r2)     // Catch: defpackage.dpap -> L2c
            java.lang.String r0 = "."
            r3.append(r0)     // Catch: defpackage.dpap -> L2c
            java.lang.String r0 = r3.toString()     // Catch: defpackage.dpap -> L2c
            r9.<init>(r0)     // Catch: defpackage.dpap -> L2c
            throw r9     // Catch: defpackage.dpap -> L2c
        L8d:
            enru r0 = defpackage.yeh.c
            ensk r0 = r0.i()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleComposeRow2"
            r0.Y(r1, r2)
            enrr r0 = (defpackage.enrr) r0
            ensk r9 = r0.g(r9)
            java.lang.String r0 = "tryDeserialize"
            r1 = 91
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/persistence/projected/Attachments"
            java.lang.String r3 = "Attachments.kt"
            ensk r9 = r9.h(r2, r0, r1, r3)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Failed to deserialize %s"
            r9.t(r0, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yeh.b(doza, ffgu):java.lang.Object");
    }

    @Override // defpackage.yei
    public final void c(bswp bswpVar, xhu xhuVar) {
        xhuVar.getClass();
        bswpVar.b(f(xhuVar.b));
    }

    @Override // defpackage.yei
    public final void d(bsxy bsxyVar, xhu xhuVar) {
        ydv f = f(xhuVar.b);
        int intValue = bsyb.c().intValue();
        int intValue2 = bsyb.c().intValue();
        if (intValue2 < 59420) {
            dtub.w("attachments", intValue2);
        }
        if (intValue >= 59420) {
            bsxyVar.a.put("attachments", f.toByteArray());
        }
    }

    @Override // defpackage.yei
    public final boolean e(ydx ydxVar) {
        return ydxVar.a(new ffji() { // from class: yed
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhuVar.b;
            }
        });
    }
}
