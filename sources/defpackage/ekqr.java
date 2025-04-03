package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekqr extends ekqx {
    public String a;
    public ekqn b;
    public Executor c;
    public byte d;
    private final emxc e;
    private eyhs f;
    private engr g;
    private engw h;
    private emxc i;
    private final emxc j;

    public ekqr() {
        emux emuxVar = emux.a;
        this.e = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
    }

    @Override // defpackage.ekqx
    public final ekqy a() {
        String str;
        eyhs eyhsVar;
        ekqn ekqnVar;
        engr engrVar = this.g;
        if (engrVar != null) {
            this.h = engrVar.g();
        } else if (this.h == null) {
            int i = engw.d;
            this.h = enou.a;
        }
        if (this.d == 1 && (str = this.a) != null && (eyhsVar = this.f) != null && (ekqnVar = this.b) != null) {
            return new ekqs(str, this.e, eyhsVar, ekqnVar, this.h, this.i, this.j, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.d == 0) {
            sb.append(" blockingSafeReads");
        }
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.f == null) {
            sb.append(" schema");
        }
        if (this.b == null) {
            sb.append(" storage");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ekqx
    public final engr b() {
        if (this.g == null) {
            int i = engw.d;
            this.g = new engr();
        }
        return this.g;
    }

    @Override // defpackage.ekqx
    public final void c(efet efetVar) {
        this.i = emxc.j(efetVar);
    }

    @Override // defpackage.ekqx
    public final void d(eyhs eyhsVar) {
        if (eyhsVar == null) {
            throw new NullPointerException("Null schema");
        }
        this.f = eyhsVar;
    }
}
