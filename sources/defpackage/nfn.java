package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfn extends nfj {
    @Override // defpackage.nfj
    protected final lrb b(nfi nfiVar, ByteBuffer byteBuffer) {
        luv luvVar = new luv(byteBuffer.array(), byteBuffer.limit());
        String w = luvVar.w();
        lti.f(w);
        String w2 = luvVar.w();
        lti.f(w2);
        return new lrb(new nfm(w, w2, luvVar.q(), luvVar.q(), Arrays.copyOfRange(luvVar.a, luvVar.b, luvVar.c)));
    }
}
