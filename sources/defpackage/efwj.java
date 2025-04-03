package defpackage;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class efwj {
    public static efwk a(eg egVar) {
        Intent intent = egVar.getIntent();
        if (intent.getLongExtra("IMAGE_ID", -1L) != -1 && intent.getData() == null) {
            return new efwl(emxc.j(new eggc(intent.getLongExtra("IMAGE_ID", -1L))), emxc.i(intent.getStringExtra("IMAGE_DISPLAY_NAME")));
        }
        if (intent.getData() == null || intent.getLongExtra("IMAGE_ID", -1L) != -1) {
            emux emuxVar = emux.a;
            return new efwl(emuxVar, emuxVar);
        }
        Uri data = intent.getData();
        data.getClass();
        return new efwl(emxc.j(new eggd(data)), emux.a);
    }
}
