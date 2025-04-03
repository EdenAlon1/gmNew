package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acqc {
    public static final cskc a = cskc.g("Bugle", "JsBridgeAppController");
    public final acrw b;
    public final acjc c;
    public final errl d;
    public final AtomicBoolean e = new AtomicBoolean(true);
    private final aclb f;

    public acqc(acrx acrxVar, acjc acjcVar, aclb aclbVar, errl errlVar, ffbr ffbrVar) {
        this.c = acjcVar;
        this.f = aclbVar;
        this.d = errlVar;
        this.b = acrxVar.a(ffbrVar, acua.FOREGROUND, "Bugle.Satellimessaging/dittosatellite/gaia:annotationste.Foreground.JsBridgeEstablishDuration");
    }

    public final elfl a(final erog erogVar) {
        return this.f.c().i(new eroh() { // from class: acqb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((Boolean) obj).booleanValue() ? erog.this.a() : elfo.e(null);
            }
        }, this.d);
    }

    public final void b() {
        if (this.e.compareAndSet(false, true)) {
            this.b.c().e(Exception.class, new emwl() { // from class: acpz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    acqc.a.s("Could not pause foreground Ditto.", (Exception) obj);
                    return false;
                }
            }, this.d).k(axnw.b(), this.d);
            a(new erog() { // from class: acqa
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    acqc acqcVar = acqc.this;
                    return acqcVar.c.d().h(new emwl() { // from class: acpy
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return null;
                        }
                    }, acqcVar.d);
                }
            }).k(axnw.b(), this.d);
        }
    }
}
