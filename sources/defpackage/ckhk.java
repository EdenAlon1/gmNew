package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhk extends ckjc {
    public engw a;
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();

    @Override // defpackage.ckjc
    public final ckjd a() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return new ckhl(engwVar, this.b, this.c, this.d);
        }
        throw new IllegalStateException("Missing required properties: allParameterResults");
    }
}
