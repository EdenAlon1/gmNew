package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jdv implements hrc {
    public final ffix a;
    private final /* synthetic */ hrc b;

    public jdv(hrc hrcVar, ffix ffixVar) {
        this.a = ffixVar;
        this.b = hrcVar;
    }

    @Override // defpackage.hrc
    public final Object a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.hrc
    public final Map b() {
        return this.b.b();
    }

    @Override // defpackage.hrc
    public final boolean c(Object obj) {
        return this.b.c(obj);
    }

    @Override // defpackage.hrc
    public final hrd d(String str, ffix ffixVar) {
        return this.b.d(str, ffixVar);
    }
}
