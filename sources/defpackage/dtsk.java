package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dtsk implements Supplier {
    public final /* synthetic */ dtsr a;

    public /* synthetic */ dtsk(dtsr dtsrVar) {
        this.a = dtsrVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a.b();
    }
}
