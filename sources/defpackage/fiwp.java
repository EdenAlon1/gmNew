package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiwp implements fiwo {
    final int a;
    final fiyt b;
    final int c;
    final int d;

    public fiwp(fiyt fiytVar, int i, fizn fiznVar, int i2, long j) {
        this.b = fiytVar;
        this.a = i;
        long j2 = fiznVar != null ? fiznVar.b : 0L;
        this.c = i2;
        this.d = fiwq.a(j2, j);
    }

    @Override // defpackage.fiwo
    public final int a(int i) {
        return this.c - i;
    }

    @Override // defpackage.fiwo
    public final boolean b() {
        return ((int) (System.currentTimeMillis() / 1000)) >= this.d;
    }

    @Override // defpackage.fiwo
    public final int c() {
        return this.a;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.a == 0) {
            StringBuffer stringBuffer2 = new StringBuffer("NXDOMAIN ");
            stringBuffer2.append(this.b);
            stringBuffer.append(stringBuffer2.toString());
        } else {
            StringBuffer stringBuffer3 = new StringBuffer("NXRRSET ");
            stringBuffer3.append(this.b);
            stringBuffer3.append(" ");
            stringBuffer3.append(fjaf.a(this.a));
            stringBuffer.append(stringBuffer3.toString());
        }
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.c);
        return stringBuffer.toString();
    }
}
