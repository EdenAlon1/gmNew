package defpackage;

import android.graphics.Bitmap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lyo extends mdj {
    public final Queue a;
    public mcn b;
    public lqh c;
    public int d;
    public boolean e;
    private final lqg f;
    private boolean g;

    public lyo(lqg lqgVar, mdt mdtVar) {
        super(mdtVar);
        this.f = lqgVar;
        this.a = new LinkedBlockingQueue();
    }

    @Override // defpackage.mdj, defpackage.mbh
    public final void c() {
        this.n.d(new mds() { // from class: lyj
            @Override // defpackage.mds
            public final void a() {
                lyo lyoVar = lyo.this;
                lyoVar.d++;
                lyoVar.f();
            }
        });
    }

    @Override // defpackage.mdj
    public final int d() {
        return 0;
    }

    @Override // defpackage.mdj
    protected final void e() {
        this.a.clear();
        this.g = false;
        this.e = false;
        this.d = 0;
        lqh lqhVar = this.c;
        if (lqhVar != null) {
            try {
                lqhVar.a();
                this.c = null;
            } catch (lty e) {
                throw lsf.a(e);
            }
        }
        super.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f9, code lost:
    
        if (r6 != r9.getGenerationId()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyo.f():void");
    }

    @Override // defpackage.mdj
    public final void g() {
        this.n.d(new mds() { // from class: lyl
            @Override // defpackage.mds
            public final void a() {
                lyo lyoVar = lyo.this;
                lqh lqhVar = lyoVar.c;
                if (lqhVar != null) {
                    lqhVar.a();
                }
                lyoVar.a.clear();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mdj
    public final void h(mbj mbjVar) {
        lti.c(true);
        this.d = 0;
        this.b = mbjVar;
    }

    @Override // defpackage.mdj
    public final void i() {
        this.n.d(new mds() { // from class: lyk
            @Override // defpackage.mds
            public final void a() {
                lyo lyoVar = lyo.this;
                if (!lyoVar.a.isEmpty()) {
                    lyoVar.e = true;
                    return;
                }
                mcn mcnVar = lyoVar.b;
                lti.f(mcnVar);
                mcnVar.j();
                int i = lyt.a;
            }
        });
    }

    @Override // defpackage.mdj
    public final void j(final Bitmap bitmap, final lqf lqfVar, final ltr ltrVar) {
        this.n.d(new mds() { // from class: lym
            @Override // defpackage.mds
            public final void a() {
                ltr ltrVar2 = ltrVar;
                lti.b(ltrVar2.a(), "Bitmap queued but no timestamps provided.");
                lyn lynVar = new lyn(bitmap, lqfVar, ltrVar2);
                lyo lyoVar = lyo.this;
                lyoVar.a.add(lynVar);
                lyoVar.f();
                lyoVar.e = false;
            }
        });
    }
}
