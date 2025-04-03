package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Message;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwk extends djxb {
    final /* synthetic */ djxs a;
    private djwi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwk(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q(Message message) {
        String headerField;
        int i = message.arg1;
        int i2 = message.arg2;
        djxs djxsVar = this.a;
        djxsVar.n.f(djxsVar.m, djxsVar.j(), i, djxsVar.l, new djro(djxsVar.h));
        if ((message.obj instanceof HttpURLConnection) && (headerField = ((HttpURLConnection) message.obj).getHeaderField("x-acs-debug-message")) != null) {
            this.a.z.a("Http response ACS debug message: %s", headerField);
        }
        this.a.M(i != 200 ? i != 403 ? i != 405 ? i != 429 ? i != 501 ? i != 511 ? i != 400 ? i != 401 ? i != 503 ? i != 504 ? djta.MSG_HTTP_RESPONSE_UNKNOWN : djta.MSG_HTTP_504_GATEWAY_TIMEOUT : djta.MSG_HTTP_503_UNAVAILABLE : djta.MSG_HTTP_401_UNAUTHORIZED : djta.MSG_HTTP_400_BAD_REQUEST : djta.MSG_HTTP_511_AUTH_REQUIRED : djta.MSG_HTTP_501_NOT_SUPPORTED : djta.MSG_HTTP_429_TOO_MANY_REQUESTS : djta.MSG_HTTP_405_METHOD_NOT_ALLOWED : djta.MSG_HTTP_403_FORBIDDEN : djta.MSG_HTTP_200_OK, i, i2, message.obj);
    }

    private final void r(Message message) {
        if (djai.V()) {
            djxs djxsVar = this.a;
            if (djxsVar.k != message.arg2) {
                djxsVar.z.e("request id: %d, received id: %d, discard exception message", Integer.valueOf(djxsVar.k), Integer.valueOf(message.arg1));
                return;
            }
        }
        djxs djxsVar2 = this.a;
        djxsVar2.R(djxsVar2.al);
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "InProgressState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.b = new djwi(this);
        djyc djycVar = this.a.C;
        djwi djwiVar = this.b;
        dksp dkspVar = djycVar.a;
        dksn f = dkso.f(new djyb(djwiVar), erpp.a);
        f.b(djwiVar);
        f.c(false);
        dkspVar.a(f.a());
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void c() {
        super.c();
        djwi djwiVar = this.b;
        if (djwiVar != null) {
            this.a.C.a.d(djwiVar);
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_IN_PROGRESS;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_IN_PROGRESS_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("InProgressState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal != 4) {
            if (ordinal == 6) {
                this.a.k++;
                if (!(message.obj instanceof dkbn)) {
                    this.a.z.b("Wrong provisioning request message type", new Object[0]);
                    djxs djxsVar = this.a;
                    djxsVar.R(djxsVar.al);
                    return true;
                }
                dkbn dkbnVar = (dkbn) message.obj;
                djxs djxsVar2 = this.a;
                final int i = djxsVar2.k;
                final Optional of = Optional.of(dkbnVar);
                int i2 = engw.d;
                final djxs djxsVar3 = this.a;
                engw engwVar = enou.a;
                final String str = djxsVar3.l;
                final djro djroVar = new djro(djxsVar3.h);
                boolean booleanValue = ((Boolean) djyt.c.a()).booleanValue();
                final djvo djvoVar = djxsVar2.p;
                final Context context = djxsVar2.m;
                if (booleanValue && ((Boolean) djyt.a.a()).booleanValue()) {
                    axnw.h(elfo.g(new Callable() { // from class: djvl
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dkbn dkbnVar2 = (dkbn) of.orElse(null);
                            return djvo.this.c(context, djxsVar3, null, str, i, dkbnVar2, djroVar);
                        }
                    }, djvoVar.a));
                } else {
                    djvoVar.a.execute(new Runnable() { // from class: djvm
                        @Override // java.lang.Runnable
                        public final void run() {
                            dkbn dkbnVar2 = (dkbn) of.orElse(null);
                            djvo.this.c(context, djxsVar3, null, str, i, dkbnVar2, djroVar);
                        }
                    });
                }
                djxs djxsVar4 = this.a;
                djxsVar4.n.e(djxsVar4.m, djxsVar4.j(), djxsVar4.l, new djro(djxsVar4.h));
                return true;
            }
            if (ordinal == 9) {
                r(message);
                return true;
            }
            if (ordinal == 20) {
                this.a.k++;
                if (!(message.obj instanceof dkbn)) {
                    this.a.z.b("Wrong provisioning request message type", new Object[0]);
                    djxs djxsVar5 = this.a;
                    djxsVar5.R(djxsVar5.al);
                    return true;
                }
                dkbn dkbnVar2 = (dkbn) message.obj;
                djxs djxsVar6 = this.a;
                final int i3 = djxsVar6.k;
                final Optional of2 = Optional.of(dkbnVar2);
                int i4 = engw.d;
                final djxs djxsVar7 = this.a;
                engw engwVar2 = enou.a;
                final String str2 = djxsVar7.l;
                final djro djroVar2 = new djro(djxsVar7.h);
                final djvo djvoVar2 = djxsVar6.p;
                final Context context2 = djxsVar6.m;
                final dksj dksjVar = new dksj(context2, djvoVar2.d);
                final Network a = dksjVar.a();
                if (a == null) {
                    djxsVar7.K(djta.MSG_MOBILE_NETWORK_NOT_AVAILABLE);
                } else {
                    djvoVar2.a.execute(new Runnable() { // from class: djvn
                        @Override // java.lang.Runnable
                        public final void run() {
                            djvo.this.c(context2, djxsVar7, a, str2, i3, (dkbn) of2.orElse(null), djroVar2);
                            dksjVar.b();
                        }
                    });
                }
                djxs djxsVar8 = this.a;
                djxsVar8.n.e(djxsVar8.m, djxsVar8.j(), djxsVar8.l, new djro(djxsVar8.h));
                return true;
            }
            if (ordinal == 22 || ordinal == 24) {
                this.a.aq(ezez.RCS_PROVISIONING_IN_PROGRESS_STATE, 3);
                r(message);
                return true;
            }
            if (ordinal != 40) {
                switch (ordinal) {
                    case 42:
                    case 43:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case 50:
                        break;
                    case 44:
                        this.a.A(message);
                        return true;
                    default:
                        return super.o(message, djtaVar);
                }
            } else {
                this.a.z.d("Received unknown response %d in %s state", Integer.valueOf(message.arg1), this.a.n());
            }
            try {
            } catch (IOException unused) {
                this.a.z.e("Error retrieving response code", new Object[0]);
            }
            if (!djai.V() || this.a.af(message)) {
                if (message.obj instanceof HttpURLConnection) {
                    this.a.au(ezez.RCS_PROVISIONING_IN_PROGRESS_STATE, ((HttpURLConnection) message.obj).getResponseCode());
                }
                djxs djxsVar9 = this.a;
                djxsVar9.R(djxsVar9.al);
                if (message.obj instanceof HttpURLConnection) {
                    this.a.p.a((HttpURLConnection) message.obj, null, "InProgressState");
                }
            } else {
                this.a.v(message);
            }
        } else if (!djai.V()) {
            q(message);
        } else if (this.a.af(message)) {
            q(message);
        } else {
            this.a.v(message);
        }
        return true;
    }
}
