package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duci implements ducd {
    private static final byte[] a;
    private final HashMap b;

    static {
        int i = eodh.a;
        a = eodf.a.c("fake_key", StandardCharsets.UTF_8).e();
    }

    public duci() {
        new HashMap();
        this.b = new HashMap();
    }

    @Override // defpackage.ducd
    public final ListenableFuture a(String str) {
        emxc emxcVar = (emxc) this.b.get(str);
        if (emxcVar == null) {
            emxcVar = emxc.j(new ducb(a));
        }
        return erqt.i(emxcVar);
    }
}
