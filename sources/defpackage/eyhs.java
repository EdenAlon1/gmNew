package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface eyhs extends eyht {
    eyhz<? extends eyhs> getParserForType();

    int getSerializedSize();

    eyhr newBuilderForType();

    eyhr toBuilder();

    byte[] toByteArray();

    eyee toByteString();

    void writeTo(eyer eyerVar);

    void writeTo(OutputStream outputStream);
}
