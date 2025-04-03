package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizh {
    private final Map a;

    public eizh(Map map) {
        this.a = map;
    }

    public final ListenableFuture a(String str) {
        emxf.p(this.a.containsKey(str), "No AddAccountHandler found for account type %s", str);
        return ((eizg) this.a.get(str)).a();
    }

    public final boolean b(String str) {
        return this.a.containsKey(str) && ((eizg) this.a.get(str)).b();
    }
}
