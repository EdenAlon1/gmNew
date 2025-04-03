package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxk extends eyfq implements faxm {
    public faxk() {
        super(faxl.a);
    }

    @Override // defpackage.faxm
    public final int a() {
        return ((faxl) this.instance).c.size();
    }

    @Override // defpackage.faxm
    public final String b() {
        return ((faxl) this.instance).b;
    }

    @Override // defpackage.faxm
    public final List c() {
        return DesugarCollections.unmodifiableList(((faxl) this.instance).d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.faxm
    public final String d() {
        return (String) ((faxl) this.instance).c.get(0);
    }
}
