package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackb {
    public static final entd a = entd.c("BugleSatelliteBg");
    public final Supplier b;
    public final errl c;
    public Instant d;
    public final acka e = new acka(this);

    public ackb(final ffbr ffbrVar, final fazb fazbVar, fazb fazbVar2) {
        this.c = (errl) fazbVar2.b();
        final emyl a2 = emys.a(new emyl() { // from class: acjy
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = ackb.a;
                acrx acrxVar = (acrx) fazb.this.b();
                final ffbr ffbrVar2 = ffbrVar;
                return acrxVar.a(new ffbr() { // from class: acjx
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return (acpg) ffbr.this.b();
                    }
                }, acua.BACKGROUND, "Bugle.Satellite.Background.JsBridgeEstablishDuration");
            }
        });
        a2.getClass();
        this.b = new Supplier() { // from class: acjz
            @Override // java.util.function.Supplier
            public final Object get() {
                return (acrw) emyl.this.get();
            }
        };
    }
}
