package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayzx {
    public final cqoh a;
    public final Duration b;
    public Instant c;
    private final fgjb d = new fgjf();
    private final AtomicReference e = new AtomicReference();

    public ayzx(cqoh cqohVar, Duration duration) {
        this.a = cqohVar;
        this.b = duration;
        Instant instant = Instant.EPOCH;
        instant.getClass();
        this.c = instant;
    }

    public final Object a() {
        return DesugarAtomicReference.updateAndGet(this.e, new UnaryOperator() { // from class: ayzv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ayzx ayzxVar = ayzx.this;
                if (Duration.between(ayzxVar.c, ayzxVar.a.f()).compareTo(ayzxVar.b) > 0) {
                    return null;
                }
                return obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x0075, B:21:0x0060, B:23:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ffji, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffji r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ayzw
            if (r0 == 0) goto L13
            r0 = r8
            ayzw r0 = (defpackage.ayzw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ayzw r0 = new ayzw
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r7 = r0.a
            fgjb r7 = (defpackage.fgjb) r7
            ayzx r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L75
        L31:
            r8 = move-exception
            goto L83
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            fgjf r7 = r0.f
            java.lang.Object r2 = r0.a
            ffji r2 = (defpackage.ffji) r2
            ayzx r4 = r0.e
            defpackage.ffci.b(r8)
            goto L60
        L47:
            defpackage.ffci.b(r8)
            fgjb r8 = r6.d
            r0.e = r6
            r0.a = r7
            r2 = r8
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.d = r4
            java.lang.Object r2 = r8.a(r5, r0)
            if (r2 == r1) goto L87
            r4 = r6
            r2 = r7
            r7 = r8
        L60:
            java.lang.Object r8 = r4.a()     // Catch: java.lang.Throwable -> L31
            if (r8 != 0) goto L7f
            r0.e = r4     // Catch: java.lang.Throwable -> L31
            r0.a = r7     // Catch: java.lang.Throwable -> L31
            r0.f = r5     // Catch: java.lang.Throwable -> L31
            r0.d = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L31
            if (r8 == r1) goto L87
            r0 = r4
        L75:
            java.util.concurrent.atomic.AtomicReference r1 = r0.e     // Catch: java.lang.Throwable -> L31
            ayzu r2 = new ayzu     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            j$.util.concurrent.atomic.DesugarAtomicReference.updateAndGet(r1, r2)     // Catch: java.lang.Throwable -> L31
        L7f:
            r7.b(r5)
            return r8
        L83:
            r7.b(r5)
            throw r8
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayzx.b(ffji, ffgu):java.lang.Object");
    }
}
