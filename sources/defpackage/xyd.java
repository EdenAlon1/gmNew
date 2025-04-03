package defpackage;

import android.R;
import android.content.Context;
import android.text.format.DateUtils;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyd {
    public final Context a;
    public final ffsk b;
    public final ffbr c;
    public final ajjc d;
    public final Optional e;
    public final ateb f;
    private final ffsk g;
    private final ffbr h;

    public xyd(Context context, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ajjc ajjcVar, Optional optional, ateb atebVar) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ajjcVar.getClass();
        this.a = context;
        this.g = ffskVar;
        this.b = ffskVar2;
        this.c = ffbrVar;
        this.h = ffbrVar2;
        this.d = ajjcVar;
        this.e = optional;
        this.f = atebVar;
    }

    public static /* synthetic */ void m(final xyd xydVar, final String str, String str2, ffix ffixVar, ffix ffixVar2, int i) {
        if ((i & 4) != 0) {
            ffixVar = new ffix() { // from class: xxd
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            };
        }
        final ffix ffixVar3 = ffixVar;
        if ((i & 8) != 0) {
            ffixVar2 = new ffix() { // from class: xxe
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            };
        }
        final ffix ffixVar4 = ffixVar2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        final String str3 = str2;
        xydVar.d.d(true, new ffji() { // from class: xwz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((ajiy) obj).getClass();
                ffix.this.invoke();
                doas doasVar = new doas(xyd.n(xydVar, R.string.ok), new ffix() { // from class: xxc
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                });
                ffix ffixVar5 = ffixVar4;
                return new dmve(str, null, null, str3, false, false, doasVar, null, ffixVar5, 182);
            }
        });
    }

    public static /* synthetic */ String n(xyd xydVar, int i) {
        return xydVar.d(i, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [ffud] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xxi
            if (r0 == 0) goto L13
            r0 = r9
            xxi r0 = (defpackage.xxi) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xxi r0 = new xxi
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L58
        L29:
            r9 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            defpackage.ffci.b(r9)
            r9 = 0
            ffsk r2 = r8.g     // Catch: java.lang.Throwable -> L5e
            ffhe r4 = defpackage.ffhe.a     // Catch: java.lang.Throwable -> L5e
            ffsm r5 = defpackage.ffsm.a     // Catch: java.lang.Throwable -> L5e
            ffhd r4 = defpackage.ekxi.a(r4)     // Catch: java.lang.Throwable -> L5e
            xxh r6 = new xxh     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r9, r8, r8)     // Catch: java.lang.Throwable -> L5e
            ffss r9 = defpackage.ffra.b(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
            r0.a = r9     // Catch: java.lang.Throwable -> L5e
            r0.d = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r9.c(r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L55
            return r1
        L55:
            r7 = r0
            r0 = r9
            r9 = r7
        L58:
            if (r0 == 0) goto L5d
            defpackage.ffub.a(r0)
        L5d:
            return r9
        L5e:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L62:
            if (r0 == 0) goto L67
            defpackage.ffub.a(r0)
        L67:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyd.a(ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [ffud] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.xxp
            if (r0 == 0) goto L13
            r0 = r9
            xxp r0 = (defpackage.xxp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xxp r0 = new xxp
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r0 = r0.a
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L29
            goto L58
        L29:
            r9 = move-exception
            goto L62
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L33:
            defpackage.ffci.b(r9)
            r9 = 0
            ffsk r2 = r8.g     // Catch: java.lang.Throwable -> L5e
            ffhe r4 = defpackage.ffhe.a     // Catch: java.lang.Throwable -> L5e
            ffsm r5 = defpackage.ffsm.a     // Catch: java.lang.Throwable -> L5e
            ffhd r4 = defpackage.ekxi.a(r4)     // Catch: java.lang.Throwable -> L5e
            xxo r6 = new xxo     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r9, r8, r8)     // Catch: java.lang.Throwable -> L5e
            ffss r9 = defpackage.ffra.b(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L5e
            r0.a = r9     // Catch: java.lang.Throwable -> L5e
            r0.d = r3     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r0 = r9.c(r0)     // Catch: java.lang.Throwable -> L5e
            if (r0 != r1) goto L55
            return r1
        L55:
            r7 = r0
            r0 = r9
            r9 = r7
        L58:
            if (r0 == 0) goto L5d
            defpackage.ffub.a(r0)
        L5d:
            return r9
        L5e:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L62:
            if (r0 == 0) goto L67
            defpackage.ffub.a(r0)
        L67:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyd.b(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.xxw
            if (r0 == 0) goto L13
            r0 = r13
            xxw r0 = (defpackage.xxw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            xxw r0 = new xxw
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r0 = r0.a
            ffss r0 = (defpackage.ffss) r0
            defpackage.ffci.b(r13)     // Catch: java.lang.Throwable -> L2e
            goto L8c
        L2e:
            r13 = move-exception
            goto L99
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L39:
            java.lang.Object r2 = r0.a
            xyd r2 = (defpackage.xyd) r2
            defpackage.ffci.b(r13)
            goto L5f
        L41:
            defpackage.ffci.b(r13)
            j$.util.Optional r13 = r12.e
            r13.isPresent()
            ffbr r13 = r12.h
            java.lang.Object r13 = r13.b()
            r13.getClass()
            ffxx r13 = (defpackage.ffxx) r13
            r0.a = r12
            r0.d = r4
            java.lang.Object r13 = defpackage.fgbj.a(r13, r0)
            if (r13 == r1) goto L9f
            r2 = r12
        L5f:
            alxj r13 = (defpackage.alxj) r13
            alxi r13 = r13.b()
            alxi r5 = defpackage.alxi.GROUP
            r6 = 0
            ffsk r7 = r2.g     // Catch: java.lang.Throwable -> L97
            ffhe r8 = defpackage.ffhe.a     // Catch: java.lang.Throwable -> L97
            ffsm r9 = defpackage.ffsm.a     // Catch: java.lang.Throwable -> L97
            ffhd r8 = defpackage.ekxi.a(r8)     // Catch: java.lang.Throwable -> L97
            xxv r10 = new xxv     // Catch: java.lang.Throwable -> L97
            if (r13 != r5) goto L77
            goto L78
        L77:
            r4 = 0
        L78:
            r10.<init>(r6, r2, r2, r4)     // Catch: java.lang.Throwable -> L97
            ffss r13 = defpackage.ffra.b(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L97
            r0.a = r13     // Catch: java.lang.Throwable -> L92
            r0.d = r3     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = r13.c(r0)     // Catch: java.lang.Throwable -> L92
            if (r0 == r1) goto L9f
            r11 = r0
            r0 = r13
            r13 = r11
        L8c:
            if (r0 == 0) goto L91
            defpackage.ffub.a(r0)
        L91:
            return r13
        L92:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
            goto L99
        L97:
            r13 = move-exception
            r0 = r6
        L99:
            if (r0 == 0) goto L9e
            defpackage.ffub.a(r0)
        L9e:
            throw r13
        L9f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xyd.c(ffgu):java.lang.Object");
    }

    public final String d(int i, Object... objArr) {
        String string = this.a.getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    public final void e() {
        m(this, n(this, com.google.android.apps.messaging.R.string.media_attachments_not_supported_notice_text), null, null, null, 14);
    }

    public final void f() {
        m(this, n(this, com.google.android.apps.messaging.R.string.add_multiple_attachments_too_large_notice_text), null, null, null, 14);
    }

    public final void g() {
        m(this, n(this, com.google.android.apps.messaging.R.string.error_text_scheduled_send_with_draft_edit), null, null, null, 14);
    }

    public final void h() {
        m(this, n(this, com.google.android.apps.messaging.R.string.datetime_picker_invalid_time_error_toast), null, null, null, 14);
    }

    public final void i() {
        m(this, n(this, com.google.android.apps.messaging.R.string.error_text_scheduled_send_with_draft_reply), null, null, null, 14);
    }

    public final void j() {
        m(this, n(this, com.google.android.apps.messaging.R.string.sending_disabled_notice_text), null, null, null, 14);
    }

    public final void k() {
        m(this, n(this, com.google.android.apps.messaging.R.string.sending_failed_notice_text), null, null, null, 14);
    }

    public final void l(xwy xwyVar) {
        m(this, d(com.google.android.apps.messaging.R.string.video_duration_too_long_dialog_text, DateUtils.formatElapsedTime(xwyVar.f.getSeconds())), null, new ffix() { // from class: xxf
            @Override // defpackage.ffix
            public final Object invoke() {
                xyd xydVar = xyd.this;
                axol.k(xydVar.b, null, new xyb(xydVar, null), 3);
                return ffcu.a;
            }
        }, new ffix() { // from class: xxg
            @Override // defpackage.ffix
            public final Object invoke() {
                xyd xydVar = xyd.this;
                axol.k(xydVar.b, null, new xyc(xydVar, null), 3);
                return ffcu.a;
            }
        }, 2);
    }
}
