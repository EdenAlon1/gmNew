package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oeu {
    public static final boolean a(olp olpVar, olp olpVar2, ofz ofzVar) {
        ofzVar.getClass();
        if (olpVar2 == null) {
            return true;
        }
        if ((olpVar2 instanceof olo) && (olpVar instanceof oln)) {
            return true;
        }
        if ((olpVar instanceof olo) && (olpVar2 instanceof oln)) {
            return false;
        }
        return (olpVar.e == olpVar2.e && olpVar.f == olpVar2.f && olpVar2.a(ofzVar) <= olpVar.a(ofzVar)) ? false : true;
    }
}
