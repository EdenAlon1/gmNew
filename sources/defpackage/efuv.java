package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efuv {
    private final exgs a;

    public efuv(fapp fappVar) {
        exgr exgrVar = (exgr) exgs.a.createBuilder();
        exgrVar.copyOnWrite();
        exgs exgsVar = (exgs) exgrVar.instance;
        exgsVar.c = fappVar.cJ;
        exgsVar.b |= 1;
        exgrVar.copyOnWrite();
        exgs exgsVar2 = (exgs) exgrVar.instance;
        exgsVar2.e = 25;
        exgsVar2.b |= 4;
        this.a = (exgs) exgrVar.build();
    }

    public final Intent a(Context context, String str) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.libraries.user.profile.photopicker.picker.intentonly.PhotoPickerIntentActivity");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.profile.photopicker.ACCOUNT", str);
        ProtoParsers.k(bundle, "com.google.profile.photopicker.HOST_INFO", this.a);
        intent.putExtras(bundle);
        return intent;
    }
}
