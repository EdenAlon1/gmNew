package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.kqk;
import defpackage.ksw;
import defpackage.pcn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class RemoteActionCompat implements pcn {
    public IconCompat a;
    public CharSequence b;
    public CharSequence c;
    public PendingIntent d;
    public boolean e;
    public boolean f;

    public RemoteActionCompat() {
    }

    public static RemoteActionCompat a(RemoteAction remoteAction) {
        Icon icon;
        CharSequence title;
        CharSequence contentDescription;
        PendingIntent actionIntent;
        boolean isEnabled;
        boolean shouldShowIcon;
        ksw.h(remoteAction);
        icon = remoteAction.getIcon();
        IconCompat e = kqk.e(icon);
        title = remoteAction.getTitle();
        contentDescription = remoteAction.getContentDescription();
        actionIntent = remoteAction.getActionIntent();
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(e, title, contentDescription, actionIntent);
        isEnabled = remoteAction.isEnabled();
        remoteActionCompat.e = isEnabled;
        if (Build.VERSION.SDK_INT >= 28) {
            shouldShowIcon = remoteAction.shouldShowIcon();
            remoteActionCompat.f = shouldShowIcon;
        }
        return remoteActionCompat;
    }

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.a = iconCompat;
        ksw.h(charSequence);
        this.b = charSequence;
        ksw.h(charSequence2);
        this.c = charSequence2;
        ksw.h(pendingIntent);
        this.d = pendingIntent;
        this.e = true;
        this.f = true;
    }
}
