package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogh {
    private ofx a;
    private ofx b;
    private ofx c;

    public ogh() {
        ofw ofwVar = ofw.b;
        this.a = ofwVar;
        this.b = ofwVar;
        this.c = ofwVar;
    }

    public final ofx a(ofz ofzVar) {
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            return this.a;
        }
        if (ordinal == 1) {
            return this.b;
        }
        if (ordinal == 2) {
            return this.c;
        }
        throw new ffcd();
    }

    public final ofy b() {
        return new ofy(this.a, this.b, this.c);
    }

    public final void c(ofy ofyVar) {
        this.a = ofyVar.b;
        this.c = ofyVar.d;
        this.b = ofyVar.c;
    }

    public final void d(ofz ofzVar, ofx ofxVar) {
        ofzVar.getClass();
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            this.a = ofxVar;
        } else if (ordinal == 1) {
            this.b = ofxVar;
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            this.c = ofxVar;
        }
    }
}
