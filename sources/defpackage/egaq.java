package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaq extends rhm {
    @Override // defpackage.rhm
    public final void d(Context context, qpt qptVar, qqk qqkVar) {
        ram ramVar = new ram(2000L);
        egah egahVar = new egah(context, new egcm(context, "oauth2:https://www.googleapis.com/auth/photos.image.readonly"));
        qqkVar.g(egam.class, ByteBuffer.class, new egap(egahVar, ramVar));
        qqkVar.g(egam.class, InputStream.class, new egao(egahVar, ramVar));
    }
}
