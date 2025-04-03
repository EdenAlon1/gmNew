package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzw {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog");
    public final Context b;
    public final ffsk c;
    public final alye d;
    public final aksx e;
    public final ajjc f;
    private final ygy g;

    public zzw(Context context, ffsk ffskVar, alye alyeVar, aksx aksxVar, ajjc ajjcVar, ygy ygyVar) {
        context.getClass();
        ffskVar.getClass();
        alyeVar.getClass();
        aksxVar.getClass();
        ajjcVar.getClass();
        ygyVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = alyeVar;
        this.e = aksxVar;
        this.f = ajjcVar;
        this.g = ygyVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        if (r10 != r1) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.alyv r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.zzg
            if (r0 == 0) goto L13
            r0 = r10
            zzg r0 = (defpackage.zzg) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zzg r0 = new zzg
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            java.lang.String r4 = "deleteScheduledMessage"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog"
            java.lang.String r6 = "ScheduledSendEditDialog.kt"
            r7 = 1
            if (r2 == 0) goto L40
            if (r2 == r7) goto L38
            if (r2 != r3) goto L30
            defpackage.ffci.b(r10)
            goto L9e
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.Object r9 = r0.a
            zzw r2 = r0.e
            defpackage.ffci.b(r10)
            goto L66
        L40:
            defpackage.ffci.b(r10)
            r0.e = r8
            r0.a = r9
            r0.d = r7
            ffrh r10 = new ffrh
            ffgu r2 = defpackage.ffhi.c(r0)
            r10.<init>(r2, r7)
            r10.B()
            ajjc r2 = r8.f
            zzn r7 = new zzn
            r7.<init>(r10, r8)
            defpackage.ajjb.b(r2, r7)
            java.lang.Object r10 = r10.m()
            if (r10 == r1) goto Ld3
            r2 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lba
            enru r10 = defpackage.zzw.a
            ensk r10 = r10.e()
            r7 = 102(0x66, float:1.43E-43)
            ensk r10 = r10.h(r5, r4, r7, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r7 = "Confirmed deleting scheduled message"
            r10.q(r7)
            alye r10 = r2.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r9 = r9.b()
            engw r9 = defpackage.engw.r(r9)
            cgrr r2 = defpackage.cgrr.MESSAGE_LIST_CONVO_V2_MANUAL_DELETION
            elfl r9 = r10.r(r9, r2)
            r10 = 0
            r0.e = r10
            r0.a = r10
            r0.d = r3
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 == r1) goto Ld3
        L9e:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto Ld0
            enru r9 = defpackage.zzw.a
            ensk r9 = r9.i()
            r10 = 113(0x71, float:1.58E-43)
            ensk r9 = r9.h(r5, r4, r10, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r10 = "Scheduled message was not deleted"
            r9.q(r10)
            goto Ld0
        Lba:
            enru r10 = defpackage.zzw.a
            ensk r10 = r10.e()
            r0 = 116(0x74, float:1.63E-43)
            ensk r10 = r10.h(r5, r4, r0, r6)
            enrr r10 = (defpackage.enrr) r10
            java.lang.String r0 = "User cancelled deleting scheduled message"
            r10.q(r0)
            r2.c(r9)
        Ld0:
            ffcu r9 = defpackage.ffcu.a
            return r9
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzw.a(alyv, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (r12 != r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.alyv r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.zzh
            if (r0 == 0) goto L13
            r0 = r12
            zzh r0 = (defpackage.zzh) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            zzh r0 = new zzh
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            java.lang.String r6 = "editScheduledMessage"
            java.lang.String r7 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/badges/ScheduledSendEditDialog"
            java.lang.String r8 = "ScheduledSendEditDialog.kt"
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            defpackage.ffci.b(r12)
            goto Lad
        L32:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3a:
            java.lang.Object r11 = r0.a
            zzw r2 = r0.e
            defpackage.ffci.b(r12)
            goto L72
        L42:
            defpackage.ffci.b(r12)
            enru r12 = defpackage.zzw.a
            ensk r12 = r12.e()
            r2 = 74
            ensk r12 = r12.h(r7, r6, r2, r8)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r2 = "Editing scheduled message %s"
            r12.t(r2, r11)
            ygy r12 = r10.g
            aygq r2 = defpackage.aygq.i
            com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft r2 = defpackage.ayha.a(r11, r2)
            zzi r9 = new zzi
            r9.<init>(r10, r5)
            r0.e = r10
            r0.a = r11
            r0.d = r4
            java.lang.Object r12 = r12.a(r2, r9, r0)
            if (r12 == r1) goto Lcb
            r2 = r10
        L72:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L93
            enru r12 = defpackage.zzw.a
            ensk r12 = r12.f()
            r0 = 88
            ensk r12 = r12.h(r7, r6, r0, r8)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r0 = "Did not replace draft with scheduled message"
            r12.q(r0)
            r2.c(r11)
            ffcu r11 = defpackage.ffcu.a
            return r11
        L93:
            alye r12 = r2.d
            com.google.android.apps.messaging.shared.api.messaging.MessageId r11 = r11.b()
            engw r11 = defpackage.engw.r(r11)
            elfl r11 = r12.q(r11)
            r0.e = r5
            r0.a = r5
            r0.d = r3
            java.lang.Object r12 = defpackage.fgfz.c(r11, r0)
            if (r12 == r1) goto Lcb
        Lad:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto Lc8
            enru r11 = defpackage.zzw.a
            ensk r11 = r11.i()
            r12 = 95
            ensk r11 = r11.h(r7, r6, r12, r8)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r12 = "Scheduled message was not deleted"
            r11.q(r12)
        Lc8:
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lcb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zzw.b(alyv, ffgu):java.lang.Object");
    }

    public final void c(final alyv alyvVar) {
        alyvVar.getClass();
        this.f.d(true, new ffji() { // from class: zzf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final ajiy ajiyVar = (ajiy) obj;
                ajiyVar.getClass();
                final zzw zzwVar = zzw.this;
                String string = zzwVar.b.getString(R.string.edit_scheduled_message_dialog_title);
                string.getClass();
                aksx aksxVar = zzwVar.e;
                final alyv alyvVar2 = alyvVar;
                String a2 = aksxVar.a(alyvVar2.D());
                String string2 = zzwVar.b.getString(R.string.edit_scheduled_message_dialog_update_message_option_text);
                string2.getClass();
                String string3 = zzwVar.b.getString(R.string.edit_scheduled_message_dialog_send_message_option_text);
                string3.getClass();
                String string4 = zzwVar.b.getString(R.string.edit_scheduled_message_dialog_delete_message_option_text);
                string4.getClass();
                return new dmvi(string, ffdx.g(new dnlz(string2, null, null, null, null, null, null, new ffix() { // from class: zzc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        zzw zzwVar2 = zzwVar;
                        axol.k(zzwVar2.c, null, new zzo(zzwVar2, alyvVar2, null), 3);
                        return ffcu.a;
                    }
                }, 126), new dnlz(string3, null, null, null, null, null, null, new ffix() { // from class: zzd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        zzw zzwVar2 = zzw.this;
                        axol.k(zzwVar2.c, null, new zzp(zzwVar2, alyvVar2, null), 3);
                        ajiyVar.a();
                        return ffcu.a;
                    }
                }, 126), new dnlz(string4, null, null, null, null, null, null, new ffix() { // from class: zze
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        zzw zzwVar2 = zzwVar;
                        axol.k(zzwVar2.c, null, new zzq(zzwVar2, alyvVar2, null), 3);
                        return ffcu.a;
                    }
                }, 126)), a2, null, null, null, null, 120);
            }
        });
    }
}
