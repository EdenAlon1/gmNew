package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oia {
    public final okl a;
    public final ojd b;
    public final ffxx c;
    public final okt d;
    public final ffix e;
    public final oet f;
    public final AtomicBoolean g;
    public final ffwm h;
    public final oib i;
    public final ffxx j;
    private final Object k;
    private final ffuf l;

    public oia(Object obj, okl oklVar, ojd ojdVar, ffxx ffxxVar, ffix ffixVar) {
        oklVar.getClass();
        this.k = obj;
        this.a = oklVar;
        this.b = ojdVar;
        this.c = ffxxVar;
        this.d = null;
        this.e = ffixVar;
        if (ojdVar.f != Integer.MIN_VALUE && !oklVar.d()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.f = new oet();
        this.g = new AtomicBoolean(false);
        this.h = ffwp.a(-2, 0, 6);
        this.i = new oib(ojdVar);
        ffuf ffufVar = new ffuf(null);
        this.l = ffufVar;
        this.j = new ffzh(new ohv(this, null), oky.a(new odi(ffufVar, new ohu(this, null), null)));
    }

    private final oke i(ofz ofzVar, Object obj) {
        int i = ofzVar == ofz.a ? this.b.d : this.b.a;
        ojd ojdVar = this.b;
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        boolean z = ojdVar.c;
        if (ordinal == 0) {
            return new okd(obj, i, z);
        }
        if (ordinal == 1) {
            if (obj != null) {
                return new okc(obj, i, z);
            }
            throw new IllegalArgumentException("key cannot be null for prepend");
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        if (obj != null) {
            return new okb(obj, i, z);
        }
        throw new IllegalArgumentException("key cannot be null for append");
    }

    private final Object j(oie oieVar, ofz ofzVar, int i, int i2) {
        int i3;
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Cannot get loadId for loadType: REFRESH");
        }
        if (ordinal == 1) {
            i3 = oieVar.e;
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            i3 = oieVar.f;
        }
        if (i != i3 || (oieVar.j.a(ofzVar) instanceof ofu) || i2 >= this.b.b) {
            return null;
        }
        return ofzVar == ofz.b ? ((oki) ffdx.K(oieVar.c)).c : ((oki) ffdx.P(oieVar.c)).d;
    }

    private final Object k(oie oieVar, ofz ofzVar, ofu ofuVar, ffgu ffguVar) {
        if (!ffkj.e(oieVar.j.a(ofzVar), ofuVar)) {
            oieVar.j.d(ofzVar, ofuVar);
            Object a = this.h.a(new ogm(oieVar.j.b()), ffguVar);
            if (a == ffhh.a) {
                return a;
            }
        }
        return ffcu.a;
    }

    private final void l() {
        g();
        this.a.e();
    }

    private static final String m(ofz ofzVar, Object obj, okj okjVar) {
        if (okjVar == null) {
            return a.k(obj, ofzVar, "End ", " with loadkey ", ". Load CANCELLED.");
        }
        return "End " + ofzVar + " with loadKey " + obj + ". Returned " + okjVar;
    }

    public final Object a(ffxx ffxxVar, ofz ofzVar, ffgu ffguVar) {
        Object a = ffyo.a(oen.a(oen.b(ffxxVar, new ohd(null, this, ofzVar)), new ohe(ofzVar, null))).a(new ohf(this, ofzVar), ffguVar);
        return a == ffhh.a ? a : ffcu.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.ohj
            if (r0 == 0) goto L13
            r0 = r7
            ohj r0 = (defpackage.ohj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ohj r0 = new ohj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            fgjf r1 = r0.f
            oib r2 = r0.e
            oia r0 = r0.d
            defpackage.ffci.b(r7)
            goto L50
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            defpackage.ffci.b(r7)
            oib r2 = r6.i
            r0.d = r6
            r0.e = r2
            fgjb r7 = r2.a
            r5 = r7
            fgjf r5 = (defpackage.fgjf) r5
            r0.f = r5
            r0.c = r3
            java.lang.Object r0 = r7.a(r4, r0)
            if (r0 == r1) goto L65
            r0 = r6
            r1 = r7
        L50:
            oie r7 = r2.b     // Catch: java.lang.Throwable -> L60
            oet r0 = r0.f     // Catch: java.lang.Throwable -> L60
            oln r0 = r0.a()     // Catch: java.lang.Throwable -> L60
            okm r7 = r7.e(r0)     // Catch: java.lang.Throwable -> L60
            r1.b(r4)
            return r7
        L60:
            r7 = move-exception
            r1.b(r4)
            throw r7
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oia.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x014a, code lost:
    
        if (r14 == r1) goto L119;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0186 A[Catch: all -> 0x020c, TryCatch #5 {all -> 0x020c, blocks: (B:66:0x016d, B:68:0x0186, B:69:0x018f, B:71:0x0193), top: B:65:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0193 A[Catch: all -> 0x020c, TRY_LEAVE, TryCatch #5 {all -> 0x020c, blocks: (B:66:0x016d, B:68:0x0186, B:69:0x018f, B:71:0x0193), top: B:65:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oia.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
    
        r0 = r9.d;
        r7 = r9;
        r6 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x079f A[Catch: all -> 0x07b2, TRY_ENTER, TryCatch #1 {all -> 0x07b2, blocks: (B:60:0x0542, B:65:0x062a, B:67:0x0636, B:71:0x0652, B:73:0x0659, B:75:0x066a, B:76:0x06c9, B:105:0x0684, B:106:0x0698, B:107:0x0699, B:109:0x06a0, B:111:0x06a9, B:112:0x06ef, B:113:0x0717, B:115:0x0559, B:118:0x0563, B:121:0x056e, B:124:0x0575, B:126:0x057d, B:128:0x058b, B:130:0x0592, B:131:0x05b4, B:133:0x05bd, B:134:0x05c2, B:136:0x05cb, B:140:0x05e0, B:142:0x05e9, B:143:0x05f9, B:145:0x0600, B:146:0x060d, B:149:0x0625, B:150:0x0616, B:152:0x061a, B:153:0x0623, B:154:0x061f, B:155:0x0609, B:156:0x05f6, B:157:0x05c0, B:158:0x05a6, B:163:0x079f, B:164:0x07b1), top: B:59:0x0542 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0308 A[Catch: all -> 0x07bc, TRY_LEAVE, TryCatch #8 {all -> 0x07bc, blocks: (B:252:0x02f5, B:254:0x0308), top: B:251:0x02f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x062a A[Catch: all -> 0x07b2, TryCatch #1 {all -> 0x07b2, blocks: (B:60:0x0542, B:65:0x062a, B:67:0x0636, B:71:0x0652, B:73:0x0659, B:75:0x066a, B:76:0x06c9, B:105:0x0684, B:106:0x0698, B:107:0x0699, B:109:0x06a0, B:111:0x06a9, B:112:0x06ef, B:113:0x0717, B:115:0x0559, B:118:0x0563, B:121:0x056e, B:124:0x0575, B:126:0x057d, B:128:0x058b, B:130:0x0592, B:131:0x05b4, B:133:0x05bd, B:134:0x05c2, B:136:0x05cb, B:140:0x05e0, B:142:0x05e9, B:143:0x05f9, B:145:0x0600, B:146:0x060d, B:149:0x0625, B:150:0x0616, B:152:0x061a, B:153:0x0623, B:154:0x061f, B:155:0x0609, B:156:0x05f6, B:157:0x05c0, B:158:0x05a6, B:163:0x079f, B:164:0x07b1), top: B:59:0x0542 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0738 A[Catch: all -> 0x00db, TryCatch #7 {all -> 0x00db, blocks: (B:80:0x0723, B:82:0x0738, B:84:0x0742, B:86:0x0748, B:87:0x074d, B:88:0x074b, B:89:0x0750, B:231:0x00d1), top: B:230:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0748 A[Catch: all -> 0x00db, TryCatch #7 {all -> 0x00db, blocks: (B:80:0x0723, B:82:0x0738, B:84:0x0742, B:86:0x0748, B:87:0x074d, B:88:0x074b, B:89:0x0750, B:231:0x00d1), top: B:230:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x074b A[Catch: all -> 0x00db, TryCatch #7 {all -> 0x00db, blocks: (B:80:0x0723, B:82:0x0738, B:84:0x0742, B:86:0x0748, B:87:0x074d, B:88:0x074b, B:89:0x0750, B:231:0x00d1), top: B:230:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0792  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ofz r22, defpackage.oeo r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oia.d(ofz, oeo, ffgu):java.lang.Object");
    }

    public final Object e(ofz ofzVar, olp olpVar, ffgu ffguVar) {
        if (ofzVar.ordinal() == 0) {
            Object c = c(ffguVar);
            return c == ffhh.a ? c : ffcu.a;
        }
        if (olpVar == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        oet oetVar = this.f;
        ofzVar.getClass();
        if (ofzVar == ofz.b || ofzVar == ofz.c) {
            oetVar.a.a(null, new oer(ofzVar, olpVar));
            return ffcu.a;
        }
        Objects.toString(ofzVar);
        throw new IllegalArgumentException("invalid load type for reset: ".concat(ofzVar.toString()));
    }

    public final Object f(oie oieVar, ofz ofzVar, ffgu ffguVar) {
        if (!ffkj.e(oieVar.j.a(ofzVar), ofv.a)) {
            oieVar.j.d(ofzVar, ofv.a);
            Object a = this.h.a(new ogm(oieVar.j.b()), ffguVar);
            if (a == ffhh.a) {
                return a;
            }
        }
        return ffcu.a;
    }

    public final void g() {
        this.l.t(null);
    }

    public final void h(ffsk ffskVar) {
        if (this.b.f != Integer.MIN_VALUE) {
            ffqy.d(ffskVar, null, null, new ohx(this, null), 3);
        }
        ffqy.d(ffskVar, null, null, new ohy(this, null), 3);
        ffqy.d(ffskVar, null, null, new ohz(this, null), 3);
    }
}
