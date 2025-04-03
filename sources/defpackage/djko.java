package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djko extends djjt {
    private final int l;
    private final int m;

    public djko(Context context, int i, dihi dihiVar, dktn dktnVar, dikj dikjVar) {
        super(context, i, dihiVar, dktnVar, dikjVar);
        int i2;
        int i3 = i - 1;
        if (i3 != 0) {
            i2 = 1;
            if (i3 != 1) {
                i2 = i3 != 4 ? 8 : 17;
            }
        } else {
            i2 = 0;
        }
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.djjt
    public final int b() {
        return this.m;
    }

    @Override // defpackage.djjt
    public final int c() {
        return this.l;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:0|1|(2:3|(3:5|6|(1:8)(2:10|11)))|12|13|14|15|(3:17|(2:19|20)(2:22|(2:24|25)(2:26|(2:28|29)(2:30|(2:32|33)(2:34|(2:36|37)(1:38)))))|21)|40|41|(1:(2:119|120)(3:43|(2:45|46)(4:48|(4:51|(4:56|57|(2:113|114)(0)|63)|115|49)|118|(2:67|68)(2:65|66))|47))|(1:70)|72|(1:74)(1:107)|75|76|77|(1:79)(1:104)|80|(3:82|(2:84|85)(2:87|(2:94|95))|86)|102|103|96|6|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022f, code lost:
    
        defpackage.dkty.t(r0, r17.j, "Can't get network info, missing permissions", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00c4, code lost:
    
        defpackage.dkty.t(r0, r17.j, "Can't fill link properties, missing permissions", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0160, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0161, code lost:
    
        defpackage.dkty.t(r0, r17.j, "Failed to setup network interface, trying a workaround", new java.lang.Object[0]);
        r6 = r17.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0170, code lost:
    
        r0 = d().d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0180, code lost:
    
        if (r0 != null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0188, code lost:
    
        r0 = java.net.InetAddress.getLocalHost();
        r17.h = defpackage.a.h(r6, "workaround-if-for-type-");
        defpackage.dkty.d(r17.j, "INTERFACE NAME=%s", r17.h);
        r17.e.e(r0.getHostAddress());
        defpackage.dkty.l(r17.j, "Set IP address via fallback: %s", defpackage.dktx.IP_ADDRESS.c(r0.getHostAddress()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01c0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c1, code lost:
    
        defpackage.dkty.j(r0, r17.j, "Workaround failed, too.", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0175, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0176, code lost:
    
        defpackage.dkty.t(r0, r17.j, "Can't get active network info, missing permissions", new java.lang.Object[0]);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0257 A[RETURN] */
    @Override // defpackage.djjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djko.j():void");
    }
}
