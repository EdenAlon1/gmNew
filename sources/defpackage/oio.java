package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class oio {
    public ofx b;
    public ofx c;
    public ofx d;

    public oio() {
        ofw ofwVar = ofw.b;
        this.b = ofwVar;
        this.c = ofwVar;
        this.d = ofwVar;
    }

    public abstract void a(ofz ofzVar, ofx ofxVar);

    public final void b(ofz ofzVar, ofx ofxVar) {
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (ffkj.e(this.d, ofxVar)) {
                        return;
                    } else {
                        this.d = ofxVar;
                    }
                }
            } else if (ffkj.e(this.c, ofxVar)) {
                return;
            } else {
                this.c = ofxVar;
            }
        } else if (ffkj.e(this.b, ofxVar)) {
            return;
        } else {
            this.b = ofxVar;
        }
        a(ofzVar, ofxVar);
    }
}
