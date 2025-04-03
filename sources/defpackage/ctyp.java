package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctyp {
    private final errl a;
    private final aipn b;

    public ctyp(errl errlVar, aipn aipnVar) {
        this.a = errlVar;
        this.b = aipnVar;
    }

    public final ListenableFuture a(String str) {
        Optional a = this.b.a();
        if (a.isEmpty()) {
            return erqt.g();
        }
        SettableFuture create = SettableFuture.create();
        ((CronetEngine) a.get()).newUrlRequestBuilder(str, new ctyo(create), this.a).setTrafficStatsTag(8197).build().start();
        return create;
    }
}
