package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcm implements qtx {
    private final qxf a;
    private final qtx b;

    public rcm(qxf qxfVar, qtx qtxVar) {
        this.a = qxfVar;
        this.b = qtxVar;
    }

    @Override // defpackage.qta
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, qtu qtuVar) {
        return this.b.a(new rcp(((BitmapDrawable) ((qwv) obj).c()).getBitmap(), this.a), file, qtuVar);
    }

    @Override // defpackage.qtx
    public final int b() {
        return 2;
    }
}
