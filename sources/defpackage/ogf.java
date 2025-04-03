package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ogf extends ffkk implements ffji {
    final /* synthetic */ ofz a;
    final /* synthetic */ ofx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogf(ofz ofzVar, ofx ofxVar) {
        super(1);
        this.a = ofzVar;
        this.b = ofxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ofy a;
        odk odkVar = (odk) obj;
        ofy ofyVar = odkVar != null ? odkVar.d : ofy.a;
        ofz ofzVar = this.a;
        ofx ofxVar = this.b;
        int ordinal = ofzVar.ordinal();
        if (ordinal == 0) {
            a = ofy.a(ofyVar, ofxVar, null, null, 6);
        } else if (ordinal == 1) {
            a = ofy.a(ofyVar, null, ofxVar, null, 5);
        } else {
            if (ordinal != 2) {
                throw new ffcd();
            }
            a = ofy.a(ofyVar, null, null, ofxVar, 3);
        }
        return ogg.b(odkVar, a);
    }
}
