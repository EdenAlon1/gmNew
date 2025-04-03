package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vgc extends vk {
    final /* synthetic */ vgf a;
    private final Optional d;

    public vgc(vgf vgfVar, Optional optional) {
        this.a = vgfVar;
        this.d = optional;
    }

    @Override // defpackage.vk
    public final int a() {
        return this.a.g.getResources().getBoolean(R.bool.should_remove_reaction) ? ((enou) vfe.b).c : ((enou) vfe.a).c;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new vge(this.a, LayoutInflater.from(this.a.g).inflate(R.layout.reaction_selection_item, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    @Override // defpackage.vk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void g(defpackage.wr r7, int r8) {
        /*
            r6 = this;
            vge r7 = (defpackage.vge) r7
            vgf r0 = r6.a
            android.content.Context r0 = r0.g
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131034197(0x7f050055, float:1.7678905E38)
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L1c
            engw r0 = defpackage.vfe.b
            java.lang.Object r8 = r0.get(r8)
            cmrv r8 = (defpackage.cmrv) r8
            goto L24
        L1c:
            engw r0 = defpackage.vfe.a
            java.lang.Object r8 = r0.get(r8)
            cmrv r8 = (defpackage.cmrv) r8
        L24:
            j$.util.Optional r0 = r6.d
            boolean r0 = r0.isPresent()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            j$.util.Optional r0 = r6.d
            java.lang.Object r0 = r0.get()
            cmrl r0 = (defpackage.cmrl) r0
            int r0 = r0.e
            cmrv r0 = defpackage.cmrv.b(r0)
            if (r0 != 0) goto L40
            cmrv r0 = defpackage.cmrv.UNRECOGNIZED
        L40:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L48
            r0 = r1
            goto L49
        L48:
            r0 = r2
        L49:
            vgf r3 = r7.w
            vfc r3 = r3.b
            com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub r4 = r7.u
            cwqp r3 = r3.a(r4, r8)
            r7.v = r3
            vgf r3 = r7.w
            android.content.Context r3 = r3.g
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = defpackage.vfe.a(r3, r8)
            if (r0 == 0) goto L6f
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 2132087309(0x7f15120d, float:1.981487E38)
            java.lang.String r1 = r3.getString(r2, r1)
            goto L7a
        L6f:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r4
            r2 = 2132086986(0x7f1510ca, float:1.9814215E38)
            java.lang.String r1 = r3.getString(r2, r1)
        L7a:
            android.view.View r2 = r7.s
            r2.setContentDescription(r1)
            android.view.View r1 = r7.s
            vgf r2 = r7.w
            elbx r2 = r2.d
            vgd r4 = new vgd
            r4.<init>()
            elay r8 = new elay
            java.lang.String r5 = "ReactionViewHolder_onClick"
            r8.<init>(r2, r5, r4)
            r1.setOnClickListener(r8)
            if (r0 == 0) goto Laa
            android.view.View r8 = r7.t
            vgf r7 = r7.w
            android.content.Context r7 = r7.g
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r0 = 2131232695(0x7f0807b7, float:1.8081507E38)
            android.graphics.drawable.Drawable r7 = r3.getDrawable(r0, r7)
            r8.setBackground(r7)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgc.g(wr, int):void");
    }
}
