package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiys extends fizg {
    private static final long serialVersionUID = -8851454400765507520L;
    private fiyt a;
    private BitSet b;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.a);
        int length = this.b.length();
        for (short s = 0; s < length; s = (short) (s + 1)) {
            if (this.b.get(s)) {
                stringBuffer.append(" ");
                stringBuffer.append(fjaf.a(s));
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiys();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        this.a = new fiyt(fixbVar);
        this.b = new BitSet();
        int d = fixbVar.d();
        for (int i = 0; i < d; i++) {
            int c = fixbVar.c();
            for (int i2 = 0; i2 < 8; i2++) {
                if (((1 << (7 - i2)) & c) != 0) {
                    this.b.set((i * 8) + i2);
                }
            }
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        this.a.h(fixdVar, null, z);
        int length = this.b.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i |= this.b.get(i2) ? 1 << (7 - (i2 % 8)) : 0;
            if (i2 % 8 == 7 || i2 == length - 1) {
                fixdVar.g(i);
                i = 0;
            }
        }
    }
}
