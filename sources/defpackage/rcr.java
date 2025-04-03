package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcr implements qtw {
    private final rdl a;

    public rcr(rdl rdlVar) {
        this.a = rdlVar;
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ qwv a(Object obj, int i, int i2, qtu qtuVar) {
        rdl rdlVar = this.a;
        return rdlVar.a(new rdw((ByteBuffer) obj, rdlVar.g, rdlVar.f), i, i2, qtuVar, rdl.e);
    }

    @Override // defpackage.qtw
    public final /* bridge */ /* synthetic */ boolean b(Object obj, qtu qtuVar) {
        return true;
    }
}
