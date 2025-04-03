package defpackage;

import android.text.TextUtils;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.PrintWriter;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djnr implements djjw {
    private static final diyy d = dizd.a(169805025);
    private static final diyy e = dizd.a(176892952);
    private static final diyy f = dizd.a(187751924);
    public final dktn a;
    final djqh b;
    djqf c;

    @Deprecated
    private final djts g;
    private final djtl h;

    @Deprecated
    private final ffbr i;
    private final errl j;
    private final djqm l;
    private djqk m;
    private int k = -1;
    private final djjk n = new djnq(this);

    public djnr(djts djtsVar, djtl djtlVar, ffbr ffbrVar, djqh djqhVar, djqm djqmVar, errl errlVar, dktn dktnVar) {
        this.g = djtsVar;
        this.h = djtlVar;
        this.i = ffbrVar;
        this.b = djqhVar;
        this.l = djqmVar;
        this.j = errlVar;
        this.a = dktnVar;
    }

    @Override // defpackage.djjw
    public final djjk a() {
        return this.n;
    }

    @Override // defpackage.djjw
    public final synchronized djjt b() {
        djqf djqfVar = this.c;
        if (Objects.isNull(djqfVar)) {
            return null;
        }
        return djqfVar.w;
    }

    @Override // defpackage.djjw
    public final Optional c() {
        Optional empty;
        djqf djqfVar = this.c;
        if (djqfVar == null) {
            return Optional.empty();
        }
        djkr djkrVar = djqfVar.B;
        if (djkrVar == null || !djqfVar.l) {
            empty = Optional.empty();
        } else {
            try {
                empty = Optional.of(djjs.d(((djkv) djqfVar.s.b()).c.c, djkrVar.a(), true));
            } catch (IllegalStateException unused) {
                dkty.h(djqfVar.m, "RegistrationContext is not found.", new Object[0]);
                empty = Optional.empty();
            }
        }
        return empty.isEmpty() ? Optional.ofNullable(b()).map(new Function() { // from class: djju
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                djjt djjtVar = (djjt) obj;
                return djjs.d(djjtVar.e.a, djjtVar.g, false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }) : empty;
    }

    @Override // defpackage.djjw
    public final String d() {
        djqf djqfVar = this.c;
        if (!Objects.isNull(djqfVar)) {
            String str = djqfVar.y;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return (dizg.J() ? this.h.a.m() : this.g.a).w();
    }

    @Override // defpackage.djjw
    public final synchronized void e() {
        djqf djqfVar = this.c;
        dkty.l(this.a, "Destroying RegistrationEngine.", new Object[0]);
        if (Objects.isNull(djqfVar)) {
            return;
        }
        djqfVar.B(dilc.SHUTDOWN);
        djqfVar.m();
        this.c = null;
    }

    @Override // defpackage.djjw
    public final void f(PrintWriter printWriter) {
        dktn dktnVar = this.a;
        djqf djqfVar = this.c;
        printWriter.println("    - RegistrationEngine: ".concat(String.valueOf(String.valueOf(dktnVar))));
        if (Objects.isNull(djqfVar)) {
            return;
        }
        printWriter.println("     - RegistrationStateMachine ".concat(String.valueOf(String.valueOf(djqfVar.m))));
        djop djopVar = (djop) djqfVar.d();
        printWriter.println("       state: ".concat(djopVar != null ? djopVar.a() : "UnknownState"));
        printWriter.println("       expirePeriod: " + djqfVar.F + "s");
        if (djqfVar.ak.equals(djqfVar.d())) {
            printWriter.println("       next retry in " + (djqfVar.H - dkvj.a().longValue()) + "ms");
            printWriter.println("       retryDelayCalculator: ".concat(String.valueOf(String.valueOf(djqfVar.G))));
        }
        printWriter.println("       publicIdentity: ".concat(String.valueOf(dktx.URI_SIP.c(djqfVar.y))));
        printWriter.println("       P-CSCF: ".concat(djqfVar.I.q()));
        printWriter.println("       ConfigVersion: " + djqfVar.J);
        printWriter.println("       useNetworkCallback: " + djqfVar.l);
        djqr djqrVar = djqfVar.L;
        printWriter.println("    - Keep Alive Manager -");
        printWriter.println("      mKeepAlivePeriod: " + djqrVar.d);
        printWriter.println("      mLastKeepAlive: " + djqrVar.f);
        printWriter.println("      Keep alive scheduled: " + djqrVar.a.e());
    }

    @Override // defpackage.djjw
    public final void g(dilc dilcVar) {
        if (dilcVar == dilc.DISABLED || dilcVar == dilc.SHUTDOWN || dilcVar == dilc.CANCELED) {
            dkty.r(this.a, "Unexpected reason for restarting. reason=%s", dilcVar);
            return;
        }
        dkty.l(this.a, "RegistrationEngineStateMachine restarts after deregistration. reason=%s", dilcVar);
        int i = this.k;
        j(dilcVar);
        i(i);
    }

    @Override // defpackage.djjw
    public final /* synthetic */ void h(dilc dilcVar, int i) {
        g(dilcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03c6 A[Catch: all -> 0x0403, TryCatch #2 {, blocks: (B:4:0x0005, B:7:0x00c5, B:9:0x00cd, B:10:0x00d4, B:12:0x00da, B:14:0x00ed, B:15:0x00f7, B:17:0x0108, B:18:0x0115, B:20:0x011c, B:21:0x0125, B:25:0x013a, B:26:0x031e, B:28:0x0324, B:33:0x032f, B:35:0x0337, B:38:0x0352, B:40:0x0386, B:41:0x03a2, B:43:0x03aa, B:45:0x03b0, B:46:0x03b8, B:49:0x0398, B:50:0x0361, B:52:0x03c0, B:54:0x03c6, B:56:0x03d4, B:58:0x03da, B:61:0x03e5, B:66:0x0146, B:68:0x0209, B:69:0x0218, B:70:0x0212, B:71:0x0135, B:72:0x0121, B:73:0x0111, B:74:0x001b, B:76:0x001f, B:77:0x0036, B:79:0x0044, B:81:0x004a, B:82:0x0053, B:84:0x0057, B:85:0x004f, B:86:0x006d, B:88:0x0073, B:89:0x0080, B:91:0x0088, B:92:0x0092, B:94:0x0098, B:95:0x00a7, B:97:0x00b3, B:100:0x00bc, B:103:0x00a1, B:104:0x007c), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0401 A[DONT_GENERATE] */
    @Override // defpackage.djjw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i(int r34) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djnr.i(int):void");
    }

    @Override // defpackage.djjw
    public final synchronized void j(dilc dilcVar) {
        dkty.l(this.a, "Unregistering from IMS network. reason=%s", dilcVar);
        djqf djqfVar = this.c;
        if (Objects.isNull(djqfVar)) {
            return;
        }
        djqfVar.B(dilcVar);
    }

    @Override // defpackage.djjw
    public final boolean k() {
        djqf djqfVar = this.c;
        if (Objects.isNull(djqfVar)) {
            return false;
        }
        if (l()) {
            return true;
        }
        dixy d2 = djqfVar.d();
        return (d2 == null || d2.equals(djqfVar.W) || d2.equals(djqfVar.ai) || d2.equals(djqfVar.al)) ? false : true;
    }

    @Override // defpackage.djjw
    public final boolean l() {
        djqf djqfVar = this.c;
        if (Objects.isNull(djqfVar)) {
            return false;
        }
        return djqfVar.P();
    }

    @Override // defpackage.djjw
    public final boolean m() {
        djqf djqfVar = this.c;
        if (Objects.isNull(djqfVar)) {
            return false;
        }
        return djqfVar.Q();
    }

    @Override // defpackage.djjw
    public final boolean n() {
        djjt djjtVar;
        djqf djqfVar = this.c;
        return (Objects.isNull(djqfVar) || (djjtVar = djqfVar.w) == null || djjtVar.c() != 1) ? false : true;
    }
}
