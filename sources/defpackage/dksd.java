package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksd extends dksn {
    public dksm a;
    public Executor b;
    public Function c;
    private boolean d;
    private Object e;
    private byte f;

    @Override // defpackage.dksn
    public final dkso a() {
        dksm dksmVar;
        Executor executor;
        Object obj;
        if (this.f == 1 && (dksmVar = this.a) != null && (executor = this.b) != null && (obj = this.e) != null) {
            return new dkse(dksmVar, executor, this.d, obj, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" observer");
        }
        if (this.b == null) {
            sb.append(" executor");
        }
        if (this.f == 0) {
            sb.append(" notifyOnAdd");
        }
        if (this.e == null) {
            sb.append(" identifier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dksn
    public final void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null identifier");
        }
        this.e = obj;
    }

    @Override // defpackage.dksn
    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) 1;
    }
}
