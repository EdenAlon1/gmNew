package defpackage;

import android.os.Message;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djws extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djws(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithTokenState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        String l;
        super.b();
        this.a.y(ezdc.REQUEST_WITH_TOKEN_STAGE);
        djtp g = this.a.g();
        String z = g.z();
        if (z == null) {
            this.a.z.a("No token exist, Skip request with token", new Object[0]);
            n(this.a.ag, ezez.RCS_PROVISIONING_READY_STATE);
            return;
        }
        djxs djxsVar = this.a;
        if (djxsVar.G) {
            cosz coszVar = djxsVar.H;
            coszVar.getClass();
            l = djxsVar.u.m(coszVar);
        } else {
            l = djxsVar.u.l();
        }
        String str = l;
        int c = this.a.c();
        try {
            dkbm i = dkbn.i(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, Optional.ofNullable(this.a.l));
            String q = this.a.q();
            this.a.B(q);
            djxs djxsVar2 = this.a;
            djxsVar2.q.d(djxsVar2.m, q, g, str, z, c, djxsVar2.j, djxsVar2.h, i);
            this.a.ar(27);
            this.a.t(i);
            djuw i2 = djux.i();
            this.a.s(this, i, i2);
            djxs djxsVar3 = this.a;
            if (djxsVar3.aa(djxsVar3.h)) {
                djxs djxsVar4 = this.a;
                i2.c(djxsVar4.q.c(djxsVar4.j, djxsVar4.h));
                i2.d(str);
                ((djur) i2).e = Optional.ofNullable(this.a.l);
                djxs djxsVar5 = this.a;
                if (djxsVar5.Y.c(djxsVar5.h).N) {
                    this.a.F.b(i2.a(), i);
                }
            }
            this.a.L(djta.MSG_SEND_CONFIG_REQUEST, i.j());
        } catch (MalformedURLException e) {
            this.a.F(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
            this.a.z.e("Request with token failed while building query. %s", dktx.URI.c(e));
            this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE);
            n(this.a.ak, ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE);
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("RequestWithTokenState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 4) {
            this.a.av(message.arg1);
            return false;
        }
        if (ordinal == 46) {
            djxs djxsVar = this.a;
            djxsVar.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
            this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 401);
            if (!djai.Z()) {
                return false;
            }
            this.a.u.p(null);
            djxs djxsVar2 = this.a;
            djxsVar2.R(djxsVar2.al);
            return true;
        }
        switch (ordinal) {
            case 41:
                this.a.H((HttpURLConnection) message.obj, message.arg2, this);
                return true;
            case 42:
                djxs djxsVar3 = this.a;
                djxsVar3.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                djxs djxsVar4 = this.a;
                djvk djvkVar = djxsVar4.s;
                dkcp dkcpVar = djvkVar.b;
                String str = djxsVar4.h;
                djtp f = dkcpVar.f(str);
                if (f == null || f.a() != 2) {
                    djvkVar.c(str);
                } else {
                    djvkVar.b.t(str, null);
                }
                djvkVar.a.q(false);
                djvkVar.a.o(null);
                djvkVar.a.r("");
                if (!((dixb) djvkVar.e.b()).a()) {
                    str = djvkVar.c.l();
                }
                ((dkdw) djvkVar.d.b()).v(str, "");
                djvkVar.a.y();
                this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, 403);
                djxs djxsVar5 = this.a;
                djxsVar5.R(djxsVar5.al);
                return true;
            case 43:
                djxs djxsVar6 = this.a;
                djxsVar6.p.a((HttpURLConnection) message.obj, null, "RequestWithTokenState");
                djxs djxsVar7 = this.a;
                djxsVar7.s.c(djxsVar7.h);
                djxs djxsVar8 = this.a;
                djxsVar8.R(djxsVar8.ag);
                return true;
            default:
                return super.o(message, djtaVar);
        }
    }
}
