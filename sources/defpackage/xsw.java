package defpackage;

import android.content.Context;
import android.provider.Telephony;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsw {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter");
    private static final String e;
    private static final cfup f;
    public final Context b;
    public final ffhd c;
    public final csum d;
    private final ffhd g;
    private final cbgh h;
    private final Set i;

    static {
        String authority = Telephony.Mms.CONTENT_URI.getAuthority();
        authority.getClass();
        e = authority;
        f = cfvl.i(cfvl.b, "allow_forwarding_and_sharing_authority_kill_switch", false);
    }

    public xsw(Context context, ffhd ffhdVar, ffhd ffhdVar2, csum csumVar, cbgh cbghVar) {
        context.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        csumVar.getClass();
        cbghVar.getClass();
        this.b = context;
        this.g = ffhdVar;
        this.c = ffhdVar2;
        this.d = csumVar;
        this.h = cbghVar;
        ffgg ffggVar = new ffgg();
        ffggVar.add(e);
        ffggVar.add(cbgj.a(context));
        ffggVar.add(cbgn.a(context));
        ffggVar.add(apms.a(context));
        if (!((Boolean) f.e()).booleanValue()) {
            ffggVar.add(cbghVar.a);
        }
        this.i = fffi.a(ffggVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00bd, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00b4 -> B:10:0x00b7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.doxs r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.xst
            if (r0 == 0) goto L13
            r0 = r7
            xst r0 = (defpackage.xst) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xst r0 = new xst
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r6 = r0.a
            xsw r2 = r0.e
            defpackage.ffci.b(r7)
            goto Lb7
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r7)
            boolean r7 = r6 instanceof defpackage.doyc
            if (r7 == 0) goto L49
            java.lang.String r6 = r6.f()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.ffdx.b(r6)
            goto L8e
        L49:
            boolean r7 = r6 instanceof defpackage.drlh
            if (r7 == 0) goto L5c
            drlh r6 = (defpackage.drlh) r6
            java.lang.String r6 = r6.f()
            android.net.Uri r6 = android.net.Uri.parse(r6)
            java.util.List r6 = defpackage.ffdx.b(r6)
            goto L8e
        L5c:
            boolean r7 = r6 instanceof defpackage.drli
            if (r7 == 0) goto Lc4
            drli r6 = (defpackage.drli) r6
            java.lang.Iterable r6 = r6.c()
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L75:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8d
            java.lang.Object r2 = r6.next()
            drlh r2 = (defpackage.drlh) r2
            java.lang.String r2 = r2.f()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r7.add(r2)
            goto L75
        L8d:
            r6 = r7
        L8e:
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L96
        L94:
            r3 = r4
            goto Lbf
        L96:
            java.util.Iterator r6 = r6.iterator()
            r2 = r5
        L9b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L94
            java.lang.Object r7 = r6.next()
            android.net.Uri r7 = (android.net.Uri) r7
            r7.getClass()
            r0.e = r2
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r2.b(r7, r0)
            if (r7 != r1) goto Lb7
            return r1
        Lb7:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L9b
        Lbf:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        Lc4:
            enru r7 = defpackage.xsw.a
            ensk r7 = r7.i()
            ensn r0 = defpackage.ente.a
            java.lang.String r1 = "BugleComposeRow2"
            r7.Y(r0, r1)
            java.lang.String r0 = "isAllowed"
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/AttachmentSecurityFilter"
            java.lang.String r4 = "AttachmentSecurityFilter.kt"
            ensk r7 = r7.h(r2, r0, r1, r4)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "AttachmentSecurityFilter unable to inspect URI for %s"
            r7.t(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsw.a(doxs, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.net.Uri r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.xsu
            if (r0 == 0) goto L13
            r0 = r9
            xsu r0 = (defpackage.xsu) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xsu r0 = new xsu
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            ekzz r8 = r0.d
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2a
            goto L75
        L2a:
            r9 = move-exception
            goto L89
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            defpackage.ffci.b(r9)
            java.lang.String r9 = "AttachmentSecurityFilter#isAllowedUri"
            ekzz r9 = defpackage.eleg.f(r9)
            java.lang.String r2 = r8.getScheme()     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = "content"
            boolean r2 = defpackage.ffkj.e(r2, r5)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5d
            java.util.Set r2 = r7.i     // Catch: java.lang.Throwable -> L85
            java.lang.String r5 = r8.getAuthority()     // Catch: java.lang.Throwable -> L85
            boolean r2 = defpackage.ffdx.au(r2, r5)     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L5d
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L85
            defpackage.ffig.a(r9, r3)
            return r8
        L5d:
            ffhd r2 = r7.g     // Catch: java.lang.Throwable -> L85
            ffhd r2 = defpackage.ekxi.a(r2)     // Catch: java.lang.Throwable -> L85
            xsv r5 = new xsv     // Catch: java.lang.Throwable -> L85
            r5.<init>(r3, r7, r8)     // Catch: java.lang.Throwable -> L85
            r0.d = r9     // Catch: java.lang.Throwable -> L85
            r0.c = r4     // Catch: java.lang.Throwable -> L85
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)     // Catch: java.lang.Throwable -> L85
            if (r8 == r1) goto L84
            r6 = r9
            r9 = r8
            r8 = r6
        L75:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L2a
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L2a
            r9 = r9 ^ r4
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L2a
            defpackage.ffig.a(r8, r3)
            return r9
        L84:
            return r1
        L85:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L89:
            throw r9     // Catch: java.lang.Throwable -> L8a
        L8a:
            r0 = move-exception
            defpackage.ffig.a(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsw.b(android.net.Uri, ffgu):java.lang.Object");
    }
}
