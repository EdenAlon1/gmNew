package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efio implements efge {
    @Override // defpackage.efge
    public final /* bridge */ /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((eyhs) obj).writeTo(outputStream);
    }

    public abstract eyfc b();

    public abstract eyhs c();

    /* JADX WARN: Type inference failed for: r3v1, types: [eyhs, java.lang.Object] */
    public final eyhs d(InputStream inputStream) {
        return c().getParserForType().k(inputStream, b());
    }
}
