package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsiz extends fflr {
    final /* synthetic */ dsjf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsiz(Object obj, dsjf dsjfVar) {
        super(obj);
        this.a = dsjfVar;
    }

    @Override // defpackage.fflr
    protected final void a(ffmx ffmxVar, Object obj, Object obj2) {
        final euv euvVar = (euv) obj2;
        euvVar.getClass();
        this.a.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: dshx
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[RETURN] */
            @Override // android.widget.TextView.OnEditorActionListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onEditorAction(android.widget.TextView r4, int r5, android.view.KeyEvent r6) {
                /*
                    r3 = this;
                    dshw r4 = new dshw
                    r4.<init>()
                    ffbz r4 = defpackage.ffca.a(r4)
                    euv r6 = defpackage.euv.this
                    r0 = 0
                    r1 = 1
                    r2 = 0
                    switch(r5) {
                        case 2: goto L52;
                        case 3: goto L42;
                        case 4: goto L32;
                        case 5: goto L22;
                        case 6: goto L12;
                        case 7: goto L52;
                        default: goto L11;
                    }
                L11:
                    return r0
                L12:
                    ffji r5 = r6.b
                    if (r5 == 0) goto L1f
                    dsid r4 = defpackage.dsie.a(r4)
                    r5.invoke(r4)
                    ffcu r2 = defpackage.ffcu.a
                L1f:
                    if (r2 == 0) goto L52
                    return r1
                L22:
                    ffji r5 = r6.c
                    if (r5 == 0) goto L2f
                    dsid r4 = defpackage.dsie.a(r4)
                    r5.invoke(r4)
                    ffcu r2 = defpackage.ffcu.a
                L2f:
                    if (r2 == 0) goto L52
                    return r1
                L32:
                    ffji r5 = r6.e
                    if (r5 == 0) goto L3f
                    dsid r4 = defpackage.dsie.a(r4)
                    r5.invoke(r4)
                    ffcu r2 = defpackage.ffcu.a
                L3f:
                    if (r2 == 0) goto L52
                    return r1
                L42:
                    ffji r5 = r6.d
                    if (r5 == 0) goto L4f
                    dsid r4 = defpackage.dsie.a(r4)
                    r5.invoke(r4)
                    ffcu r2 = defpackage.ffcu.a
                L4f:
                    if (r2 == 0) goto L52
                    return r1
                L52:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dshx.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
            }
        });
    }

    @Override // defpackage.fflr
    protected final boolean b(Object obj, Object obj2) {
        return !ffkj.e(obj, obj2);
    }
}
