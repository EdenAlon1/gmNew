package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckhn extends ckjq {
    public Optional a = Optional.empty();
    private boolean b;
    private byte c;

    @Override // defpackage.ckjq
    public final ckjr a() {
        if (this.c == 1) {
            return new ckho(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: conversationExistsByThreadId");
    }

    @Override // defpackage.ckjq
    public final void b(boolean z) {
        this.b = z;
        this.c = (byte) 1;
    }
}
