package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtg {
    final /* synthetic */ crtk a;

    public crtg(crtk crtkVar) {
        this.a = crtkVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        crtk.f(streamTokenizer, reader, 58);
        crtk.f(streamTokenizer, reader, -3);
        crta crtaVar = (crta) fgugVar;
        crtb crtbVar = crtaVar.d;
        String str = streamTokenizer.sval;
        if (crtbVar.g != null) {
            fguu fguuVar = crtaVar.a;
            crtbVar.h = fguu.a(str);
        } else {
            fguu fguuVar2 = crtaVar.a;
            crtbVar.g = fguu.a(str);
        }
        crtk.f(streamTokenizer, reader, 10);
        this.a.d.a(streamTokenizer, reader, fgugVar);
        crtk.f(streamTokenizer, reader, 58);
        crtk.e(streamTokenizer, reader, str, false);
        crtk.f(streamTokenizer, reader, 10);
        crtb crtbVar2 = crtaVar.d;
        fgut fgutVar = crtbVar2.g;
        if (fgutVar == null) {
            throw new fgus("Expected component not initialised");
        }
        fgut fgutVar2 = crtbVar2.h;
        if (fgutVar2 == null) {
            fgum fgumVar = crtbVar2.f;
            fgumVar.getClass();
            fgumVar.b.add(fgutVar);
            crtb crtbVar3 = crtaVar.d;
            fgut fgutVar3 = crtbVar3.g;
            if (fgutVar3 instanceof fhaj) {
                crtbVar3.d.b(new fgza((fhaj) fgutVar3));
            }
            crtaVar.d.g = null;
            return;
        }
        if (fgutVar instanceof fhaj) {
            ((fhaj) fgutVar).c.add(fgutVar2);
        } else if (fgutVar instanceof fhaa) {
            ((fhaa) fgutVar).c.add(fgutVar2);
        } else if (fgutVar instanceof fhas) {
            ((fhas) fgutVar).c.add(fgutVar2);
        } else if (fgutVar instanceof fgzr) {
            ((fgzr) fgutVar).c.add(fgutVar2);
        }
        crtaVar.d.h = null;
    }
}
