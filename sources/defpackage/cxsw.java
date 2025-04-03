package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxsw {
    public static final emyl a = cfvl.x(133388132, "enable_scheduled_send_long_click_description");
    public final Context b;
    public final Resources c;
    public final Optional d;
    public final bzyb e;
    private View.AccessibilityDelegate f;
    private View.AccessibilityDelegate g;
    private View.AccessibilityDelegate h;

    public cxsw(Context context, bzyb bzybVar, Optional optional) {
        this.b = context;
        this.c = context.getResources();
        this.e = bzybVar;
        this.d = optional;
    }

    public final synchronized View.AccessibilityDelegate a() {
        if (this.f == null) {
            this.f = new cxst();
        }
        return this.f;
    }

    public final synchronized View.AccessibilityDelegate b() {
        if (this.h == null) {
            if (this.d.isEmpty()) {
                throw new IllegalStateException("ScheduledSendResources not provided. Is a module missing?");
            }
            this.h = new cxsv(this);
        }
        return this.h;
    }

    public final synchronized View.AccessibilityDelegate c() {
        if (this.g == null) {
            this.g = new cxsu(this);
        }
        return this.g;
    }

    public final String d(int i) {
        return this.c.getString(i);
    }

    public final String e(int i, String str) {
        return this.c.getString(i, str);
    }
}
