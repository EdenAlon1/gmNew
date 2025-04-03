package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebtn implements rao {
    private final rax a;

    public ebtn(rax raxVar) {
        this.a = raxVar;
    }

    @Override // defpackage.rao
    public final /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        String str = ((ebsw) ((ebtq) obj).b()).c;
        str.getClass();
        return this.a.a(String.class, InputStream.class).a(str, i, i2, qtuVar);
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ebsw) ((ebtq) obj).b()).c != null;
    }
}
