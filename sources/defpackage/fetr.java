package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fetr implements feju {
    final fets a;
    final /* synthetic */ fetu b;

    public fetr(fetu fetuVar, fets fetsVar) {
        this.b = fetuVar;
        this.a = fetsVar;
    }

    private static final Integer b(febo feboVar) {
        String str = (String) feboVar.b(fetu.f);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0277  */
    @Override // defpackage.feju
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(io.grpc.Status r21, defpackage.fejt r22, defpackage.febo r23) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fetr.a(io.grpc.Status, fejt, febo):void");
    }

    @Override // defpackage.feju
    public final void c(febo feboVar) {
        int i;
        int i2;
        if (this.a.d > 0) {
            feboVar.e(fetu.e);
            feboVar.g(fetu.e, String.valueOf(this.a.d));
        }
        this.b.u(this.a);
        if (this.b.w.f == this.a) {
            fett fettVar = this.b.u;
            if (fettVar != null) {
                do {
                    i = fettVar.d.get();
                    i2 = fettVar.a;
                    if (i == i2) {
                        break;
                    }
                } while (!fettVar.d.compareAndSet(i, Math.min(fettVar.c + i, i2)));
            }
            fetu fetuVar = this.b;
            fetuVar.l.execute(new fetk(this, feboVar));
        }
    }

    @Override // defpackage.fevr
    public final void d(fevq fevqVar) {
        fetj fetjVar = this.b.w;
        emxf.m(fetjVar.f != null, "Headers should be received prior to messages.");
        if (fetjVar.f != this.a) {
            fend.g(fevqVar);
        } else {
            this.b.l.execute(new fetp(this, fevqVar));
        }
    }

    @Override // defpackage.fevr
    public final void e() {
        if (this.b.o()) {
            fetu fetuVar = this.b;
            fetuVar.l.execute(new fetq(this));
        }
    }
}
