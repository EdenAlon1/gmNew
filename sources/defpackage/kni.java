package defpackage;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kni implements kls {
    public final Context a;
    public final Notification.Builder b;
    public final kml c;
    private final Bundle d;
    private int e;

    /* JADX WARN: Removed duplicated region for block: B:128:0x0446  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kni(defpackage.kml r21) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kni.<init>(kml):void");
    }

    private final void a(kma kmaVar) {
        IconCompat a = kmaVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(a != null ? a.c() : null, kmaVar.h, kmaVar.i);
        kns[] knsVarArr = kmaVar.b;
        if (knsVarArr != null) {
            for (RemoteInput remoteInput : kns.a(knsVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = new Bundle(kmaVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", kmaVar.c);
        builder.setAllowGeneratedReplies(kmaVar.c);
        bundle.putInt("android.support.action.semanticAction", kmaVar.e);
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(kmaVar.e);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(kmaVar.f);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(kmaVar.j);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", kmaVar.d);
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }
}
