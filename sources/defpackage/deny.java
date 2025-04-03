package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deny {
    private static final enru t = enru.c("com/google/android/apps/messaging/welcome/v1/ui/WelcomeScreenUiAdapter");
    public final Context a;
    public final deki b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final Optional i;
    public final ffbr j;
    public final ffsk k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final fgcl s;
    private final depd u;
    private final ffbr v;
    private final ffsk w;
    private final ffbr x;

    public deny(Context context, deki dekiVar, depd depdVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, Optional optional, ffbr ffbrVar8, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
        context.getClass();
        dekiVar.getClass();
        ffbrVar.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar14.getClass();
        this.a = context;
        this.b = dekiVar;
        this.u = depdVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.v = ffbrVar7;
        this.i = optional;
        this.j = ffbrVar8;
        this.k = ffskVar;
        this.w = ffskVar2;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
        this.n = ffbrVar11;
        this.o = ffbrVar12;
        this.x = ffbrVar13;
        this.p = ffbrVar14;
        this.q = new AtomicBoolean();
        this.r = new AtomicBoolean();
        axol.k(ffskVar, null, new denp(this, null), 3);
        this.s = fgcu.e(1, 0, 2, 2);
    }

    public final deoa a(final cvjl cvjlVar) {
        dotb dotbVar;
        if (cvjlVar == cvjl.WELCOME_FLOW_SETTINGS) {
            String string = this.a.getString(R.string.welcome_settings_app_bar_title);
            string.getClass();
            dosk doskVar = new dosk(string, null, null, false, null, null, null, 254);
            String string2 = this.a.getString(R.string.welcome_back_content_description);
            string2.getClass();
            dotbVar = new dotb(doskVar, new dlsr(string2, dmzz.p, false, false, false, false, null, false, null, new ffix() { // from class: denh
                @Override // defpackage.ffix
                public final Object invoke() {
                    deny denyVar = deny.this;
                    axol.k(denyVar.k, null, new denu(denyVar, null), 3);
                    return ffcu.a;
                }
            }, 1020), null, false, false, null, null, 124);
        } else {
            dotbVar = null;
        }
        deki dekiVar = this.b;
        fgdj a = dekiVar.a();
        ffxx j = axsp.j(axrb.c(dekiVar.a(), "AccountSelection"), axrb.c(((demu) this.g.b()).b, "ProfileSharing"), this.k, new dens(this, cvjlVar, null));
        ffsk ffskVar = this.k;
        int i = fgcz.a;
        fgdj b = fgbn.b(j, ffskVar, fgcy.a(0L, 3), null);
        depd depdVar = this.u;
        return new deoa(dotbVar, a, b, axqw.c(depdVar.c.a(), depdVar.d, new ffji() { // from class: depc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dekh dekhVar = (dekh) obj;
                depe depeVar = depd.a;
                dekhVar.getClass();
                if (dekhVar instanceof deke) {
                    return null;
                }
                if (dekhVar instanceof dekf) {
                    return depd.a;
                }
                if (!(dekhVar instanceof dekg)) {
                    throw new ffcd();
                }
                if (((dekg) dekhVar).c) {
                    return null;
                }
                return depd.b;
            }
        }), fgbn.b(axsp.j(axrb.c(this.b.a(), "AccountSelection"), axrb.c(((demu) this.g.b()).b, "ProfileSharing"), this.k, new dent(this, cvjlVar, null)), this.k, fgcy.a(0L, 3), null), axqw.c(this.b.a(), this.k, new ffji() { // from class: denn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dekh dekhVar = (dekh) obj;
                dekhVar.getClass();
                if (dekhVar instanceof deke) {
                    return null;
                }
                deny denyVar = deny.this;
                if (dekhVar instanceof dekf) {
                    String string3 = denyVar.a.getString(R.string.welcome_notice_without_reachability);
                    string3.getClass();
                    return new denc(string3, dxu.d, (dltp) null, 12);
                }
                if (!(dekhVar instanceof dekg)) {
                    throw new ffcd();
                }
                if (cvjlVar == cvjl.WELCOME_FLOW_SETTINGS) {
                    String string4 = denyVar.a.getString(R.string.welcome_settings_learn_more);
                    string4.getClass();
                    Object b2 = denyVar.l.b();
                    b2.getClass();
                    return new denc(string4, dxu.c, new dltp((String) b2, 0, string4.length(), (ffji) null, 56), true);
                }
                String string5 = denyVar.a.getString(R.string.welcome_features_help_center);
                string5.getClass();
                String string6 = denyVar.a.getString(R.string.welcome_reachability_notice_v2, string5);
                string6.getClass();
                int Q = ffpc.Q(string6, string5, 0, false, 6);
                Object b3 = denyVar.l.b();
                b3.getClass();
                return new denc(string6, dxu.d, new dltp((String) b3, Q, Q + string5.length(), (ffji) null, 56), 8);
            }
        }), this.s, new denz(((avcr) this.x.b()).a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a5, code lost:
    
        if (r11 != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v4, types: [ffbr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffgu r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.denw
            if (r0 == 0) goto L13
            r0 = r11
            denw r0 = (defpackage.denw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            denw r0 = new denw
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.ffci.b(r11)
            goto La7
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            deny r2 = r0.d
            defpackage.ffci.b(r11)
            goto L63
        L39:
            defpackage.ffci.b(r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.q
            boolean r11 = r11.getAndSet(r4)
            if (r11 == 0) goto L45
            goto La9
        L45:
            ffbr r11 = r10.v
            java.lang.Object r11 = r11.b()
            aqvh r11 = (defpackage.aqvh) r11
            aqge r11 = r11.a()
            elfl r11 = r11.b()
            r11.getClass()
            r0.d = r10
            r0.c = r4
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 == r1) goto Lac
            r2 = r10
        L63:
            r11.getClass()
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r11 = defpackage.ffdx.M(r11)
            aqux r11 = (defpackage.aqux) r11
            if (r11 == 0) goto La9
            enru r5 = defpackage.deny.t
            ensk r5 = r5.h()
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "BugleProfiles"
            r5.Y(r6, r7)
            java.lang.String r6 = "invalidateSelfToken"
            r7 = 383(0x17f, float:5.37E-43)
            java.lang.String r8 = "com/google/android/apps/messaging/welcome/v1/ui/WelcomeScreenUiAdapter"
            java.lang.String r9 = "WelcomeScreenUiAdapter.kt"
            ensk r5 = r5.h(r8, r6, r7, r9)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r6 = "User selected more restrictive sharing preference, invalidating self token"
            r5.q(r6)
            j$.util.Optional r2 = r2.i
            java.lang.Object r2 = r2.get()
            java.lang.Object r2 = r2.b()
            alyr r2 = (defpackage.alyr) r2
            r5 = 0
            r0.d = r5
            r0.c = r3
            java.lang.Object r11 = r2.c(r11, r4, r0)
            if (r11 == r1) goto Lac
        La7:
            aqkm r11 = (defpackage.aqkm) r11
        La9:
            ffcu r11 = defpackage.ffcu.a
            return r11
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deny.b(ffgu):java.lang.Object");
    }

    public final String c(cjtw cjtwVar) {
        int i;
        int ordinal = cjtwVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            i = R.string.welcome_settings_dialog_people_you_message;
        } else if (ordinal == 2) {
            i = R.string.welcome_settings_dialog_only_your_contacts;
        } else {
            if (ordinal != 3) {
                throw new ffcd();
            }
            i = R.string.welcome_settings_dialog_no_one;
        }
        String string = this.a.getString(i);
        string.getClass();
        return string;
    }

    public final void d(cjtw cjtwVar, cvjl cvjlVar) {
        axol.k(this.w, null, new denx(this, cjtwVar, cvjlVar, null), 3);
    }
}
