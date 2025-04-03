package defpackage;

import android.os.Message;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwq extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwq(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q(final ezck ezckVar) {
        djxs djxsVar = this.a;
        dkdv dkdvVar = djxsVar.v;
        Optional of = Optional.of(djxsVar.h);
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        dkdvVar.r(new dkdu() { // from class: dkdj
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.n = ezck.this.d;
                ezcqVar.b |= 1024;
            }
        }, dkdvVar.e(of));
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithMsisdnState";
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x029a  */
    @Override // defpackage.djxb, defpackage.dixy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djwq.b():void");
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
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
        Optional empty;
        this.a.D("RequestWithMsisdnState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal == 4) {
            this.a.av(message.arg1);
            return false;
        }
        if (ordinal == 7) {
            this.a.x(djxs.ak(message), message.arg1, message.arg2, message.obj);
            dksy.i(this.a.m);
            return true;
        }
        if (ordinal == 22) {
            this.a.ar(34);
            return false;
        }
        if (ordinal == 24) {
            this.a.ar(32);
            return false;
        }
        InputStream inputStream = null;
        if (ordinal == 46) {
            this.a.p.a((HttpURLConnection) message.obj, null, "RequestWithMsisdnState");
            this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 401);
            if (!djai.Z()) {
                return false;
            }
            this.a.u.p(null);
            djxs djxsVar = this.a;
            djxsVar.R(djxsVar.al);
            return true;
        }
        switch (ordinal) {
            case 41:
                HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
                int i = message.arg2;
                try {
                    try {
                        try {
                            inputStream = httpURLConnection.getInputStream();
                            this.a.w(djta.MSG_CONFIG_DOC, this.a.y.a(inputStream));
                            djxs djxsVar2 = this.a;
                            djxsVar2.D.c(djxsVar2.h);
                            djxs djxsVar3 = this.a;
                            djxsVar3.R(djxsVar3.aw);
                        } catch (IOException unused) {
                            djxs djxsVar4 = this.a;
                            djxsVar4.p.d(djxsVar4.h, httpURLConnection);
                            djxs djxsVar5 = this.a;
                            djxsVar5.D.c(djxsVar5.h);
                            djxs djxsVar6 = this.a;
                            djxsVar6.R(djxsVar6.an);
                        }
                    } catch (dkbs e) {
                        this.a.an(djta.MSG_EXCEPTION_CAUGHT, i);
                        this.a.aq(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 4);
                        this.a.z.f(e, "Failed to parse configuration.", new Object[0]);
                        this.a.E(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
                    }
                    return true;
                } finally {
                    this.a.p.a(httpURLConnection, inputStream, "RequestWithMsisdnState");
                }
            case 42:
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) message.obj;
                InputStream errorStream = httpURLConnection2.getErrorStream();
                Configuration configuration = new Configuration();
                configuration.mType = 2;
                configuration.mValiditySecs = 0;
                configuration.mVersion = 0;
                djxs djxsVar7 = this.a;
                djxsVar7.u.t(djxsVar7.h, configuration);
                this.a.p.a(httpURLConnection2, errorStream, "RequestWithMsisdnState");
                this.a.au(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, 403);
                djxs djxsVar8 = this.a;
                djxsVar8.R(djxsVar8.ae);
                return true;
            case 44:
                djxs djxsVar9 = this.a;
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) message.obj;
                if ("?1".equals(httpURLConnection3.getHeaderField("DEVICE_THROTTLED"))) {
                    String str = djxsVar9.h;
                    djva djvaVar = djxsVar9.D;
                    cmay b = djvaVar.b.b(str);
                    Optional b2 = djvaVar.b(b);
                    if (b2.isPresent() && (((cmax) b2.get()).b & 2) == 0) {
                        String headerField = httpURLConnection3.getHeaderField("Retry-After");
                        ((ensz) ((ensz) djva.a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 151, "ForcePhoneNumberVerificationUtil.java")).t("Force verification request otp throttled. Retry-after value: %s", headerField);
                        if (emxe.c(headerField)) {
                            empty = Optional.empty();
                        } else {
                            try {
                                empty = Optional.of(eykm.f(Integer.parseInt(headerField)));
                            } catch (NumberFormatException e2) {
                                ((ensz) ((ensz) ((ensz) djva.a.i()).g(e2)).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "getRetryAfterTimestamp", 160, "ForcePhoneNumberVerificationUtil.java")).t("Exception parsing Retry-After field: %s", headerField);
                                empty = Optional.empty();
                            }
                        }
                        djvaVar.b.q(str, djvaVar.a(b, cmau.OTP_FORCE_VERIFICATION_THROTTLED, empty));
                        ((ensz) ((ensz) djva.a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfThrottledResponse", 142, "ForcePhoneNumberVerificationUtil.java")).q("Received throttled response for force verification request. Storing record.");
                    }
                }
                if (this.a.T()) {
                    djxs djxsVar10 = this.a;
                    djxsVar10.E.b(djxsVar10.h, ezck.SIM, djxsVar10.l, cmau.OTP_THROTTLED);
                }
                break;
            case 43:
                return false;
            default:
                return super.o(message, djtaVar);
        }
    }
}
