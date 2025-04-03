package defpackage;

import android.util.SparseArray;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lst extends lss {
    private final SparseArray e = new SparseArray();

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        lsu lsuVar = (lsu) this.e.get(this.b.c);
        lti.g(lsuVar);
        int remaining = byteBuffer.remaining() / this.b.e;
        ByteBuffer k = k(this.c.e * remaining);
        lsn.b(byteBuffer, this.b, k, this.c, lsuVar, remaining, false);
        k.flip();
    }

    @Override // defpackage.lss
    protected final lsp j(lsp lspVar) {
        if (lspVar.d != 2) {
            throw new lsq(lspVar);
        }
        lsu lsuVar = (lsu) this.e.get(lspVar.c);
        if (lsuVar != null) {
            return lsuVar.d ? lsp.a : new lsp(lspVar.b, lsuVar.b, 2);
        }
        throw new lsq("No mixing matrix for input channel count", lspVar);
    }

    public final void o(lsu lsuVar) {
        this.e.put(lsuVar.a, lsuVar);
    }
}
