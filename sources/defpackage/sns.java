package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sns implements cfug {
    public static final entd a = entd.c("BugleAppOnAuto");
    public final Context b;
    private final ffsk c;

    public sns(Context context, ffsk ffskVar) {
        context.getClass();
        ffskVar.getClass();
        this.b = context;
        this.c = ffskVar;
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return true;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ekzz f = eleg.f("MessagingTemplateScreenServiceEnabler#settingComponent");
        try {
            axol.k(this.c, null, new snr(this, null), 3);
            ffig.a(f, null);
        } finally {
        }
    }
}
