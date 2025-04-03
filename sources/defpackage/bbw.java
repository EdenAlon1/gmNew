package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbw {
    public static bbt a(bbt... bbtVarArr) {
        List asList = Arrays.asList(bbtVarArr);
        return asList.isEmpty() ? new bbv() : asList.size() == 1 ? (bbt) asList.get(0) : new bbu(asList);
    }
}
