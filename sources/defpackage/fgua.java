package defpackage;

import java.io.Reader;
import java.io.StreamTokenizer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgua {
    final /* synthetic */ fguf a;

    public fgua(fguf fgufVar) {
        this.a = fgufVar;
    }

    public final void a(StreamTokenizer streamTokenizer, Reader reader, fgug fgugVar) {
        this.a.b(streamTokenizer, reader, 58);
        this.a.b(streamTokenizer, reader, -3);
        fgtv fgtvVar = (fgtv) fgugVar;
        fgtw fgtwVar = fgtvVar.d;
        String str = streamTokenizer.sval;
        if (fgtwVar.c != null) {
            fguu fguuVar = fgtvVar.a;
            fgtwVar.d = fguu.a(str);
        } else {
            fguu fguuVar2 = fgtvVar.a;
            fgtwVar.c = fguu.a(str);
        }
        this.a.b(streamTokenizer, reader, 10);
        this.a.d.a(streamTokenizer, reader, fgugVar);
        this.a.b(streamTokenizer, reader, 58);
        this.a.c(streamTokenizer, reader, str, false);
        this.a.b(streamTokenizer, reader, 10);
        fgtw fgtwVar2 = fgtvVar.d;
        fgut fgutVar = fgtwVar2.c;
        if (fgutVar == null) {
            throw new fgus("Expected component not initialised");
        }
        fgut fgutVar2 = fgtwVar2.d;
        if (fgutVar2 == null) {
            fgtwVar2.b.b.add(fgutVar);
            fgtw fgtwVar3 = fgtvVar.d;
            fgut fgutVar3 = fgtwVar3.c;
            if (fgutVar3 instanceof fhaj) {
                fgtwVar3.a.b(new fgza((fhaj) fgutVar3));
            }
            fgtvVar.d.c = null;
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
        fgtvVar.d.d = null;
    }
}
