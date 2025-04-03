package defpackage;

import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipMessage;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djmv implements eeno {
    public static final dktn a = new dktn("SipRegistrationSipTransport");
    public eenz b;
    public SipDelegateConfiguration c;
    private final SipDelegateConnection e;
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    private final UUID f = UUID.randomUUID();

    public djmv(SipDelegateConnection sipDelegateConnection, SipDelegateConfiguration sipDelegateConfiguration) {
        this.e = sipDelegateConnection;
        this.c = sipDelegateConfiguration;
    }

    @Override // defpackage.eeno
    public final int a() {
        return this.c.getLocalAddress().getPort();
    }

    @Override // defpackage.eeno
    public final int b() {
        return this.c.getSipServerAddress().getPort();
    }

    @Override // defpackage.eeno
    public final String c() {
        return "";
    }

    @Override // defpackage.eeno
    public final String d() {
        return this.f.toString();
    }

    @Override // defpackage.eeno
    public final String e() {
        String hostAddress = this.c.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    @Override // defpackage.eeno
    public final String f() {
        String hostAddress = this.c.getSipServerAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    public final void g(eelv eelvVar, boolean z) {
        if (eelvVar == null) {
            return;
        }
        SipDelegateConnection sipDelegateConnection = this.e;
        if (z || eelvVar.t()) {
            String h = eelvVar.h();
            if (!"BYE".equals(eelvVar.i()) || h == null) {
                return;
            }
            sipDelegateConnection.cleanupSession(h);
        }
    }

    @Override // defpackage.eeno
    public final void i(eelv eelvVar) {
        long version = this.c.getVersion();
        eelo f = eelvVar.f();
        f.getClass();
        String b = f.b();
        b.getClass();
        int intValue = ((Integer) Optional.ofNullable(Integer.valueOf(this.c.getMaxUdpPayloadSizeBytes())).filter(new Predicate() { // from class: djmu
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
                return ((Integer) obj).intValue() > 0;
            }
        }).orElse(1300)).intValue();
        SipMessage a2 = djlh.a(eelvVar);
        if (a2.getStartLine().length() + a2.getHeaderSection().length() + a2.getContent().length > intValue) {
            eelo f2 = eelvVar.f();
            f2.getClass();
            f2.p(eejk.TCP.d);
            a2 = djlh.a(eelvVar);
        }
        this.d.put(b, eelvVar);
        this.e.sendMessage(a2, version);
    }

    @Override // defpackage.eeno
    public final void j(eenp eenpVar) {
        throw new UnsupportedOperationException("Cannot set unused SipTransportErrorListener for Single-Reg SipTransport");
    }

    @Override // defpackage.eeno
    public final void k(eenz eenzVar) {
        this.b = eenzVar;
    }

    @Override // defpackage.eeno
    public final void l() {
        try {
            eenz eenzVar = this.b;
            if (eenzVar != null) {
                eenzVar.d();
            }
        } catch (IllegalMonitorStateException | UnsupportedOperationException e) {
            dkty.j(e, a, "Caught exception in SingleRegistrationSipTransport#terminate", new Object[0]);
        }
    }

    @Override // defpackage.eeno
    public final boolean n() {
        return false;
    }

    @Override // defpackage.eeno
    public final boolean o() {
        return false;
    }

    @Override // defpackage.eeno
    public final void h() {
    }

    @Override // defpackage.eeno
    public final void m(int i) {
    }
}
