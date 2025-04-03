package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cliq {
    public final ffbr a;
    private final ffbr b;

    public cliq(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final awui a() {
        return (awui) ((chco) this.b.b()).c().orElseThrow(new Supplier() { // from class: clim
            @Override // java.util.function.Supplier
            public final Object get() {
                return new IllegalArgumentException("RCS self identity is not present.");
            }
        });
    }
}
