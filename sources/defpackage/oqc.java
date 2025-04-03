package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oqc implements wb, oqs {
    public final oql a;
    public boolean b = false;
    private final ord c;
    private final opn d;
    private final oqb e;

    public oqc(ord ordVar, oqb oqbVar, opn opnVar, oql oqlVar) {
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        this.c = ordVar;
        this.e = oqbVar;
        this.d = opnVar;
        this.a = oqlVar;
    }

    private final void a() {
        this.b = false;
        this.d.a();
        oql oqlVar = this.a;
        synchronized (oqlVar.c) {
            int i = oqlVar.b;
            if (i == 0) {
                return;
            }
            int i2 = i - 1;
            oqlVar.b = i2;
            if (i2 == 0) {
                oqlVar.a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r10.getY() > r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0075, code lost:
    
        if (r10.getY() > r4) goto L27;
     */
    @Override // defpackage.wb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.support.v7.widget.RecyclerView r9, android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqc.d(android.support.v7.widget.RecyclerView, android.view.MotionEvent):void");
    }

    @Override // defpackage.oqs
    public final void g() {
        this.b = false;
        this.d.a();
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.b) {
            d(recyclerView, motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 2) {
            return this.b;
        }
        return false;
    }

    @Override // defpackage.oqs
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
    }
}
