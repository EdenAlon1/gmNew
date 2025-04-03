package defpackage;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrv implements PointerInputEventHandler {
    final /* synthetic */ ffky a;
    final /* synthetic */ ffky b;
    final /* synthetic */ hho c;
    final /* synthetic */ hho d;
    final /* synthetic */ hho e;
    final /* synthetic */ ffji f;
    final /* synthetic */ Context g;
    final /* synthetic */ boolean h;
    final /* synthetic */ ffix i;
    final /* synthetic */ iir j;

    public dmrv(ffky ffkyVar, ffky ffkyVar2, hho hhoVar, hho hhoVar2, hho hhoVar3, ffji ffjiVar, Context context, boolean z, ffix ffixVar, iir iirVar) {
        this.a = ffkyVar;
        this.b = ffkyVar2;
        this.c = hhoVar;
        this.d = hhoVar2;
        this.e = hhoVar3;
        this.f = ffjiVar;
        this.g = context;
        this.h = z;
        this.i = ffixVar;
        this.j = iirVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(ild ildVar, ffgu<? super ffcu> ffguVar) {
        final ffky ffkyVar = this.a;
        final ffky ffkyVar2 = this.b;
        final hho hhoVar = this.c;
        final hho hhoVar2 = this.d;
        ffji ffjiVar = new ffji() { // from class: dmrr
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ffky.this.a = 0.0f;
                ffkyVar2.a = 0.0f;
                hhoVar.b(false);
                hhoVar2.b(false);
                return ffcu.a;
            }
        };
        ffix ffixVar = new ffix() { // from class: dmrs
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        final hho hhoVar3 = this.e;
        final ffji ffjiVar2 = this.f;
        final Context context = this.g;
        ffix ffixVar2 = new ffix() { // from class: dmrt
            @Override // defpackage.ffix
            public final Object invoke() {
                hho.this.b(false);
                hhoVar2.b(false);
                hho hhoVar4 = hhoVar3;
                if (((Boolean) hhoVar4.a()).booleanValue()) {
                    ffjiVar2.invoke(context);
                    hhoVar4.b(false);
                }
                return ffcu.a;
            }
        };
        final boolean z = this.h;
        final ffix ffixVar3 = this.i;
        final iir iirVar = this.j;
        Object b = dpu.b(ildVar, new doe(ffjiVar, ffixVar, ffixVar2, new ffjm() { // from class: dmru
            /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
            @Override // defpackage.ffjm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(java.lang.Object r12, java.lang.Object r13) {
                /*
                    r11 = this;
                    iku r12 = (defpackage.iku) r12
                    iak r13 = (defpackage.iak) r13
                    r12.getClass()
                    hho r12 = defpackage.hho.this
                    java.lang.Object r0 = r12.a()
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto Le1
                    hho r0 = r2
                    java.lang.Object r1 = r0.a()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto Le1
                    hho r1 = r3
                    java.lang.Object r2 = r1.a()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L33
                    goto Le1
                L33:
                    boolean r2 = r6
                    ffky r3 = r5
                    ffky r4 = r4
                    long r5 = r13.a
                    r7 = 32
                    long r5 = r5 >> r7
                    float r7 = r4.a
                    int r5 = (int) r5
                    float r5 = java.lang.Float.intBitsToFloat(r5)
                    float r7 = r7 + r5
                    long r5 = r13.a
                    r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
                    long r5 = r5 & r8
                    float r13 = r3.a
                    int r5 = (int) r5
                    float r5 = java.lang.Float.intBitsToFloat(r5)
                    float r13 = r13 + r5
                    r5 = 1
                    r6 = 1120403456(0x42c80000, float:100.0)
                    r8 = 0
                    r9 = 0
                    if (r2 == 0) goto L62
                    int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                    if (r2 >= 0) goto L66
                    goto L68
                L62:
                    int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                    if (r2 > 0) goto L68
                L66:
                    r2 = r9
                    goto L7b
                L68:
                    float r2 = java.lang.Math.abs(r7)
                    r10 = 1132068864(0x437a0000, float:250.0)
                    int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
                    if (r2 < 0) goto L66
                    float r2 = java.lang.Math.abs(r13)
                    int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                    if (r2 > 0) goto L66
                    r2 = r5
                L7b:
                    ffix r10 = r7
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r12.b(r2)
                    int r2 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                    if (r2 >= 0) goto L9d
                    float r2 = java.lang.Math.abs(r13)
                    r8 = 1125515264(0x43160000, float:150.0)
                    int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                    if (r2 < 0) goto L9d
                    float r2 = java.lang.Math.abs(r7)
                    int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                    if (r2 > 0) goto L9d
                    if (r10 == 0) goto L9d
                    goto L9e
                L9d:
                    r5 = r9
                L9e:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
                    r0.b(r2)
                    r4.a = r7
                    r3.a = r13
                    java.lang.Object r12 = r12.a()
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto Lc9
                    iir r12 = r10
                    android.content.Context r13 = r9
                    ffji r0 = r8
                    r0.invoke(r13)
                    r12.a(r9)
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
                    r1.b(r12)
                    goto Le1
                Lc9:
                    java.lang.Object r12 = r0.a()
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto Le1
                    if (r10 == 0) goto Lda
                    r10.invoke()
                Lda:
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r9)
                    r1.b(r12)
                Le1:
                    ffcu r12 = defpackage.ffcu.a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dmru.a(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }, null), ffguVar);
        ffhh ffhhVar = ffhh.a;
        if (b != ffhhVar) {
            b = ffcu.a;
        }
        return b == ffhhVar ? b : ffcu.a;
    }
}
