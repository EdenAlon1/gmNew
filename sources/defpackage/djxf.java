package defpackage;

import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxf extends djxb {
    String a;
    final /* synthetic */ djxs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxf(djxs djxsVar) {
        super(djxsVar);
        this.b = djxsVar;
    }

    private final void q() {
        djxs djxsVar = this.b;
        djxsVar.u.s(djxsVar.h, cmbc.a);
    }

    private final void r(String str) {
        try {
            dkbm i = dkbn.i(ezez.RCS_PROVISIONING_VERIFY_OTP_STATE, Optional.ofNullable(this.b.l));
            this.b.ar(27);
            String q = this.b.q();
            this.b.B(q);
            Optional of = Optional.of(i);
            dkty.o("Using OTP authenticated config server query", new Object[0]);
            dkbm dkbmVar = (dkbm) of.orElse(dkeh.a());
            Uri.Builder buildUpon = Uri.parse(q).buildUpon();
            eyyu b = dkbmVar.b();
            b.copyOnWrite();
            eyzd eyzdVar = (eyzd) b.instance;
            eyzd eyzdVar2 = eyzd.a;
            q.getClass();
            eyzdVar.b |= 2;
            eyzdVar.d = q;
            String str2 = (String) dkrz.e.d();
            if (!TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter("provision_id", str2);
                dkbmVar.l("provision_id", str2);
            }
            buildUpon.appendQueryParameter("OTP", str);
            dkbmVar.l("OTP", str);
            dkbmVar.f(dkeh.b(buildUpon.build().toString()));
            List r = this.b.r();
            if (r.isEmpty()) {
                djxs djxsVar = this.b;
                djxsVar.n.b(djxsVar.m, ezez.RCS_PROVISIONING_VERIFY_OTP_STATE, djxsVar.l, new djro(djxsVar.h));
                djxs djxsVar2 = this.b;
                djxsVar2.R(djxsVar2.al);
                return;
            }
            i.k("Cookie", djte.a(r));
            djxs djxsVar3 = this.b;
            if (djxsVar3.Y.c(djxsVar3.h).N) {
                djuw i2 = djux.i();
                ((djur) i2).e = Optional.ofNullable(this.b.l);
                djxs.am(i2, r);
                this.b.F.b(i2.a(), i);
            }
            this.b.L(djta.MSG_SEND_CONFIG_REQUEST, i.j());
        } catch (MalformedURLException e) {
            djxs djxsVar4 = this.b;
            djxsVar4.an(djta.MSG_EXCEPTION_CAUGHT, djxsVar4.k);
            this.b.F(ezez.RCS_PROVISIONING_VERIFY_OTP_STATE);
            this.b.z.e("Failed to verify OTP. When building query %s", dktx.URI.c(e));
            this.b.E(ezez.RCS_PROVISIONING_VERIFY_OTP_STATE);
        }
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "VerifyOtpState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        this.a = ((dkdw) this.b.M.b()).l(this.b.h);
        super.b();
        this.b.y(ezdc.VERIFY_OTP_STAGE);
        String str = this.a;
        if (str == null || !str.equals("ReadyState")) {
            return;
        }
        djxs djxsVar = this.b;
        cmbc c = djxsVar.u.c(djxsVar.h);
        if ((c.b & 1) != 0) {
            r(c.c);
        }
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_VERIFY_OTP;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_VERIFY_OTP_STATE;
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.b.D("VerifyOtpState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 4) {
            this.b.av(message.arg1);
            return false;
        }
        if (ordinal != 22) {
            if (ordinal != 24) {
                if (ordinal == 29) {
                    r(djxs.o(message));
                    return true;
                }
                switch (ordinal) {
                    case 40:
                    case 42:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case 50:
                        break;
                    case 41:
                        q();
                        ((dkdw) this.b.M.b()).x(this.b.h, null);
                        this.b.H((HttpURLConnection) message.obj, message.arg2, this);
                        return true;
                    case 43:
                        q();
                        break;
                    case 44:
                        return false;
                    default:
                        return super.o(message, djtaVar);
                }
            }
            this.b.ar(32);
            ((dkdw) this.b.M.b()).x(this.b.h, null);
            return false;
        }
        this.b.ar(34);
        this.b.ar(32);
        ((dkdw) this.b.M.b()).x(this.b.h, null);
        return false;
    }
}
