package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrn {
    public static final djro a(djrm djrmVar) {
        djrmVar.getClass();
        djro djroVar = djrmVar instanceof djro ? (djro) djrmVar : null;
        if (djroVar != null) {
            return djroVar;
        }
        Objects.toString(djrmVar);
        throw new IllegalArgumentException("Not a SimId: ".concat(djrmVar.toString()));
    }
}
