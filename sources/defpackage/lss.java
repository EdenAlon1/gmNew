package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lss implements lsr {
    protected lsp b;
    protected lsp c;
    public ByteBuffer d;
    private lsp e;
    private lsp f;
    private ByteBuffer g;
    private boolean h;

    public lss() {
        ByteBuffer byteBuffer = a;
        this.g = byteBuffer;
        this.d = byteBuffer;
        this.e = lsp.a;
        lsp lspVar = lsp.a;
        this.f = lspVar;
        this.b = lspVar;
        this.c = lspVar;
    }

    @Override // defpackage.lsr
    public final lsp b(lsp lspVar) {
        this.e = lspVar;
        this.f = j(lspVar);
        return h() ? this.f : lsp.a;
    }

    @Override // defpackage.lsr
    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.d;
        this.d = a;
        return byteBuffer;
    }

    @Override // defpackage.lsr
    public final void d() {
        this.d = a;
        this.h = false;
        this.b = this.e;
        this.c = this.f;
        l();
    }

    @Override // defpackage.lsr
    public final void e() {
        this.h = true;
        m();
    }

    @Override // defpackage.lsr
    public final void g() {
        d();
        this.g = a;
        this.e = lsp.a;
        lsp lspVar = lsp.a;
        this.f = lspVar;
        this.b = lspVar;
        this.c = lspVar;
        n();
    }

    @Override // defpackage.lsr
    public boolean h() {
        return this.f != lsp.a;
    }

    @Override // defpackage.lsr
    public boolean i() {
        return this.h && this.d == a;
    }

    protected lsp j(lsp lspVar) {
        throw null;
    }

    protected final ByteBuffer k(int i) {
        if (this.g.capacity() < i) {
            this.g = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        ByteBuffer byteBuffer = this.g;
        this.d = byteBuffer;
        return byteBuffer;
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n() {
    }

    @Override // defpackage.lsr
    public /* synthetic */ long a(long j) {
        return j;
    }
}
