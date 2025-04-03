package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avsc implements avrk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer");
    private final avrk b;
    private final cjzh c;
    private final ffbr d;
    private final errl e;

    public avsc(avrk avrkVar, cjzh cjzhVar, ffbr ffbrVar, errl errlVar) {
        this.b = avrkVar;
        this.c = cjzhVar;
        this.d = ffbrVar;
        this.e = errlVar;
    }

    private final boolean c(awui awuiVar) {
        return this.c.a(awuiVar);
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        enhd enhdVar = new enhd();
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            awui awuiVar = (awui) it.next();
            if ((awuiVar.b & 2) != 0 && !awuiVar.d.isEmpty()) {
                awuh b = awuh.b(awuiVar.c);
                if (b == null) {
                    b = awuh.UNKNOWN_TYPE;
                }
                if (b != awuh.GROUP) {
                    engrVar.h(awuiVar);
                }
            }
            enhdVar.k(awuiVar, avmz.d());
        }
        final enhk c = enhdVar.c();
        engw g = engrVar.g();
        ensk e = a.e();
        e.Y(ente.a, "BugleRcsCapabilities");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer", "getBatchCapabilities", 79, "RcsCapabilitiesProviderPreconditionsLayer.java")).u("RcsCapabilitiesProviderPreconditionsLayer#getBatchCapabilities: Received %s invalid and %s valid ChatEndpoints", ((enoz) c).d, ((enou) g).c);
        return this.b.a(g).h(new emwl() { // from class: avsb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                enhd enhdVar2 = new enhd();
                enhdVar2.g((Map) obj);
                enhdVar2.g(enhk.this);
                return enhdVar2.c();
            }
        }, this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (c(r7) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
    
        if (c(r7) == false) goto L33;
     */
    @Override // defpackage.avrk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl b(defpackage.awui r7) {
        /*
            r6 = this;
            ffbr r0 = r6.d
            java.lang.Object r0 = r0.b()
            asuu r0 = (defpackage.asuu) r0
            boolean r0 = r0.a()
            java.lang.String r1 = "getCapabilities"
            java.lang.String r2 = "com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesProviderPreconditionsLayer"
            java.lang.String r3 = "RcsCapabilitiesProviderPreconditionsLayer.java"
            java.lang.String r4 = "BugleRcsCapabilities"
            if (r0 == 0) goto L4f
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            int r0 = r7.c
            awuh r0 = defpackage.awuh.b(r0)
            if (r0 != 0) goto L2e
            awuh r0 = defpackage.awuh.UNKNOWN_TYPE
        L2e:
            awuh r5 = defpackage.awuh.GROUP
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 != 0) goto L9d
            int r0 = r7.c
            awuh r0 = defpackage.awuh.b(r0)
            if (r0 != 0) goto L40
            awuh r0 = defpackage.awuh.UNKNOWN_TYPE
        L40:
            awuh r5 = defpackage.awuh.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L76
            boolean r0 = r6.c(r7)
            if (r0 == 0) goto L76
            goto L9d
        L4f:
            int r0 = r7.c
            awuh r0 = defpackage.awuh.b(r0)
            if (r0 != 0) goto L59
            awuh r0 = defpackage.awuh.UNKNOWN_TYPE
        L59:
            awuh r5 = defpackage.awuh.PHONE
            boolean r0 = j$.util.Objects.equals(r0, r5)
            if (r0 == 0) goto L9d
            int r0 = r7.b
            r0 = r0 & 2
            if (r0 == 0) goto L9d
            java.lang.String r0 = r7.d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L9d
            boolean r0 = r6.c(r7)
            if (r0 == 0) goto L76
            goto L9d
        L76:
            enru r0 = defpackage.avsc.a
            ensk r0 = r0.e()
            ensn r5 = defpackage.ente.a
            r0.Y(r5, r4)
            enrr r0 = (defpackage.enrr) r0
            r4 = 58
            ensk r0 = r0.h(r2, r1, r4, r3)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = r7.d
            java.lang.String r1 = defpackage.cskt.b(r1)
            java.lang.String r2 = "RcsCapabilitiesProviderPreconditionsLayer: return downstreamProvider.getCapabilities for chatEndpoint %s"
            r0.t(r2, r1)
            avrk r0 = r6.b
            elfl r7 = r0.b(r7)
            return r7
        L9d:
            enru r0 = defpackage.avsc.a
            ensk r0 = r0.e()
            ensn r5 = defpackage.ente.a
            r0.Y(r5, r4)
            enrr r0 = (defpackage.enrr) r0
            r4 = 52
            ensk r0 = r0.h(r2, r1, r4, r3)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r7 = r7.d
            java.lang.String r7 = defpackage.cskt.b(r7)
            java.lang.String r1 = "RcsCapabilitiesProviderPreconditionsLayer: return RcsCapabilitiesWithMetadata.empty for chatEndpoint %s"
            r0.t(r1, r7)
            avmz r7 = defpackage.avmz.d()
            elfl r7 = defpackage.elfo.e(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avsc.b(awui):elfl");
    }
}
