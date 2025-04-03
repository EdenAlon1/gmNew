package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiyw extends fizg {
    private static final long serialVersionUID = -6254521894809367938L;
    private List a;

    @Override // defpackage.fizg
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        List list = this.a;
        if (list != null) {
            stringBuffer.append(list);
            stringBuffer.append(" ");
        }
        stringBuffer.append(" ; payload ");
        stringBuffer.append(this.h);
        stringBuffer.append(", xrcode ");
        stringBuffer.append(f());
        stringBuffer.append(", version ");
        stringBuffer.append((int) ((this.i >>> 16) & 255));
        stringBuffer.append(", flags ");
        stringBuffer.append((int) (this.i & 65535));
        return stringBuffer.toString();
    }

    @Override // defpackage.fizg
    public final fizg b() {
        return new fiyw();
    }

    @Override // defpackage.fizg
    public final void c(fixb fixbVar) {
        if (fixbVar.d() > 0) {
            this.a = new ArrayList();
        }
        while (fixbVar.d() > 0) {
            int b = fixbVar.b();
            int b2 = fixbVar.b();
            if (fixbVar.d() < b2) {
                throw new fjan("truncated option");
            }
            int limit = fixbVar.a.limit();
            fixbVar.g(b2);
            fixg fixnVar = b != 3 ? b != 8 ? b != 20732 ? new fixn(b) : new fiwt() : new fiws() : new fiyp();
            fixnVar.b(fixbVar);
            if (limit > fixbVar.a.capacity()) {
                throw new IllegalArgumentException("cannot set active region past end of input");
            }
            ByteBuffer byteBuffer = fixbVar.a;
            byteBuffer.limit(byteBuffer.position());
            this.a.add(fixnVar);
        }
    }

    @Override // defpackage.fizg
    public final void d(fixd fixdVar, fiwv fiwvVar, boolean z) {
        List<fixg> list = this.a;
        if (list == null) {
            return;
        }
        for (fixg fixgVar : list) {
            fixdVar.d(fixgVar.e);
            int i = fixdVar.a;
            fixdVar.d(0);
            fixgVar.c(fixdVar);
            fixdVar.e((fixdVar.a - i) - 2, i);
        }
    }

    @Override // defpackage.fizg
    public final boolean equals(Object obj) {
        return super.equals(obj) && this.i == ((fiyw) obj).i;
    }

    public final int f() {
        return (int) (this.i >>> 24);
    }
}
