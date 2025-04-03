package defpackage;

import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aizp implements alnu {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final Set e;
    private final ffsk f;

    public aizp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar4.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.f = ffskVar;
        this.e = fffi.d(aixs.a, aixs.c, aixs.d, aixs.e, aixs.f);
    }

    @Override // defpackage.alnu
    public final void a() {
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() || ((Optional) this.b.b()).isEmpty()) {
            return;
        }
        axol.k(this.f, null, new aizo(this, null), 3);
    }
}
