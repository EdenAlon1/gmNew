package defpackage;

import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgi {
    public final dkur b;
    public final eehr c;
    public final ffbr d;
    public String[] e;
    public String[] f;
    public String g;
    public String h;
    public String i;
    private final dkgm k;
    private final dkqu l;
    private boolean m;
    private boolean n;
    private final boolean o;
    private final boolean p;
    private final engw q;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final String j = "false";

    public dkgi(dkgm dkgmVar, ffbr ffbrVar, String str, engw engwVar, eehr eehrVar, dkur dkurVar, boolean z, boolean z2) {
        this.k = dkgmVar;
        this.d = ffbrVar;
        this.l = new dkqu(dkgmVar.a.c());
        this.q = engwVar;
        this.b = dkurVar;
        if (eehrVar != null) {
            this.c = eehrVar;
        } else {
            djjr djjrVar = dkgmVar.a;
            if (Objects.isNull(djjrVar.c())) {
                throw new eejg("Null ImsConfiguration,");
            }
            String e = djjrVar.e();
            if (Objects.isNull(e)) {
                throw new eejg("Null Public Identity in ImsModule.");
            }
            if (Objects.isNull(str)) {
                throw new eejg("Null remote Uri. Can't create dialog path.");
            }
            eehy eehyVar = ((eehz) ffbrVar).a;
            if (eehyVar.v()) {
                throw new eejg("Null SipStack. Can't create dialog path.");
            }
            this.c = new eehr(eehy.w(), 1, str, e, str, eehyVar.q());
        }
        this.o = z;
        this.p = z2;
    }

    private final void h(eenl eenlVar) {
        d(eenlVar.y(), eenlVar.A());
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0107, code lost:
    
        if (r11 != false) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c A[Catch: Exception -> 0x0244, TRY_LEAVE, TryCatch #0 {Exception -> 0x0244, blocks: (B:11:0x0042, B:13:0x0085, B:14:0x0088, B:19:0x00c8, B:20:0x00d5, B:23:0x00e0, B:27:0x00f5, B:28:0x0109, B:29:0x0114, B:31:0x011c, B:74:0x00fd, B:78:0x00d0), top: B:10:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.eenk a() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkgi.a():eenk");
    }

    public final void b(dkgk dkgkVar) {
        this.a.add(dkgkVar);
    }

    protected final void c(dkgj dkgjVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkgk) it.next()).c(this, dkgjVar);
        }
    }

    protected final void d(int i, String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dkgk) it.next()).d(this, i, str);
        }
    }

    public final void e(dkgk dkgkVar) {
        this.a.remove(dkgkVar);
    }

    public final void f(eenk eenkVar) {
        try {
            eeif l = ((eehz) this.d).a.l(eenkVar);
            l.h(15);
            if (!l.g()) {
                d(408, "timeout");
                return;
            }
            int a = l.a();
            eenl b = l.b();
            if (b == null) {
                dkty.g("SIP response is null.", new Object[0]);
                throw new eejg("SIP response is null.");
            }
            if (a != 200 && a != 202) {
                if (a == 403) {
                    if (this.m) {
                        h(b);
                        return;
                    } else {
                        this.m = true;
                        return;
                    }
                }
                if (a != 407) {
                    h(b);
                    return;
                }
                if (this.n) {
                    h(b);
                    return;
                }
                this.n = true;
                try {
                    dkty.k("407 response received", new Object[0]);
                    String l2 = b.l();
                    if (l2 == null) {
                        l2 = "";
                    }
                    this.c.e = dkut.i(l2);
                    this.l.a(b);
                    this.c.a();
                    dkty.k("Send second REFER", new Object[0]);
                    eenk a2 = a();
                    this.l.b(a2);
                    eell eellVar = a2.y().f;
                    if (eellVar == null) {
                        throw new IllegalStateException("To header is null.");
                    }
                    eellVar.e();
                    f(a2);
                    return;
                } catch (Exception e) {
                    dkty.i(e, "Reference failed", new Object[0]);
                    c(new dkgj(e));
                    return;
                }
            }
            dkgm dkgmVar = this.k;
            dkty.c("Add reference %s", this);
            dkgmVar.b.add(this);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((dkgk) it.next()).a(this);
            }
        } catch (Exception e2) {
            dkty.i(e2, "Error while referring: %s", e2.getMessage());
            c(new dkgj("Error while rejecting refer: ".concat(String.valueOf(e2.getMessage())), e2));
        }
    }

    public final void g() {
        ((dkgh) dipp.a(dkgh.class)).v().submit(new dkgg(this));
    }
}
