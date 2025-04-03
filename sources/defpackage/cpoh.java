package defpackage;

import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpoh implements Supplier {
    final /* synthetic */ cpio a;

    public cpoh(cpio cpioVar) {
        this.a = cpioVar;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        cpio cpioVar = cpio.c;
        cpio cpioVar2 = this.a;
        Objects.toString(cpioVar2);
        throw new cpnd("Sync did not resolve loading endpoint. SyncResult: ".concat(String.valueOf(cpioVar2)), cpioVar == this.a);
    }
}
