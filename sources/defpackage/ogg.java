package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogg {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public final fgcm b;
    public final fgdj c;

    public ogg() {
        fgcm a = fgdm.a(null);
        this.b = a;
        this.c = new fgco(a);
    }

    public static final odk b(odk odkVar, ofy ofyVar) {
        ofx ofxVar = odkVar != null ? odkVar.a : ofw.b;
        ofx ofxVar2 = ofyVar.b;
        return new odk(d(ofxVar, ofxVar2, ofxVar2, null), d(odkVar != null ? odkVar.b : ofw.b, ofxVar2, ofyVar.c, null), d(odkVar != null ? odkVar.c : ofw.b, ofxVar2, ofyVar.d, null), ofyVar);
    }

    public final void a(ffji ffjiVar) {
        fgcm fgcmVar;
        Object c;
        odk odkVar;
        do {
            fgcmVar = this.b;
            c = fgcmVar.c();
            odk odkVar2 = (odk) c;
            odkVar = (odk) ffjiVar.invoke(odkVar2);
            if (ffkj.e(odkVar2, odkVar)) {
                return;
            }
        } while (!fgcmVar.g(c, odkVar));
        if (odkVar != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((ffji) it.next()).invoke(odkVar);
            }
        }
    }

    public final void c(ofy ofyVar) {
        a(new oge(ofyVar));
    }

    private static final ofx d(ofx ofxVar, ofx ofxVar2, ofx ofxVar3, ofx ofxVar4) {
        return ofxVar3;
    }
}
