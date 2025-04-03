package defpackage;

import android.content.Context;
import android.net.Network;
import java.net.Inet4Address;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eenv implements eenq {
    private static final engw a = engw.u("8.8.8.8", "8.8.4.4", "2001:4860:4860:0:0:0:0:8888", "2001:4860:4860:0:0:0:0:8844");
    private final eece b;
    private final dikj c;
    private final Context d;
    private final dktn e;
    private final boolean f;
    private final boolean g;
    private final eedx h;

    public eenv(Context context, dikj dikjVar, eece eeceVar, dktn dktnVar, eedx eedxVar, boolean z, boolean z2) {
        this.d = context;
        this.c = dikjVar;
        this.b = eeceVar;
        this.e = dktnVar;
        this.f = z;
        this.g = z2;
        this.h = eedxVar;
    }

    private final List c(eeew eeewVar, String str, eejk eejkVar, boolean z, String str2, int i) {
        eejv eekaVar;
        if (i > 0) {
            return engw.r(new eejm(str2, str2, i, eejkVar));
        }
        dkty.l(this.e, "Discovering sip proxies for pcscf:[%s] over protocol:[%s]", str2, eejkVar);
        if (this.f) {
            eekaVar = new eejt(eeewVar, new eejl(((Boolean) dizg.o().a.d.a()).booleanValue() || z, this.g, eejkVar, emux.a));
        } else {
            eekaVar = new eeka(eeewVar, new eejl(false, this.g, eejkVar, emxc.j(this.e)));
        }
        List b = eekaVar.b(str2);
        b.getClass();
        if (b.isEmpty()) {
            dkty.h(this.e, "DNS lookup of %s failed! No results from discovery over %s network[%s]", str2, true != z ? "IPv6" : "IPv4", str);
            throw new eens(this.e.a);
        }
        dkty.k("SIP discovery results: %s", b);
        return b;
    }

    private static boolean d(String str) {
        return erlu.a(str) instanceof Inet4Address;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048 A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2 A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ea A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016d A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01cd A[Catch: all -> 0x01fd, TRY_LEAVE, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0111 A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7 A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0065 A[Catch: all -> 0x01fd, TryCatch #2 {all -> 0x01fd, blocks: (B:4:0x0003, B:6:0x0009, B:8:0x001d, B:11:0x0024, B:12:0x0042, B:14:0x0048, B:15:0x0081, B:17:0x00c2, B:18:0x00cb, B:20:0x00ea, B:21:0x0133, B:24:0x0156, B:26:0x0169, B:28:0x016d, B:36:0x0197, B:43:0x01ad, B:45:0x01bd, B:46:0x01c8, B:50:0x01fe, B:52:0x01cd, B:54:0x0162, B:55:0x0111, B:56:0x00c7, B:57:0x0065, B:58:0x0029, B:59:0x01f7, B:60:0x01fc), top: B:3:0x0003, inners: #0 }] */
    @Override // defpackage.eenq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.eeno a(defpackage.eejk r20, android.net.Network r21, java.lang.String r22, java.lang.String r23, java.util.List r24, java.lang.String r25, int r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eenv.a(eejk, android.net.Network, java.lang.String, java.lang.String, java.util.List, java.lang.String, int):eeno");
    }

    final eeno b(String str, eekc eekcVar, Network network, String str2, eejk eejkVar) {
        int a2 = eech.a();
        dkty.d(this.e, "Local IP address is %s:%d", dktx.IP_ADDRESS.c(str2), Integer.valueOf(a2));
        str2.getClass();
        String d = eekcVar.d();
        d.getClass();
        return new eeny(this.d, network, str2, a2, d, eekcVar.a(), str, this.c, this.e, this.b, eejkVar);
    }
}
