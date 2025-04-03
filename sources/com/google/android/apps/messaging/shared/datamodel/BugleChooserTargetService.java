package com.google.android.apps.messaging.shared.datamodel;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.text.TextUtils;
import defpackage.azwd;
import defpackage.azyv;
import defpackage.bbey;
import defpackage.bbez;
import defpackage.bbfa;
import defpackage.csix;
import defpackage.cskc;
import defpackage.ctud;
import defpackage.ctvb;
import defpackage.ffbr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class BugleChooserTargetService extends azyv implements bbey {
    private static final cskc e = cskc.g("BugleServices", "BugleChooserTargetService");
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public ffbr a;
    public ffbr b;
    public ffbr c;
    public ffbr d;
    private List g;
    private final Object h = new Object();
    private boolean i = false;

    private final void d() {
        this.i = true;
        synchronized (this.h) {
            this.h.notifyAll();
        }
    }

    @Override // defpackage.bbey
    public final void a() {
        e.m("onGetFrecencyConversationActionFailed.");
        this.g = null;
        d();
    }

    @Override // defpackage.bbey
    public final void b(List list) {
        this.g = list;
        d();
    }

    @Override // android.service.chooser.ChooserTargetService
    public final List onGetChooserTargets(ComponentName componentName, IntentFilter intentFilter) {
        e.m("onGetChooserTargets called().");
        this.g = new ArrayList();
        boolean z = true;
        if (!TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.VideoShareIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePdfIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.ShareCalendarIntentActivity", componentName.getClassName()) && !TextUtils.equals("com.google.android.apps.messaging.ui.conversationlist.SharePhaseOneSupportedFileIntentActivity", componentName.getClassName())) {
            z = false;
        }
        csix.k(z);
        ((azwd) this.c.b()).a = componentName;
        if (((ctud) this.a.b()).k() && ((ctvb) this.b.b()).K()) {
            ((bbfa) this.d.b()).a().p(new bbez(this));
            while (!this.i) {
                synchronized (this.h) {
                    try {
                        try {
                            this.h.wait(f);
                        } catch (InterruptedException unused) {
                            return this.g;
                        }
                    } finally {
                    }
                }
            }
        }
        return this.g;
    }
}
