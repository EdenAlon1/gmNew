package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxaq extends dxay {
    private boolean a;
    private enip b;
    private byte c;

    @Override // defpackage.dxay
    public final dxba a() {
        if (this.b == null) {
            this.b = enpd.a;
        }
        if (this.c == 1) {
            return new dxar(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: requireUnmeteredNetwork");
    }

    @Override // defpackage.dxay
    public final void b(boolean z) {
        this.a = z;
        this.c = (byte) 1;
    }

    @Override // defpackage.dxay
    public final void c(Set set) {
        this.b = enip.o(set);
    }
}
