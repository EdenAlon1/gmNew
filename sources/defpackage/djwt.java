package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Message;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwt extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwt(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithoutAuthState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        try {
            dkbm i = dkbn.i(ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, Optional.ofNullable(this.a.l));
            String q = this.a.q();
            djxs djxsVar = this.a;
            djxv djxvVar = djxsVar.q;
            Context context = djxsVar.m;
            String str = djxsVar.h;
            String str2 = djxsVar.j;
            djtp f = djxvVar.b.f(str);
            dkef a = djxvVar.a(context, str2, str);
            try {
                dkeh dkehVar = djxvVar.a;
                Optional of = Optional.of(i);
                dkty.o("Using network authenticated config server query", new Object[0]);
                dkbm dkbmVar = (dkbm) of.orElse(dkeh.a());
                dkbmVar.f(dkeh.b(dkeh.f(q, f, a, new dkeg(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE), dkbmVar).build().toString()));
            } catch (IOException e) {
                dkty.i(e, "Error while building ACS URL", new Object[0]);
            }
            List r = this.a.r();
            i.k("Cookie", djte.a(r));
            djxs djxsVar2 = this.a;
            if (djxsVar2.aa(djxsVar2.h)) {
                djxs djxsVar3 = this.a;
                String c = djxsVar3.q.c(djxsVar3.j, djxsVar3.h);
                djuw i2 = djux.i();
                i2.c(c);
                ((djur) i2).e = Optional.ofNullable(this.a.l);
                djxs.am(i2, r);
                djxs djxsVar4 = this.a;
                if (djxsVar4.Y.c(djxsVar4.h).N) {
                    this.a.F.b(i2.a(), i);
                }
            }
            this.a.L(djta.MSG_SEND_CONFIG_REQUEST, i.j());
        } catch (MalformedURLException e2) {
            this.a.F(ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE);
            this.a.z.e("Failed to request without authentication when building query. MalformedUrl encountered. %s", dktx.URI.c(e2));
            this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE);
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
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
        this.a.D("RequestWithoutAuthState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 41) {
            this.a.H((HttpURLConnection) message.obj, message.arg2, this);
            return true;
        }
        if (ordinal != 43) {
            if (ordinal != 44) {
                return super.o(message, djtaVar);
            }
            return false;
        }
        djxs djxsVar = this.a;
        djxsVar.s.c(djxsVar.h);
        djxs djxsVar2 = this.a;
        djxsVar2.R(djxsVar2.ak);
        djxs djxsVar3 = this.a;
        djxsVar3.p.a((HttpURLConnection) message.obj, null, "RequestWithoutAuthState");
        return true;
    }
}
