package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class npu {
    public long a;
    public final lsp b;
    public final lsu c;

    public npu(lsp lspVar, lsu lsuVar, long j) {
        this.b = lspVar;
        this.a = j;
        this.c = lsuVar;
    }

    public final void a(ByteBuffer byteBuffer, long j) {
        lti.a(j >= this.a);
        byteBuffer.position(byteBuffer.position() + (((int) (j - this.a)) * this.b.e));
        this.a = j;
    }
}
