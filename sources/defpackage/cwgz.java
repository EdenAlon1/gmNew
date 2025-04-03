package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwgz extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cwha c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwgz(cwha cwhaVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cwhaVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cwgz cwgzVar = new cwgz(this.c, (ffgu) obj3);
        cwgzVar.a = (cwir) obj;
        cwgzVar.b = (cwec) obj2;
        return cwgzVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List ak;
        ffci.b(obj);
        final cwir cwirVar = (cwir) this.a;
        cwjb cwjbVar = cwirVar.d;
        Object obj2 = this.b;
        if (cwjbVar.d()) {
            ak = ffel.a;
        } else {
            List<ChipData> list = cwirVar.a;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (final ChipData chipData : list) {
                final cwha cwhaVar = this.c;
                arrayList.add(new dmjr(chipData.b, ((tud) cwhaVar.e.b()).a(chipData), !chipData.e, new ffix() { // from class: cwgv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        cwha.this.b.c(chipData);
                        return ffcu.a;
                    }
                }, new dmjs(null)));
            }
            ak = ffdx.ak(arrayList);
        }
        final cwha cwhaVar2 = this.c;
        cwhc cwhcVar = cwhaVar2.a;
        final cwec cwecVar = (cwec) obj2;
        return new cwhb(new dmte(ak, new cwgy(cwhcVar), new ffix() { // from class: cwgx
            @Override // defpackage.ffix
            public final Object invoke() {
                cwha cwhaVar3 = cwha.this;
                if (((String) cwhaVar3.a.a().a()).length() == 0) {
                    cwir cwirVar2 = cwirVar;
                    if (!cwirVar2.e.isEmpty()) {
                        cwhaVar3.b.c((ChipData) ffdx.P(cwirVar2.e));
                    }
                }
                return ffcu.a;
            }
        }, new ffix() { // from class: cwgw
            /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
            
                if (r2.a(r1) == false) goto L6;
             */
            @Override // defpackage.ffix
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    r5 = this;
                    cwha r0 = r2
                    cwir r1 = defpackage.cwir.this
                    cwjb r1 = r1.d
                    cwjb r2 = defpackage.cwjb.a
                    if (r1 != r2) goto L2d
                    cwhc r1 = r0.a
                    hkx r1 = r1.a()
                    java.lang.Object r1 = r1.a()
                    java.lang.String r1 = (java.lang.String) r1
                    ffbr r2 = r0.d
                    java.lang.Object r2 = r2.b()
                    daxg r2 = (defpackage.daxg) r2
                    java.util.Locale r3 = java.util.Locale.ROOT
                    java.lang.String r1 = r1.toLowerCase(r3)
                    r1.getClass()
                    boolean r1 = r2.a(r1)
                    if (r1 != 0) goto L90
                L2d:
                    cwec r1 = r3
                    java.util.List r1 = r1.b
                    java.util.Iterator r1 = r1.iterator()
                L35:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L57
                    java.lang.Object r2 = r1.next()
                    r3 = r2
                    cwgp r3 = (defpackage.cwgp) r3
                    cwfb r4 = r3.a()
                    dngx r4 = r4.a
                    boolean r4 = r4 instanceof defpackage.dngp
                    if (r4 != 0) goto L58
                    cwfb r3 = r3.a()
                    dngx r3 = r3.a
                    boolean r3 = r3 instanceof defpackage.dngv
                    if (r3 == 0) goto L35
                    goto L58
                L57:
                    r2 = 0
                L58:
                    cwgp r2 = (defpackage.cwgp) r2
                    if (r2 == 0) goto L90
                    cwfb r1 = r2.a()
                    dngx r1 = r1.a
                    boolean r2 = r1 instanceof defpackage.dngp
                    if (r2 == 0) goto L73
                    dngp r1 = (defpackage.dngp) r1
                    ffix r1 = r1.e
                    r1.invoke()
                    cwav r0 = r0.c
                    r0.b()
                    goto L90
                L73:
                    boolean r2 = r1 instanceof defpackage.dngv
                    if (r2 == 0) goto L88
                    dngv r1 = (defpackage.dngv) r1
                    boolean r2 = r1.d
                    if (r2 != 0) goto L82
                    ffix r1 = r1.f
                    r1.invoke()
                L82:
                    cwav r0 = r0.c
                    r0.b()
                    goto L90
                L88:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.String r1 = "Unexpected ListItemUiData when clicking on Done button"
                    r0.<init>(r1)
                    throw r0
                L90:
                    ffcu r0 = defpackage.ffcu.a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwgw.invoke():java.lang.Object");
            }
        }, cwhcVar.a(), new dmtd((byte[]) null)), cwecVar);
    }
}
