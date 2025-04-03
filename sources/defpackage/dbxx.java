package defpackage;

import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dbxx extends dbya {
    public long G;
    public boolean H;
    public alct I;
    public cqoh J;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private Long N;
    public AttachmentQueueState n;

    private final eptv D() {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        epts M = M();
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = M.v;
        eptvVar.b |= 1;
        eptu eptuVar = eptu.EXPANDED;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        return (eptv) eptqVar.build();
    }

    private final void F() {
        AttachmentQueueState attachmentQueueState = this.n;
        if (attachmentQueueState != null) {
            attachmentQueueState.e(N());
        }
    }

    protected abstract epts M();

    protected abstract Class N();

    public final void O(eptk eptkVar) {
        if (!this.K) {
            af(epto.INTERRUPTED);
        }
        if (this.L) {
            return;
        }
        alct alctVar = this.I;
        eptv D = D();
        F();
        if (!this.M) {
            csix.l(this.N);
            this.J.f().toEpochMilli();
            Long l = this.N;
            if (l != null) {
                l.longValue();
            }
        }
        alctVar.c(D, eptkVar);
        this.L = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void af(defpackage.epto r10) {
        /*
            r9 = this;
            boolean r0 = r9.K
            if (r0 != 0) goto La2
            cqoh r0 = r9.J
            j$.time.Instant r0 = r0.f()
            long r0 = r0.toEpochMilli()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.N = r0
            eptv r0 = r9.D()
            r9.F()
            android.content.Intent r1 = r9.getIntent()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L71
            java.lang.String r4 = "EXTRA_OPENING_SOURCE"
            boolean r5 = r1.hasExtra(r4)
            if (r5 == 0) goto L71
            java.lang.String r5 = r1.getStringExtra(r4)     // Catch: java.lang.IllegalArgumentException -> L3b
            r5.getClass()     // Catch: java.lang.IllegalArgumentException -> L3b
            java.lang.Class<eptm> r6 = defpackage.eptm.class
            java.lang.Enum r5 = java.lang.Enum.valueOf(r6, r5)     // Catch: java.lang.IllegalArgumentException -> L3b
            eptm r5 = (defpackage.eptm) r5     // Catch: java.lang.IllegalArgumentException -> L3b
            goto L73
        L3b:
            r5 = move-exception
            java.lang.String r1 = r1.getStringExtra(r4)
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r1
            enru r1 = defpackage.csjy.a
            ensk r1 = r1.i()
            enrr r1 = (defpackage.enrr) r1
            ensn r6 = defpackage.ente.a
            java.lang.String r7 = "Bugle"
            r1.Y(r6, r7)
            ense r6 = defpackage.ense.a
            r1.Z(r6)
            ensk r1 = r1.g(r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r5 = "e"
            r6 = 511(0x1ff, float:7.16E-43)
            java.lang.String r7 = "com/google/android/apps/messaging/shared/util/common/LogUtil"
            java.lang.String r8 = "LogUtil.java"
            ensk r1 = r1.h(r7, r5, r6, r8)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r5 = "Invalid opening source %s"
            r1.Q(r5, r4)
        L71:
            eptm r5 = defpackage.eptm.UNKNOWN_OPENING_SOURCE
        L73:
            enru r1 = defpackage.alct.a
            ensk r1 = r1.j()
            enrr r1 = (defpackage.enrr) r1
            ensy r4 = defpackage.ensy.MEDIUM
            r1.aa(r4)
            java.lang.String r4 = "deprecatedLogScreenOpened"
            r6 = 83
            java.lang.String r7 = "com/google/android/apps/messaging/shared/analytics/compose/ComposeNavigationEventLogger"
            java.lang.String r8 = "ComposeNavigationEventLogger.java"
            ensk r1 = r1.h(r7, r4, r6, r8)
            enrr r1 = (defpackage.enrr) r1
            int r4 = r5.r
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "ComposeNavigationEventLogger.deprecatedLogScreenOpened 3 %s, %s, %s"
            r1.J(r5, r0, r10, r4)
            r9.K = r3
            epto r0 = defpackage.epto.INTERRUPTED
            if (r10 != r0) goto La0
            r2 = r3
        La0:
            r9.M = r2
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dbxx.af(epto):void");
    }

    @Override // defpackage.cwpv, defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gE().b(this, new dbxw(this));
        im k = k();
        if (k != null) {
            k.setDisplayHomeAsUpEnabled(true);
        }
        this.n = (AttachmentQueueState) getIntent().getParcelableExtra("draft_message_data");
        if (((Boolean) dedt.a.e()).booleanValue()) {
            this.G = getIntent().getIntExtra("EXTRA_MAX_ATTACHMENT_SIZE", -1);
        }
        this.H = getIntent().getBooleanExtra("EXTRA_IS_RCS_ON_OPEN", false);
        getIntent().getLongExtra("EXTRA_OPENING_TIME", this.J.f().toEpochMilli());
    }

    @Override // defpackage.cwpv, defpackage.efac, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        O(eptk.BACK_ICON);
        gE().d();
        return true;
    }
}
