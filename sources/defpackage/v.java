package defpackage;

import java.io.InvalidObjectException;
import java.text.Format;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class v extends Format.Field {
    public static final v a = new v();
    private static final long serialVersionUID = 7510380454602616157L;

    protected v() {
        super("message argument field");
    }

    @Override // java.text.AttributedCharacterIterator.Attribute
    protected Object readResolve() {
        if (getClass() != v.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        String name = getName();
        v vVar = a;
        if (name.equals(vVar.getName())) {
            return vVar;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}
