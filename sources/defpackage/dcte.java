package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;
import com.google.android.apps.messaging.navigation.targets.EditedMedia;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcte extends dcth {
    public final MediaViewerActivity a;
    public final ffbr b;
    public final ffbr c;
    public dctl d;
    public abo e;
    public boolean f = false;
    public boolean g = false;

    public dcte(MediaViewerActivity mediaViewerActivity, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = mediaViewerActivity;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final Intent a(Uri uri, String str, boolean z, boolean z2, String str2) {
        Intent putExtra = new Intent("android.intent.action.SEND").setType(str).putExtra("android.intent.extra.STREAM", uri);
        if (!this.f) {
            return putExtra;
        }
        if (z2) {
            return putExtra.putExtra("direct_send_result", z ? new DirectSendResult.Send(new EditedMedia(str, uri), str2) : new DirectSendResult.Send(null, str2));
        }
        return putExtra.putExtra("direct_send_result", z ? new DirectSendResult.Add(new EditedMedia(str, uri), str2) : new DirectSendResult.Add(null, str2));
    }
}
