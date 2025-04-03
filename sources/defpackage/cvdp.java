package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.gms.duokit.DuoId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdp implements cvfd {
    public final dgea b;
    public final ffbr c;
    private final Context e;
    private final ffbr f;
    private final cvff g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final aleq l;
    private final ffhd m;
    private final ffhd n;
    private final cvge o;
    private final ffbr p;
    private static final ctvf d = new ctvf(52);
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/video/BugleVideoCalling2");

    public cvdp(Context context, ffbr ffbrVar, cvff cvffVar, ffbr ffbrVar2, dgea dgeaVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, aleq aleqVar, ffhd ffhdVar, ffhd ffhdVar2, ffbr ffbrVar6, cvge cvgeVar, ffbr ffbrVar7) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        dgeaVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        aleqVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.e = context;
        this.f = ffbrVar;
        this.g = cvffVar;
        this.h = ffbrVar2;
        this.b = dgeaVar;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = aleqVar;
        this.m = ffhdVar;
        this.n = ffhdVar2;
        this.c = ffbrVar6;
        this.o = cvgeVar;
        this.p = ffbrVar7;
    }

    public static final DuoId i(ResolvedRecipient resolvedRecipient) {
        DuoId duoId = new DuoId();
        duoId.b = resolvedRecipient.g().o();
        return duoId;
    }

    private final void j(int i, ConversationId conversationId, boolean z) {
        ((akzt) this.j.b()).e("Bugle.UI.VideoCallButton.Clicked", i);
        eovs eovsVar = (eovs) eovu.a.createBuilder();
        eovsVar.getClass();
        eovsVar.copyOnWrite();
        eovu.a((eovu) eovsVar.instance);
        int i2 = z ? ((Boolean) cvfg.f.e()).booleanValue() ? 3 : ((Boolean) cvfg.e.e()).booleanValue() ? 2 : ((Boolean) cvfg.d.e()).booleanValue() ? 4 : 1 : 5;
        eovsVar.copyOnWrite();
        eovu eovuVar = (eovu) eovsVar.instance;
        eovuVar.i = i2 - 1;
        eovuVar.b |= 128;
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_VIDEO_CALL_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        int a2 = cvfc.a(i);
        eovsVar.copyOnWrite();
        eovu eovuVar2 = (eovu) eovsVar.instance;
        eovuVar2.c = a2 - 1;
        eovuVar2.b |= 1;
        eovu eovuVar3 = (eovu) eovsVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eovuVar3.getClass();
        eolvVar2.ac = eovuVar3;
        eolvVar2.c |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        eokv eokvVar = (eokv) eokw.a.createBuilder();
        long c = ((akvz) this.p.b()).c(conversationId.b());
        eokvVar.copyOnWrite();
        eokw eokwVar = (eokw) eokvVar.instance;
        eokwVar.b |= 65536;
        eokwVar.r = c;
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eokw eokwVar2 = (eokw) eokvVar.build();
        eokwVar2.getClass();
        eolvVar3.m = eokwVar2;
        eolvVar3.b |= 8;
        ((akxl) this.k.b()).j(eoluVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cvfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.engw r7, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cvdj
            if (r0 == 0) goto L13
            r0 = r9
            cvdj r0 = (defpackage.cvdj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvdj r0 = new cvdj
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L35
            if (r2 != r5) goto L2d
            aler r7 = r0.e
            cvdp r8 = r0.d
            defpackage.ffci.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r9)
            ffbr r9 = r6.i
            java.lang.Object r9 = r9.b()
            adsd r9 = (defpackage.adsd) r9
            r2 = 32
            r9.a(r2)
            aleq r9 = r6.l
            r2 = 176581(0x2b1c5, float:2.47443E-40)
            aler r9 = defpackage.alep.b(r9, r2)
            java.lang.Object r2 = defpackage.ffdx.K(r7)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r2 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r2
            aqry r2 = r2.m()
            aqrv r2 = (defpackage.aqrv) r2
            int r2 = r2.d
            r6.j(r2, r8, r4)
            ffhd r8 = r6.n
            ffhd r8 = defpackage.ekxi.a(r8)
            cvdi r2 = new cvdi
            r2.<init>(r3, r6, r7)
            r0.d = r6
            r0.e = r9
            r0.c = r5
            java.lang.Object r7 = defpackage.ffra.a(r8, r2, r0)
            if (r7 == r1) goto L99
            r8 = r9
            r9 = r7
            r7 = r8
            r8 = r6
        L7a:
            r9.getClass()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L89
            r7.c()
            return r9
        L89:
            r0 = 3
            defpackage.alfa.a(r7, r3, r0)
            android.content.Context r7 = r8.e
            java.lang.String r8 = "Error making video call."
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r8, r4)
            r7.show()
            return r9
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdp.a(engw, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId, ffgu):java.lang.Object");
    }

    @Override // defpackage.cvfd
    public final Object b(engw engwVar, alxj alxjVar, ffgu ffguVar) {
        if (engwVar.isEmpty() || alxjVar.g().h() || !this.g.a()) {
            return false;
        }
        return ffra.a(ekxi.a(this.m), new cvdh(null, engwVar, this), ffguVar);
    }

    @Override // defpackage.cvfd
    public final Object c(ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.m), new cvdk(null, this, resolvedRecipient), ffguVar);
    }

    @Override // defpackage.cvfd
    public final Object d(ffgu ffguVar) {
        return ffra.a(ekxi.a(this.m), new cvdl(null, this), ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.List r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cvdm
            if (r0 == 0) goto L13
            r0 = r6
            cvdm r0 = (defpackage.cvdm) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cvdm r0 = new cvdm
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            cvdp r0 = r0.e
            defpackage.ffci.b(r6)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ffci.b(r6)
            r0.e = r4
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = r4.d(r0)
            if (r6 == r1) goto Ldc
            r0 = r4
        L43:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r1 = 10
            if (r6 == 0) goto L81
            cvge r6 = r0.o
            r2 = 6
            r6.b(r2)
            ffbr r6 = r0.h
            java.lang.Object r6 = r6.b()
            cveh r6 = (defpackage.cveh) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.ffdx.n(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L68:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L7c
            java.lang.Object r1 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            aoku r1 = r1.g()
            r0.add(r1)
            goto L68
        L7c:
            elfl r5 = r6.d(r0)
            return r5
        L81:
            int r6 = r5.size()
            if (r6 != r3) goto La6
            cvge r6 = r0.o
            r6.a()
            ffbr r6 = r0.h
            java.lang.Object r6 = r6.b()
            cveh r6 = (defpackage.cveh) r6
            java.lang.Object r5 = defpackage.ffdx.T(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            aoku r5 = r5.g()
            elfl r5 = r6.a(r5)
            r5.getClass()
            return r5
        La6:
            cvge r6 = r0.o
            r6.a()
            ffbr r6 = r0.h
            java.lang.Object r6 = r6.b()
            cveh r6 = (defpackage.cveh) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = defpackage.ffdx.n(r5, r1)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        Lc0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Ld4
            java.lang.Object r1 = r5.next()
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r1 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r1
            aoku r1 = r1.g()
            r0.add(r1)
            goto Lc0
        Ld4:
            elfl r5 = r6.b(r0)
            r5.getClass()
            return r5
        Ldc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdp.e(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.cvfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.engw r8, defpackage.engw r9, defpackage.alxj r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvdp.f(engw, engw, alxj, ffgu):java.lang.Object");
    }

    @Override // defpackage.cvfd
    public final Object g(ResolvedRecipient resolvedRecipient, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.m), new cvdo(null, this, resolvedRecipient), ffguVar);
    }

    @Override // defpackage.cvfd
    public final void h(ResolvedRecipient resolvedRecipient, ConversationId conversationId) {
        aler b;
        b = this.l.b(176581, null);
        Uri fromParts = Uri.fromParts("tel", resolvedRecipient.g().p(true), null);
        Intent a2 = akuv.d("android.intent.action.CALL").a();
        a2.getClass();
        a2.setData(fromParts);
        a2.putExtra("android.telecom.extra.START_CALL_WITH_VIDEO_STATE", 3);
        a2.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        j(((aqrv) resolvedRecipient.m()).d, conversationId, true);
        try {
            b.c();
            eldl.p(this.e, a2);
        } catch (ActivityNotFoundException unused) {
            alfa.a(b, null, 3);
            Toast.makeText(this.e, "Error making LTE video call.", 0).show();
        }
    }
}
