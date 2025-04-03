package defpackage;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efij implements fbba {
    /* JADX WARN: Multi-variable type inference failed */
    public static efgc a(Executor executor, efbm efbmVar, Set set) {
        efim efimVar = efim.a;
        HashMap hashMap = new HashMap();
        engw n = engw.n(set);
        int size = n.size();
        for (int i = 0; i < size; i++) {
            efgd.a((efif) n.get(i), hashMap);
        }
        return new efgc(executor, efbmVar, efimVar, hashMap);
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
