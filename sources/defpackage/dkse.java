package defpackage;

import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkse extends dkso {
    public final boolean a;
    public final Object b;
    private final dksm c;
    private final Executor d;
    private final Function e;

    public dkse(dksm dksmVar, Executor executor, boolean z, Object obj, Function function) {
        this.c = dksmVar;
        this.d = executor;
        this.a = z;
        this.b = obj;
        this.e = function;
    }

    @Override // defpackage.dkso
    public final dksm a() {
        return this.c;
    }

    @Override // defpackage.dkso
    public final Object b() {
        return this.b;
    }

    @Override // defpackage.dkso
    public final Executor c() {
        return this.d;
    }

    @Override // defpackage.dkso
    public final Function d() {
        return this.e;
    }

    @Override // defpackage.dkso
    public final boolean e() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.dkso
            r2 = 0
            if (r1 == 0) goto L4e
            dkso r5 = (defpackage.dkso) r5
            dksm r1 = r4.c
            dksm r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
            java.util.concurrent.Executor r1 = r4.d
            java.util.concurrent.Executor r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
            boolean r1 = r4.a
            boolean r3 = r5.e()
            if (r1 != r3) goto L4e
            java.lang.Object r1 = r4.b
            java.lang.Object r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L4e
            java.util.function.Function r1 = r4.e
            if (r1 != 0) goto L42
            java.util.function.Function r5 = r5.d()
            if (r5 != 0) goto L4e
            goto L4d
        L42:
            java.util.function.Function r5 = r5.d()
            boolean r5 = defpackage.afg$$ExternalSyntheticApiModelOutline0.m113m(r1, r5)
            if (r5 != 0) goto L4d
            goto L4e
        L4d:
            return r0
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dkse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.a ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
        Function function = this.e;
        return (hashCode * 1000003) ^ (function == null ? 0 : function.hashCode());
    }

    public final String toString() {
        Function function = this.e;
        Object obj = this.b;
        Executor executor = this.d;
        return "ObserverWrapper{observer=" + this.c.toString() + ", executor=" + executor.toString() + ", notifyOnAdd=" + this.a + ", identifier=" + obj.toString() + ", filter=" + String.valueOf(function) + "}";
    }
}
