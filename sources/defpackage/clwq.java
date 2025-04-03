package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwq implements clwp {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public clwq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    private final cost c() {
        return ((cort) this.a.b()).a();
    }

    private final List d(String str) {
        return ((atrt) this.c.b()).a() ? new eygk(((cguo) this.b.b()).c(str).i, ewht.b) : new eygk(((cguo) this.b.b()).c(str).h, ewht.a);
    }

    private static final boolean e(cost costVar, String str) {
        return ffkj.e(costVar.c, str);
    }

    @Override // defpackage.clwp
    public final boolean a(djrm djrmVar) {
        if (!((atrs) this.d.b()).a()) {
            return false;
        }
        List d = d(djrn.a(djrmVar).a);
        if (!d.isEmpty()) {
            Iterator it = d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((ewho) it.next()) == ewho.SIM_ROLE_MULTI_SIM_DISABLED) {
                    if (!e(c(), djrn.a(djrmVar).a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x008d, code lost:
    
        if (r0.isEmpty() != false) goto L36;
     */
    @Override // defpackage.clwp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.djrm r9) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clwq.b(djrm):int");
    }
}
