package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efux {
    public final ffbr a;
    public final ffbr b;
    private final Activity c;
    private final fr d;

    public efux(eg egVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = egVar;
        this.d = egVar.a();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a(long j, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("collectionIdKey", j);
        bundle.putString("collectionTitleKey", str);
        efvf efvfVar = new efvf();
        efvfVar.at(bundle);
        b(efvfVar, "ArtCollectionsTag");
    }

    public final void b(ea eaVar, String str) {
        cg cgVar = new cg(this.d);
        cgVar.x(R.id.content, eaVar, str);
        cgVar.C();
        cgVar.v(null);
        cgVar.j();
        this.d.an();
    }

    public final void c(long j, String str) {
        efwl efwlVar = new efwl(emxc.j(new eggc(j)), emxc.i(str));
        Intent intent = new Intent();
        Activity activity = this.c;
        Intent putExtras = intent.setClassName(activity, "com.google.android.libraries.user.profile.photopicker.art.edit.ArtEditActivity").putExtras(activity.getIntent());
        emxc emxcVar = efwlVar.a;
        if (emxcVar.g()) {
            if (((eghh) emxcVar.c()).b() == 1) {
                putExtras.putExtra("IMAGE_ID", ((eghh) efwlVar.a.c()).a());
                emxc emxcVar2 = efwlVar.b;
                if (emxcVar2.g()) {
                    putExtras.putExtra("IMAGE_DISPLAY_NAME", (String) emxcVar2.c());
                }
            } else {
                putExtras.setData(((eghh) efwlVar.a.c()).c());
            }
        }
        this.c.startActivityForResult(putExtras, 10000);
    }
}
