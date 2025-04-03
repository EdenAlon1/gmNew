package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysz implements ysi {
    public static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler");
    public final ffsk c;
    public final ffhd d;
    public final dqlx e;
    public final dbzh f;
    public final dbzj g;
    public final csqw h;
    public final Context i;
    private final ffhd j;
    private final aigz k;
    private final dqmn l;
    private final ajjc m;
    private final llv n;
    private final ffbr o;
    private final int p;
    private final dsaq q;
    private final ablq r;

    public ysz(ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2, aigz aigzVar, dqmn dqmnVar, xto xtoVar, dqlx dqlxVar, dbzh dbzhVar, dbzj dbzjVar, csqw csqwVar, Context context, ajjc ajjcVar, ablq ablqVar, llv llvVar, ffbr ffbrVar, ysb ysbVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        aigzVar.getClass();
        dqmnVar.getClass();
        xtoVar.getClass();
        dqlxVar.getClass();
        dbzhVar.getClass();
        dbzjVar.getClass();
        csqwVar.getClass();
        context.getClass();
        ajjcVar.getClass();
        ablqVar.getClass();
        llvVar.getClass();
        ffbrVar.getClass();
        this.c = ffskVar;
        this.d = ffhdVar;
        this.j = ffhdVar2;
        this.k = aigzVar;
        this.l = dqmnVar;
        this.e = dqlxVar;
        this.f = dbzhVar;
        this.g = dbzjVar;
        this.h = csqwVar;
        this.i = context;
        this.m = ajjcVar;
        this.r = ablqVar;
        this.n = llvVar;
        this.o = ffbrVar;
        axol.k(ffskVar, null, new ysp(this, null), 3);
        this.p = R.string.contacts_shortcut_title;
        this.q = new dsaq(R.drawable.quantum_gm_ic_person_vd_theme_24, new dsap(ysbVar.a(R.color.contacts_shortcut_background), new dszo(R.color.contacts_shortcut_icon_tint)));
    }

    private final void i(final Uri uri) {
        this.m.d(true, new ffji() { // from class: ysn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final ajiy ajiyVar = (ajiy) obj;
                ajiyVar.getClass();
                final ysz yszVar = ysz.this;
                String string = yszVar.i.getString(R.string.shareDialogTitle);
                string.getClass();
                String string2 = yszVar.i.getString(R.string.shareDialogTypeFile);
                string2.getClass();
                final Uri uri2 = uri;
                String string3 = yszVar.i.getString(R.string.shareDialogTypeText);
                string3.getClass();
                return new dmvi(string, ffdx.g(new dnlz(string2, null, null, null, null, null, null, new ffix() { // from class: ysl
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        ysz yszVar2 = yszVar;
                        axol.k(yszVar2.c, null, new ysx(yszVar2, uri2, null), 3);
                        return ffcu.a;
                    }
                }, 126), new dnlz(string3, null, null, null, null, null, null, new ffix() { // from class: ysm
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        ysz yszVar2 = yszVar;
                        axol.k(yszVar2.c, null, new ysy(yszVar2, uri2, null), 3);
                        return ffcu.a;
                    }
                }, 126)), null, null, null, null, null, 124);
            }
        });
    }

    @Override // defpackage.ysi
    public final int a() {
        return this.p;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.q;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        axol.k(this.c, null, new ysr(this, new aiir("Contacts", new adz(), null, view != null ? ysj.a(view) : null), null), 3);
    }

    @Override // defpackage.ysi
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ysq
            if (r0 == 0) goto L13
            r0 = r9
            ysq r0 = (defpackage.ysq) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysq r0 = new ysq
            r0.<init>(r8, r9)
        L18:
            r7 = r0
            java.lang.Object r9 = r7.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.c
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            ysz r0 = r7.d
            defpackage.ffci.b(r9)
            goto L50
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            defpackage.ffci.b(r9)
            r9 = r2
            llv r2 = r8.n
            aigz r4 = r8.k
            yse r1 = defpackage.ysi.a
            yso r6 = new yso
            r6.<init>()
            r7.d = r8
            r7.c = r9
            java.lang.String r5 = "Contacts"
            java.lang.String r3 = "contact_shortcut_saved_state_pending_result"
            java.lang.Object r9 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r9 == r0) goto L95
            r0 = r8
        L50:
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r1 = "checkForAndHandlePendingResult"
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r3 = "ContactsShortcutHandler.kt"
            java.lang.String r4 = "BugleComposeRow2"
            if (r9 != 0) goto L77
            enru r9 = defpackage.ysz.b
            ensk r9 = r9.j()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r4)
            r0 = 191(0xbf, float:2.68E-43)
            ensk r9 = r9.h(r2, r1, r0, r3)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Skipping contact picker activity result because of null uri"
            r9.q(r0)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L77:
            enru r5 = defpackage.ysz.b
            ensk r5 = r5.e()
            ensn r6 = defpackage.ente.a
            r5.Y(r6, r4)
            r4 = 194(0xc2, float:2.72E-43)
            ensk r1 = r5.h(r2, r1, r4, r3)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "Showing dialog on whether to send contact as file or text."
            r1.q(r2)
            r0.i(r9)
            ffcu r9 = defpackage.ffcu.a
            return r9
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysz.f(ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0102, code lost:
    
        if (r2.a(r5, r15) == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.aiir r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysz.g(aiir, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0089, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.net.Uri r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ysw
            if (r0 == 0) goto L13
            r0 = r12
            ysw r0 = (defpackage.ysw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysw r0 = new ysw
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            java.lang.String r4 = "sendContactAsText"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler"
            java.lang.String r6 = "ContactsShortcutHandler.kt"
            java.lang.String r7 = "BugleComposeRow2"
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L43
            if (r2 == r9) goto L3d
            if (r2 != r8) goto L35
            ysz r11 = r0.d
            defpackage.ffci.b(r12)
            goto L8c
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3d:
            ysz r11 = r0.d
            defpackage.ffci.b(r12)
            goto L74
        L43:
            defpackage.ffci.b(r12)
            enru r12 = defpackage.ysz.b
            ensk r12 = r12.e()
            ensn r2 = defpackage.ente.a
            r12.Y(r2, r7)
            r2 = 224(0xe0, float:3.14E-43)
            ensk r12 = r12.h(r5, r4, r2, r6)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r2 = "Converting contact to text. contactUri %s"
            r12.t(r2, r11)
            ffhd r12 = r10.d
            ffhd r12 = defpackage.ekxi.a(r12)
            ysu r2 = new ysu
            r2.<init>(r3, r10, r11)
            r0.d = r10
            r0.c = r9
            java.lang.Object r12 = defpackage.ffra.a(r12, r2, r0)
            if (r12 == r1) goto Lb1
            r11 = r10
        L74:
            dbyf r12 = (defpackage.dbyf) r12
            ffhd r2 = r11.j
            ffhd r2 = defpackage.ekxi.a(r2)
            ysv r9 = new ysv
            r9.<init>(r3, r11, r12)
            r0.d = r11
            r0.c = r8
            java.lang.Object r12 = defpackage.ffra.a(r2, r9, r0)
            if (r12 != r1) goto L8c
            goto Lb1
        L8c:
            java.lang.String r12 = (java.lang.String) r12
            enru r0 = defpackage.ysz.b
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r7)
            r1 = 229(0xe5, float:3.21E-43)
            ensk r0 = r0.h(r5, r4, r1, r6)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "Appending selected contact in draft text."
            r0.q(r1)
            dqmn r11 = r11.l
            r12.getClass()
            r11.b(r12)
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysz.h(android.net.Uri, ffgu):java.lang.Object");
    }
}
