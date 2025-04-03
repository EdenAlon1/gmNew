package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzs {
    private static final cskc a = cskc.g("BugleRcs", "MessageLogDecorator");

    public static eopq a(byte[] bArr) {
        try {
        } catch (eygu e) {
            a.s("Failed to parse the log data from additional message details.", e);
        }
        if (bArr != null) {
            return (eopq) eyfy.parseFrom(eopq.a, bArr, eyfc.a());
        }
        a.r("Could not find log data in additional message details.");
        return eopq.a;
    }

    public static eoop b(Bundle bundle) {
        eoop eoopVar = (eoop) a(bundle.getByteArray("chat.extra.logData")).toBuilder();
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.h = 2;
        eopqVar.b = 2 | eopqVar.b;
        return eoopVar;
    }
}
