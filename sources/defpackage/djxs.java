package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxs {
    public static final diyy a = diyv.b("enable_available_msisdn_source_logging");
    public static final diyy b = diyv.b("enable_broadcast_phone_number_input_request_for_testing");
    public static final diyy c = diyv.b("crash_on_unexpected_message_code");
    public static final diyy d = diyv.b("use_retry_after_header_to_schedule_retry");
    public static final enru e = enru.c("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine");
    public static final Duration f = Duration.ofDays(30);
    public final djun A;
    public final djyf B;
    public final djyc C;
    public final djva D;
    public final djvi E;
    public final djuz F;
    public final boolean G;
    public cosz H;
    public final cort I;
    public final djup J;
    public Optional K;
    public final dlpw L;
    public final ffbr M;
    public final ffbr N;
    public final boolean O;
    public final ffbr P;
    public final diyb Q;
    public final djyt R;
    public final ffbr S;
    public final ffbr T;
    public final ffbr U;
    public final ffbr V;
    public eqws W;
    public String X;
    public final cguo Y;
    public final ffbr Z;
    final djxb aA;
    final djxb aB;
    public final djuo aC;
    private final djxy aD;
    private final dked aE;
    private final csjk aF;
    private final Optional aG;
    private final csjk aH;
    private final cgud aI;
    public final ffbr aa;
    public final ffbr ab;
    public final Optional ac;
    final djxb ad;
    final djxb ae;
    final djxb af;
    final djxb ag;
    final djxb ah;
    final djxe ai;
    final djwr aj;
    final djxb ak;
    final djxb al;
    final djxb am;
    final djxb an;
    final djxb ao;
    final djxb ap;
    final djxb aq;
    final djxb ar;
    final djxb as;
    final djxb at;
    final djxb au;
    final djxb av;
    final djxb aw;
    final djxb ax;
    final djxb ay;
    final djxb az;
    final Map g;
    public final String h;
    public final int i;
    public final String j;
    public int k;
    public String l;
    public final Context m;
    public final dikl n;
    public final Optional o;
    public final djvo p;
    public final djxv q;
    public final dkpm r;
    public final djvk s;
    public final Optional t;
    public final dkcp u;
    public final dkdv v;
    public final errl w;
    public final ctvb x;
    public final djtu y;
    public djvf z;

    public djxs(Context context, dikl diklVar, djxy djxyVar, Optional optional, djvo djvoVar, djxv djxvVar, dkpm dkpmVar, djvk djvkVar, Optional optional2, dkcp dkcpVar, dkdv dkdvVar, errl errlVar, ctvb ctvbVar, dked dkedVar, dfpi dfpiVar, ctwb ctwbVar, djtu djtuVar, djun djunVar, djuo djuoVar, djyf djyfVar, djyc djycVar, csjk csjkVar, Optional optional3, djva djvaVar, djvi djviVar, djuz djuzVar, boolean z, Optional optional4, cort cortVar, djup djupVar, csjk csjkVar2, cguo cguoVar, cgud cgudVar, ffsk ffskVar, ffhd ffhdVar, errl errlVar2, dhvo dhvoVar, dlpw dlpwVar, ffbr ffbrVar, ffbr ffbrVar2, boolean z2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, Optional optional5) {
        djwu djwuVar;
        cosz coszVar;
        HashMap hashMap = new HashMap();
        this.g = hashMap;
        this.k = 0;
        this.W = eqws.UNDEFINED_TRIGGER_EVENT;
        this.X = "";
        djwe djweVar = new djwe(this);
        this.ad = djweVar;
        djwc djwcVar = new djwc(this);
        this.ae = djwcVar;
        djvx djvxVar = new djvx(this);
        this.af = djvxVar;
        djwm djwmVar = new djwm(this);
        this.ag = djwmVar;
        djwk djwkVar = new djwk(this);
        this.ah = djwkVar;
        djxe djxeVar = new djxe(this);
        this.ai = djxeVar;
        djwr djwrVar = new djwr(this);
        this.aj = djwrVar;
        djwp djwpVar = new djwp(this);
        this.ak = djwpVar;
        djwu djwuVar2 = new djwu(this);
        this.al = djwuVar2;
        djwn djwnVar = new djwn(this);
        this.am = djwnVar;
        djxn djxnVar = new djxn(this);
        this.an = djxnVar;
        djxf djxfVar = new djxf(this);
        this.ao = djxfVar;
        djwt djwtVar = new djwt(this);
        this.ap = djwtVar;
        djws djwsVar = new djws(this);
        this.aq = djwsVar;
        djwo djwoVar = new djwo(this);
        this.ar = djwoVar;
        djwa djwaVar = new djwa(this);
        this.as = djwaVar;
        djwq djwqVar = new djwq(this);
        this.at = djwqVar;
        djxj djxjVar = new djxj(this);
        this.au = djxjVar;
        djxr djxrVar = new djxr(this);
        this.av = djxrVar;
        djwl djwlVar = new djwl(this);
        this.aw = djwlVar;
        djxm djxmVar = new djxm(this);
        this.ax = djxmVar;
        djwy djwyVar = new djwy(this);
        this.ay = djwyVar;
        djwh djwhVar = new djwh(this);
        this.az = djwhVar;
        djxp djxpVar = new djxp(this);
        this.aA = djxpVar;
        djxh djxhVar = new djxh(this);
        this.aB = djxhVar;
        this.m = context;
        this.n = diklVar;
        this.aD = djxyVar;
        this.o = optional;
        this.p = djvoVar;
        this.q = djxvVar;
        this.r = dkpmVar;
        this.T = ffbrVar5;
        this.U = ffbrVar6;
        this.V = ffbrVar7;
        this.aa = ffbrVar9;
        if (z) {
            cosz coszVar2 = (cosz) optional4.orElseThrow();
            this.H = coszVar2;
            djwuVar = djwuVar2;
            this.h = coszVar2.c;
            this.i = coszVar2.d;
            this.j = coszVar2.f;
        } else {
            djwuVar = djwuVar2;
            this.h = dkpmVar.f();
            this.i = dkpmVar.b();
            this.j = dkpmVar.e();
        }
        this.s = djvkVar;
        this.t = optional2;
        this.u = dkcpVar;
        this.v = dkdvVar;
        this.w = errlVar;
        this.x = ctvbVar;
        this.aE = dkedVar;
        this.K = Optional.empty();
        this.y = djtuVar;
        this.A = djunVar;
        this.aC = djuoVar;
        this.B = djyfVar;
        this.M = ffbrVar;
        this.N = ffbrVar2;
        this.ab = ffbrVar10;
        this.l = ((dkdw) ffbrVar.b()).k(this.h);
        Optional ofNullable = Optional.ofNullable((!z || (coszVar = this.H) == null) ? null : coszVar.p);
        cost a2 = cortVar.a();
        this.z = new djvf(this.l, Optional.of(new djve(ofNullable, this.i, this.h.equals(a2.c), this.h.equals(a2.d), this.h.equals(a2.e))));
        if (ffskVar == null) {
            throw new NullPointerException("Null blockingScope");
        }
        if (ffhdVar == null) {
            throw new NullPointerException("Null blockingContext");
        }
        djyx djyxVar = new djyx(ffskVar, ffhdVar, djweVar, djwcVar, djvxVar, djwmVar, djwkVar, djxeVar, djwrVar, djwpVar, djwuVar, djwnVar, djxnVar, djxfVar, djwtVar, djwsVar, djwoVar, djwaVar, djwqVar, djxjVar, djxrVar, djwlVar, djxmVar, djwyVar, djwhVar, djxpVar, djxhVar);
        enhd enhdVar = new enhd();
        enhdVar.k(ezez.RCS_PROVISIONING_ENABLED_STATE, djyxVar.d);
        enhdVar.k(ezez.RCS_PROVISIONING_DISABLED_STATE, djyxVar.e);
        enhdVar.k(ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, djyxVar.f);
        enhdVar.k(ezez.RCS_PROVISIONING_READY_STATE, djyxVar.g);
        enhdVar.k(ezez.RCS_PROVISIONING_IN_PROGRESS_STATE, djyxVar.h);
        enhdVar.k(ezez.RCS_PROVISIONING_VERIFY_MSISDN_STATE, djyxVar.i);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE, djyxVar.j);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, djyxVar.k);
        enhdVar.k(ezez.RCS_PROVISIONING_RETRY_STATE, djyxVar.l);
        enhdVar.k(ezez.RCS_PROVISIONING_REPLAY_REQUEST_STATE, djyxVar.m);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, djyxVar.n);
        enhdVar.k(ezez.RCS_PROVISIONING_VERIFY_OTP_STATE, djyxVar.o);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, djyxVar.p);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, djyxVar.q);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, djyxVar.r);
        enhdVar.k(ezez.RCS_PROVISIONING_CONFIGURED_STATE, djyxVar.s);
        enhdVar.k(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, djyxVar.t);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE, djyxVar.u);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, djyxVar.v);
        enhdVar.k(ezez.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, djyxVar.w);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE, djyxVar.x);
        enhdVar.k(ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE, djyxVar.y);
        enhdVar.k(ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE, djyxVar.z);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE, djyxVar.A);
        enhdVar.k(ezez.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE, djyxVar.B);
        enhk c2 = enhdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k(ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, ezez.RCS_PROVISIONING_ENABLED_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_READY_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_VERIFY_MSISDN_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_OTP_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_VERIFY_OTP_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITH_HE_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        enhdVar2.k(ezez.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE, ezez.RCS_PROVISIONING_IN_PROGRESS_STATE);
        djyt djytVar = new djyt(c2, enhdVar2.c(), djyxVar.b, djyxVar.c);
        this.R = djytVar;
        this.C = djycVar;
        this.aF = csjkVar;
        this.aG = optional3;
        this.D = djvaVar;
        this.E = djviVar;
        this.F = djuzVar;
        this.G = z;
        this.I = cortVar;
        this.J = djupVar;
        this.aH = csjkVar2;
        this.Y = cguoVar;
        this.aI = cgudVar;
        diyb djvvVar = djytVar.k() ? new djvv(this) : new djvw();
        this.Q = djvvVar;
        this.L = dlpwVar;
        this.O = z2;
        this.P = ffbrVar3;
        this.S = ffbrVar4;
        this.Z = ffbrVar8;
        this.ac = optional5;
        dksy.e(context, dkpmVar, dfpiVar, ctwbVar, errlVar2, dhvoVar);
        hashMap.put("EnabledState", djweVar);
        hashMap.put("DisabledState", djwcVar);
        hashMap.put("CheckPreconditionsState", djvxVar);
        hashMap.put("InProgressState", djwkVar);
        hashMap.put("ReadyState", djwmVar);
        hashMap.put("VerifyMsisdnState", djxeVar);
        hashMap.put("RequestWithMsisdnTokenState", djwrVar);
        hashMap.put("RequestWithImsiState", djwpVar);
        djwu djwuVar3 = djwuVar;
        hashMap.put("RetryState", djwuVar3);
        hashMap.put("ReplayRequestState", djwnVar);
        hashMap.put("RequestWithoutAuthState", djwtVar);
        hashMap.put("RequestWithTokenState", djwsVar);
        hashMap.put("RequestWithHeState", djwoVar);
        hashMap.put("WaitingForOtpState", djxnVar);
        hashMap.put("VerifyOtpState", djxfVar);
        hashMap.put("ConfiguredState", djwaVar);
        hashMap.put("RequestWithMsisdnState", djwqVar);
        hashMap.put("WaitingForGoogleTosState", djxjVar);
        hashMap.put("WaitingForTermsAndConditionsState", djxrVar);
        hashMap.put("ProcessConfigurationState", djwlVar);
        hashMap.put("WaitingForManualMsisdnEntryState", djxmVar);
        hashMap.put("SetGoogleToSConsentState", djwyVar);
        hashMap.put("GetGoogleToSConsentState", djwhVar);
        hashMap.put("WaitingForRcsDefaultOnState", djxpVar);
        if (djytVar.k()) {
            djvvVar.e(djweVar);
            djvvVar.f(djvxVar, djweVar);
            djvvVar.f(djxjVar, djvxVar);
            djvvVar.f(djwyVar, djvxVar);
            djvvVar.f(djwhVar, djvxVar);
            djvvVar.f(djxpVar, djvxVar);
            djvvVar.f(djxhVar, djvxVar);
            djvvVar.e(djwcVar);
            djvvVar.e(djwkVar);
            djvvVar.e(djwuVar3);
            djvvVar.e(djwnVar);
            djvvVar.e(djwaVar);
            djvvVar.f(djwmVar, djwkVar);
            djvvVar.f(djxeVar, djwkVar);
            djvvVar.f(djwrVar, djwkVar);
            djvvVar.f(djwpVar, djwkVar);
            djvvVar.f(djxnVar, djwkVar);
            djvvVar.f(djxfVar, djwkVar);
            djvvVar.f(djwtVar, djwkVar);
            djvvVar.f(djwsVar, djwkVar);
            djvvVar.f(djwoVar, djwkVar);
            djvvVar.f(djwqVar, djwkVar);
            djvvVar.f(djxrVar, djwkVar);
            djvvVar.f(djwlVar, djwkVar);
            djvvVar.f(djxmVar, djwkVar);
        }
        this.z.a("Creating PEv2. SIM id %s", dktx.SIM_ID.c(this.h));
        O(djweVar);
        String l = ((dkdw) ffbrVar.b()).l(this.h);
        if (!TextUtils.isEmpty(l)) {
            this.z.a("Saved provisioning state is %s", l);
            djxb djxbVar = (djxb) hashMap.get(l);
            if (djxbVar != null && djxbVar.i()) {
                this.z.a("Restoring initial state to %s", l);
                this.l = ((dkdw) ffbrVar.b()).i(this.h);
                this.z = new djvf(this.l, Optional.empty());
                ((dkdw) ffbrVar.b()).u(this.h, false);
                ((dkdw) ffbrVar.b()).B(this.h, null);
                return;
            }
        }
        this.z.a("Setting initial state to enabled", new Object[0]);
        O(djweVar);
    }

    public static final djta ak(Message message) {
        djta djtaVar;
        int i = message.what;
        if (i == -20000) {
            djtaVar = djta.MSG_FORCE_TRANSITION_NOW;
        } else if (i == 3000) {
            djtaVar = djta.MSG_USE_ANDROID_OS_MESSAGE;
        } else if (i == 0) {
            djtaVar = djta.MSG_UNKNOWN_DO_NOT_USE;
        } else if (i == 1) {
            djtaVar = djta.MSG_RCS_AVAILABILITY_UPDATED;
        } else if (i == 2) {
            djtaVar = djta.MSG_PROVISIONING_REQUESTED;
        } else if (i == 3) {
            djtaVar = djta.MSG_SIM_EVENT;
        } else if (i == 2000) {
            djtaVar = djta.MSG_ARG_TRANSITION_MSG;
        } else if (i != 2001) {
            switch (i) {
                case 5:
                    djtaVar = djta.MSG_HTTP_RESPONSE;
                    break;
                case 6:
                    djtaVar = djta.MSG_CONSENT_GRANTED;
                    break;
                case 7:
                    djtaVar = djta.MSG_SEND_CONFIG_REQUEST;
                    break;
                case 8:
                    djtaVar = djta.MSG_RECEIVED_OTP;
                    break;
                case 9:
                    djtaVar = djta.MSG_TIMEOUT;
                    break;
                case 10:
                    djtaVar = djta.MSG_EXCEPTION_CAUGHT;
                    break;
                case 11:
                    djtaVar = djta.MSG_RETRY_AFTER;
                    break;
                case 12:
                    djtaVar = djta.MSG_REFRESH_CONFIG;
                    break;
                case 13:
                    djtaVar = djta.MSG_CONFIG_DOC;
                    break;
                case 14:
                    djtaVar = djta.MSG_RETRY_PROVISIONING;
                    break;
                case 15:
                    djtaVar = djta.MSG_VERIFY_NUMBER_SUCCESS;
                    break;
                case 16:
                    djtaVar = djta.MSG_VERIFY_NUMBER_FAILURE;
                    break;
                case 17:
                    djtaVar = djta.MSG_GOOGLE_TOS_ACCEPTED;
                    break;
                default:
                    switch (i) {
                        case 19:
                            djtaVar = djta.MSG_T_AND_C_ACCEPTED;
                            break;
                        case 20:
                            djtaVar = djta.MSG_T_AND_C_REJECTED;
                            break;
                        case 21:
                            djtaVar = djta.MSG_BOEW_GRANTED;
                            break;
                        case 22:
                            djtaVar = djta.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK;
                            break;
                        case 23:
                            djtaVar = djta.MSG_MOBILE_NETWORK_NOT_AVAILABLE;
                            break;
                        case 24:
                            djtaVar = djta.MSG_HTTP_IO_EXCEPTION;
                            break;
                        case 25:
                            djtaVar = djta.MSG_MSISDN_RECEIVED;
                            break;
                        case 26:
                            djtaVar = djta.MSG_SOCKET_TIMEOUT_EXCEPTION;
                            break;
                        case 27:
                            djtaVar = djta.MSG_RECONFIGURATION_REQUIRED;
                            break;
                        case 28:
                            djtaVar = djta.MSG_REPLAY_REQUEST;
                            break;
                        case 29:
                            djtaVar = djta.MSG_OTP_TIMEOUT;
                            break;
                        case 30:
                            djtaVar = djta.MSG_GOOGLE_TOS_DECLINED;
                            break;
                        case 31:
                            djtaVar = djta.MSG_VERIFY_OTP;
                            break;
                        case 32:
                            djtaVar = djta.MSG_CONFIG_DOC_DISABLE_RCS;
                            break;
                        case 33:
                            djtaVar = djta.MSG_IMS_MODULE_TERMINATED;
                            break;
                        case 34:
                            djtaVar = djta.MSG_IMS_DEREGISTRATION_TIMEOUT;
                            break;
                        case 35:
                            djtaVar = djta.MSG_MO_ENABLED_FROM_PH_NUM_UI;
                            break;
                        case 36:
                            djtaVar = djta.MSG_SET_CONSENT_API_SUCCESS;
                            break;
                        case 37:
                            djtaVar = djta.MSG_SET_CONSENT_API_ERROR;
                            break;
                        case 38:
                            djtaVar = djta.MSG_GET_CONSENT_API_SUCCESS;
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            djtaVar = djta.MSG_GET_CONSENT_API_ERROR;
                            break;
                        case 40:
                            djtaVar = djta.MSG_SET_CONSENT_COMPLETE;
                            break;
                        case 41:
                            djtaVar = djta.MSG_GET_CONSENT_COMPLETE;
                            break;
                        default:
                            switch (i) {
                                case 1000:
                                    djtaVar = djta.MSG_HTTP_RESPONSE_UNKNOWN;
                                    break;
                                case 1001:
                                    djtaVar = djta.MSG_HTTP_200_OK;
                                    break;
                                case 1002:
                                    djtaVar = djta.MSG_HTTP_403_FORBIDDEN;
                                    break;
                                case 1003:
                                    djtaVar = djta.MSG_HTTP_511_AUTH_REQUIRED;
                                    break;
                                case 1004:
                                    djtaVar = djta.MSG_HTTP_503_UNAVAILABLE;
                                    break;
                                case 1005:
                                    djtaVar = djta.MSG_HTTP_400_BAD_REQUEST;
                                    break;
                                case 1006:
                                    djtaVar = djta.MSG_HTTP_401_UNAUTHORIZED;
                                    break;
                                case 1007:
                                    djtaVar = djta.MSG_HTTP_429_TOO_MANY_REQUESTS;
                                    break;
                                case 1008:
                                    djtaVar = djta.MSG_HTTP_501_NOT_SUPPORTED;
                                    break;
                                case 1009:
                                    djtaVar = djta.MSG_HTTP_504_GATEWAY_TIMEOUT;
                                    break;
                                case 1010:
                                    djtaVar = djta.MSG_HTTP_405_METHOD_NOT_ALLOWED;
                                    break;
                                default:
                                    switch (i) {
                                        case 2003:
                                            djtaVar = djta.MSG_TRANSITION_TO_DISABLED;
                                            break;
                                        case 2004:
                                            djtaVar = djta.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
                                            break;
                                        case 2005:
                                            djtaVar = djta.MSG_TRANSITION_TO_READY;
                                            break;
                                        case 2006:
                                            djtaVar = djta.MSG_TRANSITION_TO_IN_PROGRESS;
                                            break;
                                        case 2007:
                                            djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
                                            break;
                                        default:
                                            switch (i) {
                                                case 2009:
                                                    djtaVar = djta.MSG_TRANSITION_TO_RETRY;
                                                    break;
                                                case 2010:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REPLAY_REQUEST;
                                                    break;
                                                case 2011:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_CONSENT_FOR_IMSI_REQUEST;
                                                    break;
                                                case 2012:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_OTP;
                                                    break;
                                                case 2013:
                                                    djtaVar = djta.MSG_TRANSITION_TO_VERIFY_OTP;
                                                    break;
                                                case 2014:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
                                                    break;
                                                case 2015:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
                                                    break;
                                                case 2016:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITH_HE;
                                                    break;
                                                case 2017:
                                                    djtaVar = djta.MSG_TRANSITION_TO_CONFIGURED;
                                                    break;
                                                case 2018:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
                                                    break;
                                                case 2019:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
                                                    break;
                                                case 2020:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_BATTERY_OPT;
                                                    break;
                                                case 2021:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_TOS;
                                                    break;
                                                case 2022:
                                                    djtaVar = djta.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
                                                    break;
                                                case 2023:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
                                                    break;
                                                case 2024:
                                                    djtaVar = djta.MSG_TRANSITION_TO_SEND_DISABLE_RCS;
                                                    break;
                                                case 2025:
                                                    djtaVar = djta.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
                                                    break;
                                                case 2026:
                                                    djtaVar = djta.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
                                                    break;
                                                case 2027:
                                                    djtaVar = djta.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
                                                    break;
                                                case 2028:
                                                    djtaVar = djta.MSG_TRANSITION_TO_VERIFY_MSISDN;
                                                    break;
                                                case 2029:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
                                                    break;
                                                case 2030:
                                                    djtaVar = djta.MSG_TRANSITION_TO_WAITING_FOR_APP_OPEN;
                                                    break;
                                                default:
                                                    djtaVar = null;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            djtaVar = djta.MSG_TRANSITION_TO_ENABLED;
        }
        if (djtaVar != null) {
            return djtaVar;
        }
        if (!((Boolean) c.a()).booleanValue()) {
            return djta.MSG_UNKNOWN_DO_NOT_USE;
        }
        throw new IllegalArgumentException("Invalid message code for StateMachineMessage: " + message.what);
    }

    public static final String al(djta djtaVar) {
        switch (djtaVar.ordinal()) {
            case 3:
                return "SIM event";
            case 4:
                return "HTTP Response";
            case 5:
                return "Consent granted";
            case 6:
                return "Send config request";
            case 7:
                return "Received OTP";
            case 8:
                return "Timeout";
            case 9:
                return "Exception caught";
            case 10:
                return "Retry after";
            case 11:
                return "Refresh config";
            case 12:
                return "Config document received";
            case 13:
            case 17:
            case 19:
            case 23:
            case 25:
            case 26:
            case 28:
            case 30:
            case 33:
            case 51:
            case 69:
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
            default:
                throw new IllegalArgumentException("Unknown message");
            case 14:
                return "Verify number - success";
            case 15:
                return "Verify number - failure";
            case 16:
                return "Google ToS accepted";
            case 18:
                return "T&Cs rejected";
            case 20:
                return "Send config request over Mobile network";
            case 21:
                return "Mobile network is not available";
            case 22:
                return "HTTP IO exception while requested";
            case 24:
                return "Socket Timeout exception while requested";
            case 27:
                return "Timed out waiting for OTP";
            case 29:
                return "Verify OTP";
            case 31:
                return "Ims Module Terminated";
            case 32:
                return "Ims Deregistration Timeout";
            case 34:
                return "Set Consent API succeed";
            case 35:
                return "Set Consent API error";
            case 36:
                return "Get Consent API succeed";
            case 37:
                return "Get Consent API error";
            case 38:
                return "Set Consent complete";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "Get Consent complete";
            case 40:
                return "Unknown HTTP response";
            case 41:
                return "HTTP 200 (OK)";
            case 42:
                return "HTTP 403 (Forbidden)";
            case 43:
                return "HTTP 511 (Auth required)";
            case 44:
                return "HTTP 503 (Unavailable)";
            case 45:
                return "HTTP 400 (Bad request)";
            case 46:
                return "HTTP 401 (Unauthorized)";
            case 47:
                return "HTTP 429 (Too many requests)";
            case 48:
                return "HTTP 501 (Not supported)";
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return "HTTP 504 (Gateway timeout)";
            case 50:
                return "HTTP 405 (Method Not Allowed)";
            case 52:
                return "Transition to enabled";
            case 53:
                return "Transition to disabled";
            case 54:
                return "Transition to check preconditions";
            case 55:
                return "Transition to ready";
            case 56:
                return "Transition to in progress";
            case 57:
                return "Transition to request with imsi";
            case 58:
                return "Transition to retry";
            case 59:
                return "Transition to replay request";
            case 60:
                return "Transition to waiting for consent for IMSI request";
            case 61:
                return "Transition to waiting for OTP";
            case 62:
                return "Transition to verify OTP";
            case 63:
                return "Transition to request with auth";
            case 64:
                return "Transition to request with token";
            case 65:
                return "Transition to request with HE";
            case 66:
                return "Transition to configured";
            case 67:
                return "Transition to request with MSISDN";
            case 68:
                return "Transition to waiting for Google TOS";
            case 70:
                return "Transition to waiting for TOS";
            case 71:
                return "Transition to process configuration";
            case 72:
                return "Transition to waiting for manual MSISDN entry";
            case 73:
                return "Transition to send disable rcs";
            case 74:
                return "Transition to set Google ToS Consent";
            case 75:
                return "Transition to get Google ToS Consent";
            case 76:
                return "Transition to request with MSISDN token";
            case 77:
                return "Transition to verify MSISDN";
            case 78:
                return "Transition to Waiting For RCS Default On";
            case 79:
                return "Transition to Waiting For App Open";
            case 81:
                return "Force transition now";
        }
    }

    public static final void am(final djuw djuwVar, List list) {
        Collection.EL.stream(list).filter(new Predicate() { // from class: djvt
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                diyy diyyVar = djxs.a;
                return ((djte) obj).a.equals("JIBE_ACS_COOKIE");
            }
        }).findFirst().ifPresent(new Consumer() { // from class: djvu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                diyy diyyVar = djxs.a;
                djuw.this.b(((djte) obj).b);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    static final int as(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 7;
        }
        return 5;
    }

    static final boolean at(int i) {
        int i2 = i - 1;
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    private final int aw() {
        return (djai.z() && djai.ab() && this.G) ? this.aE.i(Optional.of(this.h)) : this.aE.i(Optional.empty());
    }

    private static final int ax(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 4 ? 2 : 3;
        }
        return 1;
    }

    public static ezeq i(int i) {
        return i != 0 ? i != 1 ? i != 3 ? ezeq.CONSENT_REASON_UNKNOWN : ezeq.IMEI_PII_FORMAT_IGNORED : ezeq.IMEI_PII_FORMAT_SHORT : ezeq.IMEI_PII_FORMAT_NONE;
    }

    public static String o(Message message) {
        emxf.b(message.obj instanceof String, "expected OTP to be string");
        return (String) message.obj;
    }

    public final void A(Message message) {
        String str;
        if (djai.V() && !af(message)) {
            v(message);
            return;
        }
        if (message.obj instanceof HttpURLConnection) {
            str = ((HttpURLConnection) message.obj).getHeaderField("Retry-After");
            this.z.d("Connection unavailable. Retry in %s seconds", str);
        } else {
            this.z.d("Connection unavailable. Retry", new Object[0]);
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                w(djta.MSG_RETRY_AFTER, Integer.valueOf(Integer.parseInt(str)));
            } catch (NumberFormatException unused) {
                this.z.b("Failed to parse Retry-After header: %s", str);
            }
        }
        R(this.am);
    }

    public final void B(final String str) {
        final int aw = aw();
        Optional of = Optional.of(this.h);
        dkdu dkduVar = new dkdu() { // from class: dkdf
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                String str2 = str;
                str2.getClass();
                ezcqVar.b |= 524288;
                ezcqVar.w = str2;
                ezchVar.copyOnWrite();
                ezcq ezcqVar3 = (ezcq) ezchVar.instance;
                ezcqVar3.v = aw - 1;
                ezcqVar3.b |= 262144;
                ezchVar.copyOnWrite();
                ezcq ezcqVar4 = (ezcq) ezchVar.instance;
                ezcqVar4.u = 1;
                ezcqVar4.b |= 131072;
            }
        };
        dkdv dkdvVar = this.v;
        dkdvVar.r(dkduVar, dkdvVar.e(of));
        this.n.v(this.m, j(), aw, str, this.l, new djro(this.h));
    }

    public final void C() {
        String str = this.h;
        dkdv dkdvVar = this.v;
        Optional of = Optional.of(str);
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        dkdvVar.r(new dkdu() { // from class: dkdq
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezcn ezcnVar = ezcn.TRUE;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.o = ezcnVar.d;
                ezcqVar.b |= 2048;
            }
        }, dkdvVar.e(of));
    }

    public final void D(String str, Message message) {
        if (!this.R.k() || message.arg1 == djta.MSG_ARG_TRANSITION_MSG.a()) {
            return;
        }
        this.z.d("%s: event %s", str, al(ak(message)));
    }

    final void E(ezez ezezVar) {
        this.n.d(this.m, ezezVar, this.l, new djro(this.h));
    }

    final void F(ezez ezezVar) {
        String m = m();
        int aw = aw();
        this.n.q(this.m, ezezVar, this.l, m, aw, new djro(this.h));
        if (l().booleanValue()) {
            cmoi.a(this.m, 8, this.i);
        }
    }

    public final void G() {
        csod g = ((csmz) this.aF.a()).g(this.i);
        dkdv dkdvVar = this.v;
        Optional of = Optional.of(this.h);
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        final ezcp ezcpVar = (ezcp) dkdv.a.getOrDefault(g, ezcp.SMS_CONNECTION_AVAILABILITY_UNKNOWN);
        dkdvVar.r(new dkdu() { // from class: dkdp
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.f = ezcp.this.d;
                ezcqVar.b |= 8;
            }
        }, dkdvVar.e(of));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [djxb, djyw] */
    /* JADX WARN: Type inference failed for: r10v1, types: [djyw] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [djvo] */
    public final void H(HttpURLConnection httpURLConnection, int i, djxb djxbVar) {
        djta djtaVar = djta.MSG_CONFIG_DOC;
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                w(djtaVar, this.y.a(inputStream));
                R(this.aw);
            } finally {
                this.p.a(httpURLConnection, inputStream, djxbVar.a());
            }
        } catch (dkbs | IOException e2) {
            an(djta.MSG_EXCEPTION_CAUGHT, i);
            this.z.e("Failed to parse configuration in state %s, exception = %s, errorMessage = %s", djxbVar.a(), e2.getClass().getName(), dktx.URI.c(e2));
            aq(djxbVar.g(), 4);
            E(djxbVar.g());
        }
    }

    public final void I() {
        String str = this.h;
        dkdv dkdvVar = this.v;
        Optional of = Optional.of(str);
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        dkdvVar.r(new dkdu() { // from class: dkdg
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezcn ezcnVar = ezcn.FALSE;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.g = ezcnVar.d;
                ezcqVar.b |= 16;
            }
        }, dkdvVar.e(of));
    }

    public final synchronized void J() {
        if (this.R.l()) {
            djyt djytVar = this.R;
            Iterator it = djytVar.n.iterator();
            while (it.hasNext()) {
                ((djvs) it.next()).a.ap(4);
            }
            djytVar.q.set(true);
        }
        if (this.R.k()) {
            this.Q.m();
        }
    }

    public final void K(djta djtaVar) {
        if (this.R.l()) {
            axnw.h(this.R.c(djtaVar, new djyy()));
        }
        if (this.R.k()) {
            this.Q.q(djtaVar.a());
        }
    }

    public final void L(djta djtaVar, Object obj) {
        if (this.R.l()) {
            axnw.h(this.R.c(djtaVar, new djyy(null, null, obj)));
        }
        if (this.R.k()) {
            this.Q.s(djtaVar.a(), obj);
        }
    }

    public final void M(djta djtaVar, int i, int i2, Object obj) {
        if (this.R.l()) {
            axnw.h(this.R.c(djtaVar, new djyy(Integer.valueOf(i), Integer.valueOf(i2), obj)));
        }
        if (this.R.k()) {
            diyb diybVar = this.Q;
            int a2 = djtaVar.a();
            diyn diynVar = diybVar.b;
            if (diynVar == null) {
                return;
            }
            diynVar.sendMessage(diybVar.c(a2, i, i2, obj));
        }
    }

    public final void N(djta djtaVar, long j) {
        djta djtaVar2;
        if (this.R.l()) {
            djyt djytVar = this.R;
            djyy djyyVar = new djyy();
            Duration ofMillis = Duration.ofMillis(j);
            djtaVar.getClass();
            ofMillis.getClass();
            ((enrr) djyt.d.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "sendMessageDelayed", 439, "StateMachineV2.kt")).D("Queuing delayed %s for %s", djtaVar, ofMillis);
            djtaVar2 = djtaVar;
            axol.k(djytVar.h, null, new djyo(ofMillis, djytVar, djtaVar2, djyyVar, null), 3);
        } else {
            djtaVar2 = djtaVar;
        }
        if (this.R.k()) {
            this.Q.t(djtaVar2.a(), j);
        }
    }

    public final void O(djxb djxbVar) {
        if (this.R.l()) {
            djyt djytVar = this.R;
            ezez g = djxbVar.g();
            g.getClass();
            djytVar.t = g;
        }
        if (this.R.k()) {
            this.Q.u(djxbVar);
        }
    }

    public final synchronized void P() {
        djvf djvfVar = this.z;
        final long hashCode = djvfVar.hashCode();
        djvfVar.a = (dktn) djvfVar.c.map(new Function() { // from class: djvc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                djve djveVar = (djve) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(hashCode);
                sb.append("-Default");
                if (djveVar.c) {
                    sb.append("Call");
                }
                if (djveVar.d) {
                    sb.append("Sms");
                }
                if (djveVar.e) {
                    sb.append("Data");
                }
                if (!djveVar.c && !djveVar.d && !djveVar.e) {
                    sb.append("None");
                }
                sb.append("-");
                sb.append(djveVar.b);
                sb.append((String) djveVar.a.map(new Function() { // from class: djvd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        return (str.isEmpty() || str.length() < 3) ? "" : "-".concat(String.valueOf(str.substring(str.length() - 3)));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""));
                return new dktn(String.format(Locale.US, "(PEv2-SM%s)", sb));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new dktn(String.format(Locale.US, "(PEv2-SM%s)", a.s(hashCode, "-Bugle-"))));
        this.z.d("start PEv2, trigger is %s, workerId is %s", this.W.name(), this.X);
        this.v.g(this.h);
        if (this.u.i(this.h).isPresent()) {
            ((dkdw) this.M.b()).M(this.h);
        }
        if (this.R.l()) {
            if (this.R.m()) {
                this.R.m.add(new djvr(this));
                this.R.n.add(new djvs(this));
            }
            djyt djytVar = this.R;
            axnw.h(fgfz.a(emau.a(djytVar.h, djytVar.s, new djyq(djytVar, null))));
        }
        if (this.R.k()) {
            this.Q.v();
        }
    }

    final void Q(ezdc ezdcVar) {
        this.v.m(ezdcVar, this.h);
    }

    public final void R(djxb djxbVar) {
        if (this.R.l()) {
            axnw.h(this.R.d(djxbVar.g()));
        }
        if (this.R.k()) {
            this.Q.w(djxbVar);
        }
    }

    public final boolean S() {
        return (djai.z() && djai.ab()) ? this.Y.c(this.h).D : ((Boolean) dimn.E().d().a()).booleanValue();
    }

    public final boolean T() {
        return (djai.z() && djai.ab()) ? this.Y.c(this.h).y : dizg.z();
    }

    public final boolean U() {
        return (djai.z() && djai.ab()) ? this.Y.c(this.h).m && Build.VERSION.SDK_INT < 31 : ((Boolean) djai.t().a.K.a()).booleanValue() && Build.VERSION.SDK_INT < 31;
    }

    public final boolean V() {
        return (djai.z() && djai.ab()) ? this.Y.c(this.h).x : djai.W();
    }

    public final boolean W() {
        return (djai.z() && djai.ab()) ? this.Y.c(this.h).n : dimo.b();
    }

    public final boolean X() {
        return !TextUtils.isEmpty(this.u.n(this.h));
    }

    final boolean Y() {
        String n = this.u.n(this.h);
        if (TextUtils.isEmpty(n)) {
            n = (String) k().orElse(null);
        }
        return !TextUtils.isEmpty(n);
    }

    public final synchronized boolean Z() {
        if (this.R.m()) {
            return this.R.i();
        }
        return this.Q.b == null;
    }

    public final int a() {
        if (!djai.z() || !djai.ab()) {
            return ((Integer) dimn.E().r().a()).intValue();
        }
        int c2 = ewhl.c(this.Y.c(this.h).E);
        if (c2 == 0) {
            c2 = 1;
        }
        return ax(c2);
    }

    public final boolean aa(String str) {
        return this.Y.c(str).N || ((Boolean) djuy.a.a()).booleanValue();
    }

    public final boolean ab() {
        if (!this.G) {
            return this.r.k();
        }
        cosz coszVar = this.H;
        coszVar.getClass();
        return coszVar.o;
    }

    final boolean ac() {
        if (S()) {
            this.z.a("Safe to share MSISDN in state %s. Device is ready for Seamless Authorized Provisioning.", n());
            return true;
        }
        if (a() != 3 || b() != 3) {
            return false;
        }
        this.z.a("Safe to share MSISDN in state %s. PII format ignored.", n());
        return true;
    }

    final boolean ad() {
        cosz coszVar = this.H;
        coszVar.getClass();
        return this.I.t(coszVar.d);
    }

    public final boolean ae() {
        return ((csmz) this.aF.a()).g(this.i) == csod.UNAVAILABLE;
    }

    final boolean af(Message message) {
        if (this.k == message.arg2) {
            return true;
        }
        this.z.e("request id: %d, received id: %d, discard http response", Integer.valueOf(this.k), Integer.valueOf(message.arg2));
        return false;
    }

    public final boolean ag() {
        return (djai.z() && djai.ac()) ? this.aI.a(this.h) : djai.G();
    }

    public final boolean ah() {
        return (djai.z() && djai.ac()) ? this.aI.b(this.h) : djai.J();
    }

    public final boolean ai() {
        if (!djai.z() || !djai.ab()) {
            return djai.R();
        }
        int a2 = ewil.a(this.Y.c(this.h).G);
        return a2 != 0 && a2 == 5;
    }

    public final boolean aj() {
        return ag() && W() && !this.aC.d() && !this.u.C();
    }

    public final void an(djta djtaVar, int i) {
        if (this.R.l()) {
            axnw.h(this.R.c(djtaVar, new djyy(0, Integer.valueOf(i), null)));
        }
        if (this.R.k()) {
            diyb diybVar = this.Q;
            int a2 = djtaVar.a();
            diyn diynVar = diybVar.b;
            if (diynVar == null) {
                return;
            }
            diynVar.sendMessage(Message.obtain(diynVar, a2, 0, i));
        }
    }

    final void ao() {
        final String uuid = UUID.randomUUID().toString();
        ((dkdw) this.M.b()).A(this.h, uuid);
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.ims.provisioning.session.id.key", ((dkdw) this.M.b()).k(this.h));
        djtb.c(this.m, 18, bundle);
        dktx dktxVar = dktx.SIM_ID;
        final String str = this.h;
        final int i = 2;
        dkty.c("startNewProvisioningAttempt, provisioningSessionId=%s, simId=%s", uuid, dktxVar.c(str));
        if (!dkdv.i()) {
            final dkdv dkdvVar = this.v;
            dkdvVar.s(new emwl() { // from class: dkdc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ezdn ezdnVar = (ezdn) obj;
                    int i2 = ezdnVar.b & 2;
                    dkdv dkdvVar2 = dkdv.this;
                    String str2 = str;
                    if (i2 != 0) {
                        ezcg ezcgVar = ezdnVar.d;
                        if (ezcgVar == null) {
                            ezcgVar = ezcg.a;
                        }
                        if ((ezcgVar.b & 4) == 0) {
                            ezdnVar = dkdvVar2.n(ezdnVar, 8, str2);
                        }
                    }
                    String str3 = uuid;
                    ezdm ezdmVar = (ezdm) ezdnVar.toBuilder();
                    ezce ezceVar = (ezce) ezcg.a.createBuilder();
                    ezceVar.copyOnWrite();
                    ezcg ezcgVar2 = (ezcg) ezceVar.instance;
                    ezcgVar2.g = 1;
                    ezcgVar2.b = 8 | ezcgVar2.b;
                    eyja d2 = eykm.d(dkvj.a().longValue());
                    ezceVar.copyOnWrite();
                    ezcg ezcgVar3 = (ezcg) ezceVar.instance;
                    d2.getClass();
                    ezcgVar3.e = d2;
                    ezcgVar3.b |= 2;
                    ezcg ezcgVar4 = (ezcg) ezceVar.build();
                    ezdmVar.copyOnWrite();
                    ezdn ezdnVar2 = (ezdn) ezdmVar.instance;
                    ezcgVar4.getClass();
                    ezdnVar2.d = ezcgVar4;
                    ezdnVar2.b |= 2;
                    return dkdvVar2.d((ezdn) ezdmVar.build(), str3, Optional.of(str2));
                }
            }, Optional.of(str));
        }
        ((dkdw) this.M.b()).u(this.h, false);
        this.l = uuid;
        this.z.b = uuid;
        this.z.d("Start a new provisioning session", new Object[0]);
        djtp g = g();
        if (g != null && !g.Q()) {
            i = !g.O() ? 3 : true != g.aa() ? 4 : 5;
        }
        dkdv dkdvVar2 = this.v;
        Optional of = Optional.of(this.h);
        if (dkdvVar2.j(dkdvVar2.e(of))) {
            return;
        }
        dkdvVar2.r(new dkdu() { // from class: dkdr
            @Override // defpackage.dkdu
            public final void a(ezch ezchVar) {
                enhk enhkVar = dkdv.a;
                ezchVar.copyOnWrite();
                ezcq ezcqVar = (ezcq) ezchVar.instance;
                ezcq ezcqVar2 = ezcq.a;
                ezcqVar.y = i - 1;
                ezcqVar.b |= 2097152;
            }
        }, dkdvVar2.e(of));
    }

    final void ap(final int i) {
        this.v.l(f(), Optional.of(this.h));
        final Optional of = Optional.of(this.h);
        dkty.c("finishProvisioningAttempt", new Object[0]);
        if (!dkdv.i()) {
            final dkdv dkdvVar = this.v;
            if (!dkdvVar.h(dkdvVar.e(of))) {
                dkdvVar.s(new emwl() { // from class: dkdd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dkdv dkdvVar2 = dkdv.this;
                        return dkdvVar2.n((ezdn) obj, i, dkdvVar2.e(of));
                    }
                }, of);
            }
        }
        ((dkdw) this.M.b()).u(this.h, true);
        this.l = null;
        this.z.b = null;
    }

    final void aq(ezez ezezVar, int i) {
        this.n.r(this.m, ezezVar, i, this.l, new djro(this.h));
        if (l().booleanValue() && at(i)) {
            cmoi.a(this.m, as(i), this.i);
        }
    }

    final void ar(int i) {
        this.v.o(i);
    }

    final void au(ezez ezezVar, int i) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        this.n.y(this.m, ezezVar, i, this.l, new djro(this.h));
        if (l().booleanValue() && at(2)) {
            Context context = this.m;
            int as = as(2);
            int i2 = this.i;
            if (ctid.h) {
                Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
                if (as == 3) {
                    intent.putExtra("error_code", i);
                    as = 3;
                }
                cmoi.c(intent, as, i2);
                ensk h = cmoi.a.h();
                h.Y(ente.a, "BugleRcsProvisioning");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoWithErrorCode", 37, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
                if (csjc.h()) {
                    context.sendBroadcast(intent);
                    return;
                }
                makeBasic = BroadcastOptions.makeBasic();
                shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                bundle = shareIdentityEnabled.toBundle();
                context.sendBroadcast(intent, null, bundle);
            }
        }
    }

    final void av(int i) {
        this.v.q(28, i, Optional.empty());
    }

    public final int b() {
        if (!djai.z() || !djai.ab()) {
            return ((Integer) dimn.E().s().a()).intValue();
        }
        int c2 = ewhl.c(this.Y.c(this.h).F);
        if (c2 == 0) {
            c2 = 1;
        }
        return ax(c2);
    }

    public final int c() {
        return (djai.z() && djai.ab() && this.G) ? this.aE.b(this.h) : this.aE.a();
    }

    public final long d() {
        if (!djai.z() || !djai.ab()) {
            return ((Long) dimn.E().j().a()).longValue();
        }
        eyev eyevVar = this.Y.c(this.h).J;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        return eyki.b(eyevVar);
    }

    public final long e() {
        if (!djai.z() || !djai.ab()) {
            return ((Long) dimn.E().n().a()).longValue();
        }
        eyev eyevVar = this.Y.c(this.h).K;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        return eyki.b(eyevVar);
    }

    final djtc f() {
        return new djtc(((ckge) this.aH.a()).v(new djro(this.h)));
    }

    public final djtp g() {
        return this.u.f(this.h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (defpackage.djai.ab() == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        r0 = r3.Y.c(r3.h).M;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006f, code lost:
    
        if (r0 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0076, code lost:
    
        return r3.ar;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r0 = ((java.lang.Boolean) defpackage.djai.t().a.i.a()).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r0.a.b(r1.a) != r1.b.a(r1.a)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r1.c.h(defpackage.cors.a).map(new defpackage.djxz()).equals(r1.c.h(defpackage.cors.c).map(new defpackage.djxz())) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
    
        if (defpackage.djai.z() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.djxb h() {
        /*
            r3 = this;
            boolean r0 = r3.G
            djxy r1 = r3.aD
            djya r1 = r1.a
            if (r0 == 0) goto L31
            cort r0 = r1.c
            cors r2 = defpackage.cors.a
            j$.util.Optional r0 = r0.h(r2)
            cort r1 = r1.c
            cors r2 = defpackage.cors.c
            j$.util.Optional r1 = r1.h(r2)
            djxz r2 = new djxz
            r2.<init>()
            j$.util.Optional r0 = r0.map(r2)
            djxz r2 = new djxz
            r2.<init>()
            j$.util.Optional r1 = r1.map(r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L71
            goto L46
        L31:
            dkpm r0 = r1.b
            android.content.Context r2 = r1.a
            dkpn r0 = r0.a
            int r0 = r0.b(r2)
            dkpm r2 = r1.b
            android.content.Context r1 = r1.a
            int r1 = r2.a(r1)
            if (r0 == r1) goto L46
            goto L71
        L46:
            boolean r0 = defpackage.djai.z()
            if (r0 == 0) goto L5d
            boolean r0 = defpackage.djai.ab()
            if (r0 == 0) goto L5d
            cguo r0 = r3.Y
            java.lang.String r1 = r3.h
            ewht r0 = r0.c(r1)
            boolean r0 = r0.M
            goto L6f
        L5d:
            djai r0 = defpackage.djai.t()
            djah r0 = r0.a
            diza r0 = r0.i
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L6f:
            if (r0 == 0) goto L74
        L71:
            djxb r0 = r3.ak
            return r0
        L74:
            djxb r0 = r3.ar
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djxs.h():djxb");
    }

    public final ezez j() {
        if (this.R.m()) {
            ezez ezezVar = (ezez) this.R.e();
            if (ezezVar != null) {
                return ezezVar;
            }
            this.z.e("StateMachineV2's initial state is not set, using unknown state", new Object[0]);
            return ezez.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        dixy d2 = this.Q.d();
        if (d2 == null) {
            this.z.e("Current state is null, use unknown state", new Object[0]);
            return ezez.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        if (d2 instanceof djxb) {
            return ((djxb) d2).g();
        }
        this.z.e("Current state is not defined state, use unknown state", new Object[0]);
        return ezez.RCS_PROVISIONING_UNKNOWN_STATE;
    }

    public final Optional k() {
        String d2;
        if (this.Y.c(this.h).O) {
            this.z.a("Skipping attempt to read MSISDN from SIM because of inhibitReadingMsisdnFromSim", new Object[0]);
            return Optional.empty();
        }
        if (!emxe.c(djai.u())) {
            d2 = djai.u();
            this.z.a("Using fake MSISDN from SIM because of RcsProvisioning.fakeSimNumberForTesting", new Object[0]);
        } else if (this.G) {
            cosz coszVar = this.H;
            coszVar.getClass();
            d2 = coszVar.q;
        } else {
            d2 = this.r.d();
        }
        return TextUtils.isEmpty(d2) ? Optional.empty() : Optional.of(d2);
    }

    public final Boolean l() {
        boolean z = false;
        if (ab() && ctid.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String m() {
        return (djai.z() && djai.ab() && this.G) ? (String) this.aE.d(this.h).orElse("") : (String) this.aE.c().orElse("");
    }

    public final String n() {
        dixy dixyVar = this.R.m() ? this.R.k() ? (djyw) this.Q.d() : (djyw) this.R.a() : (djxb) this.Q.d();
        if (dixyVar != null) {
            return dixyVar.a();
        }
        this.z.e("Trying to get state name when current state is null, use unknown", new Object[0]);
        return "UnknownState";
    }

    public final String p() {
        return (djai.z() && djai.ab()) ? this.Y.d(this.h).b : djai.x();
    }

    public final String q() {
        return (djai.z() && djai.ab() && this.G) ? this.aE.f(this.h) : this.aE.e();
    }

    public final List r() {
        return ((dkdw) this.M.b()).m(this.h);
    }

    public final void s(djxb djxbVar, dkbm dkbmVar, djuw djuwVar) {
        if (W() && djai.I()) {
            Optional g = this.u.g();
            if (g.isEmpty() && djai.P()) {
                this.z.e("Failed to find GMSCore IID token when constructing HTTP request.", new Object[0]);
                djxbVar.n(this.al, ezez.RCS_PROVISIONING_RETRY_STATE);
            } else if (g.isPresent()) {
                dkbmVar.k("gmscore_instance_id_token", (String) g.get());
                if (aa(this.h)) {
                    ((djur) djuwVar).b = (String) g.get();
                }
            }
        }
    }

    public final void t(final dkbm dkbmVar) {
        Optional empty;
        byte[] bArr;
        Optional empty2;
        if (this.aG.isEmpty()) {
            this.z.e("Skipping adding Tachyon identity key to request. TachyonIdentityKeyGetter is not present. Perhaps provisioning engine is not running in Bugle.", new Object[0]);
            return;
        }
        djtp g = g();
        if (g == null || g.c() == 0) {
            this.z.e("Could not retrieve MSISDN from configuration. Configuration is empty.", new Object[0]);
            empty = Optional.empty();
        } else {
            djtr m = g.m();
            if (m == null) {
                this.z.e("Could not retrieve MSISDN from configuration. ImsConfiguration is null.", new Object[0]);
                empty = Optional.empty();
            } else {
                String w = m.w();
                if (emxe.c(w)) {
                    this.z.e("Could not retrieve MSISDN from configuration. Public identity is null/empty.", new Object[0]);
                    empty = Optional.empty();
                } else {
                    empty = Optional.ofNullable(dkut.k(w, this.x));
                }
            }
        }
        if (empty.isEmpty() || emxe.c((String) empty.get())) {
            this.z.e("Skipping adding Tachyon identity key to request. Null/empty RCS msisdn from configuration for sim ID: %s.", dktx.SIM_ID.c(this.h));
            return;
        }
        Object obj = this.aG.get();
        String str = (String) empty.get();
        if (emxe.c(str)) {
            chnz.a.r("Cannot retrieve Tachyon Identity key because RCS MSISDN is empty.");
            empty2 = Optional.empty();
        } else {
            try {
                bArr = ((chod) ((chnz) obj).b.a(str).b.l()).f.I();
            } catch (eygu e2) {
                csjb b2 = chnz.a.b();
                b2.I("Could not parse TachyonPhoneData from proto data store");
                b2.s(e2);
                bArr = new byte[0];
            }
            if (bArr == null || bArr.length == 0) {
                csjb a2 = chnz.a.a();
                a2.I("Tachyon identity key is empty because we do not have an active Tachyon registration.");
                a2.r();
                empty2 = Optional.empty();
            } else {
                fcez fcezVar = (fcez) fcfa.a.createBuilder();
                fcezVar.copyOnWrite();
                ((fcfa) fcezVar.instance).b = fgtk.a(3);
                eyee x = eyee.x(bArr);
                fcezVar.copyOnWrite();
                ((fcfa) fcezVar.instance).c = x;
                empty2 = Optional.of(Base64.encodeToString(((fcfa) fcezVar.build()).toByteArray(), 0));
            }
        }
        empty2.ifPresent(new Consumer() { // from class: djvq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                diyy diyyVar = djxs.a;
                dkbm.this.k("tachyon_identity_key", (String) obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void u() {
        ar(57);
        cmep cmepVar = (cmep) cmeq.a.createBuilder();
        clxt clxtVar = clxt.GOOGLE_TOS_CONSENTED;
        cmepVar.copyOnWrite();
        ((cmeq) cmepVar.instance).c = clxtVar.a();
        cmepVar.copyOnWrite();
        ((cmeq) cmepVar.instance).d = "Backfilled consent. Missing ToS URL.";
        String languageTag = ctid.c(this.m).toLanguageTag();
        cmepVar.copyOnWrite();
        cmeq cmeqVar = (cmeq) cmepVar.instance;
        languageTag.getClass();
        cmeqVar.e = languageTag;
        eyja d2 = eykm.d(dkvj.a().longValue());
        cmepVar.copyOnWrite();
        cmeq cmeqVar2 = (cmeq) cmepVar.instance;
        d2.getClass();
        cmeqVar2.f = d2;
        cmeqVar2.b |= 1;
        this.aC.c((cmeq) cmepVar.build());
    }

    public final void v(Message message) {
        if (message.obj instanceof HttpURLConnection) {
            this.p.a((HttpURLConnection) message.obj, null, this.R.m() ? this.R.e : this.Q.a);
        }
    }

    public final void w(djta djtaVar, Object obj) {
        if (this.R.l()) {
            this.R.h(djtaVar, new djyy(null, null, obj));
        }
        if (this.R.k()) {
            diyb diybVar = this.Q;
            diybVar.g(diybVar.b(djtaVar.a(), obj));
        }
    }

    public final void x(djta djtaVar, int i, int i2, Object obj) {
        if (this.R.l()) {
            this.R.h(djtaVar, new djyy(Integer.valueOf(i), Integer.valueOf(i2), obj));
        }
        if (this.R.k()) {
            diyb diybVar = this.Q;
            diybVar.g(diybVar.c(djtaVar.a(), i, i2, obj));
        }
    }

    final void y(ezdc ezdcVar) {
        boolean J = ((dkdw) this.M.b()).J(this.h);
        this.v.k(ezdcVar, this.l, Boolean.valueOf(J), this.h);
    }

    public final void z() {
        String str = this.h;
        final dkdv dkdvVar = this.v;
        Optional of = Optional.of(str);
        dkty.c("finishProvisioningStage for SIM: %s", dktx.SIM_ID.c(dkdvVar.e(of)));
        if (dkdvVar.j(dkdvVar.e(of))) {
            return;
        }
        dkdvVar.s(new emwl() { // from class: dkcv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return dkdv.this.c((ezdn) obj);
            }
        }, of);
    }
}
