package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aisp extends dtrs {
    private final Consumer a;

    public aisp(Consumer consumer) {
        this.a = consumer;
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        btrw btrwVar;
        if (((Boolean) aitk.a.e()).booleanValue() && (btrwVar = (btrw) dtukVar.b()) != null && btrwVar.k() == 1 && !btrwVar.m().c()) {
            this.a.o(btrwVar.m());
        }
    }
}
