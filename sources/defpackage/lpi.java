package defpackage;

import android.media.AudioAttributes;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpi {
    public final AudioAttributes a;

    public lpi(lpk lpkVar) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(lpkVar.b).setFlags(0).setUsage(lpkVar.c);
        if (lvf.a >= 29) {
            usage.setAllowedCapturePolicy(1);
        }
        if (lvf.a >= 32) {
            usage.setSpatializationBehavior(0);
        }
        this.a = usage.build();
    }
}
