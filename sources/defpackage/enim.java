package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enim extends encq implements Serializable {
    public static final enim a;
    public static final enim b;
    private final transient engw c;

    static {
        int i = engw.d;
        a = new enim(enou.a);
        b = new enim(engw.r(enop.a));
    }

    public enim(engw engwVar) {
        this.c = engwVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.enos
    public final /* bridge */ /* synthetic */ Set a() {
        if (this.c.isEmpty()) {
            return enpd.a;
        }
        engw engwVar = this.c;
        enop enopVar = enop.a;
        return new enpe(engwVar, enoo.a);
    }

    Object writeReplace() {
        return new enil(this.c);
    }
}
