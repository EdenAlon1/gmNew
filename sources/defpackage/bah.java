package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bah implements avq {
    final /* synthetic */ int a;
    final /* synthetic */ ByteBuffer b;

    public bah(int i, ByteBuffer byteBuffer) {
        this.a = i;
        this.b = byteBuffer;
    }

    @Override // defpackage.avq
    public final int a() {
        return 4;
    }

    @Override // defpackage.avq
    public final int b() {
        return this.a;
    }

    @Override // defpackage.avq
    public final ByteBuffer c() {
        return this.b;
    }
}
