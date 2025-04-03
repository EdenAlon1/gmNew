package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emeo implements ffxy {
    final /* synthetic */ emeq a;

    public emeo(emeq emeqVar) {
        this.a = emeqVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            Intent intent = new Intent();
            intent.putExtra("resultKey", uri);
            this.a.a(-1, intent);
        }
        return ffcu.a;
    }
}
