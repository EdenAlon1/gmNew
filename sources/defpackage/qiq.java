package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiq implements qil {
    public final boolean a;
    public final int b;

    public qiq(int i, boolean z) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        if (qdbVar.h) {
            return new qed(this);
        }
        qlp.a("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        int i = this.b;
        return a.a(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE", "MergePaths{mode=", "}");
    }
}
