package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crkm implements qtw {
    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        InputStream inputStream = (InputStream) obj;
        inputStream.getClass();
        qtuVar.getClass();
        qdh c = qcq.c(inputStream, null);
        Throwable th = c.b;
        if (th != null) {
            throw th;
        }
        Object obj2 = c.a;
        if (obj2 != null) {
            return new rcj(obj2);
        }
        return null;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        ((InputStream) obj).getClass();
        qtuVar.getClass();
        return true;
    }
}
