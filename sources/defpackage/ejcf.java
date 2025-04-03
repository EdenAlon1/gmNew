package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejcf implements rao {
    private final rax a;

    public ejcf(rax raxVar) {
        this.a = raxVar;
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        return this.a.a(String.class, InputStream.class).a(((ejfs) obj).b().h, i, i2, qtuVar);
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return (((ejfs) obj).b().b & 32) != 0;
    }
}
