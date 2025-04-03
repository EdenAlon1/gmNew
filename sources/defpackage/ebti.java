package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebti extends rhm {
    final /* synthetic */ ebwq a;

    public ebti(ebwq ebwqVar) {
        this.a = ebwqVar;
    }

    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        qqkVar.g(ebtq.class, Bitmap.class, new ebtj(context, this.a));
        qqkVar.g(ebtq.class, Bitmap.class, new ebtl(new ebto(context)));
        qqkVar.g(ebtq.class, InputStream.class, new ebtk());
    }
}
