package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exoo extends exor {
    public byte a;
    private final Optional b = Optional.empty();

    @Override // defpackage.exor
    public final exos a() {
        if (this.a == 1) {
            return new exop(this.b);
        }
        throw new IllegalStateException("Missing required properties: rotationDegrees");
    }
}
