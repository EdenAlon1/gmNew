package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ofy {
    public static final ofy a;
    public final ofx b;
    public final ofx c;
    public final ofx d;
    public final boolean e;

    static {
        ofw ofwVar = ofw.b;
        a = new ofy(ofwVar, ofwVar, ofwVar);
    }

    public ofy(ofx ofxVar, ofx ofxVar2, ofx ofxVar3) {
        ofxVar.getClass();
        ofxVar2.getClass();
        ofxVar3.getClass();
        this.b = ofxVar;
        this.c = ofxVar2;
        this.d = ofxVar3;
        boolean z = true;
        if (!(ofxVar instanceof ofu) && !(ofxVar3 instanceof ofu) && !(ofxVar2 instanceof ofu)) {
            z = false;
        }
        this.e = z;
    }

    public static /* synthetic */ ofy a(ofy ofyVar, ofx ofxVar, ofx ofxVar2, ofx ofxVar3, int i) {
        if ((i & 1) != 0) {
            ofxVar = ofyVar.b;
        }
        if ((i & 2) != 0) {
            ofxVar2 = ofyVar.c;
        }
        if ((i & 4) != 0) {
            ofxVar3 = ofyVar.d;
        }
        ofxVar.getClass();
        ofxVar2.getClass();
        ofxVar3.getClass();
        return new ofy(ofxVar, ofxVar2, ofxVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofy)) {
            return false;
        }
        ofy ofyVar = (ofy) obj;
        return ffkj.e(this.b, ofyVar.b) && ffkj.e(this.c, ofyVar.c) && ffkj.e(this.d, ofyVar.d);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.b + ", prepend=" + this.c + ", append=" + this.d + ')';
    }
}
