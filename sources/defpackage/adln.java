package defpackage;

import j$.util.Optional;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adln extends adnh {
    public ebsj a;
    private Optional b = Optional.empty();
    private Optional c = Optional.empty();
    private Optional d = Optional.empty();

    @Override // defpackage.adnh
    public final adni a() {
        ebsj ebsjVar = this.a;
        if (ebsjVar != null) {
            return new adlo(ebsjVar, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: features");
    }

    @Override // defpackage.adnh
    public final void b(Function function) {
        this.d = Optional.of(function);
    }

    @Override // defpackage.adnh
    public final void c(Function function) {
        this.c = Optional.of(function);
    }

    @Override // defpackage.adnh
    public final void d(adnk adnkVar) {
        this.b = Optional.of(adnkVar);
    }
}
