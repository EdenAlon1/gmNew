package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odk {
    public final ofx a;
    public final ofx b;
    public final ofx c;
    public final ofy d;
    public final boolean e;

    public odk(ofx ofxVar, ofx ofxVar2, ofx ofxVar3, ofy ofyVar) {
        this.a = ofxVar;
        this.b = ofxVar2;
        this.c = ofxVar3;
        this.d = ofyVar;
        this.e = ofyVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        odk odkVar = (odk) obj;
        return ffkj.e(this.a, odkVar.a) && ffkj.e(this.b, odkVar.b) && ffkj.e(this.c, odkVar.c) && ffkj.e(this.d, odkVar.d) && ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=null)";
    }
}
