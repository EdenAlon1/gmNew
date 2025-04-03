package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbk {
    public final ffsk a;
    public final ffbr b;
    public final llv c;
    public final ffxx d;
    public final dqze e;
    public final drau f;
    public final dqza g;
    public final ffxx h;
    public final adak i;
    private final abbu j;
    private final ffxx k;

    public abbk(Context context, ffsk ffskVar, ffbr ffbrVar, abbu abbuVar, llv llvVar, ffxx ffxxVar, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        ffxx ffygVar;
        context.getClass();
        ffskVar.getClass();
        abbuVar.getClass();
        llvVar.getClass();
        ffxxVar.getClass();
        optional.getClass();
        optional2.getClass();
        optional3.getClass();
        this.a = ffskVar;
        this.b = ffbrVar;
        this.j = abbuVar;
        this.c = llvVar;
        this.d = ffxxVar;
        dqze dqzeVar = (dqze) fflm.b(optional);
        this.e = dqzeVar;
        this.i = (adak) fflm.b(optional2);
        this.f = (drau) fflm.b(optional3);
        dqza dqzaVar = (dqza) fflm.b(optional4);
        this.g = dqzaVar;
        fgcp fgcpVar = new fgcp(new abbg(this, null));
        this.k = fgcpVar;
        if (!ctjd.d() || dqzeVar == null || dqzaVar == null) {
            ffygVar = new ffyg(null);
        } else {
            ffbz a = ffca.a(new ffix() { // from class: abbd
                @Override // defpackage.ffix
                public final Object invoke() {
                    abbk abbkVar = abbk.this;
                    ffxx e = abbkVar.e.e();
                    int i = fgcz.a;
                    return fgbn.a(e, abbkVar.a, fgcy.b, 1);
                }
            });
            fgch fgchVar = new fgch(fgcpVar, ffxxVar, new abbi(null));
            abbj abbjVar = new abbj(null, a);
            int i = fgau.a;
            ffygVar = new fgen(abbjVar, fgchVar);
        }
        this.h = ffygVar;
        if (ctjd.d() && dqzeVar != null && ffkj.e(llvVar.b("has_pending_emotify_result"), true)) {
            axol.k(ffskVar, null, new abbf(this, null), 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ade r8, com.google.android.apps.messaging.shared.api.messaging.MessageId r9, defpackage.ffix r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.abbh
            if (r0 == 0) goto L13
            r0 = r11
            abbh r0 = (defpackage.abbh) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            abbh r0 = new abbh
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.b
            abbe r9 = r0.g
            java.lang.Object r10 = r0.a
            abbk r0 = r0.f
            defpackage.ffci.b(r11)
            r6 = r10
            r10 = r9
            r9 = r6
            goto L70
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            defpackage.ffci.b(r11)
            android.content.Intent r11 = r8.b
            r2 = 0
            if (r11 == 0) goto L54
            int r8 = r8.a
            r4 = -1
            if (r8 != r4) goto L48
            goto L49
        L48:
            r11 = r2
        L49:
            if (r11 == 0) goto L54
            java.lang.String r8 = "resultKey"
            android.os.Parcelable r8 = r11.getParcelableExtra(r8)
            android.net.Uri r8 = (android.net.Uri) r8
            goto L55
        L54:
            r8 = r2
        L55:
            if (r8 == 0) goto Laa
            dqze r11 = r7.e
            if (r11 == 0) goto L77
            r0.f = r7
            r0.a = r9
            r2 = r10
            abbe r2 = (defpackage.abbe) r2
            r0.g = r2
            r0.b = r8
            r0.e = r3
            java.lang.Object r11 = r11.b(r8, r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r0 = r7
        L70:
            r2 = r11
            dqzc r2 = (defpackage.dqzc) r2
            r11 = r2
            r2 = r9
            r9 = r0
            goto L7a
        L77:
            r11 = r2
            r2 = r9
            r9 = r7
        L7a:
            if (r11 == 0) goto L97
            abbu r0 = r9.j
            apyb r1 = defpackage.apzb.b(r11)
            cmrx r3 = defpackage.cmrx.EMOTIFY_CREATION
            cmrm r4 = defpackage.cmrm.ADD_REACTION
            r5 = 0
            r0.a(r1, r2, r3, r4, r5)
            adak r8 = r9.i
            if (r8 == 0) goto L93
            drat r11 = defpackage.drat.c
            r8.d(r11)
        L93:
            r10.invoke()
            goto Lb4
        L97:
            java.util.Objects.toString(r8)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Can't create sticker from "
            java.lang.String r8 = r10.concat(r8)
            r9.<init>(r8)
            throw r9
        Laa:
            adak r8 = r7.i
            if (r8 == 0) goto Lb3
            drat r9 = defpackage.drat.a
            r8.d(r9)
        Lb3:
            r9 = r7
        Lb4:
            drau r8 = r9.f
            if (r8 == 0) goto Lbb
            r8.a()
        Lbb:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbk.a(ade, com.google.android.apps.messaging.shared.api.messaging.MessageId, ffix, ffgu):java.lang.Object");
    }
}
