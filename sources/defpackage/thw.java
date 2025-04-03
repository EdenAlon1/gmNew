package defpackage;

import android.view.View;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.fi.FiAccountPreference;
import com.google.android.apps.messaging.cloudstore.fi.SyncPreference;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class thw {
    public static final cskc a = cskc.g("BugleCms", "FiSettingsFragmentPeer");
    static final cfva b = cfvl.i(cfvl.b, "counter_when_user_entering_settings_page", false);
    public Snackbar A;
    public Snackbar B;
    public final ffbr C;
    public final ffbr D;
    private final crue E;
    private Snackbar F;
    public final thf c;
    public final axkm d;
    public final elhk e;
    public final ejwl f;
    public final elbx g;
    public final eixo h;
    public final akvg i;
    public final ejlq j;
    public final eisx k;
    public final ejlr l = new thu(this);
    public final ejlr m = new thv(this);
    public FiAccountPreference n;
    public SyncPreference o;
    public SwitchPreferenceCompat p;
    public Preference q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ffbr u;
    public final ffbr v;
    public final asjt w;
    public final asjq x;
    public final ffbr y;
    public final ffbr z;

    /* compiled from: PG */
    final class a implements ejwd<eixz> {
        public a() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            throw new IllegalStateException("Error retrieving AccountInfo for id " + thw.this.k.a(), th);
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            eixz eixzVar = (eixz) obj;
            thw.this.n.M(eixzVar.d);
            thw.this.n.n(eixzVar.g);
            FiAccountPreference fiAccountPreference = thw.this.n;
            fiAccountPreference.b = eixzVar.h;
            fiAccountPreference.d();
            thw.this.n.G(true);
        }

        @Override // defpackage.ejwd
        public final void hB() {
            thw thwVar = thw.this;
            thwVar.n.n(thwVar.c.Y(R.string.loading));
        }
    }

    public thw(thf thfVar, axkm axkmVar, elhk elhkVar, ejwl ejwlVar, eisx eisxVar, elbx elbxVar, eixo eixoVar, crue crueVar, akvg akvgVar, ejlq ejlqVar, ffbr ffbrVar, asjq asjqVar, ffbr ffbrVar2, asjt asjtVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.c = thfVar;
        this.d = axkmVar;
        this.k = eisxVar;
        this.e = elhkVar;
        this.f = ejwlVar;
        this.g = elbxVar;
        this.h = eixoVar;
        this.E = crueVar;
        this.i = akvgVar;
        this.j = ejlqVar;
        this.z = ffbrVar4;
        this.u = ffbrVar;
        this.x = asjqVar;
        this.w = asjtVar;
        this.v = ffbrVar3;
        this.y = ffbrVar2;
        this.C = ffbrVar5;
        this.D = ffbrVar6;
    }

    public final void a() {
        this.j.i(ejlp.b(this.E.f(this.k)), new ejlm(null), this.m);
    }

    public final void b() {
        this.j.i(ejlp.b(this.E.d(this.k, 4, 1)), new ejlm(null), this.m);
    }

    public final void c(boolean z) {
        this.p.G(z);
        this.n.G(z);
    }

    public final void d(String str) {
        View view = this.c.Q;
        view.getClass();
        Snackbar snackbar = this.F;
        if (snackbar == null) {
            Snackbar r = Snackbar.r(view, str, -2);
            r.o();
            this.F = r;
        } else {
            snackbar.u(str);
        }
        this.F.i();
    }

    public final int e(axez axezVar) {
        axmm axmmVar = (axmm) this.y.b();
        axezVar.getClass();
        if (!csgj.a()) {
            axmi b2 = axmi.b(axezVar.f);
            if (b2 == null) {
                b2 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
            }
            switch (b2) {
                case INITIAL_SYNC_STATUS_NOT_SET:
                case STARTED:
                    return 3;
                case RESTORE:
                case BACKUP:
                case RESTORE_KEYS:
                case FAILED:
                case INITIAL_BACKUP_NEEDS_RETRY:
                case RESTORE_MESSAGES_COMPLETE:
                    return 1;
                case COMPLETE:
                    return 2;
                default:
                    throw new ffcd();
            }
        }
        if (axmmVar.b.a() && axmmVar.c.a()) {
            return 3;
        }
        axmi b3 = axmi.b(axezVar.f);
        if (b3 == null) {
            b3 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
        }
        switch (b3) {
            case INITIAL_SYNC_STATUS_NOT_SET:
            case STARTED:
                return 3;
            case RESTORE:
            case RESTORE_KEYS:
                return 4;
            case BACKUP:
            case RESTORE_MESSAGES_COMPLETE:
                return 5;
            case FAILED:
            case INITIAL_BACKUP_NEEDS_RETRY:
                return 1;
            case COMPLETE:
                return 2;
            default:
                throw new ffcd();
        }
    }

    /* compiled from: PG */
    final class b implements ejwd<axez> {
        public b() {
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            Snackbar snackbar;
            Snackbar snackbar2;
            axez axezVar = (axez) obj;
            boolean m = axmm.m(axezVar);
            if (!thw.this.x.a() && axezVar.k && axezVar.e) {
                thw thwVar = thw.this;
                if (!thwVar.r && m) {
                    thf thfVar = thwVar.c;
                    View view = thfVar.Q;
                    view.getClass();
                    thwVar.r = true;
                    Snackbar r = Snackbar.r(view, thfVar.Y(R.string.hangouts_syncing_conversations), -2);
                    r.o();
                    thwVar.A = r;
                    thw.this.A.i();
                    return;
                }
            }
            thw thwVar2 = thw.this;
            if (thwVar2.r && ((!m || !axezVar.e) && (snackbar2 = thwVar2.A) != null)) {
                snackbar2.e();
                return;
            }
            if (thwVar2.x.a()) {
                if (!axezVar.e || !m) {
                    thw thwVar3 = thw.this;
                    if (!thwVar3.s || (snackbar = thwVar3.B) == null) {
                        return;
                    }
                    snackbar.e();
                    return;
                }
                thw thwVar4 = thw.this;
                if (thwVar4.s) {
                    return;
                }
                thf thfVar2 = thwVar4.c;
                View view2 = thfVar2.Q;
                view2.getClass();
                thwVar4.s = true;
                Snackbar r2 = Snackbar.r(view2, thfVar2.Y(R.string.syncing_conversations), -2);
                r2.o();
                thwVar4.B = r2;
                thw.this.B.i();
            }
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
        }
    }

    /* compiled from: PG */
    final class c implements ejwd<axez> {
        public c() {
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            axeu b = axeu.b(((axez) obj).l);
            if (b == null) {
                b = axeu.UNSPECIFIED_STATUS;
            }
            int ordinal = b.ordinal();
            if (ordinal == 4) {
                thw.a.p("Feature disabled, finishing Fi Settings activity");
                ellj.f(new tii(), thw.this.c);
            } else if (ordinal == 5) {
                thw.this.c(false);
                thw thwVar = thw.this;
                thwVar.d(thwVar.c.Y(R.string.fi_settings_opt_out_in_progress));
            } else {
                if (ordinal != 6) {
                    return;
                }
                thw.this.c(true);
                thw thwVar2 = thw.this;
                thwVar2.d(thwVar2.c.Y(R.string.fi_settings_opt_out_failed));
            }
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
        }
    }

    /* compiled from: PG */
    final class d implements ejwd<axez> {
        public d() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            thw.this.p.G(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
        
            if (r8 != 4) goto L37;
         */
        @Override // defpackage.ejwd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* bridge */ /* synthetic */ void b(java.lang.Object r8) {
            /*
                r7 = this;
                axez r8 = (defpackage.axez) r8
                thw r0 = defpackage.thw.this
                androidx.preference.SwitchPreferenceCompat r0 = r0.p
                boolean r1 = r8.d
                r0.k(r1)
                int r0 = r8.l
                axeu r0 = defpackage.axeu.b(r0)
                if (r0 != 0) goto L15
                axeu r0 = defpackage.axeu.UNSPECIFIED_STATUS
            L15:
                axeu r1 = defpackage.axeu.DISABLING
                boolean r0 = r0.equals(r1)
                thw r1 = defpackage.thw.this
                r2 = 1
                r0 = r0 ^ r2
                androidx.preference.SwitchPreferenceCompat r1 = r1.p
                r1.G(r0)
                boolean r0 = defpackage.csgj.a()
                r1 = 2132084426(0x7f1506ca, float:1.9809022E38)
                r3 = 4
                r4 = 3
                r5 = 2132084427(0x7f1506cb, float:1.9809024E38)
                if (r0 == 0) goto L8e
                boolean r0 = r8.B
                if (r0 == 0) goto L8e
                thw r0 = defpackage.thw.this
                com.google.android.apps.messaging.cloudstore.fi.SyncPreference r6 = r0.o
                int r0 = r0.e(r8)
                axky r8 = r8.C
                if (r8 != 0) goto L44
                axky r8 = defpackage.axky.a
            L44:
                r6.a = r0
                int r0 = r0 + (-1)
                if (r0 == 0) goto L87
                if (r0 == r2) goto L83
                if (r0 == r4) goto L6a
                if (r0 == r3) goto L51
                goto L8a
            L51:
                long r0 = r8.e
                long r3 = r8.f
                boolean r8 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.ab(r3, r0)
                if (r8 == 0) goto L66
                r8 = 2132084423(0x7f1506c7, float:1.9809016E38)
                long r0 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.k(r3, r0)
                r6.o(r8, r0)
                goto L8a
            L66:
                r6.l(r5)
                goto L8a
            L6a:
                long r0 = r8.c
                long r3 = r8.d
                boolean r8 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.ab(r3, r0)
                if (r8 == 0) goto L7f
                r8 = 2132084424(0x7f1506c8, float:1.9809018E38)
                long r0 = com.google.android.apps.messaging.cloudstore.fi.SyncPreference.k(r3, r0)
                r6.o(r8, r0)
                goto L8a
            L7f:
                r6.l(r5)
                goto L8a
            L83:
                r6.l(r1)
                goto L8a
            L87:
                r6.l(r5)
            L8a:
                r6.d()
                goto Lad
            L8e:
                thw r0 = defpackage.thw.this
                com.google.android.apps.messaging.cloudstore.fi.SyncPreference r6 = r0.o
                int r8 = r0.e(r8)
                r6.a = r8
                int r8 = r8 + (-1)
                if (r8 == 0) goto La7
                if (r8 == r2) goto La3
                if (r8 == r4) goto La7
                if (r8 == r3) goto La7
                goto Laa
            La3:
                r6.l(r1)
                goto Laa
            La7:
                r6.l(r5)
            Laa:
                r6.d()
            Lad:
                thw r8 = defpackage.thw.this
                androidx.preference.SwitchPreferenceCompat r8 = r8.p
                r8.N(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: thw.d.b(java.lang.Object):void");
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    }
}
