package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.pcl;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(pcl pclVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) pclVar.C(remoteActionCompat.a);
        remoteActionCompat.b = pclVar.h(remoteActionCompat.b, 2);
        remoteActionCompat.c = pclVar.h(remoteActionCompat.c, 3);
        remoteActionCompat.d = (PendingIntent) pclVar.d(remoteActionCompat.d, 4);
        remoteActionCompat.e = pclVar.z(remoteActionCompat.e, 5);
        remoteActionCompat.f = pclVar.z(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, pcl pclVar) {
        pclVar.D(remoteActionCompat.a);
        pclVar.q(remoteActionCompat.b, 2);
        pclVar.q(remoteActionCompat.c, 3);
        pclVar.u(remoteActionCompat.d, 4);
        pclVar.n(remoteActionCompat.e, 5);
        pclVar.n(remoteActionCompat.f, 6);
    }
}
