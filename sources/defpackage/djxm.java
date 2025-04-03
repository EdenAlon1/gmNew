package defpackage;

import android.os.Message;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djxm extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djxm(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    private final void q() {
        this.a.I();
        this.a.ar(24);
        djxs djxsVar = this.a;
        dkcp dkcpVar = djxsVar.u;
        String str = djxsVar.h;
        try {
            dksa dksaVar = dkcpVar.b;
            clza createBuilder = clzf.a.createBuilder();
            eyja d = eykm.d(Instant.now().toEpochMilli());
            createBuilder.copyOnWrite();
            clzf clzfVar = (clzf) createBuilder.instance;
            d.getClass();
            clzfVar.e = d;
            clzfVar.b |= 4;
            createBuilder.copyOnWrite();
            clzf clzfVar2 = (clzf) createBuilder.instance;
            clzfVar2.c = clzd.a(3);
            clzfVar2.b |= 1;
            createBuilder.copyOnWrite();
            clzf clzfVar3 = (clzf) createBuilder.instance;
            clzfVar3.d = clzb.a(3);
            clzfVar3.b |= 2;
            dksaVar.o(dksa.g("phone_number_input_ui_event_key_for_sim_", str), createBuilder.build());
            dkty.l(dkcp.a, "requestPhoneNumberInputUI for sim %s", dktx.SIM_ID.c(str));
        } catch (dksb e) {
            dkty.j(e, dkcp.a, "Error while putting PhoneNumberInputUIEvent in bugle storage", new Object[0]);
        }
        if (((Boolean) djxs.b.a()).booleanValue()) {
            djtb.c(this.a.m, 13, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r2.E.a(r2.h, (java.lang.String) r0, defpackage.dizg.d()) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean r() {
        /*
            r6 = this;
            djxs r0 = r6.a
            boolean r0 = r0.T()
            r1 = 1
            if (r0 != 0) goto La
            goto L46
        La:
            djxs r0 = r6.a
            boolean r0 = r0.X()
            if (r0 != 0) goto L46
            djxs r0 = r6.a
            j$.util.Optional r0 = r0.k()
            boolean r2 = r0.isPresent()
            r3 = 0
            if (r2 == 0) goto L36
            djxs r2 = r6.a
            java.lang.Object r0 = r0.get()
            java.lang.String r4 = r2.h
            int r5 = defpackage.dizg.d()
            java.lang.String r0 = (java.lang.String) r0
            djvi r2 = r2.E
            boolean r0 = r2.a(r4, r0, r5)
            if (r0 != 0) goto L36
            goto L37
        L36:
            r1 = r3
        L37:
            djxs r0 = r6.a
            djvf r0 = r0.z
            java.lang.String r2 = "Should attempt verification using sim number: "
            java.lang.String r2 = defpackage.a.q(r1, r2)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0.d(r2, r3)
        L46:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djxm.r():boolean");
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "WaitingForManualMsisdnEntryState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.MANUAL_MSISDN_ENTRY_STAGE);
        if (this.a.ai()) {
            if (this.a.X()) {
                this.a.z.d("UPI - found manually entered msisdn, go straight to VerifyMsisdnState", new Object[0]);
                djxs djxsVar = this.a;
                djxsVar.R(djxsVar.ai);
                return;
            } else {
                this.a.z.d("UPI - manually entered msisdn not found, requesting phone number input UI", new Object[0]);
                ensk j = djxs.e.j();
                j.Y(ente.a, "BugleRcsProvisioning");
                ((enrr) ((enrr) j).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4680, "ProvisioningEngineStateMachine.java")).q("UPI - manually entered msisdn not found, requesting phone number input UI");
                q();
                this.a.K.ifPresent(new Consumer() { // from class: djxk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((djtd) obj).o(5, djxm.this.a.h);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        if (this.a.Y() && r()) {
            n(this.a.at, ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE);
            return;
        }
        if (!this.a.Y()) {
            ensk j2 = djxs.e.j();
            j2.Y(ente.a, "BugleRcsProvisioning");
            ((enrr) ((enrr) j2).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4693, "ProvisioningEngineStateMachine.java")).q("No msisdn found, requesting phone number input UI");
        }
        if (!r()) {
            ensk j3 = djxs.e.j();
            j3.Y(ente.a, "BugleRcsProvisioning");
            ((enrr) ((enrr) j3).h("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine$WaitingForManualMsisdnEntryState", "enter", 4696, "ProvisioningEngineStateMachine.java")).q("Does not have manual entered msisdn or sim msisdn reached max threshold, requesting phone number input UI");
        }
        q();
        this.a.K.ifPresent(new Consumer() { // from class: djxl
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((djtd) obj).o(5, djxm.this.a.h);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        if (this.a.V() || this.a.ai()) {
            return false;
        }
        super.i();
        return true;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return this.a.V();
    }

    @Override // defpackage.djyw
    public final boolean k(Message message, djta djtaVar) {
        this.a.D("WaitingForManualMsisdnEntryState", message);
        if (djxs.ak(message).ordinal() != 8) {
            return super.o(message, djtaVar);
        }
        if (!this.a.V()) {
            return super.o(message, djtaVar);
        }
        this.a.ar(49);
        this.a.ap(11);
        this.a.ao();
        djxs djxsVar = this.a;
        djxsVar.R(djxsVar.ad);
        return true;
    }

    @Override // defpackage.djxb
    public final Duration l() {
        return this.a.V() ? Duration.ofMillis(djai.p()) : super.l();
    }
}
