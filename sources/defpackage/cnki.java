package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.ims.rcsservice.chatsession.ChatSessionMessageEvent;
import com.google.android.ims.rcsservice.events.Event;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnki implements ehxn {
    public static final cskc a = cskc.g("BugleAction", "IncomingRcsEventProcessor");
    private static final csjp d = new csjp(TimeUnit.SECONDS.toMillis(3));
    private static final csjp e = new csjp(TimeUnit.SECONDS.toMillis(30));
    private static final enip f = enip.r(50050, 0);
    private static final entd g = entd.c("BugleAction");
    private final ckpg A;
    private final cqpv B;
    private final ckos C;
    private final ffbr D;
    private final ffbr E;
    private final aviv F;
    private final azaw G;
    private final azaw H;
    private final avkc I;
    private final baed J;
    private final baik K;
    private final bacj L;
    private final baob M;
    private final baeq N;
    private final baod O;
    public final ffbr b;
    public final ffbr c;
    private final bbfr h;
    private final akzt i;
    private final fazb j;
    private final ckds k;
    private final ctyx l;
    private final fazb m;
    private final cqoh n;
    private final cnjy o;
    private final cnkb p;
    private final alir q;
    private final bbfm r;
    private final errl s;
    private final bbfq t;
    private final cvad u;
    private final alrv v;
    private final cnka w;
    private final cksw x;
    private final ckxv y;
    private final clws z;

    public cnki(baed baedVar, baik baikVar, bbfr bbfrVar, bacj bacjVar, akzt akztVar, fazb fazbVar, ckds ckdsVar, ctyx ctyxVar, fazb fazbVar2, cqoh cqohVar, cnjy cnjyVar, cnkb cnkbVar, alir alirVar, bbfm bbfmVar, errl errlVar, baob baobVar, baeq baeqVar, bbfq bbfqVar, baod baodVar, cvad cvadVar, ffbr ffbrVar, alrv alrvVar, cksw ckswVar, cnka cnkaVar, ckxv ckxvVar, clws clwsVar, ckpg ckpgVar, cqpv cqpvVar, ckos ckosVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, aviv avivVar, azaw azawVar, azaw azawVar2, avkc avkcVar) {
        this.J = baedVar;
        this.K = baikVar;
        this.h = bbfrVar;
        this.L = bacjVar;
        this.i = akztVar;
        this.j = fazbVar;
        this.k = ckdsVar;
        this.l = ctyxVar;
        this.m = fazbVar2;
        this.n = cqohVar;
        this.o = cnjyVar;
        this.p = cnkbVar;
        this.q = alirVar;
        this.r = bbfmVar;
        this.s = errlVar;
        this.N = baeqVar;
        this.M = baobVar;
        this.t = bbfqVar;
        this.O = baodVar;
        this.u = cvadVar;
        this.b = ffbrVar;
        this.v = alrvVar;
        this.w = cnkaVar;
        this.x = ckswVar;
        this.y = ckxvVar;
        this.z = clwsVar;
        this.A = ckpgVar;
        this.B = cqpvVar;
        this.C = ckosVar;
        this.D = ffbrVar2;
        this.E = ffbrVar3;
        this.c = ffbrVar4;
        this.F = avivVar;
        this.G = azawVar;
        this.H = azawVar2;
        this.I = avkcVar;
    }

    private final void e(Action action, cniz cnizVar) {
        this.z.q(cnizVar);
        action.r(cnizVar);
    }

    @Override // defpackage.ehxn
    public final String a() {
        return "IncomingRcsEventProcessor";
    }

    @Override // defpackage.ehxn
    public final void b(Event event) {
        c(event, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0922, code lost:
    
        if (defpackage.aoqw.h(r4) == false) goto L215;
     */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0ac8  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ae5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.ims.rcsservice.events.Event r20, defpackage.cniz r21) {
        /*
            Method dump skipped, instructions count: 3140
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnki.c(com.google.android.ims.rcsservice.events.Event, cniz):void");
    }

    protected final void d(ChatSessionMessageEvent chatSessionMessageEvent, int i, cniz cnizVar) {
        final bdhg a2 = bdhg.a(chatSessionMessageEvent.c);
        if (bdhg.l(a2) && bbew.a(i)) {
            e(this.J.a(a2, i, eqyl.RCS_LEGACY), cnizVar);
            axnw.h(this.s.submit(eldl.l(new Runnable() { // from class: cnke
                @Override // java.lang.Runnable
                public final void run() {
                    cnki cnkiVar = cnki.this;
                    bdmq bdmqVar = (bdmq) cnkiVar.c.b();
                    bdhg bdhgVar = a2;
                    ((altk) cnkiVar.b.b()).A(bdhgVar, bdmqVar.x(bdhgVar), 25, eqyl.RCS_LEGACY);
                }
            })));
        }
    }
}
