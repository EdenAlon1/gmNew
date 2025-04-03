package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rea implements qtw {
    private final rco a = new rco();

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(rjr.a((InputStream) obj));
        return this.a.c(createSource, i, i2, qtuVar);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return true;
    }
}
