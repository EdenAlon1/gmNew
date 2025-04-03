package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enij implements Serializable, enor {
    public static final enij a;
    private static final long serialVersionUID = 0;
    public final transient engw b;
    public final transient engw c;

    static {
        int i = engw.d;
        engw engwVar = enou.a;
        a = new enij(engwVar, engwVar);
    }

    public enij(engw engwVar, engw engwVar2) {
        this.b = engwVar;
        this.c = engwVar2;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.enor
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final enhk b() {
        if (this.b.isEmpty()) {
            return enoz.a;
        }
        engw engwVar = this.b;
        enop enopVar = enop.a;
        return new eniz(new enpe(engwVar, enoo.a), this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enor) {
            return b().equals(((enor) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return ennc.g(b());
    }

    Object writeReplace() {
        return new enii(b());
    }
}
