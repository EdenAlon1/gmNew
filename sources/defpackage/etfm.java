package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etfm {
    public static etga a(etfl etflVar) {
        try {
            InputStream inputStream = etflVar.a;
            eyfc eyfcVar = eyfc.a;
            eyib eyibVar = eyib.a;
            etzt etztVar = (etzt) eyfy.parseFrom(etzt.a, inputStream, eyfc.a);
            etflVar.a.close();
            return etga.b(etztVar);
        } catch (Throwable th) {
            etflVar.a.close();
            throw th;
        }
    }
}
