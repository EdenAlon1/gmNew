package defpackage;

import android.os.Message;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwo extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwo(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithHeState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.REQUEST_WITH_HE_STAGE);
        djxs djxsVar = this.a;
        dkdv dkdvVar = djxsVar.v;
        Optional of = Optional.of(djxsVar.h);
        if (!dkdvVar.j(dkdvVar.e(of))) {
            dkdvVar.s(new emwl() { // from class: dkds
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ezdn ezdnVar = (ezdn) obj;
                    enhk enhkVar = dkdv.a;
                    ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
                    ezde ezdeVar = ezdnVar.e;
                    if (ezdeVar == null) {
                        ezdeVar = ezde.a;
                    }
                    ezcv ezcvVar = (ezcv) ezdeVar.toBuilder();
                    ezcn ezcnVar = ezcn.FALSE;
                    ezcvVar.copyOnWrite();
                    ezde ezdeVar2 = (ezde) ezcvVar.instance;
                    ezdeVar2.e = ezcnVar.d;
                    ezdeVar2.b |= 4;
                    ezde ezdeVar3 = (ezde) ezcvVar.build();
                    ezdmVar.copyOnWrite();
                    ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
                    ezdeVar3.getClass();
                    ezdnVar2.e = ezdeVar3;
                    ezdnVar2.b |= 4;
                    return (ezdn) ezdmVar.build();
                }
            }, of);
        }
        try {
            String q = this.a.q();
            this.a.ar(27);
            this.a.B(q);
            dkbm i = dkbn.i(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, Optional.ofNullable(this.a.l));
            i.f(q);
            eyyu b = i.b();
            b.copyOnWrite();
            eyzd eyzdVar = (eyzd) b.instance;
            eyzd eyzdVar2 = eyzd.a;
            q.getClass();
            eyzdVar.b |= 2;
            eyzdVar.d = q;
            this.a.L(djta.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK, i.j());
        } catch (MalformedURLException e) {
            djxs djxsVar2 = this.a;
            djxsVar2.an(djta.MSG_EXCEPTION_CAUGHT, djxsVar2.k);
            this.a.F(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE);
            this.a.z.e("Failed to request with header enrichment when building query. %s", dktx.URI.c(e));
            this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE);
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITH_HE;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
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
        this.a.D("RequestWithHeState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 4) {
            this.a.av(message.arg1);
            return false;
        }
        if (ordinal == 24) {
            this.a.ar(32);
            djxs djxsVar = this.a;
            djxsVar.R(djxsVar.ak);
            this.a.p.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
            return true;
        }
        if (ordinal == 21) {
            this.a.ar(33);
            djxs djxsVar2 = this.a;
            djxsVar2.R(djxsVar2.ak);
            return true;
        }
        if (ordinal == 22) {
            this.a.ar(34);
            return false;
        }
        switch (ordinal) {
            case 40:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
            case 50:
                djxs djxsVar3 = this.a;
                djxsVar3.p.d(djxsVar3.h, (HttpURLConnection) message.obj);
                break;
            case 41:
                HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                djxs djxsVar4 = this.a;
                djxsVar4.n.a(djxsVar4.m, ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, djxsVar4.l, new djro(djxsVar4.h), ezeq.HE_REQUEST_SUCCESSFUL);
                djxs djxsVar5 = this.a;
                djxsVar5.R(djxsVar5.ap);
                this.a.p.a(httpURLConnection, null, "RequestWithHeState");
                djxs djxsVar6 = this.a;
                djxsVar6.p.d(djxsVar6.h, httpURLConnection);
                return true;
            case 43:
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                djxs djxsVar7 = this.a;
                djxsVar7.R(djxsVar7.ak);
                this.a.p.a((HttpURLConnection) message.obj, null, "RequestWithHeState");
                djxs djxsVar8 = this.a;
                djxsVar8.p.d(djxsVar8.h, httpURLConnection2);
                return true;
        }
        return super.o(message, djtaVar);
    }
}
