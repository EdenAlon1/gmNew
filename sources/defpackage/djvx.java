package defpackage;

import android.content.Context;
import android.os.Message;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvx extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djvx(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        ezez ezezVar = ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        djxs djxsVar = this.a;
        String str = djxsVar.l;
        djro djroVar = new djro(djxsVar.h);
        ezeq[] ezeqVarArr = {ezeq.CONSENT_ALREADY_GRANTED};
        djxs djxsVar2 = this.a;
        djxsVar2.n.a(djxsVar2.m, ezezVar, str, djroVar, ezeqVarArr);
        this.a.z();
    }

    private final void r(int i) {
        if (this.a.g().aa()) {
            p(this.a.ag, ezez.RCS_PROVISIONING_READY_STATE, i);
        } else {
            this.a.z.d("Configuration is still valid", new Object[0]);
            p(this.a.as, ezez.RCS_PROVISIONING_CONFIGURED_STATE, i);
        }
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "CheckPreconditionsState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        ezez ezezVar = ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        String valueOf = String.valueOf(this.a.W());
        djxs djxsVar = this.a;
        String str = djxsVar.l;
        djro djroVar = new djro(djxsVar.h);
        djxs djxsVar2 = this.a;
        djxsVar2.n.s(djxsVar2.m, ezezVar, 2, valueOf, str, djroVar);
        if (this.a.aj()) {
            djxs djxsVar3 = this.a;
            djxsVar3.z.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s rcsDefaultOnConsentCache.hasClientConsent = %s", djxsVar3.u, Boolean.valueOf(djxsVar3.aC.d()), Boolean.valueOf(this.a.u.C()), Boolean.valueOf(this.a.J.e()));
            this.a.Q(ezdc.RCS_DEFAULT_ON_STAGE);
            this.a.ar(35);
            this.a.ar(61);
            if (!this.a.J.e()) {
                n(this.a.aA, ezez.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE);
                return;
            }
            djxs djxsVar4 = this.a;
            djxsVar4.n.a(djxsVar4.m, ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE, djxsVar4.l, new djro(djxsVar4.h), ezeq.RCS_DEFAULT_ON_ALREADY_SEEN);
            this.a.z();
            if (djai.I()) {
                if (!this.a.J.f()) {
                    n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                } else if (this.a.u.g().isEmpty()) {
                    n(this.a.az, ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
            }
            r(1);
            return;
        }
        if (this.a.W()) {
            this.a.Q(ezdc.GOOGLE_TOS_STAGE);
            this.a.ar(35);
            this.a.ar(3);
            if (djai.N() || djai.I()) {
                djxs djxsVar5 = this.a;
                djxsVar5.z.d("provisioningEngineDataRetriever = %s, googleToSConsentCache.hasClientConsent() = %s, provisioningEngineDataRetriever.getGoogleTosConsent = %s", djxsVar5.u, Boolean.valueOf(djxsVar5.aC.d()), Boolean.valueOf(this.a.u.C()));
                if (!this.a.aC.d() && !this.a.u.C()) {
                    n(this.a.au, ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                    return;
                }
                if (this.a.aC.d()) {
                    Optional k = this.a.aC.a.k();
                    if (!k.isPresent() || (((cmeq) k.get()).b & 2) == 0) {
                        q();
                        n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                        return;
                    }
                }
                if (this.a.u.C() && !this.a.aC.d() && djai.C()) {
                    if (this.a.u.C()) {
                        try {
                            if (!this.a.u.b.k("did_show_google_tos_prompt", false, "bugle")) {
                                this.a.z.d("Restoring Google Tos Consent from Backup", new Object[0]);
                                this.a.ar(58);
                            }
                        } catch (dksb unused) {
                            dkty.h(dkcp.a, "Error while retrieving did show Google Tos prompt from Bugle Storage. Returning default value: %s", true);
                        }
                    }
                    q();
                    this.a.u();
                    n(this.a.ay, ezez.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE);
                    return;
                }
                if (djai.I()) {
                    q();
                    if (this.a.u.g().isEmpty() || !djai.Z()) {
                        n(this.a.az, ezez.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE);
                        return;
                    }
                }
            } else {
                if (!this.a.u.C()) {
                    n(this.a.au, ezez.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE);
                    return;
                }
                this.a.ar(5);
                djxs djxsVar6 = this.a;
                ezez ezezVar2 = ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
                String str2 = djxsVar6.l;
                djro djroVar2 = new djro(djxsVar6.h);
                ezeq[] ezeqVarArr = new ezeq[1];
                ezeq ezeqVar = this.a.W() ? ezeq.CONSENT_ALREADY_GRANTED : ezeq.GOOGLE_TOS_DISABLED;
                Context context = djxsVar6.m;
                dikl diklVar = djxsVar6.n;
                ezeqVarArr[0] = ezeqVar;
                diklVar.a(context, ezezVar2, str2, djroVar2, ezeqVarArr);
                this.a.z();
            }
        }
        r(1);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return false;
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
        this.a.D("CheckPreconditionsState", message);
        int ordinal = djxs.ak(message).ordinal();
        if (ordinal != 38 && ordinal != 39) {
            return super.o(message, djtaVar);
        }
        r(2);
        return true;
    }
}
