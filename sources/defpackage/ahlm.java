package defpackage;

import com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahlm implements eivv {
    public final LaunchLighterConversationActivity c;
    public final ffbr d;
    public final ffbr e;
    public final Optional f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public boolean j = false;
    public boolean k = false;
    public int l = 1;
    private final eito o;
    private final ffbr p;
    private static final ecda m = new ecda("LaunchLighterConversationActivity_ESI");
    private static final ecda n = new ecda("LaunchLighterConversationActivity");
    public static final ecda a = new ecda("LaunchLighterConversationActivity_noAccount");
    public static final cskc b = cskc.g("Lighter", "LaunchLighterConversationActivity");

    public ahlm(LaunchLighterConversationActivity launchLighterConversationActivity, eito eitoVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.c = launchLighterConversationActivity;
        this.o = eitoVar;
        this.d = ffbrVar;
        this.e = ffbrVar3;
        this.f = (Optional) ffbrVar4.b();
        this.g = ffbrVar5;
        this.p = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        if (cgje.a()) {
            eiwy f = eiwz.f(launchLighterConversationActivity);
            f.d(cgki.class);
            f.d(admh.class);
            eitoVar.g(f.a());
            eitoVar.e(this);
            eitoVar.e(new ejgb(((cgki) ffbrVar2.b()).a));
            if (((Boolean) ffbrVar7.b()).booleanValue()) {
                return;
            }
            ecqk.a.d(n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        if (r1.equals("com.google.business.ACTION_INITIATE_BUSINESS_CHAT") != false) goto L29;
     */
    @Override // defpackage.eivv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aa(defpackage.eivt r7) {
        /*
            r6 = this;
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r0 = r6.c
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r1 = "use_default_account_selector"
            r2 = 0
            boolean r0 = r0.getBooleanExtra(r1, r2)
            ffbr r3 = r6.h
            java.lang.Object r3 = r3.b()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L27
            ecqk r3 = defpackage.ecqk.a
            if (r0 == 0) goto L22
            ecda r0 = defpackage.ahlm.n
            goto L24
        L22:
            ecda r0 = defpackage.ahlm.m
        L24:
            r3.d(r0)
        L27:
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r0 = r6.c
            android.content.Intent r0 = r0.getIntent()
            r0.removeExtra(r1)
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r0 = r6.c
            android.content.Intent r0 = r0.getIntent()
            if (r0 != 0) goto L45
            cskc r7 = defpackage.ahlm.b
            java.lang.String r0 = "intent is null."
            r7.r(r0)
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r6.c
            r7.finish()
            return
        L45:
            java.lang.String r1 = r0.getAction()
            if (r1 != 0) goto L58
            cskc r7 = defpackage.ahlm.b
            java.lang.String r0 = "intent action is null."
            r7.r(r0)
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r6.c
            r7.finish()
            return
        L58:
            int r3 = r1.hashCode()
            r4 = -1908079756(0xffffffff8e450374, float:-2.4283787E-30)
            r5 = 1
            if (r3 == r4) goto L72
            r2 = 2634405(0x2832a5, float:3.691588E-39)
            if (r3 == r2) goto L68
            goto L7b
        L68:
            java.lang.String r2 = "VIEW"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7b
            r2 = r5
            goto L7c
        L72:
            java.lang.String r3 = "com.google.business.ACTION_INITIATE_BUSINESS_CHAT"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L7b
            goto L7c
        L7b:
            r2 = -1
        L7c:
            if (r2 == 0) goto L86
            if (r2 == r5) goto L86
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r6.c
            r7.finish()
            return
        L86:
            ffbr r2 = r6.p
            java.lang.Object r2 = r2.b()
            alrv r2 = (defpackage.alrv) r2
            ecda r3 = defpackage.alrv.K
            r2.e(r3)
            eisx r7 = r7.a()
            j$.util.Optional r2 = r6.f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto Lac
            cskc r7 = defpackage.ahlm.b
            java.lang.String r0 = "finish activity, no account is present"
            r7.r(r0)
            com.google.android.apps.messaging.lighterconversation.LaunchLighterConversationActivity r7 = r6.c
            r7.finish()
            return
        Lac:
            cskc r2 = defpackage.ahlm.b
            java.lang.String r3 = "Checking capability for account"
            r2.m(r3)
            j$.util.Optional r2 = r6.f
            java.lang.Object r2 = r2.get()
            cgjp r2 = (defpackage.cgjp) r2
            elfl r2 = r2.b(r7)
            ahlj r3 = new ahlj
            r3.<init>()
            ffbr r7 = r6.g
            java.lang.Object r7 = r7.b()
            java.util.concurrent.Executor r7 = (java.util.concurrent.Executor) r7
            elfl r7 = r2.i(r3, r7)
            defpackage.axnw.h(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahlm.aa(eivt):void");
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        if (!(eiupVar instanceof eiuw)) {
            throw new IllegalStateException("Failed to get valid account.", eiupVar);
        }
        this.k = true;
    }

    public final void e(String str) {
        this.c.getIntent().putExtra("LAUNCH_CONTEXT", str);
        efbd.e(eldl.l(new Runnable() { // from class: ahlh
            @Override // java.lang.Runnable
            public final void run() {
                ahlm ahlmVar = ahlm.this;
                if (((lkv) ahlmVar.c.P()).c == lkj.DESTROYED) {
                    ahlm.b.r("activity was destroyed after posting on UI thread.");
                } else {
                    ahlmVar.f();
                }
            }
        }));
    }

    public final void f() {
        b.m("Launching Lighter ExpressSignIn via switchAccountWithSelectors");
        this.o.d(engw.r(admh.class));
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
