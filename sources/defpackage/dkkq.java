package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkq extends dkgm {
    public final ffbr h;
    public final dkqu i;
    public final ctvb j;
    public final Context k;
    public final eeft l;
    public final dkib m;
    public final diod n;
    public final dkrp o;
    public dkkr p;
    public final CopyOnWriteArrayList q;
    public final LinkedBlockingQueue r;
    public volatile boolean s;
    public final InstantMessageConfiguration t;
    public final dkjx u;
    public final dikx v;
    public final ffbr w;
    private Thread y;
    private final Runnable z;
    private static final diyy x = dizd.a(181136833);
    public static final dktn g = new dktn("InstantMessagingService");

    public dkkq(Context context, djjr djjrVar, dkhc dkhcVar, ffbr ffbrVar, ctvb ctvbVar, eeft eeftVar, dkib dkibVar, diod diodVar, dkur dkurVar, dkrp dkrpVar, dkjx dkjxVar, dikx dikxVar, ffbr ffbrVar2) {
        super(djjrVar, dkhcVar, dkurVar);
        this.q = new CopyOnWriteArrayList();
        this.r = new LinkedBlockingQueue();
        this.z = new dkko(this);
        this.k = context;
        this.h = ffbrVar;
        this.j = ctvbVar;
        this.i = new dkqu(djjrVar.c());
        this.l = eeftVar;
        this.m = dkibVar;
        this.n = diodVar;
        this.t = djjrVar.d();
        this.o = dkrpVar;
        this.u = dkjxVar;
        this.v = dikxVar;
        this.w = ffbrVar2;
    }

    public static int p(int i) {
        if (i == 403) {
            return 9;
        }
        if (i == 404) {
            return 1;
        }
        if (i == 406) {
            return 11;
        }
        if (i == 410) {
            return 1;
        }
        if (i == 486 || i == 488 || i == 500 || i == 600 || i == 603) {
            return 11;
        }
        if (i != 604) {
            return i;
        }
        return 1;
    }

    public static final byte[] y(dkjt dkjtVar) {
        dkty.l(g, "Reading byte content from MessageContent stream", new Object[0]);
        edzh edzhVar = dkjtVar.g;
        if (edzhVar != null) {
            return eoej.b(edzhVar.d());
        }
        throw new eejg("MessageContent is null");
    }

    @Override // defpackage.dkgm
    protected final void f() {
        this.s = false;
        Thread thread = new Thread(this.z, "PM MSG Sender");
        this.y = thread;
        thread.start();
    }

    @Override // defpackage.dkgm
    protected final void g(dilc dilcVar) {
        this.s = true;
        Thread thread = this.y;
        if (thread != null) {
            thread.interrupt();
            this.y = null;
        }
        while (!this.r.isEmpty()) {
            u((dkjt) this.r.poll(), 8);
        }
        this.r.clear();
    }

    @Override // defpackage.dkgm
    protected final void m(dkha dkhaVar, dilc dilcVar) {
        if ((dkhaVar instanceof dkkj) && ((dkkj) dkhaVar).E) {
            dkty.d(g, "Chat conference found - disconnecting instead of stopping.", new Object[0]);
            dkhaVar.E(dilcVar);
            return;
        }
        int ordinal = dilcVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
            dkhaVar.n(2, 4);
        } else {
            dkhaVar.l();
        }
    }

    public final eehy q() {
        eehy eehyVar = ((eehz) this.h).a;
        if (eehyVar.v()) {
            throw new eejg("SIP stack not initialized");
        }
        return eehyVar;
    }

    public final String r() {
        return this.a.e();
    }

    public final String s(String str) {
        String str2;
        ImsConfiguration c = this.a.c();
        if (!((Boolean) x.a()).booleanValue()) {
            eeit c2 = dkut.c(str, c, this.j);
            c2.getClass();
            return c2.toString();
        }
        boolean y = dkut.y(c);
        try {
            str2 = q().f();
        } catch (eejg e) {
            dkty.n(3, g, e, "SipStack is not initialized", new Object[0]);
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.a.c().mDomain;
        }
        eeit d = dkut.d(str, str2, this.j, y);
        d.getClass();
        return d.toString();
    }

    public final void t(dkjz dkjzVar) {
        this.q.add(dkjzVar);
    }

    public final void u(dkjt dkjtVar, int i) {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((dkjz) it.next()).a(dkjtVar, i);
        }
    }

    public final void v(dkkj dkkjVar) {
        boolean d = dizu.d();
        if (this.p == null) {
            dkty.d(g, "Not notifying, no listener registered", new Object[0]);
            return;
        }
        if (!dkkjVar.J) {
            if (dkkjVar.E) {
                dkty.d(g, "Group chat session", new Object[0]);
            } else {
                dkty.d(g, "1:1 chat session", new Object[0]);
            }
            if (dkkjVar instanceof dklm) {
                this.p.c(dkkjVar);
                return;
            } else {
                this.p.b(dkkjVar);
                return;
            }
        }
        if (!d) {
            dkty.d(g, "Discarding incoming RBM bot chat session, feature disabled.", new Object[0]);
            return;
        }
        dkty.d(g, "1-1 chat session: RBM bot chat session.", new Object[0]);
        if (dkkjVar instanceof dklm) {
            this.p.d(dkkjVar);
        } else {
            this.p.e(dkkjVar);
        }
    }

    public final void w(dkjz dkjzVar) {
        this.q.remove(dkjzVar);
    }

    public final boolean x() {
        eehk eehkVar = dkut.a;
        return this.t.a();
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
