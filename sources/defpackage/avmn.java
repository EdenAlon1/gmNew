package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avmn extends avmm {
    private volatile transient boolean c;
    private volatile transient boolean d;

    public avmn(avoi avoiVar, Instant instant) {
        super(avoiVar, instant);
    }

    @Override // defpackage.avmz
    public final boolean c() {
        boolean z;
        if (!this.d) {
            synchronized (this) {
                if (!this.d) {
                    eygr eygrVar = this.a.b;
                    avoj avojVar = (avoj) avok.a.createBuilder();
                    avojVar.copyOnWrite();
                    avok avokVar = (avok) avojVar.instance;
                    avokVar.b |= 1;
                    avokVar.c = "+g.3gpp.iari-ref";
                    avojVar.copyOnWrite();
                    avok avokVar2 = (avok) avojVar.instance;
                    avokVar2.b |= 2;
                    avokVar2.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im";
                    if (!eygrVar.contains(avojVar.build())) {
                        eygr eygrVar2 = this.a.b;
                        avoj avojVar2 = (avoj) avok.a.createBuilder();
                        avojVar2.copyOnWrite();
                        avok avokVar3 = (avok) avojVar2.instance;
                        avokVar3.b |= 1;
                        avokVar3.c = "+g.3gpp.iari-ref";
                        avojVar2.copyOnWrite();
                        avok avokVar4 = (avok) avojVar2.instance;
                        avokVar4.b |= 2;
                        avokVar4.d = "urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp";
                        if (!eygrVar2.contains(avojVar2.build())) {
                            z = false;
                            this.c = z;
                            this.d = true;
                        }
                    }
                    z = true;
                    this.c = z;
                    this.d = true;
                }
            }
        }
        return this.c;
    }
}
