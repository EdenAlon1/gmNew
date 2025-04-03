package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.PhoneNumberVerification;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberResponse;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxe extends djxb {
    final /* synthetic */ djxs a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxe(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
        this.b = 0;
    }

    public static final int v(int i) {
        switch (i) {
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 10;
            case 5:
                return 14;
            case 6:
                return 12;
            case 7:
                return 11;
            case 8:
                return 13;
            default:
                return 7;
        }
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "VerifyMsisdnState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        dhre b;
        boolean R;
        String x;
        VerifyPhoneNumberRequest a;
        super.b();
        this.a.y(ezdc.VERIFY_MSISDN_STAGE);
        this.a.z.a("UPI - calling verifyPhoneNumber API", new Object[0]);
        this.a.ar(54);
        this.b++;
        djxs djxsVar = this.a;
        dkcp dkcpVar = djxsVar.u;
        String str = djxsVar.l;
        String r = r();
        String p = djxsVar.p();
        String q = q();
        int d = djai.d();
        String str2 = djxsVar.h;
        djxsVar.n.m(djxsVar.m, str, r, p, q, d, dkcpVar.a(str2), new djro(str2));
        djxs djxsVar2 = this.a;
        String b2 = emxe.b(djxsVar2.l);
        String b3 = emxe.b(djxsVar2.u.n(djxsVar2.h));
        djxs djxsVar3 = this.a;
        djva djvaVar = djxsVar3.D;
        djyf djyfVar = djxsVar2.B;
        dfpi dfpiVar = djyfVar.a;
        Context context = djxsVar2.m;
        boolean d2 = djvaVar.d(djxsVar3.h);
        if (dfpiVar.i(context, 204390000) == 0) {
            Optional a2 = djyf.a(context);
            if (a2.isEmpty()) {
                b = dhrt.b(new djye());
            } else {
                djxs djxsVar4 = this.a;
                String str3 = djxsVar2.j;
                dfzs dfzsVar = new dfzs(context);
                Object obj = a2.get();
                djup djupVar = djyfVar.d;
                dfzw dfzwVar = new dfzw();
                dfzwVar.a = (String) obj;
                int i = eodh.a;
                dfzwVar.b = eodf.a.c(a.w(str3, b2, "."), StandardCharsets.UTF_8).toString();
                IdTokenRequest a3 = dfzwVar.a();
                Bundle bundle = new Bundle();
                bundle.putString("session_id", b2);
                bundle.putString("required_consumer_consent", "RCS");
                cguo cguoVar = djyfVar.b;
                String str4 = djxsVar4.h;
                int a4 = ewil.a(cguoVar.c(str4).G);
                if (a4 == 0) {
                    a4 = 1;
                }
                if (a4 == 6) {
                    bundle.putString("one_time_verification", "True");
                }
                if (((ersq) ((divb) djyfVar.e).a.b()).a("cslib.enable_one_time_verification_for_ts43_carrier_tos_provisioning")) {
                    boolean z = djyfVar.b.c(str4).n;
                    if (a4 == 5 && !z) {
                        bundle.putString("one_time_verification", "True");
                    }
                }
                if (djai.z() && djai.ab()) {
                    R = a4 == 5;
                    x = djyfVar.b.d(str4).b;
                } else {
                    R = djai.R();
                    x = djai.x();
                }
                if (dkvy.d(context)) {
                    bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI_IN_SETTINGS");
                } else {
                    if ((djai.z() && djai.ac()) ? djyfVar.c.a(str4) : djai.G()) {
                        int a5 = djupVar.a().a();
                        if (a5 == 1) {
                            bundle.putString("consent_type", "RCS_DEFAULT_ON_LEGAL_FYI");
                        } else if (a5 == 2) {
                            bundle.putString("consent_type", "RCS_DEFAULT_ON_OUT_OF_BOX");
                        }
                    }
                }
                if (!R) {
                    bundle.putString("IMSI", str3);
                    if (djyfVar.b.c(str4).H) {
                        dgab dgabVar = new dgab();
                        dgabVar.a = x;
                        dgabVar.b = a3;
                        dgabVar.c = bundle;
                        dgabVar.b();
                        a = dgabVar.a();
                    } else {
                        dgab dgabVar2 = new dgab();
                        dgabVar2.a = x;
                        dgabVar2.b = a3;
                        dgabVar2.c = bundle;
                        a = dgabVar2.a();
                    }
                } else {
                    if (str3 == null) {
                        throw new IllegalStateException("IMSI is required");
                    }
                    List singletonList = Collections.singletonList(new ImsiRequest(str3, b3));
                    if (d2) {
                        bundle.putString("force_provisioning", "true");
                    }
                    dgab dgabVar3 = new dgab();
                    dgabVar3.a = x;
                    dgabVar3.b = a3;
                    dgabVar3.c = bundle;
                    dgabVar3.d = singletonList;
                    dgabVar3.b();
                    a = dgabVar3.a();
                }
                b = dfzsVar.a(a);
            }
        } else {
            b = dhrt.b(new djyd());
        }
        b.q(this.a.w, new dhqy() { // from class: djxc
            @Override // defpackage.dhqy
            public final void e(Object obj2) {
                VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) obj2;
                djxe djxeVar = djxe.this;
                Optional of = ((Boolean) djuy.a.a()).booleanValue() ? Optional.of(((dkdw) djxeVar.a.M.b()).f(djxeVar.a.h)) : Optional.empty();
                PhoneNumberVerification[] phoneNumberVerificationArr = verifyPhoneNumberResponse.a;
                int length = phoneNumberVerificationArr.length;
                if (length != 1) {
                    djxeVar.a.z.e("UPI - expected 1 verification, instead verified %d numbers", Integer.valueOf(length));
                    int i2 = length != 0 ? 5 : 4;
                    djxs djxsVar5 = djxeVar.a;
                    String str5 = djxsVar5.l;
                    String r2 = djxeVar.r();
                    String p2 = djxeVar.a.p();
                    String q2 = djxeVar.q();
                    djxs djxsVar6 = djxeVar.a;
                    dkcp dkcpVar2 = djxsVar6.u;
                    Optional empty = Optional.empty();
                    int d3 = djai.d();
                    String str6 = djxsVar6.h;
                    djxsVar5.n.u(djxsVar5.m, str5, r2, p2, q2, i2, false, empty, d3, dkcpVar2.a(str6), new djro(str6), Optional.empty(), of);
                    djxeVar.s(false);
                }
                PhoneNumberVerification phoneNumberVerification = phoneNumberVerificationArr[0];
                if (!((Boolean) djai.t().a.aw.a()).booleanValue()) {
                    djxeVar.a.z.a("UPI - verification timestampMillis = %d, verificationMethod = %d", Long.valueOf(phoneNumberVerification.b), Integer.valueOf(phoneNumberVerification.c));
                    djxeVar.u(phoneNumberVerification.e, of);
                    return;
                }
                int i3 = phoneNumberVerification.g;
                djxeVar.a.z.a("UPI - verification timestampMillis = %d, verificationMethod = %d, verificationStatus = %d, retryAfterSeconds = %d", Long.valueOf(phoneNumberVerification.b), Integer.valueOf(phoneNumberVerification.c), Integer.valueOf(i3), Long.valueOf(phoneNumberVerification.h));
                switch (i3) {
                    case 1:
                        if (((Boolean) djuy.a.a()).booleanValue()) {
                            ((dkdw) djxeVar.a.M.b()).D(djxeVar.a.h, esgg.ELIGIBLE);
                            of = Optional.of(esgg.ELIGIBLE);
                        }
                        djxeVar.u(phoneNumberVerification.e, of);
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        djxs djxsVar7 = djxeVar.a;
                        String str7 = djxsVar7.l;
                        String r3 = djxeVar.r();
                        String p3 = djxeVar.a.p();
                        String q3 = djxeVar.q();
                        int v = djxe.v(i3);
                        djxs djxsVar8 = djxeVar.a;
                        dkcp dkcpVar3 = djxsVar8.u;
                        String str8 = djxsVar8.h;
                        djxsVar7.n.u(djxsVar7.m, str7, r3, p3, q3, v, true, Optional.empty(), djai.d(), dkcpVar3.a(str8), new djro(str8), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), of);
                        if (!((Boolean) djxs.d.a()).booleanValue()) {
                            djxeVar.t();
                            break;
                        } else {
                            long j = phoneNumberVerification.h;
                            if (j > 0) {
                                djxeVar.a.z.d("UPI - retryable verifyPhoneNumber failure with retry after seconds %d", Long.valueOf(j));
                                djxeVar.a.ar(56);
                                dkdw dkdwVar = (dkdw) djxeVar.a.M.b();
                                djxs djxsVar9 = djxeVar.a;
                                dkdwVar.C(djxsVar9.h, djxsVar9.L.f().plusSeconds(j));
                                djxeVar.n(djxeVar.a.al, ezez.RCS_PROVISIONING_RETRY_STATE);
                                break;
                            } else if (j != 0) {
                                djxeVar.t();
                                break;
                            } else {
                                djxeVar.n(djxeVar.a.ad, ezez.RCS_PROVISIONING_ENABLED_STATE);
                                break;
                            }
                        }
                    case 7:
                        djxs djxsVar10 = djxeVar.a;
                        String str9 = djxsVar10.l;
                        String r4 = djxeVar.r();
                        String p4 = djxeVar.a.p();
                        String q4 = djxeVar.q();
                        int v2 = djxe.v(i3);
                        djxs djxsVar11 = djxeVar.a;
                        dkcp dkcpVar4 = djxsVar11.u;
                        String str10 = djxsVar11.h;
                        djxsVar10.n.u(djxsVar10.m, str9, r4, p4, q4, v2, false, Optional.empty(), djai.d(), dkcpVar4.a(str10), new djro(str10), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), of);
                        djxeVar.s(true);
                        break;
                    case 8:
                        if (((Boolean) djuy.a.a()).booleanValue()) {
                            ((dkdw) djxeVar.a.M.b()).D(djxeVar.a.h, esgg.INELIGIBLE);
                            of = Optional.of(esgg.INELIGIBLE);
                        }
                        djxeVar.u(phoneNumberVerification.e, of);
                        break;
                    default:
                        djxeVar.a.z.a("UPI - Unrecognized VerificationStatus from calling verifyPhoneNumber: %d", Integer.valueOf(phoneNumberVerification.g));
                        djxs djxsVar12 = djxeVar.a;
                        String str11 = djxsVar12.l;
                        String r5 = djxeVar.r();
                        String p5 = djxeVar.a.p();
                        String q5 = djxeVar.q();
                        int v3 = djxe.v(i3);
                        djxs djxsVar13 = djxeVar.a;
                        dkcp dkcpVar5 = djxsVar13.u;
                        String str12 = djxsVar13.h;
                        djxsVar12.n.u(djxsVar12.m, str11, r5, p5, q5, v3, true, Optional.empty(), djai.d(), dkcpVar5.a(str12), new djro(str12), Optional.of(Integer.valueOf((int) phoneNumberVerification.h)), of);
                        break;
                }
            }
        });
        b.p(this.a.w, new dhqv() { // from class: djxd
            @Override // defpackage.dhqv
            public final void d(Exception exc) {
                Optional optional;
                int i2;
                boolean z2;
                String message = exc.getMessage();
                djxe djxeVar = djxe.this;
                boolean z3 = true;
                djxeVar.a.z.e("UPI - verifyPhoneNumber API returned an exception: %s", message);
                Optional empty = Optional.empty();
                Optional of = ((Boolean) djuy.a.a()).booleanValue() ? Optional.of(((dkdw) djxeVar.a.M.b()).f(djxeVar.a.h)) : Optional.empty();
                int i3 = 7;
                if (exc instanceof dfqu) {
                    int a6 = ((dfqu) exc).a();
                    Optional of2 = Optional.of(Integer.valueOf(a6));
                    if (a6 != 7 && a6 != 8 && a6 != 20 && a6 != 5002) {
                        z3 = false;
                    }
                    optional = of2;
                    z2 = z3;
                    i2 = 6;
                } else {
                    if (exc instanceof djyd) {
                        i3 = 2;
                    } else if (exc instanceof djye) {
                        i3 = 3;
                    }
                    optional = empty;
                    i2 = i3;
                    z2 = false;
                }
                djxs djxsVar5 = djxeVar.a;
                String str5 = djxsVar5.l;
                String r2 = djxeVar.r();
                String p2 = djxeVar.a.p();
                String q2 = djxeVar.q();
                djxs djxsVar6 = djxeVar.a;
                dkcp dkcpVar2 = djxsVar6.u;
                int d3 = djai.d();
                String str6 = djxsVar6.h;
                djxsVar5.n.u(djxsVar5.m, str5, r2, p2, q2, i2, z2, optional, d3, dkcpVar2.a(str6), new djro(str6), Optional.empty(), of);
                if (z2) {
                    djxeVar.t();
                } else {
                    djxeVar.s(false);
                }
            }
        });
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_VERIFY_MSISDN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
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
        return super.o(message, djtaVar);
    }

    public final String q() {
        String str = this.a.j;
        return str.substring(0, Math.min(str.length(), 6));
    }

    public final String r() {
        return String.format(Locale.US, "%s-%d", this.a.l, Integer.valueOf(this.b));
    }

    public final void s(boolean z) {
        this.a.ar(56);
        if (!this.a.ai()) {
            if (djai.B()) {
                this.a.z.d("UPI - non-retryable verifyPhoneNumber failure, fallback to non-UPI is disabled", new Object[0]);
                n(this.a.al, ezez.RCS_PROVISIONING_RETRY_STATE);
                return;
            } else {
                this.a.z.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI", new Object[0]);
                djxb h = this.a.h();
                n(h, h.g());
                return;
            }
        }
        if (!z || (((dixj) this.a.ab.b()).a() && dkvy.d(this.a.m))) {
            this.a.z.d("UPI - non-retryable verifyPhoneNumber failure, falling back to non-UPI is removed", new Object[0]);
            n(this.a.al, ezez.RCS_PROVISIONING_RETRY_STATE);
        } else {
            this.a.z.d("UPI - Transitioning into WaitingForManualMsisdnEntryState", new Object[0]);
            n(this.a.ax, ezez.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE);
        }
    }

    public final void t() {
        this.a.z.d("UPI - retryable verifyPhoneNumber failure", new Object[0]);
        this.a.ar(56);
        n(this.a.am, ezez.RCS_PROVISIONING_REPLAY_REQUEST_STATE);
    }

    public final void u(String str, Optional optional) {
        this.a.z.a("UPI - successfully verified phone number", new Object[0]);
        this.a.ar(55);
        djxs djxsVar = this.a;
        dkcp dkcpVar = djxsVar.u;
        String str2 = djxsVar.l;
        String r = r();
        String p = djxsVar.p();
        String q = q();
        int d = djai.d();
        String str3 = djxsVar.h;
        djxsVar.n.n(djxsVar.m, str2, r, p, q, d, dkcpVar.a(str3), new djro(str3), optional);
        djxs djxsVar2 = this.a;
        try {
            djxsVar2.u.b.j("msisdn_token_for_sim_".concat(String.valueOf(djxsVar2.h)), str, "bugle");
        } catch (dksb e) {
            dkty.j(e, dkcp.a, "Error while putting MSISDN token into bugle storage", new Object[0]);
        }
        n(this.a.aj, ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE);
        this.a.L(djta.MSG_VERIFY_NUMBER_SUCCESS, str);
    }
}
