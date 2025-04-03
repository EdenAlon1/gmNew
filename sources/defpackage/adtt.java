package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtt extends adtl {
    public Optional b;
    private eoio d;
    public Optional a = Optional.empty();
    public Optional c = Optional.empty();

    @Override // defpackage.adtl
    public final adtm a() {
        eoio eoioVar = this.d;
        if (eoioVar != null) {
            return new adtu(this.a, this.b, this.c, eoioVar);
        }
        throw new IllegalStateException("Missing required properties: bugleAdvancedFeedbackSource");
    }

    @Override // defpackage.adtl
    public final void b(eoio eoioVar) {
        if (eoioVar == null) {
            throw new NullPointerException("Null bugleAdvancedFeedbackSource");
        }
        this.d = eoioVar;
    }
}
