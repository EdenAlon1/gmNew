package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsq extends Exception {
    public final lsp a;

    public lsq(lsp lspVar) {
        this("Unhandled input format:", lspVar);
    }

    public lsq(String str, lsp lspVar) {
        super(str + " " + String.valueOf(lspVar));
        this.a = lspVar;
    }
}
