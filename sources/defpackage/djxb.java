package defpackage;

import android.os.Message;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djxb extends djyw {
    final /* synthetic */ djxs c;

    public djxb(djxs djxsVar) {
        this.c = djxsVar;
    }

    private final boolean q(Message message, djxb djxbVar) {
        if (message.obj != this && message.obj != this.c.Q.d()) {
            this.c.z.d("%s: ignoring %s", a(), djxs.al(djxs.ak(message)));
            return false;
        }
        this.c.z.d("%s: %s", a(), djxs.al(djxs.ak(message)));
        this.c.R(djxbVar);
        return true;
    }

    @Override // defpackage.dixy
    public void b() {
        this.c.t.ifPresent(new Consumer() { // from class: djxa
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((djxu) obj).a = djxb.this;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.z.d("Enter %s", a());
        ((dkdw) this.c.M.b()).B(this.c.h, a());
        if (h()) {
            djxs djxsVar = this.c;
            djxsVar.n.c(djxsVar.m, g(), djxsVar.l, new djro(djxsVar.h));
        }
        this.c.N(djta.MSG_TIMEOUT, l().toMillis());
    }

    @Override // defpackage.dixy
    public void c() {
        this.c.t.ifPresent(new Consumer() { // from class: djwz
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                djxu djxuVar = (djxu) obj;
                if (djxuVar.a == djxb.this) {
                    djxuVar.a = null;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.z.d("Exit %s", a());
        this.c.Q.p(djta.MSG_TIMEOUT.a());
        if (h()) {
            djxs djxsVar = this.c;
            djxsVar.n.h(djxsVar.m, g(), djxsVar.l, new djro(djxsVar.h));
        }
    }

    public abstract djta f();

    public abstract ezez g();

    public abstract boolean h();

    public boolean i() {
        this.c.O(this);
        return true;
    }

    public abstract boolean j();

    public Duration l() {
        return Duration.ofMillis(((Long) djai.t().a.c.a()).longValue());
    }

    public boolean m() {
        return false;
    }

    final void n(djxb djxbVar, ezez ezezVar) {
        this.c.z.d("transitionViaMessage, srcState=%s, destState = %s", a(), djxbVar.a());
        if (this.c.R.l()) {
            axnw.h(this.c.R.d(ezezVar));
        }
        if (this.c.R.k()) {
            this.c.M(djxbVar.f(), djta.MSG_ARG_TRANSITION_MSG.a(), 0, this);
        }
    }

    public final boolean o(Message message, djta djtaVar) {
        if (this.c.R.k()) {
            djtaVar = djxs.ak(message);
        }
        int ordinal = djtaVar.ordinal();
        if (ordinal == 8) {
            if (j()) {
                djxs djxsVar = this.c;
                djxsVar.z.e("Timed out in state %s", djxsVar.n());
                djxsVar.n.l(djxsVar.m, djxsVar.j(), djxsVar.l, new djro(djxsVar.h));
                djxsVar.R(djxsVar.al);
            }
            return true;
        }
        switch (ordinal) {
            case 52:
                return q(message, this.c.ad);
            case 53:
                return q(message, this.c.ae);
            case 54:
                return q(message, this.c.af);
            case 55:
                return q(message, this.c.ag);
            case 56:
                return q(message, this.c.ah);
            case 57:
                return q(message, this.c.ak);
            case 58:
                return q(message, this.c.al);
            case 59:
                return q(message, this.c.am);
            default:
                switch (ordinal) {
                    case 61:
                        return q(message, this.c.an);
                    case 62:
                        return q(message, this.c.ao);
                    case 63:
                        return q(message, this.c.ap);
                    case 64:
                        return q(message, this.c.aq);
                    case 65:
                        return q(message, this.c.ar);
                    case 66:
                        return q(message, this.c.as);
                    case 67:
                        return q(message, this.c.at);
                    case 68:
                        return q(message, this.c.au);
                    default:
                        switch (ordinal) {
                            case 70:
                                return q(message, this.c.av);
                            case 71:
                                return q(message, this.c.aw);
                            case 72:
                                return q(message, this.c.ax);
                            default:
                                switch (ordinal) {
                                    case 74:
                                        return q(message, this.c.ay);
                                    case 75:
                                        return q(message, this.c.az);
                                    case 76:
                                        return q(message, this.c.aj);
                                    case 77:
                                        return q(message, this.c.ai);
                                    case 78:
                                        return q(message, this.c.aA);
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    final void p(djxb djxbVar, ezez ezezVar, int i) {
        if (i == 1) {
            n(djxbVar, ezezVar);
        } else {
            this.c.R(djxbVar);
        }
    }
}
