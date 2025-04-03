package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qun implements que {
    private final qxd a;

    public qun(qxd qxdVar) {
        this.a = qxdVar;
    }

    @Override // defpackage.que
    public final /* bridge */ /* synthetic */ quf a(Object obj) {
        return new quo((InputStream) obj, this.a);
    }

    @Override // defpackage.que
    public final Class b() {
        return InputStream.class;
    }
}
