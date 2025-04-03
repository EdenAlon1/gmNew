package defpackage;

import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edqn implements Parcelable {
    public static edqm e(edor edorVar, edpc edpcVar) {
        edme edmeVar = new edme();
        if (edorVar == null) {
            throw new NullPointerException("Null day");
        }
        edmeVar.b = edorVar;
        edmeVar.c = edpcVar;
        edmeVar.b(false);
        return edmeVar;
    }

    public abstract edor a();

    public abstract edpb b();

    public abstract edpc c();

    public abstract boolean d();
}
