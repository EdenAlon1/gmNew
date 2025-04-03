package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azcv implements Supplier {
    final /* synthetic */ azcw a;

    public azcv(azcw azcwVar) {
        this.a = azcwVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azcr azcrVar = this.a.a;
        if (azcrVar == null || azcrVar.equals(null)) {
            return null;
        }
        return azcs.b(this.a.a);
    }
}
