package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class efek {
    public static OutputStream a(efel efelVar, OutputStream outputStream) {
        if (outputStream != null) {
            outputStream.close();
        }
        throw new efcy("wrapForAppend not supported by ".concat(efelVar.c()));
    }
}
